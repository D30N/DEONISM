package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8U {

    @VisibleForTesting
    public static SparseIntArray A00;

    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static final List<Integer> A05;
    public static final List<C8V> A06;
    public static final AtomicBoolean A07;
    public static final AtomicInteger A08;
    public static final AtomicReference<C8S> A09;
    public static final AtomicReference<C8T> A0A;
    public static final AtomicReference<Boolean> A0B;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A04 = new byte[]{-103, -105, -103, -98, -101, -68, -35, -38, -19, -33, -104, -37, -22, -39, -21, -32, -104, -38, -35, -37, -39, -19, -21, -35, -104, -25, -34, -104, -35, -18, -35, -26, -20, -104, -17, -31, -20, -32, -104, -21, -19, -38, -20, -15, -24, -35, -104, -75, -104, 117, 113, 112, -92, -109, -104, -108, -99, -110, -108, 125, -108, -93, -90, -98, -95, -102, -62, -32, -19, -90, -13, -97, -21, -18, -26, -97, -61, -28, -31, -12, -26, -97, -60, -11, -28, -19, -13, -83, -97, -62, -18, -19, -13, -28, -9, -13, -97, -24, -14, -97, -19, -12, -21, -21, -83, 95, 83, -90, -88, -107, -89, -84, -93, -104, 118, -94, -105, -104, 83, 112, 83, -51, -50, -56, -43, -40, -48, -48, -46, -41, -48, -93, -42, -63, -61, -61, -62, -61, -62, 126, -57, -52, -117, -53, -61, -53, -51, -48, -41, 126, -54, -51, -59, 126, -54, -57, -53, -57, -46, Byte.MAX_VALUE, 126, -86, -65, -47, -46, 126, -61, -44, -61, -52, -46, -104, 126, -43, -28, -35, -35, -44, -37, -58, -7, -28, -26, -15, -11, -22, -16, -17, -95, -59, -26, -29, -10, -24, -95, -58, -9, -26, -17, -11, -95, -8, -22, -11, -23, -95, -12, -10, -29, -11, -6, -15, -26, -95, -66, -95, -96, -69, -69, 108, -71, -83, -70, -59, 108, -79, -62, -79, -70, -64, -65, 108, -69, -78, 108, -65, -63, -82, -64, -59, -68, -79, 108, -81, -69, -80, -79, -122, 108, -72, -35, -43, -34, -113, -77, -44, -47, -28, -42, -113, -76, -27, -44, -35, -29, -113, -26, -40, -29, -41, -113, -30, -28, -47, -29, -24, -33, -44, -113, -84, -113, -99, -111, -34, -42, -28, -28, -46, -40, -42, -111, -82, -111, -97, -106, -91, -88, -96, -93, -100, -115, 120, -85, -106, -104, -93, -89, -100, -94, -95, 83, -105, -88, -91, -100, -95, -102, 83, -97, -94, -102, -102, -100, -95, -102, 83, -105, -104, -107, -88, -102, 83, -104, -87, -104, -95, -89, 97, 89, -123, -117, -124, -118, 123, -120, 80, 54, 115, 117, 112, 117, 114, -123, 114, 112, 125, Byte.MIN_VALUE, 120, 120, 122, Byte.MAX_VALUE, 120, -89, -38, -59, -57, -46, -42, -53, -47, -48, -126, -43, -54, -47, -41, -50, -58, -126, -48, -47, -42, -126, -54, -61, -46, -46, -57, -48, -126, -54, -57, -44, -57, -112, -124, -111, -106, -127, -122, -121, -106, -121, -123, -106, -117, -111, -112, -127, -103, -111, -127, -107, -117, -119, -112, -125, -114, -127, -122, -125, -106, -125, -127, -114, -111, -119, -119, -117, -112, -119, 109, 97, -94, -91, -91, -86, -75, -86, -80, -81, -94, -83, -118, -81, -89, -80, 97, 126, 97};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0A = new AtomicReference<>();
        A09 = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A05 = Arrays.asList(10, 50, 100, Integer.valueOf(AdError.NETWORK_ERROR_CODE));
        A06 = Collections.synchronizedList(new ArrayList());
        A08 = new AtomicInteger();
        A07 = new AtomicBoolean();
        A0B = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i, C8C c8c) {
        char c2 = A01(293, 7, 39).equals(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (C03008a.A1W != i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 200;
                case 4:
                    str = str;
                    if (!A01(0, 5, 44).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return 200;
                case 6:
                    str = str;
                    if (!A01(173, 6, 101).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return 200;
                case '\b':
                    str = str;
                    if (!A01(395, 36, 24).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return 50;
                case '\n':
                    str = str;
                    if (!A01(347, 15, 7).equals(str)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return JR.A05(c8c);
                case '\f':
                    return -1;
            }
        }
    }

    public static void A05(C8C c8c, int i, int i2) {
        c8c.A04().A83(A01(k.AppCompatTheme_windowFixedWidthMinor, 10, 95), C03008a.A20, new C03018b(A01(216, 33, 66) + i, A01(338, 9, 12) + i2));
    }

    @Deprecated
    public static void A06(@Nullable C8C c8c, String str, int i, C03018b c03018b) {
        String str2 = str;
        C8C c8c2 = c8c;
        C03018b c03018b2 = c03018b;
        char c2 = c8c2 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    A0F(new RuntimeException(A01(66, 39, k.AppCompatTheme_windowActionModeOverlay)));
                    return;
                case 3:
                    c8c2 = c8c2;
                    C8B.A01(c8c2.A00());
                    if (!A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03018b2 = c03018b2;
                    if (c03018b2.A00() != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str2 = str2;
                    c03018b2 = c03018b2;
                    A0D(new RuntimeException(A01(5, 44, 110) + str2 + A01(105, 16, 41) + i, c03018b2));
                    c2 = 6;
                    break;
                case 6:
                    try {
                        if (A0H(c8c2, str2, i, Math.random(), c03018b2)) {
                            A09(c8c2, str2, i, c03018b2);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        A0F(th);
                        return;
                    }
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A07(C8C c8c, String str, int i, C03018b c03018b) {
        C03018b c03018b2;
        boolean z = false;
        boolean z2 = false;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c03018b = c03018b;
                        c03018b.A03(2);
                        z = false;
                        c03018b.A07(false);
                        z2 = true;
                        c03018b.A04(1);
                        c2 = JR.A0P(c8c) ? (char) 7 : '\t';
                    } catch (Throwable th) {
                        A0F(th);
                        return;
                    }
                case 7:
                    c03018b2 = c03018b;
                    c03018b2.A06(z2);
                    break;
                case '\t':
                    c03018b2 = c03018b;
                    c03018b2.A06(z);
                    break;
            }
            return;
        }
        A06(c8c, str, i, c03018b2);
    }

    @Deprecated
    public static void A08(C8C c8c, String str, int i, C03018b c03018b) {
        try {
            c03018b.A03(2);
            c03018b.A06(false);
            A06(c8c, str, i, c03018b);
        } catch (Throwable th) {
            A0F(th);
        }
    }

    public static void A09(C8C c8c, String str, int i, C03018b c03018b) {
        synchronized (C8U.class) {
            if (!A03) {
                int iA01 = JR.A01(c8c);
                if (A08.getAndIncrement() < iA01 - 1) {
                    A06.add(new C8V(str, i, c03018b));
                } else if (A08.get() == iA01) {
                    A06.add(new C8V(A01(k.AppCompatTheme_windowFixedWidthMinor, 10, 95), C03008a.A1x, new C03018b(A01(131, 42, 84) + str + A01(300, 1, 73) + i)));
                }
            } else {
                A0A(c8c, str, i, c03018b, true);
            }
        }
    }

    public static void A0A(C8C c8c, String str, int i, C03018b c03018b, boolean z) {
        C8T c8t = A0A.get();
        boolean z2 = c8t != null && c8t.A7l();
        if (A07.get() || z2) {
            int iA00 = c03018b.A00();
            String strA01 = A01(49, 17, 37);
            String strA012 = A01(105, 16, 41);
            if (iA00 == 0) {
                Log.e(strA01, A01(179, 37, k.AppCompatTheme_windowFixedHeightMinor) + str + strA012 + i, c03018b);
            } else {
                Log.i(strA01, A01(249, 32, 101) + str + strA012 + i + A01(281, 12, 103) + c03018b.getMessage() + A01(431, 19, 55) + c03018b.A02());
            }
        }
        XT xt = new XT(c8c, str, i, c03018b, c8t);
        if (z) {
            A01.execute(xt);
        } else {
            xt.run();
        }
    }

    public static void A0C(XJ xj, C8T c8t, C8S c8s, boolean z) {
        A09.set(c8s);
        A0A.set(c8t);
        A07.set(z);
        synchronized (C8U.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new XS(xj));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8R
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(362, 33, 88), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(49, 17, 37), A01(301, 37, 41), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    @VisibleForTesting
    @SuppressLint({"CatchGeneralException"})
    public static boolean A0H(C8C c8c, String str, int i, double d2, C03018b c03018b) {
        double logProbability;
        int iA0D;
        try {
            int iA04 = JR.A04(c8c);
            if (iA04 < 1) {
                return false;
            }
            HashMap<String, Integer> mapA0L = JR.A0L(c8c);
            Set<String> setKeySet = mapA0L.keySet();
            String str2 = str + A01(300, 1, 73) + i;
            boolean zContains = setKeySet.contains(str2);
            if (zContains) {
                Integer num = mapA0L.get(str2);
                int iIntValue = num != null ? num.intValue() : -1;
                if (iIntValue == 0) {
                    return false;
                }
                if (iIntValue > 0) {
                    return d2 <= 1.0d / ((double) iIntValue);
                }
                if (JR.A03(c8c) < 1) {
                    return false;
                }
                logProbability = (iA04 * r0) / 10000.0d;
            } else if (!c03018b.A08()) {
                logProbability = 0.0d;
            } else {
                double logProbability2 = iA04;
                logProbability = logProbability2 / 100.0d;
            }
            double dA00 = c8c.A05().A00();
            if (A01(0, 5, 44).equals(str)) {
                if (BuildConfigApi.isDebug()) {
                    return true;
                }
                int iA06 = JR.A06(c8c);
                if (iA06 == 0) {
                    return false;
                }
                if (iA06 > 0) {
                    double d3 = 1.0d / iA06;
                    return zContains ? dA00 <= d3 * logProbability : dA00 <= d3;
                }
            }
            if (A01(293, 7, 39).equals(str) && C03008a.A1W == i) {
                if (!A07.get()) {
                    iA0D = JR.A0D(c8c);
                } else {
                    iA0D = 1;
                }
                if (iA0D == 0) {
                    return false;
                }
                if (iA0D > 0) {
                    double d4 = 1.0d / iA0D;
                    return zContains ? dA00 <= d4 * logProbability : dA00 <= d4;
                }
            }
            if (A01(173, 6, 101).equals(str)) {
                Boolean bool = A0B.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int iA0A = JR.A0A(c8c);
                if (iA0A == 0) {
                    A0B.set(false);
                    return false;
                }
                if (iA0A > 0) {
                    double d5 = 1.0d / iA0A;
                    return zContains ? dA00 <= d5 * logProbability : dA00 <= d5;
                }
            }
            return d2 >= 1.0d - logProbability;
        } catch (Throwable th) {
            A0F(th);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0I(C8C c8c, String str, int eventsLimit, C03018b c03018b) {
        int iA00 = 0;
        int i = 0;
        int iA01 = 0;
        char c2 = !JR.A0O(c8c) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    c8c = c8c;
                    c03018b = c03018b;
                    i = A00.get(eventsLimit);
                    iA01 = JR.A00(c8c);
                    if (c03018b.A01() == -1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03018b = c03018b;
                    iA01 = c03018b.A01();
                    c2 = 5;
                    break;
                case 5:
                    if (i < iA01) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!A05.contains(Integer.valueOf(i))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c03018b = c03018b;
                    if (!c03018b.A09()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c8c = c8c;
                    A05(c8c, eventsLimit, i);
                    c2 = '\t';
                    break;
                case '\t':
                    A00.put(eventsLimit, i + 1);
                    return true;
                case '\n':
                    c8c = c8c;
                    str = str;
                    iA00 = A00(str, eventsLimit, c8c);
                    if (iA01 >= iA00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    iA01 = iA00;
                    c2 = 5;
                    break;
                case '\f':
                    A00.put(eventsLimit, i + 1);
                    return false;
            }
        }
    }
}
