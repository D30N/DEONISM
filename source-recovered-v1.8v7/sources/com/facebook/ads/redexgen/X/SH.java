package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SH extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0464Fc A00;
    public final /* synthetic */ F7 A01;
    public final /* synthetic */ Map A02;

    public SH(F7 f7, Map map, C0464Fc c0464Fc) {
        this.A01 = f7;
        this.A02 = map;
        this.A00 = c0464Fc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A01.A0T(this.A02);
        this.A01.A0N(this.A00);
        this.A01.A01 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A01.A0C.A0A().A4Y(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A01.A07.A0G(new K5(adErrorType, ""));
    }
}
