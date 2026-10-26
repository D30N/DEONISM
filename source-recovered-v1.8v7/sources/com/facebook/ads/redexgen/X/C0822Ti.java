package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0822Ti extends AbstractC01632g {
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ C5C A01;

    public C0822Ti(C5C c5c) {
        this.A01 = c5c;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01632g
    public final int A05() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01632g
    public final int A06(Object obj) {
        int i = 0;
        int iIndexOf = this.A00.indexOf(obj);
        char c2 = iIndexOf >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = iIndexOf;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = -2;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01632g
    public final Object A08(ViewGroup viewGroup, int i) {
        C0822Ti c0822Ti = this;
        View viewRender = null;
        char c2 = c0822Ti.A01.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0822Ti = c0822Ti;
                    viewRender = c0822Ti.A01.A01.createView(c0822Ti.A00.get(i), i);
                    c2 = 3;
                    break;
                case 3:
                    View view = viewRender;
                    viewGroup.addView(view);
                    return view;
                case 4:
                    c0822Ti = c0822Ti;
                    if (c0822Ti.A01.A02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0822Ti = c0822Ti;
                    viewRender = NativeAdView.render(c0822Ti.A01.A06, c0822Ti.A00.get(i), c0822Ti.A01.A02, c0822Ti.A01.A03);
                    c2 = 3;
                    break;
                case 6:
                    c0822Ti = c0822Ti;
                    viewRender = NativeAdView.render(c0822Ti.A01.A06, c0822Ti.A00.get(i), c0822Ti.A01.A03);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01632g
    public final void A0B(ViewGroup viewGroup, int i, Object obj) {
        C0822Ti c0822Ti = this;
        char c2 = i < c0822Ti.A00.size() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0822Ti = c0822Ti;
                    if (c0822Ti.A01.A01 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0822Ti = c0822Ti;
                    obj = obj;
                    c0822Ti.A01.A01.destroyView(c0822Ti.A00.get(i), (View) obj);
                    c2 = 4;
                    break;
                case 4:
                    viewGroup.removeView((View) obj);
                    return;
                case 5:
                    c0822Ti = c0822Ti;
                    c0822Ti.A00.get(i).unregisterView();
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01632g
    public final boolean A0C(View view, Object obj) {
        boolean z = false;
        char c2 = view == obj ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0D() {
        C0822Ti c0822Ti = this;
        c0822Ti.A00.clear();
        int iMin = Math.min(c0822Ti.A01.A00, c0822Ti.A01.A04.getUniqueNativeAdCount());
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iMin) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0822Ti = c0822Ti;
                    NativeAd nativeAdNextNativeAd = c0822Ti.A01.A04.nextNativeAd();
                    C1141cR.A0J(nativeAdNextNativeAd.getInternalNativeAd()).A1R(true);
                    c0822Ti.A00.add(nativeAdNextNativeAd);
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    c0822Ti.A09();
                    return;
            }
        }
    }
}
