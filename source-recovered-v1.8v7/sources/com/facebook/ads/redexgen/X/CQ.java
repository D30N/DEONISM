package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class CQ {
    public final CO A00;

    public abstract void A0B(C0544Ii c0544Ii, long j) throws AF;

    public abstract boolean A0C(C0544Ii c0544Ii) throws AF;

    public CQ(CO co) {
        this.A00 = co;
    }

    public final void A00(C0544Ii c0544Ii, long j) throws AF {
        if (A0C(c0544Ii)) {
            A0B(c0544Ii, j);
        }
    }
}
