package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1015aN implements FV {
    public final int A00;
    public final /* synthetic */ C5 A01;

    public C1015aN(C5 c5, int i) {
        this.A01 = c5;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final boolean A7k() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final void A8V() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final int AC6(A9 a9, YT yt, boolean z) {
        return this.A01.A0P(this.A00, a9, yt, z);
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final int ADK(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
