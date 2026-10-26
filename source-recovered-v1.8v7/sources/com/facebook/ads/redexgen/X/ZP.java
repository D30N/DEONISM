package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class ZP implements DI {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public CO A06;
    public String A07;
    public boolean A08;
    public final C0543Ih A09;
    public final C0544Ii A0A;
    public final String A0B;

    public ZP() {
        this(null);
    }

    public ZP(String str) {
        this.A09 = new C0543Ih(new byte[128]);
        this.A0A = new C0544Ii(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    private void A00() {
        ZP zp = this;
        zp.A09.A07(0);
        C0360Aj c0360AjA09 = C0361Ak.A09(zp.A09);
        char c2 = zp.A05 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    zp = zp;
                    c0360AjA09 = c0360AjA09;
                    if (c0360AjA09.A00 != zp.A05.A05) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zp = zp;
                    c0360AjA09 = c0360AjA09;
                    if (c0360AjA09.A03 != zp.A05.A0C) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zp = zp;
                    c0360AjA09 = c0360AjA09;
                    if (c0360AjA09.A05 == zp.A05.A0O) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zp = zp;
                    c0360AjA09 = c0360AjA09;
                    zp.A05 = Format.A07(zp.A07, c0360AjA09.A05, null, -1, -1, c0360AjA09.A00, c0360AjA09.A03, null, null, 0, zp.A0B);
                    zp.A06.A5A(zp.A05);
                    c2 = 6;
                    break;
                case 6:
                    ZP zp2 = zp;
                    zp2.A01 = c0360AjA09.A01;
                    zp2.A03 = (r1.A02 * 1000000) / zp2.A05.A0C;
                    return;
            }
        }
    }

    private boolean A01(C0544Ii c0544Ii) {
        ZP zp = this;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int iA0E = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    z2 = false;
                    if (c0544Ii.A04() <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zp = zp;
                    i = 11;
                    z = true;
                    if (!zp.A08) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z2 = true;
                    c2 = 6;
                    break;
                case 6:
                    zp = zp;
                    zp.A08 = z2;
                    c2 = 2;
                    break;
                case 7:
                    c0544Ii = c0544Ii;
                    iA0E = c0544Ii.A0E();
                    if (iA0E != 119) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    zp.A08 = false;
                    return z;
                case '\t':
                    if (iA0E != i) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z2 = true;
                    c2 = 11;
                    break;
                case 11:
                    zp = zp;
                    zp.A08 = z2;
                    c2 = 2;
                    break;
                case '\f':
                    return false;
            }
        }
    }

    private boolean A02(C0544Ii c0544Ii, byte[] bArr, int i) {
        boolean z = false;
        int iMin = Math.min(c0544Ii.A04(), i - this.A00);
        c0544Ii.A0c(bArr, this.A00, iMin);
        this.A00 += iMin;
        char c2 = this.A00 == i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        C0544Ii c0544Ii2 = c0544Ii;
        ZP zp = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A04() <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zp = zp;
                    i3 = zp.A02;
                    i5 = 2;
                    i4 = 1;
                    if (i3 == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i3 == i4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i3 == i5) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 6:
                    zp = zp;
                    c0544Ii2 = c0544Ii2;
                    int iMin = Math.min(c0544Ii2.A04(), zp.A01 - zp.A00);
                    zp.A06.ACk(c0544Ii2, iMin);
                    zp.A00 += iMin;
                    int i6 = zp.A00;
                    i2 = zp.A01;
                    if (i6 != i2) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    zp = zp;
                    zp.A06.ACl(zp.A04, 1, i2, 0, null);
                    zp.A04 += zp.A03;
                    zp.A02 = 0;
                    c2 = 2;
                    break;
                case '\b':
                    zp = zp;
                    c0544Ii2 = c0544Ii2;
                    i = 128;
                    if (!zp.A02(c0544Ii2, zp.A0A.A00, 128)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    zp = zp;
                    zp.A00();
                    zp.A0A.A0Y(0);
                    zp.A06.ACk(zp.A0A, i);
                    zp.A02 = i5;
                    c2 = 2;
                    break;
                case '\n':
                    zp = zp;
                    c0544Ii2 = c0544Ii2;
                    if (!zp.A01(c0544Ii2)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    zp = zp;
                    zp.A02 = i4;
                    zp.A0A.A00[0] = 11;
                    zp.A0A.A00[i4] = 119;
                    zp.A00 = i5;
                    c2 = 2;
                    break;
                case '\f':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A07 = dw.A04();
        this.A06 = ce.ADd(dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
