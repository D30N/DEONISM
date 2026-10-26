package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TO extends AbstractRunnableC0596Kj {
    public final /* synthetic */ TS A00;
    public final /* synthetic */ K5 A01;

    public TO(TS ts, K5 k5) {
        this.A00 = ts;
        this.A01 = k5;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onError(this.A00.A01.A07(), K5.A00(this.A01));
        }
    }
}
