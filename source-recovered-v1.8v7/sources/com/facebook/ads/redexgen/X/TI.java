package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TI extends C4L {
    public boolean A00 = false;
    public final /* synthetic */ TJ A01;

    public TI(TJ tj) {
        this.A01 = tj;
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A0U(C0452Eq c0452Eq, int i) {
        TI ti = this;
        super.A0U(c0452Eq, i);
        char c2 = i == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ti = ti;
                    if (!ti.A00) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ti = ti;
                    ti.A00 = false;
                    ti.A01.A0F();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A0V(C0452Eq c0452Eq, int i, int i2) {
        TI ti = this;
        char c2 = i == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 == 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ti = ti;
                    ti.A00 = true;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
