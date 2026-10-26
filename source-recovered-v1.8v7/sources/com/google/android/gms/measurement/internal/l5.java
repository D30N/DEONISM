package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class l5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1772b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j5 f1773c;

    l5(j5 j5Var, fa faVar) {
        this.f1773c = j5Var;
        this.f1772b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1773c.a.e0();
        r9 r9Var = this.f1773c.a;
        fa faVar = this.f1772b;
        r9Var.j().c();
        r9Var.c0();
        com.google.android.gms.common.internal.q.g(faVar.f1702b);
        r9Var.Q(faVar);
    }
}
