package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* loaded from: assets/audience_network.dex */
public final class F0 extends SM {

    @Nullable
    public SU A00;
    public final C01541x A01;

    public F0(C01541x c01541x) {
        super(c01541x.A0B, A00(c01541x));
        this.A01 = c01541x;
    }

    public static InterfaceC01531w A00(C01541x c01541x) {
        return new SZ(c01541x);
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A05() {
        SU su = this.A00;
        if (su != null) {
            su.A0C();
        }
        super.A00.ACz(EnumC01461p.A03);
    }

    public final void A07() {
        this.A00 = new SU(this.A01, this, this.A02);
        this.A00.A0E(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A08(RewardData rewardData) {
        this.A01.A03 = rewardData;
        SU su = this.A00;
        if (su != null) {
            su.A0D(rewardData);
        }
    }

    public final void A09(RewardedVideoAd rewardedVideoAd, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        F0 f0 = this;
        SU su = null;
        char c2 = ((SM) f0).A00.A51() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    f0 = f0;
                    rewardedVideoAd = rewardedVideoAd;
                    f0.A01.A01(rewardedVideoAd);
                    su = f0.A00;
                    if (su == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    su.A0E(str, adExperienceType, z);
                    return;
                case 5:
                    F0 f02 = f0;
                    C01541x c01541x = f02.A01;
                    c01541x.A05 = str;
                    c01541x.A02 = adExperienceType;
                    c01541x.A08 = z;
                    f02.A07();
                    return;
            }
        }
    }

    public final boolean A0A() {
        F0 f0 = this;
        boolean z = false;
        SU su = f0.A00;
        char c2 = su != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return su.A0F();
                case 3:
                    f0 = f0;
                    if (f0.A01.A01 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    f0 = f0;
                    if (C0627Lq.A00() <= f0.A01.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    public final boolean A0B() {
        F0 f0 = this;
        boolean z = false;
        SU su = f0.A00;
        char c2 = su != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return su.A0G();
                case 3:
                    f0 = f0;
                    if (((SM) f0).A00.A5I() != EnumC01461p.A05) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0C(RewardedVideoAd rewardedVideoAd, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        F0 f0 = this;
        SU su = null;
        int iA00 = ((C5O) rewardedVideoShowAdConfig).A00();
        char c2 = ((SM) f0).A00.A52() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    f0 = f0;
                    rewardedVideoAd = rewardedVideoAd;
                    f0.A01.A01(rewardedVideoAd);
                    su = f0.A00;
                    if (su == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return su.A0H(iA00);
                case 5:
                    F0 f02 = f0;
                    f02.A00 = new SU(f02.A01, f02, f02.A02);
                    f02.A00.A0H(iA00);
                    return false;
            }
        }
    }
}
