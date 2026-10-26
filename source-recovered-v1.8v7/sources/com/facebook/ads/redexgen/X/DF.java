package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DF {
    public static byte[] A00;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static DE A04(C0544Ii c0544Ii) throws AF {
        A0A(1, c0544Ii, false);
        long jA0K = c0544Ii.A0K();
        int iA0E = c0544Ii.A0E();
        long jA0K2 = c0544Ii.A0K();
        int iA0A = c0544Ii.A0A();
        int iA0A2 = c0544Ii.A0A();
        int iA0A3 = c0544Ii.A0A();
        int iA0E2 = c0544Ii.A0E();
        return new DE(jA0K, iA0E, jA0K2, iA0A, iA0A2, iA0A3, (int) Math.pow(2.0d, iA0E2 & 15), (int) Math.pow(2.0d, (iA0E2 & 240) >> 4), (c0544Ii.A0E() & 1) > 0, Arrays.copyOf(c0544Ii.A00, c0544Ii.A07()));
    }

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A00 = new byte[]{-6, 13, 5, -6, -8, 9, -6, -7, -75, -8, -3, -10, 7, -10, -8, 9, -6, 7, 8, -75, -68, 11, 4, 7, -9, -2, 8, -68, -57, -62, 115, -59, -72, -58, -72, -59, -55, -72, -73, 115, -75, -68, -57, -58, 115, -64, -56, -58, -57, 115, -75, -72, 115, -51, -72, -59, -62, 115, -76, -71, -57, -72, -59, 115, -64, -76, -61, -61, -68, -63, -70, 115, -74, -62, -56, -61, -65, -68, -63, -70, 115, -58, -57, -72, -61, -58, 33, 28, 28, -51, 32, 21, 28, 31, 33, -51, 21, 18, 14, 17, 18, 31, -25, -51, -15, -19, -30, -28, -26, -23, -16, -19, -27, -26, -13, -95, -16, -25, -95, -11, -22, -18, -26, -95, -27, -16, -18, -30, -22, -17, -95, -11, -13, -30, -17, -12, -25, -16, -13, -18, -12, -95, -17, -16, -11, -95, -5, -26, -13, -16, -26, -27, -95, -16, -10, -11, -67, -55, -72, -60, -64, -59, -66, 119, -71, -64, -53, 119, -68, -49, -57, -68, -70, -53, -68, -69, 119, -53, -58, 119, -71, -68, 119, -54, -68, -53, -73, -85, -70, -70, -77, -72, -79, 106, -66, -61, -70, -81, 106, -71, -66, -78, -81, -68, 106, -66, -78, -85, -72, 106, 122, 106, -72, -71, -66, 106, -67, -65, -70, -70, -71, -68, -66, -81, -82, -124, 106, -68, -43, -40, -56, -49, -39, -69, -38, -49, -46, -69, -50, -58, -69, -71, -54, -69, -70, 118, -71, -59, -70, -69, 118, -72, -59, -59, -63, 118, -54, -59, 118, -55, -54, -73, -56, -54, 118, -51, -65, -54, -66, 118, -79, -122, -50, -117, -116, -126, 118, -122, -50, -118, -119, -126, 118, -122, -50, -118, -120, -77, 118, -73, -54, 118, -69, -57, -74, -62, -66, -61, -68, 117, -73, -66, -55, 117, -74, -69, -55, -70, -57, 117, -62, -60, -71, -70, -56, 117, -61, -60, -55, 117, -56, -70, -55, 117, -74, -56, 117, -70, -51, -59, -70, -72, -55, -70, -71, -87, -68, -76, -87, -89, -72, -87, -88, 100, -84, -87, -91, -88, -87, -74, 100, -72, -67, -76, -87, 100, -31, -25, -22, -22, -19, -101, -17, -12, -21, -32, -101, -30, -19, -32, -36, -17, -32, -19, -101, -17, -29, -36, -23, -101, -84, -101, -23, -22, -17, -101, -33, -32, -34, -22, -33, -36, -35, -25, -32, -75, -101, 10, -3, 11, 1, -4, 13, -3, -20, 17, 8, -3, -72, -1, 10, -3, -7, 12, -3, 10, -72, 12, 0, -7, 6, -72, -54, -72, 1, 11, -72, 6, 7, 12, -72, -4, -3, -5, 7, -4, -7, -6, 4, -3, -70, -67, -67, -71, -61, -66, 110, -62, -57, -66, -77, 110, -75, -64, -77, -81, -62, -77, -64, 110, -62, -74, -81, -68, 110, Byte.MIN_VALUE, 110, -68, -67, -62, 110, -78, -77, -79, -67, -78, -81, -80, -70, -77, -120, 110};
    }

    public static int A00(int val) {
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (val <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i++;
                    val >>>= 1;
                    c2 = 2;
                    break;
                case 4:
                    return i;
            }
        }
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.DB A02(com.facebook.ads.redexgen.X.D9 r12) throws com.facebook.ads.redexgen.X.AF {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DF.A02(com.facebook.ads.redexgen.X.D9):com.facebook.ads.redexgen.X.DB");
    }

    public static DC A03(C0544Ii c0544Ii) throws AF {
        A0A(3, c0544Ii, false);
        int len = (int) c0544Ii.A0K();
        String strA0S = c0544Ii.A0S(len);
        int len2 = strA0S.length();
        long jA0K = c0544Ii.A0K();
        String[] strArr = new String[(int) jA0K];
        int i = 7 + 4 + len2 + 4;
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    if (i2 >= jA0K) {
                        i3 = 4;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    strArr = strArr;
                    int i4 = (int) c0544Ii.A0K();
                    strArr[i2] = c0544Ii.A0S(i4);
                    int i5 = strArr[i2].length();
                    i = i + 4 + i5;
                    i2++;
                    i3 = 2;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    if ((c0544Ii.A0E() & 1) == 0) {
                        i3 = 6;
                        break;
                    } else {
                        i3 = 5;
                        break;
                    }
                case 5:
                    return new DC(strA0S, strArr, i + 1);
                case 6:
                    throw new AF(A05(156, 30, 25));
            }
        }
    }

    public static void A07(int mappingsCount, D9 d9) throws AF {
        D9 d92 = d9;
        int i = 0;
        int mappingType = 0;
        int submaps = 0;
        int j = 0;
        int i2 = 0;
        int j2 = 0;
        int i3 = 0;
        int iA02 = 0;
        int iA022 = d92.A02(6) + 1;
        int i4 = 0;
        int j3 = 2;
        while (true) {
            switch (j3) {
                case 2:
                    if (i4 >= iA022) {
                        j3 = 22;
                        break;
                    } else {
                        j3 = 3;
                        break;
                    }
                case 3:
                    d92 = d92;
                    iA02 = d92.A02(16);
                    if (iA02 == 0) {
                        j3 = 6;
                        break;
                    } else {
                        j3 = 4;
                        break;
                    }
                case 4:
                    Log.e(A05(227, 10, 40), A05(186, 41, 12) + iA02);
                    j3 = 5;
                    break;
                case 5:
                    i4++;
                    j3 = 2;
                    break;
                case 6:
                    d92 = d92;
                    i2 = 4;
                    if (!d92.A04()) {
                        j3 = 12;
                        break;
                    } else {
                        j3 = 7;
                        break;
                    }
                case 7:
                    d92 = d92;
                    j2 = d92.A02(i2) + 1;
                    j3 = 8;
                    break;
                case 8:
                    d92 = d92;
                    j = 8;
                    if (!d92.A04()) {
                        j3 = 13;
                        break;
                    } else {
                        j3 = 9;
                        break;
                    }
                case 9:
                    d92 = d92;
                    int submaps2 = d92.A02(j);
                    submaps = submaps2 + 1;
                    mappingType = 0;
                    j3 = 10;
                    break;
                case 10:
                    if (mappingType >= submaps) {
                        j3 = 13;
                        break;
                    } else {
                        j3 = 11;
                        break;
                    }
                case 11:
                    d92 = d92;
                    int j4 = mappingsCount - 1;
                    d92.A03(A00(j4));
                    int j5 = mappingsCount - 1;
                    d92.A03(A00(j5));
                    mappingType++;
                    j3 = 10;
                    break;
                case 12:
                    j2 = 1;
                    j3 = 8;
                    break;
                case 13:
                    d92 = d92;
                    if (d92.A02(2) != 0) {
                        j3 = 21;
                        break;
                    } else {
                        j3 = 14;
                        break;
                    }
                case 14:
                    if (j2 <= 1) {
                        j3 = 18;
                        break;
                    } else {
                        j3 = 15;
                        break;
                    }
                case 15:
                    i = 0;
                    j3 = 16;
                    break;
                case 16:
                    if (i >= mappingsCount) {
                        j3 = 18;
                        break;
                    } else {
                        j3 = 17;
                        break;
                    }
                case 17:
                    d92 = d92;
                    d92.A03(i2);
                    i++;
                    j3 = 16;
                    break;
                case 18:
                    i3 = 0;
                    j3 = 19;
                    break;
                case 19:
                    if (i3 >= j2) {
                        j3 = 5;
                        break;
                    } else {
                        j3 = 20;
                        break;
                    }
                case 20:
                    d92 = d92;
                    d92.A03(j);
                    d92.A03(j);
                    d92.A03(j);
                    i3++;
                    j3 = 19;
                    break;
                case 21:
                    throw new AF(A05(28, 58, 21));
                case 22:
                    return;
            }
        }
    }

    public static void A08(D9 d9) throws AF {
        D9 d92 = d9;
        int floorCount = 0;
        int iA02 = 0;
        int i = 0;
        int floorType = 0;
        int rangeBits = 0;
        int count = 0;
        int maximumClass = 0;
        int j = 0;
        int j2 = 0;
        int k = 0;
        int i2 = 0;
        int i3 = 0;
        int iA022 = 0;
        int i4 = 0;
        int[] iArr = null;
        int[] partitionClassList = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iA023 = d92.A02(6) + 1;
        int i8 = 0;
        int floorNumberOfBooks = 2;
        while (true) {
            switch (floorNumberOfBooks) {
                case 2:
                    if (i8 >= iA023) {
                        floorNumberOfBooks = 29;
                        break;
                    } else {
                        floorNumberOfBooks = 3;
                        break;
                    }
                case 3:
                    d92 = d92;
                    i = 16;
                    j = d92.A02(16);
                    i3 = 4;
                    i6 = 8;
                    if (j == 0) {
                        floorNumberOfBooks = 24;
                        break;
                    } else {
                        floorNumberOfBooks = 4;
                        break;
                    }
                case 4:
                    if (j != 1) {
                        floorNumberOfBooks = 28;
                        break;
                    } else {
                        floorNumberOfBooks = 5;
                        break;
                    }
                case 5:
                    d92 = d92;
                    j2 = d92.A02(5);
                    i4 = -1;
                    iArr = new int[j2];
                    i2 = 0;
                    floorNumberOfBooks = 6;
                    break;
                case 6:
                    if (i2 >= j2) {
                        floorNumberOfBooks = 10;
                        break;
                    } else {
                        floorNumberOfBooks = 7;
                        break;
                    }
                case 7:
                    d92 = d92;
                    int[] partitionClassList2 = iArr;
                    iArr = partitionClassList2;
                    iArr[i2] = d92.A02(i3);
                    if (iArr[i2] <= i4) {
                        floorNumberOfBooks = 9;
                        break;
                    } else {
                        floorNumberOfBooks = 8;
                        break;
                    }
                case 8:
                    int[] partitionClassList3 = iArr;
                    iArr = partitionClassList3;
                    i4 = iArr[i2];
                    floorNumberOfBooks = 9;
                    break;
                case 9:
                    i2++;
                    floorNumberOfBooks = 6;
                    break;
                case 10:
                    partitionClassList = new int[i4 + 1];
                    i5 = 0;
                    floorNumberOfBooks = 11;
                    break;
                case 11:
                    partitionClassList = partitionClassList;
                    k = 2;
                    if (i5 >= partitionClassList.length) {
                        floorNumberOfBooks = 18;
                        break;
                    } else {
                        floorNumberOfBooks = 12;
                        break;
                    }
                case 12:
                    d92 = d92;
                    partitionClassList = partitionClassList;
                    int floorNumberOfBooks2 = d92.A02(3);
                    partitionClassList[i5] = floorNumberOfBooks2 + 1;
                    k = k;
                    iA022 = d92.A02(k);
                    if (iA022 <= 0) {
                        floorNumberOfBooks = 14;
                        break;
                    } else {
                        floorNumberOfBooks = 13;
                        break;
                    }
                case 13:
                    d92 = d92;
                    d92.A03(i6);
                    floorNumberOfBooks = 14;
                    break;
                case 14:
                    i7 = 0;
                    floorNumberOfBooks = 15;
                    break;
                case 15:
                    if (i7 >= (1 << iA022)) {
                        floorNumberOfBooks = 17;
                        break;
                    } else {
                        floorNumberOfBooks = 16;
                        break;
                    }
                case 16:
                    d92 = d92;
                    d92.A03(i6);
                    i7++;
                    floorNumberOfBooks = 15;
                    break;
                case 17:
                    i5++;
                    floorNumberOfBooks = 11;
                    break;
                case 18:
                    d92 = d92;
                    d92.A03(k);
                    floorType = d92.A02(i3);
                    count = 0;
                    maximumClass = 0;
                    rangeBits = 0;
                    floorNumberOfBooks = 19;
                    break;
                case 19:
                    if (maximumClass >= j2) {
                        floorNumberOfBooks = 27;
                        break;
                    } else {
                        floorNumberOfBooks = 20;
                        break;
                    }
                case 20:
                    iArr = iArr;
                    partitionClassList = partitionClassList;
                    int k2 = iArr[maximumClass];
                    count += partitionClassList[k2];
                    floorNumberOfBooks = 21;
                    break;
                case 21:
                    if (rangeBits >= count) {
                        floorNumberOfBooks = 23;
                        break;
                    } else {
                        floorNumberOfBooks = 22;
                        break;
                    }
                case 22:
                    d92 = d92;
                    d92.A03(floorType);
                    rangeBits++;
                    floorNumberOfBooks = 21;
                    break;
                case 23:
                    maximumClass++;
                    floorNumberOfBooks = 19;
                    break;
                case 24:
                    d92 = d92;
                    d92.A03(i6);
                    d92.A03(i);
                    d92.A03(i);
                    d92.A03(6);
                    d92.A03(i6);
                    iA02 = d92.A02(i3) + 1;
                    floorCount = 0;
                    floorNumberOfBooks = 25;
                    break;
                case 25:
                    int k3 = floorCount;
                    if (k3 >= iA02) {
                        floorNumberOfBooks = 27;
                        break;
                    } else {
                        floorNumberOfBooks = 26;
                        break;
                    }
                case 26:
                    d92 = d92;
                    d92.A03(i6);
                    floorCount++;
                    floorNumberOfBooks = 25;
                    break;
                case 27:
                    i8++;
                    floorNumberOfBooks = 2;
                    break;
                case 28:
                    throw new AF(A05(356, 41, 61) + j);
                case 29:
                    return;
            }
        }
    }

    public static void A09(D9 d9) throws AF {
        int residueCount = 0;
        int i = 0;
        int iA02 = 0;
        int[] iArr = null;
        int i2 = 0;
        int i3 = 0;
        int j = 0;
        int iA022 = 0;
        int iA023 = d9.A02(6) + 1;
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i4 >= iA023) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    d9 = d9;
                    if (d9.A02(16) > 2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    d9 = d9;
                    d9.A03(24);
                    d9.A03(24);
                    d9.A03(24);
                    j = d9.A02(6) + 1;
                    i = 8;
                    d9.A03(8);
                    iArr = new int[j];
                    i2 = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i2 >= j) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    d9 = d9;
                    iA02 = 0;
                    iA022 = d9.A02(3);
                    if (!d9.A04()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    d9 = d9;
                    iA02 = d9.A02(5);
                    c2 = '\b';
                    break;
                case '\b':
                    iArr = iArr;
                    iArr[i2] = (iA02 * 8) + iA022;
                    i2++;
                    c2 = 5;
                    break;
                case '\t':
                    i3 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    if (i3 >= j) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    residueCount = 0;
                    c2 = '\f';
                    break;
                case '\f':
                    if (residueCount >= i) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    iArr = iArr;
                    if ((iArr[i3] & (1 << residueCount)) == 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    d9 = d9;
                    d9.A03(i);
                    c2 = 15;
                    break;
                case 15:
                    residueCount++;
                    c2 = '\f';
                    break;
                case 16:
                    i3++;
                    c2 = '\n';
                    break;
                case 17:
                    i4++;
                    c2 = 2;
                    break;
                case 18:
                    throw new AF(A05(397, 43, 90));
                case 19:
                    return;
            }
        }
    }

    public static boolean A0A(int i, C0544Ii c0544Ii, boolean z) throws AF {
        char c2 = c0544Ii.A04() < 7 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    throw new AF(A05(86, 18, 111) + c0544Ii.A04());
                case 5:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() == i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    throw new AF(A05(335, 21, 6) + Integer.toHexString(i));
                case '\t':
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != 118) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != 111) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != 114) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != 98) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != 105) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() == 115) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return false;
                case 17:
                    throw new AF(A05(0, 28, 87));
                case 18:
                    return true;
            }
        }
    }

    public static DD[] A0B(D9 d9) {
        int iA02 = d9.A02(6) + 1;
        DD[] ddArr = new DD[iA02];
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA02) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    d9 = d9;
                    ddArr = ddArr;
                    ddArr[i] = new DD(d9.A04(), d9.A02(16), d9.A02(16), d9.A02(8));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return ddArr;
            }
        }
    }

    public static DD[] A0C(C0544Ii c0544Ii, int i) throws AF {
        DD[] modes = null;
        int iA02 = 0;
        int i2 = 0;
        A0A(5, c0544Ii, false);
        int iA0E = c0544Ii.A0E() + 1;
        D9 d9 = new D9(c0544Ii.A00);
        d9.A03(c0544Ii.A06() * 8);
        int i3 = 0;
        int timeCount = 2;
        while (true) {
            switch (timeCount) {
                case 2:
                    if (i3 >= iA0E) {
                        timeCount = 4;
                        break;
                    } else {
                        timeCount = 3;
                        break;
                    }
                case 3:
                    d9 = d9;
                    A02(d9);
                    i3++;
                    timeCount = 2;
                    break;
                case 4:
                    d9 = d9;
                    iA02 = d9.A02(6) + 1;
                    i2 = 0;
                    timeCount = 5;
                    break;
                case 5:
                    if (i2 >= iA02) {
                        timeCount = 9;
                        break;
                    } else {
                        timeCount = 6;
                        break;
                    }
                case 6:
                    d9 = d9;
                    if (d9.A02(16) != 0) {
                        timeCount = 8;
                        break;
                    } else {
                        timeCount = 7;
                        break;
                    }
                case 7:
                    i2++;
                    timeCount = 5;
                    break;
                case 8:
                    throw new AF(A05(104, 52, 67));
                case 9:
                    d9 = d9;
                    A08(d9);
                    A09(d9);
                    A07(i, d9);
                    modes = A0B(d9);
                    if (!d9.A04()) {
                        timeCount = 11;
                        break;
                    } else {
                        timeCount = 10;
                        break;
                    }
                case 10:
                    return modes;
                case 11:
                    throw new AF(A05(292, 43, 23));
            }
        }
    }
}
