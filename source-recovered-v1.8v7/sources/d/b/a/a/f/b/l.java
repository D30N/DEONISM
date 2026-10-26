package d.b.a.a.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        d.b.a.a.c.b bVar = null;
        s sVar = null;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH == 2) {
                bVar = (d.b.a.a.c.b) com.google.android.gms.common.internal.v.b.b(parcel, iN, d.b.a.a.c.b.CREATOR);
            } else if (iH != 3) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                sVar = (s) com.google.android.gms.common.internal.v.b.b(parcel, iN, s.CREATOR);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new k(iP, bVar, sVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i) {
        return new k[i];
    }
}
