package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class OH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ YY A00;

    public OH(YY yy) {
        this.A00 = yy;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A06.getLayoutParams().height = num.intValue();
        this.A00.A06.requestLayout();
    }
}
