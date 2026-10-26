package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum KB {
    A08(0),
    A0C(4),
    A0A(5),
    A0B(6),
    A09(7),
    A0F(100),
    A0D(101),
    A0G(102),
    A0E(103),
    A06(200),
    A05(500),
    A04(201),
    A07(400),
    A03(300);

    public static byte[] A01;
    public final int A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{10, 24, 31, 11, 20, 24, 10, 2, 31, 28, 19, 19, 24, 15, 2, 104, 109, 1, 14, 27, 6, 25, 10, 16, 13, 14, 1, 1, 10, 29, 81, 67, 68, 80, 79, 67, 81, 89, 79, 72, 82, 67, 84, 85, 82, 79, 82, 79, 71, 74, 89, 78, 73, 84, 79, 92, 73, 72, 82, 71, 74, 86, 89, 76, 81, 78, 93, 71, 42, 45, 40, 80, 66, 69, 81, 78, 66, 80, 88, 69, 70, 73, 73, 66, 85, 88, 62, 55, 3, 17, 22, 2, 29, 17, 3, 11, 29, 26, 0, 17, 6, 7, 0, 29, 0, 29, 21, 24, 11, 0, 21, 22, 24, 17, 0, 36, 54, 49, 37, 58, 54, 36, 44, 58, 61, 39, 54, 33, 32, 39, 58, 39, 58, 50, 63, 44, 37, 54, 33, 39, 58, 48, 50, 63, 113, 118, 107, 108, 106, 125, 121, 117, 103, 110, 113, 124, 125, 119, 18, 0, 7, 19, 12, 0, 18, 26, 7, 4, 11, 11, 0, 23, 26, 9, 0, 2, 4, 6, 28, 64, 82, 85, 65, 94, 82, 64, 72, 85, 86, 89, 89, 82, 69, 72, 37, 34, 39, 61, 42, 56, 46, 61, 43, 42, 43, 48, 57, 38, 43, 42, 32, 55, 56, 45, 48, 47, 60, 38, 44, 55, 50, 55, 54, 46, 55, 15, 29, 26, 14, 17, 29, 15, 7, 17, 22, 12, 29, 10, 11, 12, 17, 12, 17, 25, 20, 7, 13, 22, 19, 22, 23, 15, 22, 79, 84, 81, 84, 85, 77, 84};
    }

    static {
        A02();
    }

    KB(int i) {
        this.A00 = i;
    }

    @Nullable
    public static KB A00(int i) {
        KB kb = null;
        KB[] kbArrValues = values();
        int length = kbArrValues.length;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    kbArrValues = kbArrValues;
                    kb = kbArrValues[i2];
                    if (kb.A00 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return kb;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return (KB) null;
            }
        }
    }

    public final int A03() {
        return this.A00;
    }
}
