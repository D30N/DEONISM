package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class v6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f1927b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1928c;

    v6(j6 j6Var, Bundle bundle) {
        this.f1928c = j6Var;
        this.f1927b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1928c.w0(this.f1927b);
    }
}
