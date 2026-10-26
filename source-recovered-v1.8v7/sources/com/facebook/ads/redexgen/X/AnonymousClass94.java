package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.94, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass94 {
    public static AnonymousClass94 A00 = new AnonymousClass94();

    @VisibleForTesting
    public AnonymousClass94() {
    }

    public static AnonymousClass94 A00() {
        return A00;
    }

    @Nullable
    public static Map<String, String> A01() {
        return C0934Xq.A05();
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final AnonymousClass93 A02(C8C c8c, boolean z) {
        return new C0934Xq(c8c, z, new C02465o());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A03(C8C c8c) {
        try {
            return A02(c8c, false).A69();
        } catch (Throwable th) {
            c8c.A04().A3R(th);
            return AnonymousClass90.A01(c8c);
        }
    }
}
