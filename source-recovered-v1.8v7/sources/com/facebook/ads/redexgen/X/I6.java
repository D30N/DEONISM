package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class I6 implements PY {
    public int A00;

    @Nullable
    public ValueAnimator A01;
    public PX A02 = PX.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public I6(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C0714Pb(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        I6 i6 = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i6 = i6;
                    i6.A02 = PX.A05;
                    i6.A01 = i6.A00(i6.A00, i6.A04, i6.A05);
                    i6.A01.addListener(new C0713Pa(i6));
                    i6.A01.start();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    i6 = i6;
                    ViewGroup.LayoutParams layoutParams = i6.A05.getLayoutParams();
                    layoutParams.height = i6.A04;
                    i6.A05.setLayoutParams(layoutParams);
                    C0635Ly.A0K(i6.A05);
                    i6.A02 = PX.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        I6 i6 = this;
        C0635Ly.A0O(i6.A05);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i6 = i6;
                    i6.A02 = PX.A03;
                    i6.A01 = i6.A00(i6.A04, i6.A00, i6.A05);
                    i6.A01.addListener(new PZ(i6));
                    i6.A01.start();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    i6 = i6;
                    ViewGroup.LayoutParams layoutParams = i6.A05.getLayoutParams();
                    layoutParams.height = i6.A00;
                    i6.A05.setLayoutParams(layoutParams);
                    i6.A02 = PX.A02;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A09(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void A3N(boolean z, boolean z2) {
        I6 i6 = this;
        char c2 = z2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i6 = i6;
                    i6.A07(z);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    i6 = i6;
                    i6.A08(z);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final PX A74() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
