package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8B {
    public static final AtomicReference<XJ> A00 = new AtomicReference<>();

    @Nullable
    public static XJ A00() {
        return A00.get();
    }

    public static void A01(XJ xj) {
        if (xj == null) {
            return;
        }
        A00.compareAndSet(null, xj);
    }
}
