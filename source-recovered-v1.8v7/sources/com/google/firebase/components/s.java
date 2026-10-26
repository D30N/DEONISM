package com.google.firebase.components;

/* loaded from: classes.dex */
public class s<T> implements d.b.b.h.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2196c = new Object();
    private volatile Object a = f2196c;

    /* renamed from: b, reason: collision with root package name */
    private volatile d.b.b.h.a<T> f2197b;

    public s(d.b.b.h.a<T> aVar) {
        this.f2197b = aVar;
    }

    @Override // d.b.b.h.a
    public T get() {
        T t = (T) this.a;
        if (t == f2196c) {
            synchronized (this) {
                t = (T) this.a;
                if (t == f2196c) {
                    t = this.f2197b.get();
                    this.a = t;
                    this.f2197b = null;
                }
            }
        }
        return t;
    }
}
