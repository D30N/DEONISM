package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T8 implements InterfaceC01823a {
    public final /* synthetic */ C0452Eq A00;

    public T8(C0452Eq c0452Eq) {
        this.A00 = c0452Eq;
    }

    private final void A00(C01833b c01833b) {
        T8 t8 = this;
        int i = c01833b.A00;
        char c2 = i != 1 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    t8 = t8;
                    c01833b = c01833b;
                    t8.A00.A06.A1S(t8.A00, c01833b.A02, c01833b.A01, 1);
                    c2 = 5;
                    break;
                case 7:
                    t8 = t8;
                    c01833b = c01833b;
                    t8.A00.A06.A1T(t8.A00, c01833b.A02, c01833b.A01, c01833b.A03);
                    c2 = 5;
                    break;
                case '\b':
                    t8 = t8;
                    c01833b = c01833b;
                    t8.A00.A06.A1R(t8.A00, c01833b.A02, c01833b.A01);
                    c2 = 5;
                    break;
                case '\t':
                    t8 = t8;
                    c01833b = c01833b;
                    t8.A00.A06.A1Q(t8.A00, c01833b.A02, c01833b.A01);
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final C4Y A57(int i) {
        T8 t8 = this;
        C4Y c4yA1E = t8.A00.A1E(i, true);
        char c2 = c4yA1E == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C4Y) null;
                case 3:
                    t8 = t8;
                    c4yA1E = c4yA1E;
                    if (!t8.A00.A01.A0K(c4yA1E.A0H)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (C4Y) null;
                case 5:
                    return c4yA1E;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A8T(int i, int i2, Object obj) {
        this.A00.A1d(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A8h(int i, int i2) {
        this.A00.A1a(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A8i(int i, int i2) {
        this.A00.A1b(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A8j(int i, int i2) {
        this.A00.A1e(i, i2, true);
        C0452Eq c0452Eq = this.A00;
        c0452Eq.A0G = true;
        c0452Eq.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A8k(int i, int i2) {
        this.A00.A1e(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A9L(C01833b c01833b) {
        A00(c01833b);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01823a
    public final void A9N(C01833b c01833b) {
        A00(c01833b);
    }
}
