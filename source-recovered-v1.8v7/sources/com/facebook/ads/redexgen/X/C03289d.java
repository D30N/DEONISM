package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03289d extends ZM implements InterfaceC0647Mk {
    public static byte[] A0D;

    @Nullable
    public View A00;
    public View A01;

    @Nullable
    public ImageView A02;
    public XI A03;

    @Nullable
    public ML A04;
    public C0710Ox A05;

    @Nullable
    public C0530Hu A06;
    public boolean A07;
    public final FrameLayout A08;
    public final MQ A09;
    public final C0755Qq A0A;
    public final IS A0B;
    public final AtomicBoolean A0C;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0E() {
        A0D = new byte[]{-72, -79, -58, -75, -49, -61, -60, -79, -62, -60, -71, -66, -73, -49, -79, -66, -71, -67, -79, -60, -71, -65, -66, -61, -49, -64, -68, -79, -55, -75, -76, -49, -71, -53, -41, -67, -58, -68, -41, -69, -71, -54, -68, -41, -53, -64, -57, -49, -58, -114, -111, -107, -121, -95, -108, -121, -103, -125, -108, -122, -95, -107, -123, -108, -121, -121, -112, -95, -107, -118, -111, -103, -112, -90, -78, -80, 113, -87, -92, -90, -88, -91, -78, -78, -82, 113, -92, -89, -74, 113, -84, -79, -73, -88, -75, -74, -73, -84, -73, -84, -92, -81, 113, -87, -84, -79, -84, -74, -85, -94, -92, -90, -73, -84, -71, -84, -73, -68};
    }

    static {
        A0E();
    }

    public C03289d(OC oc) {
        super(oc, false);
        this.A0C = new AtomicBoolean(false);
        this.A07 = false;
        this.A03 = oc.A05();
        this.A04 = oc.A08();
        this.A01 = new View(this.A03);
        C0635Ly.A0N(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A09 = oc.A09();
        O6.A00(oc.A05(), this, getAdInfo().A0D().A07());
        this.A0A = A02(oc);
        getAdDetailsView().bringToFront();
        this.A0B = A04(oc);
        A0f();
        this.A05 = new C0710Ox(this.A03, oc.A06(), getAdDataBundle());
        this.A08 = new FrameLayout(getContext());
        if (!JQ.A1O(this.A03)) {
            A07();
        }
    }

    private C0755Qq A02(OC oc) {
        C03289d c03289d = this;
        RelativeLayout.LayoutParams layoutParams = null;
        C0755Qq c0755Qq = (C0755Qq) oc.A02();
        int iA0e = c03289d.A0e(oc.A08());
        ImageView imageView = (ImageView) oc.A03();
        imageView.setPadding(ZM.A0C, ZM.A0C, ZM.A0C, ZM.A0C);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ZM.A0D, ZM.A0D);
        layoutParams2.setMargins(0, iA0e, ZM.A0B, 0);
        layoutParams2.addRule(11);
        layoutParams2.addRule(10);
        char c2 = JQ.A1J(c03289d.A03) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c03289d = c03289d;
                    layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    AbstractC0679Nr adDetailsView = c03289d.getAdDetailsView();
                    adDetailsView.setLayoutParams(adDetailsView.A0B(c03289d.A01));
                    if (c03289d.getResources().getConfiguration().orientation != 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    layoutParams = layoutParams;
                    layoutParams.addRule(13);
                    c2 = 4;
                    break;
                case 4:
                    c03289d = c03289d;
                    c0755Qq = c0755Qq;
                    imageView = imageView;
                    layoutParams2 = layoutParams2;
                    layoutParams = layoutParams;
                    c03289d.A02 = imageView;
                    c03289d.addView(c0755Qq, layoutParams);
                    c03289d.addView(imageView, layoutParams2);
                    c2 = 5;
                    break;
                case 5:
                    return c0755Qq;
                case 6:
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    layoutParams.addRule(0, c03289d.A01.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                    c2 = 4;
                    break;
                case 7:
                    c03289d = c03289d;
                    c0755Qq = c0755Qq;
                    imageView = imageView;
                    layoutParams2 = layoutParams2;
                    RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
                    videoViewParams.addRule(13);
                    c03289d.addView(c0755Qq, videoViewParams);
                    c0755Qq.addView(imageView, layoutParams2);
                    c2 = 5;
                    break;
            }
        }
    }

    private IS A04(OC oc) {
        C03289d c03289d = this;
        IS isA0A = oc.A0A();
        isA0A.A0A(-1, ZM.A08);
        char c2 = JQ.A1J(c03289d.A03) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c03289d = c03289d;
                    if (c03289d.getResources().getConfiguration().orientation != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03289d = c03289d;
                    isA0A = isA0A;
                    c03289d.setUpPortraitAdDetails(isA0A);
                    c2 = 4;
                    break;
                case 4:
                    return isA0A;
                case 5:
                    c03289d = c03289d;
                    isA0A = isA0A;
                    c03289d.setUpLandscapeAdDetails(isA0A);
                    c2 = 4;
                    break;
                case 6:
                    c03289d = c03289d;
                    isA0A = isA0A;
                    isA0A.setPadding(ZM.A0G, ZM.A0G, ZM.A0G, ZM.A0G);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ZM.A0F);
                    layoutParams.addRule(12);
                    c03289d.addView(isA0A, layoutParams);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A07() {
        String title;
        RewardData rewardDataA0J = getAdDataBundle().A0J();
        if (rewardDataA0J == null) {
            title = getAdDataBundle().A0M().A05();
        } else {
            title = getAdDataBundle().A0M().A06(rewardDataA0J.getCurrency(), rewardDataA0J.getQuantity());
        }
        MZ mz = new MZ(getAdContextWrapper(), -1, -16777216, title, null, getAdDataBundle().A0M().A04(), getAdDataBundle().A0M().A03(), M7.A00(M6.REWARD_ICON));
        mz.A02.setOnClickListener(new OD(this));
        mz.A01.setOnClickListener(new OE(this));
        this.A08.addView(mz, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A08() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0A.A0a(getAnimationPlugin());
        }
    }

    private void A09() {
        ML ml = this.A04;
        if (ml == null) {
            return;
        }
        this.A06 = new C0530Hu(ml, 400, -ml.getToolbarHeight(), 0);
    }

    private void A0A() {
        C03289d c03289d = this;
        RelativeLayout.LayoutParams layoutParams = null;
        ImageView imageView = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        new C0565Jd(c03289d.getAdDataBundle().A0P(), c03289d.getAdEventManager()).A02(EnumC0564Jc.A0m, null);
        char c2 = !c03289d.getAdInfo().A0M() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c03289d = c03289d;
                    i3 = 1;
                    c03289d.A0C.set(true);
                    C0635Ly.A0X(c03289d);
                    C0635Ly.A0K(c03289d.A0A);
                    i5 = 0;
                    i = 2;
                    C0635Ly.A0d(c03289d.A0A, c03289d.A0B, c03289d.A08, c03289d.A00);
                    C0635Ly.A0O(c03289d.A04);
                    Pair<EnumC0709Ow, View> pairA02 = c03289d.A05.A02(c03289d.getCtaButton());
                    c03289d.A00 = (View) pairA02.second;
                    i2 = OF.A00[((EnumC0709Ow) pairA02.first).ordinal()];
                    i4 = -1;
                    if (i2 == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i2 == i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c03289d = c03289d;
                    View[] viewArr = new View[i3];
                    viewArr[i5] = c03289d.getAdDetailsView();
                    C0635Ly.A0d(viewArr);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i4);
                    layoutParams2.setMargins(ZM.A0E, ZM.A0E, ZM.A0E, ZM.A0E);
                    c03289d.addView(c03289d.A00, layoutParams2);
                    c2 = 5;
                    break;
                case 7:
                    c03289d = c03289d;
                    c03289d.getAdDetailsView().setVisibility(i5);
                    layoutParams = new RelativeLayout.LayoutParams(i4, i4);
                    if (!JQ.A1J(c03289d.A03)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c03289d = c03289d;
                    imageView = c03289d.A02;
                    if (imageView == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    imageView = imageView;
                    imageView.setVisibility(8);
                    c2 = '\n';
                    break;
                case '\n':
                    c03289d = c03289d;
                    c03289d.getAdDetailsView().setLayoutParams(c03289d.getAdDetailsView().A0A(c03289d.A01));
                    if (c03289d.getResources().getConfiguration().orientation != i3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i5, c03289d.A0e(c03289d.A04), i5, O8.A09);
                    layoutParams.addRule(i, c03289d.getAdDetailsView().getId());
                    c2 = '\f';
                    break;
                case '\f':
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    c03289d.addView(c03289d.A00, layoutParams);
                    c2 = 5;
                    break;
                case '\r':
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i5, O8.A09, i5, O8.A09);
                    layoutParams.addRule(i5, c03289d.A01.getId());
                    c2 = '\f';
                    break;
                case 14:
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i5, c03289d.A0e(c03289d.A04), i5, i5);
                    layoutParams.addRule(i, c03289d.getAdDetailsView().getId());
                    c2 = '\f';
                    break;
            }
        }
    }

    private void A0B() {
        C03289d c03289d = this;
        ML ml = null;
        ML ml2 = null;
        char c2 = !c03289d.A0A.A0g() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03289d = c03289d;
                    c03289d.A0A.A0c(false, false, 11);
                    c2 = 3;
                    break;
                case 3:
                    c03289d = c03289d;
                    if (!JQ.A1O(c03289d.A03)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03289d = c03289d;
                    ml2 = c03289d.A04;
                    if (ml2 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c03289d = c03289d;
                    ml2 = ml2;
                    ml2.A05(c03289d);
                    c2 = 6;
                    break;
                case 6:
                    c03289d.A07 = true;
                    return;
                case 7:
                    c03289d = c03289d;
                    ml = c03289d.A04;
                    if (ml == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ml = ml;
                    C0635Ly.A0K(ml);
                    c2 = '\t';
                    break;
                case '\t':
                    c03289d = c03289d;
                    C0635Ly.A0Q(c03289d.A0A, 4);
                    C0635Ly.A0Q(c03289d.A0B, 4);
                    C0635Ly.A0Q(c03289d.getAdDetailsView(), 4);
                    c03289d.addView(c03289d.A08, new RelativeLayout.LayoutParams(-1, -1));
                    c2 = 6;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        C03289d c03289d = this;
        char c2 = c03289d.getAdInfo().A0M() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03289d = c03289d;
                    c03289d.A0A.A0W(P8.A05);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c03289d = c03289d;
                    c03289d.A09.A3r(A06(73, 45, 10));
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0D() {
        C03289d c03289d = this;
        C0530Hu c0530Hu = c03289d.A06;
        boolean z = false;
        char c2 = c0530Hu != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0530Hu = c0530Hu;
                    z = false;
                    c0530Hu.A3N(true, false);
                    c2 = 3;
                    break;
                case 3:
                    c03289d = c03289d;
                    if (c03289d.getAdDetailsAnimation() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03289d = c03289d;
                    c03289d.getAdDetailsAnimation().A3N(true, z);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0J(Bundle bundle) {
        bundle.putBoolean(A06(0, 31, 55), true);
        bundle.putBoolean(A06(31, 18, 63), this.A0C.get());
        bundle.putBoolean(A06(49, 24, 9), this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0K(C02987x c02987x) {
        super.A0K(c02987x);
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0L(C02967u c02967u) {
        C03289d c03289d = this;
        super.A0L(c02967u);
        int duration = c03289d.A0A.getDuration() - c02967u.A00();
        int remainingVideoTimeInMillis = c03289d.getAnimationPlugin() != null ? 2 : 5;
        while (true) {
            switch (remainingVideoTimeInMillis) {
                case 2:
                    if (duration >= 3000) {
                        remainingVideoTimeInMillis = 5;
                        break;
                    } else {
                        remainingVideoTimeInMillis = 3;
                        break;
                    }
                case 3:
                    c03289d = c03289d;
                    if (!c03289d.getAnimationPlugin().A0J()) {
                        remainingVideoTimeInMillis = 5;
                        break;
                    } else {
                        remainingVideoTimeInMillis = 4;
                        break;
                    }
                case 4:
                    c03289d = c03289d;
                    c03289d.getAnimationPlugin().A0F();
                    remainingVideoTimeInMillis = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0V() {
        super.A0V();
        A08();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.X.ZM, com.facebook.ads.redexgen.X.O8
    public final void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        C03289d c03289d = this;
        boolean z = false;
        super.A0a(c1a, str, d2, bundle2);
        char c2 = bundle2 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    bundle2 = new Bundle();
                    c2 = 3;
                    break;
                case 3:
                    bundle2 = bundle2;
                    z = false;
                    if (!bundle2.getBoolean(A06(0, 31, 55), false)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c03289d = c03289d;
                    c03289d.A0D();
                    c2 = 5;
                    break;
                case 5:
                    bundle2 = bundle2;
                    if (!bundle2.getBoolean(A06(31, 18, 63), z)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c03289d = c03289d;
                    c03289d.A0A();
                    c2 = 7;
                    break;
                case 7:
                    bundle2 = bundle2;
                    if (!bundle2.getBoolean(A06(49, 24, 9), z)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c03289d = c03289d;
                    c03289d.A0B();
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0d(boolean z) {
        C03289d c03289d = this;
        char c2 = z ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c03289d = c03289d;
                    if (!c03289d.A07) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c03289d = c03289d;
                    if (!c03289d.A0C.get()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c03289d.A0B();
                    return true;
                case 5:
                    c03289d = c03289d;
                    if (!c03289d.getAdInfo().A0M()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c03289d = c03289d;
                    if (!c03289d.A0C.get()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c03289d.A0A.A0W(P8.A06);
                    return true;
                case '\b':
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZM
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A7t(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Mk
    public final void A8p() {
        this.A07 = false;
        this.A0A.A0Y(PC.A03, 15);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Mk
    public final void A8q() {
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.O8
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        C03289d c03289d = this;
        char c2 = c03289d.A0g() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03289d = c03289d;
                    if (!c03289d.A0C.get()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return 1;
                case 4:
                    return super.getCloseButtonStyle();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZM, com.facebook.ads.redexgen.X.O8, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C03289d c03289d = this;
        ImageView imageView = null;
        int i = 0;
        boolean z = false;
        RelativeLayout.LayoutParams layoutParams = null;
        boolean z2 = false;
        int i2 = 0;
        RelativeLayout.LayoutParams layoutParams2 = null;
        super.onConfigurationChanged(configuration);
        char c2 = JQ.A1J(c03289d.A03) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    configuration = configuration;
                    z2 = true;
                    i = 0;
                    if (configuration.orientation != 1) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03289d = c03289d;
                    z = z2;
                    i2 = -1;
                    if (!c03289d.A0C.get()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 4:
                    layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c03289d = c03289d;
                    layoutParams2 = layoutParams2;
                    c03289d.setUpPortraitAdDetails(c03289d.A0B);
                    layoutParams2.addRule(13);
                    c2 = 6;
                    break;
                case 6:
                    c03289d = c03289d;
                    layoutParams2 = layoutParams2;
                    c03289d.A0A.setLayoutParams(layoutParams2);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    c03289d = c03289d;
                    layoutParams2 = layoutParams2;
                    i = 0;
                    c03289d.setUpLandscapeAdDetails(c03289d.A0B);
                    layoutParams2.addRule(0, c03289d.A01.getId());
                    layoutParams2.setMargins(0, 0, 0, 0);
                    c2 = 6;
                    break;
                case '\t':
                    c03289d = c03289d;
                    if (c03289d.A00 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c03289d = c03289d;
                    imageView = c03289d.A02;
                    if (imageView == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    imageView = imageView;
                    imageView.setVisibility(8);
                    c2 = '\f';
                    break;
                case '\f':
                    c03289d = c03289d;
                    i = 0;
                    c03289d.getAdDetailsView().setVisibility(0);
                    layoutParams = new RelativeLayout.LayoutParams(i2, i2);
                    c03289d.getAdDetailsView().setLayoutParams(c03289d.getAdDetailsView().A0A(c03289d.A01));
                    if (!z) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i, c03289d.A0e(c03289d.A04), i, O8.A09);
                    layoutParams.addRule(2, c03289d.getAdDetailsView().getId());
                    c2 = 14;
                    break;
                case 14:
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    c03289d.A00.setLayoutParams(layoutParams);
                    c2 = 7;
                    break;
                case 15:
                    c03289d = c03289d;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i, O8.A09, i, O8.A09);
                    layoutParams.addRule(i, c03289d.A01.getId());
                    c2 = 14;
                    break;
                case 16:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private void setUpLandscapeAdDetails(IS is) {
        getAdDetailsView().removeAllViews();
        removeView(is);
        getAdDetailsView().setLayoutParams(getAdDetailsView().A0B(this.A01));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1170cv.A0F);
        layoutParams.addRule(12);
        addView(is, layoutParams);
    }

    private void setUpPortraitAdDetails(IS is) {
        getAdDetailsView().removeAllViews();
        removeView(is);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1170cv.A0G);
        layoutParams.setMargins(0, 0, 0, C1170cv.A0H);
        getAdDetailsView().addView(is, layoutParams);
        getAdDetailsView().setLayoutParams(getAdDetailsView().A0B(this.A01));
    }
}
