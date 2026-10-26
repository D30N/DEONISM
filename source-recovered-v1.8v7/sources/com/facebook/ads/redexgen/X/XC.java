package com.facebook.ads.redexgen.X;

import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class XC extends AbstractC02766s<C6O> {
    public XC(long j, @Nullable C02746q c02746q, C6O c6o) {
        super(j, c02746q, c6o, EnumC02756r.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final int A06() {
        return A07().A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return A07().A0A(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.TouchSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final boolean A0A(AbstractC02766s<C6O> abstractC02766s) {
        return A07().A0B(abstractC02766s.A07());
    }
}
