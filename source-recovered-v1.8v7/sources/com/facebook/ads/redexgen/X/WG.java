package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class WG implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WG(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WG wg = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = wg.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    wg = wg;
                    WL wl = wg.A00;
                    abstractC02766sA07 = wl.A08(wl.A01.packageName);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    wg = wg;
                    abstractC02766sA07 = wg.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
