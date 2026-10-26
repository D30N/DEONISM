package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class ZU implements DI {
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public CO A07;
    public String A08;
    public final String A0A;
    public final C0544Ii A09 = new C0544Ii(new byte[18]);
    public int A02 = 0;

    public ZU(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = BL.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5A(this.A06);
        }
        this.A01 = BL.A01(bArr);
        this.A04 = (int) ((BL.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(C0544Ii c0544Ii) {
        ZU zu = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zu = zu;
                    c0544Ii = c0544Ii;
                    zu.A03 <<= 8;
                    zu.A03 |= c0544Ii.A0E();
                    if (!BL.A07(zu.A03)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ZU zu2 = zu;
                    zu2.A09.A00[0] = (byte) ((zu2.A03 >> 24) & 255);
                    zu2.A09.A00[1] = (byte) ((zu2.A03 >> 16) & 255);
                    zu2.A09.A00[2] = (byte) ((zu2.A03 >> 8) & 255);
                    zu2.A09.A00[3] = (byte) (zu2.A03 & 255);
                    zu2.A00 = 4;
                    zu2.A03 = 0;
                    return true;
                case 5:
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
        ZU zu = this;
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
                    zu = zu;
                    i3 = zu.A02;
                    i4 = 1;
                    if (i3 == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i5 = 2;
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
                    zu = zu;
                    c0544Ii2 = c0544Ii2;
                    int iMin = Math.min(c0544Ii2.A04(), zu.A01 - zu.A00);
                    zu.A07.ACk(c0544Ii2, iMin);
                    zu.A00 += iMin;
                    int i6 = zu.A00;
                    i2 = zu.A01;
                    if (i6 != i2) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    zu = zu;
                    zu.A07.ACl(zu.A05, 1, i2, 0, null);
                    zu.A05 += zu.A04;
                    zu.A02 = 0;
                    c2 = 2;
                    break;
                case '\b':
                    zu = zu;
                    c0544Ii2 = c0544Ii2;
                    i = 18;
                    if (!zu.A02(c0544Ii2, zu.A09.A00, 18)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    zu = zu;
                    zu.A00();
                    zu.A09.A0Y(0);
                    zu.A07.ACk(zu.A09, i);
                    zu.A02 = i5;
                    c2 = 2;
                    break;
                case '\n':
                    zu = zu;
                    c0544Ii2 = c0544Ii2;
                    if (!zu.A01(c0544Ii2)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    zu = zu;
                    zu.A02 = i4;
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
        this.A08 = dw.A04();
        this.A07 = ce.ADd(dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
