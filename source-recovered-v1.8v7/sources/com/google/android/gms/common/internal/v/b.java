package com.google.android.gms.common.internal.v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iS);
        return bundle;
    }

    public static <T extends Parcelable> T b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iS);
        return tCreateFromParcel;
    }

    public static String c(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iS);
        return string;
    }

    public static ArrayList<String> d(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return tArr;
    }

    public static <T> ArrayList<T> f(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateTypedArrayList;
    }

    public static void g(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static int h(int i) {
        return i & 65535;
    }

    public static boolean i(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean j(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, i, iS, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double k(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, i, iS, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float l(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float m(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, i, iS, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iS);
        return strongBinder;
    }

    public static int p(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int i) {
        v(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, i, iS, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void t(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i));
    }

    public static int u(Parcel parcel) {
        int iN = n(parcel);
        int iS = s(parcel, iN);
        int iDataPosition = parcel.dataPosition();
        if (h(iN) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(iN));
            throw new a(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = iS + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    private static void v(Parcel parcel, int i, int i2) {
        int iS = s(parcel, i);
        if (iS == i2) {
            return;
        }
        String hexString = Integer.toHexString(iS);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iS);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    private static void w(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
}
