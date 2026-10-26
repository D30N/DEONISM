package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0778Rn extends AbstractRunnableC0596Kj {
    public final /* synthetic */ C0780Rp A00;

    public C0778Rn(C0780Rp c0780Rp) {
        this.A00 = c0780Rp;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.onAdClicked(this.A00.A03);
    }
}
