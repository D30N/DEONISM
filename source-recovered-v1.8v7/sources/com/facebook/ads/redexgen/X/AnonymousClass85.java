package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.85, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass85 extends AbstractC0941Xx {
    public static byte[] A0K;

    @Nullable
    public O8 A00;

    @Nullable
    public PC A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC02284v A08;
    public final C0711Oy A09;
    public final C0755Qq A0A;
    public final C02997y A0B;
    public final AbstractC0644Mh A0C;
    public final AbstractC0633Lw A0D;
    public final LM A0E;
    public final AbstractC0604Ks A0F;
    public final AbstractC0602Kp A0G;
    public final AbstractC0598Kl A0H;
    public final C0549In A0I;
    public final IS A0J;

    static {
        A08();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A0K = new byte[]{31, 18, 13, 14, 24, -75, -51, -65, -67, -51, -73};
    }

    public AnonymousClass85(XI xi, InterfaceC0657Mv interfaceC0657Mv, JW jw, AnonymousClass17 anonymousClass17, C7C c7c, MQ mq) {
        super(xi, interfaceC0657Mv, jw, anonymousClass17, c7c, mq);
        this.A08 = new XL(this);
        this.A0G = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.8n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                this.A00.A06 = true;
            }
        };
        this.A0F = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.8m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                this.A00.A07 = true;
                this.A00.A0P();
            }
        };
        this.A0E = new LM() { // from class: com.facebook.ads.redexgen.X.8l
            @Override // com.facebook.ads.redexgen.X.C9C
            public final /* bridge */ /* synthetic */ void A03(C9A c9a) {
            }
        };
        this.A0H = new AbstractC0598Kl() { // from class: com.facebook.ads.redexgen.X.8d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02967u c02967u) {
                this.A00.A0F(c02967u);
                this.A00.A0E(c02967u);
                this.A00.A00.A0L(c02967u);
            }
        };
        this.A0C = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.8W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                boolean z = false;
                AnonymousClass85 anonymousClass85 = this.A00;
                char c2 = anonymousClass85.A0A.getState() != EnumC0737Py.A06 ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            z = true;
                            c2 = 3;
                            break;
                        case 3:
                            anonymousClass85.A0D(c02987x, z);
                            return;
                        case 4:
                            z = false;
                            c2 = 3;
                            break;
                    }
                }
            }
        };
        this.A0D = new AnonymousClass88(this);
        boolean z = false;
        this.A06 = false;
        this.A07 = false;
        this.A05 = false;
        this.A03 = false;
        this.A0A = new C0755Qq(super.A03);
        this.A0A.setFunnelLoggingHandler(super.A05);
        this.A0A.getEventBus().A03(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
        this.A0B = new C02997y(super.A03, super.A04, this.A0A, super.A01.A0P());
        this.A09 = new C0711Oy(super.A03, super.A09, super.A01.A0U(), mq);
        this.A0I = new C0549In(super.A03, super.A05);
        this.A0J = new IS(super.A03);
        A07();
        this.A0A.setVideoURI(super.A02.A0L(super.A01.A0L().A0D().A08()));
        A05();
        this.A04 = super.A01.A0L().A0D().A03() <= 0;
        if (super.A01.A0L().A0K() && super.A01.A0L().A0D().A02() > 0) {
            z = true;
        }
        this.A02 = z;
        C0635Ly.A0P(this, super.A01.A0K().A01().A07(true));
    }

    private O8 A00(int i) {
        return O9.A00(new OB(super.A03, super.A04, super.A08, super.A01, this.A0A, super.A0A, super.A06).A0D(super.A07.getToolbarHeight()).A0F(super.A07).A0C(i).A0E(this.A0I).A0G(this.A0J).A0H(), null, true);
    }

    private void A04() {
        this.A0A.postDelayed(new XK(this), JQ.A0H(super.A03));
    }

    private void A05() {
        this.A0A.postDelayed(new TE(this), JQ.A0I(super.A03));
    }

    private void A06() {
        this.A04 = true;
        O8 o8 = this.A00;
        if (o8 != null) {
            o8.A0Y();
        }
    }

    private void A07() {
        this.A0A.A0Z(this.A0J);
        this.A0A.A0Z(this.A0I);
        if (!TextUtils.isEmpty(super.A01.A0L().A0D().A07())) {
            C7W c7w = new C7W(super.A03);
            this.A0A.A0Z(c7w);
            c7w.setImage(super.A01.A0L().A0D().A07());
        }
        AnonymousClass76 anonymousClass76 = new AnonymousClass76(super.A03, true, super.A05);
        this.A0A.A0Z(anonymousClass76);
        this.A0A.A0Z(new C0550Io(anonymousClass76, PO.A02, true));
        this.A0A.A0Z(new C7M(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C02987x c02987x, boolean z) {
        AnonymousClass85 anonymousClass85 = this;
        O8 o8 = null;
        char c2 = anonymousClass85.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    anonymousClass85 = anonymousClass85;
                    anonymousClass85.A05 = true;
                    if (!anonymousClass85.A04) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    anonymousClass85 = anonymousClass85;
                    anonymousClass85.A06();
                    c2 = 5;
                    break;
                case 5:
                    anonymousClass85 = anonymousClass85;
                    o8 = anonymousClass85.A00;
                    if (o8 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02987x = c02987x;
                    o8 = o8;
                    o8.A0K(c02987x);
                    c2 = 7;
                    break;
                case 7:
                    AnonymousClass85 anonymousClass852 = anonymousClass85;
                    ((AbstractC0941Xx) anonymousClass852).A07.setToolbarActionMode(anonymousClass852.getCloseButtonStyle());
                    ((AbstractC0941Xx) anonymousClass852).A07.setToolbarActionMessage(A03(0, 0, 76));
                    anonymousClass852.A0H(z);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C02967u c02967u) {
        AnonymousClass85 anonymousClass85 = this;
        char c2 = anonymousClass85.A0A.getState() != EnumC0737Py.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    anonymousClass85 = anonymousClass85;
                    if (!JQ.A0s(((AbstractC0941Xx) anonymousClass85).A03)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass85 = anonymousClass85;
                    c02967u = c02967u;
                    anonymousClass85.A0A.postDelayed(new XM(anonymousClass85, c02967u), 5000L);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C02967u c02967u) {
        AnonymousClass85 anonymousClass85 = this;
        int i = 0;
        int iA00 = c02967u.A00();
        float fMin = iA00 / Math.min(((AbstractC0941Xx) anonymousClass85).A01.A0L().A0D().A03() * 1000.0f, anonymousClass85.A0A.getDuration());
        ((AbstractC0941Xx) anonymousClass85).A07.setProgress(100.0f * fMin);
        int totalSecondsForReward = fMin >= 1.0f ? 2 : 4;
        while (true) {
            switch (totalSecondsForReward) {
                case 2:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A04) {
                        totalSecondsForReward = 3;
                        break;
                    } else {
                        totalSecondsForReward = 4;
                        break;
                    }
                case 3:
                    anonymousClass85 = anonymousClass85;
                    anonymousClass85.A06();
                    ML ml = ((AbstractC0941Xx) anonymousClass85).A07;
                    int totalSecondsForReward2 = anonymousClass85.getCloseButtonStyle();
                    ml.setToolbarActionMode(totalSecondsForReward2);
                    totalSecondsForReward = 4;
                    break;
                case 4:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A02) {
                        totalSecondsForReward = 7;
                        break;
                    } else {
                        totalSecondsForReward = 5;
                        break;
                    }
                case 5:
                    anonymousClass85 = anonymousClass85;
                    int iA02 = ((AbstractC0941Xx) anonymousClass85).A01.A0L().A0D().A02();
                    int totalSecondsForReward3 = iA00 / AdError.NETWORK_ERROR_CODE;
                    i = iA02 - totalSecondsForReward3;
                    if (i <= 0) {
                        totalSecondsForReward = 8;
                        break;
                    } else {
                        totalSecondsForReward = 6;
                        break;
                    }
                case 6:
                    anonymousClass85 = anonymousClass85;
                    ((AbstractC0941Xx) anonymousClass85).A07.setToolbarActionMessage(((AbstractC0941Xx) anonymousClass85).A01.A0O().A00().replace(A03(5, 6, 9), String.valueOf(i)));
                    totalSecondsForReward = 7;
                    break;
                case 7:
                    return;
                case 8:
                    anonymousClass85 = anonymousClass85;
                    ((AbstractC0941Xx) anonymousClass85).A07.setToolbarActionMessage(A03(0, 0, 76));
                    anonymousClass85.A0H(false);
                    totalSecondsForReward = 7;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        AnonymousClass85 anonymousClass85 = this;
        int currentPositionInMillis = 0;
        int duration = 0;
        C0755Qq c0755Qq = anonymousClass85.A0A;
        char c2 = c0755Qq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass85 = anonymousClass85;
                    c0755Qq = c0755Qq;
                    currentPositionInMillis = c0755Qq.getCurrentPositionInMillis();
                    duration = anonymousClass85.A0A.getDuration();
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass85 = anonymousClass85;
                    str = str;
                    ((AbstractC0941Xx) anonymousClass85).A03.A04().A83(A03(0, 5, 88), C03008a.A22, new C03018b(str));
                    if (!JQ.A0t(((AbstractC0941Xx) anonymousClass85).A03)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass85 = anonymousClass85;
                    anonymousClass85.A0D(new C02987x(currentPositionInMillis, duration), false);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    anonymousClass85 = anonymousClass85;
                    ((AbstractC0941Xx) anonymousClass85).A08.A3r(((AbstractC0941Xx) anonymousClass85).A09.A6C());
                    ((AbstractC0941Xx) anonymousClass85).A08.A3r(((AbstractC0941Xx) anonymousClass85).A09.A67());
                    c2 = 5;
                    break;
            }
        }
    }

    private synchronized void A0H(boolean z) {
        if (this.A02 && !z) {
            super.A08.A3r(super.A09.A5F());
            this.A09.A05();
            this.A02 = false;
            if (this.A00 != null) {
                this.A00.A0W();
            }
            return;
        }
        this.A02 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx
    public final void A0Q() {
        AnonymousClass85 anonymousClass85 = this;
        O8 o8 = null;
        float f = 0.0f;
        O8 o82 = null;
        C0635Ly.A0O(anonymousClass85.A00);
        C0635Ly.A0O(((AbstractC0941Xx) anonymousClass85).A07);
        C0755Qq c0755Qq = anonymousClass85.A0A;
        char c2 = ((AbstractC0941Xx) anonymousClass85).A01.A0L().A0D().A09() ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    f = 0.0f;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass85 = anonymousClass85;
                    c0755Qq = c0755Qq;
                    c0755Qq.setVolume(f);
                    anonymousClass85.A0A.A0Y(PC.A03, 20);
                    o8 = anonymousClass85.A00;
                    if (o8 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    o8 = o8;
                    o8.A0X();
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass85 = anonymousClass85;
                    o82 = anonymousClass85.A00;
                    if (o82 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A04) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    o82 = o82;
                    o82.A0Z();
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass85.A04();
                    return;
                case '\n':
                    f = 1.0f;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx
    public final void A0S(C02304x c02304x) {
        boolean z = false;
        c02304x.A0K(this.A08);
        this.A00 = A00(c02304x.A0H().getResources().getConfiguration().orientation);
        addView(this.A00, AbstractC0941Xx.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        C0635Ly.A0K(this.A00);
        C0635Ly.A0K(super.A07);
        O8 o8 = this.A00;
        char c2 = o8 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    o8 = o8;
                    if (!o8.A0c()) {
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
                    setUpFullscreenMode(z);
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx
    public final boolean A0T() {
        AnonymousClass85 anonymousClass85 = this;
        boolean z = false;
        O8 o8 = anonymousClass85.A00;
        char c2 = o8 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass85 = anonymousClass85;
                    o8 = o8;
                    if (!o8.A0d(anonymousClass85.A02)) {
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
    public final void AAT(boolean z) {
        if (this.A0A.A0f()) {
            return;
        }
        this.A01 = this.A0A.getVideoStartReason();
        this.A03 = z;
        this.A0A.A0b(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        AnonymousClass85 anonymousClass85 = this;
        char c2 = !anonymousClass85.A0A.A0g() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    anonymousClass85 = anonymousClass85;
                    if (anonymousClass85.A0A.getState() == EnumC0737Py.A06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass85 = anonymousClass85;
                    if (anonymousClass85.A01 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A03) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass85 = anonymousClass85;
                    anonymousClass85.A0A.A0Y(anonymousClass85.A01, 19);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    private int getCloseButtonStyle() {
        int closeButtonStyle = 0;
        O8 o8 = this.A00;
        char c2 = o8 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    o8 = o8;
                    closeButtonStyle = o8.getCloseButtonStyle();
                    c2 = 3;
                    break;
                case 3:
                    return closeButtonStyle;
                case 4:
                    closeButtonStyle = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx, com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        AnonymousClass85 anonymousClass85 = this;
        C0755Qq c0755Qq = null;
        super.onDestroy();
        O8 o8 = anonymousClass85.A00;
        char c2 = o8 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    o8 = o8;
                    o8.A0V();
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass85 = anonymousClass85;
                    c0755Qq = anonymousClass85.A0A;
                    if (c0755Qq == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass85 = anonymousClass85;
                    if (!anonymousClass85.A05) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c0755Qq = c0755Qq;
                    c0755Qq.A0W(P8.A03);
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass85 = anonymousClass85;
                    anonymousClass85.A0A.getEventBus().A04(anonymousClass85.A0G, anonymousClass85.A0F, anonymousClass85.A0E, anonymousClass85.A0H, anonymousClass85.A0C, anonymousClass85.A0D);
                    anonymousClass85.A0A.A0R();
                    c2 = 7;
                    break;
                case 7:
                    anonymousClass85.A0B.A0f();
                    return;
            }
        }
    }
}
