package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class d9 {
    private g9 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c9 f1672b;

    d9(c9 c9Var) {
        this.f1672b = c9Var;
    }

    final void a() {
        this.f1672b.c();
        if (this.f1672b.n().t(r.p0) && this.a != null) {
            this.f1672b.f1656c.removeCallbacks(this.a);
        }
        if (this.f1672b.n().t(r.D0)) {
            this.f1672b.l().w.a(false);
        }
    }

    final void b(long j) {
        if (this.f1672b.n().t(r.p0)) {
            this.a = new g9(this, this.f1672b.k().a(), j);
            this.f1672b.f1656c.postDelayed(this.a, 2000L);
        }
    }
}
