package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1677b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a f1678c;

    e3(a aVar, long j) {
        this.f1678c = aVar;
        this.f1677b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1678c.C(this.f1677b);
    }
}
