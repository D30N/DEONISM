package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class n0 extends d.b.a.a.e.c.a implements l0 {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.l0
    public final boolean R(d.b.a.a.c.y yVar, d.b.a.a.d.a aVar) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.d(parcelE, yVar);
        d.b.a.a.e.c.c.c(parcelE, aVar);
        Parcel parcelG = g(5, parcelE);
        boolean zE = d.b.a.a.e.c.c.e(parcelG);
        parcelG.recycle();
        return zE;
    }
}
