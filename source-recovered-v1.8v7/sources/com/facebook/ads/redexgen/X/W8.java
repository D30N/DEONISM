package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class W8 implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public W8(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        W8 w8 = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = w8.A00.A02 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    w8 = w8;
                    WL wl = w8.A00;
                    abstractC02766sA07 = wl.A08(wl.A02.getInstallerPackageName(w8.A00.A00.getPackageName()));
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    w8 = w8;
                    abstractC02766sA07 = w8.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
