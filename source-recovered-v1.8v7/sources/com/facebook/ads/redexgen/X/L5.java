package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum L5 {
    A04(0),
    A0C(1),
    A07(2),
    A0A(3),
    A08(4),
    A0B(5),
    A03(6),
    A09(7),
    A05(8),
    A06(9);

    public static byte[] A01;
    public int A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{77, 76, 92, 79, 66, 86, 77, 64, 75, 70, 81, 92, 69, 76, 86, 77, 71, 92, 81, 70, 69, 79, 70, 64, 87, 74, 76, 77, 44, 55, 46, 46, 61, 35, 33, 54, 43, 52, 43, 54, 43, 39, 49, 61, 48, 39, 36, 46, 39, 33, 54, 43, 45, 44, 28, 30, 21, 30, 9, 18, 24, 4, 30, 9, 9, 20, 9, 52, 57, 45, 54, 59, 48, 61, 42, 39, 62, 55, 45, 54, 60, 39, 42, 61, 62, 52, 61, 59, 44, 49, 55, 54, 95, 87, 74, 78, 67, 69, 91, 89, 78, 83, 76, 83, 78, 83, 95, 73, 69, 72, 95, 92, 86, 95, 89, 78, 83, 85, 84, 122, 123, 107, 102, 97, 122, 122, 125, 122, 115, 107, 96, 117, 103, Byte.MAX_VALUE, 103, 52, 57, 45, 54, 59, 48, 61, 42, 39, 62, 55, 45, 54, 60, 39, 57, 40, 49, 74, 73, 13, 12, 28, 2, 0, 23, 10, 21, 10, 23, 26, 28, 16, 6, 17, 21, 10, 0, 6, 70, 93, 68, 68, 87, 75, 71, 70, 92, 77, 80, 92, 40, 41, 57, 42, 39, 51, 40, 37, 46, 35, 52, 57, 32, 41, 51, 40, 34, 57, 39, 54, 47, 84, 87};
    }

    static {
        A01();
    }

    L5(int i) {
        this.A00 = i;
    }
}
