package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1038ak implements MK {
    public final /* synthetic */ C1029ab A00;

    public C1038ak(C1029ab c1029ab) {
        this.A00 = c1029ab;
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A9B() {
        C1038ak c1038ak = this;
        c1038ak.A00.A0T.A02(EnumC0564Jc.A06, null);
        c1038ak.A00.A0R.A0A().A2Y();
        char c2 = c1038ak.A00.A0V.A09(c1038ak.A00.getContext()) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C1038ak c1038ak2 = c1038ak;
                    c1038ak2.A00.A0S.A80(c1038ak2.A00.A0P.A0P(), new C0676No().A03(c1038ak2.A00.A0f).A02(c1038ak2.A00.A0V).A05());
                    return;
                case 3:
                    c1038ak = c1038ak;
                    if (!c1038ak.A00.A0I) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 4:
                    c1038ak = c1038ak;
                    if (c1038ak.A00.A09 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1038ak = c1038ak;
                    if (!c1038ak.A00.A0e()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1038ak = c1038ak;
                    c1038ak.A00.A09.A0W(P8.A07);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    c1038ak = c1038ak;
                    c1038ak.A00.A0N();
                    c2 = 7;
                    break;
                case '\t':
                    c1038ak = c1038ak;
                    if (!c1038ak.A00.A0I) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1038ak = c1038ak;
                    c1038ak.A00.A0I();
                    c2 = 7;
                    break;
            }
        }
    }
}
