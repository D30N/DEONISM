package com.facebook.ads.redexgen.X;

import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public class XS extends AbstractRunnableC0608Kw {
    public final /* synthetic */ XJ A00;

    public XS(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        XS xs = this;
        Iterator it = C8U.A06.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xs = xs;
                    it = it;
                    C8V event = (C8V) it.next();
                    C8U.A0A(xs.A00, event.A02(), event.A00(), event.A01(), false);
                    c2 = 2;
                    break;
                case 4:
                    C8U.A06.clear();
                    return;
            }
        }
    }
}
