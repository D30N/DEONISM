package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D3 {
    public int A01;
    public boolean A02;
    public final D4 A03 = new D4();
    public final C0544Ii A04 = new C0544Ii(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i) {
        D3 d3 = this;
        d3.A01 = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    d3 = d3;
                    if (d3.A01 + i >= d3.A03.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    d3 = d3;
                    int[] iArr = d3.A03.A09;
                    int i3 = d3.A01;
                    d3.A01 = i3 + 1;
                    int i4 = iArr[i3 + i];
                    i2 += i4;
                    if (i4 == 255) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i2;
            }
        }
    }

    public final D4 A01() {
        return this.A03;
    }

    public final C0544Ii A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C0544Ii c0544Ii = this.A04;
        c0544Ii.A00 = Arrays.copyOf(c0544Ii.A00, Math.max(65025, this.A04.A07()));
    }

    public final boolean A05(CD cd) throws InterruptedException, IOException {
        D3 d3 = this;
        boolean z = false;
        int bytesToSkip = 0;
        int iA00 = 0;
        int iA002 = 0;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        char c2 = cd != null ? (char) 2 : (char) 24;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    d3 = d3;
                    IJ.A04(z2);
                    if (!d3.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    d3 = d3;
                    z3 = false;
                    d3.A02 = false;
                    d3.A04.A0V();
                    c2 = 5;
                    break;
                case 5:
                    d3 = d3;
                    if (!d3.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 6:
                    d3 = d3;
                    if (d3.A00 >= 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    d3 = d3;
                    cd = cd;
                    if (!d3.A03.A03(cd, true)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return z3;
                case '\t':
                    d3 = d3;
                    i = 0;
                    iA002 = d3.A03.A01;
                    if ((d3.A03.A04 & 1) != 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    d3 = d3;
                    if (d3.A04.A07() != 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    d3 = d3;
                    iA002 += d3.A00(0);
                    i = 0 + d3.A01;
                    c2 = '\f';
                    break;
                case '\f':
                    d3 = d3;
                    cd = cd;
                    cd.ADL(iA002);
                    d3.A00 = i;
                    c2 = '\r';
                    break;
                case '\r':
                    d3 = d3;
                    iA00 = d3.A00(d3.A00);
                    bytesToSkip = d3.A00 + d3.A01;
                    if (iA00 <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    d3 = d3;
                    if (d3.A04.A05() >= d3.A04.A07() + iA00) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    d3 = d3;
                    C0544Ii c0544Ii = d3.A04;
                    c0544Ii.A00 = Arrays.copyOf(c0544Ii.A00, d3.A04.A07() + iA00);
                    c2 = 16;
                    break;
                case 16:
                    d3 = d3;
                    cd = cd;
                    cd.readFully(d3.A04.A00, d3.A04.A07(), iA00);
                    C0544Ii c0544Ii2 = d3.A04;
                    c0544Ii2.A0X(c0544Ii2.A07() + iA00);
                    if (d3.A03.A09[bytesToSkip - 1] == 255) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z = true;
                    c2 = 18;
                    break;
                case 18:
                    d3 = d3;
                    d3.A02 = z;
                    c2 = 19;
                    break;
                case 19:
                    d3 = d3;
                    if (bytesToSkip != d3.A03.A02) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    i2 = -1;
                    c2 = 21;
                    break;
                case 21:
                    d3 = d3;
                    d3.A00 = i2;
                    c2 = 5;
                    break;
                case 22:
                    i2 = bytesToSkip;
                    c2 = 21;
                    break;
                case 23:
                    z = false;
                    c2 = 18;
                    break;
                case 24:
                    z2 = false;
                    c2 = 3;
                    break;
                case 25:
                    return true;
            }
        }
    }
}
