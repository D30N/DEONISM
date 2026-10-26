package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1044aq implements G9 {
    public final long A00;
    public final C0953Yj A01;

    public C1044aq(C0953Yj c0953Yj, long j) {
        this.A01 = c0953Yj;
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final long A6J() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final int A6u(long j) {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final GK A6v(long j) {
        return new GK(null, this.A01.A03[(int) j], this.A01.A01[(int) j]);
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final long A79(long j) {
        return this.A01.A04[(int) j] - this.A00;
    }
}
