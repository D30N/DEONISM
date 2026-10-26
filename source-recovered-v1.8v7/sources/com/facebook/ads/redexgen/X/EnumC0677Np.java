package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0677Np {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowNoTitle);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{44, 33, 46, 36, 51, 35, 33, 48, 37, 61, 38, 59, 56, 45, 43, 33, 46, 33, 45, 44, 17, 14, 19, 21, 19, 0, 8, 21};
    }

    static {
        A02();
    }

    EnumC0677Np(int i) {
        this.A00 = i;
    }

    public static EnumC0677Np A00(int i) {
        EnumC0677Np enumC0677Np = null;
        EnumC0677Np[] enumC0677NpArrValues = values();
        int length = enumC0677NpArrValues.length;
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
                    enumC0677NpArrValues = enumC0677NpArrValues;
                    enumC0677Np = enumC0677NpArrValues[i2];
                    if (enumC0677Np.A00 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return enumC0677Np;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    EnumC0677Np orientation = A04;
                    return orientation;
            }
        }
    }

    public final int A03() {
        return this.A00;
    }
}
