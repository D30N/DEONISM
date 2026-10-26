package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class g5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ k6 f1705b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ d5 f1706c;

    g5(d5 d5Var, k6 k6Var) {
        this.f1706c = d5Var;
        this.f1705b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1706c.i(this.f1705b);
        this.f1706c.b();
    }
}
