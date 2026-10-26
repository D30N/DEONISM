package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        int iP = 0;
        String strC = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH != 2) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new Scope(iP, strC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}
