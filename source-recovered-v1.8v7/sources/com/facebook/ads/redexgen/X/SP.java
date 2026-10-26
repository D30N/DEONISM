package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class SP extends AbstractC01190o {
    public final /* synthetic */ SR A00;

    public SP(SR sr) {
        this.A00 = sr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A00() {
        this.A00.A02 = false;
        this.A00.A05.onInterstitialActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A02() {
        this.A00.A02 = false;
        if (this.A00.A01 != null) {
            this.A00.A01.A0P(new SO(this));
            this.A00.A01.A0J();
            this.A00.A01 = null;
        }
        this.A00.A05.onInterstitialDismissed(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A04() {
        this.A00.A05.onInterstitialDisplayed(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A05() {
        this.A00.A05.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A06() {
        this.A00.A05.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A07() {
        this.A00.A05.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0C() {
        this.A00.A04.A0A().A2X();
        this.A00.A05.onAdClicked(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0D() {
        this.A00.A05.onLoggingImpression(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0F(InterfaceC01180n interfaceC01180n) {
        this.A00.A03 = true;
        this.A00.A05.onAdLoaded(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0G(K5 k5) {
        this.A00.A04.A0A().A2c(C0627Lq.A01(this.A00.A00), k5.A04().getErrorCode(), k5.A05());
        this.A00.A05.onError(this.A00.A06.A01(), K5.A00(k5));
    }
}
