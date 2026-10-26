package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1157ci implements InterfaceC0616Lf {
    public int A00;
    public final InterfaceC0616Lf A01;
    public final InterfaceC0616Lf A02;

    public C1157ci(InterfaceC0616Lf interfaceC0616Lf, int i, InterfaceC0616Lf interfaceC0616Lf2) {
        this.A01 = interfaceC0616Lf;
        this.A00 = i;
        this.A02 = interfaceC0616Lf2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void ABs(String str) {
        C1157ci c1157ci = this;
        char c2 = c1157ci.A00 > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1157ci = c1157ci;
                    str = str;
                    c1157ci.A01.ABs(str);
                    c1157ci.A01.flush();
                    c1157ci.A00--;
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1157ci = c1157ci;
                    str = str;
                    c1157ci.A02.ABs(str);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void flush() {
        this.A02.flush();
    }
}
