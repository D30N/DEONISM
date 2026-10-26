package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class q5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p f1849b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ fa f1850c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1851d;

    q5(j5 j5Var, p pVar, fa faVar) {
        this.f1851d = j5Var;
        this.f1849b = pVar;
        this.f1850c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVarW = this.f1851d.W(this.f1849b, this.f1850c);
        this.f1851d.a.e0();
        this.f1851d.a.p(pVarW, this.f1850c);
    }
}
