package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class QD {
    public static byte[] A07;
    public Q4 A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A07 = new byte[]{54, 26, 3, 18, 22, 14, 22, 91, 9, 30, 15, 9, 18, 30, 8, 91, 22, 14, 8, 15, 91, 25, 30, 91, 25, 30, 15, 12, 30, 30, 21, 91, 74, 91, 26, 21, 31, 91, 74, 67};
    }

    public final QD A02(int i) {
        this.A00 = i;
        return this;
    }

    public final QD A03(int i) {
        char c2 = i >= 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (i > 18) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    QD qd = this;
                    qd.A01 = i;
                    return qd;
                case 4:
                    throw new IllegalArgumentException(A00(0, 40, 106));
            }
        }
    }

    public final QD A04(int i) {
        this.A02 = i;
        return this;
    }

    public final QD A05(int i) {
        this.A03 = i;
        return this;
    }

    public final QD A06(int i) {
        this.A04 = i;
        return this;
    }

    public final QD A07(Q4 q4) {
        this.A05 = q4;
        return this;
    }

    public final QD A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final QE A09() {
        return new QE(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
