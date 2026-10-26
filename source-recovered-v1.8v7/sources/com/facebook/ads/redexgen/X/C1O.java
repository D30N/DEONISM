package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1O implements Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 56);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{-76, -15, -39, -21, -24, -24, -37, -28, -39, -17, -13, -57, -67, -63, -83, -70, -64, -75, -64, -59, -55};
    }

    public C1O(C1N c1n) {
        this.A02 = c1n.A02;
        this.A03 = c1n.A03;
        this.A00 = c1n.A00;
        this.A01 = c1n.A01;
    }

    public static String A01(String str, String str2, int i) {
        String quantityString = str.replace(A00(1, 10, 62), str2);
        String updatedString = A00(1, 0, 66);
        if (i > 0) {
            updatedString = i + A00(0, 1, 92);
        }
        return quantityString.replace(A00(11, 10, 20), updatedString);
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i) {
        return A01(this.A03, str, i);
    }
}
