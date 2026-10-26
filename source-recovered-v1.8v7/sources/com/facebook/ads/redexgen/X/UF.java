package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UF implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UF(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UF uf = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = uf.A00.A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uf = uf;
                    UN un = uf.A00;
                    abstractC02766sA07 = un.A08(un.A00.getGlEsVersion());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    uf = uf;
                    abstractC02766sA07 = uf.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
