package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class s6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f1895b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1896c;

    s6(j6 j6Var, Bundle bundle) {
        this.f1896c = j6Var;
        this.f1895b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1896c.t0(this.f1895b);
    }
}
