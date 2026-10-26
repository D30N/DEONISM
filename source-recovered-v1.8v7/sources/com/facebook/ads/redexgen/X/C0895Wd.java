package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0895Wd implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0895Wd(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0895Wd c0895Wd = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = c0895Wd.A00.A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0895Wd = c0895Wd;
                    C0907Wp c0907Wp = c0895Wd.A00;
                    abstractC02766sA07 = c0907Wp.A04(c0907Wp.A00.getSimState());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    c0895Wd = c0895Wd;
                    abstractC02766sA07 = c0895Wd.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
