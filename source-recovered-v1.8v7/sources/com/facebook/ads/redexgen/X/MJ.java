package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class MJ extends LinearLayout {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final ImageView A01;
    public final XI A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-103, -68};
    }

    static {
        A02();
        A07 = (int) (C0635Ly.A01 * 50.0f);
        A04 = (int) (C0635Ly.A01 * 10.0f);
        A05 = (int) (C0635Ly.A01 * 20.0f);
        A08 = (int) (C0635Ly.A01 * 4.0f);
        A06 = (int) (C0635Ly.A01 * 12.0f);
    }

    public MJ(XI xi, int i) {
        super(xi);
        this.A02 = xi;
        setOrientation(0);
        this.A00 = new ImageView(xi);
        this.A01 = new ImageView(xi);
        A03(i);
    }

    private void A03(int i) {
        MJ mj = this;
        M6 m6 = null;
        A04(mj.A00, M6.AD_CHOICES_ICON);
        char c2 = i == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    mj = mj;
                    int i2 = A04;
                    mj.setPadding(i2, i2 / 3, i2, i2 / 3);
                    TextView textView = new TextView(mj.A02);
                    textView.setText(A01(0, 2, 3));
                    textView.setTextColor(-1);
                    int i3 = A04;
                    textView.setPadding(0, i3 / 2, i3 / 2, i3 / 2);
                    C0635Ly.A0b(textView, true, 13);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    mj.addView(textView, layoutParams);
                    int i4 = A06;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, i4);
                    layoutParams2.gravity = 16;
                    mj.addView(mj.A00, layoutParams2);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    mj = mj;
                    int i5 = A04;
                    mj.setPadding(i5, i5, i5, i5);
                    if (i != 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    m6 = M6.AN_INFO_ICON;
                    c2 = 6;
                    break;
                case 6:
                    mj = mj;
                    m6 = m6;
                    A04(mj.A01, m6);
                    int i6 = A05;
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i6, i6);
                    layoutParams3.gravity = 17;
                    mj.addView(mj.A01, layoutParams3);
                    int i7 = A05;
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i7, i7);
                    layoutParams4.setMargins(A08, 0, 0, 0);
                    layoutParams4.gravity = 17;
                    mj.addView(mj.A00, layoutParams4);
                    c2 = 3;
                    break;
                case 7:
                    m6 = M6.DEFAULT_INFO_ICON;
                    c2 = 6;
                    break;
            }
        }
    }

    public static void A04(ImageView imageView, M6 m6) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(M7.A00(m6));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1R c1r, String str, C0565Jd c0565Jd, MQ mq) {
        setOnClickListener(new MI(this, c0565Jd, mq, str, c1r));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A07);
        gradientDrawable.setColor(i);
        C0635Ly.A0W(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}
