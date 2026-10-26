package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1161cm implements InterfaceC0616Lf {
    public final C0615Le A00;
    public final InterfaceC0616Lf A01;

    public C1161cm(InterfaceC0616Lf interfaceC0616Lf, int i, int i2) {
        this.A01 = interfaceC0616Lf;
        this.A00 = new C0615Le(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void ABs(String str) {
        C1161cm c1161cm = this;
        c1161cm.A00.A04(str);
        char c2 = c1161cm.A00.A02() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1161cm = c1161cm;
                    if (!C0618Lh.A08(c1161cm.A00)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1161cm = c1161cm;
                    c1161cm.A01.ABs(c1161cm.A00.A02());
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void flush() {
        C1161cm c1161cm = this;
        c1161cm.A00.A03();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c1161cm = c1161cm;
                    if (c1161cm.A00.A02() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1161cm = c1161cm;
                    if (!C0618Lh.A08(c1161cm.A00)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1161cm = c1161cm;
                    c1161cm.A01.ABs(c1161cm.A00.A02());
                    c2 = 5;
                    break;
                case 5:
                    c1161cm = c1161cm;
                    c1161cm.A00.A03();
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }
}
