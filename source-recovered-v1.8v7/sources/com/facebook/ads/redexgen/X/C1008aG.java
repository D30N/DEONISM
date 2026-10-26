package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1008aG extends AbstractRunnableC0608Kw {
    public final WeakReference<Q1> A00;

    public C1008aG(Q1 q1) {
        this.A00 = new WeakReference<>(q1);
    }

    public C1008aG(WeakReference<Q1> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        Q1 q1 = this.A00.get();
        if (q1 != null) {
            q1.A0V();
        }
    }
}
