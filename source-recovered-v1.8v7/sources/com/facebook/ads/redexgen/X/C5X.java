package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C5X {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{12, 13, 29, 5, 15, 17, 107, 102, 125, 106, 108, 123, 90, 45, 90, 64, 75, 90, 76, 75, 66, 70, 48, 69, 1, 26, 19, 0, 23, 22, 13, 2, 0, 23, 20, 1, 5, 20, 2, 5, 15, 25, 14, 10, 21, 31, 25, 57, 46, 45, 39, 46, 40, 63, 34, 36, 37};
    }

    static {
        A01();
    }
}
