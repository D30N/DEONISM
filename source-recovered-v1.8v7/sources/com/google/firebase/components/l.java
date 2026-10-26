package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class l extends a {
    private static final d.b.b.h.a<Set<Object>> e = k.a();
    private final Map<d<?>, s<?>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, s<?>> f2184b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, s<Set<?>>> f2185c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final r f2186d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.f2186d = new r(executor);
        ArrayList<d<?>> arrayList = new ArrayList();
        arrayList.add(d.n(this.f2186d, r.class, d.b.b.f.d.class, d.b.b.f.c.class));
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d<?> dVar2 : arrayList) {
            this.a.put(dVar2, new s<>(i.a(this, dVar2)));
        }
        h();
        i();
    }

    static /* synthetic */ Set g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void h() {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            if (key.k()) {
                s<?> value = entry.getValue();
                Iterator<Class<? super Object>> it = key.e().iterator();
                while (it.hasNext()) {
                    this.f2184b.put(it.next(), value);
                }
            }
        }
        j();
    }

    private void i() {
        HashMap map = new HashMap();
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.k()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            this.f2185c.put((Class) entry2.getKey(), new s<>(j.a((Set) entry2.getValue())));
        }
    }

    private void j() {
        for (d<?> dVar : this.a.keySet()) {
            for (n nVar : dVar.c()) {
                if (nVar.c() && !this.f2184b.containsKey(nVar.a())) {
                    throw new t(String.format("Unsatisfied dependency for component %s: %s", dVar, nVar.a()));
                }
            }
        }
    }

    @Override // com.google.firebase.components.e
    public <T> d.b.b.h.a<T> b(Class<T> cls) {
        u.c(cls, "Null interface requested.");
        return this.f2184b.get(cls);
    }

    @Override // com.google.firebase.components.e
    public <T> d.b.b.h.a<Set<T>> d(Class<T> cls) {
        s<Set<?>> sVar = this.f2185c.get(cls);
        return sVar != null ? sVar : (d.b.b.h.a<Set<T>>) e;
    }

    public void e(boolean z) {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.f2186d.c();
    }
}
