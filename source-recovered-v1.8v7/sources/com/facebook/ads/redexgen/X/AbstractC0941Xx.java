package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0941Xx extends FrameLayout implements MR {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass17 A01;
    public final C7C A02;
    public final XI A03;
    public final JW A04;
    public final C0565Jd A05;
    public final C0628Lr A06;
    public final ML A07;
    public final MQ A08;
    public final InterfaceC0657Mv A09;
    public final Q1 A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC0623Lm A0B;

    @DoNotStrip
    public final Q0 A0C;

    public abstract void A0Q();

    public abstract void A0S(C02304x c02304x);

    public abstract boolean A0T();

    public AbstractC0941Xx(XI xi, InterfaceC0657Mv interfaceC0657Mv, JW jw, AnonymousClass17 anonymousClass17, C7C c7c, MQ mq) {
        super(xi);
        this.A0C = new Y1(this);
        this.A06 = new C0628Lr();
        this.A00 = false;
        this.A03 = xi;
        this.A09 = interfaceC0657Mv;
        this.A04 = jw;
        this.A01 = anonymousClass17;
        this.A02 = c7c;
        this.A08 = mq;
        this.A05 = new C0565Jd(this.A01.A0P(), this.A04);
        this.A0A = new Q1(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0X(this.A01.A0F());
        this.A0A.A0Y(this.A01.A0G());
        this.A07 = A0N();
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC0623Lm(this);
        this.A0B.A05(EnumC0622Ll.A02);
    }

    private ML A0N() {
        ML fullScreenAdToolbar;
        if (JQ.A1O(this.A03)) {
            fullScreenAdToolbar = new C1171cw(this.A03, this.A08, this.A05, 4, 2);
        } else {
            fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0D());
        }
        int iA03 = this.A01.A0L().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0N(), this.A01.A0P(), iA03, this.A01.A0O());
        fullScreenAdToolbar.A04(this.A01.A0K().A01(), true);
        if (iA03 < 0 && this.A01.A0L().A0K()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new C0942Xy(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        AbstractC0941Xx abstractC0941Xx = this;
        char c2 = abstractC0941Xx.A01.A0L().A0O() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC0941Xx = abstractC0941Xx;
                    C0689Ob c0689ObA0B = new OZ(abstractC0941Xx.A03, abstractC0941Xx.A01.A0L().A0E(), abstractC0941Xx.A01.A0N()).A08(abstractC0941Xx.A01.A0K().A01()).A0B();
                    C0567Jf.A04(c0689ObA0B, abstractC0941Xx.A05, EnumC0564Jc.A0T);
                    abstractC0941Xx.addView(c0689ObA0B, A0D);
                    c0689ObA0B.A04(new C0943Xz(abstractC0941Xx));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    abstractC0941Xx = abstractC0941Xx;
                    abstractC0941Xx.A0Q();
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0V();
            this.A00 = true;
        }
    }

    public final void A0R(int i, AbstractRunnableC0608Kw abstractRunnableC0608Kw) {
        new LO(i, new Y0(this, i, abstractRunnableC0608Kw)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, @Nullable Bundle bundle, C02304x c02304x) {
        this.A08.A3K(this, A0D);
        A0S(c02304x);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0P())) {
            this.A04.A81(this.A01.A0P(), new C0676No().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MQ mq) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC0622Ll enumC0622Ll = null;
        char c2 = Build.VERSION.SDK_INT < 19 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    enumC0622Ll = EnumC0622Ll.A03;
                    c2 = 5;
                    break;
                case 5:
                    this.A0B.A05(enumC0622Ll);
                    return;
                case 6:
                    enumC0622Ll = EnumC0622Ll.A02;
                    c2 = 5;
                    break;
            }
        }
    }
}
