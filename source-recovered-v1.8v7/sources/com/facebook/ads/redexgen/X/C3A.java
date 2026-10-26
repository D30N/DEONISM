package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.ads.redexgen.X.3A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3A {
    public void A02(ViewParent viewParent, View view) {
        boolean z = viewParent instanceof InterfaceC01612e;
    }

    public void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        boolean z = viewParent instanceof InterfaceC01612e;
    }

    public void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        boolean z = viewParent instanceof InterfaceC01612e;
    }

    public void A05(ViewParent viewParent, View view, View view2, int i) {
        boolean z = viewParent instanceof InterfaceC01612e;
    }

    public boolean A06(ViewParent viewParent, View view, float f, float f2) {
        if (viewParent instanceof InterfaceC01612e) {
            return ((InterfaceC01612e) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }

    public boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (viewParent instanceof InterfaceC01612e) {
            return ((InterfaceC01612e) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public boolean A08(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof InterfaceC01612e) {
            return ((InterfaceC01612e) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }
}
