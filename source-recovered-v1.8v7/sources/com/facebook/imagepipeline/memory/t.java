package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class t<T> implements c0<T> {
    private final Set<T> a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final h<T> f1291b = new h<>();

    private T d(@Nullable T t) {
        if (t != null) {
            synchronized (this) {
                this.a.remove(t);
            }
        }
        return t;
    }

    @Override // com.facebook.imagepipeline.memory.c0
    public void b(T t) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.a.add(t);
        }
        if (zAdd) {
            this.f1291b.e(a(t), t);
        }
    }

    @Override // com.facebook.imagepipeline.memory.c0
    @Nullable
    public T c() {
        T tF = this.f1291b.f();
        d(tF);
        return tF;
    }

    @Override // com.facebook.imagepipeline.memory.c0
    @Nullable
    public T get(int i) {
        T tA = this.f1291b.a(i);
        d(tA);
        return tA;
    }
}
