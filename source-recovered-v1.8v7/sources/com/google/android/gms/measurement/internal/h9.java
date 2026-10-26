package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class h9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ed f1723b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f1724c;

    h9(AppMeasurementDynamiteService appMeasurementDynamiteService, ed edVar) {
        this.f1724c = appMeasurementDynamiteService;
        this.f1723b = edVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1724c.a.G().T(this.f1723b, this.f1724c.a.o());
    }
}
