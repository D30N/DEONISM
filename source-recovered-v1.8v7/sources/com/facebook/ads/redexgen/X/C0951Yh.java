package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0951Yh extends O8 {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final OJ A00;

    public C0951Yh(OC oc, boolean z) {
        super(oc, z);
        this.A00 = new OJ(oc.A05(), oc.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(O8.A09, O8.A09, O8.A09, O8.A09);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(oc.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(O8.A09, 0, O8.A09, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0P() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle) {
        super.A0a(c1a, str, d2, bundle);
        if (d2 > 0.0d) {
            this.A00.A00((int) ((A01 - (O8.A09 * 2)) / d2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0c() {
        return false;
    }
}
