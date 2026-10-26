package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T3 extends C4T {
    public static byte[] A06;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A06();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowMinWidthMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A06 = new byte[]{103, 122, 117, 100, 52, 100, 102, 113, 114, 113, 102, 113, 122, 119, 113, 52, 103, 124, 123, 97, 120, 112, 52, 118, 113, 52, 123, 122, 113, 52, 123, 114, 52, 96, 124, 113, 52, 119, 123, 122, 103, 96, 117, 122, 96, 103, 52, 112, 113, 114, 125, 122, 113, 112, 52, 125, 122, 52, 71, 121, 123, 123, 96, 124, 71, 119, 102, 123, 120, 120, 113, 102, 56, 52, 103, 96, 117, 102, 96, 125, 122, 115, 52, 99, 125, 96, 124, 52, 71, 90, 85, 68, 75, 21, 48, 55, 60, 56, 43, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 108, 117, 102, 113, 113, 106, 103, 102, 35, 96, 108, 110, 115, 118, 119, 102, 80, 96, 113, 108, 111, 111, 85, 102, 96, 119, 108, 113, 69, 108, 113, 83, 108, 112, 106, 119, 106, 108, 109, 35, 116, 107, 102, 109, 35, 119, 107, 102, 35, 79, 98, 122, 108, 118, 119, 78, 98, 109, 98, 100, 102, 113, 35, 103, 108, 102, 112, 35, 109, 108, 119, 35, 106, 110, 115, 111, 102, 110, 102, 109, 119, 35};
    }

    public T3(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        T3 t3 = this;
        float f = 0.0f;
        int i = 0;
        PointF pointF = t3.A02;
        char c2 = pointF != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    pointF = pointF;
                    f = 0.0f;
                    if (pointF.y != 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    return i;
                case 5:
                    t3 = t3;
                    if (t3.A02.y <= f) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = 1;
                    c2 = 4;
                    break;
                case 7:
                    i = -1;
                    c2 = 4;
                    break;
            }
        }
    }

    private int A01(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private final int A03(View view, int top) {
        C4G c4gA08 = A08();
        char c2 = c4gA08 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4gA08 = c4gA08;
                    if (!c4gA08.A25()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    View view2 = view;
                    C4G c4g = c4gA08;
                    C4H c4h = (C4H) view2.getLayoutParams();
                    int iA0o = c4g.A0o(view2) - c4h.topMargin;
                    int iA0j = c4g.A0j(view2) + c4h.bottomMargin;
                    int iA0g = c4g.A0g();
                    int iA0X = c4g.A0X();
                    int bottom = c4g.A0d();
                    return A0N(iA0o, iA0j, iA0g, iA0X - bottom, top);
            }
        }
    }

    private final void A07(C4R c4r) {
        float f = 0.0f;
        PointF pointFA0P = A0P(A07());
        char c2 = pointFA0P != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    pointFA0P = pointFA0P;
                    f = 0.0f;
                    if (pointFA0P.x != 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    pointFA0P = pointFA0P;
                    if (pointFA0P.y != f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    T3 t3 = this;
                    c4r.A03(t3.A07());
                    t3.A09();
                    return;
                case 5:
                    T3 t32 = this;
                    PointF pointF = pointFA0P;
                    t32.A0B(pointF);
                    t32.A02 = pointF;
                    t32.A00 = (int) (pointF.x * 10000.0f);
                    t32.A01 = (int) (pointF.y * 10000.0f);
                    c4r.A04((int) (t32.A00 * 1.2f), (int) (t32.A01 * 1.2f), (int) (t32.A0L(10000) * 1.2f), t32.A05);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A0H(int i, int i2, C4V c4v, C4R c4r) {
        T3 t3 = this;
        char c2 = t3.A06() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    t3.A09();
                    return;
                case 3:
                    t3 = t3;
                    t3.A00 = t3.A01(t3.A00, i);
                    t3.A01 = t3.A01(t3.A01, i2);
                    if (t3.A00 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    t3 = t3;
                    if (t3.A01 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    t3 = t3;
                    c4r = c4r;
                    t3.A07(c4r);
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A0I(View view, C4V c4v, C4R c4r) {
        int iA0O = A0O(view, A0K());
        int iA03 = A03(view, A00());
        int iA0M = A0M((int) Math.sqrt((iA0O * iA0O) + (iA03 * iA03)));
        if (iA0M > 0) {
            c4r.A04(-iA0O, -iA03, iA0M, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        T3 t3 = this;
        float f = 0.0f;
        int i = 0;
        PointF pointF = t3.A02;
        char c2 = pointF != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    pointF = pointF;
                    f = 0.0f;
                    if (pointF.x != 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    return i;
                case 5:
                    t3 = t3;
                    if (t3.A02.x <= f) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = 1;
                    c2 = 4;
                    break;
                case 7:
                    i = -1;
                    c2 = 4;
                    break;
            }
        }
    }

    public int A0L(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) Math.ceil(A0L(i) / 0.3356d);
    }

    public final int A0N(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        char c2 = i5 != -1 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (i5 == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i5 != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i4 - i2;
                case 5:
                    throw new IllegalArgumentException(A04(0, 93, 110));
                case 6:
                    i7 = i3 - i;
                    if (i7 <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return i7;
                case '\b':
                    i6 = i4 - i2;
                    if (i6 >= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i6;
                case '\n':
                    return 0;
                case 11:
                    return i3 - i;
            }
        }
    }

    public int A0O(View view, int left) {
        C4G c4gA08 = A08();
        char c2 = c4gA08 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4gA08 = c4gA08;
                    if (!c4gA08.A24()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    View view2 = view;
                    C4G c4g = c4gA08;
                    C4H c4h = (C4H) view2.getLayoutParams();
                    int iA0k = c4g.A0k(view2) - c4h.leftMargin;
                    int iA0n = c4g.A0n(view2) + c4h.rightMargin;
                    int iA0e = c4g.A0e();
                    int iA0h = c4g.A0h();
                    int right = c4g.A0f();
                    return A0N(iA0k, iA0n, iA0e, iA0h - right, left);
            }
        }
    }

    @Nullable
    public PointF A0P(int i) {
        Object objA08 = A08();
        if (objA08 instanceof C4S) {
            return ((C4S) objA08).A44(i);
        }
        Log.w(A04(93, 20, 35), A04(113, 93, k.AppCompatTheme_windowFixedWidthMinor) + C4S.class.getCanonicalName());
        return null;
    }
}
