package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1129cF extends Q0 {
    public final /* synthetic */ C1131cH A00;

    public C1129cF(C1131cH c1131cH) {
        this.A00 = c1131cH;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A00() {
        if (this.A00.A04 == null) {
            return;
        }
        this.A00.A04.A0S();
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        C1129cF c1129cF = this;
        char c2 = c1129cF.A00.A04 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1129cF = c1129cF;
                    if (!c1129cF.A00.A0B) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    c1129cF = c1129cF;
                    if (!c1129cF.A00.A0A) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c1129cF = c1129cF;
                    if (!c1129cF.A00.A0K()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1129cF = c1129cF;
                    c1129cF.A00.A0J(PC.A03);
                    c2 = 7;
                    break;
                case 7:
                    C1129cF c1129cF2 = c1129cF;
                    c1129cF2.A00.A0A = false;
                    c1129cF2.A00.A0B = false;
                    return;
            }
        }
    }
}
