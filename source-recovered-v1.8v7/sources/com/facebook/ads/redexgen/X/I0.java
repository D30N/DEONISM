package com.facebook.ads.redexgen.X;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class I0 implements PY {
    public static byte[] A06;

    @Nullable
    public ValueAnimator A00;
    public PX A01 = PX.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A06 = new byte[]{10, 27, 6, 10, 61, 17, 18, 17, 12};
    }

    public I0(View view, int i, int i2, int i3) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i2;
        this.A03 = i3;
    }

    private void A06(int i, int i2) {
        PX px = null;
        char c2 = i == this.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    px = PX.A03;
                    c2 = 3;
                    break;
                case 3:
                    I0 i0 = this;
                    i0.A01 = px;
                    i0.A00 = ObjectAnimator.ofInt((TextView) i0.A05, A04(0, 9, k.AppCompatTheme_windowNoTitle), i, i2);
                    i0.A00.setEvaluator(new ArgbEvaluator());
                    i0.A00.setDuration(i0.A02);
                    i0.A00.addListener(new C0717Pe(i0, i, i2));
                    i0.A00.start();
                    return;
                case 4:
                    px = PX.A05;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i2, boolean z) {
        I0 i0 = this;
        PX px = null;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i0 = i0;
                    i0.A06(i, i2);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    i0 = i0;
                    ((TextView) i0.A05).setTextColor(i2);
                    if (i2 != i0.A03) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    px = PX.A02;
                    c2 = 6;
                    break;
                case 6:
                    i0 = i0;
                    px = px;
                    i0.A01 = px;
                    c2 = 3;
                    break;
                case 7:
                    px = PX.A04;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void A3N(boolean z, boolean z2) {
        I0 i0 = this;
        int i = 0;
        int i2 = 0;
        char c2 = z2 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    i0 = i0;
                    i2 = i0.A03;
                    c2 = 3;
                    break;
                case 3:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i0 = i0;
                    i = i0.A04;
                    c2 = 5;
                    break;
                case 5:
                    i0.A07(i2, i, z);
                    return;
                case 6:
                    i0 = i0;
                    i = i0.A03;
                    c2 = 5;
                    break;
                case 7:
                    i0 = i0;
                    i2 = i0.A04;
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
