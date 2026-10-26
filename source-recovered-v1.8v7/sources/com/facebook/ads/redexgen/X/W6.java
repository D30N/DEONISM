package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class W6 implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public W6(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        W6 w6 = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = w6.A00.A06 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    w6 = w6;
                    WL wl = w6.A00;
                    abstractC02766sA07 = wl.A04(wl.A06.length);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    w6 = w6;
                    abstractC02766sA07 = w6.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
