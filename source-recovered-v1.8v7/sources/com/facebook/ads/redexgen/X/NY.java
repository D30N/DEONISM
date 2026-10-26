package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class NY {
    public static byte[] A02;
    public boolean A00 = true;
    public final C1011aJ A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 111);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{77, 66, 66, 109, 122, 94, 105, Byte.MAX_VALUE, 124, 99, 98, Byte.MAX_VALUE, 105, 73, 98, 104, 54, 51, 60, 60, 19, 4, 54, 29, 31, 49, 29, 28, 6, 23, 28, 6, 62, 29, 19, 22, 23, 22, 72, 67, 76, 76, 99, 116, 78, 109, 99, 102, 71, 116, 103, 108, 118, 71, 108, 102, 56, 61, 36, 34, 47, 99, 99, 45, 62, 37, 40, 63, 34, 36, 37, 99, 98, 107, 48, 63, 57, 50, 107, 48, 107, 107, 34, 45, 107, 99, 106, 60, 34, 37, 47, 36, 60, 101, 59, 46, 57, 45, 36, 57, 38, 42, 37, 40, 46, 107, 55, 55, 107, 106, 60, 34, 37, 47, 36, 60, 101, 59, 46, 57, 45, 36, 57, 38, 42, 37, 40, 46, 101, 63, 34, 38, 34, 37, 44, 107, 55, 55, 107, 106, 47, 36, 40, 62, 38, 46, 37, 63, 107, 55, 55, 107, 107, 107, 107, 107, 107, 107, 106, 47, 36, 40, 62, 38, 46, 37, 63, 101, 41, 36, 47, 50, 107, 55, 55, 107, 47, 36, 40, 62, 38, 46, 37, 63, 101, 41, 36, 47, 50, 101, 56, 40, 57, 36, 39, 39, 3, 46, 34, 44, 35, 63, 107, 119, 118, 107, 123, 107, 55, 55, 107, 107, 107, 107, 107, 107, 107, 106, 47, 36, 40, 62, 38, 46, 37, 63, 101, 41, 36, 47, 50, 101, 40, 35, 34, 39, 47, 57, 46, 37, 107, 55, 55, 107, 47, 36, 40, 62, 38, 46, 37, 63, 101, 41, 36, 47, 50, 101, 40, 35, 34, 39, 47, 57, 46, 37, 101, 39, 46, 37, 44, 63, 35, 107, 119, 107, 122, 98, 107, 48, 107, 107, 107, 107, 57, 46, 63, 62, 57, 37, 112, 107, 107, 54, 107, 107, 61, 42, 57, 107, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 107, 118, 107, 60, 34, 37, 47, 36, 60, 101, 59, 46, 57, 45, 36, 57, 38, 42, 37, 40, 46, 101, 63, 34, 38, 34, 37, 44, 112, 107, 107, 34, 45, 107, 99, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 101, 57, 46, 56, 59, 36, 37, 56, 46, 14, 37, 47, 107, 117, 107, 123, 98, 107, 48, 107, 107, 107, 107, 40, 36, 37, 56, 36, 39, 46, 101, 39, 36, 44, 99, 108, 10, 5, 5, 42, 61, 25, 46, 56, 59, 36, 37, 56, 46, 14, 37, 47, 113, 108, 96, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 101, 57, 46, 56, 59, 36, 37, 56, 46, 14, 37, 47, 98, 112, 107, 107, 54, 107, 107, 34, 45, 107, 99, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 101, 47, 36, 38, 8, 36, 37, 63, 46, 37, 63, 7, 36, 42, 47, 46, 47, 14, 61, 46, 37, 63, 24, 63, 42, 57, 63, 107, 117, 107, 123, 98, 107, 48, 107, 107, 107, 107, 40, 36, 37, 56, 36, 39, 46, 101, 39, 36, 44, 99, 108, 10, 5, 5, 42, 61, 15, 36, 38, 8, 36, 37, 63, 46, 37, 63, 7, 36, 42, 47, 46, 47, 113, 108, 107, 96, 107, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 101, 47, 36, 38, 8, 36, 37, 63, 46, 37, 63, 7, 36, 42, 47, 46, 47, 14, 61, 46, 37, 63, 24, 63, 42, 57, 63, 98, 112, 107, 107, 54, 107, 107, 34, 45, 107, 99, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 101, 39, 36, 42, 47, 14, 61, 46, 37, 63, 14, 37, 47, 107, 117, 107, 123, 98, 107, 48, 107, 107, 107, 107, 40, 36, 37, 56, 36, 39, 46, 101, 39, 36, 44, 99, 108, 10, 5, 5, 42, 61, 7, 36, 42, 47, 14, 61, 46, 37, 63, 14, 37, 47, 113, 108, 107, 96, 107, 37, 61, 63, 34, 38, 34, 37, 44, 20, 20, 42, 37, 20, 63, 101, 39, 36, 42, 47, 14, 61, 46, 37, 63, 14, 37, 47, 98, 112, 107, 107, 54, 54, 107, 40, 42, 63, 40, 35, 99, 46, 57, 57, 98, 107, 48, 107, 107, 40, 36, 37, 56, 36, 39, 46, 101, 39, 36, 44, 99, 108, 42, 37, 20, 37, 42, 61, 34, 44, 42, 63, 34, 36, 37, 20, 63, 34, 38, 34, 37, 44, 20, 46, 57, 57, 36, 57, 113, 108, 107, 96, 107, 46, 57, 57, 101, 38, 46, 56, 56, 42, 44, 46, 98, 112, 54, 54, 98, 99, 98, 98, 112};
    }

    public NY(C1011aJ c1011aJ) {
        this.A01 = c1011aJ;
    }

    public static long A00(String str, String str2) {
        Long lValueOf = null;
        String strSubstring = str.substring(str2.length());
        long jLongValue = -1;
        char c2 = TextUtils.isEmpty(strSubstring) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return jLongValue;
                case 3:
                    try {
                        strSubstring = strSubstring;
                        lValueOf = Long.valueOf(Long.parseLong(strSubstring));
                        if (lValueOf.longValue() >= 0) {
                            c2 = 7;
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        return jLongValue;
                    }
                case 7:
                    lValueOf = lValueOf;
                    jLongValue = lValueOf.longValue();
                    c2 = '\t';
                    break;
                case '\t':
                    return jLongValue;
            }
        }
    }

    public final void A03() {
        NY ny = this;
        char c2 = !ny.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ny = ny;
                    if (!ny.A01.canGoBack()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    ny = ny;
                    if (!ny.A01.canGoForward()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ny.A00 = false;
                    return;
                case 6:
                    ny.A01.A0E(A01(57, 726, 36));
                    return;
            }
        }
    }

    public final void A04(String str) {
        NY ny = this;
        String strA01 = null;
        String strA012 = null;
        String strA013 = null;
        char c2 = !ny.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    str = str;
                    strA01 = A01(0, 17, 99);
                    if (!str.startsWith(strA01)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ny = ny;
                    str = str;
                    strA01 = strA01;
                    ny.A01.A0D(A00(str, strA01));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    str = str;
                    strA013 = A01(17, 22, 29);
                    if (!str.startsWith(strA013)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ny = ny;
                    str = str;
                    strA013 = strA013;
                    ny.A01.A0B(A00(str, strA013));
                    c2 = 5;
                    break;
                case '\b':
                    str = str;
                    strA012 = A01(39, 18, 109);
                    if (!str.startsWith(strA012)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    ny = ny;
                    str = str;
                    strA012 = strA012;
                    ny.A01.A0C(A00(str, strA012));
                    c2 = 5;
                    break;
            }
        }
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
