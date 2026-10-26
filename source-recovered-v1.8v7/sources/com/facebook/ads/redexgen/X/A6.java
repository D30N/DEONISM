package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: assets/audience_network.dex */
public final class A6 {
    public static String A00;
    public static byte[] A01;
    public static final HashSet<String> A02;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{120, 112, 112, 120, 49, 122, 103, 112, 49, 124, 112, 109, 122};
    }

    static {
        A02();
        A02 = new HashSet<>();
        A00 = A01(0, 13, 55);
    }

    public static synchronized String A00() {
        return A00;
    }
}
