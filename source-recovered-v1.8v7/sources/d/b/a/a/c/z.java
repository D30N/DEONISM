package d.b.a.a.c;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<y> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.v.b.u(parcel);
        boolean zI = false;
        String strC = null;
        IBinder iBinderO = null;
        boolean zI2 = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.v.b.n(parcel);
            int iH = com.google.android.gms.common.internal.v.b.h(iN);
            if (iH == 1) {
                strC = com.google.android.gms.common.internal.v.b.c(parcel, iN);
            } else if (iH == 2) {
                iBinderO = com.google.android.gms.common.internal.v.b.o(parcel, iN);
            } else if (iH == 3) {
                zI = com.google.android.gms.common.internal.v.b.i(parcel, iN);
            } else if (iH != 4) {
                com.google.android.gms.common.internal.v.b.t(parcel, iN);
            } else {
                zI2 = com.google.android.gms.common.internal.v.b.i(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.v.b.g(parcel, iU);
        return new y(strC, iBinderO, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y[] newArray(int i) {
        return new y[i];
    }
}
