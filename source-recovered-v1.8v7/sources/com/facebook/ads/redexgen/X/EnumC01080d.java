package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC01080d {
    A08(A00(31, 5, 61)),
    A06(A00(0, 5, 6)),
    A03(A00(61, 8, 75)),
    A07(A00(14, 8, 15)),
    A05(A00(22, 9, k.AppCompatTheme_windowFixedWidthMinor)),
    A04(A00(5, 9, 84));

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{59, 63, 51, 53, 55, 100, 115, 108, 95, 105, 109, 97, 103, 101, 43, 55, 58, 34, 58, 57, 55, 62, 73, 94, 65, 114, 91, 68, 73, 72, 66, 31, 0, 13, 12, 6, 95, 72, 87, 68, 77, 82, 95, 94, 84, 112, 108, 97, 121, 97, 98, 108, 101, 21, 23, 4, 25, 3, 5, 19, 26, 124, 126, 109, 112, 106, 108, 122, 115, 76, 91, 68, 87, 65, 69, 73, 79, 77, 34, 38, 42, 44, 46, 4, 27, 22, 23, 29};
    }

    static {
        A01();
    }

    EnumC01080d(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
