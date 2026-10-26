package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1003aB extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0674Nm A00;

    public C1003aB(C0674Nm c0674Nm) {
        this.A00 = c0674Nm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A00.A03();
        if (this.A00.A08) {
            this.A00.A0D.postDelayed(this.A00.A0F, 250L);
        }
    }
}
