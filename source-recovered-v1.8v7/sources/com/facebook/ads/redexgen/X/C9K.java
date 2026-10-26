package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C9K {
    A02,
    A04,
    A03;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{6, 5, 20, 3, 8, 5, 4, 31, 18, 5, 3, 15, 18, 4, 19, -25, -26, -11, -28, -23, 0, -29, -10, -25, -25, -26, -13, 0, -11, -16, -16, 0, -12, -18, -30, -19, -19, -17, -16, 0, -13, -26, -28, -16, -13, -27, -12, 0, -11, -16, 0, -25, -26, -11, -28, -23};
    }

    static {
        A01();
    }
}
