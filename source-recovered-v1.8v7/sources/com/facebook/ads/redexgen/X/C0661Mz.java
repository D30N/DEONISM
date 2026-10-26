package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0661Mz extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final XI A02;
    public final N2 A03;
    public final boolean A04;
    public static final int A08 = (int) (C0635Ly.A01 * 16.0f);
    public static final int A09 = (int) (C0635Ly.A01 * 8.0f);
    public static final int A0C = (int) (C0635Ly.A01 * 44.0f);
    public static final int A07 = (int) (C0635Ly.A01 * 10.0f);
    public static final int A06 = A08 - A07;
    public static final int A0D = (int) (C0635Ly.A01 * 75.0f);
    public static final int A0A = (int) (C0635Ly.A01 * 25.0f);
    public static final int A0E = (int) (C0635Ly.A01 * 45.0f);
    public static final int A0B = (int) (C0635Ly.A01 * 15.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 16.0f);

    public C0661Mz(C0660My c0660My) {
        super(c0660My.A0C);
        this.A02 = c0660My.A0C;
        this.A03 = c0660My.A02;
        this.A01 = c0660My.A0B ? A0D : A0E;
        this.A00 = c0660My.A0B ? A0A : A0B;
        this.A04 = c0660My.A07;
        setClickable(true);
        View viewA01 = A01(c0660My);
        View viewA00 = A00(c0660My);
        View footerView = getFooterView();
        C0635Ly.A0N(viewA01);
        C0635Ly.A0N(viewA00);
        C0635Ly.A0N(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, viewA01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i = A08;
        layoutParams3.setMargins(i, 0, i, i);
        addView(viewA01, layoutParams);
        addView(viewA00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(c0660My.A08 ? 0 : 8);
    }

    public /* synthetic */ C0661Mz(C0660My c0660My, ViewOnClickListenerC0658Mw viewOnClickListenerC0658Mw) {
        this(c0660My);
    }

    private View A00(C0660My c0660My) {
        C0660My c0660My2 = c0660My;
        C0661Mz c0661Mz = this;
        LinearLayout linearLayout = null;
        C0661Mz c0661Mz2 = c0661Mz;
        ImageView imageView = new ImageView(c0661Mz.getContext());
        int i = c0661Mz2.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(M7.A00(c0660My2.A01));
        imageView.setColorFilter(-1);
        int i2 = c0661Mz2.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c0660My2.A00);
        C0635Ly.A0W(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i3 = A08;
        layoutParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(c0661Mz.getContext());
        C0635Ly.A0b(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(c0660My2.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i4 = A08;
        layoutParams2.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(c0661Mz.getContext());
        C0635Ly.A0b(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(c0660My2.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A08;
        layoutParams3.setMargins(i5, 0, i5, i5);
        LinearLayout linearLayout2 = new LinearLayout(c0661Mz.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(textView, layoutParams2);
        linearLayout2.addView(textView2, layoutParams3);
        char c2 = c0660My2.A09 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0661Mz = c0661Mz;
                    c0660My2 = c0660My2;
                    linearLayout = new LinearLayout(c0661Mz.getContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(17);
                    if (!TextUtils.isEmpty(c0660My2.A04)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0660My2 = c0660My2;
                    c0661Mz2 = c0661Mz2;
                    linearLayout = linearLayout;
                    C0687Nz c0687Nz = new C0687Nz(c0661Mz2.A02);
                    int i6 = A0E;
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i6, i6);
                    layoutParams4.setMargins(0, 0, A09, 0);
                    c0687Nz.setFullCircleCorners(true);
                    AsyncTaskC1002aA asyncTaskC1002aA = new AsyncTaskC1002aA(c0687Nz, c0661Mz2.A02);
                    int i7 = A0E;
                    asyncTaskC1002aA.A05(i7, i7).A07(c0660My2.A04);
                    linearLayout.addView(c0687Nz, layoutParams4);
                    c2 = 4;
                    break;
                case 4:
                    c0660My2 = c0660My2;
                    c0661Mz2 = c0661Mz2;
                    linearLayout2 = linearLayout2;
                    linearLayout = linearLayout;
                    N4 n4 = new N4(c0661Mz2.A02);
                    n4.setData(c0660My2.A03, M6.CHECKMARK);
                    n4.setSelected(true);
                    LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
                    linearLayout.addView(n4, selectedOptionParams);
                    linearLayout2.addView(linearLayout);
                    c2 = 5;
                    break;
                case 5:
                    return linearLayout2;
            }
        }
    }

    private View A01(C0660My c0660My) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c0660My.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i = A07;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(M7.A00(M6.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC0658Mw(this));
            int i2 = A0C;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A06;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(M7.A00(M6.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A05;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        C0635Ly.A0b(textView, false, 16);
        textView.setTextColor(-13272859);
        int i2 = A09;
        textView.setPadding(i2, i2, i2, i2);
        textView.setText(AnonymousClass24.A0D(this.A02.A00()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0659Mx(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
