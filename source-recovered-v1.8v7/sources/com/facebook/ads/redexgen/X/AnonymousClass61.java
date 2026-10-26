package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.61, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass61 {
    A09(A00(104, 12, 49)),
    A04(A00(182, 14, 88)),
    A07(A00(196, 14, 65)),
    A08(A00(k.AppCompatTheme_windowActionBarOverlay, 19, 82)),
    A03(A00(38, 14, 106)),
    A05(A00(0, 19, 42)),
    A06(A00(52, 13, 54));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-91, -86, -78, -99, -88, -91, -96, -101, -98, -96, -101, -82, -95, -81, -84, -85, -86, -81, -95, -82, -77, -69, -90, -79, -82, -87, -60, -89, -87, -60, -73, -86, -72, -75, -76, -77, -72, -86, -33, -21, -22, -30, -27, -29, -37, -20, -35, -18, -17, -27, -22, -29, -70, -67, -74, -68, -79, -75, -83, -89, -83, -70, -70, -73, -70, -98, -109, -105, -113, -100, -87, -115, -117, -106, -106, -113, -114, -101, -98, -105, -99, -110, -106, -114, -88, -114, -101, -101, -104, -101, 92, 104, 103, 95, 98, 96, 120, 105, 90, 107, 108, 98, 103, 96, -73, -84, -80, -88, -75, -94, -90, -92, -81, -81, -88, -89, -41, -51, -53, -46, -59, -48, -61, -57, -45, -46, -41, -40, -42, -39, -57, -40, -51, -45, -46, -89, -99, -101, -94, -107, -96, -77, -105, -93, -94, -89, -88, -90, -87, -105, -88, -99, -93, -94, 113, -126, 113, 122, Byte.MIN_VALUE, -117, 123, 111, 111, -127, 126, 126, 113, 112, -61, -75, -61, -61, -71, -65, -66, -49, -68, -65, -73, -73, -75, -76, -49, -32, -49, -40, -34, -55, -39, -51, -51, -33, -36, -36, -49, -50, -58, -72, -58, -58, -68, -62, -63, -78, -65, -62, -70, -70, -72, -73};
    }

    static {
        A01();
    }

    AnonymousClass61(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
