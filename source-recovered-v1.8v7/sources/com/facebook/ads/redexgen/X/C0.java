package com.facebook.ads.redexgen.X;

import java.util.List;

/* loaded from: assets/audience_network.dex */
public class C0 extends AbstractC1052ay {
    public final List<GK> A00;

    public C0(GK gk, long j, long j2, long j3, long j4, List<GO> list, List<GK> list2) {
        super(gk, j, j2, j3, j4, list);
        this.A00 = list2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1052ay
    public final int A02(long j) {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1052ay
    public final GK A05(GM gm, long j) {
        return this.A00.get((int) (j - ((AbstractC1052ay) this).A01));
    }
}
