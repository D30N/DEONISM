package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RV extends AbstractC01210q {
    public final /* synthetic */ RW A00;

    public RV(RW rw) {
        this.A00 = rw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01210q
    public final void A00() {
        RV rv = this;
        boolean z = false;
        RI riA0A = rv.A00.A02.A0A();
        char c2 = rv.A00.A00 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    rv = rv;
                    riA0A = riA0A;
                    riA0A.A3a(z);
                    if (rv.A00.A00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    rv = rv;
                    rv.A00.A00.A95(rv.A00);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
