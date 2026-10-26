package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FZ extends S9 {
    public EY A00;

    public FZ(EY ey, C01421l c01421l) {
        super(ey, c01421l);
        this.A00 = ey;
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0L() {
        FZ fz = this;
        char c2 = ((S9) fz).A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    fz = fz;
                    fz.A00.A0A().A3n();
                    fz.A07.A0E(((S9) fz).A00);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    fz = fz;
                    fz.A00.A0A().A3o();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0O(InterfaceC01180n interfaceC01180n, C03188s c03188s, C03168q c03168q, Map<String, Object> map) {
        this.A00.A0A().A3h();
        RW rw = (RW) interfaceC01180n;
        S4 s4 = new S4(this, map, rw);
        A0E().postDelayed(s4, c03188s.A05().A05());
        rw.A0C(this.A00, this.A09, this.A08.A06, new S5(this, s4), map);
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0Q(String str) {
        boolean z = false;
        RI riA0A = this.A00.A0A();
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    riA0A.A3m(z);
                    super.A0Q(str);
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
