package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class f8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q7 f1699b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y7 f1700c;

    f8(y7 y7Var, q7 q7Var) {
        this.f1700c = y7Var;
        this.f1699b = q7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        r3 r3Var = this.f1700c.f1960d;
        if (r3Var == null) {
            this.f1700c.m().G().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f1699b == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f1700c.f().getPackageName();
            } else {
                j = this.f1699b.f1856c;
                str = this.f1699b.a;
                str2 = this.f1699b.f1855b;
                packageName = this.f1700c.f().getPackageName();
            }
            r3Var.G(j, str, str2, packageName);
            this.f1700c.f0();
        } catch (RemoteException e) {
            this.f1700c.m().G().b("Failed to send current screen to the service", e);
        }
    }
}
