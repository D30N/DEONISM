package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class a7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1617b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1618c;

    a7(j6 j6Var, boolean z) {
        this.f1618c = j6Var;
        this.f1617b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1618c.v0(this.f1617b);
    }
}
