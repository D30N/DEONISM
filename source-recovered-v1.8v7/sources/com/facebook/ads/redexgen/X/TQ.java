package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TQ extends AbstractRunnableC0596Kj {
    public final /* synthetic */ TS A00;

    public TQ(TS ts) {
        this.A00 = ts;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A01.A06() == null) {
            return;
        }
        this.A00.A01.A06().onAdClicked(this.A00.A01.A07());
    }
}
