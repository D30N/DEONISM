package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C8L {
    A08(9000, A00(k.AppCompatTheme_viewInflaterClass, 30, 84)),
    A06(AdError.MEDIATION_ERROR_CODE, A00(50, 29, 95)),
    A05(3002, A00(79, 35, 41)),
    A07(3003, A00(144, 33, 64)),
    A04(3004, A00(15, 35, 53));

    public static byte[] A02;
    public final int A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-57, -60, -41, -60, -59, -60, -42, -56, -30, -40, -45, -57, -60, -41, -56, -15, 12, 20, 23, 16, 15, -53, 31, 26, -53, 15, 16, 23, 16, 31, 16, -53, 29, 26, 34, -53, 17, 29, 26, 24, -53, 15, 12, 31, 12, 13, 12, 30, 16, -39, 27, 54, 62, 65, 58, 57, -11, 73, 68, -11, 71, 58, 54, 57, -11, 59, 71, 68, 66, -11, 57, 54, 73, 54, 55, 54, 72, 58, 3, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 8, 13, 18, 4, 17, 19, -65, 17, 14, 22, -65, 8, 13, 19, 14, -65, 3, 0, 19, 0, 1, 0, 18, 4, -51, 11, 56, -22, 63, 56, 53, 56, 57, 65, 56, -22, 47, 60, 60, 57, 60, -22, 50, 43, 61, -22, 57, 45, 45, 63, 60, 60, 47, 46, -8, -4, 23, 31, 34, 27, 26, -42, 42, 37, -42, 43, 38, 26, 23, 42, 27, -42, 40, 37, 45, -42, 31, 36, -42, 26, 23, 42, 23, 24, 23, 41, 27, -28, -6, -9, 10, -9, -8, -9, 9, -5, 21, -1, 4, 9, -5, 8, 10, 45, 42, 61, 42, 43, 42, 60, 46, 72, 45, 46, 53, 46, 61, 46, -48, -51, -32, -51, -50, -51, -33, -47, -21, -33, -47, -40, -47, -49, -32, 4, -3, -6, -3, -2, 6, -3};
    }

    static {
        A01();
    }

    C8L(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final int A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A01;
    }
}
