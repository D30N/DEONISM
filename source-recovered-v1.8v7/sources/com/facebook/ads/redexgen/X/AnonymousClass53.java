package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.53, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass53 {
    public static C0S A00(Context context, C8E c8e) {
        XJ sdkContext = A07(context);
        C0V c0vA6L = c8e.A6L(sdkContext);
        if (c0vA6L != null) {
            return c0vA6L.A8S();
        }
        return new RN();
    }

    public static XI A01(Activity activity) {
        return new XI(activity, A08(), A00(activity, A08()));
    }

    public static XI A02(Context context) {
        return new XI(context, A08(), new RN());
    }

    public static XI A03(Context context) {
        return new XI(context, A08(), A00(context, A08()));
    }

    public static XI A04(Context context) {
        if (JQ.A0i(context)) {
            return new XI(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static XI A05(Context context) {
        return new XI(context, A08(), A00(context, A08()));
    }

    public static EY A06(Context context) {
        return new EY(context, A08(), A08().A6L(A07(context)));
    }

    public static XJ A07(Context context) {
        return new XJ(context, A08());
    }

    public static synchronized C8E A08() {
        return C0931Xn.A01();
    }
}
