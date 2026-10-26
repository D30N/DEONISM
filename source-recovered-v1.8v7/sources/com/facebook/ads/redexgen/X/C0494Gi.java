package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0494Gi {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{98, 68, 64, 116, 85, 72, 77, 72, 88, 75, 61, 57, 1, 3, 26, 26, 3, 4, 13, 74, 24, 15, 7, 11, 3, 4, 14, 15, 24, 74, 5, 12, 74, 7, 11, 6, 12, 5, 24, 7, 15, 14, 74, 57, 47, 35, 74, 36, 43, 38, 74, 31, 4, 3, 30, 68, 55, 49, 73, 68};
    }

    static {
        A02();
        A02 = C0560Iy.A08(A01(56, 4, 51));
        A01 = C0560Iy.A08(A01(7, 4, 79));
    }

    public static int A00(C0544Ii c0544Ii) {
        int i = 0;
        int b2 = 2;
        while (true) {
            switch (b2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() != 0) {
                        b2 = 4;
                        break;
                    } else {
                        b2 = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    c0544Ii = c0544Ii;
                    int iA0E = c0544Ii.A0E();
                    i += iA0E;
                    if (iA0E == 255) {
                        b2 = 2;
                        break;
                    } else {
                        b2 = 5;
                        break;
                    }
                case 5:
                    return i;
            }
        }
    }

    public static void A03(long j, C0544Ii c0544Ii, CO[] coArr) {
        C0544Ii c0544Ii2 = c0544Ii;
        CO[] coArr2 = coArr;
        int iA06 = 0;
        int iA00 = 0;
        int countryCode = 0;
        int providerCode = 0;
        int iA0E = 0;
        int ccCount = 0;
        int sampleStartPosition = 0;
        boolean z = false;
        int iA002 = 0;
        int iA08 = 0;
        int i = 0;
        int iA0E2 = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        C0544Ii c0544Ii3 = c0544Ii2;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    i = 1;
                    if (c0544Ii2.A04() <= 1) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii2 = c0544Ii2;
                    iA00 = A00(c0544Ii2);
                    iA002 = A00(c0544Ii2);
                    int providerCode2 = c0544Ii2.A06();
                    providerCode = providerCode2 + iA002;
                    if (iA002 == -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii2 = c0544Ii2;
                    if (iA002 <= c0544Ii2.A04()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii2 = c0544Ii2;
                    Log.w(A01(0, 7, 98), A01(11, 45, 41));
                    providerCode = c0544Ii2.A07();
                    c2 = 6;
                    break;
                case 6:
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Y(providerCode);
                    c2 = 2;
                    break;
                case 7:
                    if (iA00 != 4) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (iA002 < 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0544Ii2 = c0544Ii2;
                    iA0E2 = c0544Ii2.A0E();
                    countryCode = c0544Ii2.A0I();
                    iA08 = 0;
                    i2 = 49;
                    if (countryCode != 49) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0544Ii2 = c0544Ii2;
                    iA08 = c0544Ii2.A08();
                    c2 = 11;
                    break;
                case 11:
                    c0544Ii2 = c0544Ii2;
                    iA0E = c0544Ii2.A0E();
                    i3 = 47;
                    if (countryCode != 47) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Z(i);
                    c2 = '\r';
                    break;
                case '\r':
                    i4 = 0;
                    if (iA0E2 != 181) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (countryCode == i2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (countryCode != i3) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (iA0E != 3) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z2 = true;
                    c2 = 18;
                    break;
                case 18:
                    if (countryCode != i2) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (iA08 == A02) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (iA08 != A01) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    z = true;
                    c2 = 22;
                    break;
                case 22:
                    z2 &= z;
                    c2 = 23;
                    break;
                case 23:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    coArr2 = coArr2;
                    int iA0E3 = c0544Ii2.A0E() & 31;
                    c0544Ii3.A0Z(i);
                    sampleStartPosition = iA0E3 * 3;
                    iA06 = c0544Ii2.A06();
                    ccCount = coArr2.length;
                    c2 = 25;
                    break;
                case 25:
                    if (i4 >= ccCount) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0544Ii3 = c0544Ii3;
                    coArr2 = coArr2;
                    CO co = coArr2[i4];
                    c0544Ii3.A0Y(iA06);
                    co.ACk(c0544Ii3, sampleStartPosition);
                    co.ACl(j, 1, sampleStartPosition, 0, null);
                    i4++;
                    c2 = 25;
                    break;
                case 27:
                    z = false;
                    c2 = 22;
                    break;
                case 28:
                    z2 = false;
                    c2 = 18;
                    break;
                case 29:
                    return;
            }
        }
    }
}
