package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class IX extends C9C<C02967u> {
    public final /* synthetic */ C7N A00;

    public IX(C7N c7n) {
        this.A00 = c7n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C02967u c02967u) {
        IX ix = this;
        int currentPositionInMillis = 0;
        char c2 = !ix.A00.A05.get() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    ix = ix;
                    if (ix.A00.getVideoView() != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    ix = ix;
                    currentPositionInMillis = ix.A00.A00 - (ix.A00.getVideoView().getCurrentPositionInMillis() / AdError.NETWORK_ERROR_CODE);
                    if (currentPositionInMillis <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ix = ix;
                    ix.A00.A02.setText(ix.A00.A03 + ' ' + currentPositionInMillis);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    ix = ix;
                    ix.A00.A02.setText(ix.A00.A04);
                    ix.A00.A05.set(true);
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final Class<C02967u> A01() {
        return C02967u.class;
    }
}
