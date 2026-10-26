package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0A {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{73};
    }

    private String A01(String str) {
        String strA00 = null;
        int iLastIndexOf = str.lastIndexOf(46);
        int iLastIndexOf2 = str.lastIndexOf(47);
        char c2 = iLastIndexOf != -1 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (iLastIndexOf <= iLastIndexOf2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (iLastIndexOf + 2 + 4 <= str.length()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    strA00 = str.substring(iLastIndexOf + 1, str.length());
                    c2 = 5;
                    break;
                case 5:
                    return strA00;
                case 6:
                    strA00 = A00(0, 0, 91);
                    c2 = 5;
                    break;
            }
        }
    }

    public final String A03(String str) {
        String str2 = null;
        String strA01 = A01(str);
        String strA02 = C0J.A02(str);
        char c2 = TextUtils.isEmpty(strA01) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strA02 = strA02;
                    str2 = strA02;
                    c2 = 3;
                    break;
                case 3:
                    return str2;
                case 4:
                    strA01 = strA01;
                    strA02 = strA02;
                    str2 = strA02 + A00(0, 1, 16) + strA01;
                    c2 = 3;
                    break;
            }
        }
    }
}
