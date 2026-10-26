package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZV implements DI {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<DT> A04;
    public final CO[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{67, 82, 82, 78, 75, 69, 67, 86, 75, 81, 80, 17, 70, 88, 68, 85, 87, 68, 85};
    }

    public ZV(List<DT> list) {
        this.A04 = list;
        this.A05 = new CO[list.size()];
    }

    private boolean A02(C0544Ii c0544Ii, int i) {
        ZV zv = this;
        char c2 = c0544Ii.A04() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() == i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zv = zv;
                    zv.A03 = false;
                    c2 = 5;
                    break;
                case 5:
                    r2.A00--;
                    return zv.A03;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        ZV zv = this;
        CO[] coArr = null;
        int i = 0;
        int length = 0;
        int iA06 = 0;
        int iA04 = 0;
        char c2 = zv.A03 ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    zv = zv;
                    if (zv.A00 != 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zv = zv;
                    c0544Ii = c0544Ii;
                    if (!zv.A02(c0544Ii, 32)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    zv = zv;
                    i = 0;
                    if (zv.A00 != 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    zv = zv;
                    c0544Ii = c0544Ii;
                    i = 0;
                    if (!zv.A02(c0544Ii, 0)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    zv = zv;
                    c0544Ii = c0544Ii;
                    iA06 = c0544Ii.A06();
                    iA04 = c0544Ii.A04();
                    coArr = zv.A05;
                    length = coArr.length;
                    c2 = '\t';
                    break;
                case '\t':
                    if (i >= length) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0544Ii = c0544Ii;
                    coArr = coArr;
                    CO co = coArr[i];
                    c0544Ii.A0Y(iA06);
                    co.ACk(c0544Ii, iA04);
                    i++;
                    c2 = '\t';
                    break;
                case 11:
                    zv = zv;
                    zv.A01 += iA04;
                    c2 = '\f';
                    break;
                case '\f':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        CE ce2 = ce;
        DW dw2 = dw;
        ZV zv = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    zv = zv;
                    if (i >= zv.A05.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zv = zv;
                    ce2 = ce2;
                    dw2 = dw2;
                    DT dt = zv.A04.get(i);
                    dw2.A05();
                    CO coADd = ce2.ADd(dw2.A03(), 3);
                    coADd.A5A(Format.A0A(dw2.A04(), A00(0, 19, k.AppCompatTheme_windowFixedWidthMajor), null, -1, 0, Collections.singletonList(dt.A02), dt.A01, null));
                    zv.A05[i] = coADd;
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
        ZV zv = this;
        CO[] coArr = null;
        int i = 0;
        int length = 0;
        char c2 = zv.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    zv = zv;
                    coArr = zv.A05;
                    length = coArr.length;
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i >= length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zv = zv;
                    coArr = coArr;
                    coArr[i].ACl(zv.A02, 1, zv.A01, 0, null);
                    i++;
                    c2 = 3;
                    break;
                case 5:
                    zv = zv;
                    zv.A03 = false;
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        this.A03 = false;
    }
}
