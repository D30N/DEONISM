package com.facebook.ads.redexgen.X;

import android.support.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0994a1 extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0685Nx A00;

    public C0994a1(C0685Nx c0685Nx) {
        this.A00 = c0685Nx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    @RequiresApi(api = 16)
    public final void A06() {
        this.A00.setPressed(false);
        C0685Nx c0685Nx = this.A00;
        c0685Nx.postOnAnimationDelayed(c0685Nx.A08, this.A00.A07);
    }
}
