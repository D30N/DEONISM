package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SS extends AbstractC01190o {
    public final /* synthetic */ SU A00;

    public SS(SU su) {
        this.A00 = su;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A05() {
        this.A00.A05.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A06() {
        this.A00.A05.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A07() {
        this.A00.A05.onRewardedVideoCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A08() {
        this.A00.A05.onRewardedVideoActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A09() {
        this.A00.A05.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0C() {
        this.A00.A05.onAdClicked(this.A00.A06.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0D() {
        this.A00.A05.onLoggingImpression(this.A00.A06.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0F(InterfaceC01180n interfaceC01180n) {
        SU su = this.A00;
        su.A03 = su.A02.A0G();
        AbstractC0782Rr abstractC0782Rr = (AbstractC0782Rr) interfaceC01180n;
        if (this.A00.A06.A03 != null) {
            abstractC0782Rr.A01(this.A00.A06.A03);
        }
        this.A00.A06.A00 = abstractC0782Rr.A0A();
        this.A00.A04 = true;
        this.A00.A05.onAdLoaded(this.A00.A06.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0G(K5 k5) {
        this.A00.A09(true);
        this.A00.A06.A0B.A0A().A2c(C0627Lq.A01(this.A00.A01), k5.A04().getErrorCode(), k5.A05());
        this.A00.A05.onError(this.A00.A06.A00(), K5.A00(k5));
    }
}
