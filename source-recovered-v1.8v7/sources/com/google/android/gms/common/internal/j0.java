package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class j0 extends d.b.a.a.e.c.b implements i0 {
    public j0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static i0 g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new k0(iBinder);
    }

    @Override // d.b.a.a.e.c.b
    protected final boolean e(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            d.b.a.a.d.a aVarB = b();
            parcel2.writeNoException();
            d.b.a.a.e.c.c.c(parcel2, aVarB);
        } else {
            if (i != 2) {
                return false;
            }
            int iC = c();
            parcel2.writeNoException();
            parcel2.writeInt(iC);
        }
        return true;
    }
}
