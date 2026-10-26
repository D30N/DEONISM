package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0967Yx implements CU {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public CW A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<CT> A05 = new ArrayDeque<>();
    public final C0401Cb A04 = new C0401Cb();

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A07 = new byte[]{99, 68, 92, 75, 70, 67, 78, 10, 79, 70, 79, 71, 79, 68, 94, 10, 94, 83, 90, 79, 10, 41, 14, 22, 1, 12, 9, 4, 64, 6, 12, 15, 1, 20, 64, 19, 9, 26, 5, 90, 64, 123, 92, 68, 83, 94, 91, 86, 18, 91, 92, 70, 87, 85, 87, 64, 18, 65, 91, 72, 87, 8, 18, 67, 100, 98, 121, 126, 119, 48, 117, 124, 117, 125, 117, 126, 100, 48, 99, 121, 106, 117, 42, 48};
    }

    private double A00(CD cd, int i) throws InterruptedException, IOException {
        double dLongBitsToDouble = 0.0d;
        long jA02 = A02(cd, i);
        char c2 = i == 4 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    dLongBitsToDouble = Float.intBitsToFloat((int) jA02);
                    c2 = 3;
                    break;
                case 3:
                    return dLongBitsToDouble;
                case 4:
                    dLongBitsToDouble = Double.longBitsToDouble(jA02);
                    c2 = 3;
                    break;
            }
        }
    }

    private long A01(CD cd) throws InterruptedException, IOException {
        C0967Yx c0967Yx = this;
        int potentialId = 0;
        boolean z = false;
        int i = 0;
        int iA00 = 0;
        cd.ACg();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0967Yx = c0967Yx;
                    cd = cd;
                    i = 4;
                    z = false;
                    cd.ABf(c0967Yx.A06, 0, 4);
                    iA00 = C0401Cb.A00(c0967Yx.A06[0]);
                    if (iA00 == -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (iA00 > i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0967Yx = c0967Yx;
                    potentialId = (int) C0401Cb.A01(c0967Yx.A06, iA00, z);
                    if (!c0967Yx.A03.A7h(potentialId)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    cd.ADL(iA00);
                    return potentialId;
                case 6:
                    cd = cd;
                    cd.ADL(1);
                    c2 = 2;
                    break;
            }
        }
    }

    private long A02(CD cd, int i) throws InterruptedException, IOException {
        C0967Yx c0967Yx = this;
        cd.readFully(c0967Yx.A06, 0, i);
        long j = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0967Yx = c0967Yx;
                    j = (j << 8) | (c0967Yx.A06[i2] & 255);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return j;
            }
        }
    }

    private String A04(CD cd, int trimmedLength) throws InterruptedException, IOException {
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        char c2 = trimmedLength == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A03(21, 0, 60);
                case 3:
                    cd = cd;
                    bArr = new byte[trimmedLength];
                    i = 0;
                    cd.readFully(bArr, 0, trimmedLength);
                    i2 = trimmedLength;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bArr = bArr;
                    if (bArr[i2 - 1] != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i2--;
                    c2 = 4;
                    break;
                case 7:
                    return new String(bArr, i, i2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A7U(CW cw) {
        this.A03 = cw;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final boolean AC5(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        C0967Yx c0967Yx = this;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int iA66 = 0;
        long jA01 = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = true;
        char c2 = c0967Yx.A03 != null ? (char) 2 : (char) 25;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A04(z);
                    c2 = 4;
                    break;
                case 4:
                    c0967Yx = c0967Yx;
                    if (!c0967Yx.A05.isEmpty()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    c0967Yx = c0967Yx;
                    cd2 = cd2;
                    if (cd2.A6n() < c0967Yx.A05.peek().A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    C0967Yx c0967Yx2 = c0967Yx;
                    c0967Yx2.A03.A4v(c0967Yx2.A05.pop().A00);
                    return z2;
                case 7:
                    c0967Yx = c0967Yx;
                    i2 = 4;
                    if (c0967Yx.A01 != 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0967Yx = c0967Yx;
                    cd2 = cd2;
                    C0401Cb c0401Cb = c0967Yx.A04;
                    z2 = z2 ? 1 : 0;
                    jA01 = c0401Cb.A05(cd2, z2, false, i2);
                    if (jA01 != -2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0967Yx = c0967Yx;
                    cd2 = cd2;
                    jA01 = c0967Yx.A01(cd2);
                    c2 = '\n';
                    break;
                case '\n':
                    if (jA01 != -1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return false;
                case '\f':
                    c0967Yx = c0967Yx;
                    c0967Yx.A00 = (int) jA01;
                    c0967Yx.A01 = z2 ? 1 : 0;
                    c2 = '\r';
                    break;
                case '\r':
                    c0967Yx = c0967Yx;
                    i = 2;
                    if (c0967Yx.A01 != z2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0967Yx = c0967Yx;
                    cd2 = cd2;
                    c0967Yx.A02 = c0967Yx.A04.A05(cd2, false, z2 ? 1 : 0, 8);
                    c0967Yx.A01 = i;
                    c2 = 15;
                    break;
                case 15:
                    c0967Yx = c0967Yx;
                    iA66 = c0967Yx.A03.A66(c0967Yx.A00);
                    if (iA66 == 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (iA66 == z2) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    j4 = 8;
                    if (iA66 == i) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (iA66 == 3) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (iA66 == i2) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (iA66 != 5) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c0967Yx = c0967Yx;
                    j3 = c0967Yx.A02;
                    if (j3 == 4) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (j3 != j4) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    C0967Yx c0967Yx3 = c0967Yx;
                    c0967Yx3.A03.A58(c0967Yx3.A00, c0967Yx3.A00(cd2, (int) c0967Yx3.A02));
                    c0967Yx3.A01 = 0;
                    return z2;
                case 24:
                    c0967Yx = c0967Yx;
                    cd2 = cd2;
                    cd2.ADL((int) c0967Yx.A02);
                    c0967Yx.A01 = 0;
                    c2 = 4;
                    break;
                case 25:
                    z = false;
                    c2 = 3;
                    break;
                case 26:
                    throw new AF(A03(21, 20, 9) + c0967Yx.A02);
                case 27:
                    throw new AF(A03(0, 21, 67) + iA66);
                case 28:
                    C0967Yx c0967Yx4 = c0967Yx;
                    c0967Yx4.A03.A3q(c0967Yx4.A00, (int) c0967Yx4.A02, cd2);
                    c0967Yx4.A01 = 0;
                    return z2;
                case 29:
                    c0967Yx = c0967Yx;
                    j2 = c0967Yx.A02;
                    if (j2 > 2147483647L) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    C0967Yx c0967Yx5 = c0967Yx;
                    c0967Yx5.A03.ADW(c0967Yx5.A00, c0967Yx5.A04(cd2, (int) j2));
                    c0967Yx5.A01 = 0;
                    return z2;
                case 31:
                    throw new AF(A03(63, 21, k.AppCompatTheme_windowFixedWidthMinor) + c0967Yx.A02);
                case ' ':
                    c0967Yx = c0967Yx;
                    j = c0967Yx.A02;
                    if (j > j4) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    C0967Yx c0967Yx6 = c0967Yx;
                    c0967Yx6.A03.A7W(c0967Yx6.A00, c0967Yx6.A02(cd2, (int) j));
                    c0967Yx6.A01 = 0;
                    return z2;
                case '\"':
                    throw new AF(A03(41, 22, 91) + c0967Yx.A02);
                case '#':
                    C0967Yx c0967Yx7 = c0967Yx;
                    long jA6n = cd2.A6n();
                    c0967Yx7.A05.push(new CT(c0967Yx7.A00, jA6n + c0967Yx7.A02));
                    c0967Yx7.A03.ADP(c0967Yx7.A00, jA6n, c0967Yx7.A02);
                    c0967Yx7.A01 = 0;
                    return z2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
