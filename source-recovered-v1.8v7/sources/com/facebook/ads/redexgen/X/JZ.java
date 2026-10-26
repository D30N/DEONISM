package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JZ extends AbstractRunnableC0608Kw {
    public final /* synthetic */ PM A00;

    public JZ(PM pm) {
        this.A00 = pm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        JZ jz = this;
        char c2 = !jz.A00.A00.A00.A0A ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jz = jz;
                    if (!jz.A00.A00.A00.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jz = jz;
                    jz.A00.A00.A00.A05();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
