package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZI implements CC {
    public static byte[] A03;
    public static final CF A04;
    public CE A00;
    public D8 A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 97);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{45, 10, 2, 7, 14, 15, 75, 31, 4, 75, 15, 14, 31, 14, 25, 6, 2, 5, 14, 75, 9, 2, 31, 24, 31, 25, 14, 10, 6, 75, 31, 18, 27, 14};
    }

    static {
        A02();
        A04 = new ZH();
    }

    public static C0544Ii A00(C0544Ii c0544Ii) {
        c0544Ii.A0Y(0);
        return c0544Ii;
    }

    private boolean A03(CD cd) throws InterruptedException, IOException {
        ZI zi = this;
        C0544Ii c0544Ii = null;
        D4 d4 = new D4();
        boolean z = false;
        char c2 = d4.A03(cd, true) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    d4 = d4;
                    if ((d4.A04 & 2) == 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    cd = cd;
                    d4 = d4;
                    z = false;
                    int iMin = Math.min(d4.A00, 8);
                    c0544Ii = new C0544Ii(iMin);
                    cd.ABf(c0544Ii.A00, 0, iMin);
                    C0544Ii scratch = A00(c0544Ii);
                    if (!ZG.A04(scratch)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zi = zi;
                    zi.A01 = new ZG();
                    c2 = 6;
                    break;
                case 6:
                    return true;
                case 7:
                    c0544Ii = c0544Ii;
                    C0544Ii scratch2 = A00(c0544Ii);
                    if (!ZL.A06(scratch2)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    zi = zi;
                    zi.A01 = new ZL();
                    c2 = 6;
                    break;
                case '\t':
                    c0544Ii = c0544Ii;
                    C0544Ii scratch3 = A00(c0544Ii);
                    if (!ZJ.A04(scratch3)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    zi = zi;
                    zi.A01 = new ZJ();
                    c2 = 6;
                    break;
                case 11:
                    return z;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A00 = ce;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        ZI zi = this;
        char c2 = zi.A01 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    zi = zi;
                    cd = cd;
                    if (!zi.A03(cd)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cd = cd;
                    cd.ACg();
                    c2 = 4;
                    break;
                case 4:
                    zi = zi;
                    if (!zi.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    zi = zi;
                    CO coADd = zi.A00.ADd(0, 1);
                    zi.A00.A4w();
                    zi.A01.A06(zi.A00, coADd);
                    zi.A02 = true;
                    c2 = 6;
                    break;
                case 6:
                    return zi.A01.A02(cd, cj);
                case 7:
                    throw new AF(A01(0, 34, 10));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        D8 d8 = this.A01;
        if (d8 != null) {
            d8.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        try {
            return A03(cd);
        } catch (AF unused) {
            return false;
        }
    }
}
