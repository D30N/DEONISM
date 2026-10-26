package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class c8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1654b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y7 f1655c;

    c8(y7 y7Var, fa faVar) {
        this.f1655c = y7Var;
        this.f1654b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.f1655c.f1960d;
        if (r3Var == null) {
            this.f1655c.m().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            r3Var.m(this.f1654b);
            this.f1655c.u().K();
            this.f1655c.N(r3Var, null, this.f1654b);
            this.f1655c.f0();
        } catch (RemoteException e) {
            this.f1655c.m().G().b("Failed to send app launch to the service", e);
        }
    }
}
