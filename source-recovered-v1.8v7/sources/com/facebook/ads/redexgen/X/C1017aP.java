package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.aP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1017aP extends N0 {
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final XI A04;
    public static final int A07 = (int) (C0635Ly.A01 * 4.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 10.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 44.0f);

    public C1017aP(XI xi, JW jw, String str) {
        super(xi, jw, str);
        this.A04 = xi;
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i = A06;
        imageView.setPadding(i, i, i, i);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i2 = A05;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        C0635Ly.A0P(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0K() {
        this.A01.setImageBitmap(M7.A00(M6.CROSS));
        this.A01.setOnClickListener(new N9(this));
        N4 n4 = new N4(this.A04);
        n4.setData(AnonymousClass24.A0B(this.A04.A00()), M6.HIDE_AD);
        n4.setOnClickListener(new NA(this, n4));
        N4 n42 = new N4(this.A04);
        n42.setData(AnonymousClass24.A0F(this.A04.A00()), M6.REPORT_AD);
        n42.setOnClickListener(new NB(this, n42));
        N4 n43 = new N4(this.A04);
        n43.setData(AnonymousClass24.A0G(this.A04.A00()), M6.AD_CHOICES_ICON);
        n43.setOnClickListener(new NC(this, n43));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A07;
        layoutParams.setMargins(0, i, i, i);
        C0635Ly.A0X(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(n4, layoutParams);
        this.A02.addView(n42, layoutParams);
        this.A02.addView(n43, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0L() {
        C0635Ly.A0L(this);
        C0635Ly.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0M(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        C0635Ly.A0b(textView, true, 14);
        textView.setText(AnonymousClass24.A07(this.A04.A00()));
        textView.setGravity(17);
        C0635Ly.A0X(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0N(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25) {
        C1017aP c1017aP = this;
        C0635Ly.A0X(c1017aP.A03);
        c1017aP.A01.setImageBitmap(M7.A00(M6.BACK_ARROW));
        c1017aP.A01.setOnClickListener(new ND(c1017aP));
        c1017aP.A02.removeAllViews();
        c1017aP.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A07;
        layoutParams.setMargins(0, i, i, i);
        Iterator<AnonymousClass27> it = anonymousClass27.A05().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1017aP = c1017aP;
                    layoutParams = layoutParams;
                    it = it;
                    AnonymousClass27 next = it.next();
                    N4 n4 = new N4(c1017aP.A04);
                    n4.setData(next.A04(), null);
                    n4.setOnClickListener(new NE(c1017aP, n4, next));
                    c1017aP.A02.addView(n4, layoutParams);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final boolean A0O() {
        return true;
    }
}
