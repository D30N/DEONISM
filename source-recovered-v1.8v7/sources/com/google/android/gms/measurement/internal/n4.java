package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class n4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1802b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ k4 f1803c;

    n4(k4 k4Var, boolean z) {
        this.f1803c = k4Var;
        this.f1802b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1803c.a.B(this.f1802b);
    }
}
