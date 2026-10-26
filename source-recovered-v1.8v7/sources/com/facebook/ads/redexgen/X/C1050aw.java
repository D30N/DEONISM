package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1050aw extends GM implements G9 {
    public final AbstractC1052ay A00;

    public C1050aw(String str, long j, Format format, String str2, AbstractC1052ay abstractC1052ay, List<GH> list) {
        super(str, j, format, str2, abstractC1052ay, list);
        this.A00 = abstractC1052ay;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final G9 A04() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final GK A06() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final String A07() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final long A6J() {
        return this.A00.A03();
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final int A6u(long j) {
        return this.A00.A02(j);
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final GK A6v(long j) {
        return this.A00.A05(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.G9
    public final long A79(long j) {
        return this.A00.A04(j);
    }
}
