package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class O9 {
    public static O8 A00(OC oc, @Nullable Bundle bundle, boolean z) {
        return A01(oc, bundle, z, false);
    }

    public static O8 A01(final OC oc, @Nullable Bundle bundle, boolean z, boolean z2) {
        Bundle bundle2 = bundle;
        boolean z3 = false;
        O8 c0951Yh = null;
        C1A c1aA0L = oc.A04().A0L();
        double dA00 = O7.A00(c1aA0L);
        boolean zA0L = oc.A04().A0L().A0L();
        final boolean zA05 = O7.A05(oc.A00(), oc.A01(), dA00);
        AbstractC01100f abstractC01100fA00 = C01110g.A00(oc.A05(), oc.A06(), "", Uri.parse(oc.A04().A0L().A0F().A04()), new HashMap());
        char c2 = zA0L ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC01100fA00 = abstractC01100fA00;
                    if (!(abstractC01100fA00 instanceof C0473Fn)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    oc = oc;
                    c0951Yh = YY.A09(oc, z2);
                    c2 = 4;
                    break;
                case 4:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    oc = oc;
                    bundle2 = bundle2;
                    c1aA0L = c1aA0L;
                    c0951Yh.A0a(c1aA0L, oc.A04().A0P(), dA00, bundle2);
                    c2 = 6;
                    break;
                case 6:
                    return c0951Yh;
                case 7:
                    c1aA0L = c1aA0L;
                    if (!TextUtils.isEmpty(c1aA0L.A0D().A08())) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    oc = oc;
                    c0951Yh = new C03289d(oc);
                    c2 = 4;
                    break;
                case '\t':
                    c1aA0L = c1aA0L;
                    if (!TextUtils.isEmpty(c1aA0L.A0D().A08())) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    oc = oc;
                    if (!JQ.A1R(oc.A05())) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    oc = oc;
                    c0951Yh = new ZM(oc, zA05) { // from class: com.facebook.ads.redexgen.X.9e
                        public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
                        public final View A00;
                        public final boolean A01;

                        {
                            super(oc, true);
                            this.A01 = zA05;
                            this.A00 = oc.A02();
                            A0f();
                            if (this.A01) {
                                addView(oc.A02(), new RelativeLayout.LayoutParams(-1, -1));
                            } else {
                                FrameLayout frameLayout = new FrameLayout(oc.A05());
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                layoutParams.addRule(2, getAdDetailsView().getId());
                                frameLayout.setLayoutParams(layoutParams);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                                layoutParams2.gravity = 17;
                                layoutParams2.setMargins(O8.A09, 0, O8.A09, 0);
                                frameLayout.addView(this.A00, layoutParams2);
                                addView(frameLayout);
                            }
                            getAdDetailsView().bringToFront();
                        }

                        @Override // com.facebook.ads.redexgen.X.O8
                        public final boolean A0M() {
                            C03299e c03299e = this;
                            boolean z4 = false;
                            char c3 = c03299e.A01 ? (char) 2 : (char) 5;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        c03299e = c03299e;
                                        if (!super.A0P()) {
                                            c3 = 5;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        z4 = true;
                                        c3 = 4;
                                        break;
                                    case 4:
                                        return z4;
                                    case 5:
                                        z4 = false;
                                        c3 = 4;
                                        break;
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.O8
                        public final boolean A0P() {
                            C03299e c03299e = this;
                            boolean z4 = false;
                            char c3 = c03299e.A01 ? (char) 2 : (char) 5;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        c03299e = c03299e;
                                        if (!super.A0P()) {
                                            c3 = 5;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        z4 = true;
                                        c3 = 4;
                                        break;
                                    case 4:
                                        return z4;
                                    case 5:
                                        z4 = false;
                                        c3 = 4;
                                        break;
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.ZM, com.facebook.ads.redexgen.X.O8
                        public final void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle3) {
                            C03299e c03299e = this;
                            super.A0a(c1a, str, d2, bundle3);
                            char c3 = !c03299e.A01 ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        if (d2 <= 0.0d) {
                                            c3 = 4;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        c03299e = c03299e;
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((A02 - (O8.A09 * 2)) / d2));
                                        layoutParams.gravity = 17;
                                        layoutParams.setMargins(O8.A09, 0, O8.A09, 0);
                                        c03299e.A00.setLayoutParams(layoutParams);
                                        c3 = 4;
                                        break;
                                    case 4:
                                        return;
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.O8
                        public final boolean A0c() {
                            return this.A01;
                        }
                    };
                    c2 = 4;
                    break;
                case '\f':
                    if (!zA05) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    oc = oc;
                    if (oc.A00() != 2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    z3 = true;
                    c2 = 15;
                    break;
                case 15:
                    oc = oc;
                    c0951Yh = new C0952Yi(oc, z3);
                    c2 = 4;
                    break;
                case 16:
                    z3 = false;
                    c2 = 15;
                    break;
                case 17:
                    oc = oc;
                    c0951Yh = new C0951Yh(oc, O7.A03(dA00));
                    c2 = 4;
                    break;
            }
        }
    }
}
