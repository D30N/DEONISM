package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class g6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ed f1707b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f1708c;

    g6(AppMeasurementDynamiteService appMeasurementDynamiteService, ed edVar) {
        this.f1708c = appMeasurementDynamiteService;
        this.f1707b = edVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1708c.a.P().H(this.f1707b);
    }
}
