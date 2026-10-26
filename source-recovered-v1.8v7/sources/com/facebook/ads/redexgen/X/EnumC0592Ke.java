package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0592Ke {
    A09,
    A07,
    A06,
    A08,
    A05,
    A0B,
    A0A,
    A02,
    A03,
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{78, 83, 68, 75, 71, 67, 73, 85, 67, 68, 94, 79, 88, 89, 94, 67, 94, 67, 75, 70, 64, 87, 69, 83, 64, 86, 87, 86, 77, 66, 94, 83, 75, 83, 80, 94, 87, 100, 116, 105, 113, 117, 99, 116, 4, 25, 14, 1, 13, 9, 3, 31, 18, 5, 23, 1, 18, 4, 5, 4, 31, 22, 9, 4, 5, 15, 108, Byte.MAX_VALUE, 102, 102, 117, 121, 105, 120, 111, 111, 100, 117, 124, 99, 110, 111, 101, 103, 112, 98, 116, 103, 113, 112, 113, 106, 99, 124, 113, 112, 122, 60, 59, 33, 48, 39, 38, 33, 60, 33, 60, 52, 57, 42, 59, 52, 33, 60, 35, 48, 42, 37, 57, 52, 44, 52, 55, 57, 48, 45, 42, 48, 33, 54, 55, 48, 45, 48, 45, 37, 40, 59, 42, 37, 48, 45, 50, 33, 59, 50, 45, 32, 33, 43, 49, 54, 44, 61, 42, 43, 44, 49, 44, 49, 57, 52, 39, 54, 57, 44, 49, 46, 61, 39, 59, 57, 42, 55, 45, 43, 61, 52, 70, 65, 91, 74, 93, 92, 91, 70, 91, 70, 78, 67, 80, 65, 78, 91, 70, 89, 74, 80, 70, 66, 78, 72, 74};
    }

    static {
        A01();
    }
}
