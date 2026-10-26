package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<p> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        String strC = null;
        o oVar = null;
        String strC2 = null;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 2) {
                strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
            } else if (iH == 3) {
                oVar = (o) com.google.android.gms.common.internal.v.b.b(parcel, iN, o.CREATOR);
            } else if (iH == 4) {
                strC2 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
            } else if (iH != 5) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new p(strC, oVar, strC2, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i) {
        return new p[i];
    }
}
