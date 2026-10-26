package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0894Wc implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0894Wc(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0894Wc c0894Wc = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = c0894Wc.A00.A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0894Wc = c0894Wc;
                    C0907Wp c0907Wp = c0894Wc.A00;
                    abstractC02766sA07 = c0907Wp.A08(c0907Wp.A00.getSimCountryIso());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    c0894Wc = c0894Wc;
                    abstractC02766sA07 = c0894Wc.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
