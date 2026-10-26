package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class QR {
    public int A00;

    public QR(Q5 q5) {
        this.A00 = q5.A77();
    }

    public final boolean A00() {
        boolean z = false;
        char c2 = this.A00 == 200 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
