package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.1x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01541x {
    public int A00 = -1;
    public long A01 = -1;

    @Nullable
    public AdExperienceType A02;

    @Nullable
    public RewardData A03;

    @Nullable
    public RewardedVideoAdListener A04;

    @Nullable
    public String A05;

    @Nullable
    public String A06;

    @Nullable
    public String A07;
    public boolean A08;

    @Nullable
    public RewardedVideoAd A09;
    public WeakReference<RewardedVideoAd> A0A;
    public final XI A0B;
    public final String A0C;

    public C01541x(XI xi, String str, @Nullable RewardedVideoAd rewardedVideoAd) {
        this.A0B = xi;
        this.A0C = str;
        this.A09 = rewardedVideoAd;
        this.A0A = new WeakReference<>(rewardedVideoAd);
    }

    @Nullable
    public final RewardedVideoAd A00() {
        RewardedVideoAd rewardedVideoAd = this.A09;
        return rewardedVideoAd != null ? rewardedVideoAd : this.A0A.get();
    }

    public final void A01(@Nullable RewardedVideoAd rewardedVideoAd) {
        C01541x c01541x = this;
        char c2 = rewardedVideoAd == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01541x = c01541x;
                    if (!JQ.A0h(c01541x.A0B)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c01541x.A09 = rewardedVideoAd;
                    return;
            }
        }
    }
}
