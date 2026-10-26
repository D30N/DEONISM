package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class PM extends AnimatorListenerAdapter {
    public final /* synthetic */ C7Z A00;

    public PM(C7Z c7z) {
        this.A00 = c7z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new JZ(this), 2000L);
    }
}
