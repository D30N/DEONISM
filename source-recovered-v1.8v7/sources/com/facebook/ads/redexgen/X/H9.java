package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H9 {
    public static byte[] A04;
    public static final String[] A05;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String[] A03;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 102);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A04 = new byte[]{-5, -32, -78};
    }

    static {
        A03();
        A05 = new String[0];
    }

    public H9(String str, int i, String str2, String[] strArr) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static H9 A00() {
        String strA02 = A02(1, 0, 97);
        return new H9(strA02, 0, strA02, new String[0]);
    }

    public static H9 A01(String str, int i) {
        int iIndexOf = 0;
        String[] nameAndClasses = null;
        String str2 = null;
        char c2 = 0;
        int i2 = 0;
        String[] strArrA0o = null;
        String strTrim = null;
        String strTrim2 = str.trim();
        char c3 = strTrim2.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    return (H9) null;
                case 3:
                    strTrim2 = strTrim2;
                    iIndexOf = strTrim2.indexOf(A02(0, 1, k.AppCompatTheme_windowActionModeOverlay));
                    c2 = 0;
                    if (iIndexOf != -1) {
                        c3 = '\t';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    strTrim = A02(1, 0, 97);
                    c3 = 5;
                    break;
                case 5:
                    strTrim2 = strTrim2;
                    strArrA0o = C0560Iy.A0o(strTrim2, A02(1, 2, 30));
                    str2 = strArrA0o[c2];
                    i2 = 1;
                    if (strArrA0o.length <= 1) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    strArrA0o = strArrA0o;
                    nameAndClasses = (String[]) Arrays.copyOfRange(strArrA0o, i2, strArrA0o.length);
                    c3 = 7;
                    break;
                case 7:
                    return new H9(str2, i, strTrim, nameAndClasses);
                case '\b':
                    nameAndClasses = A05;
                    c3 = 7;
                    break;
                case '\t':
                    String str3 = strTrim2;
                    c2 = 0;
                    strTrim = str3.substring(iIndexOf).trim();
                    strTrim2 = str3.substring(0, iIndexOf);
                    c3 = 5;
                    break;
            }
        }
    }
}
