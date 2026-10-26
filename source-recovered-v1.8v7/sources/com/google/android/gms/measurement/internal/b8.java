package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class b8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1639b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y7 f1640c;

    b8(y7 y7Var, fa faVar) {
        this.f1640c = y7Var;
        this.f1639b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.f1640c.f1960d;
        if (r3Var == null) {
            this.f1640c.m().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            r3Var.J(this.f1639b);
        } catch (RemoteException e) {
            this.f1640c.m().G().b("Failed to reset data on the service: remote exception", e);
        }
        this.f1640c.f0();
    }
}
