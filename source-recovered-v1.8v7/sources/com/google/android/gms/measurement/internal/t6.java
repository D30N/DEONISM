package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class t6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i6 f1908b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1909c;

    t6(j6 j6Var, i6 i6Var) {
        this.f1909c = j6Var;
        this.f1908b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1909c.J(this.f1908b);
    }
}
