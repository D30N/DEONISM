package com.facebook.ads.redexgen.X;

import android.support.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0995a2 extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0685Nx A00;

    public C0995a2(C0685Nx c0685Nx) {
        this.A00 = c0685Nx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    @RequiresApi(api = 16)
    public final void A06() {
        if (this.A00.isPressed()) {
            this.A00.postDelayed(this, r2.A07);
        } else {
            this.A00.setPressed(true);
            C0685Nx c0685Nx = this.A00;
            c0685Nx.postOnAnimationDelayed(c0685Nx.A0A, 250L);
        }
    }
}
