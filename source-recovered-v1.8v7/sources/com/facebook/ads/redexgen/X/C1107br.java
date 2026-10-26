package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1107br implements InterfaceC02284v {
    public final /* synthetic */ C0359Ai A00;

    public C1107br(C0359Ai c0359Ai) {
        this.A00 = c0359Ai;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02284v
    public final boolean A7X() {
        C1107br c1107br = this;
        char c2 = c1107br.A00.A0g() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    c1107br = c1107br;
                    if (!c1107br.A00.A0f()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return true;
                case 5:
                    c1107br = c1107br;
                    if (!c1107br.A00.A0h()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return true;
                case 7:
                    c1107br = c1107br;
                    if (!c1107br.A00.A0e()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c1107br = c1107br;
                    if (c1107br.A00.A00 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    C0359Ai c0359Ai = c1107br.A00;
                    c0359Ai.A0c(c0359Ai.A00);
                    return true;
                case '\n':
                    return false;
            }
        }
    }
}
