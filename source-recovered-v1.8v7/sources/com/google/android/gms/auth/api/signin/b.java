package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        String strC4 = null;
        Uri uri = null;
        String strC5 = null;
        String strC6 = null;
        ArrayList arrayListF = null;
        String strC7 = null;
        String strC8 = null;
        long jQ = 0;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            switch (com.google.android.gms.common.internal.v.b.h(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
                    break;
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
                    uri = (Uri) com.google.android.gms.common.internal.v.b.b(parcel, iN, Uri.CREATOR);
                    break;
                case 7:
                    strC5 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 8:
                    jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 9:
                    strC6 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 10:
                    arrayListF = com.google.android.gms.common.internal.v.b.f(parcel, iN, Scope.CREATOR);
                    break;
                case 11:
                    strC7 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 12:
                    strC8 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new GoogleSignInAccount(iP, strC, strC2, strC3, strC4, uri, strC5, jQ, strC6, arrayListF, strC7, strC8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
