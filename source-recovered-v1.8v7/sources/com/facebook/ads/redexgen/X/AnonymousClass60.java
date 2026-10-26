package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.60, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass60 {
    A04(A00(24, 4, 5)),
    A03(A00(0, 5, 102)),
    A05(A00(5, 7, 48));

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{62, 41, 41, 52, 41, 122, 108, Byte.MAX_VALUE, 99, 100, 99, 106, 117, 99, 112, 108, 107, 108, 101, 18, 5, 5, 24, 5, 81, 86, 94, 87, 105, 110, 102, 111};
    }

    static {
        A01();
    }

    AnonymousClass60(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
