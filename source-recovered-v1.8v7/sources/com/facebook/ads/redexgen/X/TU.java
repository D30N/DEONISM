package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TU extends AbstractRunnableC0596Kj {
    public final /* synthetic */ TZ A00;
    public final /* synthetic */ K5 A01;

    public TU(TZ tz, K5 k5) {
        this.A00 = tz;
        this.A01 = k5;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A00.A02 == null) {
            return;
        }
        this.A00.A00.A02.onError(this.A00.A00.A0B, K5.A00(this.A01));
    }
}
