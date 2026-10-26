package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02726o {
    A07(0),
    A05(1),
    A06(2),
    A04(3),
    A03(4);

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-22, -21, -5, -20, -31, -18, -23, -27, -17, -17, -27, -21, -22, -107, -100, -109, -109, -110, -109, -104, -93, -105, -103, -108, -108, -109, -106, -104, -119, -120, -82, -89, -92, -89, -88, -80, -89, -39, -38, -33, -22, -44, -40, -37, -41, -48, -40, -48, -39, -33, -48, -49};
    }

    static {
        A01();
    }

    EnumC02726o(int i) {
        this.A00 = i;
    }

    public final int A02() {
        return this.A00;
    }
}
