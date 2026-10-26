package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ay, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1052ay extends GP {
    public final long A00;
    public final long A01;
    public final List<GO> A02;

    public abstract int A02(long j);

    public abstract GK A05(GM gm, long j);

    public AbstractC1052ay(GK gk, long j, long j2, long j3, long j4, List<GO> list) {
        super(gk, j, j2);
        this.A01 = j3;
        this.A00 = j4;
        this.A02 = list;
    }

    public final long A03() {
        return this.A01;
    }

    public final long A04(long j) {
        AbstractC1052ay abstractC1052ay = this;
        long j2 = 0;
        List<GO> list = abstractC1052ay.A02;
        char c2 = list != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC1052ay = abstractC1052ay;
                    list = list;
                    j2 = list.get((int) (j - abstractC1052ay.A01)).A01 - ((GP) abstractC1052ay).A00;
                    c2 = 3;
                    break;
                case 3:
                    return C0560Iy.A0G(j2, 1000000L, ((GP) abstractC1052ay).A01);
                case 4:
                    abstractC1052ay = abstractC1052ay;
                    j2 = (j - abstractC1052ay.A01) * abstractC1052ay.A00;
                    c2 = 3;
                    break;
            }
        }
    }
}
