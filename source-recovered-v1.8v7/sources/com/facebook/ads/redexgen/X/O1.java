package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class O1 extends LinearLayout {
    public static final int A06 = (int) (C0635Ly.A01 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final XI A04;
    public final O2[] A05;

    public O1(XI xi, int i, int i2, int i3, int i4) {
        super(xi);
        this.A00 = A06;
        this.A04 = xi;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new O2[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private O2 A00() {
        O2 o2 = new O2(this.A04, this.A01, this.A02);
        int i = this.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        o2.setLayoutParams(layoutParams);
        return o2;
    }

    private void A01() {
        O1 o1 = this;
        LinearLayout.LayoutParams layoutParams = null;
        O2[] o2Arr = null;
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    o1 = o1;
                    o2Arr = o1.A05;
                    if (i2 >= o2Arr.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    o2Arr = o2Arr;
                    layoutParams = (LinearLayout.LayoutParams) o2Arr[i2].getLayoutParams();
                    if (i2 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    layoutParams = layoutParams;
                    layoutParams.leftMargin = i;
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    o1 = o1;
                    i = o1.A00;
                    c2 = 5;
                    break;
                case 7:
                    o1.requestLayout();
                    return;
            }
        }
    }

    private void A02(float f) {
        O1 o1 = this;
        float fMin = 0.0f;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    o1 = o1;
                    if (i >= o1.A05.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fMin = Math.min(1.0f, f - i);
                    if (fMin >= 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fMin = 0.0f;
                    c2 = 5;
                    break;
                case 5:
                    o1 = o1;
                    o1.A05[i].setFillRatio(fMin);
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
