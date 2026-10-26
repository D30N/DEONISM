package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: assets/audience_network.dex */
public final class I4 implements PY {

    @Nullable
    public ViewPropertyAnimator A00;
    public PX A01 = PX.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public I4(View view, int i, boolean z) {
        this.A02 = i;
        this.A03 = view;
        this.A04 = z;
    }

    private void A04(boolean z) {
        I4 i4 = this;
        float f = 0.0f;
        i4.A01 = PX.A03;
        char c2 = i4.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = i4;
                    C0635Ly.A0O(i4.A03);
                    c2 = 3;
                    break;
                case 3:
                    f = 1.0f;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i4 = i4;
                    i4.A00 = i4.A03.animate().alpha(f).setDuration(i4.A02).setListener(new C0715Pc(i4));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    i4 = i4;
                    i4.A03.setAlpha(f);
                    i4.A01 = PX.A02;
                    c2 = 5;
                    break;
            }
        }
    }

    private void A05(boolean z) {
        I4 i4 = this;
        i4.A01 = PX.A05;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = i4;
                    i4.A00 = i4.A03.animate().alpha(0.0f).setDuration(i4.A02).setListener(new C0716Pd(i4));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    i4 = i4;
                    i4.A03.setAlpha(0.0f);
                    i4.A01 = PX.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void A3N(boolean z, boolean z2) {
        I4 i4 = this;
        char c2 = z2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = i4;
                    i4.A05(z);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    i4 = i4;
                    i4.A04(z);
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
        this.A03.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }
}
