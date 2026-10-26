package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class n6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1807b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1808c;

    n6(j6 j6Var, long j) {
        this.f1808c = j6Var;
        this.f1807b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1808c.l().q.b(this.f1807b);
        this.f1808c.m().N().b("Session timeout duration set", Long.valueOf(this.f1807b));
    }
}
