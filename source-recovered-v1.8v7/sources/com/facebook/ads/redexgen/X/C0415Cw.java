package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0415Cw {
    public static byte[] A00;
    public static final int[] A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{43, 49, 45, 112, 56, 47, 58, 104, 122, 119, 100, 35, 74, 79, 27, 27, 30, 103, 5, 115, 11, 21, 0, 82, 33, 46, 46, 35, 76, 53, 64, 33, 1, 85, 0, 80, 88, 66, 94, 5, 92, 66, 95, 71, 67, 23, 2, 70, 16, 10, 22, 20, 66, 16, 82, 4, 5, 31, 3, 89, 32, 61, 121, 124, 113, 107, 119, 46, 85, 44, 78, 72, 91, 15, 24, 57, 36, 96, 102, 0, 84, 86, 5, 61, 105, 125, 56, 65, 21, 64, 19, 95, 69, 89, 5, 74, 30, 30, 79};
    }

    static {
        A01();
        A01 = new int[]{C0560Iy.A08(A00(48, 4, 7)), C0560Iy.A08(A00(0, 4, 60)), C0560Iy.A08(A00(91, 4, 72)), C0560Iy.A08(A00(36, 4, 79)), C0560Iy.A08(A00(56, 4, 18)), C0560Iy.A08(A00(64, 4, 102)), C0560Iy.A08(A00(4, 4, 39)), C0560Iy.A08(A00(20, 4, 29)), C0560Iy.A08(A00(8, 4, 108)), C0560Iy.A08(A00(60, 4, 51)), C0560Iy.A08(A00(75, 4, 42)), C0560Iy.A08(A00(87, 4, 12)), C0560Iy.A08(A00(32, 4, 76)), C0560Iy.A08(A00(44, 4, 14)), C0560Iy.A08(A00(83, 4, 112)), C0560Iy.A08(A00(79, 4, 77)), C0560Iy.A08(A00(95, 4, 7)), C0560Iy.A08(A00(16, 4, 45)), C0560Iy.A08(A00(28, 4, 127)), C0560Iy.A08(A00(52, 4, 90)), C0560Iy.A08(A00(24, 4, 52)), C0560Iy.A08(A00(68, 4, 102)), C0560Iy.A08(A00(12, 4, 69)), C0560Iy.A08(A00(40, 4, 111))};
    }

    public static boolean A02(int i) {
        int[] iArr = null;
        int i2 = 0;
        int length = 0;
        int compatibleBrand = (i >>> 8) == C0560Iy.A08(A00(72, 3, 22)) ? 2 : 3;
        while (true) {
            switch (compatibleBrand) {
                case 2:
                    return true;
                case 3:
                    iArr = A01;
                    length = iArr.length;
                    i2 = 0;
                    compatibleBrand = 4;
                    break;
                case 4:
                    if (i2 >= length) {
                        compatibleBrand = 8;
                        break;
                    } else {
                        compatibleBrand = 5;
                        break;
                    }
                case 5:
                    iArr = iArr;
                    int compatibleBrand2 = iArr[i2];
                    if (compatibleBrand2 != i) {
                        compatibleBrand = 7;
                        break;
                    } else {
                        compatibleBrand = 6;
                        break;
                    }
                case 6:
                    return true;
                case 7:
                    i2++;
                    compatibleBrand = 4;
                    break;
                case 8:
                    return false;
            }
        }
    }

    public static boolean A03(CD cd) throws InterruptedException, IOException {
        return A05(cd, true);
    }

    public static boolean A04(CD cd) throws InterruptedException, IOException {
        return A05(cd, false);
    }

    public static boolean A05(CD cd, boolean z) throws InterruptedException, IOException {
        CD cd2 = cd;
        int i = 0;
        int i2 = 0;
        int bytesToSearch = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        long jA0M = 0;
        boolean z3 = false;
        C0544Ii c0544Ii = null;
        int iA08 = 0;
        long jA6U = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        CD cd3 = cd2;
        long jA6U2 = cd2.A6U();
        long j = 4096;
        long j2 = -1;
        int i7 = jA6U2 != -1 ? 2 : 3;
        while (true) {
            switch (i7) {
                case 2:
                    if (jA6U2 <= j) {
                        i7 = 38;
                        break;
                    } else {
                        i7 = 3;
                        break;
                    }
                case 3:
                    i4 = (int) j;
                    c0544Ii = new C0544Ii(64);
                    i3 = 0;
                    z4 = false;
                    z2 = false;
                    i7 = 4;
                    break;
                case 4:
                    if (i3 >= i4) {
                        i7 = 17;
                        break;
                    } else {
                        i7 = 5;
                        break;
                    }
                case 5:
                    cd3 = cd3;
                    c0544Ii = c0544Ii;
                    i6 = 8;
                    c0544Ii.A0W(8);
                    cd3.ABf(c0544Ii.A00, 0, 8);
                    jA0M = c0544Ii.A0M();
                    iA08 = c0544Ii.A08();
                    i5 = 8;
                    if (jA0M != 1) {
                        i7 = 11;
                        break;
                    } else {
                        i7 = 6;
                        break;
                    }
                case 6:
                    cd3 = cd3;
                    c0544Ii = c0544Ii;
                    i6 = 16;
                    cd3.ABf(c0544Ii.A00, i5, i5);
                    c0544Ii.A0X(16);
                    jA0M = c0544Ii.A0N();
                    i7 = 7;
                    break;
                case 7:
                    if (jA0M >= i6) {
                        i7 = 9;
                        break;
                    } else {
                        i7 = 8;
                        break;
                    }
                case 8:
                    return false;
                case 9:
                    i3 += i6;
                    int bytesSearched = AbstractC0402Cd.A0j;
                    if (iA08 != bytesSearched) {
                        i7 = 14;
                        break;
                    } else {
                        i7 = 10;
                        break;
                    }
                case 10:
                    j2 = -1;
                    i7 = 4;
                    break;
                case 11:
                    if (jA0M != 0) {
                        i7 = 7;
                        break;
                    } else {
                        i7 = 12;
                        break;
                    }
                case 12:
                    cd2 = cd2;
                    jA6U = cd2.A6U();
                    if (jA6U == j2) {
                        i7 = 7;
                        break;
                    } else {
                        i7 = 13;
                        break;
                    }
                case 13:
                    cd2 = cd2;
                    jA0M = (jA6U - cd2.A6n()) + i6;
                    i7 = 7;
                    break;
                case 14:
                    int bytesSearched2 = AbstractC0402Cd.A0i;
                    if (iA08 == bytesSearched2) {
                        i7 = 16;
                        break;
                    } else {
                        i7 = 15;
                        break;
                    }
                case 15:
                    int bytesSearched3 = AbstractC0402Cd.A0m;
                    if (iA08 != bytesSearched3) {
                        i7 = 22;
                        break;
                    } else {
                        i7 = 16;
                        break;
                    }
                case 16:
                    z2 = true;
                    i7 = 17;
                    break;
                case 17:
                    if (!z4) {
                        i7 = 21;
                        break;
                    } else {
                        i7 = 18;
                        break;
                    }
                case 18:
                    if (z != z2) {
                        i7 = 21;
                        break;
                    } else {
                        i7 = 19;
                        break;
                    }
                case 19:
                    z3 = true;
                    i7 = 20;
                    break;
                case 20:
                    return z3;
                case 21:
                    z3 = false;
                    i7 = 20;
                    break;
                case 22:
                    if ((i3 + jA0M) - i6 < i4) {
                        i7 = 23;
                        break;
                    } else {
                        i7 = 17;
                        break;
                    }
                case 23:
                    bytesToSearch = (int) (jA0M - i6);
                    i3 += bytesToSearch;
                    int atomDataSize = AbstractC0402Cd.A0U;
                    if (iA08 != atomDataSize) {
                        i7 = 35;
                        break;
                    } else {
                        i7 = 24;
                        break;
                    }
                case 24:
                    if (bytesToSearch >= 8) {
                        i7 = 26;
                        break;
                    } else {
                        i7 = 25;
                        break;
                    }
                case 25:
                    return false;
                case 26:
                    cd3 = cd3;
                    c0544Ii = c0544Ii;
                    c0544Ii.A0W(bytesToSearch);
                    cd3.ABf(c0544Ii.A00, 0, bytesToSearch);
                    i2 = bytesToSearch / 4;
                    i = 0;
                    i7 = 27;
                    break;
                case 27:
                    int i8 = i2;
                    if (i >= i8) {
                        i7 = 33;
                        break;
                    } else {
                        i7 = 28;
                        break;
                    }
                case 28:
                    if (i != 1) {
                        i7 = 31;
                        break;
                    } else {
                        i7 = 29;
                        break;
                    }
                case 29:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(4);
                    i7 = 30;
                    break;
                case 30:
                    i++;
                    i7 = 27;
                    break;
                case 31:
                    c0544Ii = c0544Ii;
                    int atomDataSize2 = c0544Ii.A08();
                    if (!A02(atomDataSize2)) {
                        i7 = 30;
                        break;
                    } else {
                        i7 = 32;
                        break;
                    }
                case 32:
                    z4 = true;
                    i7 = 33;
                    break;
                case 33:
                    if (!z4) {
                        i7 = 34;
                        break;
                    } else {
                        i7 = 37;
                        break;
                    }
                case 34:
                    return false;
                case 35:
                    if (bytesToSearch == 0) {
                        i7 = 37;
                        break;
                    } else {
                        i7 = 36;
                        break;
                    }
                case 36:
                    cd3 = cd3;
                    cd3.A3L(bytesToSearch);
                    i7 = 37;
                    break;
                case 37:
                    j2 = -1;
                    i7 = 4;
                    break;
                case 38:
                    j = jA6U2;
                    i7 = 3;
                    break;
            }
        }
    }
}
