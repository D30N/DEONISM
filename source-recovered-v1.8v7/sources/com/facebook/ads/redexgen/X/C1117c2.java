package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.c2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1117c2 extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C1118c3 A00;

    public C1117c2(C1118c3 c1118c3) {
        this.A00 = c1118c3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A00.A0C = false;
        if (!this.A00.A0B.getQueue().isEmpty()) {
            return;
        }
        this.A00.A0B.execute(this.A00.A0A);
    }
}
