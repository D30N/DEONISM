package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0975Zf implements DX {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final DQ A04;
    public final C0544Ii A05 = new C0544Ii(32);

    public C0975Zf(DQ dq) {
        this.A04 = dq;
    }

    @Override // com.facebook.ads.redexgen.X.DX
    public final void A48(C0544Ii c0544Ii, boolean z) {
        C0975Zf c0975Zf = this;
        int iA0E = 0;
        int iA0E2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        int iA06 = -1;
        char c2 = z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    iA06 = c0544Ii.A06() + c0544Ii.A0E();
                    c2 = 3;
                    break;
                case 3:
                    c0975Zf = c0975Zf;
                    i3 = 0;
                    if (!c0975Zf.A03) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c0975Zf = c0975Zf;
                    c0544Ii = c0544Ii;
                    i3 = 0;
                    c0975Zf.A03 = false;
                    c0544Ii.A0Y(iA06);
                    c0975Zf.A00 = 0;
                    c2 = 7;
                    break;
                case 7:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0975Zf = c0975Zf;
                    i4 = c0975Zf.A00;
                    z2 = true;
                    z2 = true;
                    i2 = 3;
                    if (i4 >= 3) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i4 != 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0544Ii = c0544Ii;
                    int iA0E3 = c0544Ii.A0E();
                    c0544Ii.A0Y(c0544Ii.A06() - (z2 ? 1 : 0));
                    if (iA0E3 != 255) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0975Zf.A03 = z2;
                    return;
                case '\f':
                    c0975Zf = c0975Zf;
                    c0544Ii = c0544Ii;
                    int iMin = Math.min(c0544Ii.A04(), 3 - c0975Zf.A00);
                    c0544Ii.A0c(c0975Zf.A05.A00, c0975Zf.A00, iMin);
                    c0975Zf.A00 += iMin;
                    if (c0975Zf.A00 != i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0975Zf = c0975Zf;
                    c0975Zf.A05.A0W(i2);
                    c0975Zf.A05.A0Z(z2 ? 1 : 0);
                    iA0E2 = c0975Zf.A05.A0E();
                    iA0E = c0975Zf.A05.A0E();
                    if ((iA0E2 & 128) == 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0975Zf = c0975Zf;
                    c0975Zf.A02 = z2;
                    c0975Zf.A01 = (((iA0E2 & 15) << 8) | iA0E) + i2;
                    if (c0975Zf.A05.A05() >= c0975Zf.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0975Zf = c0975Zf;
                    byte[] bArr = c0975Zf.A05.A00;
                    c0975Zf.A05.A0W(Math.min(4098, Math.max(c0975Zf.A01, bArr.length * 2)));
                    System.arraycopy(bArr, i3, c0975Zf.A05.A00, i3, i2);
                    c2 = 7;
                    break;
                case 16:
                    z2 = false;
                    c2 = 14;
                    break;
                case 17:
                    c0975Zf = c0975Zf;
                    c0544Ii = c0544Ii;
                    int iMin2 = Math.min(c0544Ii.A04(), c0975Zf.A01 - c0975Zf.A00);
                    c0544Ii.A0c(c0975Zf.A05.A00, c0975Zf.A00, iMin2);
                    c0975Zf.A00 += iMin2;
                    int i5 = c0975Zf.A00;
                    i = c0975Zf.A01;
                    if (i5 != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0975Zf = c0975Zf;
                    if (!c0975Zf.A02) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0975Zf = c0975Zf;
                    if (C0560Iy.A09(c0975Zf.A05.A00, i3, c0975Zf.A01, -1) == 0) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0975Zf.A03 = z2;
                    return;
                case 21:
                    c0975Zf = c0975Zf;
                    c0975Zf.A05.A0W(c0975Zf.A01 - 4);
                    c2 = 23;
                    break;
                case 22:
                    c0975Zf = c0975Zf;
                    c0975Zf.A05.A0W(i);
                    c2 = 23;
                    break;
                case 23:
                    c0975Zf = c0975Zf;
                    c0975Zf.A04.A47(c0975Zf.A05);
                    c0975Zf.A00 = i3;
                    c2 = 7;
                    break;
                case 24:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DX
    public final void A7V(C0556Iu c0556Iu, CE ce, DW dw) {
        this.A04.A7V(c0556Iu, ce, dw);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.DX
    public final void ACo() {
        this.A03 = true;
    }
}
