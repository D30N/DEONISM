package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class u8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r3 f1919b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p8 f1920c;

    u8(p8 p8Var, r3 r3Var) {
        this.f1920c = p8Var;
        this.f1919b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1920c) {
            p8.c(this.f1920c, false);
            if (!this.f1920c.f1844c.W()) {
                this.f1920c.f1844c.m().N().a("Connected to remote service");
                this.f1920c.f1844c.M(this.f1919b);
            }
        }
    }
}
