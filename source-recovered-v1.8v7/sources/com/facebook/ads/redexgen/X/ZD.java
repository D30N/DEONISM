package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class ZD implements CL {
    public final /* synthetic */ ZE A00;

    public ZD(ZE ze) {
        this.A00 = ze;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A00.A0B.A03(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        if (j == 0) {
            return new CK(new CM(0L, this.A00.A09));
        }
        long jA04 = this.A00.A0B.A04(j);
        ZE ze = this.A00;
        return new CK(new CM(j, ze.A00(ze.A09, jA04, 30000L)));
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return true;
    }
}
