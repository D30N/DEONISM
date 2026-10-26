package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1644b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f1645c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a f1646d;

    c1(a aVar, String str, long j) {
        this.f1646d = aVar;
        this.f1644b = str;
        this.f1645c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1646d.F(this.f1644b, this.f1645c);
    }
}
