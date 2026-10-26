package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum PX {
    A03,
    A02,
    A05,
    A04;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{1, 14, 9, 13, 1, 20, 5, 4, 32, 19, 36, 19, 32, 33, 19, 45, 15, 28, 23, 27, 15, 34, 23, 28, 21, -35, -22, -27, -23, -35, -16, -27, -22, -29, 19, 6, 23, 6, 19, 20, 6, 32, 2, 15, 10, 14, 2, 21, 6, 5};
    }

    static {
        A01();
    }
}
