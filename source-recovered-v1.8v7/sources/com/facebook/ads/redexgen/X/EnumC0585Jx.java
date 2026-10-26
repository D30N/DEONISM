package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0585Jx {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-105, -104, -103, -108, -88, -97, -89, -76, -77, 108, 99, 99};
    }

    static {
        A02();
    }

    public static VideoAutoplayBehavior A00(EnumC0585Jx enumC0585Jx) {
        int i = 0;
        char c2 = enumC0585Jx == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return VideoAutoplayBehavior.DEFAULT;
                case 3:
                    enumC0585Jx = enumC0585Jx;
                    i = C0584Jw.A00[enumC0585Jx.ordinal()];
                    if (i == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return VideoAutoplayBehavior.DEFAULT;
                case 7:
                    return VideoAutoplayBehavior.OFF;
                case '\b':
                    return VideoAutoplayBehavior.ON;
                case '\t':
                    return VideoAutoplayBehavior.DEFAULT;
            }
        }
    }
}
