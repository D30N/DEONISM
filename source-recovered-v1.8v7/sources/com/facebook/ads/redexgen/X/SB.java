package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SB extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0768Rd A00;
    public final /* synthetic */ FQ A01;
    public final /* synthetic */ Map A02;

    public SB(FQ fq, Map map, C0768Rd c0768Rd) {
        this.A01 = fq;
        this.A02 = map;
        this.A00 = c0768Rd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        SB sb = this;
        sb.A01.A0T(sb.A02);
        sb.A01.A0N(sb.A00);
        char c2 = JQ.A0g(sb.A01.A0C) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    sb = sb;
                    sb.A01.A01 = null;
                    K5 k5 = new K5(AdErrorType.INTERSTITIAL_AD_TIMEOUT, "");
                    sb.A01.A0C.A0A().A4Y(k5.A04().getErrorCode(), k5.A05());
                    sb.A01.A07.A0G(k5);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    sb = sb;
                    sb.A01.A0M();
                    c2 = 3;
                    break;
            }
        }
    }
}
