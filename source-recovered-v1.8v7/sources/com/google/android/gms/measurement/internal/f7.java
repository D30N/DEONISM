package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class f7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1697b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1698c;

    f7(j6 j6Var, long j) {
        this.f1698c = j6Var;
        this.f1697b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1698c.l().p.b(this.f1697b);
        this.f1698c.m().N().b("Minimum session duration set", Long.valueOf(this.f1697b));
    }
}
