package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0737Py {
    A04,
    A08,
    A07,
    A0A,
    A05,
    A02,
    A06,
    A03,
    A09;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-94, -93, -112, -95, -93, -108, -109, -64, -51, -51, -54, -51, -111, -119, -121, -114, -114, -125, -126, -65, -69, -80, -56, -79, -80, -78, -70, -50, -78, -66, -68, -65, -69, -76, -61, -76, -77, -8, -13, -5, -12, -93, -91, -104, -93, -108, -91, -100, -95, -102, 4, 6, -7, 4, -11, 6, -7, -8, -85, -66, -81, -81, -82, -69, -78, -73, -80, -47, -62, -42, -44, -58, -59};
    }

    static {
        A01();
    }
}
