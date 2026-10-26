package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0988Zs extends AbstractC0679Nr {
    public static byte[] A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C1H A06;
    public C1J A07;
    public O1 A08;
    public boolean A09;
    public boolean A0A;
    public final LinearLayout A0B;
    public final RelativeLayout A0C;
    public final RelativeLayout A0D;
    public final TextView A0E;
    public final XI A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0H = new byte[]{-81, -5};
    }

    static {
        A07();
        A0P = C2H.A01(-1, 77);
        A0M = (int) (C0635Ly.A01 * 12.0f);
        A0N = (int) (C0635Ly.A01 * 8.0f);
        A0I = (int) (C0635Ly.A01 * 26.0f);
        A0K = (int) (C0635Ly.A01 * 144.0f);
        A0L = (int) (C0635Ly.A01 * 96.0f);
        A0J = (int) (C0635Ly.A01 * 48.0f);
        A0O = (int) (C0635Ly.A01 * 16.0f);
        A0Q = (int) (C0635Ly.A01 * 14.0f);
    }

    public C0988Zs(XI xi, int i, boolean z, C1I c1i, String str, JW jw, MQ mq, Q1 q1, C0628Lr c0628Lr) {
        this(xi, i, z, c1i, str, jw, mq, q1, c0628Lr, false);
    }

    public C0988Zs(XI xi, int i, boolean z, C1I c1i, String str, JW jw, MQ mq, Q1 q1, C0628Lr c0628Lr, boolean z2) {
        super(xi, i, c1i, str, jw, mq, q1, c0628Lr);
        this.A0A = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0F = xi;
        this.A09 = z2;
        super.A04.setFullCircleCorners(z);
        int i2 = A0M;
        setPadding(i2, i2, i2, A0I);
        this.A0G = JQ.A1K(this.A0F);
        this.A0C = new RelativeLayout(getContext());
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A08 = new O1(this.A0F, A0Q, 5, A0P, -1);
        this.A0D = new RelativeLayout(getContext());
        this.A0B = new LinearLayout(getContext());
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A01.addView(this.A0C);
        super.A01.addView(this.A0B);
        this.A0E = new TextView(getContext());
        C0635Ly.A0V(this, xi);
        if (JQ.A1H(xi)) {
            this.A03.setVisibility(8);
        }
        A05();
    }

    private void A01() {
        C0988Zs c0988Zs = this;
        char c2 = JQ.A1F(c0988Zs.A0F) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0988Zs = c0988Zs;
                    ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = ((AbstractC0679Nr) c0988Zs).A03;
                    int i = A0N;
                    viewOnClickListenerC0998a5.setPadding(i, 0, i, 0);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0L, -2);
                    layoutParams.addRule(11);
                    int i2 = A0M;
                    layoutParams.setMargins(i2, 0, i2, 0);
                    ((AbstractC0679Nr) c0988Zs).A03.setLayoutParams(layoutParams);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0988Zs = c0988Zs;
                    ((AbstractC0679Nr) c0988Zs).A03.setPadding(0, 0, 0, 0);
                    ((AbstractC0679Nr) c0988Zs).A03.setLayoutParams(new LinearLayout.LayoutParams(-1, A0J));
                    c2 = 3;
                    break;
            }
        }
    }

    private void A02() {
        this.A0B.setOrientation(1);
        this.A0B.setPadding(0, 0, 0, A0M);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A0C.getId());
        this.A0B.setLayoutParams(layoutParams);
        this.A0B.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(-1);
        C0635Ly.A0b(this.A03, false, this.A0G ? 13 : 16);
        this.A0B.addView(this.A03, new LinearLayout.LayoutParams(-1, -2));
    }

    private void A03() {
        C0988Zs c0988Zs = this;
        TextView textView = null;
        int i = 0;
        boolean z = false;
        RelativeLayout.LayoutParams layoutParams = null;
        TextView textView2 = null;
        int i2 = 0;
        c0988Zs.A0C.removeAllViews();
        boolean z2 = false;
        char c2 = JQ.A1F(c0988Zs.A0F) ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c0988Zs = c0988Zs;
                    z2 = false;
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(0, ((AbstractC0679Nr) c0988Zs).A03.getId());
                    c2 = 3;
                    break;
                case 3:
                    c0988Zs = c0988Zs;
                    layoutParams = layoutParams;
                    layoutParams.bottomMargin = A0M;
                    c0988Zs.A0C.setLayoutParams(layoutParams);
                    C0635Ly.A0N(c0988Zs.A0C);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(((AbstractC0679Nr) c0988Zs).A00, ((AbstractC0679Nr) c0988Zs).A00);
                    i2 = 15;
                    layoutParams2.addRule(15);
                    layoutParams2.addRule(9);
                    c0988Zs.A0C.addView(((AbstractC0679Nr) c0988Zs).A04, layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.leftMargin = A0N;
                    z = true;
                    layoutParams3.addRule(1, ((AbstractC0679Nr) c0988Zs).A04.getId());
                    layoutParams3.addRule(15);
                    c0988Zs.A0C.addView(c0988Zs.A0D, layoutParams3);
                    c0988Zs.A0D.removeAllViews();
                    C0635Ly.A0N(c0988Zs.A05);
                    c0988Zs.A05.setLayoutParams(AbstractC0679Nr.A06);
                    c0988Zs.A05.setTextColor(-1);
                    textView = c0988Zs.A05;
                    if (!c0988Zs.A0G) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0988Zs = c0988Zs;
                    textView = textView;
                    C0635Ly.A0b(textView, z, i2);
                    c0988Zs.A0D.addView(c0988Zs.A05);
                    c0988Zs.A02.setOrientation(z2 ? 1 : 0);
                    c0988Zs.A02.setGravity(16);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0O);
                    layoutParams4.topMargin = A0N / 2;
                    layoutParams4.addRule(3, c0988Zs.A05.getId());
                    c0988Zs.A0D.addView(c0988Zs.A02, layoutParams4);
                    c0988Zs.A02.removeAllViews();
                    c0988Zs.A08.setGravity(16);
                    c0988Zs.A02.addView(c0988Zs.A08, new LinearLayout.LayoutParams(-2, -1));
                    c0988Zs.A04.setTextColor(-1);
                    c0988Zs.A04.setGravity(16);
                    c0988Zs.A04.setIncludeFontPadding(z2);
                    textView2 = c0988Zs.A04;
                    if (!c0988Zs.A0G) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 13;
                    c2 = 6;
                    break;
                case 6:
                    C0988Zs c0988Zs2 = c0988Zs;
                    C0635Ly.A0b(textView2, z2, i);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams5.leftMargin = A0N;
                    c0988Zs2.A02.addView(c0988Zs2.A04, layoutParams5);
                    return;
                case 7:
                    i = 14;
                    c2 = 6;
                    break;
                case '\b':
                    i2 = 18;
                    c2 = 4;
                    break;
                case '\t':
                    layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A04() {
        this.A0E.setMaxLines(1);
        this.A0E.setEllipsize(TextUtils.TruncateAt.END);
        this.A0E.setGravity(17);
        this.A0E.setTextColor(-1);
        this.A0E.setAllCaps(true);
        C0635Ly.A0b(this.A0E, false, 12);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = A0M;
        this.A0E.setLayoutParams(layoutParams);
    }

    private void A05() {
        C0988Zs c0988Zs = this;
        c0988Zs.removeAllViews();
        char c2 = JQ.A1F(c0988Zs.A0F) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0988Zs = c0988Zs;
                    ((AbstractC0679Nr) c0988Zs).A01.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    c2 = 3;
                    break;
                case 3:
                    c0988Zs = c0988Zs;
                    c0988Zs.A03();
                    c0988Zs.A02();
                    c0988Zs.A01();
                    c0988Zs.A04();
                    c0988Zs.A06();
                    C0635Ly.A0M(((AbstractC0679Nr) c0988Zs).A01);
                    C0635Ly.A0M(((AbstractC0679Nr) c0988Zs).A03);
                    C0635Ly.A0M(c0988Zs.A0E);
                    if (!JQ.A1F(c0988Zs.A0F)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0988Zs = c0988Zs;
                    ((AbstractC0679Nr) c0988Zs).A01.addView(((AbstractC0679Nr) c0988Zs).A03);
                    c0988Zs.addView(((AbstractC0679Nr) c0988Zs).A01);
                    c2 = 5;
                    break;
                case 5:
                    C0988Zs c0988Zs2 = c0988Zs;
                    c0988Zs2.addView(c0988Zs2.A0E);
                    return;
                case 6:
                    c0988Zs = c0988Zs;
                    c0988Zs.addView(((AbstractC0679Nr) c0988Zs).A01);
                    c0988Zs.addView(((AbstractC0679Nr) c0988Zs).A03);
                    c2 = 5;
                    break;
                case 7:
                    c0988Zs = c0988Zs;
                    ((AbstractC0679Nr) c0988Zs).A01.setLayoutParams(AbstractC0679Nr.A06);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A06() {
        C0988Zs c0988Zs = this;
        C1H c1h = c0988Zs.A06;
        char c2 = c1h == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0988Zs = c0988Zs;
                    c1h = c1h;
                    c0988Zs.A05.setText(c1h.A06());
                    c0988Zs.A03.setText(c0988Zs.A06.A01());
                    c0988Zs.A0E.setText(c0988Zs.A06.A04());
                    if (!TextUtils.isEmpty(c0988Zs.A07.A03())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0988Zs = c0988Zs;
                    C0635Ly.A0K(((AbstractC0679Nr) c0988Zs).A03);
                    c2 = 5;
                    break;
                case 5:
                    c0988Zs = c0988Zs;
                    if (!TextUtils.isEmpty(c0988Zs.A06.A04())) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0988Zs = c0988Zs;
                    C0635Ly.A0K(c0988Zs.A0E);
                    c2 = 7;
                    break;
                case 7:
                    c0988Zs = c0988Zs;
                    if (!TextUtils.isEmpty(c0988Zs.A06.A03())) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0988Zs = c0988Zs;
                    c0988Zs.A02.setVisibility(8);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    c0988Zs = c0988Zs;
                    c0988Zs.A02.setVisibility(0);
                    c0988Zs.A08.setRating(Float.parseFloat(c0988Zs.A06.A03()));
                    if (c0988Zs.A06.A02() == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0988Zs = c0988Zs;
                    c0988Zs.A04.setText(A00(1, 1, 94) + NumberFormat.getNumberInstance().format(Integer.parseInt(c0988Zs.A06.A02())) + A00(0, 1, 17));
                    c2 = '\t';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final int A08(int i) {
        return this.A00 + this.A01 + A0N;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final void A0C(int i) {
        C0988Zs c0988Zs = this;
        int i2 = 0;
        boolean shouldPositionCTAToRight = false;
        LinearLayout.LayoutParams auxContainerParams = null;
        int i3 = 0;
        boolean zA1F = false;
        int i4 = 0;
        int i5 = 1;
        char c2 = i == 1 ? (char) 2 : (char) 23;
        while (true) {
            switch (c2) {
                case 2:
                    shouldPositionCTAToRight = true;
                    c2 = 3;
                    break;
                case 3:
                    c0988Zs = c0988Zs;
                    zA1F = JQ.A1F(c0988Zs.A0F);
                    i2 = 3;
                    i3 = -1;
                    i4 = -2;
                    if (!c0988Zs.A09) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0988Zs = c0988Zs;
                    if (!c0988Zs.A0A) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0988Zs = c0988Zs;
                    c0988Zs.setOrientation(i5);
                    if (!zA1F) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    auxContainerParams = new LinearLayout.LayoutParams(i3, i4);
                    c2 = 7;
                    break;
                case 7:
                    c0988Zs = c0988Zs;
                    auxContainerParams = auxContainerParams;
                    c0988Zs.setBackgroundResource(0);
                    ((AbstractC0679Nr) c0988Zs).A01.setLayoutParams(auxContainerParams);
                    if (!zA1F) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c0988Zs = c0988Zs;
                    ((AbstractC0679Nr) c0988Zs).A03.setLayoutParams(new LinearLayout.LayoutParams(i3, A0J));
                    c2 = '\t';
                    break;
                case '\t':
                    if (!shouldPositionCTAToRight) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\n':
                    c0988Zs = c0988Zs;
                    auxContainerParams = auxContainerParams;
                    auxContainerParams.weight = 0.7f;
                    C0635Ly.A0P(c0988Zs, -1087164882);
                    c0988Zs.A04();
                    c0988Zs.A0E.setGravity(i2);
                    c2 = 11;
                    break;
                case 11:
                    c0988Zs = c0988Zs;
                    C0635Ly.A0M(c0988Zs.A0E);
                    c0988Zs.addView(c0988Zs.A0E);
                    c2 = '\f';
                    break;
                case '\f':
                    c0988Zs.bringToFront();
                    return;
                case '\r':
                    c0988Zs = c0988Zs;
                    c0988Zs.A0E.setGravity(i5);
                    c2 = 11;
                    break;
                case 14:
                    auxContainerParams = new LinearLayout.LayoutParams(i4, i4);
                    c2 = 7;
                    break;
                case 15:
                    if (!shouldPositionCTAToRight) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0988Zs = c0988Zs;
                    c0988Zs.setOrientation(i5);
                    if (!shouldPositionCTAToRight) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 17:
                    if (!zA1F) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0988Zs = c0988Zs;
                    if (((AbstractC0679Nr) c0988Zs).A01.findViewById(((AbstractC0679Nr) c0988Zs).A03.getId()) == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0988Zs = c0988Zs;
                    ((AbstractC0679Nr) c0988Zs).A01.removeView(((AbstractC0679Nr) c0988Zs).A03);
                    c0988Zs.addView(((AbstractC0679Nr) c0988Zs).A03);
                    c2 = 20;
                    break;
                case 20:
                    c0988Zs = c0988Zs;
                    c0988Zs.setWeightSum(5.0f);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, i4);
                    layoutParams.weight = 4.0f;
                    layoutParams.bottomMargin = A0I - A0M;
                    ((AbstractC0679Nr) c0988Zs).A01.setLayoutParams(layoutParams);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, A0J);
                    layoutParams2.bottomMargin = A0I / 2;
                    layoutParams2.weight = 1.0f;
                    layoutParams2.gravity = 80;
                    ((AbstractC0679Nr) c0988Zs).A03.setLayoutParams(layoutParams2);
                    ((AbstractC0679Nr) c0988Zs).A03.setMinWidth(A0K);
                    C0635Ly.A0M(c0988Zs.A0E);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i3, i3);
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = A0N;
                    c0988Zs.A0B.addView(c0988Zs.A0E, layoutParams3);
                    c0988Zs.A0B.setPadding(0, 0, 0, 0);
                    c0988Zs.A0E.setGravity(i2);
                    c2 = '\f';
                    break;
                case 21:
                    i5 = 0;
                    c2 = 16;
                    break;
                case 22:
                    c0988Zs = c0988Zs;
                    c0988Zs.A05();
                    c2 = '\f';
                    break;
                case 23:
                    shouldPositionCTAToRight = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final void A0D(boolean z) {
        this.A0A = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final View getExpandableLayout() {
        return this.A0B;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0E.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public void setInfo(C1H c1h, C1J c1j, String str, String str2, @Nullable InterfaceC0682Nu interfaceC0682Nu) {
        super.setInfo(c1h, c1j, str, str2, interfaceC0682Nu);
        this.A06 = c1h;
        this.A07 = c1j;
        A06();
    }
}
