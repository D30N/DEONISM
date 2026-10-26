package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5M implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public final RewardedVideoAd A00;
    public final C01541x A01;
    public final F0 A02;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-37, -34, -48, -45, -80, -45, -37, -18, 0, -22, -5, -19, -18, -19, -87, -1, -14, -19, -18, -8, -87, -22, -19, -87, -4, -15, -8, 0, -87, -20, -22, -11, -11, -18, -19, -56, -37, -19, -41, -24, -38, -37, -38, -106, -20, -33, -38, -37, -27, -106, -41, -38, -106, -30, -27, -41, -38, -106, -24, -37, -25, -21, -37, -23, -22, -37, -38, -34, 12, -34, 12, 15, -34, -36, 13, 42, 45, 31, 34, -1, 34, 4, 48, 45, 43, 0, 39, 34, -93, -56, -50, -65, -52, -56, -69, -58, 122, -65, -52, -52, -55, -52, -120, 100, -38, -44, 5, -42, -38, -39, -42, 9, -9, 10, 28, 6, 23, 9, 10, 9, -59, 27, 14, 9, 10, 20, -59, 6, 9, -59, 9, 10, 24, 25, 23, 20, 30, 10, 9, -62, -62, -13, -66, -17, -65, -15, -13, -43, -54, -47, -39, -25, -31, 17, -29, -30, -32, -27, -70, -69, -55, -54, -56, -59, -49, -23, -66, -68, -21, -23, -65, -18, -50, -56, -56, -5, -51, -7, -5, -2, -108, -60, -108, -102, -60, -57, -104, -57, -40, -37, -38, -43, 8, 8, -42, 6};
    }

    public C5M(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        this.A00 = rewardedVideoAd;
        this.A03 = AnonymousClass53.A05(context);
        this.A03.A0A().A2i(AdPlacementType.REWARDED_VIDEO.toString());
        this.A01 = new C01541x(this.A03, str, this.A00);
        this.A03.A0C(this);
        this.A02 = new F0(this.A01);
    }

    private final void A02(@Nullable String str, boolean z) {
        A03(str, null, z);
    }

    public final void A03(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        C5M c5m = this;
        char c2 = str == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c5m = c5m;
                    c5m.A03.A0A().A2f();
                    c2 = 3;
                    break;
                case 3:
                    C5M c5m2 = c5m;
                    c5m2.A02.A09(c5m2.A00, str, adExperienceType, z);
                    c5m2.A03.A0A().A2d();
                    return;
                case 4:
                    c5m = c5m;
                    c5m.A03.A0A().A2e();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.FullScreenAd
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return new C5N(this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return new C5O();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        KJ.A05(A00(158, 7, 2), A00(112, 27, 81), A00(67, 8, 86));
        if (JQ.A1A(this.A03)) {
            return;
        }
        this.A02.A05();
        this.A03.A0A().A2j();
    }

    public final void finalize() {
        this.A02.A04();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0C;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = this.A02.A0A();
        this.A03.A0A().A4X(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0B();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        KJ.A05(A00(0, 6, 27), A00(35, 32, 34), A00(180, 8, 13));
        A02(null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C5N) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(boolean z) {
        KJ.A05(A00(0, 6, 27), A00(35, 32, 34), A00(151, 7, 92));
        A02(null, z);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        KJ.A05(A00(75, 13, 106), A00(35, 32, 34), A00(104, 8, 79));
        A02(str, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAdFromBid(String str, boolean z) {
        KJ.A05(A00(75, 13, 106), A00(35, 32, 34), A00(139, 8, 58));
        A02(str, z);
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(88, 16, 6) + C0618Lh.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void setAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        boolean z = false;
        this.A01.A04 = rewardedVideoAdListener;
        C0S c0sA0A = this.A03.A0A();
        char c2 = rewardedVideoAdListener != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c0sA0A.A2b(z);
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void setRewardData(RewardData rewardData) {
        this.A02.A08(rewardData);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        KJ.A05(A00(147, 4, 14), A00(6, 29, 53), A00(188, 8, 81));
        return show(-1);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(int i) {
        KJ.A05(A00(147, 4, 14), A00(6, 29, 53), A00(165, 7, 52));
        this.A03.A0A().A2o();
        boolean zA0C = this.A02.A0C(this.A00, new C5O().withAppOrientation(i).build());
        this.A03.A0A().A2n(zA0C);
        return zA0C;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        KJ.A05(A00(147, 4, 14), A00(6, 29, 53), A00(172, 8, 68));
        this.A03.A0A().A2o();
        boolean zA0C = this.A02.A0C(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0A().A2n(zA0C);
        return zA0C;
    }
}
