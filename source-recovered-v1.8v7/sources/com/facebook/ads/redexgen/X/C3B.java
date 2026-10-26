package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.ads.redexgen.X.3B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3B {
    public static final C3A A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C0460Ey();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C0805Sq();
        } else {
            A00 = new C3A();
        }
    }

    public static void A00(ViewParent viewParent, View view, int i) {
        char c2 = viewParent instanceof InterfaceC0800Sk ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (i != 0) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewParent = viewParent;
                    view = view;
                    A00.A02(viewParent, view);
                    c2 = 2;
                    break;
            }
        }
    }

    public static void A01(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        char c2 = viewParent instanceof InterfaceC0800Sk ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (i5 != 0) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewParent = viewParent;
                    view = view;
                    A00.A03(viewParent, view, i, i2, i3, i4);
                    c2 = 2;
                    break;
            }
        }
    }

    public static void A02(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        char c2 = viewParent instanceof InterfaceC0800Sk ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (i3 != 0) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewParent = viewParent;
                    view = view;
                    iArr = iArr;
                    A00.A04(viewParent, view, i, i2, iArr);
                    c2 = 2;
                    break;
            }
        }
    }

    public static void A03(ViewParent viewParent, View view, View view2, int i, int i2) {
        char c2 = viewParent instanceof InterfaceC0800Sk ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (i2 != 0) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewParent = viewParent;
                    view = view;
                    view2 = view2;
                    A00.A05(viewParent, view, view2, i);
                    c2 = 2;
                    break;
            }
        }
    }

    public static boolean A04(ViewParent viewParent, View view, float f, float f2) {
        return A00.A06(viewParent, view, f, f2);
    }

    public static boolean A05(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return A00.A07(viewParent, view, f, f2, z);
    }

    public static boolean A06(ViewParent viewParent, View view, View view2, int i, int i2) {
        char c2 = viewParent instanceof InterfaceC0800Sk ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ((InterfaceC0800Sk) viewParent).onStartNestedScroll(view, view2, i, i2);
                case 3:
                    if (i2 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return A00.A08(viewParent, view, view2, i);
                case 5:
                    return false;
            }
        }
    }
}
