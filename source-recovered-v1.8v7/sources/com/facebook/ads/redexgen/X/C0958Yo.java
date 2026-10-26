package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0958Yo implements CL {
    public final long A00;
    public final CK A01;

    public C0958Yo(long j) {
        this(j, 0L);
    }

    public C0958Yo(long j, long j2) {
        this.A00 = j;
        this.A01 = new CK(j2 == 0 ? CM.A03 : new CM(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return false;
    }
}
