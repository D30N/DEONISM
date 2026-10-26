package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0717Pe implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ I0 A02;

    public C0717Pe(I0 i0, int i, int i2) {
        this.A02 = i0;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0717Pe c0717Pe = this;
        PX px = null;
        I0 i0 = c0717Pe.A02;
        char c2 = c0717Pe.A01 == i0.A04 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    px = PX.A02;
                    c2 = 3;
                    break;
                case 3:
                    c0717Pe = c0717Pe;
                    i0 = i0;
                    px = px;
                    i0.A01 = px;
                    if (c0717Pe.A02.A00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0717Pe = c0717Pe;
                    c0717Pe.A02.A00.removeAllListeners();
                    c0717Pe.A02.A00 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    px = PX.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
