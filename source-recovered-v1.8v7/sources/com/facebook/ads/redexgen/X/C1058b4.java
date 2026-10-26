package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1058b4 implements LN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1055b1 A01;

    public C1058b4(AbstractC1055b1 abstractC1055b1, int i) {
        this.A01 = abstractC1055b1;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.LN
    public final void A9E() {
        this.A01.A03 = false;
        this.A01.A0W();
        this.A01.A0D.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.LN
    public final void AAh(float f) {
        this.A01.A0D.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
