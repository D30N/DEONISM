package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1974b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y9 f1975c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ fa f1976d;
    private final /* synthetic */ y7 e;

    z7(y7 y7Var, boolean z, y9 y9Var, fa faVar) {
        this.e = y7Var;
        this.f1974b = z;
        this.f1975c = y9Var;
        this.f1976d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.e.f1960d;
        if (r3Var == null) {
            this.e.m().G().a("Discarding data. Failed to set user property");
        } else {
            this.e.N(r3Var, this.f1974b ? null : this.f1975c, this.f1976d);
            this.e.f0();
        }
    }
}
