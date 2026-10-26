package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class RZ extends C9C<C0643Mg> {
    public final /* synthetic */ C0471Fl A00;

    public RZ(C0471Fl c0471Fl) {
        this.A00 = c0471Fl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0643Mg c0643Mg) {
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.A00.A9q(this.A00, AdError.internalError(AdError.INTERNAL_ERROR_2003));
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final Class<C0643Mg> A01() {
        return C0643Mg.class;
    }
}
