package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Qz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0764Qz extends O0 {
    public final ImageView A00;
    public final XI A01;

    public C0764Qz(XI xi) {
        super(xi);
        this.A01 = xi;
        this.A00 = new ImageView(xi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1002aA asyncTaskC1002aA = new AsyncTaskC1002aA(this.A00, this.A01);
        asyncTaskC1002aA.A04();
        asyncTaskC1002aA.A07(str);
    }
}
