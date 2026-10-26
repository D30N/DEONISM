package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class P1 extends C9C<C02977v> {
    public final /* synthetic */ C02997y A00;

    public P1(C02997y c02997y) {
        this.A00 = c02997y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C02977v c02977v) {
        boolean z = false;
        this.A00.A0V();
        C02997y c02997y = this.A00;
        int iA00 = c02977v.A00();
        char c2 = ((double) c02977v.A00()) < 2000.0d ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c02997y.A0e(iA00, false, z);
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final Class<C02977v> A01() {
        return C02977v.class;
    }
}
