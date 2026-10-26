package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class r8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ComponentName f1879b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p8 f1880c;

    r8(p8 p8Var, ComponentName componentName) {
        this.f1880c = p8Var;
        this.f1879b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1880c.f1844c.F(this.f1879b);
    }
}
