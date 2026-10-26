package com.facebook.ads.redexgen.X;

import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import d.b.a.b.k;
import java.util.Arrays;

@RequiresApi(21)
/* renamed from: com.facebook.ads.redexgen.X.Ey, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0460Ey extends C0805Sq {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{96, 104, 121, 101, 98, 105, 45, 98, 99, 67, 104, 126, 121, 104, 105, 94, 110, Byte.MAX_VALUE, 98, 97, 97, 76, 110, 110, 104, 125, 121, 104, 105, 106, 98, 115, 111, 104, 99, 39, 104, 105, 73, 98, 116, 115, 98, 99, 87, 117, 98, 65, 107, 110, 105, 96, 73, 65, 80, 76, 75, 64, 4, 75, 74, 106, 65, 87, 80, 65, 64, 116, 86, 65, 119, 71, 86, 75, 72, 72, 19, 44, 32, 50, 21, 36, 55, 32, 43, 49, 6, 42, 40, 53, 36, 49, 22, 82, 89, 83, 69, 22, 88, 89, 66, 22, 95, 91, 70, 90, 83, 91, 83, 88, 66, 22, 95, 88, 66, 83, 68, 80, 87, 85, 83, 22, 46, 38, 55, 43, 44, 39, 99, 44, 45, 16, 55, 44, 51, 13, 38, 48, 55, 38, 39, 16, 32, 49, 44, 47, 47, 102, 110, Byte.MAX_VALUE, 99, 100, 111, 43, 100, 101, 69, 110, 120, Byte.MAX_VALUE, 110, 111, 77, 103, 98, 101, 108, 68, 76, 93, 65, 70, 77, 9, 70, 71, 122, 93, 72, 91, 93, 103, 76, 90, 93, 76, 77, 122, 74, 91, 70, 69, 69, 124, 116, 101, 121, 126, 117, 49, 126, Byte.MAX_VALUE, 95, 116, 98, 101, 116, 117, 66, 114, 99, 126, 125, 125, 56, 7, 11, 25, 62, 15, 28, 11, 0, 26, 78};
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final void A02(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(k.AppCompatTheme_windowMinWidthMajor, 25, 39), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(193, 21, k.AppCompatTheme_windowActionModeOverlay), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(52, 24, 64), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final void A05(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(0, 29, 105), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final boolean A06(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(29, 23, 99), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(147, 20, 111), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3A
    public final boolean A08(ViewParent viewParent, View view, View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(A00(76, 16, 33), A00(214, 11, 10) + viewParent + A00(92, 30, 82) + A00(167, 26, 77), e);
            return false;
        }
    }
}
