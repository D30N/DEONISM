package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03469v extends AbstractC1055b1 {
    public static byte[] A0T;

    @Nullable
    public C02304x A00;

    @Nullable
    public O8 A01;

    @Nullable
    public PC A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C1A A09;
    public final InterfaceC02284v A0A;
    public final C7C A0B;
    public final XI A0C;
    public final C0628Lr A0D;
    public final C0711Oy A0E;
    public final C0755Qq A0F;
    public final C0654Ms A0G;
    public final AbstractC0644Mh A0H;
    public final AbstractC0633Lw A0I;
    public final LM A0J;
    public final AbstractC0604Ks A0K;
    public final AbstractC0602Kp A0L;
    public final AbstractC0598Kl A0M;
    public final C0549In A0N;
    public final IS A0O;

    @DoNotStrip
    public final Q0 A0P;
    public final Q1 A0Q;
    public final AtomicBoolean A0R;
    public final AtomicBoolean A0S;

    static {
        A0D();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0T, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 27);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0D() {
        A0T = new byte[]{-52, -74, -56, -76, -53, -66, -71, -70, -60, -76, -62, -54, -55, -70, -71};
    }

    public C03469v(XI xi, JW jw, C0786Rv c0786Rv, C7C c7c, MQ mq) {
        super(xi, jw, mq, c0786Rv);
        this.A0A = new C1097bh(this);
        this.A0I = new AT(this);
        this.A0K = new AN(this);
        this.A0M = new AL(this);
        this.A0J = new AJ(this);
        this.A0H = new AI(this);
        this.A0L = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.9x
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A01 = new byte[]{-53, -66, -71, -70, -60, -98, -61, -55, -70, -57, -56, -55, -66, -55, -74, -63, -102, -53, -70, -61, -55};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                C03489x c03489x = this;
                c03489x.A00.A04 = true;
                char c2 = !c03489x.A00.A03 ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            c03489x = c03489x;
                            c03489x.A00.A0R.set(c03489x.A00.A0F.A0d());
                            c03489x.A00.A0C();
                            c2 = 3;
                            break;
                        case 3:
                            c03489x = c03489x;
                            if (c03489x.A00.getAudienceNetworkListener() == null) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            c03489x = c03489x;
                            c0603Kr = c0603Kr;
                            c03489x.A00.getAudienceNetworkListener().A3s(A00(0, 21, 35), c0603Kr);
                            c2 = 5;
                            break;
                        case 5:
                            c03489x = c03489x;
                            if (c03489x.A00.A01 == null) {
                                c2 = 6;
                                break;
                            } else {
                                c2 = 6;
                                break;
                            }
                        case 6:
                            return;
                    }
                }
            }
        };
        this.A0D = new C0628Lr();
        this.A0S = new AtomicBoolean(false);
        this.A0R = new AtomicBoolean(false);
        this.A03 = false;
        this.A06 = false;
        this.A04 = false;
        this.A07 = false;
        this.A08 = true;
        this.A05 = false;
        this.A0C = xi;
        this.A0F = new C0755Qq(this.A0C);
        this.A0F.setFunnelLoggingHandler(super.A0C);
        this.A0F.setVideoProgressReportIntervalMs(c0786Rv.A0E());
        C0635Ly.A0N(this.A0F);
        C0635Ly.A0P(this.A0F, 0);
        this.A09 = c0786Rv.A0L();
        this.A05 = this.A09.A0K() && this.A09.A0D().A02() > 0;
        this.A0B = c7c;
        this.A0O = new IS(this.A0C);
        this.A0N = new C0549In(xi, super.A0C);
        this.A0F.getEventBus().A03(this.A0K, this.A0M, this.A0J, this.A0H, this.A0I, this.A0L);
        setupPlugins(this.A09);
        this.A0P = new C1094be(this);
        this.A0Q = new Q1(this, 1, new WeakReference(this.A0P), xi);
        this.A0Q.A0X(c0786Rv.A0F());
        this.A0Q.A0Y(c0786Rv.A0G());
        this.A0G = new C02997y(this.A0C, super.A0B, this.A0F, super.A09.A0P());
        this.A0E = new C0711Oy(xi, new C1025aX(), super.A09.A0U(), getAudienceNetworkListener());
        if (this.A09.A0D().A03() > 0) {
            setForcedTimeViewIncomplete(true);
        }
    }

    private OC A05(int i) {
        return new OB(this.A0C, super.A0B, getAudienceNetworkListener(), super.A09, this.A0F, this.A0Q, this.A0D).A0D(super.A0D.getToolbarHeight()).A0C(i).A0G(this.A0O).A0E(this.A0N).A0F(super.A0D).A0H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        int i = 0;
        C0549In c0549In = this.A0N;
        char c2 = this.A0R.get() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    c0549In.setVisibility(i);
                    return;
                case 4:
                    i = 8;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0E(int i) {
        O8 o8 = this.A01;
        if (o8 == null) {
            return;
        }
        A0Z(o8, o8.A0c(), i);
    }

    private void A0F(int i, @Nullable Bundle bundle) {
        C03469v c03469v = this;
        O8 o8 = null;
        OC ocA05 = c03469v.A05(i);
        boolean zA0b = false;
        O8 o82 = c03469v.A01;
        char c2 = o82 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03469v = c03469v;
                    o82 = o82;
                    zA0b = o82.A0b();
                    o8 = c03469v.A01;
                    if (!(o8 instanceof YY)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    o8 = o8;
                    o8.A0V();
                    c2 = 4;
                    break;
                case 4:
                    c03469v.A01 = O9.A01(ocA05, bundle, false, zA0b);
                    return;
            }
        }
    }

    private void A0G(@Nullable Bundle bundle, C1A c1a, int i) {
        C1A c1a2 = c1a;
        Bundle bundle2 = bundle;
        C03469v c03469v = this;
        O8 o8 = c03469v.A01;
        char c2 = o8 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03469v = c03469v;
                    bundle2 = bundle2;
                    c1a2 = c1a2;
                    o8 = o8;
                    o8.A0a(c1a2, ((AbstractC1055b1) c03469v).A09.A0P(), O7.A00(c1a2), bundle2);
                    c2 = 3;
                    break;
                case 3:
                    bundle2 = bundle2;
                    if (bundle2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03469v = c03469v;
                    bundle2 = bundle2;
                    c03469v.A08 = bundle2.getBoolean(A09(0, 15, 58), true);
                    c2 = 5;
                    break;
                case 5:
                    C03469v c03469v2 = c03469v;
                    c03469v2.A0C();
                    c03469v2.A0E(i);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    public final void A0X() {
        C03469v c03469v = this;
        C1A c1aA0L = null;
        float f = 0.0f;
        C0755Qq c0755Qq = null;
        char c2 = c03469v.A0F.getParent() == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c03469v = c03469v;
                    c03469v.A0W();
                    c1aA0L = ((AbstractC1055b1) c03469v).A09.A0L();
                    c0755Qq = c03469v.A0F;
                    if (!c1aA0L.A0D().A09()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03469v = c03469v;
                    if (!c03469v.A08) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    f = 0.0f;
                    c2 = 6;
                    break;
                case 6:
                    c03469v = c03469v;
                    c0755Qq = c0755Qq;
                    c0755Qq.setVolume(f);
                    if (!c03469v.A0F.A0g()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 7:
                    c03469v = c03469v;
                    if (!c03469v.A0F.A0i()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c03469v = c03469v;
                    if (!c03469v.A06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    c03469v = c03469v;
                    c03469v.A0F.A0X(PC.A03);
                    c2 = '\n';
                    break;
                case '\n':
                    c1aA0L = c1aA0L;
                    if (c1aA0L.A0D().A03() <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c03469v = c03469v;
                    c03469v.postDelayed(new C1077bN(c03469v), JQ.A0I(c03469v.getContext()));
                    c2 = '\f';
                    break;
                case '\f':
                    return;
                case '\r':
                    f = 1.0f;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    public final boolean A0h() {
        C03469v c03469v = this;
        boolean z = false;
        O8 o8 = c03469v.A01;
        char c2 = o8 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c03469v = c03469v;
                    o8 = o8;
                    if (!o8.A0d(c03469v.A05)) {
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
    public final void A7s(Intent intent, @Nullable Bundle bundle, C02304x c02304x) {
        super.A0b(c02304x);
        this.A00 = c02304x;
        C1A c1aA0L = super.A09.A0L();
        int i = c02304x.A0H().getResources().getConfiguration().orientation;
        A0F(i, bundle);
        this.A0F.setVideoURI(this.A0B.A0L(this.A09.A0D().A08()));
        A0G(bundle, c1aA0L, i);
        C02304x c02304x2 = this.A00;
        if (c02304x2 != null) {
            c02304x2.A0K(this.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        C03469v c03469v = this;
        char c2 = !c03469v.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03469v = c03469v;
                    if (!c03469v.A0F.A0f()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    C03469v c03469v2 = c03469v;
                    c03469v2.A02 = c03469v2.A0F.getVideoStartReason();
                    c03469v2.A06 = z;
                    c03469v2.A0F.A0b(false, 12);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        C03469v c03469v = this;
        char c2 = !c03469v.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c03469v = c03469v;
                    if (c03469v.A0F.getParent() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03469v = c03469v;
                    if (!c03469v.A0F.A0g()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    c03469v = c03469v;
                    if (c03469v.A0F.getState() != EnumC0737Py.A07) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c03469v = c03469v;
                    if (c03469v.A0F.getVideoStartReason() != PC.A04) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    c03469v = c03469v;
                    if (c03469v.A0F.getState() == EnumC0737Py.A06) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c03469v = c03469v;
                    if (c03469v.A02 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c03469v = c03469v;
                    if (!c03469v.A06) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c03469v = c03469v;
                    c03469v.A0F.A0Y(c03469v.A02, 16);
                    c2 = '\f';
                    break;
                case '\f':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
        if (this.A01 != null) {
            bundle.putBoolean(A09(0, 15, 58), this.A0F.A0e());
            this.A01.A0J(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        O8 o8 = this.A01;
        if (o8 == null) {
            return 0;
        }
        return o8.getCloseButtonStyle();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        ACm(bundle);
        removeAllViews();
        C0635Ly.A0M(this.A0F);
        C0635Ly.A0M(this.A0O);
        C0635Ly.A0M(this.A0N);
        if (super.A09.A0L() == null) {
            return;
        }
        A0F(configuration.orientation, bundle);
        A0G(bundle, super.A09.A0L(), configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        C03469v c03469v = this;
        O8 o8 = null;
        O8 o82 = null;
        char c2 = !c03469v.A03 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c03469v = c03469v;
                    if (!c03469v.A0S.get()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c03469v = c03469v;
                    c03469v.A0F.A0W(P8.A04);
                    c2 = 4;
                    break;
                case 4:
                    c03469v = c03469v;
                    if (((AbstractC1055b1) c03469v).A09 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c03469v = c03469v;
                    if (!TextUtils.isEmpty(((AbstractC1055b1) c03469v).A09.A0P())) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c03469v = c03469v;
                    ((AbstractC1055b1) c03469v).A0B.A81(((AbstractC1055b1) c03469v).A09.A0P(), new C0676No().A03(c03469v.A0Q).A02(c03469v.A0D).A05());
                    c2 = 7;
                    break;
                case 7:
                    c03469v = c03469v;
                    o82 = c03469v.A01;
                    if (o82 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    o82 = o82;
                    o82.A0V();
                    c2 = '\t';
                    break;
                case '\t':
                    c03469v = c03469v;
                    c03469v.A0F.A0V(4);
                    c03469v.A0F.A0R();
                    c03469v.A0F.getEventBus().A04(c03469v.A0K, c03469v.A0M, c03469v.A0J, c03469v.A0H, c03469v.A0I, c03469v.A0L);
                    c03469v.A03 = true;
                    c2 = '\n';
                    break;
                case '\n':
                    c03469v = c03469v;
                    c03469v.A0Q.A0W();
                    c03469v.A00 = null;
                    o8 = c03469v.A01;
                    if (o8 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    o8 = o8;
                    o8.A0V();
                    c2 = '\f';
                    break;
                case '\f':
                    super.onDestroy();
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void setupPlugins(C1A c1a) {
        this.A0F.A0T();
        this.A0F.A0Z(this.A0O);
        this.A0F.A0Z(this.A0N);
        if (!TextUtils.isEmpty(c1a.A0D().A07())) {
            C7W c7w = new C7W(this.A0C);
            this.A0F.A0Z(c7w);
            c7w.setImage(c1a.A0D().A07());
        }
        AnonymousClass76 anonymousClass76 = new AnonymousClass76(this.A0C, true, super.A0C);
        this.A0F.A0Z(anonymousClass76);
        this.A0F.A0Z(new C0550Io(anonymousClass76, PO.A02, true));
        this.A0F.A0Z(new C7M(this.A0C));
    }
}
