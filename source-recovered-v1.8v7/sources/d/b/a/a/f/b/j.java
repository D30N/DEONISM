package d.b.a.a.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        int iP = 0;
        r rVar = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                iP = com.google.android.gms.common.internal.v.b.p(parcel, iN);
            } else if (iH != 2) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                rVar = (r) com.google.android.gms.common.internal.v.b.b(parcel, iN, r.CREATOR);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new i(iP, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i) {
        return new i[i];
    }
}
