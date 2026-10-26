package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class XP extends AnimationAnimationListenerC0634Lx {
    public final /* synthetic */ XN A00;

    public XP(XN xn) {
        this.A00 = xn;
    }

    @Override // com.facebook.ads.redexgen.X.AnimationAnimationListenerC0634Lx, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0635Ly.A0K(this.A00.A01);
        this.A00.A00.AA0();
    }
}
