package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0367Aq extends T3 {
    public final /* synthetic */ C0366Ap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367Aq(C0366Ap c0366Ap, XI xi) {
        super(xi);
        this.A00 = c0366Ap;
    }

    @Override // com.facebook.ads.redexgen.X.T3
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.T3
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.T3
    public final int A0O(View view, int left) {
        C4G c4gA08 = A08();
        if (!c4gA08.A24()) {
            return 0;
        }
        C4H c4h = (C4H) view.getLayoutParams();
        int start = c4gA08.A0k(view) - c4h.leftMargin;
        int end = c4gA08.A0n(view) + c4h.rightMargin;
        return A0N(start, end, c4gA08.A0e(), c4gA08.A0h() - c4gA08.A0f(), left) + this.A00.A02;
    }

    @Override // com.facebook.ads.redexgen.X.T3
    public final PointF A0P(int i) {
        return this.A00.A44(i);
    }
}
