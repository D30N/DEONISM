package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1035ah extends Q0 {
    public final /* synthetic */ C1029ab A00;

    public C1035ah(C1029ab c1029ab) {
        this.A00 = c1029ab;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        C1035ah c1035ah = this;
        char c2 = !c1035ah.A00.A0V.A07() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1035ah = c1035ah;
                    c1035ah.A00.A0V.A05();
                    if (!TextUtils.isEmpty(c1035ah.A00.A0P.A0P())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c1035ah = c1035ah;
                    c1035ah.A00.A0S.A87(c1035ah.A00.A0P.A0P(), new C0676No().A03(c1035ah.A00.A0f).A02(c1035ah.A00.A0V).A04(c1035ah.A00.A0P.A0R()).A05());
                    c1035ah.A00.A0R.A0A().A2Z();
                    c2 = 4;
                    break;
                case 4:
                    c1035ah = c1035ah;
                    if (c1035ah.A00.A05 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1035ah = c1035ah;
                    c1035ah.A00.A05.A3r(PE.A0A.A02());
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}
