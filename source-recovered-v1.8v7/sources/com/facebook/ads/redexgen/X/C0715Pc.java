package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0715Pc extends AnimatorListenerAdapter {
    public final /* synthetic */ I4 A00;

    public C0715Pc(I4 i4) {
        this.A00 = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C0715Pc c0715Pc = this;
        char c2 = c0715Pc.A00.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0715Pc = c0715Pc;
                    C0635Ly.A0K(c0715Pc.A00.A03);
                    c2 = 3;
                    break;
                case 3:
                    c0715Pc = c0715Pc;
                    c0715Pc.A00.A03.setAlpha(0.0f);
                    c0715Pc.A00.A01 = PX.A04;
                    if (c0715Pc.A00.A00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0715Pc = c0715Pc;
                    c0715Pc.A00.A00.setListener(null);
                    c0715Pc.A00.A00 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = PX.A02;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
