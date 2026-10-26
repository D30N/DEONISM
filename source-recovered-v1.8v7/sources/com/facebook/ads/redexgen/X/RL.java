package com.facebook.ads.redexgen.X;

import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class RL implements C0V {
    public final C0T A00;

    public RL(C0T c0t) {
        this.A00 = c0t;
    }

    public final void A00(C0U c0u, JSONObject jSONObject) {
        this.A00.A5B(c0u, jSONObject);
    }

    @Override // com.facebook.ads.redexgen.X.C0V
    public final RI A8R() {
        return new G1(this);
    }

    @Override // com.facebook.ads.redexgen.X.C0V
    public final C0S A8S() {
        return new RJ(this);
    }
}
