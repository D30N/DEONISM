package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D4 {
    public static byte[] A0B;
    public static final int A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C0544Ii A0A = new C0544Ii(255);

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0B = new byte[]{22, 11, 3, 22, 16, 7, 22, 23, 83, 60, 20, 20, 32, 83, 16, 18, 3, 7, 6, 1, 22, 83, 3, 18, 7, 7, 22, 1, 29, 83, 18, 7, 83, 17, 22, 20, 26, 29, 83, 28, 21, 83, 3, 18, 20, 22, 94, 69, 88, 94, 91, 91, 68, 89, 95, 78, 79, 11, 73, 66, 95, 11, 88, 95, 89, 78, 74, 70, 11, 89, 78, 93, 66, 88, 66, 68, 69, 64, 104, 104, 92};
    }

    static {
        A01();
        A0C = C0560Iy.A08(A00(77, 4, 94));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(CD cd, boolean z) throws InterruptedException, IOException {
        D4 d4 = this;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        d4.A0A.A0V();
        d4.A02();
        boolean z3 = false;
        char c2 = cd.A6U() != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    cd = cd;
                    if (cd.A6U() - cd.A6i() < 27) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z2 = true;
                    c2 = 4;
                    break;
                case 4:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    d4 = d4;
                    cd = cd;
                    z3 = false;
                    z3 = false;
                    i = 27;
                    if (!cd.ABg(d4.A0A.A00, 0, 27, true)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return z3;
                case '\b':
                    z2 = false;
                    c2 = 4;
                    break;
                case '\t':
                    throw new EOFException();
                case '\n':
                    d4 = d4;
                    if (d4.A0A.A0M() == A0C) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (!z) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z3;
                case '\r':
                    throw new AF(A00(0, 46, 34));
                case 14:
                    d4 = d4;
                    d4.A03 = d4.A0A.A0E();
                    if (d4.A03 == 0) {
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
                    return z3;
                case 17:
                    throw new AF(A00(46, 31, k.AppCompatTheme_windowMinWidthMajor));
                case 18:
                    d4 = d4;
                    cd = cd;
                    d4.A04 = d4.A0A.A0E();
                    d4.A05 = d4.A0A.A0J();
                    d4.A08 = d4.A0A.A0K();
                    d4.A07 = d4.A0A.A0K();
                    d4.A06 = d4.A0A.A0K();
                    d4.A02 = d4.A0A.A0E();
                    d4.A01 = d4.A02 + i;
                    d4.A0A.A0V();
                    cd.ABf(d4.A0A.A00, z3 ? 1 : 0, d4.A02);
                    i2 = 0;
                    c2 = 19;
                    break;
                case 19:
                    d4 = d4;
                    if (i2 >= d4.A02) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    d4 = d4;
                    d4.A09[i2] = d4.A0A.A0E();
                    d4.A00 += d4.A09[i2];
                    i2++;
                    c2 = 19;
                    break;
                case 21:
                    return true;
            }
        }
    }
}
