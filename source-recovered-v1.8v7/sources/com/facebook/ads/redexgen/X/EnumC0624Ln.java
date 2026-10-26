package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0624Ln {
    A08(0),
    A07(0),
    A06(1),
    A03(2),
    A04(3),
    A05(4);

    public static byte[] A01;
    public final int A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-108, -106, -119, -112, -109, -116, -90, 123, -114, -116, -114, -127, -120, -117, -124, -98, 114, -122, -42, -41, -42, -51, -51, -49, -62, -55, -52, -59, -33, -78, -57, 0, 2, -11, -4, -1, -8, 18, -4, 1, 7, -8, 5, 1, -8, 7, 10, 3, 0, 3, 4, 12, 3};
    }

    static {
        A01();
    }

    EnumC0624Ln(int i) {
        this.A00 = i;
    }
}
