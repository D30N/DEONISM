package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.annotation.Nullable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IS extends RelativeLayout implements PD {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public C9C A03;
    public C9C A04;
    public C9C A05;
    public C9C A06;

    @Nullable
    public C0755Qq A07;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A08 = new byte[]{-35, -33, -36, -44, -33, -46, -32, -32};
    }

    static {
        A05();
        A09 = (int) (C0635Ly.A01 * 6.0f);
    }

    public IS(XI xi) {
        this(xi, A09, -12549889, 0);
    }

    public IS(XI xi, int i, int i2, int i3) {
        super(xi);
        this.A00 = -1;
        this.A06 = new AbstractC0598Kl() { // from class: com.facebook.ads.redexgen.X.6X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02967u c02967u) {
                if (this.A00.A07 == null) {
                    return;
                }
                this.A00.A04();
            }
        };
        this.A04 = new LM() { // from class: com.facebook.ads.redexgen.X.5m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                this.A00.A03();
            }
        };
        this.A05 = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.4c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                if (this.A00.A07 == null) {
                    return;
                }
                this.A00.A04();
            }
        };
        this.A03 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.4U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                if (this.A00.A07 == null) {
                    return;
                }
                this.A00.A02();
            }
        };
        this.A02 = new ProgressBar(xi, null, R.attr.progressBarStyleHorizontal);
        A0A(i2, i3);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A03();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 61), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        IS is = this;
        int duration = 0;
        int progress = 0;
        int duration2 = 0;
        int currentPositionInMillis = 0;
        char c2 = is.A07 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    is = is;
                    is.A03();
                    currentPositionInMillis = is.A07.getCurrentPositionInMillis();
                    duration2 = is.A07.getDuration();
                    if (duration2 <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    int progress2 = currentPositionInMillis * 10000;
                    progress = progress2 / duration2;
                    c2 = 5;
                    break;
                case 5:
                    is = is;
                    duration = is.A00;
                    if (duration >= progress) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (duration2 > currentPositionInMillis) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    progress = 0;
                    c2 = 5;
                    break;
                case '\t':
                    IS is2 = is;
                    is2.A01 = ObjectAnimator.ofInt(is2.A02, A01(0, 8, 61), duration, progress);
                    is2.A01.setDuration(Math.min(250, duration2 - currentPositionInMillis));
                    is2.A01.setInterpolator(new LinearInterpolator());
                    is2.A01.start();
                    is2.A00 = progress;
                    return;
            }
        }
    }

    public final void A09() {
        A03();
        this.A02 = null;
        this.A07 = null;
    }

    public final void A0A(int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i2), new ColorDrawable(i2), new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void A7t(C0755Qq c0755Qq) {
        this.A07 = c0755Qq;
        c0755Qq.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void ADf(C0755Qq c0755Qq) {
        c0755Qq.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
