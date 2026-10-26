package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Qc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0741Qc {
    A03(A01(37, 3, 127)),
    A04(A01(0, 7, 92));

    public static byte[] A01;
    public String A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{114, 105, 108, 105, 104, 112, 105, 77, 106, 114, 101, 104, 109, 96, 36, 119, 97, 118, 114, 97, 118, 36, 118, 97, 119, 116, 107, 106, 119, 97, 62, 36, 33, 119, 8, 10, 2, 69, 71, 79, 29, 6, 3, 6, 7, 31, 6};
    }

    static {
        A02();
    }

    EnumC0741Qc(String str) {
        this.A00 = str;
    }

    public static EnumC0741Qc A00(String str) {
        EnumC0741Qc enumC0741Qc = null;
        EnumC0741Qc[] enumC0741QcArrValues = values();
        int length = enumC0741QcArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    enumC0741QcArrValues = enumC0741QcArrValues;
                    enumC0741Qc = enumC0741QcArrValues[i];
                    if (!enumC0741Qc.A00.equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return enumC0741Qc;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    throw new IllegalArgumentException(String.format(Locale.US, A01(7, 27, 95), str));
            }
        }
    }
}
