package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0450Eo extends TM {
    public C0450Eo(C02304x c02304x) {
        super(c02304x);
    }

    @Override // com.facebook.ads.redexgen.X.TM, com.facebook.ads.redexgen.X.MQ
    public final void A3r(String rewardedVideoError) {
        C0450Eo c0450Eo = this;
        String strA02 = null;
        char c2 = c0450Eo.A00.get() == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0450Eo = c0450Eo;
                    rewardedVideoError = rewardedVideoError;
                    c0450Eo.A00.get().A0D(rewardedVideoError);
                    String strA022 = PE.A08.A02();
                    strA02 = PE.A09.A02();
                    if (!rewardedVideoError.equals(strA022)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0450Eo.A00.get().finish(11);
                    return;
                case 5:
                    rewardedVideoError = rewardedVideoError;
                    strA02 = strA02;
                    if (!rewardedVideoError.equals(strA02)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0450Eo = c0450Eo;
                    c0450Eo.A00.get().finish(12);
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.TM, com.facebook.ads.redexgen.X.MQ
    public final void A3s(String str, C9A c9a) {
        super.A3s(str, c9a);
    }
}
