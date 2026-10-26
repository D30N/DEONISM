package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.4s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02254s implements AdViewApi {
    public static byte[] A0D;
    public long A00;

    @Nullable
    public View A01;

    @Nullable
    public AdListener A02;

    @Nullable
    public FZ A03;
    public C0674Nm A04;

    @Nullable
    public String A05;

    @Nullable
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final EY A0A;
    public final KA A0B;
    public final String A0C;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0D = new byte[]{-44, -42, -43, -45, 2, -49, -42, -47, -26, 21, 18, 18, -29, -28, -22, -29, -49, -53, -45, 0, -45, -49, -49, -45, -4, -1, -15, -12, -47, -12, -42, -11, 2, 2, -7, 6, -76, -11, -8, -76, -8, -7, 7, 8, 6, 3, 13, -7, -8, 28, 58, 71, 71, 72, 77, -7, 63, 66, 71, 61, -7, 58, -7, 77, 62, 70, 73, 69, 58, 77, 62, -7, 77, 65, 58, 77, -7, 69, 72, 58, 61, -7, 59, 66, 61, -7, 0, -2, 76, 0, -33, -30, -47, -25, -8, -29, 44, 47, 33, 36, 1, 36, 6, 50, 47, 45, 2, 41, 36, -85, -82, -82, -88, -37, -42, -85, -90, 13, 14, 28, 29, 27, 24, 34, -31, 0, 13, 13, 4, 17, -65, 0, 3, -65, 11, 14, 0, 3, -65, 17, 4, 16, 20, 4, 18, 19, 4, 3};
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C02254s(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = KA.A02(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = AnonymousClass53.A06(context);
            this.A0A.A0A().A2i(AdPlacementType.BANNER.toString());
            C01421l c01421l = new C01421l(str, KD.A02(this.A0B), AdPlacementType.BANNER, KA.A02(adSize), 1);
            c01421l.A05(this.A05);
            c01421l.A06(this.A06);
            this.A03 = new FZ(this.A0A, c01421l);
            this.A03.A0P(new TS(this));
            return;
        }
        throw new IllegalArgumentException(A01(90, 6, 15));
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C02254s(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws K6 {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0A().A3c();
    }

    public static AdSize A00(String str) throws K6 {
        KB kbA00 = KG.A00(str);
        if (kbA00 != null) {
            KG.A03(kbA00);
            return KD.A00(kbA00);
        }
        throw new K6(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(49, 41, 106), str));
    }

    private void A03(@Nullable String str) {
        C02254s c02254s = this;
        FZ fz = null;
        c02254s.A00 = System.currentTimeMillis();
        char c2 = str == null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c02254s = c02254s;
                    c02254s.A0A.A0A().A2f();
                    c2 = 3;
                    break;
                case 3:
                    c02254s = c02254s;
                    fz = c02254s.A03;
                    if (fz == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    fz = fz;
                    fz.A0R(str);
                    c2 = 5;
                    break;
                case 5:
                    c02254s.A0A.A0A().A2d();
                    return;
                case 6:
                    c02254s = c02254s;
                    c02254s.A0A.A0A().A2e();
                    c2 = 3;
                    break;
            }
        }
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    @Nullable
    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    @Nullable
    public final FZ A08() {
        return this.A03;
    }

    public final EY A09() {
        return this.A0A;
    }

    public final KA A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        C02254s c02254s = this;
        C0703Op c0703OpA01 = null;
        String str = null;
        boolean z = false;
        RI riA0A = c02254s.A0A.A0A();
        char c2 = c02254s.A06 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c02254s = c02254s;
                    riA0A = riA0A;
                    riA0A.A3p(z);
                    str = c02254s.A06;
                    if (str == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02254s = c02254s;
                    str = str;
                    c0703OpA01 = C0702Oo.A01(c02254s.A0A, str);
                    if (c0703OpA01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    relativeLayout = relativeLayout;
                    view = view;
                    c0703OpA01 = c0703OpA01;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    relativeLayout.addView(c0703OpA01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0C(C0674Nm c0674Nm) {
        this.A04 = c0674Nm;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C0569Jh(this);
    }

    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.facebook.ads.AdListener] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.facebook.ads.Ad
    public final void destroy() {
        C02254s c02254s = this;
        View view = null;
        KJ.A05(A01(k.AppCompatTheme_windowActionModeOverlay, 7, 58), A01(30, 19, 37), A01(16, 8, 44));
        c02254s.A0A.A0A().A2j();
        FZ fz = c02254s.A03;
        ?? r2 = 0;
        char c2 = fz != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02254s = c02254s;
                    fz = fz;
                    r2 = 0;
                    fz.A0U(true);
                    c02254s.A03 = null;
                    c2 = 3;
                    break;
                case 3:
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02254s = c02254s;
                    if (c02254s.A04 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02254s = c02254s;
                    if (!JQ.A0m(c02254s.A08.getContext())) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02254s = c02254s;
                    c02254s.A04.A07();
                    view = c02254s.A01;
                    if (view == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c02254s = c02254s;
                    view = view;
                    view.getOverlay().remove(c02254s.A04);
                    c2 = '\b';
                    break;
                case '\b':
                    C02254s c02254s2 = c02254s;
                    c02254s2.A08.removeAllViews();
                    c02254s2.A01 = r2;
                    c02254s2.A02 = r2;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = false;
        FZ fz = this.A03;
        char c2 = fz != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    fz = fz;
                    if (!fz.A0V()) {
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
                    this.A0A.A0A().A4X(z);
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        KJ.A05(A01(24, 6, 33), A01(k.AppCompatTheme_windowNoTitle, 24, 48), A01(0, 8, 48));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        KJ.A05(A01(24, 6, 33), A01(k.AppCompatTheme_windowNoTitle, 24, 48), A01(109, 8, 6));
        A03(((C0569Jh) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        KJ.A05(A01(96, 13, 81), A01(k.AppCompatTheme_windowNoTitle, 24, 48), A01(8, 8, 66));
        A03(str);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            KD.A03(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void setAdListener(@Nullable AdListener adListener) {
        boolean z = false;
        RI riA0A = this.A0A.A0A();
        char c2 = adListener != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    riA0A.A2b(z);
                    this.A02 = adListener;
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
    }
}
