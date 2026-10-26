package d.b.a.a.f.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        int iP = 0;
        Intent intent = null;
        int iP2 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH == 2) {
                iP2 = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH != 3) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.v.b.b(parcel, iN, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new b(iP, iP2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
