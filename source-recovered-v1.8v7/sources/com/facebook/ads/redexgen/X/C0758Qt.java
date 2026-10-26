package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0758Qt extends AbstractRunnableC0608Kw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0755Qq A02;
    public final /* synthetic */ EnumC0737Py A03;

    public C0758Qt(C0755Qq c0755Qq, EnumC0737Py enumC0737Py, int i, int i2) {
        this.A02 = c0755Qq;
        this.A03 = enumC0737Py;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C0758Qt c0758Qt = this;
        boolean z = false;
        char c2 = c0758Qt.A03 == EnumC0737Py.A07 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0l);
                    c0758Qt.A02.A0A.A0A().A2z();
                    c0758Qt.A02.A0B.A02(C0755Qq.A0G);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0758Qt = c0758Qt;
                    z = true;
                    if (c0758Qt.A03 != EnumC0737Py.A03) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0g);
                    c0758Qt.A02.A03 = z;
                    c0758Qt.A02.A0B.A02(C0755Qq.A0E);
                    c2 = 3;
                    break;
                case 6:
                    c0758Qt = c0758Qt;
                    if (c0758Qt.A03 != EnumC0737Py.A06) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0f);
                    c0758Qt.A02.A0A.A0A().A2r();
                    c0758Qt.A02.A03 = z;
                    c0758Qt.A02.A07.removeCallbacksAndMessages(null);
                    C9B c9b = c0758Qt.A02.A0B;
                    int i = c0758Qt.A01;
                    c9b.A02(new C02987x(i, i));
                    c2 = 3;
                    break;
                case '\b':
                    c0758Qt = c0758Qt;
                    if (c0758Qt.A03 != EnumC0737Py.A0A) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0j);
                    c0758Qt.A02.A0A.A0A().A36();
                    c0758Qt.A02.A0B.A02(C0755Qq.A0F);
                    c0758Qt.A02.A07.removeCallbacksAndMessages(null);
                    c0758Qt.A02.A0G();
                    c2 = 3;
                    break;
                case '\n':
                    c0758Qt = c0758Qt;
                    if (c0758Qt.A03 != EnumC0737Py.A05) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0i);
                    c0758Qt.A02.A0A.A0A().A2v();
                    C9B c9b2 = c0758Qt.A02.A0B;
                    final int i2 = c0758Qt.A00;
                    c9b2.A02(new AbstractC0646Mj(i2) { // from class: com.facebook.ads.redexgen.X.7v
                    });
                    c0758Qt.A02.A07.removeCallbacksAndMessages(null);
                    c2 = 3;
                    break;
                case '\f':
                    c0758Qt = c0758Qt;
                    if (c0758Qt.A03 != EnumC0737Py.A04) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0h);
                    c0758Qt.A02.A0A.A0A().A2s();
                    c0758Qt.A02.A0B.A02(C0755Qq.A0I);
                    c0758Qt.A02.A07.removeCallbacksAndMessages(null);
                    c2 = 3;
                    break;
                case 14:
                    c0758Qt = c0758Qt;
                    if (c0758Qt.A03 != EnumC0737Py.A09) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0758Qt = c0758Qt;
                    c0758Qt.A02.A0I(EnumC0564Jc.A0f);
                    c0758Qt.A02.A0A.A0A().A31();
                    c0758Qt.A02.A03 = z;
                    c0758Qt.A02.A07.removeCallbacksAndMessages(null);
                    c0758Qt.A02.A0B.A02(new C02987x(c0758Qt.A00, c0758Qt.A01));
                    c2 = 3;
                    break;
            }
        }
    }
}
