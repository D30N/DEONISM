package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class Y1 extends Q0 {
    public final /* synthetic */ AbstractC0941Xx A00;

    public Y1(AbstractC0941Xx abstractC0941Xx) {
        this.A00 = abstractC0941Xx;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        Y1 y1 = this;
        char c2 = !y1.A00.A06.A07() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    y1 = y1;
                    y1.A00.A06.A05();
                    if (!TextUtils.isEmpty(y1.A00.A01.A0P())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    y1 = y1;
                    y1.A00.A04.A87(y1.A00.A01.A0P(), new C0676No().A03(y1.A00.A0A).A02(y1.A00.A06).A04(y1.A00.A01.A0R()).A05());
                    y1.A00.A03.A0A().A2Z();
                    y1.A00.A08.A3r(y1.A00.A09.A6O());
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
