package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class YE extends Q0 {
    public final /* synthetic */ Y4 A00;

    public YE(Y4 y4) {
        this.A00 = y4;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        YE ye = this;
        char c2 = !ye.A00.A0B.A07() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ye = ye;
                    ye.A00.A0B.A05();
                    ye.A00.A08.A87(ye.A00.A05.A0P(), new C0676No().A03(ye.A00.A0H).A02(ye.A00.A0B).A05());
                    ye.A00.A07.A0A().A2Z();
                    if (ye.A00.A0C == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ye = ye;
                    ye.A00.A0C.A3r(ye.A00.A0D.A6O());
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
