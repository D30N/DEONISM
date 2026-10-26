package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Rm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0777Rm extends AbstractRunnableC0596Kj {
    public final /* synthetic */ AdError A00;
    public final /* synthetic */ C0780Rp A01;

    public C0777Rm(C0780Rp c0780Rp, AdError adError) {
        this.A01 = c0780Rp;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0596Kj
    public final void A01() {
        if (this.A01.A01 == null) {
            return;
        }
        this.A01.A01.onError(this.A01.A03, this.A00);
    }
}
