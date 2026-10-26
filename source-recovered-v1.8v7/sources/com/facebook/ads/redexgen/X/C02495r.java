package com.facebook.ads.redexgen.X;

import android.content.Context;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.5r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02495r {
    public static byte[] A00;

    static {
        A0O();
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0O() {
        A00 = new byte[]{-35, -33, -38, -28, -18, -38, -28, -23, -17, -32, -19, -15, -36, -25, -38, -24, -22, -33, -32, -38, -32, -23, -36, -35, -25, -32, -33, -86, -84, -89, -69, -68, -87, -68, -79, -85, -89, -69, -79, -81, -74, -87, -76, -89, -85, -79, -70, -85, -67, -76, -87, -70, -89, -86, -67, -82, -82, -83, -70, -89, -76, -83, -74, -81, -68, -80, -90, -88, -93, -77, -76, -87, -74, -91, -72, -83, -77, -78, -91, -80, -93, -80, -77, -85, -85, -83, -78, -85, -93, -73, -91, -79, -76, -80, -83, -78, -85, -93, -74, -91, -72, -87, -117, -115, -120, -117, -110, -104, -106, -114, -99, -101, -110, -116, -120, -100, -110, -112, -105, -118, -107, -120, -116, -110, -101, -116, -98, -107, -118, -101, -120, -117, -98, -113, -113, -114, -101, -120, -107, -114, -105, -112, -99, -111, -103, -101, -106, -100, -87, -87, -90, -87, -106, -87, -100, -89, -90, -87, -85, -106, -86, -104, -92, -89, -93, -96, -91, -98, -106, -87, -104, -85, -100, -122, -120, -125, -120, -99, -110, -123, -111, -115, -121, -125, -105, -115, -117, -110, -123, -112, -125, -121, -115, -106, -121, -103, -112, -123, -106, -125, -122, -103, -118, -118, -119, -106, -125, -112, -119, -110, -117, -104, -116, 125, Byte.MAX_VALUE, 122, -124, -119, -113, Byte.MIN_VALUE, -115, -111, 124, -121, 122, Byte.MAX_VALUE, -112, -115, 124, -113, -124, -118, -119, 122, -114, -119, -117, -122, -120, -118, -122, -118, -119, -44, -42, -47, -44, -33, -47, -26, -37, -33, -41, -47, -41, -30, -27, -37, -34, -31, -32, -43, -41, -46, -29, -32, -46, -29, -27, -30, -29, -46, -23, -44, -33, -46, -42, -30, -24, -31, -25, -123, -121, -126, -119, -113, -110, -124, -105, -126, -120, -109, -106, -116, -113, -110, -111, -60, -58, -63, -43, -53, -55, -48, -61, -50, -43, -63, -59, -47, -48, -56, -53, -55, -15, -13, -18, 1, 3, -34, -32, -59, -57, -62, -47, -59, -48, -62, -41, -52, -48, -56, -62, -56, -45, -42, -52, -49, -46, -47, -7, -5, -10, 10, 0, -2, 5, -8, 3, -10, -6, 6, 5, -3, 0, -2, -10};
    }

    public static double A00(Context context) {
        return JQ.A0L(context).A1h(A0C(144, 29, 31), 0.0d);
    }

    public static double A01(Context context) {
        return JQ.A0L(context).A1h(A0C(66, 36, 44), 0.0d);
    }

    public static float A02(Context context) {
        return JQ.A0L(context).A1i(A0C(281, 16, 11), 0.0f);
    }

    public static int A03(Context context) {
        return JQ.A0L(context).A1j(A0C(102, 42, 17), 0);
    }

    public static int A04(Context context) {
        return JQ.A0L(context).A1j(A0C(173, 40, 12), 0);
    }

    public static int A05(Context context) {
        return JQ.A0L(context).A1j(A0C(213, 22, 3), 0);
    }

    public static int A06(Context context) {
        return JQ.A0L(context).A1j(A0C(261, 20, 91), 0);
    }

    public static int A07(Context context) {
        return JQ.A0L(context).A1j(A0C(27, 39, 48), 0);
    }

    public static long A08(Context context) {
        return JQ.A0L(context).A1k(A0C(243, 18, 90), 0L);
    }

    public static long A09(Context context) {
        return JQ.A0L(context).A1k(A0C(321, 19, 75), 0L);
    }

    public static EnumC02626e A0A(Context context) {
        return EnumC02626e.A00(JQ.A0L(context).A1j(A0C(314, 5, k.AppCompatTheme_windowFixedHeightMinor), 0));
    }

    public static String A0B(int i) {
        return A0C(340, 17, 127) + i;
    }

    public static String A0D(Context context) {
        JQ jqA0L = JQ.A0L(context);
        String strA0C = A0C(319, 2, 75);
        String strA1l = jqA0L.A1l(A0C(297, 17, 74), strA0C);
        return strA1l == null ? strA0C : strA1l;
    }

    public static String A0E(Context context) {
        return A0L(context, 10920);
    }

    public static String A0F(Context context) {
        return A0L(context, 10300);
    }

    public static String A0G(Context context) {
        return A0L(context, 10941);
    }

    public static String A0H(Context context) {
        return A0L(context, 10943);
    }

    public static String A0I(Context context) {
        return A0L(context, 10944);
    }

    public static String A0J(Context context) {
        return A0L(context, 10945);
    }

    public static String A0K(Context context) {
        return A0L(context, 10940);
    }

    public static String A0L(Context context, int i) {
        JQ jqA0L = JQ.A0L(context);
        String strA0B = A0B(i);
        String strA0C = A0C(319, 2, 75);
        String strA1l = jqA0L.A1l(strA0B, strA0C);
        return strA1l == null ? strA0C : strA1l;
    }

    public static HashMap<Integer, Integer> A0M() {
        return new HashMap<>();
    }

    public static Map<Integer, String> A0N(Context context) {
        HashMap map = new HashMap();
        map.put(10920, A0E(context));
        map.put(10941, A0G(context));
        map.put(10300, A0F(context));
        map.put(10940, A0K(context));
        map.put(10943, A0H(context));
        map.put(10944, A0I(context));
        map.put(10945, A0J(context));
        return Collections.unmodifiableMap(map);
    }

    public static boolean A0P(Context context) {
        return JQ.A0L(context).A1n(A0C(0, 27, 99), false);
    }

    public static boolean A0Q(Context context) {
        return JQ.A0L(context).A1n(A0C(235, 8, 15), false);
    }
}
