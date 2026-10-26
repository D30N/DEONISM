package com.facebook.ads.redexgen.X;

import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.c1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1116c1 extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C1118c3 A00;

    public C1116c1(C1118c3 c1118c3) {
        this.A00 = c1118c3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() throws JSONException, InterruptedException {
        C1118c3.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                Thread.sleep(this.A00.A01);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
