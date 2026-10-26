package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3E {
    public static final C3D A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C0459Ex();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C0806Sr();
        } else {
            A00 = new C3D();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
