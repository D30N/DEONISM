package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0971Zb implements DI {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public CO A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final CI A09;
    public final C0544Ii A0A;
    public final String A0B;

    public C0971Zb() {
        this(null);
    }

    public C0971Zb(String str) {
        this.A02 = 0;
        this.A0A = new C0544Ii(4);
        this.A0A.A00[0] = -1;
        this.A09 = new CI();
        this.A0B = str;
    }

    private void A00(C0544Ii c0544Ii) {
        C0971Zb c0971Zb = this;
        int endOffset = 0;
        boolean z = false;
        boolean z2 = false;
        byte[] bArr = c0544Ii.A00;
        int iA06 = c0544Ii.A06();
        int iA07 = c0544Ii.A07();
        int i = 2;
        while (true) {
            switch (i) {
                case 2:
                    if (iA06 >= iA07) {
                        i = 13;
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    endOffset = 1;
                    if ((bArr[iA06] & 255) != 255) {
                        i = 12;
                        break;
                    } else {
                        i = 4;
                        break;
                    }
                case 4:
                    z = true;
                    i = 5;
                    break;
                case 5:
                    c0971Zb = c0971Zb;
                    boolean byteIsFF = c0971Zb.A08;
                    if (!byteIsFF) {
                        i = 11;
                        break;
                    } else {
                        i = 6;
                        break;
                    }
                case 6:
                    bArr = bArr;
                    if ((bArr[iA06] & 224) != 224) {
                        i = 11;
                        break;
                    } else {
                        i = 7;
                        break;
                    }
                case 7:
                    z2 = true;
                    i = 8;
                    break;
                case 8:
                    c0971Zb = c0971Zb;
                    c0971Zb.A08 = z;
                    if (!z2) {
                        i = 10;
                        break;
                    } else {
                        i = 9;
                        break;
                    }
                case 9:
                    C0971Zb c0971Zb2 = c0971Zb;
                    c0544Ii.A0Y(iA06 + 1);
                    c0971Zb2.A08 = false;
                    c0971Zb2.A0A.A00[endOffset] = bArr[iA06];
                    c0971Zb2.A00 = 2;
                    c0971Zb2.A02 = endOffset;
                    return;
                case 10:
                    iA06++;
                    i = 2;
                    break;
                case 11:
                    z2 = false;
                    i = 8;
                    break;
                case 12:
                    z = false;
                    i = 5;
                    break;
                case 13:
                    c0544Ii.A0Y(iA07);
                    return;
            }
        }
    }

    private void A01(C0544Ii c0544Ii) {
        int iMin = Math.min(c0544Ii.A04(), this.A01 - this.A00);
        this.A05.ACk(c0544Ii, iMin);
        this.A00 += iMin;
        int i = this.A00;
        int i2 = this.A01;
        if (i < i2) {
            return;
        }
        this.A05.ACl(this.A04, 1, i2, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        this.A02 = 0;
    }

    private void A02(C0544Ii c0544Ii) {
        boolean z = false;
        int i = 0;
        C0971Zb c0971Zb = this;
        int iMin = Math.min(c0544Ii.A04(), 4 - c0971Zb.A00);
        c0544Ii.A0c(c0971Zb.A0A.A00, c0971Zb.A00, iMin);
        c0971Zb.A00 += iMin;
        char c2 = c0971Zb.A00 < 4 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0971Zb = c0971Zb;
                    i = 0;
                    c0971Zb.A0A.A0Y(0);
                    z = true;
                    z = true;
                    if (!CI.A04(c0971Zb.A0A.A08(), c0971Zb.A09)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    C0971Zb c0971Zb2 = c0971Zb;
                    c0971Zb2.A00 = i;
                    c0971Zb2.A02 = z ? 1 : 0;
                    return;
                case 5:
                    c0971Zb = c0971Zb;
                    c0971Zb.A01 = c0971Zb.A09.A02;
                    if (!c0971Zb.A07) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c0971Zb = c0971Zb;
                    c0971Zb.A03 = (c0971Zb.A09.A04 * 1000000) / c0971Zb.A09.A03;
                    c0971Zb.A05.A5A(Format.A07(c0971Zb.A06, c0971Zb.A09.A06, null, -1, 4096, c0971Zb.A09.A01, c0971Zb.A09.A03, null, null, 0, c0971Zb.A0B));
                    c0971Zb.A07 = z;
                    c2 = 7;
                    break;
                case 7:
                    C0971Zb c0971Zb3 = c0971Zb;
                    c0971Zb3.A0A.A0Y(i);
                    c0971Zb3.A05.ACk(c0971Zb3.A0A, 4);
                    c0971Zb3.A02 = 2;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        C0971Zb c0971Zb = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0971Zb = c0971Zb;
                    i = c0971Zb.A02;
                    if (i == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 6:
                    c0971Zb = c0971Zb;
                    c0544Ii = c0544Ii;
                    c0971Zb.A01(c0544Ii);
                    c2 = 2;
                    break;
                case 7:
                    c0971Zb = c0971Zb;
                    c0544Ii = c0544Ii;
                    c0971Zb.A02(c0544Ii);
                    c2 = 2;
                    break;
                case '\b':
                    c0971Zb = c0971Zb;
                    c0544Ii = c0544Ii;
                    c0971Zb.A00(c0544Ii);
                    c2 = 2;
                    break;
                case '\t':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A06 = dw.A04();
        this.A05 = ce.ADd(dw.A03(), 1);
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
