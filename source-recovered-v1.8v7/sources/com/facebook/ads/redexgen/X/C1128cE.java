package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1128cE implements InterfaceC0675Nn {
    public final /* synthetic */ C1131cH A00;

    public C1128cE(C1131cH c1131cH) {
        this.A00 = c1131cH;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0675Nn
    public final void A9h(boolean z) {
        C1128cE c1128cE = this;
        c1128cE.A00.A0D.set(z);
        char c2 = c1128cE.A00.A0E.get() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1128cE = c1128cE;
                    if (c1128cE.A00.A02 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1128cE = c1128cE;
                    c1128cE.A00.A02.AAU(z);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
