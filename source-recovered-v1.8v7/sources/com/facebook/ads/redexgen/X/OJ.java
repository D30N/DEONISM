package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class OJ extends RelativeLayout {
    public final View A00;
    public final O0 A01;

    public OJ(XI xi, View view) {
        super(xi);
        this.A00 = view;
        this.A01 = new O0(xi);
        C0635Ly.A0N(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(@Nullable O5 o5, boolean z) {
        OJ oj = this;
        int i = 0;
        oj.A01.addView(oj.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(oj.getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, oj.A00.getId());
        char c2 = o5 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 3;
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    o5 = o5;
                    linearLayout = linearLayout;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    o5.setAlignment(i);
                    layoutParams2.setMargins(O8.A09 / 2, O8.A09 / 2, O8.A09 / 2, O8.A09 / 2);
                    linearLayout.addView(o5, layoutParams2);
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                    gradientDrawable.setCornerRadius(0.0f);
                    gradientDrawable.setGradientType(0);
                    C0635Ly.A0W(linearLayout, gradientDrawable);
                    c2 = 4;
                    break;
                case 4:
                    OJ oj2 = oj;
                    oj2.A01.addView(linearLayout, layoutParams);
                    oj2.addView(oj2.A01, new RelativeLayout.LayoutParams(-1, -2));
                    return;
                case 5:
                    oj = oj;
                    o5 = o5;
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams3.addRule(i, oj.A01.getId());
                    layoutParams3.setMargins(0, O8.A09, 0, 0);
                    o5.setAlignment(17);
                    oj.addView(o5, layoutParams3);
                    c2 = 4;
                    break;
            }
        }
    }
}
