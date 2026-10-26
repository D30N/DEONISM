package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.Tp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0829Tp extends AbstractRunnableC0608Kw {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C5J A01;
    public final /* synthetic */ C1141cR A02;

    public C0829Tp(C5J c5j, C1141cR c1141cR, Drawable drawable) {
        this.A01 = c5j;
        this.A02 = c1141cR;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A02.A1D(this.A00);
    }
}
