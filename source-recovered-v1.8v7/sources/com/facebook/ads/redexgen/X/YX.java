package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class YX implements InterfaceC0675Nn {
    public final WeakReference<YQ> A00;

    public YX(YQ yq) {
        this.A00 = new WeakReference<>(yq);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0675Nn
    public final void A9h(boolean z) {
        YQ yq = this.A00.get();
        if (yq != null) {
            yq.A06 = z;
            yq.A01();
        }
    }
}
