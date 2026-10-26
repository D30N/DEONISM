package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface l extends IInterface {

    public static abstract class a extends d.b.a.a.e.c.b implements l {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // d.b.a.a.e.c.b
        protected final boolean e(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                T(parcel.readInt(), parcel.readStrongBinder(), (Bundle) d.b.a.a.e.c.c.b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                N(parcel.readInt(), (Bundle) d.b.a.a.e.c.c.b(parcel, Bundle.CREATOR));
            } else {
                if (i != 3) {
                    return false;
                }
                A(parcel.readInt(), parcel.readStrongBinder(), (b0) d.b.a.a.e.c.c.b(parcel, b0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void A(int i, IBinder iBinder, b0 b0Var);

    void N(int i, Bundle bundle);

    void T(int i, IBinder iBinder, Bundle bundle);
}
