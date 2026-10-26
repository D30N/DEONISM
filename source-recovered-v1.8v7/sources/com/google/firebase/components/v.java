package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class v extends com.google.firebase.components.a {
    private final Set<Class<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f2198b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f2199c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Class<?>> f2200d;
    private final Set<Class<?>> e;
    private final e f;

    private static class a implements d.b.b.f.c {
        public a(Set<Class<?>> set, d.b.b.f.c cVar) {
        }
    }

    v(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : dVar.c()) {
            if (nVar.b()) {
                boolean zD = nVar.d();
                Class<?> clsA = nVar.a();
                if (zD) {
                    hashSet3.add(clsA);
                } else {
                    hashSet.add(clsA);
                }
            } else {
                boolean zD2 = nVar.d();
                Class<?> clsA2 = nVar.a();
                if (zD2) {
                    hashSet4.add(clsA2);
                } else {
                    hashSet2.add(clsA2);
                }
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(d.b.b.f.c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f2198b = Collections.unmodifiableSet(hashSet2);
        this.f2199c = Collections.unmodifiableSet(hashSet3);
        this.f2200d = Collections.unmodifiableSet(hashSet4);
        this.e = dVar.f();
        this.f = eVar;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        if (!this.a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f.a(cls);
        return !cls.equals(d.b.b.f.c.class) ? t : (T) new a(this.e, (d.b.b.f.c) t);
    }

    @Override // com.google.firebase.components.e
    public <T> d.b.b.h.a<T> b(Class<T> cls) {
        if (this.f2198b.contains(cls)) {
            return this.f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> Set<T> c(Class<T> cls) {
        if (this.f2199c.contains(cls)) {
            return this.f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> d.b.b.h.a<Set<T>> d(Class<T> cls) {
        if (this.f2200d.contains(cls)) {
            return this.f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
