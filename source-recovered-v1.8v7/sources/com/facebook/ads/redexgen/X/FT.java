package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class FT {

    @Nullable
    public FT A00;

    @Nullable
    public HV A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public FT(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final FT A01() {
        this.A01 = null;
        FT ft = this.A00;
        this.A00 = null;
        return ft;
    }

    public final void A02(HV hv, FT ft) {
        this.A01 = hv;
        this.A00 = ft;
        this.A02 = true;
    }
}
