package com.facebook.ads.redexgen.X;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public class PK extends RelativeLayout {
    public ImageView A00;
    public TextView A01;
    public boolean A02;
    public final DisplayMetrics A03;
    public final XI A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public PK(XI xi, String str, String str2, float[] fArr, String str3) {
        super(xi);
        this.A02 = false;
        this.A04 = xi;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A03 = xi.getResources().getDisplayMetrics();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setAlpha(178);
        gradientDrawable.setCornerRadii(new float[]{fArr[0] * this.A03.density, fArr[0] * this.A03.density, fArr[1] * this.A03.density, fArr[1] * this.A03.density, fArr[2] * this.A03.density, fArr[2] * this.A03.density, fArr[3] * this.A03.density, fArr[3] * this.A03.density});
        C0635Ly.A0W(this, gradientDrawable);
        A08();
        A04();
        A05();
        setMinimumWidth(Math.round(this.A03.density * 20.0f));
        setMinimumHeight(Math.round(this.A03.density * 18.0f));
    }

    private void A04() {
        this.A00 = new ImageView(this.A04);
        this.A00.setImageBitmap(M7.A00(M6.IC_AD_CHOICES));
        addView(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(this.A03.density * 16.0f), Math.round(this.A03.density * 16.0f));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(this.A03.density * 4.0f), Math.round(this.A03.density * 2.0f), Math.round(this.A03.density * 2.0f), Math.round(this.A03.density * 2.0f));
        this.A00.setLayoutParams(layoutParams);
    }

    private void A05() {
        this.A01 = new TextView(getContext());
        addView(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.width = 0;
        layoutParams.leftMargin = (int) (this.A03.density * 20.0f);
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        this.A01.setLayoutParams(layoutParams);
        this.A01.setSingleLine();
        this.A01.setText(this.A06);
        this.A01.setTextSize(10.0f);
        this.A01.setTextColor(-4341303);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        Paint paint = new Paint();
        paint.setTextSize(this.A01.getTextSize());
        int targetWidth = Math.round(paint.measureText(this.A06) + (this.A03.density * 4.0f));
        int textWidth = getWidth();
        int startWidth = textWidth - targetWidth;
        PI pi = new PI(this, textWidth, startWidth);
        pi.setAnimationListener(new PJ(this));
        pi.setDuration(300L);
        pi.setFillAfter(true);
        startAnimation(pi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        Paint paint = new Paint();
        paint.setTextSize(this.A01.getTextSize());
        int startWidth = Math.round(paint.measureText(this.A06) + (this.A03.density * 4.0f));
        int textWidth = getWidth();
        int targetWidth = startWidth + textWidth;
        this.A02 = true;
        Animation expandAnimation = new PG(this, textWidth, targetWidth);
        expandAnimation.setAnimationListener(new PH(this));
        expandAnimation.setDuration(300L);
        expandAnimation.setFillAfter(true);
        startAnimation(expandAnimation);
    }

    private void A08() {
        setOnTouchListener(new PF(this));
    }
}
