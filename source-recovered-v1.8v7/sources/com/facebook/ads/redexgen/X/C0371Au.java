package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0371Au extends Exception {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-112, -45, -40, -47, -34, -34, -43, -36, -29, -112, -39, -34, -112, -43, -34, -45, -33, -44, -39, -34, -41, -112, -62, -37, -43, -50, -37, -47, -39, -46, -47, -115, -45, -36, -33, -38, -50, -31, -89, -115, -2, 38, 88, 10, -2};
    }

    public C0371Au(int i, int i2, int i3) {
        super(A00(22, 18, 9) + i + A00(40, 5, k.AppCompatTheme_windowMinWidthMajor) + i2 + A00(0, 22, 12) + i3);
    }
}
