package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class OI extends AnimatorListenerAdapter {
    public final /* synthetic */ YY A00;
    public final /* synthetic */ boolean A01;

    public OI(YY yy, boolean z) {
        this.A00 = yy;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OI oi = this;
        super.onAnimationEnd(animator);
        oi.A00.A0F.setTranslationY(0.0f);
        oi.A00.A0K();
        char c2 = !oi.A01 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    oi = oi;
                    if (oi.A00.A0D == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    oi = oi;
                    oi.A00.A0D.destroy();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
