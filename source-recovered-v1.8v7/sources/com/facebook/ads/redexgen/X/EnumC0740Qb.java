package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0740Qb {
    A04(A00(10, 7, 125)),
    A03(A00(0, 10, k.AppCompatTheme_windowActionBar));

    public static byte[] A01;
    public String A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-16, -15, -81, -27, -22, -29, -16, -23, -25, -11, -4, -2, -5, 2, -11, -16, -15, -55, -54, -38, -66, -61, -68, -55, -62, -64, -50, 124, 126, 123, -126, 117, 112, 113};
    }

    static {
        A01();
    }

    EnumC0740Qb(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
