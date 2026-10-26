package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class g8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ed f1712b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p f1713c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1714d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    g8(AppMeasurementDynamiteService appMeasurementDynamiteService, ed edVar, p pVar, String str) {
        this.e = appMeasurementDynamiteService;
        this.f1712b = edVar;
        this.f1713c = pVar;
        this.f1714d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.P().I(this.f1712b, this.f1713c, this.f1714d);
    }
}
