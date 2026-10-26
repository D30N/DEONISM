package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1010aI extends Q0 {
    public final /* synthetic */ C1004aC A00;

    public C1010aI(C1004aC c1004aC) {
        this.A00 = c1004aC;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        C1010aI c1010aI = this;
        char c2 = !c1010aI.A00.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1010aI = c1010aI;
                    if (!c1010aI.A00.A01.A07()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c1010aI = c1010aI;
                    c1010aI.A00.A01.A05();
                    c2 = 4;
                    break;
                case 4:
                    c1010aI = c1010aI;
                    if (c1010aI.A00.A08.get() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1010aI = c1010aI;
                    ((InterfaceC0669Nh) c1010aI.A00.A08.get()).A9j();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}
