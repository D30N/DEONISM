package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class j8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1746b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f1747c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ p f1748d;
    private final /* synthetic */ fa e;
    private final /* synthetic */ String f;
    private final /* synthetic */ y7 g;

    j8(y7 y7Var, boolean z, boolean z2, p pVar, fa faVar, String str) {
        this.g = y7Var;
        this.f1746b = z;
        this.f1747c = z2;
        this.f1748d = pVar;
        this.e = faVar;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.g.f1960d;
        if (r3Var == null) {
            this.g.m().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f1746b) {
            this.g.N(r3Var, this.f1747c ? null : this.f1748d, this.e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f)) {
                    r3Var.x(this.f1748d, this.e);
                } else {
                    r3Var.C(this.f1748d, this.f, this.g.m().P());
                }
            } catch (RemoteException e) {
                this.g.m().G().b("Failed to send event to the service", e);
            }
        }
        this.g.f0();
    }
}
