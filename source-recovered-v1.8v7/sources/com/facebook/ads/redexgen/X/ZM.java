package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class ZM extends O8 {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public KC A00;

    @Nullable
    public I6 A01;
    public C0530Hu A02;
    public final AnonymousClass17 A03;
    public final C1A A04;
    public final AbstractC0679Nr A05;

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0K() {
        A06 = new byte[]{108, 123, 105, Byte.MAX_VALUE, 108, 122, 123, 122, 65, 104, 119, 122, 123, 113, 38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 36, 33, 54, 107, 44, 43, 49, 32, 55, 54, 49, 44, 49, 44, 36, 41, 107, 38, 41, 44, 38, 46, 32, 33};
    }

    static {
        A0K();
        A0A = (int) (C0635Ly.A01 * 48.0f);
        A0E = (int) (C0635Ly.A01 * 16.0f);
        A07 = (int) (C0635Ly.A01 * 4.0f);
        A0D = (int) (C0635Ly.A01 * 44.0f);
        A0B = (int) (C0635Ly.A01 * 8.0f);
        A0C = (int) (C0635Ly.A01 * 12.0f);
        A0G = (int) (C0635Ly.A01 * 12.0f);
        A0F = (int) (C0635Ly.A01 * 26.0f);
        A08 = C2H.A01(-1, 77);
        A09 = C2H.A01(A08, 90);
    }

    public ZM(OC oc, boolean z) {
        super(oc, z);
        this.A03 = oc.A04();
        this.A04 = this.A03.A0L();
        this.A05 = A0I(oc);
        ML mlA08 = oc.A08();
        if (mlA08 != null) {
            mlA08.setLayoutParams(new RelativeLayout.LayoutParams(-1, mlA08.getToolbarHeight()));
            mlA08.setPageDetailsVisible(false);
        }
    }

    private AbstractC0679Nr A0I(OC oc) {
        String strA0J;
        AbstractC0679Nr c0988Zs;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (oc.A04().A0S().equals(A0J(0, 14, 26))) {
            strA0J = PE.A04.A02();
        } else {
            strA0J = A0J(14, 37, 65);
        }
        if (JQ.A1J(oc.A05())) {
            c0988Zs = new C1170cv(oc.A05(), A0A, getColors(), strA0J, oc.A06(), oc.A09(), oc.A0B(), oc.A07());
            layoutParams.setMargins(O8.A09, 0, O8.A09, O8.A09);
        } else {
            c0988Zs = new C0988Zs(oc.A05(), A0A, this.A04.A0E().A00() == C1F.A04, getColors(), strA0J, oc.A06(), oc.A09(), oc.A0B(), oc.A07());
            this.A02 = new C0530Hu(c0988Zs, 400, 100, 0);
        }
        C0635Ly.A0N(c0988Zs);
        c0988Zs.A0C(oc.A00());
        addView(c0988Zs, layoutParams);
        return c0988Zs;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle) {
        super.A0a(c1a, str, d2, bundle);
        this.A05.setInfo(c1a.A0E(), c1a.A0F(), str, this.A03.A0N().A01(), null);
    }

    public final int A0e(@Nullable ML ml) {
        int toolbarHeight = 0;
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

    public void A0f() {
        ZM zm = this;
        boolean z = false;
        I6 i6 = null;
        View expandableLayout = zm.getAdDetailsView().getExpandableLayout();
        char c2 = expandableLayout != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    zm = zm;
                    z = true;
                    zm.A00 = new KC(true);
                    i6 = zm.A01;
                    if (i6 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zm = zm;
                    i6 = i6;
                    zm.A00.A0I(i6);
                    c2 = 4;
                    break;
                case 4:
                    zm = zm;
                    expandableLayout = expandableLayout;
                    C1I c1iA01 = zm.A03.A0K().A01();
                    zm.A00.A0I(new I0(zm.getAdDetailsView().getCTAButton(), 300, -1, c1iA01.A09(z)));
                    zm.A00.A0I(new IC(zm.getAdDetailsView().getCTAButton(), 300, C0635Ly.A09(A08, A09, A07), C0635Ly.A06(c1iA01.A08(z), A07)));
                    zm.A00.A0I(new I4(expandableLayout, 150, false));
                    zm.A00.A0H(2300);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public AnonymousClass17 getAdDataBundle() {
        return this.A03;
    }

    public C0530Hu getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC0679Nr getAdDetailsView() {
        return this.A05;
    }

    public C1A getAdInfo() {
        return this.A04;
    }

    public KC getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.O8, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0C(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ZM zm = this;
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = zm.getAdDetailsView().getExpandableLayout();
        char c2 = expandableLayout != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zm = zm;
                    if (zm.A01 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zm = zm;
                    expandableLayout = expandableLayout;
                    zm.A01 = new I6(expandableLayout, 300, expandableLayout.getHeight(), 0);
                    zm.A00.A0I(zm.A01);
                    zm.A00.A0G();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }
}
