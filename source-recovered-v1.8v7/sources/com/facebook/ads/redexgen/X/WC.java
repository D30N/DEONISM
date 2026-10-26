package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class WC implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WC(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WC wc = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = wc.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    wc = wc;
                    WL wl = wc.A00;
                    abstractC02766sA07 = wl.A06(wl.A01.firstInstallTime);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    wc = wc;
                    abstractC02766sA07 = wc.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
