package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T7 implements InterfaceC01853d {
    public static byte[] A01;
    public final /* synthetic */ C0452Eq A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{48, 18, 31, 31, 22, 23, 83, 18, 7, 7, 18, 16, 27, 83, 28, 29, 83, 18, 83, 16, 27, 26, 31, 23, 83, 4, 27, 26, 16, 27, 83, 26, 0, 83, 29, 28, 7, 83, 23, 22, 7, 18, 16, 27, 22, 23, 73, 83, 122, 120, 117, 117, 124, 125, 57, 125, 124, 109, 120, 122, 113, 57, 118, 119, 57, 120, 119, 57, 120, 117, 107, 124, 120, 125, 96, 57, 125, 124, 109, 120, 122, 113, 124, 125, 57, 122, 113, 112, 117, 125, 57};
    }

    public T7(C0452Eq c0452Eq) {
        this.A00 = c0452Eq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void A3T(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = c4yA0E != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0e()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0P();
                    c2 = 5;
                    break;
                case 5:
                    this.A00.attachViewToParent(view, i, layoutParams);
                    return;
                case 6:
                    throw new IllegalArgumentException(A00(0, 48, 67) + c4yA0E + this.A00.A1G());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void A4j(int i) {
        C4Y c4yA0E = null;
        View viewA5e = A5e(i);
        char c2 = viewA5e != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    viewA5e = viewA5e;
                    c4yA0E = C0452Eq.A0E(viewA5e);
                    if (c4yA0E == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0e()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0T(256);
                    c2 = 6;
                    break;
                case 6:
                    this.A00.detachViewFromParent(i);
                    return;
                case 7:
                    throw new IllegalArgumentException(A00(48, 43, 41) + c4yA0E + this.A00.A1G());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final View A5e(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final int A5f() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final C4Y A5i(View view) {
        return C0452Eq.A0E(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final int A7S(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void A9W(View view) {
        C4Y c4yA0E = C0452Eq.A0E(view);
        if (c4yA0E != null) {
            c4yA0E.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void AA2(View view) {
        C4Y c4yA0E = C0452Eq.A0E(view);
        if (c4yA0E != null) {
            c4yA0E.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void ACR() {
        T7 t7 = this;
        int iA5f = t7.A5f();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA5f) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    t7 = t7;
                    View viewA5e = t7.A5e(i);
                    t7.A00.A1g(viewA5e);
                    viewA5e.clearAnimation();
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    t7.A00.removeAllViews();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void ACV(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01853d
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
