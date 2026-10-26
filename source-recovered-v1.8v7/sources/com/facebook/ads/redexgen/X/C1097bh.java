package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1097bh implements InterfaceC02284v {
    public final /* synthetic */ C03469v A00;

    public C1097bh(C03469v c03469v) {
        this.A00 = c03469v;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02284v
    public final boolean A7X() {
        C1097bh c1097bh = this;
        char c2 = !c1097bh.A00.A0g() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1097bh = c1097bh;
                    if (!c1097bh.A00.A0f()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return true;
                case 4:
                    c1097bh = c1097bh;
                    if (!c1097bh.A00.A0h()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    c1097bh = c1097bh;
                    if (!c1097bh.A00.A0e()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1097bh = c1097bh;
                    if (c1097bh.A00.A00 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    C03469v c03469v = c1097bh.A00;
                    c03469v.A0c(c03469v.A00);
                    return true;
                case '\t':
                    return false;
            }
        }
    }
}
