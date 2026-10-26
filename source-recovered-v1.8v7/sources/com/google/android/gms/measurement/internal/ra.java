package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ra implements Parcelable.Creator<oa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oa createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        String strC = null;
        String strC2 = null;
        y9 y9Var = null;
        String strC3 = null;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        boolean zI = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            switch (com.google.android.gms.common.internal.v.b.h(iN)) {
                case 2:
                    strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 3:
                    strC2 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 4:
                    y9Var = (y9) com.google.android.gms.common.internal.v.b.b(parcel, iN, y9.CREATOR);
                    break;
                case 5:
                    jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 6:
                    zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 7:
                    strC3 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 8:
                    pVar = (p) com.google.android.gms.common.internal.v.b.b(parcel, iN, p.CREATOR);
                    break;
                case 9:
                    jQ2 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 10:
                    pVar2 = (p) com.google.android.gms.common.internal.v.b.b(parcel, iN, p.CREATOR);
                    break;
                case 11:
                    jQ3 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 12:
                    pVar3 = (p) com.google.android.gms.common.internal.v.b.b(parcel, iN, p.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new oa(strC, strC2, y9Var, jQ, zI, strC3, pVar, jQ2, pVar2, jQ3, pVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oa[] newArray(int i) {
        return new oa[i];
    }
}
