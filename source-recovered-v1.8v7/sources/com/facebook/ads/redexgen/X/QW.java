package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum QW {
    A08(A00(17, 13, 90), QY.A02, true),
    A07(A00(98, 17, 44), QY.A03, true),
    A06(A00(67, 14, 84), QY.A03, false),
    A09(A00(158, 23, 26), QY.A03, false),
    A0A(A00(145, 13, 35), QY.A03, true),
    A05(A00(0, 17, 43), QY.A03, false);

    public static byte[] A03;
    public QY A00;
    public String A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{98, 105, 100, 100, 101, 114, 95, 116, 111, 107, 101, 110, 95, 105, 110, 102, 111, 1, 29, 16, 18, 20, 28, 20, 31, 5, 92, 24, 21, 2, 117, 118, 114, 103, 102, 97, 118, 108, 112, 124, 125, 117, 122, 116, 109, 111, 120, 123, 120, 105, 126, 117, 120, 121, 98, 124, 121, 98, 111, 120, 110, 109, 114, 115, 110, 120, 110, 25, 26, 30, 11, 10, 13, 26, 82, 28, 16, 17, 25, 22, 24, 98, 105, 100, 100, 101, 114, Byte.MAX_VALUE, 116, 111, 107, 101, 110, Byte.MAX_VALUE, 105, 110, 102, 111, 119, 107, 102, 100, 98, 106, 98, 105, 115, 42, 97, 104, 117, 106, 102, 115, 116, 85, 87, 64, 67, 64, 81, 70, 77, 90, 80, 87, 73, 86, 35, 63, 50, 48, 54, 62, 54, 61, 39, 44, 53, 60, 33, 62, 50, 39, 32, 120, 122, 109, 110, 109, 124, 107, 96, 87, 125, 122, 100, 123, 65, 67, 84, 87, 84, 69, 82, 89, 84, 85, 28, 80, 85, 28, 67, 84, 66, 65, 94, 95, 66, 84, 66, 15, 19, 30, 28, 26, 18, 26, 17, 11, 0, 22, 27, 12};
    }

    static {
        A01();
    }

    QW(String str, QY qy, boolean z) {
        this.A01 = str;
        this.A00 = qy;
        this.A02 = z;
    }

    public final QY A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A01;
    }

    public final boolean A04() {
        return this.A02;
    }
}
