package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.redexgen.X.C0565Jd;
import com.facebook.ads.redexgen.X.C0635Ly;
import com.facebook.ads.redexgen.X.C0649Mn;
import com.facebook.ads.redexgen.X.C0697Oj;
import com.facebook.ads.redexgen.X.C1I;
import com.facebook.ads.redexgen.X.C1R;
import com.facebook.ads.redexgen.X.C1Y;
import com.facebook.ads.redexgen.X.MJ;
import com.facebook.ads.redexgen.X.MK;
import com.facebook.ads.redexgen.X.ML;
import com.facebook.ads.redexgen.X.MQ;
import com.facebook.ads.redexgen.X.MU;
import com.facebook.ads.redexgen.X.XI;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends ML {
    public static byte[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;

    @Nullable
    public MK A00;
    public final RelativeLayout A01;
    public final C0565Jd A02;
    public final MJ A03;
    public final MQ A04;
    public final C0649Mn A05;
    public final C0697Oj A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A07 = new byte[]{117, 66, 87, 72, 85, 83, 7, 102, 67, 52, 27, 24, 4, 18, 87, 54, 19};
    }

    static {
        A03();
        A08 = (int) (C0635Ly.A01 * 10.0f);
        A0C = (int) (C0635Ly.A01 * 16.0f);
        int i = A0C;
        int i2 = A08;
        A0A = i - i2;
        A0B = (i * 2) - i2;
        A09 = (int) (C0635Ly.A01 * 4.0f);
    }

    public FullScreenAdToolbar(XI xi, MQ mq, C0565Jd c0565Jd, @ToolbarActionView$ToolbarActionMode int i, int i2) {
        super(xi);
        this.A04 = mq;
        this.A02 = c0565Jd;
        setGravity(16);
        this.A05 = new C0649Mn(xi, i);
        this.A05.setContentDescription(A02(9, 8, 103));
        this.A05.setActionClickListener(new MU(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A0A;
        layoutParams.setMargins(i3, i3, A0B, i3);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(xi);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new C0697Oj(xi);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new MJ(xi, i2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i4 = A0C;
        layoutParams4.setMargins(0, i4 / 2, i4 / 2, i4 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final void A04(C1I c1i, boolean z) {
        FullScreenAdToolbar fullScreenAdToolbar = this;
        int iA04 = c1i.A04(z);
        fullScreenAdToolbar.A06.A01(c1i.A0A(z), iA04);
        fullScreenAdToolbar.A03.setIconColors(iA04);
        fullScreenAdToolbar.A03.setContentDescription(A02(0, 9, 55));
        fullScreenAdToolbar.A05.setColors(iA04);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    fullScreenAdToolbar = fullScreenAdToolbar;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
                    gradientDrawable.setCornerRadius(0.0f);
                    C0635Ly.A0W(fullScreenAdToolbar, gradientDrawable);
                    C0635Ly.A0T(fullScreenAdToolbar.A03, 0, -16777216, A09);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    fullScreenAdToolbar = fullScreenAdToolbar;
                    C0635Ly.A0P(fullScreenAdToolbar, 0);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final boolean A06() {
        return this.A05.A01();
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public int getToolbarHeight() {
        return ML.A00;
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setAdReportingVisible(boolean z) {
        int i = 0;
        MJ mj = this.A03;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    mj.setVisibility(i);
                    return;
                case 4:
                    i = 8;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setPageDetails(C1R c1r, String str, int i, C1Y c1y) {
        this.A05.setInitialUnskippableSeconds(i);
        this.A06.setPageDetails(c1r);
        this.A03.setAdDetails(c1r, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setPageDetailsVisible(boolean z) {
        this.A01.removeAllViews();
        if (z) {
            this.A01.addView(this.A06);
        }
        this.A05.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setProgress(float f) {
        this.A05.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i) {
        this.A05.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setToolbarListener(MK mk) {
        this.A00 = mk;
    }
}
