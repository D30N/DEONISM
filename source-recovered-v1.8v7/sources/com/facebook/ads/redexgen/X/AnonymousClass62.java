package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass62 {
    A03(A00(129, 14, 29)),
    A09(A00(239, 19, 43)),
    A05(A00(294, 15, 86)),
    A06(A00(0, 38, 62)),
    A08(A00(38, 37, 102)),
    A04(A00(180, 40, 67)),
    A07(A00(336, 13, 45));

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{85, 72, 95, 80, 92, 88, 82, 110, 66, 88, 86, 95, 80, 93, 110, 82, 88, 67, 68, 82, 68, 93, 80, 67, 110, 83, 68, 87, 87, 84, 67, 110, 93, 84, 95, 86, 69, 89, 26, 29, 8, 29, 0, 10, 54, 26, 0, 14, 7, 8, 5, 54, 10, 0, 27, 28, 10, 28, 5, 8, 27, 54, 11, 28, 15, 15, 12, 27, 54, 5, 12, 7, 14, 29, 1, 91, 80, 86, 84, 92, 77, 75, 80, 90, 70, 74, 80, 94, 87, 88, 85, 70, 90, 80, 75, 90, 76, 85, 88, 75, 70, 91, 76, 95, 95, 92, 75, 70, 85, 92, 87, 94, 77, 81, 116, 99, 112, 112, 115, 100, 105, 117, 119, 102, 119, 117, Byte.MAX_VALUE, 98, 111, 115, 98, 98, 77, 97, 119, 97, 97, 123, 125, 124, 77, 123, 118, 72, 85, 66, 77, 65, 69, 79, 83, 95, 69, 75, 66, 77, 64, 83, 79, 69, 94, 79, 89, 64, 77, 94, 83, 78, 89, 74, 74, 73, 94, 83, 64, 73, 66, 75, 88, 68, 46, 37, 35, 33, 41, 56, 62, 37, 47, 19, 63, 37, 43, 34, 45, 32, 19, 47, 37, 62, 57, 47, 57, 32, 45, 62, 19, 46, 57, 42, 42, 41, 62, 19, 32, 41, 34, 43, 56, 36, 52, 41, 45, 37, 50, 63, 41, 46, 52, 37, 50, 54, 33, 44, 63, 52, 41, 45, 37, 80, 77, 73, 65, 86, 123, 77, 74, 80, 65, 86, 82, 69, 72, 123, 80, 77, 73, 65, 102, 97, 116, 97, 124, 118, 106, 102, 124, 114, 123, 116, 121, 106, 118, 124, 103, 118, 96, 121, 116, 103, 106, 119, 96, 115, 115, 112, 103, 106, 121, 112, 123, 114, 97, 125, 59, 44, 63, 63, 60, 43, 6, 58, 56, 41, 56, 58, 48, 45, 32, 68, 94, 80, 89, 86, 91, 72, 84, 88, 89, 81, 94, 80, 2, 19, 19, 28, 16, 6, 16, 16, 10, 12, 13, 28, 10, 7, 81, 75, 69, 76, 67, 78, 125, 65, 77, 76, 68, 75, 69};
    }

    static {
        A01();
    }

    AnonymousClass62(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
