package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZO implements CC {
    public static byte[] A04;
    public static final CF A05;
    public static final int A06;
    public boolean A00;
    public final long A01;
    public final ZP A02;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-106, -111, Byte.MIN_VALUE};
    }

    static {
        A01();
        A05 = new ZN();
        A06 = C0560Iy.A08(A00(0, 3, 12));
    }

    public ZO() {
        this(0L);
    }

    public ZO(long j) {
        this.A01 = j;
        this.A02 = new ZP();
        this.A03 = new C0544Ii(2786);
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A02.A4U(ce, new DW(0, 1));
        ce.A4w();
        ce.ACq(new C0958Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        ZO zo = this;
        int i = cd.read(zo.A03.A00, 0, 2786);
        char c2 = i == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    zo = zo;
                    zo.A03.A0Y(0);
                    zo.A03.A0X(i);
                    if (!zo.A00) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    zo = zo;
                    zo.A02.ABb(zo.A01, true);
                    zo.A00 = true;
                    c2 = 5;
                    break;
                case 5:
                    ZO zo2 = zo;
                    zo2.A02.A47(zo2.A03);
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
        int iA05 = 0;
        boolean z = false;
        C0544Ii c0544Ii = new C0544Ii(10);
        int i3 = 0;
        int i4 = 2;
        while (true) {
            switch (i4) {
                case 2:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    z = false;
                    z = false;
                    cd.ABf(c0544Ii.A00, 0, 10);
                    c0544Ii.A0Y(0);
                    if (c0544Ii.A0G() == A06) {
                        i4 = 13;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    cd = cd;
                    cd.ACg();
                    cd.A3L(i3);
                    i2 = i3;
                    i = 0;
                    i4 = 4;
                    break;
                case 4:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    cd.ABf(c0544Ii.A00, z ? 1 : 0, 5);
                    c0544Ii.A0Y(z ? 1 : 0);
                    if (c0544Ii.A0I() == 2935) {
                        i4 = 8;
                        break;
                    } else {
                        i4 = 5;
                        break;
                    }
                case 5:
                    cd = cd;
                    i = 0;
                    cd.ACg();
                    i2++;
                    if (i2 - i3 < 8192) {
                        i4 = 7;
                        break;
                    } else {
                        i4 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    cd = cd;
                    cd.A3L(i2);
                    i4 = 4;
                    break;
                case 8:
                    i++;
                    if (i < 4) {
                        i4 = 10;
                        break;
                    } else {
                        i4 = 9;
                        break;
                    }
                case 9:
                    return true;
                case 10:
                    c0544Ii = c0544Ii;
                    iA05 = C0361Ak.A05(c0544Ii.A00);
                    if (iA05 != -1) {
                        i4 = 12;
                        break;
                    } else {
                        i4 = 11;
                        break;
                    }
                case 11:
                    return z;
                case 12:
                    cd = cd;
                    cd.A3L(iA05 - 5);
                    i4 = 4;
                    break;
                case 13:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(3);
                    int iA0D = c0544Ii.A0D();
                    i3 += iA0D + 10;
                    cd.A3L(iA0D);
                    i4 = 2;
                    break;
            }
        }
    }
}
