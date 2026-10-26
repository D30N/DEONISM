package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UI implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UI(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UI ui = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = ui.A00.A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ui = ui;
                    UN un = ui.A00;
                    abstractC02766sA07 = un.A04(un.A00.reqNavigation);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    ui = ui;
                    abstractC02766sA07 = ui.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
