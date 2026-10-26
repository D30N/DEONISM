package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0689Ob extends LinearLayout {

    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final XI A02;
    public final C0687Nz A03;
    public final O5 A04;
    public static final int A07 = (int) (C0635Ly.A01 * 16.0f);
    public static final int A08 = (int) (C0635Ly.A01 * 16.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 8.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 72.0f);

    public C0689Ob(OZ oz) {
        super(oz.A06);
        this.A02 = oz.A06;
        this.A03 = new C0687Nz(this.A02);
        this.A04 = new O5(this.A02, oz.A01, true, false, true);
        this.A01 = oz.A00;
        A03(oz);
    }

    public /* synthetic */ C0689Ob(OZ oz, XN xn) {
        this(oz);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(OZ oz) {
        if (!TextUtils.isEmpty(oz.A03)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i = A08;
            linearLayout.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            C0635Ly.A0b(textView, false, 16);
            textView.setText(oz.A03);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC1002aA(imageView, this.A02).A04().A07(oz.A02);
            int i2 = A07;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams3.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            C0635Ly.A0W(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(OZ oz) {
        C0689Ob c0689Ob = this;
        C0635Ly.A0P(c0689Ob.A03, 0);
        c0689Ob.A03.setRadius(50);
        char c2 = oz.A04.A00() == C1F.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0689Ob = c0689Ob;
                    c0689Ob.A03.setFullCircleCorners(true);
                    c2 = 3;
                    break;
                case 3:
                    C0689Ob c0689Ob2 = c0689Ob;
                    OZ oz2 = oz;
                    new AsyncTaskC1002aA(c0689Ob2.A03, c0689Ob2.A02).A04().A07(oz2.A05.A01());
                    c0689Ob2.A04.A01(oz2.A04.A06(), oz2.A05.A03(), null, false, true);
                    c0689Ob2.A04.getDescriptionTextView().setAlpha(0.8f);
                    c0689Ob2.A04.setAlignment(17);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    int i = A08;
                    layoutParams.setMargins(0, i, 0, i / 2);
                    C0687Nz c0687Nz = c0689Ob2.A03;
                    int i2 = A05;
                    c0689Ob2.addView(c0687Nz, new LinearLayout.LayoutParams(i2, i2));
                    c0689Ob2.addView(c0689Ob2.A04, layoutParams);
                    c0689Ob2.A02(oz2);
                    C0635Ly.A0P(c0689Ob2, -14473425);
                    c0689Ob2.setGravity(17);
                    c0689Ob2.setOrientation(1);
                    return;
                case 4:
                    c0689Ob = c0689Ob;
                    c0689Ob.A03.setRadius(A06);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A04(InterfaceC0688Oa interfaceC0688Oa) {
        A00();
        postDelayed(new XN(this, interfaceC0688Oa), this.A01);
    }
}
