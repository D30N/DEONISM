package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1029ab extends RelativeLayout implements MR, InterfaceC0647Mk {
    public static byte[] A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final RelativeLayout.LayoutParams A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public int A00;
    public int A01;

    @Nullable
    public View A02;
    public View A03;

    @Nullable
    public ML A04;

    @Nullable
    public MQ A05;

    @Nullable
    public AbstractC0679Nr A06;
    public C0710Ox A07;
    public C0711Oy A08;

    @Nullable
    public C0755Qq A09;

    @Nullable
    public PC A0A;
    public KC A0B;

    @Nullable
    public C0550Io A0C;

    @Nullable
    public AnonymousClass76 A0D;

    @Nullable
    public I6 A0E;
    public C0530Hu A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final Handler A0L;
    public final Handler A0M;
    public final RelativeLayout A0N;
    public final C1I A0O;
    public final C0787Rw A0P;
    public final InterfaceC02284v A0Q;
    public final XI A0R;
    public final JW A0S;
    public final C0565Jd A0T;
    public final ViewOnSystemUiVisibilityChangeListenerC0623Lm A0U;
    public final C0628Lr A0V;
    public final C02997y A0W;
    public final AbstractC0644Mh A0X;
    public final AbstractC0633Lw A0Y;
    public final AbstractC0604Ks A0Z;
    public final AbstractC0602Kp A0a;
    public final AbstractC0598Kl A0b;
    public final C0549In A0c;
    public final IS A0d;

    @DoNotStrip
    public final Q0 A0e;
    public final Q1 A0f;
    public final AtomicBoolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    public static String A0F(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0j, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 67);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0S() {
        A0j = new byte[]{32, 19, 14, 15, 25};
    }

    static {
        A0S();
        A0m = (int) (C0635Ly.A01 * 10.0f);
        A0n = (int) (C0635Ly.A01 * 18.0f);
        A0p = (int) (C0635Ly.A01 * 16.0f);
        A0l = (int) (C0635Ly.A01 * 48.0f);
        A0o = (int) (C0635Ly.A01 * 28.0f);
        A0k = (int) (C0635Ly.A01 * 250.0f);
        A0v = (int) (C0635Ly.A01 * 12.0f);
        A0u = (int) (C0635Ly.A01 * 26.0f);
        A0r = (int) (C0635Ly.A01 * 4.0f);
        A0s = C2H.A01(-1, 77);
        A0t = C2H.A01(A0s, 90);
        A0q = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1029ab(XI xi, JW jw, C0755Qq c0755Qq, MQ mq, C0787Rw c0787Rw) {
        super(xi);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A0Q = new C1037aj(this);
        this.A0X = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.9o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                this.A00.A0c(c02987x);
            }
        };
        this.A0Y = new AbstractC0633Lw() { // from class: com.facebook.ads.redexgen.X.9n
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A01 = new byte[]{98, 93, 80, 81, 91, 100, 88, 85, 77, 118, 85, 87, 95, 113, 70, 70, 91, 70};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C0643Mg c0643Mg) {
                this.A00.A0d(A00(0, 18, k.AppCompatTheme_viewInflaterClass));
            }
        };
        this.A0a = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.9m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                C03379m c03379m = this;
                char c2 = c03379m.A00.A09 != null ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            c03379m = c03379m;
                            c03379m.A00.A0G = true;
                            if (!c03379m.A00.A0P.A0L().A0O()) {
                                c2 = 3;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 3:
                            c03379m = c03379m;
                            c03379m.A00.A0P();
                            c2 = 4;
                            break;
                        case 4:
                            c03379m = c03379m;
                            c03379m.A00.A0g.set(c03379m.A00.A09.A0d());
                            c03379m.A00.A0R();
                            c2 = 5;
                            break;
                        case 5:
                            return;
                    }
                }
            }
        };
        this.A0Z = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.9l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                if (this.A00.A0J) {
                    return;
                }
                this.A00.A0f.A0V();
                this.A00.A0J = true;
            }
        };
        this.A0b = new C03359k(this);
        this.A0V = new C0628Lr();
        this.A0g = new AtomicBoolean(false);
        this.A0M = new Handler();
        this.A0I = false;
        this.A0H = false;
        this.A0G = false;
        this.A0J = false;
        this.A01 = -1;
        this.A0R = xi;
        this.A0h = false;
        this.A0i = JQ.A1d(this.A0R);
        this.A05 = mq;
        this.A0S = jw;
        this.A0P = c0787Rw;
        this.A0T = new C0565Jd(this.A0P.A0P(), this.A0S);
        this.A09 = c0755Qq;
        this.A09.setFunnelLoggingHandler(this.A0T);
        this.A0O = this.A0P.A0K().A01();
        this.A0N = new RelativeLayout(xi);
        this.A0d = new IS(this.A0R);
        if (JQ.A1e(this.A0R)) {
            this.A0d.A0A(this.A0O.A08(false), 0);
        }
        this.A0c = new C0549In(this.A0R, this.A0T);
        C1D c1dA0D = this.A0P.A0L().A0D();
        this.A0K = Math.min(c1dA0D.A02(), c1dA0D.A04());
        this.A09.setVolume(c1dA0D.A09() ? 0.0f : 1.0f);
        this.A03 = new View(this.A0R);
        C0635Ly.A0N(this.A03);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        this.A03.setLayoutParams(layoutParams);
        this.A0e = new C1035ah(this);
        this.A0f = new Q1(this, 1, new WeakReference(this.A0e), xi);
        this.A0f.A0X(250);
        this.A0W = new C02997y(this.A0R, this.A0S, this.A09, this.A0P.A0P());
        this.A07 = new C0710Ox(this.A0R, this.A0S, this.A0P);
        this.A08 = new C0711Oy(this.A0R, new C1024aW(), this.A0P.A0U(), this.A05);
        new AsyncTaskC1002aA(this, xi).A07(c1dA0D.A07());
        this.A09.setVideoProgressReportIntervalMs(c0787Rw.A0E());
        this.A09.getEventBus().A03(this.A0X, this.A0Y, this.A0a, this.A0Z, this.A0b);
        xi.A0A().A2p();
        this.A0U = new ViewOnSystemUiVisibilityChangeListenerC0623Lm(this);
        this.A0U.A05(EnumC0622Ll.A02);
    }

    private void A0H() {
        XI xi = this.A0R;
        if (xi == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(xi);
        frameLayout.setLayoutParams(A0q);
        C0635Ly.A0P(frameLayout, 1711276032);
        this.A0N.addView(frameLayout, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        MQ mq = this.A05;
        if (mq == null) {
            return;
        }
        mq.A3r(PE.A08.A02());
    }

    private void A0J() {
        AbstractC0679Nr abstractC0679Nr = this.A06;
        if (abstractC0679Nr != null) {
            abstractC0679Nr.removeAllViews();
            this.A0N.removeView(this.A0d);
            AbstractC0679Nr abstractC0679Nr2 = this.A06;
            abstractC0679Nr2.setLayoutParams(abstractC0679Nr2.A0B(this.A03));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1170cv.A0F);
            layoutParams.addRule(12);
            this.A0N.addView(this.A0d, layoutParams);
        }
    }

    private void A0K() {
        AbstractC0679Nr abstractC0679Nr = this.A06;
        if (abstractC0679Nr != null) {
            abstractC0679Nr.removeAllViews();
            this.A0N.removeView(this.A0d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1170cv.A0G);
            layoutParams.setMargins(0, 0, 0, C1170cv.A0H);
            this.A06.addView(this.A0d, layoutParams);
            AbstractC0679Nr abstractC0679Nr2 = this.A06;
            abstractC0679Nr2.setLayoutParams(abstractC0679Nr2.A0B(this.A03));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        C1029ab c1029ab = this;
        RelativeLayout.LayoutParams layoutParams = null;
        RelativeLayout.LayoutParams screenshotParams = null;
        int i = 0;
        Pair<EnumC0709Ow, View> pairA02 = null;
        int i2 = 0;
        int i3 = 0;
        AbstractC0679Nr abstractC0679Nr = null;
        ML ml = null;
        AbstractC0679Nr abstractC0679Nr2 = null;
        int i4 = 0;
        c1029ab.A0I = true;
        C0635Ly.A0X(c1029ab.A0N);
        C0755Qq c0755Qq = c1029ab.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    c0755Qq = c0755Qq;
                    c0755Qq.A0T();
                    c1029ab.A09.setVisibility(4);
                    c2 = 3;
                    break;
                case 3:
                    c1029ab = c1029ab;
                    ml = c1029ab.A04;
                    if (ml != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c1029ab = c1029ab;
                    ml = ml;
                    i2 = 0;
                    ml.setPageDetailsVisible(false);
                    c1029ab.A04.setToolbarActionMode(0);
                    c1029ab.A04.setToolbarActionMessage(A0F(0, 0, 43));
                    i4 = 2;
                    C0635Ly.A0d(c1029ab.A09, c1029ab.A0c, c1029ab.A0d);
                    pairA02 = c1029ab.A07.A02(c1029ab.getCTAButton());
                    c1029ab.A02 = (View) pairA02.second;
                    i3 = C0642Mf.A00[((EnumC0709Ow) pairA02.first).ordinal()];
                    i = -1;
                    if (i3 == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == i4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    c1029ab = c1029ab;
                    pairA02 = pairA02;
                    View[] viewArr = new View[1];
                    viewArr[i2] = c1029ab.A06;
                    C0635Ly.A0d(viewArr);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
                    int i5 = A0p;
                    layoutParams2.setMargins(i5, i5, i5, i5);
                    c1029ab.A0N.addView((View) pairA02.second, layoutParams2);
                    c1029ab.A0V.A05();
                    c2 = 7;
                    break;
                case '\t':
                    c1029ab = c1029ab;
                    if (!JQ.A1J(c1029ab.A0R)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1029ab = c1029ab;
                    if (c1029ab.A06 == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c1029ab = c1029ab;
                    layoutParams = new RelativeLayout.LayoutParams(i, i);
                    AbstractC0679Nr abstractC0679Nr3 = c1029ab.A06;
                    abstractC0679Nr3.setLayoutParams(abstractC0679Nr3.A0A(c1029ab.A03));
                    if (c1029ab.getResources().getConfiguration().orientation != 1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1029ab = c1029ab;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i2, c1029ab.A04.getToolbarHeight(), i2, A0m);
                    layoutParams.addRule(i4, c1029ab.A06.getId());
                    c2 = '\r';
                    break;
                case '\r':
                    c1029ab = c1029ab;
                    pairA02 = pairA02;
                    layoutParams = layoutParams;
                    c1029ab.A0N.addView((View) pairA02.second, layoutParams);
                    c2 = 14;
                    break;
                case 14:
                    c1029ab = c1029ab;
                    abstractC0679Nr = c1029ab.A06;
                    if (abstractC0679Nr == null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1029ab = c1029ab;
                    abstractC0679Nr = abstractC0679Nr;
                    abstractC0679Nr.setVisibility(i2);
                    c1029ab.A06.A0D(true);
                    c2 = 16;
                    break;
                case 16:
                    c1029ab = c1029ab;
                    c1029ab.A0Q();
                    c1029ab.A0V.A05();
                    c2 = 7;
                    break;
                case 17:
                    c1029ab = c1029ab;
                    layoutParams = layoutParams;
                    int i6 = A0m;
                    layoutParams.setMargins(i2, i6, i2, i6);
                    layoutParams.addRule(i2, c1029ab.A03.getId());
                    c2 = '\r';
                    break;
                case 18:
                    c1029ab = c1029ab;
                    if (!c1029ab.A0i) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 19:
                    c1029ab = c1029ab;
                    pairA02 = pairA02;
                    screenshotParams = new RelativeLayout.LayoutParams(i, i);
                    screenshotParams.setMargins(i2, c1029ab.A04.getToolbarHeight(), i2, i2);
                    c1029ab.A0N.addView((View) pairA02.second, screenshotParams);
                    abstractC0679Nr2 = c1029ab.A06;
                    if (abstractC0679Nr2 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    screenshotParams = screenshotParams;
                    abstractC0679Nr2 = abstractC0679Nr2;
                    screenshotParams.addRule(i4, abstractC0679Nr2.getId());
                    c2 = 14;
                    break;
                case 21:
                    c1029ab = c1029ab;
                    pairA02 = pairA02;
                    c1029ab.A0N.addView((View) pairA02.second);
                    c2 = 14;
                    break;
            }
        }
    }

    private void A0M() {
        int iA03;
        C0755Qq c0755Qq = this.A09;
        if (c0755Qq == null || this.A0R == null) {
            return;
        }
        c0755Qq.A0T();
        this.A09.A0Z(new C7M(this.A0R));
        this.A09.A0Z(this.A0c);
        this.A09.A0Z(this.A0d);
        this.A0D = new AnonymousClass76(this.A0R, true, this.A0T);
        View view = new View(this.A0R);
        view.setLayoutParams(A0q);
        C0635Ly.A0P(view, 1711276032);
        C0550Io mOverlayFadeablePlugin = new C0550Io(view, PO.A02, true);
        this.A09.addView(view);
        this.A09.A0Z(mOverlayFadeablePlugin);
        C0550Io c0550Io = new C0550Io(this.A0D, PO.A02, true);
        this.A09.A0Z(this.A0D);
        this.A09.A0Z(c0550Io);
        this.A00 = C0635Ly.A03(this.A0R);
        boolean z = this.A07.A03() == EnumC0709Ow.A03 && this.A00 == 2 && this.A0i;
        if (JQ.A1J(this.A0R)) {
            this.A06 = new C1170cv(this.A0R, A0l, this.A0O, PE.A04.A02(), this.A0S, this.A05, this.A0f, this.A0V);
        } else if (!this.A0h) {
            this.A06 = new R1(this.A0R, A0l, this.A0O, this.A0S, this.A05, this.A07.A03() == EnumC0709Ow.A02 || z, this.A07.A03() == EnumC0709Ow.A02, this.A0f, this.A0V, this.A0i);
            this.A0C = new C0550Io(this.A06, PO.A02, true);
            C0755Qq c0755Qq2 = this.A09;
            C0550Io fadeableTouchPlayPausePlugin = this.A0C;
            c0755Qq2.A0Z(fadeableTouchPlayPausePlugin);
        } else {
            this.A06 = new C0988Zs(this.A0R, A0l, this.A0P.A0L().A0E().A00() == C1F.A04, this.A0O, PE.A04.A02(), this.A0S, this.A05, this.A0f, this.A0V, this.A0i);
            this.A0F = new C0530Hu(this.A06, 400, 100, 0);
            A0T();
            this.A0F.A3N(true, false);
        }
        this.A06.setInfo(this.A0P.A0L().A0E(), this.A0P.A0L().A0F(), this.A0P.A0P(), this.A0P.A0N().A01(), null);
        if (JQ.A1O(this.A0R)) {
            this.A04 = new C1171cw(this.A0R, this.A05, this.A0T, 4, 2);
        } else {
            this.A04 = new FullScreenAdToolbar(this.A0R, this.A05, this.A0T, 1, this.A0P.A0D());
        }
        if (this.A0P.A0L().A0D().A03() < 0) {
            iA03 = this.A0P.A0L().A0D().A04();
        } else {
            iA03 = this.A0P.A0L().A0D().A03();
        }
        this.A01 = iA03;
        this.A04.setPageDetails(this.A0P.A0N(), this.A0P.A0P(), this.A01, this.A0P.A0O());
        if (this.A0P.A0L().A0D().A03() < 0) {
            this.A04.setToolbarActionMode(4);
        }
        if (this.A07.A03() != EnumC0709Ow.A02 || this.A0h) {
            this.A04.setPageDetailsVisible(false);
        }
        this.A04.setToolbarListener(new C1038ak(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        String strA06;
        if (JQ.A1O(this.A0R)) {
            this.A04.A05(this);
            return;
        }
        RewardData rewardDataA0J = this.A0P.A0J();
        if (rewardDataA0J == null) {
            strA06 = this.A0P.A0M().A05();
        } else {
            strA06 = this.A0P.A0M().A06(rewardDataA0J.getCurrency(), rewardDataA0J.getQuantity());
        }
        MZ mz = new MZ(this.A0R, -1, -16777216, strA06, null, this.A0P.A0M().A04(), this.A0P.A0M().A03(), M7.A00(M6.REWARD_ICON));
        mz.A02.setOnClickListener(new ViewOnClickListenerC0640Md(this, mz));
        mz.A01.setOnClickListener(new ViewOnClickListenerC0641Me(this, mz));
        C0635Ly.A0K(this.A0N);
        C0635Ly.A0K(this.A04);
        C0635Ly.A0P(mz, 1711276032);
        mz.setClickable(true);
        C0755Qq c0755Qq = this.A09;
        if (c0755Qq != null && !c0755Qq.A0g()) {
            this.A09.A0c(false, false, 16);
        }
        addView(mz, new RelativeLayout.LayoutParams(-1, -1));
        mz.bringToFront();
    }

    private void A0O() {
        C1029ab c1029ab = this;
        char c2 = c1029ab.A0P.A0L().A0O() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    if (c1029ab.A05 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1029ab = c1029ab;
                    C0689Ob c0689ObA0B = new OZ(c1029ab.A0R, c1029ab.A0P.A0L().A0E(), c1029ab.A0P.A0N()).A08(c1029ab.A0P.A0K().A01()).A0B();
                    C0567Jf.A04(c0689ObA0B, c1029ab.A0T, EnumC0564Jc.A0T);
                    c1029ab.A05.A3J(c0689ObA0B, 1, A0q);
                    c0689ObA0B.bringToFront();
                    c0689ObA0B.A04(new C1033af(c1029ab));
                    c1029ab.A0R.A0A().A2a();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        C0755Qq c0755Qq = this.A09;
        if (c0755Qq == null) {
            return;
        }
        c0755Qq.A0Y(PC.A03, 22);
        postDelayed(new C1039al(this), JQ.A0H(getContext()));
    }

    private void A0Q() {
        C0710Ox c0710Ox;
        if (this.A0i && this.A02 != null && (c0710Ox = this.A07) != null && c0710Ox.A03() == EnumC0709Ow.A03) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            boolean z = this.A00 == 2;
            layoutParams.setMargins(0, !z ? getToolbarHeight() : A0m, 0, !z ? 0 : A0m);
            R0 r0 = (R0) ((C0452Eq) this.A02).getAdapter();
            r0.A06();
            int i = this.A00;
            boolean isLandscape = this.A0i;
            r0.A0F(i, isLandscape);
            AbstractC0679Nr abstractC0679Nr = this.A06;
            if (abstractC0679Nr != null) {
                if (z) {
                    abstractC0679Nr.A0C(this.A00);
                } else {
                    layoutParams.addRule(2, abstractC0679Nr.getId());
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(!z ? -1 : A0k, z ? -1 : -2);
                layoutParams2.addRule(12);
                AbstractC0679Nr abstractC0679Nr2 = this.A06;
                int i2 = A0p;
                int toolbarHeight = !z ? i2 : getToolbarHeight() + i2;
                int i3 = A0p;
                abstractC0679Nr2.setPadding(i2, toolbarHeight, i3, i3);
                this.A06.setLayoutParams(layoutParams2);
            }
            this.A02.setLayoutParams(layoutParams);
            this.A02.setOverScrollMode(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R() {
        int i = 0;
        C0549In c0549In = this.A0c;
        char c2 = this.A0g.get() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    c0549In.setVisibility(i);
                    this.A0c.A09();
                    return;
                case 4:
                    i = 8;
                    c2 = 3;
                    break;
            }
        }
    }

    private final void A0T() {
        C1029ab c1029ab = this;
        boolean z = false;
        I6 i6 = null;
        char c2 = c1029ab.A06 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1029ab = c1029ab;
                    z = true;
                    c1029ab.A0B = new KC(true);
                    i6 = c1029ab.A0E;
                    if (i6 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1029ab = c1029ab;
                    i6 = i6;
                    c1029ab.A0B.A0I(i6);
                    c2 = 5;
                    break;
                case 5:
                    C1029ab c1029ab2 = c1029ab;
                    C1I c1iA01 = c1029ab2.A0P.A0K().A01();
                    c1029ab2.A0B.A0I(new I0(c1029ab2.A06.getCTAButton(), 300, c1iA01.A08(z), -14934495));
                    c1029ab2.A0B.A0I(new IC(c1029ab2.A06.getCTAButton(), 300, C0635Ly.A09(A0s, A0t, A0r), C0635Ly.A06(c1iA01.A08(z), A0r)));
                    c1029ab2.A0B.A0I(new I4(c1029ab2.A06.getExpandableLayout(), 150, false));
                    c1029ab2.A0B.A0H(2300);
                    c1029ab2.A0B.A7t(c1029ab2.A09);
                    return;
            }
        }
    }

    private final void A0U() {
        C1029ab c1029ab = this;
        Q1 q1 = null;
        C0755Qq c0755Qq = c1029ab.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    c0755Qq = c0755Qq;
                    c0755Qq.A0V(2);
                    c1029ab.A09.A0R();
                    c2 = 3;
                    break;
                case 3:
                    c1029ab = c1029ab;
                    q1 = c1029ab.A0f;
                    if (q1 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    q1 = q1;
                    q1.A0W();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c(C02987x c02987x) {
        C1029ab c1029ab = this;
        MQ mq = null;
        char c2 = c1029ab.A0I ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1029ab = c1029ab;
                    c1029ab.A08.A05();
                    c1029ab.A0L();
                    mq = c1029ab.A05;
                    if (mq == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02987x = c02987x;
                    mq = mq;
                    mq.A3s(PE.A06.A02(), c02987x);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(String str) {
        C1029ab c1029ab = this;
        MQ mq = null;
        c1029ab.A0R.A0A().A2q(str);
        int currentPositionInMillis = 0;
        int duration = 0;
        C0755Qq c0755Qq = c1029ab.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    c0755Qq = c0755Qq;
                    currentPositionInMillis = c0755Qq.getCurrentPositionInMillis();
                    duration = c1029ab.A09.getDuration();
                    c2 = 3;
                    break;
                case 3:
                    c1029ab = c1029ab;
                    str = str;
                    c1029ab.A0U();
                    c1029ab.A0R.A04().A83(A0F(0, 5, 103), C03008a.A22, new C03018b(str));
                    if (!JQ.A0t(c1029ab.A0R)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1029ab = c1029ab;
                    c1029ab.A0c(new C02987x(currentPositionInMillis, duration));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1029ab = c1029ab;
                    mq = c1029ab.A05;
                    if (mq == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    mq = mq;
                    mq.A3r(PE.A09.A02());
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0e() {
        C1029ab c1029ab = this;
        boolean z = false;
        C0755Qq c0755Qq = c1029ab.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    c0755Qq = c0755Qq;
                    if (c0755Qq.getCurrentPositionInMillis() / AdError.NETWORK_ERROR_CODE < c1029ab.A0P.A0L().A0D().A02()) {
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

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, Bundle bundle, C02304x c02304x) {
        C1029ab c1029ab = this;
        ML ml = null;
        char c2 = c1029ab.A09 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    if (c1029ab.A05 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    if (Build.VERSION.SDK_INT < 19) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1029ab = c1029ab;
                    c1029ab.A0U.A05(EnumC0622Ll.A03);
                    c2 = 6;
                    break;
                case 6:
                    c1029ab = c1029ab;
                    c02304x = c02304x;
                    c1029ab.A0M();
                    c02304x.A0K(c1029ab.A0Q);
                    c1029ab.A09.setVideoURI(new C7C(c1029ab.A0R).A0L(c1029ab.A0P.A0L().A0D().A08()));
                    c1029ab.setUpContentLayoutForVideo(c02304x.A0H().getResources().getConfiguration().orientation);
                    c1029ab.addView(c1029ab.A0N, A0q);
                    ml = c1029ab.A04;
                    if (ml == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1029ab = c1029ab;
                    ml = ml;
                    C0635Ly.A0N(ml);
                    c1029ab.A04.A04(c1029ab.A0O, true);
                    c1029ab.addView(c1029ab.A04, new RelativeLayout.LayoutParams(-1, c1029ab.A04.getToolbarHeight()));
                    c2 = '\b';
                    break;
                case '\b':
                    C1029ab c1029ab2 = c1029ab;
                    c1029ab2.A05.A3J(c1029ab2, 0, A0q);
                    c1029ab2.A0O();
                    c1029ab2.postDelayed(new C1034ag(c1029ab2), JQ.A0I(c1029ab2.getContext()));
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Mk
    public final void A8p() {
        C0755Qq c0755Qq = this.A09;
        if (c0755Qq != null) {
            c0755Qq.A0Y(PC.A03, 23);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Mk
    public final void A8q() {
        A0L();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        C0755Qq c0755Qq = this.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    if (!c0755Qq.A0f()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    C1029ab c1029ab = this;
                    c1029ab.A0A = c1029ab.A09.getVideoStartReason();
                    c1029ab.A0H = z;
                    c1029ab.A09.A0b(false, 14);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        C1029ab c1029ab = this;
        C0755Qq c0755Qq = c1029ab.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    if (!c0755Qq.A0g()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c1029ab = c1029ab;
                    if (!c1029ab.A0I) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c1029ab = c1029ab;
                    if (c1029ab.A09.getState() == EnumC0737Py.A06) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1029ab = c1029ab;
                    if (c1029ab.A0A == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1029ab = c1029ab;
                    if (!c1029ab.A0H) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1029ab = c1029ab;
                    c1029ab.A09.A0Y(c1029ab.A0A, 21);
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
    }

    @Nullable
    private ViewOnClickListenerC0998a5 getCTAButton() {
        if (this.A05 == null) {
            return null;
        }
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = new ViewOnClickListenerC0998a5(this.A0R, PE.A04.A02(), this.A0O, this.A0S, this.A05, this.A0f, this.A0V);
        viewOnClickListenerC0998a5.setRoundedCornersEnabled(true);
        viewOnClickListenerC0998a5.setViewShowsOverMedia(true);
        C0635Ly.A0J(AdError.NO_FILL_ERROR_CODE, viewOnClickListenerC0998a5);
        viewOnClickListenerC0998a5.setCta(this.A0P.A0L().A0F(), this.A0P.A0P(), new HashMap());
        return viewOnClickListenerC0998a5;
    }

    private int getToolbarHeight() {
        int toolbarHeight = 0;
        ML ml = this.A04;
        char c2 = ml == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    toolbarHeight = ML.A00;
                    c2 = 3;
                    break;
                case 3:
                    return toolbarHeight;
                case 4:
                    ml = ml;
                    toolbarHeight = ml.getToolbarHeight();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1029ab c1029ab = this;
        I6 i6 = null;
        RelativeLayout.LayoutParams layoutParams = null;
        RelativeLayout.LayoutParams layoutParams2 = null;
        boolean z = false;
        AbstractC0679Nr abstractC0679Nr = null;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        char c2 = JQ.A1J(c1029ab.A0R) ? (char) 2 : (char) 17;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    if (c1029ab.A06 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    configuration = configuration;
                    z2 = true;
                    i = 0;
                    if (configuration.orientation != 1) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1029ab = c1029ab;
                    z = z2;
                    i2 = -1;
                    if (c1029ab.A02 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1029ab = c1029ab;
                    if (c1029ab.A04 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1029ab = c1029ab;
                    i = 0;
                    c1029ab.A06.setVisibility(0);
                    layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
                    AbstractC0679Nr abstractC0679Nr2 = c1029ab.A06;
                    abstractC0679Nr2.setLayoutParams(abstractC0679Nr2.A0A(c1029ab.A03));
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1029ab = c1029ab;
                    layoutParams2 = layoutParams2;
                    layoutParams2.setMargins(i, c1029ab.A04.getToolbarHeight(), i, A0m);
                    layoutParams2.addRule(2, c1029ab.A06.getId());
                    c2 = '\b';
                    break;
                case '\b':
                    c1029ab = c1029ab;
                    layoutParams2 = layoutParams2;
                    c1029ab.A02.setLayoutParams(layoutParams2);
                    c2 = '\t';
                    break;
                case '\t':
                    C1029ab c1029ab2 = c1029ab;
                    c1029ab2.A00 = configuration.orientation;
                    c1029ab2.A0Q();
                    return;
                case '\n':
                    c1029ab = c1029ab;
                    layoutParams2 = layoutParams2;
                    int i3 = A0m;
                    layoutParams2.setMargins(i, i3, i, i3);
                    layoutParams2.addRule(i, c1029ab.A03.getId());
                    c2 = '\b';
                    break;
                case 11:
                    c1029ab = c1029ab;
                    if (c1029ab.A09 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    layoutParams = new RelativeLayout.LayoutParams(i2, i2);
                    if (!z) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1029ab = c1029ab;
                    layoutParams = layoutParams;
                    c1029ab.A0K();
                    layoutParams.addRule(13);
                    c2 = 14;
                    break;
                case 14:
                    c1029ab = c1029ab;
                    layoutParams = layoutParams;
                    c1029ab.A09.setLayoutParams(layoutParams);
                    c2 = '\t';
                    break;
                case 15:
                    c1029ab = c1029ab;
                    layoutParams = layoutParams;
                    i = 0;
                    c1029ab.A0J();
                    layoutParams.addRule(0, c1029ab.A03.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                    c2 = 14;
                    break;
                case 16:
                    z2 = false;
                    c2 = 4;
                    break;
                case 17:
                    c1029ab = c1029ab;
                    abstractC0679Nr = c1029ab.A06;
                    if (abstractC0679Nr == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c1029ab = c1029ab;
                    configuration = configuration;
                    abstractC0679Nr = abstractC0679Nr;
                    abstractC0679Nr.A0C(configuration.orientation);
                    if (!c1029ab.A0h) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1029ab = c1029ab;
                    i6 = c1029ab.A0E;
                    if (i6 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c1029ab = c1029ab;
                    configuration = configuration;
                    i6 = i6;
                    i6.A09(c1029ab.A06.A08(configuration.orientation));
                    c2 = '\t';
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.facebook.ads.redexgen.X.Io, com.facebook.ads.redexgen.X.MQ, com.facebook.ads.redexgen.X.Nr, com.facebook.ads.redexgen.X.Qq] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        C1029ab c1029ab = this;
        ?? r5 = 0;
        ML ml = null;
        c1029ab.A0U.A03();
        c1029ab.A0U();
        C0755Qq c0755Qq = c1029ab.A09;
        char c2 = c0755Qq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    c0755Qq = c0755Qq;
                    c0755Qq.getEventBus().A04(c1029ab.A0X, c1029ab.A0Y, c1029ab.A0a, c1029ab.A0Z, c1029ab.A0b);
                    c2 = 3;
                    break;
                case 3:
                    c1029ab = c1029ab;
                    if (!TextUtils.isEmpty(c1029ab.A0P.A0P())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c1029ab = c1029ab;
                    c1029ab.A0S.A81(c1029ab.A0P.A0P(), new C0676No().A03(c1029ab.A0f).A02(c1029ab.A0V).A05());
                    c2 = 5;
                    break;
                case 5:
                    c1029ab = c1029ab;
                    ml = c1029ab.A04;
                    r5 = 0;
                    r5 = 0;
                    if (ml == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ml = ml;
                    r5 = 0;
                    ml.setToolbarListener(null);
                    c2 = 7;
                    break;
                case 7:
                    C1029ab c1029ab2 = c1029ab;
                    c1029ab2.A0W.A0f();
                    c1029ab2.A09 = r5;
                    c1029ab2.A06 = r5;
                    c1029ab2.A0C = r5;
                    c1029ab2.A05 = r5;
                    c1029ab2.A0d.A09();
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0V.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1029ab c1029ab = this;
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = c1029ab.A06.getExpandableLayout();
        char c2 = expandableLayout != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1029ab = c1029ab;
                    if (!c1029ab.A0h) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1029ab = c1029ab;
                    if (c1029ab.A0E != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1029ab = c1029ab;
                    expandableLayout = expandableLayout;
                    c1029ab.A0E = new I6(expandableLayout, 300, expandableLayout.getHeight(), 0);
                    c1029ab.A0B.A0I(c1029ab.A0E);
                    c1029ab.A0B.A0G();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    public void setListener(MQ mq) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0711Oy c0711Oy) {
        this.A08 = c0711Oy;
    }

    private void setUpContentLayoutForVideo(int i) {
        this.A0N.removeAllViews();
        A0H();
        if (this.A06 != null) {
            if (JQ.A1J(this.A0R)) {
                this.A0N.addView(this.A03);
                this.A0d.A0A(-1, A0s);
                if (i == 1) {
                    A0K();
                    this.A0N.addView(this.A09, A0q);
                } else {
                    A0J();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(0, this.A03.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.A0N.addView(this.A09, layoutParams);
                }
                this.A0N.addView(this.A06);
            } else {
                this.A0N.addView(this.A09, A0q);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(12);
                this.A06.A0D(false);
                C0635Ly.A0N(this.A06);
                this.A06.A0C(i);
                AbstractC0679Nr abstractC0679Nr = this.A06;
                int i2 = A0p;
                abstractC0679Nr.setPadding(i2, i2, i2, i2);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, this.A0h ? A0u : -2);
                if (this.A0h) {
                    int i3 = A0p;
                    layoutParams2.setMargins(i3, i3, i3, i3);
                    IS is = this.A0d;
                    int i4 = A0v;
                    is.setPadding(i4, i4, i4, i4);
                    this.A0d.A0A(-1, A0s);
                }
                layoutParams3.addRule(12);
                this.A0N.addView(this.A0d, layoutParams3);
                this.A0N.addView(this.A06, layoutParams2);
            }
        }
        int i5 = A0o;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i5, i5);
        layoutParams4.addRule(10);
        layoutParams4.addRule(11);
        int i6 = A0m;
        layoutParams4.setMargins(i6, getToolbarHeight() + i6, A0m, A0n);
        this.A0N.addView(this.A0c, layoutParams4);
        A0R();
    }
}
