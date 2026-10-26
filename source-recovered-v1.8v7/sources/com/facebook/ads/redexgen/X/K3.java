package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class K3 extends AbstractRunnableC0608Kw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PL A01;

    public K3(PL pl, int i) {
        this.A01 = pl;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        K3 k3 = this;
        char c2 = k3.A01.A00.A00.getVideoView() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    k3 = k3;
                    if (k3.A00 > 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    k3 = k3;
                    k3.A01.A00.A00.getVideoView().A0b(false, 9);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
