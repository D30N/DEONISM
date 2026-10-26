package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ty, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0838Ty implements InterfaceC02425k {
    public final Map<String, C02405i> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.X.InterfaceC02425k
    public final synchronized String ACZ() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (C02405i stat : this.A00.values()) {
            sb.append(stat.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02425k
    public final synchronized void reset() {
        this.A00.clear();
    }
}
