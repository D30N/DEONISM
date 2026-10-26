package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0825Tl extends AbstractRunnableC0596Kj {
    public final /* synthetic */ C0826Tm A00;

    public C0825Tl(C0826Tm c0826Tm) {
        this.A00 = c0826Tm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A01.A00.A02() == null) {
            return;
        }
        this.A00.A01.A00.A02().onAdsLoaded();
    }
}
