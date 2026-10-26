package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class a9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r9 f1622b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Runnable f1623c;

    a9(v8 v8Var, r9 r9Var, Runnable runnable) {
        this.f1622b = r9Var;
        this.f1623c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1622b.e0();
        this.f1622b.z(this.f1623c);
        this.f1622b.d0();
    }
}
