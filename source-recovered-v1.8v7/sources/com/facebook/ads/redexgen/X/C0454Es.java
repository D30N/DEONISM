package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0454Es extends T3 {
    public final /* synthetic */ C0453Er A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0454Es(C0453Er c0453Er, Context context) {
        super(context);
        this.A00 = c0453Er;
    }

    @Override // com.facebook.ads.redexgen.X.T3, com.facebook.ads.redexgen.X.C4T
    public final void A0I(View view, C4V c4v, C4R c4r) {
        C0453Er c0453Er = this.A00;
        int[] iArrA0H = c0453Er.A0H(((TJ) c0453Er).A00.getLayoutManager(), view);
        int i = iArrA0H[0];
        int i2 = iArrA0H[1];
        int iA0M = A0M(Math.max(Math.abs(i), Math.abs(i2)));
        if (iA0M > 0) {
            c4r.A04(i, i2, iA0M, ((T3) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T3
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.T3
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
