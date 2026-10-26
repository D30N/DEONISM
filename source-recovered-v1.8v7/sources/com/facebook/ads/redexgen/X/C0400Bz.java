package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Bz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0400Bz extends AbstractC1052ay {
    public final GQ A00;
    public final GQ A01;

    public C0400Bz(GK gk, long j, long j2, long j3, long j4, List<GO> list, GQ gq, GQ gq2) {
        super(gk, j, j2, j3, j4, list);
        this.A00 = gq;
        this.A01 = gq2;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GK A01(GM gm) {
        GQ gq = this.A00;
        if (gq != null) {
            return new GK(gq.A04(gm.A02.A0M, 0L, gm.A02.A04, 0L), 0L, -1L);
        }
        return super.A01(gm);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1052ay
    public final int A02(long j) {
        char c2 = ((AbstractC1052ay) this).A02 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ((AbstractC1052ay) this).A02.size();
                case 3:
                    if (j == -9223372036854775807L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C0400Bz c0400Bz = this;
                    return (int) C0560Iy.A0E(j, (((AbstractC1052ay) c0400Bz).A00 * 1000000) / ((GP) c0400Bz).A01);
                case 5:
                    return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1052ay
    public final GK A05(GM gm, long time) {
        return new GK(this.A01.A04(gm.A02.A0M, time, gm.A02.A04, ((AbstractC1052ay) this).A02 != null ? ((AbstractC1052ay) this).A02.get((int) (time - ((AbstractC1052ay) this).A01)).A01 : (time - ((AbstractC1052ay) this).A01) * ((AbstractC1052ay) this).A00), 0L, -1L);
    }
}
