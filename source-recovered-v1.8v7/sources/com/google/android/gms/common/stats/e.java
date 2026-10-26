package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        String strC = null;
        ArrayList<String> arrayListD = null;
        String strC2 = null;
        String strC3 = null;
        String strC4 = null;
        String strC5 = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        int iP4 = 0;
        float fL = 0.0f;
        boolean zI = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            switch (com.google.android.gms.common.internal.v.b.h(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 2:
                    jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
                case 4:
                    strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 5:
                    iP3 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 6:
                    arrayListD = com.google.android.gms.common.internal.v.b.d(parcel, iN);
                    break;
                case 8:
                    jQ2 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 10:
                    strC3 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 11:
                    iP2 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 12:
                    strC2 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 13:
                    strC4 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 14:
                    iP4 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 15:
                    fL = com.google.android.gms.common.internal.v.b.l(parcel, iN);
                    break;
                case 16:
                    jQ3 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 17:
                    strC5 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 18:
                    zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new WakeLockEvent(iP, jQ, iP2, strC, iP3, arrayListD, strC2, jQ2, iP4, strC3, strC4, fL, jQ3, strC5, zI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
