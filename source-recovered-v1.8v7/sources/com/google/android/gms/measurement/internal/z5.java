package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ oa f1969b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ fa f1970c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1971d;

    z5(j5 j5Var, oa oaVar, fa faVar) {
        this.f1971d = j5Var;
        this.f1969b = oaVar;
        this.f1970c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1971d.a.e0();
        if (this.f1969b.f1831d.h() == null) {
            this.f1971d.a.P(this.f1969b, this.f1970c);
        } else {
            this.f1971d.a.y(this.f1969b, this.f1970c);
        }
    }
}
