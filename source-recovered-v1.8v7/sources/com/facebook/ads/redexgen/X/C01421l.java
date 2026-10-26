package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01421l {
    public int A00;

    @Nullable
    public RewardData A01;

    @Nullable
    public EnumC0575Jn A02;

    @Nullable
    public String A03;

    @Nullable
    public String A04;
    public boolean A05;
    public final KA A06;
    public final KB A07;
    public final String A08;

    @Nullable
    public final EnumSet<CacheFlag> A09;
    public final int A0A;
    public final AdPlacementType A0B;

    public C01421l(String str, KB kb, AdPlacementType adPlacementType, KA ka, int i) {
        this(str, kb, adPlacementType, ka, i, EnumSet.of(CacheFlag.NONE));
    }

    public C01421l(String str, KB kb, AdPlacementType adPlacementType, KA ka, int i, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A08 = str;
        this.A0B = adPlacementType;
        this.A06 = ka;
        this.A0A = i;
        this.A09 = enumSet;
        this.A07 = kb;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        C01421l c01421l = this;
        KA ka = null;
        AdPlacementType adPlacementType = c01421l.A0B;
        char c2 = adPlacementType != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return adPlacementType;
                case 3:
                    c01421l = c01421l;
                    ka = c01421l.A06;
                    if (ka != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return AdPlacementType.NATIVE;
                case 5:
                    ka = ka;
                    if (ka != KA.A07) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return AdPlacementType.INTERSTITIAL;
                case 7:
                    return AdPlacementType.BANNER;
            }
        }
    }

    public final KV A01(XI xi, KG kg, @Nullable AdExperienceType adExperienceType) {
        C0613Lb c0613Lb;
        String str = this.A08;
        KA ka = this.A06;
        if (ka != null) {
            c0613Lb = new C0613Lb(ka.getHeight(), this.A06.getWidth());
        } else {
            c0613Lb = null;
        }
        return new KV(xi, str, c0613Lb, this.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, this.A0A, AdSettings.isTestMode(xi), AdSettings.isChildDirected() || AdSettings.isMixedAudience(), kg, C0618Lh.A01(JQ.A0G(xi)), this.A03, adExperienceType);
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(@Nullable RewardData rewardData) {
        this.A01 = rewardData;
    }

    public final void A04(@Nullable EnumC0575Jn enumC0575Jn) {
        this.A02 = enumC0575Jn;
    }

    public final void A05(@Nullable String str) {
        this.A03 = str;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(boolean z) {
        this.A05 = z;
    }
}
