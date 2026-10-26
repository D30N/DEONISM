package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.4m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC02194m implements Animation.AnimationListener {
    public final /* synthetic */ C02224p A00;

    public AnimationAnimationListenerC02194m(C02224p c02224p) {
        this.A00 = c02224p;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        new Handler().postDelayed(new TK(this), 3000L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
