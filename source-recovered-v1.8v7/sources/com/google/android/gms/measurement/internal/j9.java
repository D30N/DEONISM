package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class j9 {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f1749b;

    /* renamed from: c, reason: collision with root package name */
    private final h f1750c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ c9 f1751d;

    public j9(c9 c9Var) {
        this.f1751d = c9Var;
        this.f1750c = new i9(this, this.f1751d.a);
        long jB = c9Var.k().b();
        this.a = jB;
        this.f1749b = jB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f1751d.c();
        d(false, false, this.f1751d.k().b());
        this.f1751d.p().w(this.f1751d.k().b());
    }

    final void a() {
        this.f1750c.e();
        this.a = 0L;
        this.f1749b = 0L;
    }

    final void b(long j) {
        this.f1751d.c();
        this.f1750c.e();
        this.a = j;
        this.f1749b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.f1751d.c();
        this.f1751d.y();
        if (!d.b.a.a.e.e.z9.b() || !this.f1751d.n().t(r.A0)) {
            j = this.f1751d.k().b();
        }
        if (!d.b.a.a.e.e.ha.b() || !this.f1751d.n().t(r.w0) || this.f1751d.a.p()) {
            this.f1751d.l().u.b(this.f1751d.k().a());
        }
        long jG = j - this.a;
        if (!z && jG < 1000) {
            this.f1751d.m().O().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jG));
            return false;
        }
        if (this.f1751d.n().t(r.U) && !z2) {
            jG = (d.b.a.a.e.e.ma.b() && this.f1751d.n().t(r.W) && d.b.a.a.e.e.z9.b() && this.f1751d.n().t(r.A0)) ? g(j) : e();
        }
        this.f1751d.m().O().b("Recording user engagement, ms", Long.valueOf(jG));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jG);
        p7.P(this.f1751d.t().E(!this.f1751d.n().L().booleanValue()), bundle, true);
        if (this.f1751d.n().t(r.U) && !this.f1751d.n().t(r.V) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f1751d.n().t(r.V) || !z2) {
            this.f1751d.q().R("auto", "_e", bundle);
        }
        this.a = j;
        this.f1750c.e();
        this.f1750c.c(3600000L);
        return true;
    }

    final long e() {
        long jB = this.f1751d.k().b();
        long j = jB - this.f1749b;
        this.f1749b = jB;
        return j;
    }

    final void f(long j) {
        this.f1750c.e();
    }

    final long g(long j) {
        long j2 = j - this.f1749b;
        this.f1749b = j;
        return j2;
    }
}
