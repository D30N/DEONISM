package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x9 implements Parcelable.Creator<y9> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y9 createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        String strC = null;
        Long lR = null;
        Float fM = null;
        String strC2 = null;
        String strC3 = null;
        Double dK = null;
        long jQ = 0;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            switch (com.google.android.gms.common.internal.v.b.h(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 2:
                    strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 3:
                    jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 4:
                    lR = com.google.android.gms.common.internal.v.b.r(parcel, iN);
                    break;
                case 5:
                    fM = com.google.android.gms.common.internal.v.b.m(parcel, iN);
                    break;
                case 6:
                    strC2 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 7:
                    strC3 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 8:
                    dK = com.google.android.gms.common.internal.v.b.k(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new y9(iP, strC, jQ, lR, fM, strC2, strC3, dK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y9[] newArray(int i) {
        return new y9[i];
    }
}
