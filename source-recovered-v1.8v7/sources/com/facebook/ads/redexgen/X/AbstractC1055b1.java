package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* renamed from: com.facebook.ads.redexgen.X.b1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1055b1 extends RelativeLayout implements MR {
    public View A00;

    @Nullable
    public LO A01;

    @Nullable
    public C0689Ob A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public AnonymousClass18 A06;
    public final ViewOnSystemUiVisibilityChangeListenerC0623Lm A07;
    public final MQ A08;
    public final C0786Rv A09;
    public final XI A0A;
    public final JW A0B;
    public final C0565Jd A0C;
    public final ML A0D;

    public abstract void A0X();

    public abstract boolean A0h();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    public AbstractC1055b1(XI xi, JW jw, MQ mq, C0786Rv c0786Rv) {
        super(xi);
        boolean z = false;
        this.A04 = false;
        this.A03 = false;
        this.A0A = xi;
        this.A0B = jw;
        this.A08 = mq;
        this.A07 = new ViewOnSystemUiVisibilityChangeListenerC0623Lm(this);
        this.A09 = c0786Rv;
        this.A0C = new C0565Jd(this.A09.A0P(), this.A0B);
        if ((this instanceof C03469v) || ((this instanceof C0359Ai) && JQ.A1R(xi))) {
            z = true;
        }
        this.A05 = z;
        if (JQ.A1O(this.A0A)) {
            this.A0D = new C1171cw(this.A0A, getAudienceNetworkListener(), this.A0C, 4, 2);
        } else {
            this.A0D = new FullScreenAdToolbar(this.A0A, getAudienceNetworkListener(), this.A0C, 0, this.A09.A0D());
        }
    }

    private C1I A0Q(int i) {
        if (i == 1) {
            return this.A06.A01();
        }
        return this.A06.A00();
    }

    private void A0R() {
        removeAllViews();
        C0635Ly.A0M(this);
    }

    private void A0S() {
        AbstractC1055b1 abstractC1055b1 = this;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        char c2 = abstractC1055b1.A0d() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC1055b1 = abstractC1055b1;
                    if (abstractC1055b1.A02 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    abstractC1055b1 = abstractC1055b1;
                    layoutParams = layoutParams;
                    abstractC1055b1.A04 = true;
                    abstractC1055b1.A02 = new OZ(abstractC1055b1.A0A, abstractC1055b1.A09.A0L().A0E(), abstractC1055b1.A09.A0N()).A08(abstractC1055b1.A09.A0K().A01()).A0B();
                    C0567Jf.A04(abstractC1055b1.A02, abstractC1055b1.A0C, EnumC0564Jc.A0T);
                    abstractC1055b1.A08.A3J(abstractC1055b1, 0, layoutParams);
                    abstractC1055b1.A08.A3J(abstractC1055b1.A02, 1, layoutParams);
                    abstractC1055b1.A02.A04(new C1072bI(abstractC1055b1));
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    abstractC1055b1 = abstractC1055b1;
                    layoutParams = layoutParams;
                    abstractC1055b1.A08.A3J(abstractC1055b1, 0, layoutParams);
                    abstractC1055b1.A0X();
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0T(C1I c1i, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0D.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0D.A04(c1i, z);
        addView(this.A0D, layoutParams);
    }

    public final void A0W() {
        AbstractC1055b1 abstractC1055b1 = this;
        View view = abstractC1055b1.A00;
        char c2 = view != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    if (!(view instanceof O8)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    abstractC1055b1 = abstractC1055b1;
                    if (!abstractC1055b1.A0f()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    abstractC1055b1 = abstractC1055b1;
                    ((O8) abstractC1055b1.A00).A0Z();
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    abstractC1055b1 = abstractC1055b1;
                    ((O8) abstractC1055b1.A00).A0Y();
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A0Y(int i) {
        this.A01 = new LO(i, new C1058b4(this, i));
        this.A03 = true;
        A0W();
        this.A01.A07();
    }

    public final void A0Z(View view, boolean z, int i) {
        A0a(view, z, i, false);
    }

    public final void A0a(View view, boolean z, int i, boolean z2) {
        AbstractC1055b1 abstractC1055b1 = this;
        C1I c1iA0Q = null;
        int toolbarHeight = 0;
        abstractC1055b1.A00 = view;
        abstractC1055b1.A07.A05(EnumC0622Ll.A02);
        abstractC1055b1.A0R();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        boolean z3 = false;
        char c2 = z ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    toolbarHeight = 0;
                    c2 = 3;
                    break;
                case 3:
                    abstractC1055b1 = abstractC1055b1;
                    view = view;
                    layoutParams = layoutParams;
                    z3 = false;
                    layoutParams.setMargins(0, toolbarHeight, 0, 0);
                    abstractC1055b1.addView(view, layoutParams);
                    c1iA0Q = abstractC1055b1.A0Q(i);
                    abstractC1055b1.A0T(c1iA0Q, z);
                    if (!z2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    abstractC1055b1 = abstractC1055b1;
                    if (!abstractC1055b1.A05) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z3 = true;
                    c2 = 7;
                    break;
                case 7:
                    abstractC1055b1 = abstractC1055b1;
                    c1iA0Q = c1iA0Q;
                    C0635Ly.A0P(abstractC1055b1, c1iA0Q.A07(z3));
                    if (abstractC1055b1.A08 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    abstractC1055b1 = abstractC1055b1;
                    abstractC1055b1.A0S();
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (Build.VERSION.SDK_INT < 19) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    abstractC1055b1 = abstractC1055b1;
                    abstractC1055b1.A07.A05(EnumC0622Ll.A03);
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    abstractC1055b1 = abstractC1055b1;
                    toolbarHeight = abstractC1055b1.A0D.getToolbarHeight();
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0b(C02304x c02304x) {
        AbstractC1055b1 abstractC1055b1 = this;
        int iA03 = 0;
        C1R c1rA0N = null;
        ML ml = null;
        String strA0P = null;
        abstractC1055b1.A07.A04(c02304x.A0H().getWindow());
        abstractC1055b1.A06 = abstractC1055b1.A09.A0K();
        C1A c1aA0L = null;
        char c2 = abstractC1055b1.A09.A0L() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC1055b1 = abstractC1055b1;
                    if (abstractC1055b1.A09.A0L() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    abstractC1055b1 = abstractC1055b1;
                    c1aA0L = abstractC1055b1.A09.A0L();
                    c2 = 4;
                    break;
                case 4:
                    abstractC1055b1 = abstractC1055b1;
                    ml = abstractC1055b1.A0D;
                    c1rA0N = abstractC1055b1.A09.A0N();
                    strA0P = abstractC1055b1.A09.A0P();
                    if (c1aA0L == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    iA03 = c1aA0L.A0D().A03();
                    c2 = 6;
                    break;
                case 6:
                    AbstractC1055b1 abstractC1055b12 = abstractC1055b1;
                    ml.setPageDetails(c1rA0N, strA0P, iA03, abstractC1055b12.A09.A0O());
                    abstractC1055b12.A0D.setToolbarListener(new C1076bM(abstractC1055b12, c02304x));
                    return;
                case 7:
                    iA03 = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A0c(C02304x c02304x) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new MX(this, this, c02304x));
        startAnimation(alphaAnimation);
    }

    public final boolean A0d() {
        AbstractC1055b1 abstractC1055b1 = this;
        boolean z = false;
        char c2 = !abstractC1055b1.A09.A0V().isEmpty() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC1055b1 = abstractC1055b1;
                    if (!abstractC1055b1.A09.A0L().A0O()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0e() {
        AbstractC1055b1 abstractC1055b1 = this;
        boolean z = false;
        char c2 = !abstractC1055b1.A09.A0V().isEmpty() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC1055b1 = abstractC1055b1;
                    if (!abstractC1055b1.A09.A0L().A0N()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0f() {
        return this.A03;
    }

    public final boolean A0g() {
        return this.A04;
    }

    public void AAT(boolean z) {
        AbstractC1055b1 abstractC1055b1 = this;
        LO lo = abstractC1055b1.A01;
        char c2 = lo != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    lo = lo;
                    if (!lo.A05()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    abstractC1055b1 = abstractC1055b1;
                    abstractC1055b1.A01.A06();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public void AAq(boolean z) {
        AbstractC1055b1 abstractC1055b1 = this;
        LO lo = abstractC1055b1.A01;
        char c2 = lo != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    lo = lo;
                    if (!lo.A04()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    abstractC1055b1 = abstractC1055b1;
                    abstractC1055b1.A01.A07();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public JW getAdEventManager() {
        return this.A0B;
    }

    public MQ getAudienceNetworkListener() {
        return this.A08;
    }

    public void onDestroy() {
        this.A07.A03();
        this.A0D.setToolbarListener(null);
        A0R();
    }

    public void setForcedTimeViewIncomplete(boolean z) {
        this.A03 = z;
    }

    public void setListener(MQ mq) {
    }
}
