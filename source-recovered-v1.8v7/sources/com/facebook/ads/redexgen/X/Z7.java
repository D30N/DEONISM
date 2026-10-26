package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class Z7 implements InterfaceC0404Cf {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C0544Ii A04;

    public Z7(Z5 z5) {
        this.A04 = z5.A00;
        this.A04.A0Y(12);
        this.A02 = this.A04.A0H() & 255;
        this.A03 = this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Cf
    public final int A6r() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Cf
    public final boolean A7f() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Cf
    public final int AC9() {
        Z7 z7 = this;
        int i = z7.A02;
        char c2 = i == 8 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z7.A04.A0E();
                case 3:
                    if (i != 16) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z7.A04.A0I();
                case 5:
                    z7 = z7;
                    int i2 = z7.A01;
                    z7.A01 = i2 + 1;
                    if (i2 % 2 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    Z7 z72 = z7;
                    z72.A00 = z72.A04.A0E();
                    return (z72.A00 & 240) >> 4;
                case 7:
                    return z7.A00 & 15;
            }
        }
    }
}
