package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class r implements d.b.b.f.d, d.b.b.f.c {
    private final Map<Class<?>, ConcurrentHashMap<d.b.b.f.b<Object>, Executor>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<d.b.b.f.a<?>> f2194b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f2195c;

    r(Executor executor) {
        this.f2195c = executor;
    }

    private synchronized Set<Map.Entry<d.b.b.f.b<Object>, Executor>> d(d.b.b.f.a<?> aVar) {
        ConcurrentHashMap<d.b.b.f.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // d.b.b.f.d
    public <T> void a(Class<T> cls, d.b.b.f.b<? super T> bVar) {
        b(cls, this.f2195c, bVar);
    }

    @Override // d.b.b.f.d
    public synchronized <T> void b(Class<T> cls, Executor executor, d.b.b.f.b<? super T> bVar) {
        u.b(cls);
        u.b(bVar);
        u.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(bVar, executor);
    }

    void c() {
        Queue<d.b.b.f.a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f2194b != null) {
                Queue<d.b.b.f.a<?>> queue2 = this.f2194b;
                this.f2194b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            Iterator<d.b.b.f.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    public void f(d.b.b.f.a<?> aVar) {
        u.b(aVar);
        synchronized (this) {
            if (this.f2194b != null) {
                this.f2194b.add(aVar);
                return;
            }
            for (Map.Entry<d.b.b.f.b<Object>, Executor> entry : d(aVar)) {
                entry.getValue().execute(q.a(entry, aVar));
            }
        }
    }
}
