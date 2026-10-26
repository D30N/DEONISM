package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class s8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r3 f1900b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p8 f1901c;

    s8(p8 p8Var, r3 r3Var) {
        this.f1901c = p8Var;
        this.f1900b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1901c) {
            p8.c(this.f1901c, false);
            if (!this.f1901c.f1844c.W()) {
                this.f1901c.f1844c.m().O().a("Connected to service");
                this.f1901c.f1844c.M(this.f1900b);
            }
        }
    }
}
