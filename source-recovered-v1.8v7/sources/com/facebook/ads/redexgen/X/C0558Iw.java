package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0558Iw {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{54};
    }

    public static Uri A00(String str, String str2) {
        return Uri.parse(A02(str, str2));
    }

    public static String A02(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int iLastIndexOf = 0;
        int[] baseIndices = null;
        String str5 = null;
        int[] iArrA05 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        String str7 = null;
        int i3 = 0;
        int i4 = 0;
        char c2 = 0;
        char c3 = 0;
        int i5 = 0;
        StringBuilder sb = new StringBuilder();
        String strA01 = A01(0, 0, 18);
        int lastSlashIndex = str3 == null ? 2 : 7;
        while (true) {
            switch (lastSlashIndex) {
                case 2:
                    strA01 = strA01;
                    str6 = strA01;
                    lastSlashIndex = 3;
                    break;
                case 3:
                    str4 = str4;
                    str6 = str6;
                    str7 = str6;
                    if (str4 != null) {
                        lastSlashIndex = 6;
                        break;
                    } else {
                        lastSlashIndex = 4;
                        break;
                    }
                case 4:
                    strA01 = strA01;
                    str5 = strA01;
                    baseIndices = A05(str5);
                    i4 = 0;
                    i5 = -1;
                    i = 2;
                    i2 = 1;
                    if (baseIndices[0] == -1) {
                        lastSlashIndex = 8;
                        break;
                    } else {
                        lastSlashIndex = 5;
                        break;
                    }
                case 5:
                    StringBuilder sb2 = sb;
                    int[] iArr = baseIndices;
                    sb2.append(str5);
                    int i6 = iArr[i2];
                    int lastSlashIndex2 = iArr[i];
                    A03(sb2, i6, lastSlashIndex2);
                    return sb2.toString();
                case 6:
                    str4 = str4;
                    strA01 = str4;
                    lastSlashIndex = 4;
                    break;
                case 7:
                    str3 = str3;
                    str6 = str3;
                    lastSlashIndex = 3;
                    break;
                case 8:
                    str7 = str7;
                    baseIndices = baseIndices;
                    iArrA05 = A05(str7);
                    c2 = 3;
                    if (baseIndices[3] != 0) {
                        lastSlashIndex = 10;
                        break;
                    } else {
                        lastSlashIndex = 9;
                        break;
                    }
                case 9:
                    StringBuilder sb3 = sb;
                    int lastSlashIndex3 = iArrA05[c2];
                    sb3.append((CharSequence) str7, i4, lastSlashIndex3);
                    sb3.append(str5);
                    return sb3.toString();
                case 10:
                    baseIndices = baseIndices;
                    if (baseIndices[i] != 0) {
                        lastSlashIndex = 12;
                        break;
                    } else {
                        lastSlashIndex = 11;
                        break;
                    }
                case 11:
                    StringBuilder sb4 = sb;
                    int lastSlashIndex4 = iArrA05[i];
                    sb4.append((CharSequence) str7, i4, lastSlashIndex4);
                    sb4.append(str5);
                    return sb4.toString();
                case 12:
                    baseIndices = baseIndices;
                    if (baseIndices[i2] == 0) {
                        lastSlashIndex = 14;
                        break;
                    } else {
                        lastSlashIndex = 13;
                        break;
                    }
                case 13:
                    StringBuilder sb5 = sb;
                    int[] baseIndices2 = baseIndices;
                    int i7 = iArrA05[i4] + i2;
                    sb5.append((CharSequence) str7, i4, i7);
                    sb5.append(str5);
                    int i8 = baseIndices2[i2] + i7;
                    int lastSlashIndex5 = baseIndices2[i];
                    return A03(sb5, i8, lastSlashIndex5 + i7);
                case 14:
                    str5 = str5;
                    baseIndices = baseIndices;
                    c3 = '/';
                    if (str5.charAt(baseIndices[i2]) != '/') {
                        lastSlashIndex = 16;
                        break;
                    } else {
                        lastSlashIndex = 15;
                        break;
                    }
                case 15:
                    StringBuilder sb6 = sb;
                    int[] iArr2 = iArrA05;
                    int lastSlashIndex6 = iArr2[i2];
                    sb6.append((CharSequence) str7, i4, lastSlashIndex6);
                    sb6.append(str5);
                    int i9 = iArr2[i2];
                    int i10 = iArr2[i2];
                    int lastSlashIndex7 = baseIndices[i];
                    return A03(sb6, i9, i10 + lastSlashIndex7);
                case 16:
                    iArrA05 = iArrA05;
                    if (iArrA05[i4] + i >= iArrA05[i2]) {
                        lastSlashIndex = 19;
                        break;
                    } else {
                        lastSlashIndex = 17;
                        break;
                    }
                case 17:
                    iArrA05 = iArrA05;
                    if (iArrA05[i2] != iArrA05[i]) {
                        lastSlashIndex = 19;
                        break;
                    } else {
                        lastSlashIndex = 18;
                        break;
                    }
                case 18:
                    StringBuilder sb7 = sb;
                    int[] iArr3 = iArrA05;
                    int lastSlashIndex8 = iArr3[i2];
                    sb7.append((CharSequence) str7, i4, lastSlashIndex8);
                    sb7.append(c3);
                    sb7.append(str5);
                    int i11 = iArr3[i2];
                    int i12 = iArr3[i2];
                    int lastSlashIndex9 = baseIndices[i];
                    return A03(sb7, i11, i12 + lastSlashIndex9 + i2);
                case 19:
                    str7 = str7;
                    iArrA05 = iArrA05;
                    iLastIndexOf = str7.lastIndexOf(c3, iArrA05[i] - i2);
                    if (iLastIndexOf != i5) {
                        lastSlashIndex = 22;
                        break;
                    } else {
                        lastSlashIndex = 20;
                        break;
                    }
                case 20:
                    iArrA05 = iArrA05;
                    i3 = iArrA05[i2];
                    lastSlashIndex = 21;
                    break;
                case 21:
                    StringBuilder sb8 = sb;
                    sb8.append((CharSequence) str7, i4, i3);
                    sb8.append(str5);
                    int i13 = iArrA05[i2];
                    int lastSlashIndex10 = baseIndices[i];
                    return A03(sb8, i13, lastSlashIndex10 + i3);
                case 22:
                    i3 = iLastIndexOf + 1;
                    lastSlashIndex = 21;
                    break;
            }
        }
    }

    public static String A03(StringBuilder sb, int i, int i2) {
        int nextSegmentStart = 0;
        int prevSegmentStart = 0;
        int removeFrom = 0;
        int i3 = 0;
        int iLastIndexOf = 0;
        int i4 = 0;
        char c2 = 0;
        char c3 = i >= i2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    return sb.toString();
                case 3:
                    sb = sb;
                    nextSegmentStart = 47;
                    if (sb.charAt(i) != '/') {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    i++;
                    c3 = 5;
                    break;
                case 5:
                    i4 = i;
                    i3 = i;
                    c3 = 6;
                    break;
                case 6:
                    if (i3 > i2) {
                        c3 = 23;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    if (i3 != i2) {
                        c3 = 20;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    prevSegmentStart = i3;
                    c3 = '\t';
                    break;
                case '\t':
                    c2 = '.';
                    if (i3 != i4 + 1) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    sb = sb;
                    if (sb.charAt(i4) != c2) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    sb = sb;
                    sb.delete(i4, prevSegmentStart);
                    i2 -= prevSegmentStart - i4;
                    i3 = i4;
                    c3 = 6;
                    break;
                case '\f':
                    if (i3 != i4 + 2) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    sb = sb;
                    if (sb.charAt(i4) != c2) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    sb = sb;
                    if (sb.charAt(i4 + 1) != c2) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    sb = sb;
                    iLastIndexOf = sb.lastIndexOf(A01(0, 1, 57), i4 - 2) + 1;
                    if (iLastIndexOf <= i) {
                        c3 = 18;
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 16:
                    removeFrom = iLastIndexOf;
                    c3 = 17;
                    break;
                case 17:
                    sb = sb;
                    sb.delete(removeFrom, prevSegmentStart);
                    i2 -= prevSegmentStart - removeFrom;
                    i4 = iLastIndexOf;
                    i3 = iLastIndexOf;
                    c3 = 6;
                    break;
                case 18:
                    removeFrom = i;
                    c3 = 17;
                    break;
                case 19:
                    i3++;
                    i4 = i3;
                    c3 = 6;
                    break;
                case 20:
                    sb = sb;
                    if (sb.charAt(i3) != nextSegmentStart) {
                        c3 = 22;
                        break;
                    } else {
                        c3 = 21;
                        break;
                    }
                case 21:
                    prevSegmentStart = i3 + 1;
                    c3 = '\t';
                    break;
                case 22:
                    i3++;
                    c3 = 6;
                    break;
                case 23:
                    return sb.toString();
            }
        }
    }

    public static int[] A05(String str) {
        int length = 0;
        char c2 = 0;
        int iIndexOf = 0;
        int iIndexOf2 = 0;
        int queryIndex = 0;
        int pathIndex = 0;
        int iIndexOf3 = 0;
        int length2 = 0;
        int iIndexOf4 = 0;
        int[] iArr = new int[4];
        int schemeIndex = TextUtils.isEmpty(str) ? 2 : 3;
        while (true) {
            switch (schemeIndex) {
                case 2:
                    int[] iArr2 = iArr;
                    iArr2[0] = -1;
                    return iArr2;
                case 3:
                    str = str;
                    length2 = str.length();
                    iIndexOf4 = str.indexOf(35);
                    if (iIndexOf4 != -1) {
                        schemeIndex = 5;
                        break;
                    } else {
                        schemeIndex = 4;
                        break;
                    }
                case 4:
                    iIndexOf4 = length2;
                    schemeIndex = 5;
                    break;
                case 5:
                    str = str;
                    queryIndex = str.indexOf(63);
                    if (queryIndex == -1) {
                        schemeIndex = 7;
                        break;
                    } else {
                        schemeIndex = 6;
                        break;
                    }
                case 6:
                    if (queryIndex <= iIndexOf4) {
                        schemeIndex = 8;
                        break;
                    } else {
                        schemeIndex = 7;
                        break;
                    }
                case 7:
                    queryIndex = iIndexOf4;
                    schemeIndex = 8;
                    break;
                case 8:
                    str = str;
                    c2 = '/';
                    iIndexOf2 = str.indexOf(47);
                    if (iIndexOf2 == -1) {
                        schemeIndex = 10;
                        break;
                    } else {
                        schemeIndex = 9;
                        break;
                    }
                case 9:
                    if (iIndexOf2 <= queryIndex) {
                        schemeIndex = 11;
                        break;
                    } else {
                        schemeIndex = 10;
                        break;
                    }
                case 10:
                    iIndexOf2 = queryIndex;
                    schemeIndex = 11;
                    break;
                case 11:
                    str = str;
                    iIndexOf = str.indexOf(58);
                    if (iIndexOf <= iIndexOf2) {
                        schemeIndex = 13;
                        break;
                    } else {
                        schemeIndex = 12;
                        break;
                    }
                case 12:
                    iIndexOf = -1;
                    schemeIndex = 13;
                    break;
                case 13:
                    int schemeIndexLimit = iIndexOf + 2;
                    length = 1;
                    if (schemeIndexLimit >= queryIndex) {
                        schemeIndex = 23;
                        break;
                    } else {
                        schemeIndex = 14;
                        break;
                    }
                case 14:
                    str = str;
                    if (str.charAt(iIndexOf + 1) != c2) {
                        schemeIndex = 23;
                        break;
                    } else {
                        schemeIndex = 15;
                        break;
                    }
                case 15:
                    str = str;
                    if (str.charAt(iIndexOf + 2) != c2) {
                        schemeIndex = 23;
                        break;
                    } else {
                        schemeIndex = 16;
                        break;
                    }
                case 16:
                    pathIndex = 1;
                    schemeIndex = 17;
                    break;
                case 17:
                    if (pathIndex == 0) {
                        schemeIndex = 22;
                        break;
                    } else {
                        schemeIndex = 18;
                        break;
                    }
                case 18:
                    str = str;
                    iIndexOf3 = str.indexOf(c2, iIndexOf + 3);
                    if (iIndexOf3 == -1) {
                        schemeIndex = 20;
                        break;
                    } else {
                        schemeIndex = 19;
                        break;
                    }
                case 19:
                    if (iIndexOf3 <= queryIndex) {
                        schemeIndex = 21;
                        break;
                    } else {
                        schemeIndex = 20;
                        break;
                    }
                case 20:
                    iIndexOf3 = queryIndex;
                    schemeIndex = 21;
                    break;
                case 21:
                    int[] iArr3 = iArr;
                    iArr3[0] = iIndexOf;
                    iArr3[length] = iIndexOf3;
                    iArr3[2] = queryIndex;
                    iArr3[3] = iIndexOf4;
                    return iArr3;
                case 22:
                    iIndexOf3 = iIndexOf + 1;
                    schemeIndex = 21;
                    break;
                case 23:
                    pathIndex = 0;
                    schemeIndex = 17;
                    break;
            }
        }
    }
}
