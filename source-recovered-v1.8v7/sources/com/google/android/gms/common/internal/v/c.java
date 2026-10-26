package com.google.android.gms.common.internal.v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return r(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        t(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        u(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            u(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            u(parcel, i, 0);
        }
    }

    public static void e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iR = r(parcel, i);
            parcel.writeBundle(bundle);
            t(parcel, iR);
        }
    }

    public static void f(Parcel parcel, int i, Double d2, boolean z) {
        if (d2 != null) {
            u(parcel, i, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            u(parcel, i, 0);
        }
    }

    public static void g(Parcel parcel, int i, float f) {
        u(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void h(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            u(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            u(parcel, i, 0);
        }
    }

    public static void i(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iR = r(parcel, i);
            parcel.writeStrongBinder(iBinder);
            t(parcel, iR);
        }
    }

    public static void j(Parcel parcel, int i, int i2) {
        u(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void k(Parcel parcel, int i, long j) {
        u(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void l(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            u(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            u(parcel, i, 0);
        }
    }

    public static void m(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iR = r(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            t(parcel, iR);
        }
    }

    public static void n(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iR = r(parcel, i);
            parcel.writeString(str);
            t(parcel, iR);
        }
    }

    public static void o(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iR = r(parcel, i);
            parcel.writeStringList(list);
            t(parcel, iR);
        }
    }

    public static <T extends Parcelable> void p(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                u(parcel, i, 0);
                return;
            }
            return;
        }
        int iR = r(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                s(parcel, t, i2);
            }
        }
        t(parcel, iR);
    }

    public static <T extends Parcelable> void q(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                u(parcel, i, 0);
                return;
            }
            return;
        }
        int iR = r(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                s(parcel, t, 0);
            }
        }
        t(parcel, iR);
    }

    private static int r(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <T extends Parcelable> void s(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static void t(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    private static void u(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
        } else {
            parcel.writeInt(i | (-65536));
            parcel.writeInt(i2);
        }
    }
}
