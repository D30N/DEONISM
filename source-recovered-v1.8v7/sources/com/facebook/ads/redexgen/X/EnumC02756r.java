package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02756r {
    A06,
    A09,
    A05,
    A0C,
    A02,
    A03,
    A07,
    A0D,
    A0A,
    A08,
    A0B,
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{65, 70, 64, 91, 92, 85, 46, 56, 62, 57, 34, 32, 50, 34, 47, 39, 40, 46, 57, 31, 24, 2, 9, 23, 4, 4, 23, 15, 75, 80, 74, 92, 87, 13, 27, 16, 13, 17, 12, 22, 1, 1, 28, 1, 85, 95, 92, 82, 71, 13, 10, 16, 2, 15, 15, 12, 5, 1, 14, 2, 7, 29, 26, 23, 27, 10, 17, 18, 19, 26};
    }

    static {
        A01();
    }
}
