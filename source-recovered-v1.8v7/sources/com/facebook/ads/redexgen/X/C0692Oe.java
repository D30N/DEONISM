package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Oe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0692Oe {
    public final int[] A00(View view, int i, int i2) {
        C4H c4h = (C4H) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c4h.width), ViewGroup.getChildMeasureSpec(i2, view.getPaddingTop() + view.getPaddingBottom(), c4h.height));
        return new int[]{view.getMeasuredWidth() + c4h.leftMargin + c4h.rightMargin, view.getMeasuredHeight() + c4h.bottomMargin + c4h.topMargin};
    }
}
