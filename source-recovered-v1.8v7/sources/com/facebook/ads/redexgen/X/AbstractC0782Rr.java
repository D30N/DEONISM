package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0782Rr implements InterfaceC01180n {
    public int A00;
    public RewardData A01;

    public abstract int A0A();

    public abstract boolean A0B();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(RewardData rewardData) {
        this.A01 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final AdPlacementType A6j() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
