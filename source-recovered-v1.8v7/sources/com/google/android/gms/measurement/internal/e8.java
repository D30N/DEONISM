package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class e8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f1684b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ fa f1685c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ y7 f1686d;

    e8(y7 y7Var, Bundle bundle, fa faVar) {
        this.f1686d = y7Var;
        this.f1684b = bundle;
        this.f1685c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.f1686d.f1960d;
        if (r3Var == null) {
            this.f1686d.m().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            r3Var.q(this.f1684b, this.f1685c);
        } catch (RemoteException e) {
            this.f1686d.m().G().b("Failed to send default event parameters to service", e);
        }
    }
}
