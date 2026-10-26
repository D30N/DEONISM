package com.facebook.ads.redexgen.X;

import android.R;

/* renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1074bK extends AbstractRunnableC0608Kw {
    public final /* synthetic */ MX A00;

    public C1074bK(MX mx) {
        this.A00 = mx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0H().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
