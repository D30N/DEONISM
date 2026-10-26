package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DY {
    public final int A00;
    public final long A01;

    public DY(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static DY A00(CD cd, C0544Ii c0544Ii) throws InterruptedException, IOException {
        cd.ABf(c0544Ii.A00, 0, 8);
        c0544Ii.A0Y(0);
        int id = c0544Ii.A08();
        return new DY(id, c0544Ii.A0K());
    }
}
