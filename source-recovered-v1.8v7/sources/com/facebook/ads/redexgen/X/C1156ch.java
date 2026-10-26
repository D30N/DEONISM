package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1156ch extends AbstractRunnableC0608Kw {
    public final /* synthetic */ LO A00;

    public C1156ch(LO lo) {
        this.A00 = lo;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        if (this.A00.A05()) {
            this.A00.A01();
            this.A00.A03.postDelayed(this, 250L);
        }
    }
}
