package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class R1 extends AbstractC0679Nr {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final O5 A03;
    public static final int A05 = (int) (C0635Ly.A01 * 12.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 8.0f);
    public static final int A04 = (int) (C0635Ly.A01 * 96.0f);
    public static final int A07 = (int) (C0635Ly.A01 * 12.0f);
    public static final int A08 = (int) (C0635Ly.A01 * 16.0f);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(XI xi, int i, C1I c1i, JW jw, MQ mq, boolean z, boolean z2, Q1 q1, C0628Lr c0628Lr, boolean z3) {
        super(xi, i, c1i, PE.A04.A02(), jw, mq, q1, c0628Lr);
        boolean z4 = z;
        this.A02 = false;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, A07, 0);
        if (z2) {
            this.A04.setVisibility(8);
        }
        this.A00 = C0635Ly.A03(xi);
        this.A01 = z3;
        boolean shouldShrinkTextSize = this.A00 == 2;
        boolean z5 = shouldShrinkTextSize && this.A01;
        boolean shouldShrinkTextSize2 = JQ.A1K(xi);
        this.A03 = new O5(xi, c1i, true, (z5 || shouldShrinkTextSize2) ? true : z4, true);
        O5 o5 = this.A03;
        boolean shouldShrinkTextSize3 = this.A01;
        o5.setUseNewLandscapeEndCard(shouldShrinkTextSize3);
        this.A03.setAlignment(8388611);
        boolean shouldShrinkTextSize4 = JQ.A1H(super.A02);
        if (shouldShrinkTextSize4) {
            this.A03.setDescriptionVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.A04.getId());
        boolean shouldShrinkTextSize5 = JQ.A1F(xi);
        if (shouldShrinkTextSize5) {
            layoutParams2.addRule(0, super.A03.getId());
        }
        boolean shouldShrinkTextSize6 = this.A01;
        if (!shouldShrinkTextSize6) {
            layoutParams.addRule(15);
            layoutParams2.addRule(15);
        }
        super.A01.addView(this.A04, layoutParams);
        super.A01.addView(this.A03, layoutParams2);
        if (z5) {
            addView(super.A01, new LinearLayout.LayoutParams(-2, -1, 0.7f));
            return;
        }
        addView(super.A01, new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C0635Ly.A0W(this, gradientDrawable);
    }

    private void A00() {
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = super.A03;
        int i = A06;
        viewOnClickListenerC0998a5.setPadding(i, 0, i, 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A04, -2);
        layoutParams.addRule(11);
        layoutParams.setMargins(A05, 0, 0, 0);
        super.A03.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final void A0C(int i) {
        LinearLayout.LayoutParams layoutParams;
        C0635Ly.A0M(super.A03);
        int i2 = 1;
        boolean z = i == 1;
        boolean zA1F = JQ.A1F(super.A02);
        boolean isPortrait = this.A01;
        if (isPortrait) {
            this.A00 = i;
            setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            boolean isPortrait2 = this.A02;
            if (isPortrait2 && !z) {
                layoutParams2.weight = 0.7f;
                setBackgroundResource(0);
                C0635Ly.A0P(this, -447721392);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
                gradientDrawable.setCornerRadius(0.0f);
                C0635Ly.A0W(this, gradientDrawable);
            }
            super.A01.setLayoutParams(layoutParams2);
            if (zA1F && z) {
                A00();
                super.A01.addView(super.A03);
                bringToFront();
                return;
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, A08, 0, 0);
                bringToFront();
            }
        } else {
            if (!z) {
                i2 = 0;
            }
            setOrientation(i2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -1 : 0, -2);
            layoutParams3.weight = 1.0f;
            super.A01.setLayoutParams(layoutParams3);
            if (zA1F && z) {
                A00();
                super.A01.addView(super.A03);
                bringToFront();
                return;
            }
            layoutParams = new LinearLayout.LayoutParams(z ? -1 : -2, -2);
            layoutParams.setMargins(z ? 0 : A08, z ? A08 : 0, 0, 0);
        }
        layoutParams.gravity = 80;
        addView(super.A03, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final void A0D(boolean z) {
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public void setInfo(C1H c1h, C1J c1j, String str, String str2, @Nullable InterfaceC0682Nu interfaceC0682Nu) {
        super.setInfo(c1h, c1j, str, str2, interfaceC0682Nu);
        this.A03.A01(c1h.A06(), c1h.A05(), null, false, false);
        if (TextUtils.isEmpty(c1j.A03())) {
            C0635Ly.A0K(super.A03);
        }
    }
}
