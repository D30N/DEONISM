package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UK implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UK(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UK uk = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = uk.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uk = uk;
                    UN un = uk.A00;
                    abstractC02766sA07 = un.A04(un.A01.importance);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    uk = uk;
                    abstractC02766sA07 = uk.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
