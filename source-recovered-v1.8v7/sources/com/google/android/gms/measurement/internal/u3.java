package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class u3 extends d.b.a.a.e.e.u0 implements r3 {
    public u3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // d.b.a.a.e.e.u0
    protected final boolean e(int i, Parcel parcel, Parcel parcel2, int i2) {
        Collection collectionK;
        switch (i) {
            case 1:
                x((p) d.b.a.a.e.e.v.a(parcel, p.CREATOR), (fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Q((y9) d.b.a.a.e.e.v.a(parcel, y9.CREATOR), (fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                m((fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                C((p) d.b.a.a.e.e.v.a(parcel, p.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                F((fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                collectionK = k((fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR), d.b.a.a.e.e.v.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionK);
                return true;
            case 9:
                byte[] bArrT = t((p) d.b.a.a.e.e.v.a(parcel, p.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT);
                return true;
            case 10:
                G(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strO = o((fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strO);
                return true;
            case 12:
                l((oa) d.b.a.a.e.e.v.a(parcel, oa.CREATOR), (fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                w((oa) d.b.a.a.e.e.v.a(parcel, oa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                collectionK = j(parcel.readString(), parcel.readString(), d.b.a.a.e.e.v.e(parcel), (fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionK);
                return true;
            case 15:
                collectionK = H(parcel.readString(), parcel.readString(), parcel.readString(), d.b.a.a.e.e.v.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionK);
                return true;
            case 16:
                collectionK = M(parcel.readString(), parcel.readString(), (fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionK);
                return true;
            case 17:
                collectionK = K(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionK);
                return true;
            case 18:
                J((fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                q((Bundle) d.b.a.a.e.e.v.a(parcel, Bundle.CREATOR), (fa) d.b.a.a.e.e.v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
