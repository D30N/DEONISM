package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class b9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1641b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ c9 f1642c;

    b9(c9 c9Var, long j) {
        this.f1642c = c9Var;
        this.f1641b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1642c.I(this.f1641b);
    }
}
