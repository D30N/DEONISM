package com.facebook.ads.redexgen.X;

import android.support.annotation.RequiresApi;
import android.view.accessibility.AccessibilityEvent;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0459Ex extends C0806Sr {
    @Override // com.facebook.ads.redexgen.X.C3D
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.X.C3D
    public final void A01(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
