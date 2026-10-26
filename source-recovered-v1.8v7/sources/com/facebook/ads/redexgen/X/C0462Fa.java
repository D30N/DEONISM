package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0462Fa extends AbstractC0785Ru {
    public final XI A00;

    public C0462Fa(C1V c1v, List<C1141cR> list, XI xi) {
        super(c1v, list, xi);
        this.A00 = xi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1111bw A0C(ViewGroup viewGroup, int i) {
        return new C1111bw(new MW(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0785Ru, com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A0H */
    public final void A0E(C1111bw c1111bw, int i) {
        super.A0E(c1111bw, i);
        MW mw = (MW) c1111bw.A0l();
        C0648Ml c0648Ml = (C0648Ml) mw.getImageCardView();
        c0648Ml.setImageDrawable(null);
        A0F(c0648Ml, i);
        C1141cR c1141cR = ((AbstractC0785Ru) this).A01.get(i);
        c1141cR.A0w().A0D(this.A00);
        c1141cR.A1G(mw, mw);
    }
}
