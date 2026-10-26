package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class Z6 implements InterfaceC0404Cf {
    public final int A00;
    public final int A01;
    public final C0544Ii A02;

    public Z6(Z5 z5) {
        this.A02 = z5.A00;
        this.A02.A0Y(12);
        this.A00 = this.A02.A0H();
        this.A01 = this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Cf
    public final int A6r() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Cf
    public final boolean A7f() {
        boolean z = false;
        char c2 = this.A00 != 0 ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Cf
    public final int AC9() {
        int i = this.A00;
        return i == 0 ? this.A02.A0H() : i;
    }
}
