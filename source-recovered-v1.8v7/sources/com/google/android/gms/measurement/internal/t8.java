package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class t8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p8 f1912b;

    t8(p8 p8Var) {
        this.f1912b = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f1912b.f1844c;
        Context contextF = this.f1912b.f1844c.f();
        this.f1912b.f1844c.h();
        y7Var.F(new ComponentName(contextF, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
