package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import d.b.a.a.e.e.ed;

/* loaded from: classes.dex */
final class q8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1858b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1859c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f1860d;
    private final /* synthetic */ fa e;
    private final /* synthetic */ ed f;
    private final /* synthetic */ y7 g;

    q8(y7 y7Var, String str, String str2, boolean z, fa faVar, ed edVar) {
        this.g = y7Var;
        this.f1858b = str;
        this.f1859c = str2;
        this.f1860d = z;
        this.e = faVar;
        this.f = edVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                r3 r3Var = this.g.f1960d;
                if (r3Var == null) {
                    this.g.m().G().c("Failed to get user properties; not connected to service", this.f1858b, this.f1859c);
                } else {
                    bundle = z9.D(r3Var.j(this.f1858b, this.f1859c, this.f1860d, this.e));
                    this.g.f0();
                }
            } catch (RemoteException e) {
                this.g.m().G().c("Failed to get user properties; remote exception", this.f1858b, e);
            }
        } finally {
            this.g.g().Q(this.f, bundle);
        }
    }
}
