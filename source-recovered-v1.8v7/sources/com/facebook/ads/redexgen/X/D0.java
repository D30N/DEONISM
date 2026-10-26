package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class D0 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C0408Cj A07;
    public C0417Cz A08;
    public C0544Ii A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i) {
        return this.A0F[i] + this.A0C[i];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    public final void A02(int i) {
        D0 d0 = this;
        C0544Ii c0544Ii = d0.A09;
        char c2 = c0544Ii != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A07() >= i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    d0 = d0;
                    d0.A09 = new C0544Ii(i);
                    c2 = 4;
                    break;
                case 4:
                    D0 d02 = d0;
                    d02.A01 = i;
                    d02.A0A = true;
                    d02.A0B = true;
                    return;
            }
        }
    }

    public final void A03(int i, int i2) {
        D0 d0 = this;
        int[] iArr = null;
        d0.A02 = i;
        d0.A00 = i2;
        int[] iArr2 = d0.A0E;
        char c2 = iArr2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    iArr2 = iArr2;
                    if (iArr2.length >= i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    d0 = d0;
                    d0.A0G = new long[i];
                    d0.A0E = new int[i];
                    c2 = 4;
                    break;
                case 4:
                    d0 = d0;
                    iArr = d0.A0D;
                    if (iArr == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    iArr = iArr;
                    if (iArr.length >= i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    d0 = d0;
                    int i3 = (i2 * 125) / 100;
                    d0.A0D = new int[i3];
                    d0.A0C = new int[i3];
                    d0.A0F = new long[i3];
                    d0.A0I = new boolean[i3];
                    d0.A0H = new boolean[i3];
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A04(CD cd) throws InterruptedException, IOException {
        cd.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(C0544Ii c0544Ii) {
        c0544Ii.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
