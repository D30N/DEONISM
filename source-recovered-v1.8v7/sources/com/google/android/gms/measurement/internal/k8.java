package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class k8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1763b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y7 f1764c;

    k8(y7 y7Var, fa faVar) {
        this.f1764c = y7Var;
        this.f1763b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.f1764c.f1960d;
        if (r3Var == null) {
            this.f1764c.m().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            r3Var.F(this.f1763b);
            this.f1764c.f0();
        } catch (RemoteException e) {
            this.f1764c.m().G().b("Failed to send measurementEnabled to the service", e);
        }
    }
}
