package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class XL implements InterfaceC02284v {
    public final /* synthetic */ AnonymousClass85 A00;

    public XL(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02284v
    public final boolean A7X() {
        XL xl = this;
        boolean z = false;
        char c2 = xl.A00.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    xl = xl;
                    if (!xl.A00.A0T()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
