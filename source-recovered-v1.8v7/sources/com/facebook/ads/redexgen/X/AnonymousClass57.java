package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.57, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass57 implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public final InterstitialAd A00;
    public final C01501t A01;
    public final F1 A02;
    public final XI A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-61, -24, -18, -33, -20, -19, -18, -29, -18, -29, -37, -26, -102, -37, -34, -102, -19, -30, -23, -15, -102, -35, -37, -26, -26, -33, -34, 3, 40, 46, 31, 44, 45, 46, 35, 46, 35, 27, 38, -38, 27, 30, -38, 38, 41, 27, 30, -38, 44, 31, 43, 47, 31, 45, 46, 31, 30, -75, -76, -75, -78, -28, -26, -70, -70, -104, -67, -61, -76, -63, -62, -61, -72, -61, -72, -80, -69, 111, -80, -77, 111, -77, -76, -62, -61, -63, -66, -56, -76, -77, 11, 48, 54, 39, 52, 48, 35, 46, -30, 39, 52, 52, 49, 52, -16, -52, -8, -9, 43, -3, 41, 41, 42, -4, 8, -3, 4, 12, 48, 49, 63, 64, 62, 59, 69, -79, -26, -28, -75, -27, -30, -71, -77, -4, 7, -28, 7, -7, -4, -39, -4};
    }

    public AnonymousClass57(Context context, String str, InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        this.A03 = AnonymousClass53.A03(context);
        this.A03.A0A().A2i(AdPlacementType.INTERSTITIAL.toString());
        this.A01 = new C01501t(this.A03, interstitialAd, str);
        this.A03.A0C(this);
        this.A02 = new F1(this.A01);
    }

    public final void A02(RewardData rewardData) {
        this.A01.A0E(rewardData);
    }

    public final void A03(EnumSet<CacheFlag> enumSet, @Nullable String str) {
        AnonymousClass57 anonymousClass57 = this;
        KJ.A05(A00(133, 8, 75), A00(27, 30, 109), A00(57, 8, 52));
        char c2 = str == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass57 = anonymousClass57;
                    anonymousClass57.A03.A0A().A2f();
                    c2 = 3;
                    break;
                case 3:
                    AnonymousClass57 anonymousClass572 = anonymousClass57;
                    anonymousClass572.A02.A08(anonymousClass572.A00, enumSet, str);
                    anonymousClass572.A03.A0A().A2d();
                    return;
                case 4:
                    anonymousClass57 = anonymousClass57;
                    anonymousClass57.A03.A0A().A2e();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new AnonymousClass58(this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new AnonymousClass59();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KJ.A05(A00(k.AppCompatTheme_windowFixedHeightMajor, 7, 127), A00(65, 25, 2), A00(106, 8, k.AppCompatTheme_windowMinWidthMajor));
        if (JQ.A1A(this.A03)) {
            return;
        }
        this.A02.A05();
        this.A03.A0A().A2j();
    }

    public final void finalize() {
        this.A02.A04();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A09();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA09 = this.A02.A09();
        this.A03.A0A().A4X(zA09);
        return zA09;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        loadAd(CacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((AnonymousClass58) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(EnumSet<CacheFlag> enumSet) {
        A03(enumSet, null);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        A03(CacheFlag.ALL, str);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAdFromBid(EnumSet<CacheFlag> cacheFlags, String str) {
        A03(cacheFlags, str);
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A02() != null) {
            this.A01.A02().onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(90, 16, k.AppCompatTheme_windowActionModeOverlay) + C0618Lh.A03(this.A03, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void setAdListener(InterstitialAdListener interstitialAdListener) {
        boolean z = false;
        C0S c0sA0A = this.A03.A0A();
        char c2 = interstitialAdListener != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c0sA0A.A2b(z);
                    this.A01.A0D(interstitialAdListener);
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0H(extraHints.getHints());
        this.A01.A0I(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void setRewardedAdListener(RewardedAdListener rewardedAdListener) {
        this.A01.A0F(rewardedAdListener);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        KJ.A05(A00(k.AppCompatTheme_viewInflaterClass, 4, 72), A00(0, 27, 45), A00(125, 8, 51));
        this.A03.A0A().A2o();
        boolean zA0B = this.A02.A0B(this.A00, new AnonymousClass59());
        this.A03.A0A().A2n(zA0B);
        return zA0B;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0A().A2o();
        boolean zA0B = this.A02.A0B(this.A00, interstitialShowAdConfig);
        this.A03.A0A().A2n(zA0B);
        return zA0B;
    }
}
