package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class r5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1872b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j5 f1873c;

    r5(j5 j5Var, fa faVar) {
        this.f1873c = j5Var;
        this.f1872b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1873c.a.e0();
        this.f1873c.a.w(this.f1872b);
    }
}
