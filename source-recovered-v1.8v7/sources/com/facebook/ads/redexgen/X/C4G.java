package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4G {
    public static byte[] A0I;
    public int A00;
    public C01863e A01;

    @Nullable
    public C4T A02;
    public C0452Eq A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC02084b A0G = new TA(this);
    public final InterfaceC02084b A0H = new TB(this);
    public C02104d A04 = new C02104d(this.A0G);
    public C02104d A05 = new C02104d(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    static {
        A08();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A0I = new byte[]{114, 87, 87, 86, 87, 19, 101, 90, 86, 68, 19, 91, 82, 64, 19, 97, 86, 80, 74, 80, 95, 86, 65, 101, 90, 86, 68, 19, 82, 64, 19, 67, 82, 65, 86, 93, 71, 19, 81, 70, 71, 19, 69, 90, 86, 68, 19, 90, 64, 19, 93, 92, 71, 19, 82, 19, 65, 86, 82, 95, 19, 80, 91, 90, 95, 87, 29, 19, 102, 93, 85, 90, 95, 71, 86, 65, 86, 87, 19, 90, 93, 87, 86, 75, 9, 125, 75, 81, 4, 73, 81, 87, 80, 4, 75, 82, 65, 86, 86, 77, 64, 65, 4, 75, 74, 104, 69, 93, 75, 81, 80, 103, 76, 77, 72, 64, 86, 65, 74, 12, 118, 65, 71, 93, 71, 72, 65, 86, 4, 86, 65, 71, 93, 71, 72, 65, 86, 8, 4, 119, 80, 69, 80, 65, 4, 87, 80, 69, 80, 65, 13, 4, 117, 67, 89, 12, 65, 89, 95, 88, 12, 67, 90, 73, 94, 94, 69, 72, 73, 12, 95, 65, 67, 67, 88, 68, Byte.MAX_VALUE, 79, 94, 67, 64, 64, 120, 67, 124, 67, 95, 69, 88, 69, 67, 66, 12, 88, 67, 12, 95, 89, 92, 92, 67, 94, 88, 12, 95, 65, 67, 67, 88, 68, 12, 95, 79, 94, 67, 64, 64, 69, 66, 75, 98, 64, 79, 79, 78, 85, 1, 76, 78, 87, 68, 1, 64, 1, 66, 73, 72, 77, 69, 1, 71, 83, 78, 76, 1, 79, 78, 79, 12, 68, 89, 72, 82, 85, 72, 79, 70, 1, 72, 79, 69, 68, 89, 27, 13, 58, 60, 38, 60, 51, 58, 45, 9, 54, 58, 40};
    }

    public abstract C4H A1s();

    public static int A00(int mode, int size, int i) {
        int mode2 = View.MeasureSpec.getMode(mode);
        int size2 = View.MeasureSpec.getSize(mode);
        char c2 = mode2 != Integer.MIN_VALUE ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (mode2 == 1073741824) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return Math.max(size, i);
                case 4:
                    return size2;
                case 5:
                    return Math.min(size2, Math.max(size, i));
            }
        }
    }

    public static int A01(int i, int resultSize, int i2, int i3, boolean z) {
        int size = Math.max(0, i - i2);
        int i4 = 0;
        int i5 = 0;
        char c2 = z ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i4 = i3;
                    i5 = 1073741824;
                    c2 = 4;
                    break;
                case 4:
                    return View.MeasureSpec.makeMeasureSpec(i4, i5);
                case 5:
                    if (i3 != -1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (resultSize == Integer.MIN_VALUE) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (resultSize == 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (resultSize == 1073741824) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case '\t':
                    i4 = 0;
                    i5 = 0;
                    c2 = 4;
                    break;
                case '\n':
                    i4 = size;
                    i5 = resultSize;
                    c2 = 4;
                    break;
                case 11:
                    if (i3 != -2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    i4 = 0;
                    i5 = 0;
                    c2 = 4;
                    break;
                case '\r':
                    if (i3 < 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    i4 = i3;
                    i5 = 1073741824;
                    c2 = 4;
                    break;
                case 15:
                    if (i3 != -1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i4 = size;
                    i5 = resultSize;
                    c2 = 4;
                    break;
                case 17:
                    if (i3 != -2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    i4 = size;
                    if (resultSize == Integer.MIN_VALUE) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (resultSize != 1073741824) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    i5 = RecyclerView.UNDEFINED_DURATION;
                    c2 = 4;
                    break;
                case 21:
                    i5 = 0;
                    c2 = 4;
                    break;
            }
        }
    }

    private final int A02(View view) {
        return ((C4H) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C4H) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C4H) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C4H) view.getLayoutParams()).A03.top;
    }

    private final int A06(C4O c4o, C4V c4v) {
        return 0;
    }

    private final void A09(int i) {
        A0C(i, A0t(i));
    }

    private final void A0A(int i) {
        if (A0t(i) != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0B(int i, int i2) {
        View viewA0t = A0t(i);
        if (viewA0t != null) {
            A09(i);
            A0E(viewA0t, i2);
        } else {
            throw new IllegalArgumentException(A07(220, 44, 38) + i + this.A03.toString());
        }
    }

    private void A0C(int i, View view) {
        this.A01.A0C(i);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i) {
        A0F(view, i, (C4H) view.getLayoutParams());
    }

    private final void A0F(View view, int i, C4H c4h) {
        C4G c4g = this;
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = c4yA0E.A0c() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    c4yA0E = c4yA0E;
                    c4g.A03.A0t.A09(c4yA0E);
                    c2 = 3;
                    break;
                case 3:
                    c4g.A01.A0H(view, i, c4h, c4yA0E.A0c());
                    return;
                case 4:
                    c4g = c4g;
                    c4yA0E = c4yA0E;
                    c4g.A03.A0t.A0A(c4yA0E);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0G(View view, int currentIndex, boolean z) {
        C4G c4g = this;
        int i = 0;
        int iA07 = 0;
        C4T c4t = null;
        boolean z2 = false;
        C4H c4h = null;
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = !z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    c4yA0E = c4yA0E;
                    c4g.A03.A0t.A09(c4yA0E);
                    c2 = 4;
                    break;
                case 4:
                    view = view;
                    c4yA0E = c4yA0E;
                    c4h = (C4H) view.getLayoutParams();
                    z2 = false;
                    if (!c4yA0E.A0i()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0d()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0d()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0S();
                    c2 = '\b';
                    break;
                case '\b':
                    c4g = c4g;
                    view = view;
                    z2 = false;
                    c4g.A01.A0H(view, currentIndex, view.getLayoutParams(), false);
                    c2 = '\t';
                    break;
                case '\t':
                    c4h = c4h;
                    if (!c4h.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4yA0E = c4yA0E;
                    c4h = c4h;
                    c4yA0E.A0H.invalidate();
                    c4h.A02 = z2;
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    c4yA0E = c4yA0E;
                    c4yA0E.A0O();
                    c2 = '\b';
                    break;
                case '\r':
                    c4g = c4g;
                    view = view;
                    if (view.getParent() != c4g.A03) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c4g = c4g;
                    view = view;
                    iA07 = c4g.A01.A07(view);
                    i = -1;
                    if (currentIndex != -1) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c4g = c4g;
                    currentIndex = c4g.A01.A05();
                    c2 = 16;
                    break;
                case 16:
                    if (iA07 == i) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (iA07 == currentIndex) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c4g = c4g;
                    c4g.A03.A06.A0B(iA07, currentIndex);
                    c2 = '\t';
                    break;
                case 19:
                    c4g = c4g;
                    view = view;
                    c4h = c4h;
                    z2 = false;
                    c4g.A01.A0I(view, currentIndex, false);
                    c4h.A01 = true;
                    c4t = c4g.A02;
                    if (c4t == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c4t = c4t;
                    if (!c4t.A0F()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c4g = c4g;
                    view = view;
                    c4g.A02.A0C(view);
                    c2 = '\t';
                    break;
                case 22:
                    c4g = c4g;
                    c4yA0E = c4yA0E;
                    c4g.A03.A0t.A0A(c4yA0E);
                    c2 = 4;
                    break;
                case 23:
                    C4G c4g2 = c4g;
                    throw new IllegalStateException(A07(0, 85, 52) + c4g2.A03.indexOfChild(view) + c4g2.A03.A1G());
            }
        }
    }

    private final void A0H(View view, Rect rect) {
        C0452Eq.A0n(view, rect);
    }

    private void A0J(C4O c4o, int i, View view) {
        C4G c4g = this;
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = c4yA0E.A0h() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0b()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    c4g = c4g;
                    if (!c4g.A03.A04.A0A()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    c4g = c4g;
                    c4o = c4o;
                    c4yA0E = c4yA0E;
                    c4g.A0A(i);
                    c4o.A0b(c4yA0E);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    c4g = c4g;
                    c4o = c4o;
                    view = view;
                    c4yA0E = c4yA0E;
                    c4g.A09(i);
                    c4o.A0W(view);
                    c4g.A03.A0t.A0C(c4yA0E);
                    c2 = 7;
                    break;
            }
        }
    }

    private final void A0K(C4O c4o, C4V c4v, AccessibilityEvent accessibilityEvent) {
        C4G c4g = this;
        boolean z = false;
        int i = 0;
        C0452Eq c0452Eq = c4g.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    accessibilityEvent = accessibilityEvent;
                    if (accessibilityEvent != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c0452Eq = c0452Eq;
                    z = true;
                    z = true;
                    if (!c0452Eq.canScrollVertically(1)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    c4g = c4g;
                    i = -1;
                    if (!c4g.A03.canScrollVertically(-1)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    c4g = c4g;
                    if (!c4g.A03.canScrollHorizontally(i)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c4g = c4g;
                    if (!c4g.A03.canScrollHorizontally(z ? 1 : 0)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c4g = c4g;
                    accessibilityEvent = accessibilityEvent;
                    accessibilityEvent.setScrollable(z);
                    if (c4g.A03.A04 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c4g = c4g;
                    accessibilityEvent = accessibilityEvent;
                    accessibilityEvent.setItemCount(c4g.A03.A04.A0D());
                    c2 = '\n';
                    break;
                case '\n':
                    return;
                case 11:
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    private final void A0L(C4O c4o, C4V c4v, C3K c3k) {
        C4G c4g = this;
        char c2 = !c4g.A03.canScrollVertically(-1) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    if (!c4g.A03.canScrollHorizontally(-1)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c3k = c3k;
                    c3k.A0N(8192);
                    c3k.A0R(true);
                    c2 = 4;
                    break;
                case 4:
                    c4g = c4g;
                    if (!c4g.A03.canScrollVertically(1)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c4g = c4g;
                    if (!c4g.A03.canScrollHorizontally(1)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c3k = c3k;
                    c3k.A0N(4096);
                    c3k.A0R(true);
                    c2 = 7;
                    break;
                case 7:
                    C4G c4g2 = c4g;
                    C4O c4o2 = c4o;
                    C4V c4v2 = c4v;
                    c3k.A0P(C3H.A00(c4g2.A0r(c4o2, c4v2), c4g2.A0q(c4o2, c4v2), c4g2.A0P(c4o2, c4v2), c4g2.A06(c4o2, c4v2)));
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(C4T c4t) {
        if (this.A02 == c4t) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        boolean z = false;
        C4T c4t = this.A02;
        char c2 = c4t != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4t = c4t;
                    if (!c4t.A0F()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0O(int specMode, int i, int i2) {
        boolean z = false;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        boolean z2 = false;
        char c2 = i2 > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (specMode == i2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    z = true;
                    if (mode == Integer.MIN_VALUE) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (mode == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (mode == 1073741824) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    if (size != specMode) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z2 = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z2;
                case 11:
                    return z;
                case '\f':
                    if (size < specMode) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z2 = true;
                    c2 = 14;
                    break;
                case 14:
                    return z2;
            }
        }
    }

    private final boolean A0P(C4O c4o, C4V c4v) {
        return false;
    }

    private final boolean A0Q(C4O c4o, C4V c4v, int i, Bundle bundle) {
        C4G c4g = this;
        boolean z = false;
        int i2 = 0;
        int iA0X = 0;
        int iA0h = 0;
        C0452Eq c0452Eq = c4g.A03;
        char c2 = c0452Eq == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    iA0X = 0;
                    iA0h = 0;
                    z = true;
                    z = true;
                    if (i == 4096) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 8192) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (iA0X != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (iA0h != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    c0452Eq = c0452Eq;
                    i2 = -1;
                    if (!c0452Eq.canScrollVertically(-1)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c4g = c4g;
                    iA0X = -((c4g.A0X() - c4g.A0g()) - c4g.A0d());
                    c2 = '\n';
                    break;
                case '\n':
                    c4g = c4g;
                    if (!c4g.A03.canScrollHorizontally(i2)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4g = c4g;
                    iA0h = -((c4g.A0h() - c4g.A0e()) - c4g.A0f());
                    c2 = 5;
                    break;
                case '\f':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.canScrollVertically(z ? 1 : 0)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c4g = c4g;
                    iA0X = (c4g.A0X() - c4g.A0g()) - c4g.A0d();
                    c2 = 14;
                    break;
                case 14:
                    c4g = c4g;
                    if (!c4g.A03.canScrollHorizontally(z ? 1 : 0)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c4g = c4g;
                    iA0h = (c4g.A0h() - c4g.A0e()) - c4g.A0f();
                    c2 = 5;
                    break;
                case 16:
                    c4g.A03.scrollBy(iA0h, iA0X);
                    return z;
            }
        }
    }

    private final boolean A0R(C4O c4o, C4V c4v, View view, int i, Bundle bundle) {
        return false;
    }

    private boolean A0S(C0452Eq c0452Eq, int parentLeft, int parentTop) {
        C4G c4g = this;
        int iA0g = 0;
        int parentBottom = 0;
        int iA0e = 0;
        Rect rect = null;
        View focusedChild = c0452Eq.getFocusedChild();
        char c2 = focusedChild == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c4g = c4g;
                    focusedChild = focusedChild;
                    iA0e = c4g.A0e();
                    iA0g = c4g.A0g();
                    int iA0h = c4g.A0h() - c4g.A0f();
                    parentBottom = c4g.A0X() - c4g.A0d();
                    rect = c4g.A03.A0p;
                    c4g.A0H(focusedChild, rect);
                    if (rect.left - parentLeft >= iA0h) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    rect = rect;
                    if (rect.right - parentLeft <= iA0e) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    rect = rect;
                    if (rect.top - parentTop >= parentBottom) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    rect = rect;
                    if (rect.bottom - parentTop > iA0g) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    return true;
            }
        }
    }

    @Deprecated
    private final boolean A0T(C0452Eq c0452Eq, View view, View view2) {
        boolean z = false;
        char c2 = !A0N() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A1s()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    private int[] A0U(C0452Eq c0452Eq, View view, Rect rect, boolean z) {
        int offScreenTop = 0;
        int iMin = 0;
        int[] iArr = new int[2];
        int iA0e = A0e();
        int iA0g = A0g();
        int iA0h = A0h() - A0f();
        int iA0X = A0X() - A0d();
        int left = view.getLeft();
        int parentBottom = rect.left;
        int i = left + parentBottom;
        int parentBottom2 = view.getScrollX();
        int i2 = i - parentBottom2;
        int top = view.getTop();
        int childLeft = rect.top;
        int i3 = top + childLeft;
        int childLeft2 = view.getScrollY();
        int i4 = i3 - childLeft2;
        int iWidth = rect.width() + i2;
        int iHeight = rect.height() + i4;
        int childBottom = i2 - iA0e;
        int iMin2 = Math.min(0, childBottom);
        int offScreenLeft = i4 - iA0g;
        int iMin3 = Math.min(0, offScreenLeft);
        int offScreenLeft2 = iWidth - iA0h;
        int iMax = Math.max(0, offScreenLeft2);
        int iMax2 = Math.max(0, iHeight - iA0X);
        int parentTop = A0a();
        int offScreenBottom = parentTop == 1 ? 2 : 9;
        while (true) {
            switch (offScreenBottom) {
                case 2:
                    if (iMax == 0) {
                        offScreenBottom = 8;
                        break;
                    } else {
                        offScreenBottom = 3;
                        break;
                    }
                case 3:
                    offScreenTop = iMax;
                    offScreenBottom = 4;
                    break;
                case 4:
                    if (iMin3 == 0) {
                        offScreenBottom = 7;
                        break;
                    } else {
                        offScreenBottom = 5;
                        break;
                    }
                case 5:
                    iMin = iMin3;
                    offScreenBottom = 6;
                    break;
                case 6:
                    int[] iArr2 = iArr;
                    iArr2[0] = offScreenTop;
                    iArr2[1] = iMin;
                    return iArr2;
                case 7:
                    int offScreenBottom2 = i4 - iA0g;
                    iMin = Math.min(offScreenBottom2, iMax2);
                    offScreenBottom = 6;
                    break;
                case 8:
                    int offScreenBottom3 = iWidth - iA0h;
                    offScreenTop = Math.max(iMin2, offScreenBottom3);
                    offScreenBottom = 4;
                    break;
                case 9:
                    if (iMin2 == 0) {
                        offScreenBottom = 11;
                        break;
                    } else {
                        offScreenBottom = 10;
                        break;
                    }
                case 10:
                    offScreenTop = iMin2;
                    offScreenBottom = 4;
                    break;
                case 11:
                    int offScreenBottom4 = i2 - iA0e;
                    offScreenTop = Math.min(offScreenBottom4, iMax);
                    offScreenBottom = 4;
                    break;
            }
        }
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        int iA05 = 0;
        C01863e c01863e = this.A01;
        char c2 = c01863e != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01863e = c01863e;
                    iA05 = c01863e.A05();
                    c2 = 3;
                    break;
                case 3:
                    return iA05;
                case 4:
                    iA05 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        int iA0D = 0;
        AnonymousClass44 adapter = null;
        C0452Eq c0452Eq = this.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    adapter = c0452Eq.getAdapter();
                    c2 = 3;
                    break;
                case 3:
                    if (adapter == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    iA0D = adapter.A0D();
                    c2 = 5;
                    break;
                case 5:
                    return iA0D;
                case 6:
                    iA0D = 0;
                    c2 = 5;
                    break;
                case 7:
                    adapter = null;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0a() {
        return C2v.A01(this.A03);
    }

    public final int A0b() {
        return C2v.A02(this.A03);
    }

    public final int A0c() {
        return C2v.A03(this.A03);
    }

    public final int A0d() {
        int paddingBottom = 0;
        C0452Eq c0452Eq = this.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    paddingBottom = c0452Eq.getPaddingBottom();
                    c2 = 3;
                    break;
                case 3:
                    return paddingBottom;
                case 4:
                    paddingBottom = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0e() {
        int paddingLeft = 0;
        C0452Eq c0452Eq = this.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    paddingLeft = c0452Eq.getPaddingLeft();
                    c2 = 3;
                    break;
                case 3:
                    return paddingLeft;
                case 4:
                    paddingLeft = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0f() {
        int paddingRight = 0;
        C0452Eq c0452Eq = this.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    paddingRight = c0452Eq.getPaddingRight();
                    c2 = 3;
                    break;
                case 3:
                    return paddingRight;
                case 4:
                    paddingRight = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0g() {
        int paddingTop = 0;
        C0452Eq c0452Eq = this.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    paddingTop = c0452Eq.getPaddingTop();
                    c2 = 3;
                    break;
                case 3:
                    return paddingTop;
                case 4:
                    paddingTop = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C4H) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C4H) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C4H) view.getLayoutParams()).A00();
    }

    public int A0q(C4O c4o, C4V c4v) {
        C4G c4g = this;
        C0452Eq c0452Eq = c4g.A03;
        int iA0D = 1;
        char c2 = c0452Eq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return iA0D;
                case 4:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4g = c4g;
                    iA0D = c4g.A03.A04.A0D();
                    c2 = 6;
                    break;
                case 6:
                    return iA0D;
            }
        }
    }

    public int A0r(C4O c4o, C4V c4v) {
        C4G c4g = this;
        C0452Eq c0452Eq = c4g.A03;
        int iA0D = 1;
        char c2 = c0452Eq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return iA0D;
                case 4:
                    c4g = c4g;
                    if (!c4g.A25()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4g = c4g;
                    iA0D = c4g.A03.A04.A0D();
                    c2 = 6;
                    break;
                case 6:
                    return iA0D;
            }
        }
    }

    public final View A0s() {
        C4G c4g = this;
        View focusedChild = null;
        C0452Eq c0452Eq = c4g.A03;
        char c2 = c0452Eq == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (View) null;
                case 3:
                    c0452Eq = c0452Eq;
                    focusedChild = c0452Eq.getFocusedChild();
                    if (focusedChild == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4g = c4g;
                    focusedChild = focusedChild;
                    if (!c4g.A01.A0K(focusedChild)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return (View) null;
                case 6:
                    return focusedChild;
            }
        }
    }

    public final View A0t(int i) {
        View viewA09 = null;
        C01863e c01863e = this.A01;
        char c2 = c01863e != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01863e = c01863e;
                    viewA09 = c01863e.A09(i);
                    c2 = 3;
                    break;
                case 3:
                    return viewA09;
                case 4:
                    viewA09 = null;
                    c2 = 3;
                    break;
            }
        }
    }

    public final View A0u(View view, int i) {
        return null;
    }

    public C4H A0v(Context context, AttributeSet attributeSet) {
        return new C4H(context, attributeSet);
    }

    public C4H A0w(ViewGroup.LayoutParams layoutParams) {
        char c2 = layoutParams instanceof C4H ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new C4H((C4H) layoutParams);
                case 3:
                    layoutParams = layoutParams;
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return new C4H((ViewGroup.MarginLayoutParams) layoutParams);
                case 5:
                    return new C4H(layoutParams);
            }
        }
    }

    public final void A0x() {
        C4T c4t = this.A02;
        if (c4t != null) {
            c4t.A09();
        }
    }

    public final void A0y() {
        C0452Eq c0452Eq = this.A03;
        if (c0452Eq != null) {
            c0452Eq.requestLayout();
        }
    }

    public final void A0z(int i) {
        C0452Eq c0452Eq = this.A03;
        if (c0452Eq != null) {
            c0452Eq.A1R(i);
        }
    }

    public final void A10(int i) {
        C0452Eq c0452Eq = this.A03;
        if (c0452Eq != null) {
            c0452Eq.A1S(i);
        }
    }

    public final void A11(int i, int i2) {
        C4G c4g = this;
        c4g.A0C = View.MeasureSpec.getSize(i);
        c4g.A0D = View.MeasureSpec.getMode(i);
        int i3 = 0;
        char c2 = c4g.A0D == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!C0452Eq.A1A) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    i3 = 0;
                    c4g.A0C = 0;
                    c2 = 4;
                    break;
                case 4:
                    c4g = c4g;
                    c4g.A0A = View.MeasureSpec.getSize(i2);
                    c4g.A0B = View.MeasureSpec.getMode(i2);
                    if (c4g.A0B != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (!C0452Eq.A1A) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c4g = c4g;
                    c4g.A0A = i3;
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A12(int minX, int minY) {
        C4G c4g = this;
        int maxX = 0;
        int maxY = 0;
        int i = 0;
        Rect bounds = null;
        int i2 = 0;
        int i3 = 0;
        int iA0W = c4g.A0W();
        char c2 = iA0W == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4g.A03.A1Y(minX, minY);
                    return;
                case 3:
                    i3 = Integer.MAX_VALUE;
                    maxY = Integer.MAX_VALUE;
                    i = RecyclerView.UNDEFINED_DURATION;
                    maxX = RecyclerView.UNDEFINED_DURATION;
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= iA0W) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4g = c4g;
                    View viewA0t = c4g.A0t(i2);
                    bounds = c4g.A03.A0p;
                    c4g.A0H(viewA0t, bounds);
                    if (bounds.left >= i3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    bounds = bounds;
                    i3 = bounds.left;
                    c2 = 7;
                    break;
                case 7:
                    bounds = bounds;
                    if (bounds.right <= i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    bounds = bounds;
                    i = bounds.right;
                    c2 = '\t';
                    break;
                case '\t':
                    bounds = bounds;
                    if (bounds.top >= maxY) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    bounds = bounds;
                    maxY = bounds.top;
                    c2 = 11;
                    break;
                case 11:
                    bounds = bounds;
                    if (bounds.bottom <= maxX) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    bounds = bounds;
                    maxX = bounds.bottom;
                    c2 = '\r';
                    break;
                case '\r':
                    i2++;
                    c2 = 4;
                    break;
                case 14:
                    C4G c4g2 = c4g;
                    c4g2.A03.A0p.set(i3, maxY, i, maxX);
                    c4g2.A15(c4g2.A03.A0p, minX, minY);
                    return;
            }
        }
    }

    public final void A13(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A14(int i, C4O c4o) {
        View viewA0t = A0t(i);
        A0A(i);
        c4o.A0X(viewA0t);
    }

    public void A15(Rect rect, int i, int i2) {
        A13(A00(i, rect.width() + A0e() + A0f(), A0c()), A00(i2, rect.height() + A0g() + A0d(), A0b()));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i) {
        A0G(view, i, true);
    }

    public final void A19(View view, int i) {
        A0G(view, i, false);
    }

    public final void A1A(View view, int i, int i2) {
        C4H c4h = (C4H) view.getLayoutParams();
        Rect rectA1C = this.A03.A1C(view);
        int i3 = i + rectA1C.left + rectA1C.right;
        int i4 = i2 + rectA1C.top + rectA1C.bottom;
        int iA01 = A01(A0h(), A0i(), A0e() + A0f() + c4h.leftMargin + c4h.rightMargin + i3, c4h.width, A24());
        int iA012 = A01(A0X(), A0Y(), A0g() + A0d() + c4h.topMargin + c4h.bottomMargin + i4, c4h.height, A25());
        if (A1a(view, iA01, iA012, c4h)) {
            view.measure(iA01, iA012);
        }
    }

    public final void A1B(View view, int i, int i2, int i3, int i4) {
        C4H c4h = (C4H) view.getLayoutParams();
        Rect rect = c4h.A03;
        view.layout(rect.left + i + c4h.leftMargin, rect.top + i2 + c4h.topMargin, (i3 - rect.right) - c4h.rightMargin, (i4 - rect.bottom) - c4h.bottomMargin);
    }

    public final void A1C(View view, C3K c3k) {
        C4G c4g = this;
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = c4yA0E != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    c4yA0E = c4yA0E;
                    if (!c4g.A01.A0K(c4yA0E.A0H)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c4g = c4g;
                    view = view;
                    c3k = c3k;
                    c4g.A1K(c4g.A03.A0r, c4g.A03.A0s, view, c3k);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A1D(View view, C4O c4o) {
        A0D(view);
        c4o.A0X(view);
    }

    public final void A1E(View view, boolean z, Rect rect) {
        C4G c4g = this;
        Matrix matrix = null;
        char c2 = z ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    rect = rect;
                    Rect rect2 = ((C4H) view.getLayoutParams()).A03;
                    rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
                    c2 = 3;
                    break;
                case 3:
                    c4g = c4g;
                    if (c4g.A03 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    matrix = view.getMatrix();
                    if (matrix == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    matrix = matrix;
                    if (!matrix.isIdentity()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c4g = c4g;
                    rect = rect;
                    matrix = matrix;
                    RectF rectF = c4g.A03.A0q;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
                    c2 = 7;
                    break;
                case 7:
                    View view2 = view;
                    rect.offset(view2.getLeft(), view2.getTop());
                    return;
                case '\b':
                    view = view;
                    rect = rect;
                    rect.set(0, 0, view.getWidth(), view.getHeight());
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A1F(C3K c3k) {
        A0L(this.A03.A0r, this.A03.A0s, c3k);
    }

    public final void A1G(C4O c4o) {
        C4G c4g = this;
        C4Y c4yA0E = null;
        boolean z = false;
        View viewA0F = null;
        int iA0E = c4o.A0E();
        int i = iA0E - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i < 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    viewA0F = c4o.A0F(i);
                    c4yA0E = C0452Eq.A0E(viewA0F);
                    if (!c4yA0E.A0h()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i--;
                    c2 = 2;
                    break;
                case 5:
                    c4yA0E = c4yA0E;
                    z = false;
                    c4yA0E.A0Z(false);
                    if (!c4yA0E.A0e()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4g = c4g;
                    viewA0F = viewA0F;
                    c4g.A03.removeDetachedView(viewA0F, z);
                    c2 = 7;
                    break;
                case 7:
                    c4g = c4g;
                    if (c4g.A03.A05 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c4g = c4g;
                    c4yA0E = c4yA0E;
                    c4g.A03.A05.A0I(c4yA0E);
                    c2 = '\t';
                    break;
                case '\t':
                    c4o = c4o;
                    viewA0F = viewA0F;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0Z(true);
                    c4o.A0V(viewA0F);
                    c2 = 4;
                    break;
                case '\n':
                    c4o = c4o;
                    c4o.A0L();
                    if (iA0E <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4g = c4g;
                    c4g.A03.invalidate();
                    c2 = '\f';
                    break;
                case '\f':
                    return;
            }
        }
    }

    public final void A1H(C4O c4o) {
        C4G c4g = this;
        int iA0W = c4g.A0W() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA0W < 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    c4o = c4o;
                    View v = c4g.A0t(iA0W);
                    c4g.A0J(c4o, iA0W, v);
                    iA0W--;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A1I(C4O c4o) {
        C4G c4g = this;
        int iA0W = c4g.A0W() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA0W < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    if (!C0452Eq.A0E(c4g.A0t(iA0W)).A0h()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c4g = c4g;
                    c4o = c4o;
                    c4g.A14(iA0W, c4o);
                    c2 = 5;
                    break;
                case 5:
                    iA0W--;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public void A1J(C4O c4o, C4V c4v, int i, int i2) {
        this.A03.A1Y(i, i2);
    }

    public void A1K(C4O c4o, C4V c4v, View view, C3K c3k) {
        C4G c4g = this;
        int iA0p = 0;
        int iA0p2 = 0;
        char c2 = c4g.A25() ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    view = view;
                    iA0p = c4g.A0p(view);
                    c2 = 3;
                    break;
                case 3:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4g = c4g;
                    view = view;
                    iA0p2 = c4g.A0p(view);
                    c2 = 5;
                    break;
                case 5:
                    c3k.A0Q(C3I.A00(iA0p, 1, iA0p2, 1, false, false));
                    return;
                case 6:
                    iA0p2 = 0;
                    c2 = 5;
                    break;
                case 7:
                    iA0p = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A1L(C4T c4t) {
        C4G c4g = this;
        C4T c4t2 = c4g.A02;
        char c2 = c4t2 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4t = c4t;
                    c4t2 = c4t2;
                    if (c4t == c4t2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4t2 = c4t2;
                    if (!c4t2.A0F()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4g = c4g;
                    c4g.A02.A09();
                    c2 = 5;
                    break;
                case 5:
                    C4G c4g2 = c4g;
                    c4g2.A02 = c4t;
                    c4g2.A02.A0D(c4g2.A03, c4g2);
                    return;
            }
        }
    }

    public void A1M(C0452Eq c0452Eq) {
    }

    public final void A1N(C0452Eq c0452Eq) {
        this.A07 = true;
    }

    public final void A1O(C0452Eq c0452Eq) {
        A11(View.MeasureSpec.makeMeasureSpec(c0452Eq.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0452Eq.getHeight(), 1073741824));
    }

    public final void A1P(C0452Eq c0452Eq) {
        C4G c4g = this;
        char c2 = c0452Eq == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    c4g.A03 = null;
                    c4g.A01 = null;
                    c4g.A0C = 0;
                    c4g.A0A = 0;
                    c2 = 3;
                    break;
                case 3:
                    C4G c4g2 = c4g;
                    c4g2.A0D = 1073741824;
                    c4g2.A0B = 1073741824;
                    return;
                case 4:
                    c4g = c4g;
                    c0452Eq = c0452Eq;
                    c4g.A03 = c0452Eq;
                    c4g.A01 = c0452Eq.A01;
                    c4g.A0C = c0452Eq.getWidth();
                    c4g.A0A = c0452Eq.getHeight();
                    c2 = 3;
                    break;
            }
        }
    }

    public void A1Q(C0452Eq c0452Eq, int i, int i2) {
    }

    public void A1R(C0452Eq c0452Eq, int i, int i2) {
    }

    public void A1S(C0452Eq c0452Eq, int i, int i2, int i3) {
    }

    public void A1T(C0452Eq c0452Eq, int i, int i2, Object obj) {
    }

    public final void A1U(C0452Eq c0452Eq, C4O c4o) {
        this.A07 = false;
        A20(c0452Eq, c4o);
    }

    public final void A1V(boolean z) {
        this.A06 = z;
    }

    public final boolean A1W() {
        C4G c4g = this;
        ViewGroup.LayoutParams layoutParams = null;
        int iA0W = c4g.A0W();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= iA0W) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    layoutParams = c4g.A0t(i).getLayoutParams();
                    if (layoutParams.width >= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    layoutParams = layoutParams;
                    if (layoutParams.height >= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    i++;
                    c2 = 2;
                    break;
                case 7:
                    return false;
            }
        }
    }

    public final boolean A1X() {
        boolean z = false;
        C0452Eq c0452Eq = this.A03;
        char c2 = c0452Eq != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0B) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A1Y() {
        return this.A0E;
    }

    public final boolean A1Z(int i, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1a(View view, int i, int i2, C4H c4h) {
        C4G c4g = this;
        boolean z = false;
        char c2 = !view.isLayoutRequested() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    if (!c4g.A0F) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    c4h = c4h;
                    if (!A0O(view.getWidth(), i, c4h.width)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    c4h = c4h;
                    if (!A0O(view.getHeight(), i2, c4h.height)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    public final boolean A1b(View view, int i, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1c(C4H c4h) {
        boolean z = false;
        char c2 = c4h != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A1d(C0452Eq c0452Eq, View view, Rect rect, boolean z) {
        return A1e(c0452Eq, view, rect, z, false);
    }

    public final boolean A1e(C0452Eq c0452Eq, View view, Rect rect, boolean z, boolean z2) {
        C4G c4g = this;
        int[] iArrA0U = c4g.A0U(c0452Eq, view, rect, z);
        int i = iArrA0U[0];
        int i2 = iArrA0U[1];
        char c2 = z2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    c0452Eq = c0452Eq;
                    if (!c4g.A0S(c0452Eq, i, i2)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i2 == 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.scrollBy(i, i2);
                    c2 = 7;
                    break;
                case 7:
                    return true;
                case '\b':
                    c0452Eq = c0452Eq;
                    c0452Eq.A1c(i, i2);
                    c2 = 7;
                    break;
                case '\t':
                    return false;
            }
        }
    }

    public final boolean A1f(C0452Eq c0452Eq, C4V c4v, View view, View view2) {
        return A0T(c0452Eq, view, view2);
    }

    public final boolean A1g(C0452Eq c0452Eq, ArrayList<View> arrayList, int i, int i2) {
        return false;
    }

    public int A1h(int i, C4O c4o, C4V c4v) {
        return 0;
    }

    public int A1i(int i, C4O c4o, C4V c4v) {
        return 0;
    }

    public int A1j(C4V c4v) {
        return 0;
    }

    public int A1k(C4V c4v) {
        return 0;
    }

    public int A1l(C4V c4v) {
        return 0;
    }

    public int A1m(C4V c4v) {
        return 0;
    }

    public int A1n(C4V c4v) {
        return 0;
    }

    public int A1o(C4V c4v) {
        return 0;
    }

    public Parcelable A1p() {
        return null;
    }

    @Nullable
    public View A1q(int i) {
        C4G c4g = this;
        View child = null;
        C4Y c4yA0E = null;
        int iA0W = c4g.A0W();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= iA0W) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4g = c4g;
                    child = c4g.A0t(i2);
                    c4yA0E = C0452Eq.A0E(child);
                    if (c4yA0E != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2++;
                    c2 = 2;
                    break;
                case 5:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A0I() != i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 7:
                    c4g = c4g;
                    if (!c4g.A03.A0s.A07()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case '\t':
                    return child;
                case '\n':
                    return (View) null;
            }
        }
    }

    @Nullable
    public View A1r(View view, int i, C4O c4o, C4V c4v) {
        return null;
    }

    public void A1t(int i) {
    }

    public void A1u(int i, int i2, C4V c4v, C4E c4e) {
    }

    public void A1v(int i, C4E c4e) {
    }

    public void A1w(Parcelable parcelable) {
    }

    public void A1x(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1y(C4O c4o, C4V c4v) {
        Log.e(A07(264, 12, 88), A07(85, 67, 35));
    }

    public void A1z(C4V c4v) {
    }

    @CallSuper
    public void A20(C0452Eq c0452Eq, C4O c4o) {
    }

    public void A21(C0452Eq c0452Eq, C4V c4v, int i) {
        Log.e(A07(264, 12, 88), A07(152, 68, 43));
    }

    public void A22(String str) {
        C0452Eq c0452Eq = this.A03;
        if (c0452Eq != null) {
            c0452Eq.A1n(str);
        }
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }
}
