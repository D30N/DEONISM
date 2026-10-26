package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class m8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1797b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f1798c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ oa f1799d;
    private final /* synthetic */ fa e;
    private final /* synthetic */ oa f;
    private final /* synthetic */ y7 g;

    m8(y7 y7Var, boolean z, boolean z2, oa oaVar, fa faVar, oa oaVar2) {
        this.g = y7Var;
        this.f1797b = z;
        this.f1798c = z2;
        this.f1799d = oaVar;
        this.e = faVar;
        this.f = oaVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.g.f1960d;
        if (r3Var == null) {
            this.g.m().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f1797b) {
            this.g.N(r3Var, this.f1798c ? null : this.f1799d, this.e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f.f1829b)) {
                    r3Var.l(this.f1799d, this.e);
                } else {
                    r3Var.w(this.f1799d);
                }
            } catch (RemoteException e) {
                this.g.m().G().b("Failed to send conditional user property to the service", e);
            }
        }
        this.g.f0();
    }
}
