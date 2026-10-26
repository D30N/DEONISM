package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class x5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1947b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j5 f1948c;

    x5(j5 j5Var, fa faVar) {
        this.f1948c = j5Var;
        this.f1947b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1948c.a.e0();
        this.f1948c.a.N(this.f1947b);
    }
}
