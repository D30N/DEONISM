package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UL implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UL(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UL ul = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = ul.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ul = ul;
                    UN un = ul.A00;
                    abstractC02766sA07 = un.A08(un.A01.processName);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    ul = ul;
                    abstractC02766sA07 = ul.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
