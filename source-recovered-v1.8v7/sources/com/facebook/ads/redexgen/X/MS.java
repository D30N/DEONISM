package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* loaded from: assets/audience_network.dex */
public final class MS extends AdNativeComponentView {
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final RelativeLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final C0582Ju A06;
    public final C1028aa A07;
    public static final int A08 = ((int) C0635Ly.A01) * 500;
    public static final int A0G = (int) (C0635Ly.A01 * 500.0f);
    public static final int A0C = (int) (C0635Ly.A01 * 4.0f);
    public static final int A0A = (int) (C0635Ly.A01 * 8.0f);
    public static final int A0F = (int) (C0635Ly.A01 * 8.0f);
    public static final int A0D = (int) (C0635Ly.A01 * 4.0f);
    public static final int A0B = (int) C0635Ly.A01;
    public static final int A0E = (int) (C0635Ly.A01 * 4.0f);
    public static final int A09 = (int) (C0635Ly.A01 * 0.5d);

    public MS(XI xi, C0582Ju c0582Ju) {
        super(xi);
        this.A06 = c0582Ju;
        this.A05 = new TextView(xi);
        this.A04 = new TextView(xi);
        this.A03 = new TextView(xi);
        this.A02 = new RelativeLayout(xi);
        this.A00 = new LinearLayout(xi);
        this.A01 = new RelativeLayout(xi);
        this.A07 = new C1028aa(xi);
        A09();
        A0D();
        A05();
        A0A();
        A00();
        A0B();
        A03();
        A0A();
        A08();
        A0C();
    }

    private void A00() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 1;
        this.A00.addView(this.A01, layoutParams);
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A04.getId());
        C0635Ly.A0M(this.A03);
        this.A02.addView(this.A03, layoutParams);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -2);
        this.A02.setBackgroundDrawable(null);
        RelativeLayout relativeLayout = this.A02;
        int i = A0F;
        relativeLayout.setPadding(i, i, i, i);
        C0635Ly.A0M(this.A02);
        this.A00.addView(this.A02, params);
    }

    private void A02() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A0A;
        int i2 = A0C;
        layoutParams.setMargins(i, i2, i, i2);
        C0635Ly.A0M(this.A03);
        this.A00.addView(this.A03, layoutParams);
    }

    private void A03() {
        this.A01.addView(this.A07, new LinearLayout.LayoutParams(-2, -1));
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, this.A07.getId());
        layoutParams.addRule(5, this.A07.getId());
        layoutParams.addRule(7, this.A07.getId());
        RelativeLayout relativeLayout = this.A02;
        int i = A0F;
        relativeLayout.setPadding(i, 0, i, 0);
        this.A02.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-872415232, 0}));
        C0635Ly.A0M(this.A02);
        this.A01.addView(this.A02, layoutParams);
    }

    private void A05() {
        addView(this.A00, new LinearLayout.LayoutParams(-2, -2));
    }

    private void A06() {
        this.A05.setTextColor(-1);
        this.A04.setTextColor(-1);
        this.A03.setTextColor(this.A06.A03());
    }

    private void A07() {
        this.A07.setMaxWidth(A0G);
        this.A05.setTextColor(this.A06.A04(0.2f));
        this.A04.setTextColor(this.A06.A04(0.4f));
        this.A03.setTextColor(this.A06.A03());
        ((LinearLayout.LayoutParams) this.A01.getLayoutParams()).gravity = 1;
    }

    private void A08() {
        TextView textView = this.A03;
        int i = A0B;
        textView.setPadding(i, i, i, i);
        this.A03.setTextSize(14.0f);
        C0635Ly.A0N(this.A03);
    }

    private void A09() {
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.A06.A01());
        gradientDrawable.setCornerRadius(A0E);
        gradientDrawable.setStroke(1, this.A06.A02());
        setBackgroundDrawable(gradientDrawable);
        int i = A09;
        setPadding(i, i, i, i);
    }

    private void A0A() {
        C0635Ly.A0N(this.A01);
    }

    private void A0B() {
        this.A07.setScaleType(ImageView.ScaleType.FIT_XY);
        C1028aa c1028aa = this.A07;
        int i = A0E;
        c1028aa.setRadius(new float[]{i, i, i, i, 0.0f, 0.0f, 0.0f, 0.0f});
        this.A07.setAdjustViewBounds(true);
        LW.A04(this.A07, LW.A0A);
        C0635Ly.A0N(this.A07);
    }

    private void A0C() {
        C0635Ly.A0N(this.A02);
        this.A05.setTextSize(14.0f);
        C0635Ly.A0N(this.A05);
        this.A05.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, A0D);
        this.A02.addView(this.A05, layoutParams);
        this.A04.setTextSize(12.0f);
        C0635Ly.A0N(this.A04);
        this.A04.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, this.A05.getId());
        layoutParams2.setMargins(0, 0, 0, A0D);
        this.A02.addView(this.A04, layoutParams2);
    }

    private void A0D() {
        this.A00.setOrientation(1);
        C0635Ly.A0N(this.A00);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A07;
    }

    public ImageView getImageCardView() {
        return this.A07;
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        MS ms = this;
        char c2 = View.MeasureSpec.getSize(i2) < ((int) C0635Ly.A01) * JQ.A0B(ms.getContext()) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (View.MeasureSpec.getMode(i2) != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ms = ms;
                    ms.A01();
                    ms.A07();
                    c2 = 4;
                    break;
                case 4:
                    super.onMeasure(i, i2);
                    return;
                case 5:
                    ms = ms;
                    ms.A02();
                    ms.A04();
                    ms.A06();
                    c2 = 4;
                    break;
            }
        }
    }

    public void setButtonText(String str) {
        char c2 = str != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.trim().isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    this.A03.setVisibility(8);
                    return;
                case 4:
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
                    this.A03.setText(spannableString);
                    return;
            }
        }
    }

    public void setSubtitle(String str) {
        MS ms = this;
        char c2 = str != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.trim().isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ms = ms;
                    ms.A04.setVisibility(8);
                    c2 = 4;
                    break;
                case 4:
                    ms.A04.setText(str);
                    return;
            }
        }
    }

    public void setTitle(String str) {
        MS ms = this;
        char c2 = str != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.trim().isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ms = ms;
                    ms.A05.setVisibility(8);
                    c2 = 4;
                    break;
                case 4:
                    ms.A05.setText(str);
                    return;
            }
        }
    }
}
