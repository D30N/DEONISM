package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdChoicesViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02224p implements AdChoicesViewApi {
    public static byte[] A07;
    public TextView A00;
    public String A01;
    public boolean A02 = false;
    public final float A03 = C0635Ly.A01;
    public final AdChoicesView A04;
    public final NativeAdBase A05;
    public final XI A06;

    static {
        A07();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A07 = new byte[]{41, 12, 43, 0, 7, 1, 11, 13, 27};
    }

    public C02224p(AdChoicesView adChoicesView, Context context, NativeAdBase nativeAdBase) {
        this.A04 = adChoicesView;
        this.A06 = AnonymousClass53.A02(context);
        this.A05 = nativeAdBase;
    }

    private ImageView A00(C0580Js c0580Js) {
        ImageView imageView = new ImageView(this.A04.getContext());
        this.A04.addView(imageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(c0580Js.getWidth() * this.A03), Math.round(c0580Js.getHeight() * this.A03));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(this.A03 * 4.0f), Math.round(this.A03 * 2.0f), Math.round(this.A03 * 2.0f), Math.round(this.A03 * 2.0f));
        imageView.setLayoutParams(layoutParams);
        C1141cR.A0e(c0580Js, imageView, this.A06);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        Paint paint = new Paint();
        paint.setTextSize(this.A00.getTextSize());
        int iRound = Math.round(paint.measureText(this.A01) + (this.A03 * 4.0f));
        final int textWidth = this.A04.getWidth();
        final int targetWidth = textWidth - iRound;
        Animation animation = new Animation() { // from class: com.facebook.ads.redexgen.X.4n
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i = (int) (textWidth + ((targetWidth - r2) * f));
                this.A02.A04.getLayoutParams().width = i;
                this.A02.A04.requestLayout();
                this.A02.A00.getLayoutParams().width = i - targetWidth;
                this.A02.A00.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.ads.redexgen.X.4o
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation2) {
                this.A00.A02 = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation2) {
            }
        });
        animation.setDuration(300L);
        animation.setFillAfter(true);
        this.A04.startAnimation(animation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        Paint paint = new Paint();
        paint.setTextSize(this.A00.getTextSize());
        int iRound = Math.round(paint.measureText(this.A01) + (this.A03 * 4.0f));
        final int textWidth = this.A04.getWidth();
        final int startWidth = textWidth + iRound;
        this.A02 = true;
        Animation expandAnimation = new Animation() { // from class: com.facebook.ads.redexgen.X.4l
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i = (int) (textWidth + ((startWidth - r2) * f));
                this.A02.A04.getLayoutParams().width = i;
                this.A02.A04.requestLayout();
                this.A02.A00.getLayoutParams().width = i - textWidth;
                this.A02.A00.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        expandAnimation.setAnimationListener(new AnimationAnimationListenerC02194m(this));
        expandAnimation.setDuration(300L);
        expandAnimation.setFillAfter(true);
        this.A04.startAnimation(expandAnimation);
    }

    @Override // com.facebook.ads.internal.api.AdChoicesViewApi
    public final void initialize(boolean z, @Nullable NativeAdLayout nativeAdLayout) {
        final C02224p c02224p = this;
        RelativeLayout.LayoutParams adChoicesTextViewLayoutParams = null;
        C0580Js adChoicesIcon = null;
        RelativeLayout.LayoutParams layoutParams = null;
        C1141cR.A0J(c02224p.A05.getInternalNativeAd()).A1K(nativeAdLayout);
        C0770Rf c0770RfA0u = C1141cR.A0J(c02224p.A05.getInternalNativeAd()).A0u();
        char c2 = c0770RfA0u != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770RfA0u = c0770RfA0u;
                    if (!c0770RfA0u.A0f()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0770RfA0u = c0770RfA0u;
                    if (!c0770RfA0u.A0d()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c02224p.A04.setVisibility(8);
                    return;
                case 5:
                    c02224p = c02224p;
                    c02224p.A01 = c02224p.A05.getAdChoicesText();
                    if (!TextUtils.isEmpty(c02224p.A01)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02224p = c02224p;
                    c02224p.A01 = A04(0, 9, 95);
                    c2 = 7;
                    break;
                case 7:
                    c02224p = c02224p;
                    adChoicesIcon = C1141cR.A0J(c02224p.A05.getInternalNativeAd()).getAdChoicesIcon();
                    adChoicesTextViewLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    c02224p.A04.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.4k
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            ViewOnTouchListenerC02174k viewOnTouchListenerC02174k = this;
                            char c3 = motionEvent.getAction() == 0 ? (char) 2 : (char) 6;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        viewOnTouchListenerC02174k = viewOnTouchListenerC02174k;
                                        if (!viewOnTouchListenerC02174k.A00.A02) {
                                            c3 = 5;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        viewOnTouchListenerC02174k = viewOnTouchListenerC02174k;
                                        C1141cR.A0J(viewOnTouchListenerC02174k.A00.A05.getInternalNativeAd()).A1C();
                                        c3 = 4;
                                        break;
                                    case 4:
                                        return true;
                                    case 5:
                                        viewOnTouchListenerC02174k = viewOnTouchListenerC02174k;
                                        viewOnTouchListenerC02174k.A00.A06();
                                        c3 = 4;
                                        break;
                                    case 6:
                                        return false;
                                }
                            }
                        }
                    });
                    c02224p.A00 = new TextView(c02224p.A04.getContext());
                    c02224p.A04.addView(c02224p.A00);
                    layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    adChoicesIcon = adChoicesIcon;
                    if (adChoicesIcon == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c02224p = c02224p;
                    adChoicesIcon = adChoicesIcon;
                    adChoicesTextViewLayoutParams = adChoicesTextViewLayoutParams;
                    layoutParams = layoutParams;
                    layoutParams.addRule(11, c02224p.A00(adChoicesIcon).getId());
                    layoutParams.width = 0;
                    adChoicesTextViewLayoutParams.width = Math.round((adChoicesIcon.getWidth() + 4) * c02224p.A03);
                    adChoicesTextViewLayoutParams.height = Math.round((adChoicesIcon.getHeight() + 2) * c02224p.A03);
                    c02224p.A02 = false;
                    c2 = '\n';
                    break;
                case '\n':
                    C02224p c02224p2 = c02224p;
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams;
                    c02224p2.A04.setLayoutParams(adChoicesTextViewLayoutParams);
                    layoutParams2.addRule(15, -1);
                    c02224p2.A00.setLayoutParams(layoutParams2);
                    c02224p2.A00.setSingleLine();
                    c02224p2.A00.setText(c02224p2.A01);
                    c02224p2.A00.setTextSize(10.0f);
                    c02224p2.A00.setTextColor(-4341303);
                    LW.A04(c02224p2.A04, LW.A07);
                    LW.A04(c02224p2.A00, LW.A07);
                    return;
                case 11:
                    c02224p = c02224p;
                    c02224p.A02 = true;
                    c2 = '\n';
                    break;
            }
        }
    }
}
