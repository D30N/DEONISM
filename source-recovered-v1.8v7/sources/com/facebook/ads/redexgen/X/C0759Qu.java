package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0759Qu extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0755Qq A00;

    public C0759Qu(C0755Qq c0755Qq) {
        this.A00 = c0755Qq;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        if (!this.A00.A03) {
            C9B c9b = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c9b.A02(new AbstractC0646Mj(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.7u
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
