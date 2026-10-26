package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class GQ {
    public static byte[] A04;
    public final int A00;
    public final int[] A01;
    public final String[] A02;
    public final String[] A03;

    static {
        A03();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A04 = new byte[]{-113, -102, -45, -14, -1, -11, 8, -6, -11, 5, -7, -107, -96, -95, -44, -37, Byte.MIN_VALUE, -91, -83, -104, -93, -96, -101, 87, -85, -100, -92, -89, -93, -104, -85, -100, 113, 87, -102, -63, -71, -82, -79, -66, 68, 68, -35, -16, -5, -3, -16, -2, -16, -7, -1, -20, -1, -12, -6, -7, -44, -49, 76, -34, -13, -9, -17};
    }

    public GQ(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.A03 = strArr;
        this.A01 = iArr;
        this.A02 = strArr2;
        this.A00 = i;
    }

    public static int A00(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String[] strArr3 = strArr;
        String str2 = str;
        int[] iArr2 = iArr;
        String[] strArr4 = strArr2;
        int identifierCount = 0;
        int secondIndex = 0;
        int iIndexOf = 0;
        String identifier = null;
        String formatTag = null;
        int i = 0;
        int iIndexOf2 = 0;
        int i2 = 0;
        String strSubstring = null;
        int iIndexOf3 = 0;
        String strA02 = null;
        String strA022 = A02(15, 0, 78);
        strArr3[0] = strA022;
        int length = 0;
        int i3 = 0;
        int dollarIndex = 2;
        while (true) {
            switch (dollarIndex) {
                case 2:
                    str2 = str2;
                    int dollarIndex2 = str2.length();
                    if (length >= dollarIndex2) {
                        dollarIndex = 33;
                        break;
                    } else {
                        dollarIndex = 3;
                        break;
                    }
                case 3:
                    str2 = str2;
                    identifier = A02(58, 1, 16);
                    iIndexOf2 = str2.indexOf(identifier, length);
                    i = -1;
                    if (iIndexOf2 != -1) {
                        dollarIndex = 5;
                        break;
                    } else {
                        dollarIndex = 4;
                        break;
                    }
                case 4:
                    str2 = str2;
                    strArr3 = strArr3;
                    strArr3[i3] = strArr3[i3] + str2.substring(length);
                    length = str2.length();
                    dollarIndex = 2;
                    break;
                case 5:
                    if (iIndexOf2 == length) {
                        dollarIndex = 7;
                        break;
                    } else {
                        dollarIndex = 6;
                        break;
                    }
                case 6:
                    str2 = str2;
                    strArr3 = strArr3;
                    strArr3[i3] = strArr3[i3] + str2.substring(length, iIndexOf2);
                    length = iIndexOf2;
                    dollarIndex = 2;
                    break;
                case 7:
                    str2 = str2;
                    if (!str2.startsWith(A02(40, 2, 8), length)) {
                        dollarIndex = 9;
                        break;
                    } else {
                        dollarIndex = 8;
                        break;
                    }
                case 8:
                    strArr3 = strArr3;
                    identifier = identifier;
                    strArr3[i3] = strArr3[i3] + identifier;
                    length += 2;
                    dollarIndex = 2;
                    break;
                case 9:
                    str2 = str2;
                    identifier = identifier;
                    iIndexOf = str2.indexOf(identifier, length + 1);
                    strSubstring = str2.substring(length + 1, iIndexOf);
                    i2 = 1;
                    if (!strSubstring.equals(A02(42, 16, k.AppCompatTheme_windowActionBar))) {
                        dollarIndex = 12;
                        break;
                    } else {
                        dollarIndex = 10;
                        break;
                    }
                case 10:
                    iArr2 = iArr2;
                    iArr2[i3] = i2;
                    dollarIndex = 11;
                    break;
                case 11:
                    strArr3 = strArr3;
                    strA022 = strA022;
                    i3++;
                    strArr3[i3] = strA022;
                    length = iIndexOf + 1;
                    dollarIndex = 2;
                    break;
                case 12:
                    strSubstring = strSubstring;
                    iIndexOf3 = strSubstring.indexOf(A02(0, 2, 82));
                    formatTag = A02(11, 4, 88);
                    if (iIndexOf3 == i) {
                        dollarIndex = 16;
                        break;
                    } else {
                        dollarIndex = 13;
                        break;
                    }
                case 13:
                    strSubstring = strSubstring;
                    formatTag = strSubstring.substring(iIndexOf3);
                    strA02 = A02(15, 1, 95);
                    if (!formatTag.endsWith(strA02)) {
                        dollarIndex = 14;
                        break;
                    } else {
                        dollarIndex = 15;
                        break;
                    }
                case 14:
                    strA02 = strA02;
                    formatTag = formatTag + strA02;
                    dollarIndex = 15;
                    break;
                case 15:
                    strSubstring = strSubstring.substring(0, iIndexOf3);
                    dollarIndex = 16;
                    break;
                case 16:
                    strSubstring = strSubstring;
                    secondIndex = strSubstring.hashCode();
                    identifierCount = 2;
                    if (secondIndex == -1950496919) {
                        dollarIndex = 30;
                        break;
                    } else {
                        dollarIndex = 17;
                        break;
                    }
                case 17:
                    if (secondIndex == 2606829) {
                        dollarIndex = 28;
                        break;
                    } else {
                        dollarIndex = 18;
                        break;
                    }
                case 18:
                    if (secondIndex == 38199441) {
                        dollarIndex = 26;
                        break;
                    } else {
                        dollarIndex = 19;
                        break;
                    }
                case 19:
                    if (i == 0) {
                        dollarIndex = 25;
                        break;
                    } else {
                        dollarIndex = 20;
                        break;
                    }
                case 20:
                    if (i == i2) {
                        dollarIndex = 24;
                        break;
                    } else {
                        dollarIndex = 21;
                        break;
                    }
                case 21:
                    if (i != identifierCount) {
                        dollarIndex = 32;
                        break;
                    } else {
                        dollarIndex = 22;
                        break;
                    }
                case 22:
                    iArr2 = iArr2;
                    iArr2[i3] = 4;
                    dollarIndex = 23;
                    break;
                case 23:
                    strArr4 = strArr4;
                    formatTag = formatTag;
                    strArr4[i3] = formatTag;
                    dollarIndex = 11;
                    break;
                case 24:
                    iArr2 = iArr2;
                    iArr2[i3] = 3;
                    dollarIndex = 23;
                    break;
                case 25:
                    iArr2 = iArr2;
                    iArr2[i3] = identifierCount;
                    dollarIndex = 23;
                    break;
                case 26:
                    strSubstring = strSubstring;
                    if (!strSubstring.equals(A02(2, 9, k.AppCompatTheme_windowFixedWidthMinor))) {
                        dollarIndex = 19;
                        break;
                    } else {
                        dollarIndex = 27;
                        break;
                    }
                case 27:
                    i = 1;
                    dollarIndex = 19;
                    break;
                case 28:
                    strSubstring = strSubstring;
                    if (!strSubstring.equals(A02(59, 4, k.AppCompatTheme_viewInflaterClass))) {
                        dollarIndex = 19;
                        break;
                    } else {
                        dollarIndex = 29;
                        break;
                    }
                case 29:
                    i = 2;
                    dollarIndex = 19;
                    break;
                case 30:
                    strSubstring = strSubstring;
                    if (!strSubstring.equals(A02(34, 6, 52))) {
                        dollarIndex = 19;
                        break;
                    } else {
                        dollarIndex = 31;
                        break;
                    }
                case 31:
                    i = 0;
                    dollarIndex = 19;
                    break;
                case 32:
                    throw new IllegalArgumentException(A02(16, 18, 31) + str2);
                case 33:
                    return i3;
            }
        }
    }

    public static GQ A01(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new GQ(strArr, iArr, strArr2, A00(str, strArr, iArr, strArr2));
    }

    public final String A04(String str, long j, int i, long j2) {
        GQ gq = this;
        int i2 = 0;
        int i3 = 0;
        int[] iArr = null;
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    gq = gq;
                    i2 = gq.A00;
                    if (i4 >= i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    gq = gq;
                    sb = sb;
                    sb.append(gq.A03[i4]);
                    iArr = gq.A01;
                    i3 = 1;
                    if (iArr[i4] != 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    sb = sb;
                    sb.append(str);
                    c2 = 5;
                    break;
                case 5:
                    i4++;
                    c2 = 2;
                    break;
                case 6:
                    iArr = iArr;
                    if (iArr[i4] != 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    gq = gq;
                    sb = sb;
                    Locale locale = Locale.US;
                    String str2 = gq.A02[i4];
                    Object[] objArr = new Object[i3];
                    objArr[0] = Long.valueOf(j);
                    sb.append(String.format(locale, str2, objArr));
                    c2 = 5;
                    break;
                case '\b':
                    iArr = iArr;
                    if (iArr[i4] != 3) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    gq = gq;
                    sb = sb;
                    Locale locale2 = Locale.US;
                    String str3 = gq.A02[i4];
                    Object[] objArr2 = new Object[i3];
                    objArr2[0] = Integer.valueOf(i);
                    sb.append(String.format(locale2, str3, objArr2));
                    c2 = 5;
                    break;
                case '\n':
                    iArr = iArr;
                    if (iArr[i4] != 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    gq = gq;
                    sb = sb;
                    Locale locale3 = Locale.US;
                    String str4 = gq.A02[i4];
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = Long.valueOf(j2);
                    sb.append(String.format(locale3, str4, objArr3));
                    c2 = 5;
                    break;
                case '\f':
                    StringBuilder sb2 = sb;
                    sb2.append(gq.A03[i2]);
                    return sb2.toString();
            }
        }
    }
}
