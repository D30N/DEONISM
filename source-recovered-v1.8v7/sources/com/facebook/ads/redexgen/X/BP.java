package com.facebook.ads.redexgen.X;

import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class BP extends YU implements GY {
    public long A00;
    public GY A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.BR
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, GY gy, long j2) {
        BP bp = this;
        long j3 = 0;
        ((YU) bp).A01 = j;
        bp.A01 = gy;
        char c2 = j2 == Long.MAX_VALUE ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    bp = bp;
                    j3 = ((YU) bp).A01;
                    c2 = 3;
                    break;
                case 3:
                    bp.A00 = j3;
                    return;
                case 4:
                    j3 = j2;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A5q(long j) {
        return this.A01.A5q(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6E(int i) {
        return this.A01.A6E(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6F() {
        return this.A01.A6F();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6Z(long j) {
        return this.A01.A6Z(j - this.A00);
    }
}
