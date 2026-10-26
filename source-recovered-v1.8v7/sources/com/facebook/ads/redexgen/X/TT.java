package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class TT extends AbstractRunnableC0596Kj {
    public final /* synthetic */ AnonymousClass56 A00;

    public TT(AnonymousClass56 anonymousClass56) {
        this.A00 = anonymousClass56;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A02 != null) {
            this.A00.A02.onError(this.A00.A0B, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
        }
    }
}
