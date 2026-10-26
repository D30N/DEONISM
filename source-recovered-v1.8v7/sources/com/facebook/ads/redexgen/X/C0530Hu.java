package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.support.annotation.Nullable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0530Hu implements PY {

    @Nullable
    public ValueAnimator A00;
    public PX A01 = PX.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C0530Hu(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
    }

    private ValueAnimator A00(View view, int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C0720Ph(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        C0530Hu c0530Hu = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0530Hu = c0530Hu;
                    c0530Hu.A01 = PX.A05;
                    c0530Hu.A00 = c0530Hu.A00(c0530Hu.A05, c0530Hu.A03, c0530Hu.A04);
                    c0530Hu.A00.addListener(new C0719Pg(c0530Hu));
                    c0530Hu.A00.start();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0530Hu = c0530Hu;
                    c0530Hu.A05.setTranslationY(c0530Hu.A04);
                    C0635Ly.A0K(c0530Hu.A05);
                    c0530Hu.A01 = PX.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        C0530Hu c0530Hu = this;
        C0635Ly.A0O(c0530Hu.A05);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0530Hu = c0530Hu;
                    c0530Hu.A01 = PX.A03;
                    c0530Hu.A00 = c0530Hu.A00(c0530Hu.A05, c0530Hu.A04, c0530Hu.A03);
                    c0530Hu.A00.addListener(new C0718Pf(c0530Hu));
                    c0530Hu.A00.start();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0530Hu = c0530Hu;
                    c0530Hu.A05.setTranslationY(c0530Hu.A03);
                    c0530Hu.A01 = PX.A02;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void A3N(boolean z, boolean z2) {
        C0530Hu c0530Hu = this;
        char c2 = z2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0530Hu = c0530Hu;
                    c0530Hu.A08(z);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0530Hu = c0530Hu;
                    c0530Hu.A09(z);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final PX A74() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
