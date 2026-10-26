package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class da implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ed f1673b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1674c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1675d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    da(AppMeasurementDynamiteService appMeasurementDynamiteService, ed edVar, String str, String str2) {
        this.e = appMeasurementDynamiteService;
        this.f1673b = edVar;
        this.f1674c = str;
        this.f1675d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.P().J(this.f1673b, this.f1674c, this.f1675d);
    }
}
