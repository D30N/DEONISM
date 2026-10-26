package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.cG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1130cG implements InterfaceC0574Jm {
    public WeakReference<C1141cR> A00;

    public C1130cG(C1141cR c1141cR) {
        this.A00 = new WeakReference<>(c1141cR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0574Jm
    public final void AAU(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1T(z, false);
        }
    }
}
