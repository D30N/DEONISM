package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class WJ implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WJ(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WJ wj = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = wj.A00.A04 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    wj = wj;
                    WL wl = wj.A00;
                    abstractC02766sA07 = wl.A04(wl.A04.length);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    wj = wj;
                    abstractC02766sA07 = wj.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
