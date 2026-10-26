package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0 createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        Bundle bundleA = null;
        d.b.a.a.c.d[] dVarArr = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                bundleA = com.google.android.gms.common.internal.v.b.a(parcel, iN);
            } else if (iH != 2) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                dVarArr = (d.b.a.a.c.d[]) com.google.android.gms.common.internal.v.b.e(parcel, iN, d.b.a.a.c.d.CREATOR);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new b0(bundleA, dVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0[] newArray(int i) {
        return new b0[i];
    }
}
