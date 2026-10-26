package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0752Qn {
    A03(A00(0, 4, 47)),
    A04(A00(8, 6, 62));

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{35, 44, 41, 41, 63, 48, 53, 53, 33, 36, 48, 53, 32, 49, 63, 58, 46, 43, 62, 47};
    }

    static {
        A01();
    }

    EnumC0752Qn(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
