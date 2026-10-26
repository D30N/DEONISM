package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1045ar implements MK {
    public final /* synthetic */ C1040am A00;

    public C1045ar(C1040am c1040am) {
        this.A00 = c1040am;
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A9B() {
        C1045ar c1045ar = this;
        char c2 = c1045ar.A00.A0N ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1045ar = c1045ar;
                    if (!c1045ar.A00.A0L.get()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    c1045ar = c1045ar;
                    if (!c1045ar.A00.A0V()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1045ar = c1045ar;
                    c1045ar.A00.A0P.setToolbarActionMode(0);
                    c1045ar.A00.A0K();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1045ar = c1045ar;
                    c1045ar.A00.A0E.A02(EnumC0564Jc.A06, null);
                    c1045ar.A00.A0H.A3r(c1045ar.A00.A0I.A67());
                    c2 = 5;
                    break;
            }
        }
    }
}
