package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Y0 implements LN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0608Kw A01;
    public final /* synthetic */ AbstractC0941Xx A02;

    public Y0(AbstractC0941Xx abstractC0941Xx, int i, AbstractRunnableC0608Kw abstractRunnableC0608Kw) {
        this.A02 = abstractC0941Xx;
        this.A00 = i;
        this.A01 = abstractRunnableC0608Kw;
    }

    @Override // com.facebook.ads.redexgen.X.LN
    public final void A9E() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.LN
    public final void AAh(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
