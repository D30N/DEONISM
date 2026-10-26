package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum OW {
    A08(A01(207, 10, 103)),
    A0A(A01(47, 24, 60)),
    A03(A01(141, 13, 76)),
    A06(A01(77, 18, 29)),
    A05(A01(217, 19, 19)),
    A09(A01(0, 10, 64)),
    A0B(A01(173, 3, 4)),
    A04(A01(42, 5, 108)),
    A07(A01(71, 6, 4)),
    A0C(A01(126, 15, 6)),
    A0D(A01(42, 0, 32));

    public static byte[] A01;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{121, 125, 96, 98, 117, 99, 99, 121, Byte.MAX_VALUE, 126, 23, 20, 28, 126, 119, 120, 114, 122, 115, 105, 117, 98, 119, 90, 87, 77, 95, 92, 82, 91, 65, 92, 95, 93, 85, 65, 92, 75, 74, 74, 81, 80, 88, 89, 94, 73, 91, 0, 13, 25, 2, 15, 4, 51, 13, 8, 51, 30, 9, 28, 3, 30, 24, 5, 2, 11, 51, 10, 0, 3, 27, 50, 33, 58, 58, 49, 56, 40, 35, 44, 47, 33, 40, 18, 47, 44, 46, 38, 18, 47, 56, 57, 57, 34, 35, 46, 61, 38, 38, 45, 36, 115, 100, 118, 96, 115, 101, 126, 98, 110, 108, 113, 109, 100, 117, 100, Byte.MAX_VALUE, 123, 102, 100, 115, 101, 101, Byte.MAX_VALUE, 121, 120, 36, 51, 33, 55, 36, 50, 9, 53, 57, 59, 38, 58, 51, 34, 51, Byte.MAX_VALUE, 112, 115, 111, 121, 67, 126, 110, 115, 107, 111, 121, 110, 96, 109, 121, 98, 111, 100, 115, 109, 104, 115, 126, 105, 124, 99, 126, 120, 101, 98, 107, 56, 59, 51, 81, 94, 93, 65, 87, 77, 80, 64, 93, 69, 65, 87, 64, 90, 81, 94, 93, 83, 90, 64, 93, 94, 92, 84, 64, 93, 74, 75, 75, 80, 81, 95, 86, 89, 83, 91, 82, 104, 84, 67, 86, 39, 42, 48, 34, 33, 47, 38, 28, 33, 34, 32, 40, 28, 33, 54, 55, 55, 44, 45, 91, 90, 93, 74, 88, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
    }

    OW(String str) {
        this.A00 = str;
    }

    public static OW A00(String str) {
        OW ow = null;
        OW[] owArrValues = values();
        int length = owArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    owArrValues = owArrValues;
                    ow = owArrValues[i];
                    if (!ow.A00.equalsIgnoreCase(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return ow;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return A0D;
            }
        }
    }
}
