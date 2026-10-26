package com.facebook.ads.redexgen.X;

import android.support.annotation.RequiresApi;
import android.view.View;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.19, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass19 extends C2A {
    @Override // com.facebook.ads.redexgen.X.C0461Ez, com.facebook.ads.redexgen.X.C01772u
    public final void A0C(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.X.C01772u
    public final boolean A0I(View view) {
        return view.isAttachedToWindow();
    }
}
