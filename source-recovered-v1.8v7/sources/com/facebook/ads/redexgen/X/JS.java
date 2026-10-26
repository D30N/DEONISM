package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class JS {
    public double A00;
    public JX A01;
    public JY A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final JS A00(double d2) {
        this.A00 = d2;
        return this;
    }

    public final JS A01(JX jx) {
        this.A01 = jx;
        return this;
    }

    public final JS A02(JY jy) {
        this.A02 = jy;
        return this;
    }

    public final JS A03(String str) {
        this.A03 = str;
        return this;
    }

    public final JS A04(String str) {
        this.A04 = str;
        return this;
    }

    public final JS A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final JS A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final JT A07(C8C c8c) {
        return new JT(c8c, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
