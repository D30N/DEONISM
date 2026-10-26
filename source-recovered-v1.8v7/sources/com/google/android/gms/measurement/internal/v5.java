package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ y9 f1924b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ fa f1925c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1926d;

    v5(j5 j5Var, y9 y9Var, fa faVar) {
        this.f1926d = j5Var;
        this.f1924b = y9Var;
        this.f1925c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1926d.a.e0();
        if (this.f1924b.h() == null) {
            this.f1926d.a.M(this.f1924b, this.f1925c);
        } else {
            this.f1926d.a.v(this.f1924b, this.f1925c);
        }
    }
}
