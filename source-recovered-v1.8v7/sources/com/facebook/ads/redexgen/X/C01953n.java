package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01953n {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C4Y A04;
    public C4Y A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{-57, -69, 1, 13, 10, 8, -12, -40, -126, 118, -60, -69, -51, -98, -59, -62, -70, -69, -56, -109, -101, -64, -71, -58, -65, -67, -95, -58, -66, -57, -45, -57, -60, -68, -96, -57, -60, -68, -67, -54, -107, -38, -50, 20, 32, 29, 27, 6, -21, -37, -49, 35, 30, 8, -20, -89, -101, -17, -22, -45, -72};
    }

    public C01953n(C4Y c4y, C4Y c4y2) {
        this.A05 = c4y;
        this.A04 = c4y2;
    }

    public C01953n(C4Y c4y, C4Y c4y2, int i, int i2, int i3, int i4) {
        this(c4y, c4y2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        return A00(20, 21, 39) + this.A05 + A00(8, 12, 37) + this.A04 + A00(41, 8, 125) + this.A00 + A00(0, 8, 106) + this.A01 + A00(55, 6, 74) + this.A02 + A00(49, 6, 126) + this.A03 + '}';
    }
}
