package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MX implements Animation.AnimationListener {
    public final /* synthetic */ C02304x A00;
    public final /* synthetic */ AbstractC1055b1 A01;
    public final /* synthetic */ AbstractC1055b1 A02;

    public MX(AbstractC1055b1 abstractC1055b1, AbstractC1055b1 abstractC1055b12, C02304x c02304x) {
        this.A01 = abstractC1055b1;
        this.A02 = abstractC1055b12;
        this.A00 = c02304x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        C0635Ly.A0K(this.A02);
        new Handler().postDelayed(new C1074bK(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
