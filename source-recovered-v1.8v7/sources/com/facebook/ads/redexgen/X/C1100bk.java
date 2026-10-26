package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1100bk implements InterfaceC0675Nn {
    public final /* synthetic */ C0359Ai A00;

    public C1100bk(C0359Ai c0359Ai) {
        this.A00 = c0359Ai;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0675Nn
    public final void A9h(boolean z) {
        C1100bk c1100bk = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1100bk = c1100bk;
                    c1100bk.A00.A07.set(true);
                    if (!c1100bk.A00.A06.get()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1100bk = c1100bk;
                    c1100bk.A00.A05.A0V();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
