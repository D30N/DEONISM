package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class B5 extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{126, 114, 94, -56, -68, -33, 11, 10, 2, 5, 3, -60, 111, -93, -110, -105, -99, -126, -96, -113, -111, -103, 78, -105, -100, -105, -94, 78, -108, -113, -105, -102, -109, -110, 104, 78};
    }

    public B5(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(12, 24, 7));
        sb.append(i);
        sb.append(A00(3, 9, k.AppCompatTheme_windowActionModeOverlay));
        sb.append(i2);
        String strA00 = A00(0, 2, 43);
        sb.append(strA00);
        sb.append(i3);
        sb.append(strA00);
        sb.append(i4);
        sb.append(A00(2, 1, 14));
        super(sb.toString());
        this.A00 = i;
    }
}
