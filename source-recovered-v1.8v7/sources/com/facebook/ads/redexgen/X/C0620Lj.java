package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.StringTokenizer;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0620Lj {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{126, -111, -111, -111};
    }

    public static String A01(String str) {
        String strA00 = null;
        StringTokenizer stringTokenizer = null;
        int i = 0;
        int i2 = 0;
        int length = 0;
        String str2 = str;
        int index = str != null ? 2 : 10;
        while (true) {
            switch (index) {
                case 2:
                    str = str;
                    String truncatedBody = A00(0, 1, 33);
                    stringTokenizer = new StringTokenizer(str, truncatedBody, true);
                    i = 0;
                    int index2 = str.length();
                    i2 = 90;
                    if (index2 <= 90) {
                        index = 10;
                        break;
                    } else {
                        index = 3;
                        break;
                    }
                case 3:
                    str = str;
                    int length2 = str.length();
                    strA00 = A00(1, 3, 38);
                    if (length2 > 93) {
                        index = 5;
                        break;
                    } else {
                        index = 4;
                        break;
                    }
                case 4:
                    str = str;
                    strA00 = strA00;
                    if (!str.endsWith(strA00)) {
                        index = 5;
                        break;
                    } else {
                        index = 10;
                        break;
                    }
                case 5:
                    stringTokenizer = stringTokenizer;
                    if (!stringTokenizer.hasMoreTokens()) {
                        index = 8;
                        break;
                    } else {
                        index = 6;
                        break;
                    }
                case 6:
                    stringTokenizer = stringTokenizer;
                    String truncatedBody2 = stringTokenizer.nextToken();
                    length = truncatedBody2.length();
                    if (i + length >= i2) {
                        index = 5;
                        break;
                    } else {
                        index = 7;
                        break;
                    }
                case 7:
                    i += length;
                    index = 5;
                    break;
                case 8:
                    if (i != 0) {
                        index = 11;
                        break;
                    } else {
                        index = 9;
                        break;
                    }
                case 9:
                    str = str;
                    strA00 = strA00;
                    str2 = str.substring(0, i2) + strA00;
                    index = 10;
                    break;
                case 10:
                    return str2;
                case 11:
                    str = str;
                    strA00 = strA00;
                    str2 = str.substring(0, i) + strA00;
                    index = 10;
                    break;
            }
        }
    }
}
