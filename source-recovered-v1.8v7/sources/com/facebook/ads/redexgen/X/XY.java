package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class XY implements InterfaceC02284v {
    public final /* synthetic */ C03148o A00;

    public XY(C03148o c03148o) {
        this.A00 = c03148o;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02284v
    public final boolean A7X() {
        XY xy = this;
        boolean z = false;
        char c2 = xy.A00.A04.get() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    xy = xy;
                    if (!xy.A00.A0T()) {
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
