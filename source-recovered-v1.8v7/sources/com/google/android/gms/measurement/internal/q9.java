package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class q9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w9 f1861b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ r9 f1862c;

    q9(r9 r9Var, w9 w9Var) {
        this.f1862c = r9Var;
        this.f1861b = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1862c.u(this.f1861b);
        this.f1862c.e();
    }
}
