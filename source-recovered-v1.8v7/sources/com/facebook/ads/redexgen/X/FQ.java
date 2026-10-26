package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FQ extends S9 {
    public FQ(XI xi, C01421l c01421l) {
        super(xi, c01421l);
    }

    private InterfaceC01290y A00(Runnable runnable) {
        return new SC(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0L() {
        ((C0768Rd) this.A02).A0A();
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0O(InterfaceC01180n interfaceC01180n, C03188s c03188s, C03168q c03168q, Map<String, Object> map) {
        C0768Rd c0768Rd = (C0768Rd) interfaceC01180n;
        SB sb = new SB(this, map, c0768Rd);
        A0E().postDelayed(sb, c03188s.A05().A05());
        c0768Rd.A09(this.A0C, A00(sb), map, this.A08.A09, this.A08.A03, this.A08.A04, this.A08.A01);
    }
}
