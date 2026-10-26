package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum P8 {
    A04(101),
    A07(102),
    A08(103),
    A05(104),
    A06(105),
    A03(106);

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-65, -74, -56, -48, -57, -70, -75, -74, -64, -48, -70, -65, -59, -74, -61, -60, -59, -70, -59, -70, -78, -67, -48, -65, -72, -59, -48, -77, -58, -59, -59, -64, -65, 62, 54, 52, 59, 74, 59, 55, 64, 50, 52, 57, 50, 65, 56, 56, 63, 47, 62, 49, 49, 58, 75, 66, 53, 48, 49, 59, 75, 66, 53, 49, 67, 75, 59, 58, 75, 48, 49, 63, 64, 62, 59, 69, -23, -36, -18, -40, -23, -37, -36, -37, -10, -19, -32, -37, -36, -26, -10, -21, -26, -26, -29, -39, -40, -23, -10, -38, -29, -26, -22, -36, -10, -38, -29, -32, -38, -30, -36, -37, 0, -9, 9, 17, 8, -5, -10, -9, 1, 17, -5, 0, 6, -9, 4, 5, 6, -5, 6, -5, -13, -2, 17, 6, 1, 1, -2, -12, -13, 4, 17, -11, -2, 1, 5, -9, 17, -11, -2, -5, -11, -3, -9, -10, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -4, -13, -26, -31, -30, -20, -4, -13, -26, -30, -12, -4, -31, -30, -16, -15, -17, -20, -10};
    }

    static {
        A01();
    }

    P8(int i) {
        this.A00 = i;
    }

    public final int A02() {
        return this.A00;
    }
}
