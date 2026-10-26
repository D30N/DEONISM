package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1687b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ c9 f1688c;

    e9(c9 c9Var, long j) {
        this.f1688c = c9Var;
        this.f1687b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1688c.K(this.f1687b);
    }
}
