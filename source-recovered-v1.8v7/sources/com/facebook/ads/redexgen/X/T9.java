package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T9 implements C4A {
    public final /* synthetic */ C0452Eq A00;

    public T9(C0452Eq c0452Eq) {
        this.A00 = c0452Eq;
    }

    @Override // com.facebook.ads.redexgen.X.C4A
    public final void A8s(C4Y c4y) {
        T9 t9 = this;
        c4y.A0Z(true);
        C4Y c4y2 = null;
        char c2 = c4y.A06 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (c4y.A07 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4y = c4y;
                    c4y2 = null;
                    c4y.A06 = null;
                    c2 = 4;
                    break;
                case 4:
                    c4y = c4y;
                    c4y.A07 = c4y2;
                    if (!c4y.A0A()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    t9 = t9;
                    c4y = c4y;
                    if (!t9.A00.A1x(c4y.A0H)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    c4y = c4y;
                    if (!c4y.A0e()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    t9 = t9;
                    c4y = c4y;
                    t9.A00.removeDetachedView(c4y.A0H, false);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }
}
