package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class GP {
    public final long A00;
    public final long A01;
    public final GK A02;

    public GP(GK gk, long j, long j2) {
        this.A02 = gk;
        this.A01 = j;
        this.A00 = j2;
    }

    public final long A00() {
        return C0560Iy.A0G(this.A00, 1000000L, this.A01);
    }

    public GK A01(GM gm) {
        return this.A02;
    }
}
