package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0762Qx implements QP {
    public final /* synthetic */ C0711Oy A00;

    public C0762Qx(C0711Oy c0711Oy) {
        this.A00 = c0711Oy;
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ABu() {
        if (this.A00.A02 != null) {
            this.A00.A02.A3r(this.A00.A03.A6y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ABw(QR qr) {
        C0762Qx c0762Qx = this;
        char c2 = c0762Qx.A00.A02 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    qr = qr;
                    if (qr == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    qr = qr;
                    if (!qr.A00()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0762Qx = c0762Qx;
                    c0762Qx.A00.A02.A3r(c0762Qx.A00.A03.A6z());
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c0762Qx = c0762Qx;
                    c0762Qx.A00.A02.A3r(c0762Qx.A00.A03.A6y());
                    c2 = 6;
                    break;
            }
        }
    }
}
