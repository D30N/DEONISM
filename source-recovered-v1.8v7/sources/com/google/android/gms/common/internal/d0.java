package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        String strC = null;
        IBinder iBinderO = null;
        Scope[] scopeArr = null;
        Bundle bundleA = null;
        Account account = null;
        d.b.a.a.c.d[] dVarArr = null;
        d.b.a.a.c.d[] dVarArr2 = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        boolean zI = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            switch (com.google.android.gms.common.internal.v.b.h(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 2:
                    iP2 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 3:
                    iP3 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
                case 4:
                    strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 5:
                    iBinderO = com.google.android.gms.common.internal.v.b.o(parcel, iN);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.v.b.e(parcel, iN, Scope.CREATOR);
                    break;
                case 7:
                    bundleA = com.google.android.gms.common.internal.v.b.a(parcel, iN);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.v.b.b(parcel, iN, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
                case 10:
                    dVarArr = (d.b.a.a.c.d[]) com.google.android.gms.common.internal.v.b.e(parcel, iN, d.b.a.a.c.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d.b.a.a.c.d[]) com.google.android.gms.common.internal.v.b.e(parcel, iN, d.b.a.a.c.d.CREATOR);
                    break;
                case 12:
                    zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new f(iP, iP2, iP3, strC, iBinderO, scopeArr, bundleA, account, dVarArr, dVarArr2, zI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i) {
        return new f[i];
    }
}
