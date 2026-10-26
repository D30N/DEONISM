package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class OK extends C9C<C02987x> {
    public final /* synthetic */ C02997y A00;

    public OK(C02997y c02997y) {
        this.A00 = c02997y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C02987x c02987x) {
        OK ok = this;
        int iA00 = c02987x.A00();
        int iA01 = c02987x.A01();
        char c2 = ok.A00.A00 > 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA00 != iA01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ok = ok;
                    if (iA01 <= ok.A00.A00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    if (iA01 >= iA00 + 500) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (iA01 != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ok = ok;
                    C02997y c02997y = ok.A00;
                    c02997y.A0c(c02997y.A00);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    ok = ok;
                    ok.A00.A0c(iA01);
                    c2 = '\b';
                    break;
                case '\n':
                    ok = ok;
                    ok.A00.A0c(iA00);
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final Class<C02987x> A01() {
        return C02987x.class;
    }
}
