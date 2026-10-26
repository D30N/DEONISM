package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.ads.AdSize;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InstreamVideoAdListener;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.56, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass56 implements InstreamVideoAdViewApi {
    public static byte[] A0E;

    @Nullable
    public Bundle A00;

    @Nullable
    public View A01;

    @Nullable
    public InstreamVideoAdListener A02;

    @Nullable
    public C0471Fl A03;

    @Nullable
    public FY A04;
    public TZ A05;

    @Nullable
    public C0674Nm A06;

    @Nullable
    public String A07;

    @Nullable
    public String A08;
    public boolean A09;
    public final AdSize A0A;
    public final InstreamVideoAdView A0B;
    public final XI A0C;
    public final String A0D;

    static {
        A0D();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0D() {
        A0E = new byte[]{-26, -30, -41, -39, -37, -29, -37, -28, -22, -65, -70, -73, -70, -87, -65, -48, -69, 8, 11, 8, 23, 27, 12, 25};
    }

    public AnonymousClass56(InstreamVideoAdView instreamVideoAdView, Context context, Bundle bundle) {
        this(instreamVideoAdView, context, bundle.getString(A09(0, 11, 52)), (AdSize) bundle.get(A09(11, 6, 20)));
        this.A00 = bundle;
    }

    public AnonymousClass56(InstreamVideoAdView instreamVideoAdView, Context context, String str, AdSize adSize) {
        this.A09 = false;
        this.A0B = instreamVideoAdView;
        this.A0C = AnonymousClass53.A02(context);
        this.A0D = str;
        this.A0A = adSize;
        this.A05 = new TZ(this);
        this.A04 = A04();
    }

    private FY A04() {
        C01421l c01421l = new C01421l(this.A0D, KB.A03, AdPlacementType.INSTREAM, KA.A02(this.A0A), 1);
        c01421l.A05(this.A07);
        c01421l.A06(this.A08);
        this.A04 = new FY(this.A0C, c01421l);
        this.A04.A0P(this.A05);
        return this.A04;
    }

    private void A0C() {
        FY fy = this.A04;
        if (fy != null) {
            fy.A0U(true);
            this.A04 = null;
            this.A04 = A04();
            this.A03 = null;
            this.A09 = false;
            this.A0B.removeAllViews();
        }
    }

    private void A0E(@Nullable String str) {
        FY fy = this.A04;
        if (fy == null) {
            return;
        }
        if (this.A00 != null) {
            C0471Fl c0471Fl = (C0471Fl) new C01230s().A00(AdPlacementType.INSTREAM);
            this.A03 = c0471Fl;
            XI xi = this.A0C;
            c0471Fl.A0F(xi, new C0780Rp(this, this.A02, this.A0B, this.A01, xi, this.A08), this.A04.A09, this.A00.getBundle(A09(17, 7, 101)), EnumSet.of(CacheFlag.NONE));
            return;
        }
        fy.A0R(str);
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final InstreamVideoAdView.InstreamVideoLoadConfigBuilder buildLoadAdConfig() {
        return new C0570Ji(this);
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final void destroy() {
        AnonymousClass56 anonymousClass56 = this;
        View view = null;
        char c2 = anonymousClass56.A06 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass56 = anonymousClass56;
                    if (!JQ.A0m(anonymousClass56.A0C)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass56 = anonymousClass56;
                    anonymousClass56.A06.A07();
                    view = anonymousClass56.A01;
                    if (view == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass56 = anonymousClass56;
                    view = view;
                    view.getOverlay().remove(anonymousClass56.A06);
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass56.A0C();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0D;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    @Nullable
    public final Bundle getSaveInstanceState() {
        AnonymousClass56 anonymousClass56 = this;
        AbstractC0775Rk abstractC0775Rk = null;
        AbstractC0775Rk abstractC0775Rk2 = null;
        Bundle saveInstanceState = null;
        FY fy = anonymousClass56.A04;
        char c2 = fy == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Bundle) null;
                case 3:
                    anonymousClass56 = anonymousClass56;
                    abstractC0775Rk2 = anonymousClass56.A03;
                    if (abstractC0775Rk2 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC0775Rk2 = abstractC0775Rk2;
                    abstractC0775Rk = abstractC0775Rk2;
                    if (abstractC0775Rk != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return (Bundle) null;
                case 6:
                    fy = fy;
                    abstractC0775Rk2 = (AbstractC0775Rk) fy.A02;
                    c2 = 4;
                    break;
                case 7:
                    abstractC0775Rk = abstractC0775Rk;
                    saveInstanceState = abstractC0775Rk.getSaveInstanceState();
                    if (saveInstanceState != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return (Bundle) null;
                case '\t':
                    AnonymousClass56 anonymousClass562 = anonymousClass56;
                    Bundle adapterState = new Bundle();
                    adapterState.putBundle(A09(17, 7, 101), saveInstanceState);
                    adapterState.putString(A09(0, 11, 52), anonymousClass562.A0D);
                    adapterState.putSerializable(A09(11, 6, 20), anonymousClass562.A0A);
                    Bundle bundle = adapterState;
                    return bundle;
            }
        }
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = false;
        FY fy = this.A04;
        char c2 = fy != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    fy = fy;
                    if (!fy.A0V()) {
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
                    this.A0C.A0A().A4X(z);
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final boolean isAdLoaded() {
        return this.A09;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final void loadAd() {
        A0E(null);
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final void loadAd(InstreamVideoAdView.InstreamVideoLoadAdConfig instreamVideoLoadAdConfig) {
        A0E(((C0570Ji) instreamVideoLoadAdConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        A0E(str);
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final void setAdListener(@Nullable InstreamVideoAdListener instreamVideoAdListener) {
        this.A02 = instreamVideoAdListener;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A07 = extraHints.getHints();
        this.A08 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final void setIsAdLoaded(boolean z) {
        this.A09 = z;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final boolean show() {
        AnonymousClass56 anonymousClass56 = this;
        C0471Fl c0471Fl = null;
        char c2 = anonymousClass56.A09 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass56 = anonymousClass56;
                    if (anonymousClass56.A04 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass56 = anonymousClass56;
                    if (anonymousClass56.A03 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C0600Kn.A00(new TT(anonymousClass56));
                    return false;
                case 5:
                    anonymousClass56 = anonymousClass56;
                    c0471Fl = anonymousClass56.A03;
                    if (c0471Fl == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0471Fl = c0471Fl;
                    c0471Fl.A0E();
                    c2 = 7;
                    break;
                case 7:
                    anonymousClass56.A09 = false;
                    return true;
                case '\b':
                    anonymousClass56 = anonymousClass56;
                    anonymousClass56.A04.A0I();
                    c2 = 7;
                    break;
            }
        }
    }
}
