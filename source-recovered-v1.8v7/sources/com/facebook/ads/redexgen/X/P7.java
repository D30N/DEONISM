package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum P7 {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{121, 102, 106, 120, 110, 109, 99, 106, 112, 102, 98, Byte.MAX_VALUE, 125, 106, 124, 124, 102, 96, 97, 103, 124, Byte.MAX_VALUE, 103, 102, 119, 74, 85, 68, 113, 102, 112, 118, 110, 102, 52, 44, 46, 55, 126, 111, 123, 125, 107, 40, 53, 49, 57, 60, 36, 37, 52, 71, 91, 86, 78};
    }

    static {
        A01();
    }

    P7(int i) {
        this.A00 = i;
    }
}
