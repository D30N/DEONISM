package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH == 2) {
                account = (Account) com.google.android.gms.common.internal.v.b.b(parcel, iN, Account.CREATOR);
            } else if (iH == 3) {
                iP2 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH != 4) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.common.internal.v.b.b(parcel, iN, GoogleSignInAccount.CREATOR);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new r(iP, account, iP2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i) {
        return new r[i];
    }
}
