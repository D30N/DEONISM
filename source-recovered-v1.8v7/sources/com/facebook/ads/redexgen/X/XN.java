package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network.dex */
public class XN extends AbstractRunnableC0608Kw {
    public final /* synthetic */ InterfaceC0688Oa A00;
    public final /* synthetic */ C0689Ob A01;

    public XN(C0689Ob c0689Ob, InterfaceC0688Oa interfaceC0688Oa) {
        this.A01 = c0689Ob;
        this.A00 = interfaceC0688Oa;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new XP(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
