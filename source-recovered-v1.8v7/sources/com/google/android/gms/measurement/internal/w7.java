package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q7 f1938b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f1939c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ p7 f1940d;

    w7(p7 p7Var, q7 q7Var, long j) {
        this.f1940d = p7Var;
        this.f1938b = q7Var;
        this.f1939c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1940d.R(this.f1938b, false, this.f1939c);
        p7 p7Var = this.f1940d;
        p7Var.e = null;
        p7Var.s().O(null);
    }
}
