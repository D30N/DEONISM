package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class t7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1910b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p7 f1911c;

    t7(p7 p7Var, long j) {
        this.f1911c = p7Var;
        this.f1910b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1911c.p().w(this.f1910b);
        this.f1911c.e = null;
    }
}
