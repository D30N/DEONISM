package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1174cz {
    public static byte[] A00;

    static {
        A01();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{74, 80, 124, 74, 77, 85, 66, 79, 74, 71, 66, 87, 70, 71, 24, 3, 4, 28, 52, 25, 14, 24, 30, 7, 31, 98, 97, 111, 106, 81, 122, 103, 99, 107, 81, 99, 125, 79, 87, 85, 76, 99, 78, 89, 93, 79, 83, 82, 120, 100, 105, 107, 109, 101, 109, 102, 124, 87, 124, 113, 120, 109, 84, 81, 106, 89, 92, 70, 65, 80, 91, 80, 71, 106, 70, 80, 65, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 82, 110, 98, 105, 104, 35, 52, 48, 34, 62, 63, 67, 70, 125, 81, 75, 88, 71, 125, 117, 99, 99, 113, 119, 117, 0, 9, 27, 55, 11, 7, 6, 28, 26, 7, 4, 4, 13, 26, 41, 62, 42, 46, 62, 40, 47, 4, 50, 63, 96, 105, 123, 87, 106, 97, 108, 1, 2, 12, 9, 4, 3, 10, 50, 12, 9, 12, 29, 25, 8, 31, 101, 103, 106, 106, 89, 111, 97, 104, 105, 116, 99, 98, 116, 104, 101, 103, 97, 105, 97, 106, 112, 91, 109, 96, 39, 47, 46, 35, 43, 62, 35, 37, 36, 21, 37, 60, 47, 56, 38, 43, 51, 21, 57, 47, 62, 79, 85, 121, 86, 83, 68, 74, 79, 69, 75, 84, 78, 84, 95, 84, 81, 84, 73, 68, 71, 80, 80, 77, 80, 125, 79, 71, 81, 81, 67, 69, 71, 126, 119, 101, 73, 97, 115, 116, 96, Byte.MAX_VALUE, 115, 97, 42, 35, 49, 29, 46, 43, 49, 54, 39, 44, 39, 48, 3, 14, 91, 68, 72, 90, 114, 89, 84, 93, 72, 41, 43, 60, 33, 62, 33, 60, 49, 23, 39, 42, 34, 45, 43, 60, 23, 33, 44};
    }
}
