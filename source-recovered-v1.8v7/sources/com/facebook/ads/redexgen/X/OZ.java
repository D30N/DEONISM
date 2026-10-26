package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public final class OZ {

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public final C1H A04;
    public final C1R A05;
    public final XI A06;
    public C1I A01 = C1I.A01(null);
    public int A00 = AdError.NETWORK_ERROR_CODE;

    public OZ(XI xi, C1H c1h, C1R c1r) {
        this.A06 = xi;
        this.A04 = c1h;
        this.A05 = c1r;
    }

    public final OZ A07(int i) {
        this.A00 = i;
        return this;
    }

    public final OZ A08(C1I c1i) {
        this.A01 = c1i;
        return this;
    }

    public final OZ A09(String str) {
        this.A02 = str;
        return this;
    }

    public final OZ A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0689Ob A0B() {
        return new C0689Ob(this, null);
    }
}
