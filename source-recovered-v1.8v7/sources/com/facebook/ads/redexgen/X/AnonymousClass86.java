package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.86, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass86 {
    A03,
    A04,
    A0I,
    A0B,
    A0D,
    A05,
    A0A,
    A07,
    A0L,
    A0E,
    A0F,
    A02,
    A06,
    A08,
    A0J,
    A0M,
    A0H,
    A09,
    A0G,
    A0K,
    A0C;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 46);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-92, -87, -99, -102, -89, -58, -35, -40, -55, -122, -103, -122, -124, -106, -107, -126, -125, -115, -122, -105, -92, -92, -95, -92, -26, -25, -27, -18, -29, -12, -25, -26, 126, Byte.MAX_VALUE, 126, 117, -57, -50, -59, -59, -20, -14, -11, -25, -6, -21, -32, -25, -22, -20, -71, -66, -73, -56, -110, -105, -99, -127, 114, 116, 124, 114, 120, 118, -70, -57, -57, -60, -67, -71, -58, -44, -39, -48, -59, -42, -63, -46, -105, -112, -118, -123, Byte.MAX_VALUE, -124, -118, 123, -120, -119, 123, 121, -118, Byte.MAX_VALUE, -123, -124, -84, -98, -95, -103, -104, -106, -89, -103, -72, -55, -55, -72, -48, -87, -84, -85, -92, -99, -106, -111, -105, -106, 118, -127, -121, 116, 126, 119};
    }

    static {
        A01();
    }
}
