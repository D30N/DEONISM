package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class R5 implements InterfaceC02284v {
    public final /* synthetic */ C02304x A00;
    public final /* synthetic */ AnonymousClass83 A01;

    public R5(AnonymousClass83 anonymousClass83, C02304x c02304x) {
        this.A01 = anonymousClass83;
        this.A00 = c02304x;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02284v
    public final boolean A7X() {
        R5 r5 = this;
        char c2 = r5.A01.A0d() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    R5 r52 = r5;
                    r52.A01.A0c(r52.A00);
                    return true;
                case 3:
                    r5 = r5;
                    if (!r5.A01.A0f()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return true;
                case 5:
                    return r5.A01.A0g();
            }
        }
    }
}
