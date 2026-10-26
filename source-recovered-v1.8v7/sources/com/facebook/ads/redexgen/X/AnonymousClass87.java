package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.87, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass87 {
    A07,
    A0A,
    A0F,
    A04,
    A0E,
    A0D,
    A0G,
    A03,
    A0B,
    A05,
    A08,
    A0H,
    A06,
    A09,
    A0C,
    A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{27, 20, 24, 17, 25, 67, 79, 78, 83, 84, 82, 85, 67, 84, 79, 82, 95, 82, 69, 83, 85, 76, 84, 94, 67, 75, 87, 82, 88, 82, 79, 68, 87, 84, 76, 94, 73, 68, 89, 84, 78, 85, 95, 13, 14, 2, 0, 13, 30, 23, 0, 19, 8, 0, 3, 13, 4, 60, 43, 45, 43, 39, 56, 43, 60, 106, 111, 111, 122, 109, 96, 125, 112, 106, 113, 123, 19, 14, 21, 19, 6, 2, 31, 25, 24, 9, 6, 23, 4, 23, 27, 19, 2, 19, 4, 54, 50, 47, 51, 54, 60, 54, 43, 32, 51, 48, 40, 58, 45, 32, 61, 48, 42, 49, 59, 28, 1, 9, 21, 16, 26, 16, 13, 6, 12, 9, 9, 28, 11, 6, 27, 22, 12, 23, 29, 57, 61, 32, 60, 57, 51, 57, 36, 47, 37, 32, 32, 53, 34, 47, 50, 63, 37, 62, 52, 126, 111, 124, 111, 99, 107, 122, 107, 124, 2, 25, 5, 8, 31, 26, 4, 30, 8, 45, 58, 44, 48, 42, 45, 60, 58, 32, 41, 62, 45, 54, 62, 61, 51, 58, 51, 48, 40, 58, 45, 32, 61, 48, 42, 49, 59, 29, 10, 27, 26, 29, 1, 23, 26, 26};
    }

    static {
        A01();
    }
}
