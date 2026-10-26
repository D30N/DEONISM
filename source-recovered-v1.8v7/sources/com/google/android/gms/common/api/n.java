package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        String strC = null;
        PendingIntent pendingIntent = null;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP2 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH == 2) {
                strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
            } else if (iH == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.v.b.b(parcel, iN, PendingIntent.CREATOR);
            } else if (iH != 1000) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new Status(iP, iP2, strC, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
