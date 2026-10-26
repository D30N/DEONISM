package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        Bundle bundleA = null;
        boolean zI = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            switch (com.google.android.gms.common.internal.v.b.h(iN)) {
                case 1:
                    jQ = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 2:
                    jQ2 = com.google.android.gms.common.internal.v.b.q(parcel, iN);
                    break;
                case 3:
                    zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
                    break;
                case 4:
                    strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 5:
                    strC2 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 6:
                    strC3 = com.google.android.gms.common.internal.v.b.c(parcel, iN);
                    break;
                case 7:
                    bundleA = com.google.android.gms.common.internal.v.b.a(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.v.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new e(jQ, jQ2, zI, strC, strC2, strC3, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i) {
        return new e[i];
    }
}
