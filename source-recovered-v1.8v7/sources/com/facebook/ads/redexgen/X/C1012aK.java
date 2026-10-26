package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1012aK extends N0 {
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final XI A03;
    public static final int A06 = (int) (C0635Ly.A01 * 8.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 10.0f);
    public static final int A04 = (int) (C0635Ly.A01 * 44.0f);

    public C1012aK(XI xi, JW jw, String str) {
        super(xi, jw, str);
        this.A03 = xi;
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i = A05;
        imageView.setPadding(i, i, i, i);
        this.A00.setColorFilter(-10459280);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        C0635Ly.A0P(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i3 = A06;
        linearLayout.setPadding(i3, i3, i3, i3);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0K() {
        this.A00.setImageBitmap(M7.A00(M6.CROSS));
        this.A00.setOnClickListener(new NJ(this));
        N4 n4 = new N4(this.A03);
        n4.setData(AnonymousClass24.A0B(this.A03.A00()), M6.HIDE_AD);
        n4.setOnClickListener(new NK(this, n4));
        N4 n42 = new N4(this.A03);
        n42.setData(AnonymousClass24.A0F(this.A03.A00()), M6.REPORT_AD);
        n42.setOnClickListener(new NL(this, n42));
        N4 n43 = new N4(this.A03);
        n43.setData(AnonymousClass24.A0G(this.A03.A00()), M6.AD_CHOICES_ICON);
        n43.setOnClickListener(new NM(this, n43));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A06;
        layoutParams.setMargins(i, i, i, i);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        C0635Ly.A0X(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams2);
        linearLayout.addView(n4, layoutParams);
        linearLayout.addView(n42, layoutParams);
        linearLayout.addView(n43, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0L() {
        C0635Ly.A0L(this);
        C0635Ly.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0M(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25) {
        C1012aK c1012aK = this;
        int i = 0;
        M6 m6 = null;
        String strA0B = null;
        c1012aK.A00.setOnClickListener(null);
        char c2 = anonymousClass25 == AnonymousClass25.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1012aK = c1012aK;
                    strA0B = AnonymousClass24.A09(c1012aK.A03.A00());
                    m6 = M6.REPORT_AD;
                    i = -552389;
                    c2 = 3;
                    break;
                case 3:
                    C1012aK c1012aK2 = c1012aK;
                    C0661Mz c0661MzA0M = new C0660My(c1012aK2.A03, c1012aK2.A0A).A0I(strA0B).A0H(AnonymousClass24.A07(c1012aK2.A03.A00())).A0F(anonymousClass27.A04()).A0K(false).A0E(m6).A0D(i).A0L(false).A0J(false).A0M();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                    layoutParams.gravity = 17;
                    layoutParams.weight = 1.0f;
                    C0635Ly.A0X(c1012aK2.A01);
                    c1012aK2.A02.fullScroll(33);
                    c1012aK2.A01.removeAllViews();
                    c1012aK2.A01.addView(c0661MzA0M, layoutParams);
                    return;
                case 4:
                    c1012aK = c1012aK;
                    strA0B = AnonymousClass24.A0B(c1012aK.A03.A00());
                    m6 = M6.HIDE_AD;
                    i = -13272859;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0N(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25) {
        NI ni = new NI(this.A03, anonymousClass27, this.A0A, anonymousClass25 == AnonymousClass25.A05 ? M6.REPORT_AD : M6.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(M7.A00(M6.BACK_ARROW));
        this.A00.setOnClickListener(new NN(this));
        C0635Ly.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(ni, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final boolean A0O() {
        return true;
    }
}
