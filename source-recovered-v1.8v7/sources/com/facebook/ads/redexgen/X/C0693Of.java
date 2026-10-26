package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0693Of extends C9C<C02967u> {
    public final /* synthetic */ C02997y A00;

    public C0693Of(C02997y c02997y) {
        this.A00 = c02997y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C02967u c02967u) {
        C0693Of c0693Of = this;
        int iA00 = c02967u.A00();
        char c2 = c0693Of.A00.A00 > 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0693Of = c0693Of;
                    if (iA00 != c0693Of.A00.A0B.getDuration()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0693Of = c0693Of;
                    if (c0693Of.A00.A0B.getDuration() <= c0693Of.A00.A00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0693Of.A00.A0b(iA00);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final Class<C02967u> A01() {
        return C02967u.class;
    }
}
