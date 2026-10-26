package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Pd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0716Pd extends AnimatorListenerAdapter {
    public final /* synthetic */ I4 A00;

    public C0716Pd(I4 i4) {
        this.A00 = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C0716Pd c0716Pd = this;
        char c2 = c0716Pd.A00.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0716Pd = c0716Pd;
                    C0635Ly.A0O(c0716Pd.A00.A03);
                    c2 = 3;
                    break;
                case 3:
                    c0716Pd = c0716Pd;
                    c0716Pd.A00.A03.setAlpha(1.0f);
                    c0716Pd.A00.A01 = PX.A02;
                    if (c0716Pd.A00.A00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0716Pd = c0716Pd;
                    c0716Pd.A00.A00.setListener(null);
                    c0716Pd.A00.A00 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0716Pd c0716Pd = this;
        char c2 = c0716Pd.A00.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0716Pd = c0716Pd;
                    C0635Ly.A0K(c0716Pd.A00.A03);
                    c2 = 3;
                    break;
                case 3:
                    c0716Pd = c0716Pd;
                    c0716Pd.A00.A01 = PX.A04;
                    if (c0716Pd.A00.A00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0716Pd = c0716Pd;
                    c0716Pd.A00.A00.setListener(null);
                    c0716Pd.A00.A00 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }
}
