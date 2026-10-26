package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class G6 implements InterfaceC0749Qk {
    public final EnumC0741Qc A00;
    public final AnonymousClass49 A01;

    public G6(AnonymousClass49 anonymousClass49, EnumC0741Qc enumC0741Qc) {
        this.A01 = anonymousClass49;
        this.A00 = enumC0741Qc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0749Qk
    public void A3O(Map<QV, EnumC0753Qo> map, Map<GB, EnumC0741Qc> map2) {
        map2.put(this.A01, this.A00);
    }
}
