package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1053az extends GP {
    public final long A00;
    public final long A01;

    public C1053az() {
        this(null, 1L, 0L, 0L, 0L);
    }

    public C1053az(GK gk, long j, long j2, long j3, long j4) {
        super(gk, j, j2);
        this.A01 = j3;
        this.A00 = j4;
    }

    public final GK A02() {
        long j = this.A00;
        if (j <= 0) {
            return null;
        }
        return new GK(null, this.A01, j);
    }
}
