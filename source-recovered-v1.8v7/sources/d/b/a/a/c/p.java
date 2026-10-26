package d.b.a.a.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        String strC = null;
        int iP = 0;
        long jQ = -1;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
            } else if (iH == 2) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH != 3) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new d(strC, iP, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
