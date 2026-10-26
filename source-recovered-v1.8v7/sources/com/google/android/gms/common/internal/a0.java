package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        IBinder iBinderO = null;
        d.b.a.a.c.b bVar = null;
        int iP = 0;
        boolean zI = false;
        boolean zI2 = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH == 2) {
                iBinderO = com.google.android.gms.common.internal.v.b.o(parcel, iN);
            } else if (iH == 3) {
                bVar = (d.b.a.a.c.b) com.google.android.gms.common.internal.v.b.b(parcel, iN, d.b.a.a.c.b.CREATOR);
            } else if (iH == 4) {
                zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
            } else if (iH != 5) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                zI2 = com.google.android.gms.common.internal.v.b.i(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new s(iP, iBinderO, bVar, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i) {
        return new s[i];
    }
}
