package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f1753b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ h f1754c;

    k(h hVar, a6 a6Var) {
        this.f1754c = hVar;
        this.f1753b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1753b.h();
        if (pa.a()) {
            this.f1753b.j().z(this);
            return;
        }
        boolean zD = this.f1754c.d();
        h.a(this.f1754c, 0L);
        if (zD) {
            this.f1754c.b();
        }
    }
}
