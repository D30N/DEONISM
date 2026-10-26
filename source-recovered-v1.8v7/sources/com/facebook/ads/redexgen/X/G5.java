package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class G5 implements InterfaceC0749Qk {
    public final GC A00;
    public final EnumC0753Qo A01;

    public G5(GC gc, EnumC0753Qo enumC0753Qo) {
        this.A00 = gc;
        this.A01 = enumC0753Qo;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0749Qk
    public void A3O(Map<QV, EnumC0753Qo> map, Map<GB, EnumC0741Qc> map2) {
        map.put(this.A00, this.A01);
    }
}
