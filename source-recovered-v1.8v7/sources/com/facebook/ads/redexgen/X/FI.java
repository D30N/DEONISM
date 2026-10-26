package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class FI extends AbstractC1165cq<SG> {
    public FI(SG sg) {
        super(sg);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        SG sgA07 = A07();
        char c2 = sgA07 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    sgA07 = sgA07;
                    if (!MF.A02(sgA07.A08)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    sgA07 = sgA07;
                    sgA07.A07();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    sgA07 = sgA07;
                    sgA07.A05.postDelayed(sgA07.A0C, 5000L);
                    c2 = 5;
                    break;
            }
        }
    }
}
