package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ea implements Parcelable.Creator<fa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fa createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        long jQ4 = 0;
        long jQ5 = 0;
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        String strC4 = null;
        String strC5 = null;
        String strC6 = null;
        String strC7 = null;
        Boolean boolJ = null;
        ArrayList<String> arrayListD = null;
        String strC8 = null;
        long jQ6 = -2147483648L;
        boolean zI = true;
        boolean zI2 = false;
        int iP = 0;
        boolean zI3 = true;
        boolean zI4 = true;
        boolean zI5 = false;
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
                    strC3 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 5:
                    strC4 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 6:
                    jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 7:
                    jQ2 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 8:
                    strC5 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 9:
                    zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 10:
                    zI2 = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 11:
                    jQ6 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 12:
                    strC6 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 13:
                    jQ3 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 14:
                    jQ4 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 15:
                    iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 16:
                    zI3 = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 17:
                    zI4 = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 18:
                    zI5 = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 19:
                    strC7 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 20:
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
                case 21:
                    boolJ = com.google.android.gms.common.internal.v.b.j(parcel, iN);
                    break;
                case 22:
                    jQ5 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 23:
                    arrayListD = com.google.android.gms.common.internal.v.b.d(parcel, iN);
                    break;
                case 24:
                    strC8 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new fa(strC, strC2, strC3, strC4, jQ, jQ2, strC5, zI, zI2, jQ6, strC6, jQ3, jQ4, iP, zI3, zI4, zI5, strC7, boolJ, jQ5, arrayListD, strC8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fa[] newArray(int i) {
        return new fa[i];
    }
}
