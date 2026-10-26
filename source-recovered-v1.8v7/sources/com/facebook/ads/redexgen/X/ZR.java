package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZR implements CC {
    public static byte[] A04;
    public static final CF A05;
    public static final int A06;
    public boolean A00;
    public final long A01;
    public final ZS A02;
    public final C0544Ii A03;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{117, 112, 95};
    }

    static {
        A01();
        A05 = new ZQ();
        A06 = C0560Iy.A08(A00(0, 3, 23));
    }

    public ZR() {
        this(0L);
    }

    public ZR(long j) {
        this.A01 = j;
        this.A02 = new ZS(true);
        this.A03 = new C0544Ii(200);
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A02.A4U(ce, new DW(0, 1));
        ce.A4w();
        ce.ACq(new C0958Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        ZR zr = this;
        int i = cd.read(zr.A03.A00, 0, 200);
        char c2 = i == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    zr = zr;
                    zr.A03.A0Y(0);
                    zr.A03.A0X(i);
                    if (!zr.A00) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    zr = zr;
                    zr.A02.ABb(zr.A01, true);
                    zr.A00 = true;
                    c2 = 5;
                    break;
                case 5:
                    ZR zr2 = zr;
                    zr2.A02.A47(zr2.A03);
                    return 0;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        this.A00 = false;
        this.A02.ACo();
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int iA04 = 0;
        int i4 = 0;
        C0544Ii c0544Ii = new C0544Ii(10);
        C0543Ih c0543Ih = new C0543Ih(c0544Ii.A00);
        int i5 = 0;
        int i6 = 2;
        while (true) {
            switch (i6) {
                case 2:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    z = false;
                    z = false;
                    cd.ABf(c0544Ii.A00, 0, 10);
                    c0544Ii.A0Y(0);
                    if (c0544Ii.A0G() == A06) {
                        i6 = 14;
                        break;
                    } else {
                        i6 = 3;
                        break;
                    }
                case 3:
                    cd = cd;
                    cd.ACg();
                    cd.A3L(i5);
                    i4 = i5;
                    i2 = 0;
                    i3 = 0;
                    i6 = 4;
                    break;
                case 4:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    cd.ABf(c0544Ii.A00, z ? 1 : 0, 2);
                    c0544Ii.A0Y(z ? 1 : 0);
                    if ((65526 & c0544Ii.A0I()) == 65520) {
                        i6 = 8;
                        break;
                    } else {
                        i6 = 5;
                        break;
                    }
                case 5:
                    cd = cd;
                    i3 = 0;
                    i2 = 0;
                    cd.ACg();
                    i4++;
                    if (i4 - i5 < 8192) {
                        i6 = 7;
                        break;
                    } else {
                        i6 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    cd = cd;
                    cd.A3L(i4);
                    i6 = 4;
                    break;
                case 8:
                    i3++;
                    i = 4;
                    if (i3 < 4) {
                        i6 = 11;
                        break;
                    } else {
                        i6 = 9;
                        break;
                    }
                case 9:
                    if (i2 <= 188) {
                        i6 = 11;
                        break;
                    } else {
                        i6 = 10;
                        break;
                    }
                case 10:
                    return true;
                case 11:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    c0543Ih = c0543Ih;
                    cd.ABf(c0544Ii.A00, z ? 1 : 0, i);
                    c0543Ih.A07(14);
                    iA04 = c0543Ih.A04(13);
                    if (iA04 > 6) {
                        i6 = 13;
                        break;
                    } else {
                        i6 = 12;
                        break;
                    }
                case 12:
                    return z;
                case 13:
                    cd = cd;
                    cd.A3L(iA04 - 6);
                    i2 += iA04;
                    i6 = 4;
                    break;
                case 14:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(3);
                    int iA0D = c0544Ii.A0D();
                    i5 += iA0D + 10;
                    cd.A3L(iA0D);
                    i6 = 2;
                    break;
            }
        }
    }
}
