package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1137cN extends Q0 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C0770Rf A01;
    public final /* synthetic */ C1141cR A02;
    public final /* synthetic */ boolean A03;

    public C1137cN(C1141cR c1141cR, View view, boolean z, C0770Rf c0770Rf) {
        this.A02 = c1141cR;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c0770Rf;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A00() {
        this.A02.A0a.A06();
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A02() {
        this.A02.A0a.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        C1137cN c1137cN = this;
        Drawable loadedNativeBannerIconDrawable = null;
        View view = null;
        View adContentsView = null;
        View view2 = null;
        ImageView imageView = null;
        View adContentsView2 = null;
        c1137cN.A02.A0a.A0C();
        char c2 = JQ.A18(c1137cN.A02.A0w()) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1137cN = c1137cN;
                    view = c1137cN.A00;
                    if (!(view instanceof AdNativeComponentView)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    adContentsView = ((AdNativeComponentView) view).getAdContentsView();
                    if (!(adContentsView instanceof PA)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    adContentsView = adContentsView;
                    if (!((PA) adContentsView).A03(1)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    C1137cN c1137cN2 = c1137cN;
                    c1137cN2.A02.A0N.A0U();
                    c1137cN2.A02.A0a.A08();
                    return;
                case 6:
                    c1137cN = c1137cN;
                    if (!JQ.A19(c1137cN.A02.A0w())) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1137cN = c1137cN;
                    view2 = c1137cN.A00;
                    if (!(view2 instanceof AdNativeComponentView)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    view2 = view2;
                    adContentsView2 = ((AdNativeComponentView) view2).getAdContentsView();
                    if (!(adContentsView2 instanceof PA)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    adContentsView2 = adContentsView2;
                    if (!((PA) adContentsView2).A02()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    C1137cN c1137cN3 = c1137cN;
                    c1137cN3.A02.A0N.A0U();
                    c1137cN3.A02.A0a.A09();
                    return;
                case 11:
                    c1137cN = c1137cN;
                    if (!c1137cN.A03) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1137cN = c1137cN;
                    imageView = (ImageView) c1137cN.A00;
                    loadedNativeBannerIconDrawable = c1137cN.A02.A01;
                    if (loadedNativeBannerIconDrawable == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    imageView = imageView;
                    loadedNativeBannerIconDrawable = loadedNativeBannerIconDrawable;
                    C1141cR.A0Y(loadedNativeBannerIconDrawable, imageView);
                    c2 = 14;
                    break;
                case 14:
                    c1137cN = c1137cN;
                    c1137cN.A02.A0a.A0D(c1137cN.A02.A0Y, c1137cN.A01.A0Q());
                    c1137cN.A02.A0N.A0W();
                    if (c1137cN.A02.A0R == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1137cN = c1137cN;
                    if (c1137cN.A02.A0R.get() == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c1137cN = c1137cN;
                    ((Q0) c1137cN.A02.A0R.get()).A03();
                    c2 = 17;
                    break;
                case 17:
                    c1137cN = c1137cN;
                    if (!c1137cN.A02.A0b.A07()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 18:
                    c1137cN = c1137cN;
                    c1137cN.A02.A0b.A05();
                    c1137cN.A02.A0a.A05();
                    if (c1137cN.A02.A08 == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1137cN = c1137cN;
                    if (c1137cN.A02.A03 == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c1137cN = c1137cN;
                    if (c1137cN.A02.A05 != null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    return;
                case 22:
                    c1137cN = c1137cN;
                    c1137cN.A02.A08.A08(c1137cN.A02.A03);
                    c1137cN.A02.A08.A07(c1137cN.A02.A05);
                    c1137cN.A02.A08.A0B(c1137cN.A02.A0H);
                    c1137cN.A02.A08.A0E(c1137cN.A02.A0S);
                    c1137cN.A02.A08.A0I(c1137cN.A02.A0V);
                    c1137cN.A02.A08.A0H(c1137cN.A02.A0U);
                    c1137cN.A02.A08.A0F(c1137cN.A02.A0l());
                    c1137cN.A02.A08.A09(c1137cN.A02.A07);
                    c1137cN.A02.A08.A0G(c1137cN.A02.A0T);
                    c1137cN.A02.A08.A0A(N1.A00(c1137cN.A02.A06));
                    c1137cN.A02.A08.A0C(c1137cN.A02.A0O);
                    c1137cN.A02.A08.A0J(c1137cN.A03);
                    c1137cN.A02.A08.A02();
                    c2 = 24;
                    break;
                case 23:
                    c1137cN = c1137cN;
                    c1137cN.A02.A0a.A04();
                    c2 = 24;
                    break;
                case 24:
                    return;
                case 25:
                    C1137cN c1137cN4 = c1137cN;
                    c1137cN4.A02.A0N.A0U();
                    c1137cN4.A02.A0a.A07();
                    return;
            }
        }
    }
}
