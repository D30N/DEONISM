package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0978Zi implements DQ {
    public final C0543Ih A00 = new C0543Ih(new byte[4]);
    public final /* synthetic */ C0980Zk A01;

    public C0978Zi(C0980Zk c0980Zk) {
        this.A01 = c0980Zk;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A47(C0544Ii c0544Ii) {
        C0978Zi c0978Zi = this;
        int i = 0;
        int i2 = 0;
        int programNumber = 0;
        int iA04 = 0;
        char c2 = c0544Ii.A0E() != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(7);
                    i = 4;
                    iA04 = c0544Ii.A04() / 4;
                    programNumber = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (programNumber >= iA04) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0978Zi = c0978Zi;
                    c0544Ii = c0544Ii;
                    c0544Ii.A0a(c0978Zi.A00, i);
                    int iA042 = c0978Zi.A00.A04(16);
                    c0978Zi.A00.A08(3);
                    i2 = 13;
                    if (iA042 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0978Zi = c0978Zi;
                    c0978Zi.A00.A08(i2);
                    c2 = 7;
                    break;
                case 7:
                    programNumber++;
                    c2 = 4;
                    break;
                case '\b':
                    c0978Zi = c0978Zi;
                    int iA043 = c0978Zi.A00.A04(i2);
                    c0978Zi.A01.A06.put(iA043, new C0975Zf(new C0979Zj(c0978Zi.A01, iA043)));
                    C0980Zk.A01(c0978Zi.A01);
                    c2 = 7;
                    break;
                case '\t':
                    c0978Zi = c0978Zi;
                    if (c0978Zi.A01.A05 == 2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0978Zi = c0978Zi;
                    c0978Zi.A01.A06.remove(0);
                    c2 = 11;
                    break;
                case 11:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A7V(C0556Iu c0556Iu, CE ce, DW dw) {
    }
}
