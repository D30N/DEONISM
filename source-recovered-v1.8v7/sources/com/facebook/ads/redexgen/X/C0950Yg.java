package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0950Yg extends AbstractRunnableC0608Kw {
    public final /* synthetic */ YY A00;

    public C0950Yg(YY yy) {
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C0635Ly.A0I(AdError.NETWORK_ERROR_CODE, this.A00.A0F);
        this.A00.postDelayed(this, 2000L);
    }
}
