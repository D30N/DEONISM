package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.aT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1021aT extends N0 {
    public static final int A02 = (int) (C0635Ly.A01 * 8.0f);
    public final RelativeLayout A00;
    public final XI A01;

    public C1021aT(XI xi, JW jw, String str, C1R c1r, MR mr, MQ mq) {
        super(xi, jw, str, c1r, mr, mq);
        this.A01 = xi;
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        C0635Ly.A0P(this.A00, -1728053248);
        this.A00.setOnClickListener(new N5(this));
    }

    public static RelativeLayout.LayoutParams A0A(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0B() {
        C1021aT c1021aT = this;
        char c2 = Build.VERSION.SDK_INT >= 21 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1021aT = c1021aT;
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
                    C0635Ly.A0Z(c1021aT, transitionSet);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1021aT = c1021aT;
                    C0635Ly.A0X(c1021aT);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0K() {
        AnonymousClass27 anonymousClass27A03 = AnonymousClass24.A03(this.A01.A00());
        NF nf = new NF(this.A01);
        nf.setInfo(M6.HIDE_AD, AnonymousClass24.A0B(this.A01.A00()), AnonymousClass24.A0A(this.A01.A00()));
        nf.setOnClickListener(new N6(this));
        AnonymousClass27 anonymousClass27A04 = AnonymousClass24.A04(this.A01.A00());
        NF nf2 = new NF(this.A01);
        nf2.setInfo(M6.REPORT_AD, AnonymousClass24.A0F(this.A01.A00()), AnonymousClass24.A0E(this.A01.A00()));
        nf2.setOnClickListener(new N7(this));
        NF nf3 = new NF(this.A01);
        nf3.setInfo(M6.AD_CHOICES_ICON, AnonymousClass24.A0G(this.A01.A00()), "");
        nf3.setOnClickListener(new N8(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A02;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        C0635Ly.A0P(linearLayout, -1);
        char c2 = !anonymousClass27A03.A05().isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    nf = nf;
                    layoutParams = layoutParams;
                    linearLayout = linearLayout;
                    linearLayout.addView(nf, layoutParams);
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass27A04 = anonymousClass27A04;
                    if (!anonymousClass27A04.A05().isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    nf2 = nf2;
                    layoutParams = layoutParams;
                    linearLayout = linearLayout;
                    linearLayout.addView(nf2, layoutParams);
                    c2 = 5;
                    break;
                case 5:
                    C1021aT c1021aT = this;
                    LinearLayout linearLayout2 = linearLayout;
                    linearLayout2.addView(nf3, layoutParams);
                    c1021aT.A0B();
                    c1021aT.A00.removeAllViews();
                    c1021aT.A00.addView(linearLayout2, A0A(false));
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0L() {
        C0635Ly.A0L(this);
        this.A00.removeAllViews();
        C0635Ly.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0M(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25) {
        C1021aT c1021aT = this;
        String strA01 = null;
        boolean z = false;
        int i = 0;
        C0660My c0660MyA0E = null;
        M6 m6 = null;
        C0660My c0660My = null;
        C0660My c0660MyA0F = null;
        C0660My c0660MyA0D = null;
        boolean z2 = false;
        String strA08 = null;
        char c2 = anonymousClass25 == AnonymousClass25.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    anonymousClass25 = anonymousClass25;
                    z = true;
                    if (anonymousClass25 != AnonymousClass25.A05) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    c1021aT = c1021aT;
                    c0660My = new C0660My(c1021aT.A01, c1021aT.A0A);
                    if (!z2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1021aT = c1021aT;
                    strA08 = AnonymousClass24.A09(c1021aT.A01.A00());
                    c2 = 7;
                    break;
                case 7:
                    c1021aT = c1021aT;
                    anonymousClass27 = anonymousClass27;
                    c0660My = c0660My;
                    strA08 = strA08;
                    c0660MyA0F = c0660My.A0I(strA08).A0H(AnonymousClass24.A07(c1021aT.A01.A00())).A0F(anonymousClass27.A04());
                    if (!z2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    m6 = M6.REPORT_AD;
                    c2 = '\t';
                    break;
                case '\t':
                    c0660MyA0F = c0660MyA0F;
                    m6 = m6;
                    c0660MyA0E = c0660MyA0F.A0E(m6);
                    if (!z2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i = -552389;
                    c2 = 11;
                    break;
                case 11:
                    c1021aT = c1021aT;
                    c0660MyA0E = c0660MyA0E;
                    c0660MyA0D = c0660MyA0E.A0D(i);
                    if (c1021aT.A09 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1021aT = c1021aT;
                    strA01 = c1021aT.A09.A01();
                    c2 = '\r';
                    break;
                case '\r':
                    C1021aT c1021aT2 = c1021aT;
                    C0661Mz c0661MzA0M = c0660MyA0D.A0G(strA01).A0M();
                    C0635Ly.A0P(c0661MzA0M, -1);
                    C0635Ly.A0X(c1021aT2);
                    c1021aT2.A00.removeAllViews();
                    c1021aT2.A00.addView(c0661MzA0M, A0A(z));
                    return;
                case 14:
                    strA01 = "";
                    c2 = '\r';
                    break;
                case 15:
                    i = -13272859;
                    c2 = 11;
                    break;
                case 16:
                    m6 = M6.HIDE_AD;
                    c2 = '\t';
                    break;
                case 17:
                    c1021aT = c1021aT;
                    strA08 = AnonymousClass24.A08(c1021aT.A01.A00());
                    c2 = 7;
                    break;
                case 18:
                    z2 = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final void A0N(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25) {
        String strA0B;
        boolean z = anonymousClass25 == AnonymousClass25.A05;
        XI xi = this.A01;
        N2 n2 = this.A0A;
        if (z) {
            strA0B = AnonymousClass24.A0F(this.A01.A00());
        } else {
            strA0B = AnonymousClass24.A0B(this.A01.A00());
        }
        NI ni = new NI(xi, anonymousClass27, n2, strA0B, z ? M6.REPORT_AD : M6.HIDE_AD);
        ni.setClickable(true);
        C0635Ly.A0P(ni, -1);
        int i = A02;
        ni.setPadding(i * 2, i, i * 2, i);
        A0B();
        this.A00.removeAllViews();
        this.A00.addView(ni, A0A(false));
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final boolean A0O() {
        return false;
    }
}
