package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TX extends AbstractRunnableC0596Kj {
    public final /* synthetic */ TZ A00;

    public TX(TZ tz) {
        this.A00 = tz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A00.A02 != null) {
            this.A00.A00.A02.onLoggingImpression(this.A00.A00.A0B);
        }
    }
}
