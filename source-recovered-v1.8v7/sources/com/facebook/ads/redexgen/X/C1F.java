package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C1F {
    A03(A01(23, 14, 46)),
    A04(A01(14, 9, 9));

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-52, -40, -41, -35, -50, -31, -35, -34, -54, -43, -24, -54, -39, -39, -18, -33, -27, -29, -35, -18, -19, -15, -14, 6, 18, 17, 23, 8, 27, 23, 24, 4, 15, 2, 4, 19, 19, -27, -42, -36, -38, -12, -27, -28, -24, -23};
    }

    static {
        A02();
    }

    C1F(String str) {
        this.A00 = str;
    }

    public static C1F A00(String str) {
        char c2 = 0;
        int iHashCode = str.hashCode();
        char c3 = iHashCode != 883765328 ? (char) 2 : '\b';
        while (true) {
            switch (c3) {
                case 2:
                    if (iHashCode == 1434358835) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    c2 = 65535;
                    c3 = 4;
                    break;
                case 4:
                    if (c2 == 0) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    return A04;
                case 6:
                    str = str;
                    if (!str.equals(A01(23, 14, 46))) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    c2 = 0;
                    c3 = 4;
                    break;
                case '\b':
                    str = str;
                    if (!str.equals(A01(14, 9, 9))) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    c2 = 1;
                    c3 = 4;
                    break;
                case '\n':
                    return A03;
            }
        }
    }
}
