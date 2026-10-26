package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0952Yi extends O8 {
    public C0952Yi(OC oc, boolean z) {
        super(oc, true);
        RelativeLayout relativeLayout = new RelativeLayout(oc.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        C0635Ly.A0V(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(oc.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        C0635Ly.A0N(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(O8.A09, 0, O8.A09, O8.A09);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? O8.A09 : 0, z ? 0 : O8.A09, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        addView(oc.A02(), new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle) {
        super.A0a(c1a, str, d2, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0c() {
        return true;
    }
}
