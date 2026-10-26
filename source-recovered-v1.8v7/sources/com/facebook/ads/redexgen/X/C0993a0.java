package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0993a0 extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0685Nx A00;

    public C0993a0(C0685Nx c0685Nx) {
        this.A00 = c0685Nx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A00.clearAnimation();
        C0635Ly.A0H(AdError.NETWORK_ERROR_CODE, this.A00.A06, this.A00);
        this.A00.postDelayed(this, r2.A07);
    }
}
