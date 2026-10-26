package com.facebook.drawee.b.a.i.i;

import com.facebook.drawee.b.a.i.h;

/* loaded from: classes.dex */
public class c extends d.a.e.k.a {
    private final com.facebook.common.time.b a;

    /* renamed from: b, reason: collision with root package name */
    private final h f1153b;

    public c(com.facebook.common.time.b bVar, h hVar) {
        this.a = bVar;
        this.f1153b = hVar;
    }

    @Override // d.a.e.k.a, d.a.e.k.e
    public void a(d.a.e.l.a aVar, String str, Throwable th, boolean z) {
        this.f1153b.q(this.a.now());
        this.f1153b.p(aVar);
        this.f1153b.w(str);
        this.f1153b.v(z);
    }

    @Override // d.a.e.k.a, d.a.e.k.e
    public void b(d.a.e.l.a aVar, Object obj, String str, boolean z) {
        this.f1153b.r(this.a.now());
        this.f1153b.p(aVar);
        this.f1153b.d(obj);
        this.f1153b.w(str);
        this.f1153b.v(z);
    }

    @Override // d.a.e.k.a, d.a.e.k.e
    public void f(d.a.e.l.a aVar, String str, boolean z) {
        this.f1153b.q(this.a.now());
        this.f1153b.p(aVar);
        this.f1153b.w(str);
        this.f1153b.v(z);
    }

    @Override // d.a.e.k.a, d.a.e.k.e
    public void i(String str) {
        this.f1153b.q(this.a.now());
        this.f1153b.w(str);
    }
}
