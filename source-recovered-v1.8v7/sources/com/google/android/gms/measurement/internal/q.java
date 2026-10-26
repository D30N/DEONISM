package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            if (com.google.android.gms.common.internal.v.b.h(iN) != 2) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                bundleA = com.google.android.gms.common.internal.v.b.a(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new o(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i) {
        return new o[i];
    }
}
