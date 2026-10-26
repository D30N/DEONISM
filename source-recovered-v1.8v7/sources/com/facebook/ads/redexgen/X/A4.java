package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class A4 {
    public int A00;
    public int A01;
    public AG A02;
    public boolean A03;

    public A4() {
    }

    public /* synthetic */ A4(A1 a1) {
        this();
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        A4 a4 = this;
        int i2 = 0;
        boolean z = true;
        char c2 = a4.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    a4 = a4;
                    i2 = 4;
                    if (a4.A00 == 4) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    IJ.A03(z);
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
                case 6:
                    A4 a42 = a4;
                    a42.A03 = z;
                    a42.A00 = i;
                    return;
            }
        }
    }

    public final void A05(AG ag) {
        this.A02 = ag;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(AG ag) {
        A4 a4 = this;
        boolean z = false;
        char c2 = ag == a4.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    a4 = a4;
                    if (a4.A01 > 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    a4 = a4;
                    if (!a4.A03) {
                        c2 = 6;
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
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
