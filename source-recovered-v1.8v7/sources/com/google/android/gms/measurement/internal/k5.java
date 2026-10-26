package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class k5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ oa f1757b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j5 f1758c;

    k5(j5 j5Var, oa oaVar) {
        this.f1758c = j5Var;
        this.f1757b = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1758c.a.e0();
        if (this.f1757b.f1831d.h() == null) {
            this.f1758c.a.O(this.f1757b);
        } else {
            this.f1758c.a.x(this.f1757b);
        }
    }
}
