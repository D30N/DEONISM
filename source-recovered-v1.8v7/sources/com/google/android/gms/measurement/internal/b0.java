package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1627b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f1628c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a f1629d;

    b0(a aVar, String str, long j) {
        this.f1629d = aVar;
        this.f1627b = str;
        this.f1628c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1629d.G(this.f1627b, this.f1628c);
    }
}
