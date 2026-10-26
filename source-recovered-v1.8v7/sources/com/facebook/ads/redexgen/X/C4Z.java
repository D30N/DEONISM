package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4Z {
    public static int A00(C4V c4v, AnonymousClass40 anonymousClass40, View view, View view2, C4G c4g, boolean z) {
        char c2 = c4g.A0W() != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4v = c4v;
                    if (c4v.A03() == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    if (view == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view2 = view2;
                    if (view2 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return 0;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    C4G c4g2 = c4g;
                    return Math.abs(c4g2.A0p(view) - c4g2.A0p(view2)) + 1;
                case '\b':
                    AnonymousClass40 anonymousClass402 = anonymousClass40;
                    int extend = anonymousClass402.A0C(view2) - anonymousClass402.A0F(view);
                    return Math.min(anonymousClass402.A0B(), extend);
            }
        }
    }

    public static int A01(C4V c4v, AnonymousClass40 anonymousClass40, View view, View view2, C4G c4g, boolean z) {
        char c2 = c4g.A0W() != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4v = c4v;
                    if (c4v.A03() == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    if (view == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view2 = view2;
                    if (view2 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return 0;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return c4v.A03();
                case '\b':
                    AnonymousClass40 anonymousClass402 = anonymousClass40;
                    View view3 = view;
                    View view4 = view2;
                    C4G c4g2 = c4g;
                    return (int) (((anonymousClass402.A0C(view4) - anonymousClass402.A0F(view3)) / (Math.abs(c4g2.A0p(view3) - c4g2.A0p(view4)) + 1)) * c4v.A03());
            }
        }
    }

    public static int A02(C4V c4v, AnonymousClass40 anonymousClass40, View view, View view2, C4G c4g, boolean z, boolean z2) {
        int iMin = 0;
        int iMax = 0;
        int iMax2 = 0;
        char c2 = c4g.A0W() != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4v = c4v;
                    if (c4v.A03() == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    if (view == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view2 = view2;
                    if (view2 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return 0;
                case 6:
                    view = view;
                    view2 = view2;
                    c4g = c4g;
                    iMin = Math.min(c4g.A0p(view), c4g.A0p(view2));
                    iMax = Math.max(c4g.A0p(view), c4g.A0p(view2));
                    if (!z2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4v = c4v;
                    iMax2 = Math.max(0, (c4v.A03() - iMax) - 1);
                    c2 = '\b';
                    break;
                case '\b':
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\t':
                    return iMax2;
                case '\n':
                    iMax2 = Math.max(0, iMin);
                    c2 = '\b';
                    break;
                case 11:
                    AnonymousClass40 anonymousClass402 = anonymousClass40;
                    View view3 = view;
                    View view4 = view2;
                    C4G c4g2 = c4g;
                    return Math.round((iMax2 * (Math.abs(anonymousClass402.A0C(view4) - anonymousClass402.A0F(view3)) / (Math.abs(c4g2.A0p(view3) - c4g2.A0p(view4)) + 1))) + (anonymousClass402.A0A() - anonymousClass402.A0F(view3)));
            }
        }
    }
}
