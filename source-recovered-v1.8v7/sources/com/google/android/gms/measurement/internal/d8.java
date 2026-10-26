package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class d8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ fa f1669b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ed f1670c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ y7 f1671d;

    d8(y7 y7Var, fa faVar, ed edVar) {
        this.f1671d = y7Var;
        this.f1669b = faVar;
        this.f1670c = edVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strO = null;
        try {
            try {
                r3 r3Var = this.f1671d.f1960d;
                if (r3Var == null) {
                    this.f1671d.m().G().a("Failed to get app instance id");
                } else {
                    strO = r3Var.o(this.f1669b);
                    if (strO != null) {
                        this.f1671d.q().N(strO);
                        this.f1671d.l().l.b(strO);
                    }
                    this.f1671d.f0();
                }
            } catch (RemoteException e) {
                this.f1671d.m().G().b("Failed to get app instance id", e);
            }
        } finally {
            this.f1671d.g().R(this.f1670c, null);
        }
    }
}
