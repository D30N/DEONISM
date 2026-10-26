package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class DN {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final CO A0C;

    public DN(CO co) {
        this.A0C = co;
    }

    private void A00(int i) {
        boolean z = this.A0A;
        this.A0C.ACl(this.A04, z ? 1 : 0, (int) (this.A01 - this.A03), i, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j, int i) {
        DN dn = this;
        char c2 = dn.A0B ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    dn = dn;
                    if (!dn.A06) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dn = dn;
                    dn.A0A = dn.A08;
                    dn.A0B = false;
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    dn = dn;
                    if (!dn.A05) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    dn = dn;
                    if (!dn.A06) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    dn = dn;
                    if (!dn.A09) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    dn = dn;
                    dn.A00(((int) (j - dn.A01)) + i);
                    c2 = '\t';
                    break;
                case '\t':
                    dn = dn;
                    dn.A03 = dn.A01;
                    dn.A04 = dn.A02;
                    dn.A09 = true;
                    dn.A0A = dn.A08;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A03(long j, int i, int i2, long j2) {
        DN dn = this;
        boolean z = false;
        boolean z2 = false;
        dn.A06 = false;
        dn.A05 = false;
        dn.A02 = j2;
        dn.A00 = 0;
        dn.A01 = j;
        char c2 = i2 >= 32 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    dn = dn;
                    if (!dn.A0B) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    dn = dn;
                    if (!dn.A09) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    dn = dn;
                    dn.A00(i);
                    dn.A09 = z2;
                    c2 = 5;
                    break;
                case 5:
                    if (i2 > 34) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    dn = dn;
                    dn.A05 = !dn.A0B;
                    dn.A0B = true;
                    c2 = 7;
                    break;
                case 7:
                    if (i2 < 16) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i2 > 21) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    dn = dn;
                    dn.A08 = z;
                    if (!dn.A08) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    if (i2 > 9) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    z2 = true;
                    c2 = '\r';
                    break;
                case '\r':
                    dn.A07 = z2;
                    return;
                case 14:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    public final void A04(byte[] bArr, int i, int i2) {
        DN dn = this;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        char c2 = dn.A07 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    dn = dn;
                    i3 = dn.A00;
                    i4 = (i + 2) - i3;
                    if (i4 >= i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    if ((bArr[i4] & 128) == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    dn = dn;
                    dn.A06 = z;
                    dn.A07 = false;
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    z = false;
                    c2 = 5;
                    break;
                case '\b':
                    dn = dn;
                    dn.A00 = (i2 - i) + i3;
                    c2 = 6;
                    break;
            }
        }
    }
}
