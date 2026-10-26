package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9E {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{80, 67, 65, 77, 80, 66, 61, 66, 63, 82, 63, 64, 63, 81, 67};
    }

    static {
        A03();
        A01 = C9E.class.getSimpleName();
    }

    public static C9G A00(XJ xj) {
        try {
            return new C0939Xv(xj);
        } catch (IOException e) {
            xj.A04().A83(A02(0, 15, 111), C03008a.A1n, new C03018b(e));
            return new C0936Xs();
        }
    }

    public static EO A01(XJ xj) {
        return new EO(xj);
    }
}
