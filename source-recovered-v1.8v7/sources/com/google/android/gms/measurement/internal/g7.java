package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class g7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ed f1709b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1710c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1711d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ AppMeasurementDynamiteService f;

    g7(AppMeasurementDynamiteService appMeasurementDynamiteService, ed edVar, String str, String str2, boolean z) {
        this.f = appMeasurementDynamiteService;
        this.f1709b = edVar;
        this.f1710c = str;
        this.f1711d = str2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a.P().K(this.f1709b, this.f1710c, this.f1711d, this.e);
    }
}
