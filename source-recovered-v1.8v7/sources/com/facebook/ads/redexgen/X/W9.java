package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class W9 implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public W9(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        W9 w9 = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = w9.A00.A02 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    w9 = w9;
                    WL wl = w9.A00;
                    abstractC02766sA07 = wl.A0F(wl.A02.isSafeMode());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    w9 = w9;
                    abstractC02766sA07 = w9.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
