package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0447El extends AbstractC0604Ks {
    public final /* synthetic */ C5A A00;

    public C0447El(C5A c5a) {
        this.A00 = c5a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(L4 l4) {
        if (this.A00.A08 != null) {
            C1141cR.A0J(this.A00.A08.getInternalNativeAd()).A1T(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
