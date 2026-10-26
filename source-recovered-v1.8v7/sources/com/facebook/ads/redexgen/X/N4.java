package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class N4 extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (C0635Ly.A01 * 16.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 12.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 12.0f);
    public static final int A03 = (int) (C0635Ly.A01 * 16.0f);

    public N4(XI xi) {
        super(xi);
        this.A00 = false;
        setOrientation(0);
        int i = A04;
        int i2 = A05;
        setPadding(i, i2, i, i2);
        this.A01 = new ImageView(getContext());
        int i3 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, layoutParams2);
        A00();
    }

    private void A00() {
        N4 n4 = this;
        int i = 0;
        int i2 = 0;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        char c2 = n4.A00 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    i = -13272859;
                    c2 = 3;
                    break;
                case 3:
                    n4 = n4;
                    gradientDrawable = gradientDrawable;
                    gradientDrawable.setColor(i);
                    gradientDrawable.setCornerRadius(50.0f);
                    C0635Ly.A0W(n4, gradientDrawable);
                    C0635Ly.A0b(n4.A02, false, 14);
                    if (!n4.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = -1;
                    c2 = 5;
                    break;
                case 5:
                    N4 n42 = n4;
                    n42.A02.setTextColor(i2);
                    n42.A01.setColorFilter(i2);
                    return;
                case 6:
                    i2 = -10459280;
                    c2 = 5;
                    break;
                case 7:
                    i = -1315344;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, @Nullable M6 m6) {
        N4 n4 = this;
        n4.A02.setText(str);
        char c2 = m6 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    n4 = n4;
                    m6 = m6;
                    n4.A01.setImageBitmap(M7.A00(m6));
                    n4.A01.setVisibility(0);
                    n4.A02.setPadding(A06, 0, 0, 0);
                    c2 = 3;
                    break;
                case 3:
                    n4.A00();
                    return;
                case 4:
                    n4 = n4;
                    n4.A01.setVisibility(8);
                    n4.A02.setPadding(0, 0, 0, 0);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}
