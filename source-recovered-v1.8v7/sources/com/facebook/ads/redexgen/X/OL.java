package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class OL extends FrameLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0998a5 A02;
    public final OC A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{47, 34, 52, 30, 47, 33, 34, 33, 28, 51, 38, 33, 34, 44, 6, 18, 16, -47, 9, 4, 6, 8, 5, 18, 18, 14, -47, 4, 7, 22, -47, 12, 17, 23, 8, 21, 22, 23, 12, 23, 12, 4, 15, -47, 6, 15, 12, 6, 14, 8, 7};
    }

    static {
        A01();
        A08 = (int) (C0635Ly.A01 * 36.0f);
        A09 = (int) (C0635Ly.A01 * 36.0f);
        A05 = (int) (C0635Ly.A01 * 23.0f);
        A07 = (int) (C0635Ly.A01 * 8.0f);
        A06 = (int) (C0635Ly.A01 * 3.0f);
        A0A = (int) (C0635Ly.A01 * 4.0f);
    }

    public OL(OC oc, String str, C1I c1i, InterfaceC0682Nu interfaceC0682Nu) {
        String strA00;
        super(oc.A05());
        this.A03 = oc;
        this.A00 = c1i.A08(true);
        this.A01 = new RelativeLayout(oc.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A03(str, c1i, JQ.A1T(this.A03.A05()));
        if (oc.A04().A0S().equals(A00(0, 14, 127))) {
            strA00 = PE.A04.A02();
        } else {
            strA00 = A00(14, 37, 101);
        }
        this.A02 = new ViewOnClickListenerC0998a5(oc.A05(), strA00, null, oc.A06(), oc.A09(), oc.A0B(), oc.A07());
        this.A02.setCta(oc.A04().A0L().A0F(), oc.A04().A0P(), new HashMap(), interfaceC0682Nu);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A02(View view, boolean z) {
        OL ol = this;
        RelativeLayout.LayoutParams layoutParams = null;
        ImageView imageView = new ImageView(ol.A03.A05());
        imageView.setImageBitmap(M7.A00(M6.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        int i = 0;
        imageView.setClickable(false);
        char c2 = z ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    ol = ol;
                    imageView = imageView;
                    imageView.setColorFilter(ol.A00);
                    c2 = 3;
                    break;
                case 3:
                    imageView = imageView;
                    int i2 = A05;
                    layoutParams = new RelativeLayout.LayoutParams(i2, i2);
                    int i3 = A06;
                    imageView.setPadding(i3, i3, i3, i3);
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.bottomMargin = i;
                    layoutParams2.addRule(2, view.getId());
                    layoutParams2.addRule(14);
                    ol.A01.addView(imageView, layoutParams2);
                    return;
                case 5:
                    i = A07;
                    c2 = 4;
                    break;
                case 6:
                    ol = ol;
                    imageView = imageView;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(ol.A00);
                    gradientDrawable.setShape(1);
                    imageView.setBackgroundDrawable(gradientDrawable);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A03(String str, C1I c1i, boolean z) {
        OL ol = this;
        String upperCase = null;
        TextView textView = null;
        char c2 = z ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    ol = ol;
                    textView = new Button(ol.A03.A05());
                    c2 = 3;
                    break;
                case 3:
                    textView = textView;
                    C0635Ly.A0N(textView);
                    int i = A09;
                    textView.setPadding(i, 0, i, 0);
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    upperCase = str.toUpperCase();
                    c2 = 5;
                    break;
                case 5:
                    textView = textView;
                    upperCase = upperCase;
                    textView.setText(upperCase);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ol = ol;
                    textView = textView;
                    C0635Ly.A0S(textView, ol.A00, A0A);
                    textView.setTextColor(-16777216);
                    c2 = 7;
                    break;
                case 7:
                    OL ol2 = ol;
                    TextView textView2 = textView;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A08);
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                    ol2.A01.addView(textView2, layoutParams);
                    ol2.A02(textView2, z);
                    return;
                case '\b':
                    ol = ol;
                    textView = textView;
                    textView.setTextColor(ol.A00);
                    c2 = 7;
                    break;
                case '\t':
                    str = str;
                    upperCase = str;
                    c2 = 5;
                    break;
                case '\n':
                    ol = ol;
                    textView = new TextView(ol.A03.A05());
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}
