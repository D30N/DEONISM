package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class L3 {
    public static final AtomicReference<L2> A00 = new AtomicReference<>(null);

    public static L2 A00() {
        L2 errorLogger = A00.get();
        if (errorLogger == null) {
            return new C1154cf();
        }
        return errorLogger;
    }

    public static void A01(L2 l2) {
        A00.set(l2);
    }
}
