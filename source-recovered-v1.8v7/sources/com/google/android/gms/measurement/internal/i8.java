package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class i8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p f1734b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1735c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ed f1736d;
    private final /* synthetic */ y7 e;

    i8(y7 y7Var, p pVar, String str, ed edVar) {
        this.e = y7Var;
        this.f1734b = pVar;
        this.f1735c = str;
        this.f1736d = edVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrT = null;
        try {
            try {
                r3 r3Var = this.e.f1960d;
                if (r3Var == null) {
                    this.e.m().G().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrT = r3Var.t(this.f1734b, this.f1735c);
                    this.e.f0();
                }
            } catch (RemoteException e) {
                this.e.m().G().b("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.e.g().U(this.f1736d, bArrT);
        }
    }
}
