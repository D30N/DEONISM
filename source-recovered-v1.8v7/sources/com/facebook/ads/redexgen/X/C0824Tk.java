package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0824Tk extends AbstractRunnableC0596Kj {
    public final /* synthetic */ C0827Tn A00;
    public final /* synthetic */ K5 A01;

    public C0824Tk(C0827Tn c0827Tn, K5 k5) {
        this.A00 = c0827Tn;
        this.A01 = k5;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A00.A00.A02() != null) {
            this.A00.A00.A02().onAdError(K5.A00(this.A01));
        }
    }
}
