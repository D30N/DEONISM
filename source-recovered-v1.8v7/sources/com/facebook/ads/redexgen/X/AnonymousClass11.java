package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.11, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass11 {
    A03(A00(9, 9, 42)),
    A05(A00(65, 9, 0)),
    A04(A00(46, 19, 69));

    public static byte[] A01;
    public final String A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{39, 34, 34, 50, 38, 32, 20, 31, 31, 7, 28, 7, 15, 18, 7, 8, 18, 11, -47, -46, -30, -47, -60, -41, -52, -39, -56, -30, -60, -57, -30, -49, -60, -36, -46, -40, -41, 59, 80, 59, 67, 70, 59, 60, 70, 63, 47, 48, 32, 47, 34, 53, 42, 55, 38, 32, 34, 37, 32, 45, 34, 58, 48, 54, 53, -16, -21, -21, -37, -17, -23, -35, -24, -24};
    }

    static {
        A01();
    }

    AnonymousClass11(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
