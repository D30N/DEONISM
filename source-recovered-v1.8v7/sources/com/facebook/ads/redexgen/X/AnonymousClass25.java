package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.25, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass25 {
    A05(A00(10, 6, 0)),
    A03(A00(6, 4, 70)),
    A04(A00(20, 4, 76));

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{25, 14, 27, 4, 25, 31, 107, 106, 103, 102, 55, 32, 53, 42, 55, 49, 29, 28, 29, 22, 103, 102, 103, 108, 58, 59, 54, 55};
    }

    static {
        A01();
    }

    AnonymousClass25(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
