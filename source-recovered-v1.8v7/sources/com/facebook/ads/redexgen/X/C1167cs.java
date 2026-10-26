package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* renamed from: com.facebook.ads.redexgen.X.cs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1167cs extends AbstractRunnableC0608Kw {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ MB A01;

    public C1167cs(MB mb, DialogInterface dialogInterface) {
        this.A01 = mb;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        if (this.A01.A01.A01 != null) {
            this.A01.A01.A01.ABj(C0590Kc.A01(), new QK().A05(this.A01.A01.A03(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
