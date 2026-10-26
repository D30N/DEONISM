package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076bM implements MK {
    public final /* synthetic */ C02304x A00;
    public final /* synthetic */ AbstractC1055b1 A01;

    public C1076bM(AbstractC1055b1 abstractC1055b1, C02304x c02304x) {
        this.A01 = abstractC1055b1;
        this.A00 = c02304x;
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A9B() {
        C1076bM c1076bM = this;
        c1076bM.A01.A0C.A02(EnumC0564Jc.A06, null);
        char c2 = c1076bM.A01.A0h() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1076bM = c1076bM;
                    if (!c1076bM.A01.A0d()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1076bM = c1076bM;
                    c1076bM.A01.A0c(c1076bM.A00);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1076bM = c1076bM;
                    c1076bM.A00.finish(1);
                    c2 = 5;
                    break;
            }
        }
    }
}
