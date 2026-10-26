package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4D {
    @Deprecated
    private final void A00(Rect rect, int i, C0452Eq c0452Eq) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, C0452Eq c0452Eq, C4V c4v) {
        A00(rect, ((C4H) view.getLayoutParams()).A00(), c0452Eq);
    }
}
