package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0563Jb extends C9C<C02967u> {
    public final /* synthetic */ C02877g A00;

    public C0563Jb(C02877g c02877g) {
        this.A00 = c02877g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C02967u c02967u) {
        if (this.A00.getVideoView() != null) {
            this.A00.A00.setText(this.A00.A05(r2.getVideoView().getDuration() - this.A00.getVideoView().getCurrentPositionInMillis()));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final Class<C02967u> A01() {
        return C02967u.class;
    }
}
