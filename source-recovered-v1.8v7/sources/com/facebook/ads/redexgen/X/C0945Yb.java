package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0945Yb extends AbstractRunnableC0608Kw {
    public final /* synthetic */ YY A00;
    public final /* synthetic */ boolean A01;

    public C0945Yb(YY yy, boolean z) {
        this.A00 = yy;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C0945Yb c0945Yb = this;
        boolean z = false;
        ML mlA08 = c0945Yb.A00.A0E.A08();
        char c2 = mlA08 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0945Yb = c0945Yb;
                    if (!c0945Yb.A01) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    mlA08 = mlA08;
                    if (!mlA08.A06()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    c0945Yb = c0945Yb;
                    mlA08 = mlA08;
                    mlA08.setPageDetailsVisible(z);
                    mlA08.setToolbarActionMode(c0945Yb.A00.getCloseButtonStyle());
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
