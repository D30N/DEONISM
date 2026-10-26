package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class T2 extends C4G implements C4S {
    public static byte[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AnonymousClass40 A04;
    public boolean A05;
    public int A06;
    public C02033v A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C02013t A0D;
    public final C02023u A0E;

    static {
        A0V();
    }

    public static String A0T(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0V() {
        A0F = new byte[]{20, 25, 33, 12, 23, 20, 15, -53, 26, 29, 20, 16, 25, 31, 12, 31, 20, 26, 25, -27};
    }

    public T2(Context context) {
        this(context, 1, false);
    }

    public T2(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = RecyclerView.UNDEFINED_DURATION;
        this.A03 = null;
        this.A0D = new C02013t(this);
        this.A0E = new C02023u();
        this.A06 = 2;
        A2E(i);
        A0h(z);
        A1V(true);
    }

    private final int A04(int i, C4O c4o, C4V c4v) {
        T2 t2 = this;
        int i2 = 0;
        int iA08 = 0;
        int iAbs = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        char c2 = t2.A0W() != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    t2 = t2;
                    z = true;
                    t2.A07.A0B = true;
                    t2.A2D();
                    if (i <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3 = 1;
                    c2 = 6;
                    break;
                case 6:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    i4 = 0;
                    iAbs = Math.abs(i);
                    t2.A0Y(i3, iAbs, z, c4v);
                    iA08 = t2.A07.A07 + t2.A08(c4o, t2.A07, c4v, false);
                    if (iA08 >= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return i4;
                case '\b':
                    i3 = -1;
                    c2 = 6;
                    break;
                case '\t':
                    if (iAbs <= iA08) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i2 = i3 * iA08;
                    c2 = 11;
                    break;
                case 11:
                    T2 t22 = t2;
                    t22.A04.A0J(-i2);
                    t22.A07.A04 = i2;
                    return i2;
                case '\f':
                    i2 = i;
                    c2 = 11;
                    break;
            }
        }
    }

    private int A05(int fixOffset, C4O c4o, C4V c4v, boolean z) {
        T2 t2 = this;
        int iA07 = 0;
        int i = 0;
        int i2 = 0;
        int iA072 = t2.A04.A07() - fixOffset;
        char c2 = iA072 > 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    i = -t2.A04(-iA072, c4o, c4v);
                    i2 = fixOffset + i;
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    t2 = t2;
                    iA07 = t2.A04.A07() - i2;
                    if (iA07 <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    t2.A04.A0J(iA07);
                    return iA07 + i;
                case 5:
                    return i;
                case 6:
                    return 0;
            }
        }
    }

    private int A06(int fixOffset, C4O c4o, C4V c4v, boolean z) {
        T2 t2 = this;
        int iA0A = 0;
        int i = 0;
        int i2 = 0;
        int iA0A2 = fixOffset - t2.A04.A0A();
        char c2 = iA0A2 > 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    i = -t2.A04(iA0A2, c4o, c4v);
                    i2 = fixOffset + i;
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    t2 = t2;
                    iA0A = i2 - t2.A04.A0A();
                    if (iA0A <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    t2.A04.A0J(-iA0A);
                    return i - iA0A;
                case 5:
                    return i;
                case 6:
                    return 0;
            }
        }
    }

    private final int A08(C4O c4o, C02033v c02033v, C4V c4v, boolean z) {
        T2 t2 = this;
        int i = 0;
        C02023u c02023u = null;
        int i2 = c02033v.A00;
        char c2 = c02033v.A07 != Integer.MIN_VALUE ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c02033v = c02033v;
                    if (c02033v.A00 >= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02033v = c02033v;
                    c02033v.A07 += c02033v.A00;
                    c2 = 4;
                    break;
                case 4:
                    t2 = t2;
                    c4o = c4o;
                    c02033v = c02033v;
                    t2.A0e(c4o, c02033v);
                    c2 = 5;
                    break;
                case 5:
                    t2 = t2;
                    c02033v = c02033v;
                    i = c02033v.A00 + c02033v.A02;
                    c02023u = t2.A0E;
                    c2 = 6;
                    break;
                case 6:
                    c02033v = c02033v;
                    if (!c02033v.A09) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    if (i <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02033v = c02033v;
                    c4v = c4v;
                    if (!c02033v.A05(c4v)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    t2 = t2;
                    c4o = c4o;
                    c02033v = c02033v;
                    c4v = c4v;
                    c02023u = c02023u;
                    c02023u.A00();
                    t2.A2H(c4o, c4v, c02033v, c02023u);
                    if (!c02023u.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return i2 - c02033v.A00;
                case 11:
                    c02033v = c02033v;
                    c02023u = c02023u;
                    c02033v.A06 += c02023u.A00 * c02033v.A05;
                    if (!c02023u.A03) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    t2 = t2;
                    if (t2.A07.A08 != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c4v = c4v;
                    if (!c4v.A07()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 14:
                    c02033v = c02033v;
                    c02023u = c02023u;
                    c02033v.A00 -= c02023u.A00;
                    i -= c02023u.A00;
                    c2 = 15;
                    break;
                case 15:
                    c02033v = c02033v;
                    if (c02033v.A07 == Integer.MIN_VALUE) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c02033v = c02033v;
                    c02023u = c02023u;
                    c02033v.A07 += c02023u.A00;
                    if (c02033v.A00 >= 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c02033v = c02033v;
                    c02033v.A07 += c02033v.A00;
                    c2 = 18;
                    break;
                case 18:
                    t2 = t2;
                    c4o = c4o;
                    c02033v = c02033v;
                    t2.A0e(c4o, c02033v);
                    c2 = 19;
                    break;
                case 19:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c02023u = c02023u;
                    if (!c02023u.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
            }
        }
    }

    private int A09(C4V c4v) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C4Z.A00(c4v, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(C4V c4v) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C4Z.A02(c4v, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0B(C4V c4v) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C4Z.A01(c4v, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(C4V c4v) {
        if (c4v.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        T2 t2 = this;
        int iA0W = 0;
        char c2 = t2.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iA0W = 0;
                    c2 = 3;
                    break;
                case 3:
                    return t2.A0t(iA0W);
                case 4:
                    t2 = t2;
                    iA0W = t2.A0W() - 1;
                    c2 = 3;
                    break;
            }
        }
    }

    private View A0E() {
        T2 t2 = this;
        int iA0W = 0;
        char c2 = t2.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    iA0W = t2.A0W() - 1;
                    c2 = 3;
                    break;
                case 3:
                    return t2.A0t(iA0W);
                case 4:
                    iA0W = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    private final View A0F(int preferredBoundsFlag, int acceptableBoundsFlag) {
        T2 t2 = this;
        View viewA00 = null;
        char c2 = 0;
        int i = 0;
        int i2 = 0;
        t2.A2D();
        char c3 = acceptableBoundsFlag > preferredBoundsFlag ? (char) 2 : (char) 5;
        while (true) {
            switch (c3) {
                case 2:
                    c2 = 1;
                    c3 = 3;
                    break;
                case 3:
                    if (c2 != 0) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    return t2.A0t(preferredBoundsFlag);
                case 5:
                    if (acceptableBoundsFlag >= preferredBoundsFlag) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    c2 = 65535;
                    c3 = 3;
                    break;
                case 7:
                    c2 = 0;
                    c3 = 3;
                    break;
                case '\b':
                    t2 = t2;
                    if (t2.A04.A0F(t2.A0t(preferredBoundsFlag)) >= t2.A04.A0A()) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    i = 16644;
                    i2 = 16388;
                    c3 = '\n';
                    break;
                case '\n':
                    t2 = t2;
                    if (t2.A00 != 0) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    t2 = t2;
                    viewA00 = ((C4G) t2).A04.A00(preferredBoundsFlag, acceptableBoundsFlag, i, i2);
                    c3 = '\f';
                    break;
                case '\f':
                    return viewA00;
                case '\r':
                    t2 = t2;
                    viewA00 = ((C4G) t2).A05.A00(preferredBoundsFlag, acceptableBoundsFlag, i, i2);
                    c3 = '\f';
                    break;
                case 14:
                    i = 4161;
                    i2 = 4097;
                    c3 = '\n';
                    break;
            }
        }
    }

    private final View A0G(int acceptableBoundsFlag, int i, boolean z, boolean z2) {
        T2 t2 = this;
        View viewA00 = null;
        int i2 = 0;
        t2.A2D();
        int i3 = 0;
        char c2 = z ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    i2 = 24579;
                    c2 = 3;
                    break;
                case 3:
                    if (!z2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = 320;
                    c2 = 5;
                    break;
                case 5:
                    t2 = t2;
                    if (t2.A00 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    t2 = t2;
                    viewA00 = ((C4G) t2).A04.A00(acceptableBoundsFlag, i, i2, i3);
                    c2 = 7;
                    break;
                case 7:
                    return viewA00;
                case '\b':
                    t2 = t2;
                    viewA00 = ((C4G) t2).A05.A00(acceptableBoundsFlag, i, i2, i3);
                    c2 = 7;
                    break;
                case '\t':
                    i2 = 320;
                    c2 = 3;
                    break;
            }
        }
    }

    private View A0H(C4O c4o, C4V c4v) {
        return A0F(0, A0W());
    }

    private View A0J(C4O c4o, C4V c4v) {
        return A2C(c4o, c4v, 0, A0W(), c4v.A03());
    }

    private View A0K(C4O c4o, C4V c4v) {
        return A0F(A0W() - 1, -1);
    }

    private View A0L(C4O c4o, C4V c4v) {
        return A2C(c4o, c4v, A0W() - 1, -1, c4v.A03());
    }

    private View A0M(C4O c4o, C4V c4v) {
        T2 t2 = this;
        View viewA0K = null;
        char c2 = t2.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0K = t2.A0H(c4o, c4v);
                    c2 = 3;
                    break;
                case 3:
                    return viewA0K;
                case 4:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0K = t2.A0K(c4o, c4v);
                    c2 = 3;
                    break;
            }
        }
    }

    private View A0N(C4O c4o, C4V c4v) {
        T2 t2 = this;
        View viewA0H = null;
        char c2 = t2.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0H = t2.A0K(c4o, c4v);
                    c2 = 3;
                    break;
                case 3:
                    return viewA0H;
                case 4:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0H = t2.A0H(c4o, c4v);
                    c2 = 3;
                    break;
            }
        }
    }

    private View A0O(C4O c4o, C4V c4v) {
        T2 t2 = this;
        View viewA0L = null;
        char c2 = t2.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0L = t2.A0J(c4o, c4v);
                    c2 = 3;
                    break;
                case 3:
                    return viewA0L;
                case 4:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0L = t2.A0L(c4o, c4v);
                    c2 = 3;
                    break;
            }
        }
    }

    private View A0P(C4O c4o, C4V c4v) {
        T2 t2 = this;
        View viewA0J = null;
        char c2 = t2.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0J = t2.A0L(c4o, c4v);
                    c2 = 3;
                    break;
                case 3:
                    return viewA0J;
                case 4:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0J = t2.A0J(c4o, c4v);
                    c2 = 3;
                    break;
            }
        }
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0G(0, A0W(), z, z2);
        }
        return A0G(A0W() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0G(A0W() - 1, -1, z, z2);
        }
        return A0G(0, A0W(), z, z2);
    }

    private final C02033v A0S() {
        return new C02033v();
    }

    private void A0U() {
        T2 t2 = this;
        char c2 = t2.A00 != 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    if (!t2.A2J()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    t2 = t2;
                    t2.A05 = t2.A0A;
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    t2 = t2;
                    t2.A05 = !t2.A0A;
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0W(int i, int i2) {
        int i3 = 0;
        this.A07.A00 = this.A04.A07() - i2;
        C02033v c02033v = this.A07;
        char c2 = this.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = -1;
                    c2 = 3;
                    break;
                case 3:
                    c02033v.A03 = i3;
                    C02033v c02033v2 = this.A07;
                    c02033v2.A01 = i;
                    c02033v2.A05 = 1;
                    c02033v2.A06 = i2;
                    c02033v2.A07 = RecyclerView.UNDEFINED_DURATION;
                    return;
                case 4:
                    i3 = 1;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0X(int i, int i2) {
        int i3 = 0;
        this.A07.A00 = i2 - this.A04.A0A();
        C02033v c02033v = this.A07;
        c02033v.A01 = i;
        char c2 = this.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 1;
                    c2 = 3;
                    break;
                case 3:
                    c02033v.A03 = i3;
                    C02033v c02033v2 = this.A07;
                    c02033v2.A05 = -1;
                    c02033v2.A06 = i2;
                    c02033v2.A07 = RecyclerView.UNDEFINED_DURATION;
                    return;
                case 4:
                    i3 = -1;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0Y(int i, int i2, boolean z, C4V c4v) {
        T2 t2 = this;
        C02033v c02033v = null;
        C02033v c02033v2 = null;
        int iA0A = 0;
        View viewA0D = null;
        View viewA0E = null;
        C02033v c02033v3 = null;
        t2.A07.A09 = t2.A0i();
        t2.A07.A02 = t2.A0C(c4v);
        C02033v c02033v4 = t2.A07;
        c02033v4.A05 = i;
        int i3 = -1;
        char c2 = i == 1 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    c02033v4 = c02033v4;
                    c02033v4.A02 += t2.A04.A08();
                    viewA0D = t2.A0D();
                    c02033v3 = t2.A07;
                    if (!t2.A05) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    t2 = t2;
                    viewA0D = viewA0D;
                    c02033v3 = c02033v3;
                    c02033v3.A03 = i3;
                    t2.A07.A01 = t2.A0p(viewA0D) + t2.A07.A03;
                    t2.A07.A06 = t2.A04.A0C(viewA0D);
                    iA0A = t2.A04.A0C(viewA0D) - t2.A04.A07();
                    c2 = 4;
                    break;
                case 4:
                    t2 = t2;
                    c02033v2 = t2.A07;
                    c02033v2.A00 = i2;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02033v2 = c02033v2;
                    c02033v2.A00 -= iA0A;
                    c2 = 6;
                    break;
                case 6:
                    t2.A07.A07 = iA0A;
                    return;
                case 7:
                    i3 = 1;
                    c2 = 3;
                    break;
                case '\b':
                    t2 = t2;
                    viewA0E = t2.A0E();
                    t2.A07.A02 += t2.A04.A0A();
                    c02033v = t2.A07;
                    if (!t2.A05) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i3 = 1;
                    c2 = '\n';
                    break;
                case '\n':
                    t2 = t2;
                    viewA0E = viewA0E;
                    c02033v = c02033v;
                    c02033v.A03 = i3;
                    t2.A07.A01 = t2.A0p(viewA0E) + t2.A07.A03;
                    t2.A07.A06 = t2.A04.A0F(viewA0E);
                    iA0A = (-t2.A04.A0F(viewA0E)) + t2.A04.A0A();
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0Z(C02013t c02013t) {
        A0W(c02013t.A01, c02013t.A00);
    }

    private void A0a(C02013t c02013t) {
        A0X(c02013t.A01, c02013t.A00);
    }

    private void A0b(C4O c4o, int i) {
        T2 t2 = this;
        View child = null;
        int i2 = 0;
        View viewA0t = null;
        int i3 = 0;
        int iA06 = 0;
        int iA0W = t2.A0W();
        char c2 = i < 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    t2 = t2;
                    iA06 = t2.A04.A06() - i;
                    if (!t2.A05) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i3 >= iA0W) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    t2 = t2;
                    viewA0t = t2.A0t(i3);
                    if (t2.A04.A0F(viewA0t) < iA06) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    t2 = t2;
                    viewA0t = viewA0t;
                    if (t2.A04.A0H(viewA0t) >= iA06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    t2.A0d(c4o, 0, i3);
                    return;
                case '\t':
                    i3++;
                    c2 = 5;
                    break;
                case '\n':
                    i2 = iA0W - 1;
                    c2 = 11;
                    break;
                case 11:
                    if (i2 < 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    t2 = t2;
                    child = t2.A0t(i2);
                    if (t2.A04.A0F(child) < iA06) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    t2 = t2;
                    child = child;
                    if (t2.A04.A0H(child) >= iA06) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    t2.A0d(c4o, iA0W - 1, i2);
                    return;
                case 15:
                    i2--;
                    c2 = 11;
                    break;
                case 16:
                    return;
            }
        }
    }

    private void A0c(C4O c4o, int i) {
        T2 t2 = this;
        View child = null;
        int i2 = 0;
        View viewA0t = null;
        int iA0W = 0;
        int i3 = 0;
        int i4 = 0;
        char c2 = i < 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    t2 = t2;
                    i4 = i;
                    iA0W = t2.A0W();
                    if (!t2.A05) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = iA0W - 1;
                    c2 = 5;
                    break;
                case 5:
                    if (i3 < 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    t2 = t2;
                    viewA0t = t2.A0t(i3);
                    if (t2.A04.A0C(viewA0t) > i4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    t2 = t2;
                    viewA0t = viewA0t;
                    if (t2.A04.A0G(viewA0t) <= i4) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    t2.A0d(c4o, iA0W - 1, i3);
                    return;
                case '\t':
                    i3--;
                    c2 = 5;
                    break;
                case '\n':
                    i2 = 0;
                    c2 = 11;
                    break;
                case 11:
                    if (i2 >= iA0W) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    t2 = t2;
                    child = t2.A0t(i2);
                    if (t2.A04.A0C(child) > i4) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    t2 = t2;
                    child = child;
                    if (t2.A04.A0G(child) <= i4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    t2.A0d(c4o, 0, i2);
                    return;
                case 15:
                    i2++;
                    c2 = 11;
                    break;
                case 16:
                    return;
            }
        }
    }

    private void A0d(C4O c4o, int i, int i2) {
        T2 t2 = this;
        int i3 = 0;
        int i4 = 0;
        char c2 = i == i2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (i2 <= i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i4 = i2 - 1;
                    c2 = 5;
                    break;
                case 5:
                    if (i4 < i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    t2 = t2;
                    c4o = c4o;
                    t2.A14(i4, c4o);
                    i4--;
                    c2 = 5;
                    break;
                case 7:
                    i3 = i;
                    c2 = '\b';
                    break;
                case '\b':
                    if (i3 <= i2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    t2 = t2;
                    c4o = c4o;
                    t2.A14(i3, c4o);
                    i3--;
                    c2 = '\b';
                    break;
                case '\n':
                    return;
            }
        }
    }

    private void A0e(C4O c4o, C02033v c02033v) {
        T2 t2 = this;
        char c2 = c02033v.A0B ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02033v = c02033v;
                    if (!c02033v.A09) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c02033v = c02033v;
                    if (c02033v.A05 != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    t2 = t2;
                    c4o = c4o;
                    c02033v = c02033v;
                    t2.A0b(c4o, c02033v.A07);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    t2 = t2;
                    c4o = c4o;
                    c02033v = c02033v;
                    t2.A0c(c4o, c02033v.A07);
                    c2 = 6;
                    break;
            }
        }
    }

    private void A0f(C4O c4o, C4V c4v, int i, int i2) {
        C4O c4o2 = c4o;
        C4V c4v2 = c4v;
        T2 t2 = this;
        boolean z = false;
        int i3 = 0;
        int size = 0;
        int iA0p = 0;
        List<C4Y> listA0J = null;
        C4Y c4y = null;
        boolean z2 = false;
        char c2 = 0;
        char c3 = 0;
        int iA0D = 0;
        int iA0D2 = 0;
        T2 t22 = t2;
        C4O c4o3 = c4o2;
        C4V c4v3 = c4v2;
        int i4 = c4v2.A08() ? 2 : 5;
        while (true) {
            switch (i4) {
                case 2:
                    t2 = t2;
                    if (t2.A0W() == 0) {
                        i4 = 5;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    c4v2 = c4v2;
                    if (!c4v2.A07()) {
                        i4 = 4;
                        break;
                    } else {
                        i4 = 5;
                        break;
                    }
                case 4:
                    t2 = t2;
                    if (!t2.A26()) {
                        i4 = 5;
                        break;
                    } else {
                        i4 = 6;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c4o2 = c4o2;
                    t22 = t22;
                    iA0D = 0;
                    iA0D2 = 0;
                    listA0J = c4o2.A0J();
                    size = listA0J.size();
                    z = false;
                    iA0p = t22.A0p(t22.A0t(0));
                    i3 = 0;
                    i4 = 7;
                    break;
                case 7:
                    if (i3 >= size) {
                        i4 = 18;
                        break;
                    } else {
                        i4 = 8;
                        break;
                    }
                case 8:
                    listA0J = listA0J;
                    c4y = listA0J.get(i3);
                    if (!c4y.A0c()) {
                        i4 = 10;
                        break;
                    } else {
                        i4 = 9;
                        break;
                    }
                case 9:
                    i3++;
                    i4 = 7;
                    break;
                case 10:
                    c4y = c4y;
                    c2 = 1;
                    if (c4y.A0I() >= iA0p) {
                        i4 = 16;
                        break;
                    } else {
                        i4 = 11;
                        break;
                    }
                case 11:
                    z2 = true;
                    i4 = 12;
                    break;
                case 12:
                    t22 = t22;
                    c3 = 65535;
                    if (z2 == t22.A05) {
                        i4 = 14;
                        break;
                    } else {
                        i4 = 13;
                        break;
                    }
                case 13:
                    c2 = 65535;
                    i4 = 14;
                    break;
                case 14:
                    if (c2 != c3) {
                        i4 = 17;
                        break;
                    } else {
                        i4 = 15;
                        break;
                    }
                case 15:
                    t22 = t22;
                    c4y = c4y;
                    iA0D += t22.A04.A0D(c4y.A0H);
                    i4 = 9;
                    break;
                case 16:
                    z2 = false;
                    i4 = 12;
                    break;
                case 17:
                    t22 = t22;
                    c4y = c4y;
                    iA0D2 += t22.A04.A0D(c4y.A0H);
                    i4 = 9;
                    break;
                case 18:
                    t22 = t22;
                    listA0J = listA0J;
                    t22.A07.A08 = listA0J;
                    if (iA0D <= 0) {
                        i4 = 20;
                        break;
                    } else {
                        i4 = 19;
                        break;
                    }
                case 19:
                    t2 = t2;
                    t22 = t22;
                    c4o3 = c4o3;
                    c4v3 = c4v3;
                    t22.A0X(t22.A0p(t2.A0E()), i);
                    C02033v c02033v = t22.A07;
                    c02033v.A02 = iA0D;
                    c02033v.A00 = z ? 1 : 0;
                    c02033v.A04();
                    t22.A08(c4o3, t22.A07, c4v3, z);
                    i4 = 20;
                    break;
                case 20:
                    if (iA0D2 <= 0) {
                        i4 = 22;
                        break;
                    } else {
                        i4 = 21;
                        break;
                    }
                case 21:
                    t2 = t2;
                    t22 = t22;
                    c4o3 = c4o3;
                    c4v3 = c4v3;
                    t22.A0W(t22.A0p(t2.A0D()), i2);
                    C02033v c02033v2 = t22.A07;
                    c02033v2.A02 = iA0D2;
                    c02033v2.A00 = z ? 1 : 0;
                    c02033v2.A04();
                    t22.A08(c4o3, t22.A07, c4v3, z);
                    i4 = 22;
                    break;
                case 22:
                    t22.A07.A08 = null;
                    return;
            }
        }
    }

    private void A0g(C4O c4o, C4V c4v, C02013t c02013t) {
        T2 t2 = this;
        int iA03 = 0;
        char c2 = t2.A0k(c4v, c02013t) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    c02013t = c02013t;
                    if (!t2.A0j(c4o, c4v, c02013t)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A02();
                    if (!t2.A0C) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4v = c4v;
                    iA03 = c4v.A03() - 1;
                    c2 = 7;
                    break;
                case 7:
                    c02013t.A01 = iA03;
                    return;
                case '\b':
                    iA03 = 0;
                    c2 = 7;
                    break;
            }
        }
    }

    private final void A0h(boolean z) {
        A22(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        T2 t2 = this;
        boolean z = false;
        char c2 = t2.A04.A09() == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    if (t2.A04.A06() != 0) {
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

    private boolean A0j(C4O c4o, C4V c4v, C02013t c02013t) {
        T2 t2 = this;
        int iA0A = 0;
        View viewA0P = null;
        boolean z = false;
        View viewA0s = null;
        boolean z2 = false;
        char c2 = t2.A0W() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    t2 = t2;
                    viewA0s = t2.A0s();
                    z = true;
                    if (viewA0s == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4v = c4v;
                    c02013t = c02013t;
                    viewA0s = viewA0s;
                    if (!c02013t.A06(viewA0s, c4v)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02013t.A05(viewA0s);
                    return z;
                case 6:
                    t2 = t2;
                    if (t2.A08 == t2.A0C) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    c02013t = c02013t;
                    if (!c02013t.A02) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0P = t2.A0O(c4o, c4v);
                    c2 = '\n';
                    break;
                case '\n':
                    viewA0P = viewA0P;
                    if (viewA0P == null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4v = c4v;
                    c02013t = c02013t;
                    viewA0P = viewA0P;
                    c02013t.A04(viewA0P);
                    if (!c4v.A07()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case '\f':
                    t2 = t2;
                    if (!t2.A26()) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    t2 = t2;
                    viewA0P = viewA0P;
                    if (t2.A04.A0F(viewA0P) >= t2.A04.A07()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    t2 = t2;
                    viewA0P = viewA0P;
                    if (t2.A04.A0C(viewA0P) >= t2.A04.A0A()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z2 = true;
                    c2 = 16;
                    break;
                case 16:
                    if (!z2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c02013t = c02013t;
                    if (!c02013t.A02) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    t2 = t2;
                    iA0A = t2.A04.A07();
                    c2 = 19;
                    break;
                case 19:
                    c02013t = c02013t;
                    c02013t.A00 = iA0A;
                    c2 = 20;
                    break;
                case 20:
                    return z;
                case 21:
                    t2 = t2;
                    iA0A = t2.A04.A0A();
                    c2 = 19;
                    break;
                case 22:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0P = t2.A0P(c4o, c4v);
                    c2 = '\n';
                    break;
                case 23:
                    return false;
            }
        }
    }

    private boolean A0k(C4V c4v, C02013t c02013t) {
        T2 t2 = this;
        View viewA1q = null;
        boolean z = false;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int iA0C = 0;
        int i3 = 0;
        boolean z3 = false;
        char c2 = !c4v.A07() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    i2 = t2.A01;
                    i3 = -1;
                    if (i2 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    i = RecyclerView.UNDEFINED_DURATION;
                    if (i2 < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4v = c4v;
                    if (i2 < c4v.A03()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    T2 t22 = t2;
                    t22.A01 = i3;
                    t22.A02 = i;
                    return false;
                case 7:
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A01 = t2.A01;
                    linearLayoutManager$SavedState = t2.A03;
                    z = true;
                    if (linearLayoutManager$SavedState == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    if (!linearLayoutManager$SavedState.A01()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A02 = t2.A03.A02;
                    if (!c02013t.A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A00 = t2.A04.A07() - t2.A03.A00;
                    c2 = 11;
                    break;
                case 11:
                    return z;
                case '\f':
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A00 = t2.A04.A0A() + t2.A03.A00;
                    c2 = 11;
                    break;
                case '\r':
                    t2 = t2;
                    if (t2.A02 != i) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    t2 = t2;
                    viewA1q = t2.A1q(t2.A01);
                    if (viewA1q == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    t2 = t2;
                    viewA1q = viewA1q;
                    if (t2.A04.A0D(viewA1q) <= t2.A04.A0B()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c02013t.A02();
                    return z;
                case 17:
                    t2 = t2;
                    viewA1q = viewA1q;
                    if (t2.A04.A0F(viewA1q) - t2.A04.A0A() >= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    C02013t c02013t2 = c02013t;
                    c02013t2.A00 = t2.A04.A0A();
                    c02013t2.A02 = false;
                    return z;
                case 19:
                    t2 = t2;
                    viewA1q = viewA1q;
                    if (t2.A04.A07() - t2.A04.A0C(viewA1q) >= 0) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    C02013t c02013t3 = c02013t;
                    c02013t3.A00 = t2.A04.A07();
                    c02013t3.A02 = z;
                    return z;
                case 21:
                    t2 = t2;
                    if (t2.A0W() <= 0) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    t2 = t2;
                    z3 = false;
                    if (t2.A01 >= t2.A0p(t2.A0t(0))) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    z2 = true;
                    c2 = 24;
                    break;
                case 24:
                    t2 = t2;
                    if (z2 != t2.A05) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    z3 = true;
                    c2 = 26;
                    break;
                case 26:
                    c02013t = c02013t;
                    c02013t.A02 = z3;
                    c2 = 27;
                    break;
                case 27:
                    c02013t = c02013t;
                    c02013t.A02();
                    c2 = ' ';
                    break;
                case 28:
                    z2 = false;
                    c2 = 24;
                    break;
                case 29:
                    c02013t = c02013t;
                    if (!c02013t.A02) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    t2 = t2;
                    viewA1q = viewA1q;
                    iA0C = t2.A04.A0C(viewA1q) + t2.A04.A05();
                    c2 = 31;
                    break;
                case 31:
                    c02013t = c02013t;
                    c02013t.A00 = iA0C;
                    c2 = ' ';
                    break;
                case ' ':
                    return z;
                case '!':
                    t2 = t2;
                    viewA1q = viewA1q;
                    iA0C = t2.A04.A0F(viewA1q);
                    c2 = 31;
                    break;
                case '\"':
                    t2 = t2;
                    c02013t = c02013t;
                    boolean z4 = t2.A05;
                    c02013t.A02 = z4;
                    if (!z4) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A00 = t2.A04.A07() - t2.A02;
                    c2 = '$';
                    break;
                case '$':
                    return z;
                case '%':
                    t2 = t2;
                    c02013t = c02013t;
                    c02013t.A00 = t2.A04.A0A() + t2.A02;
                    c2 = '$';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public int A1h(int i, C4O c4o, C4V c4v) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c4o, c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public int A1i(int i, C4O c4o, C4V c4v) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i, c4o, c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final int A1j(C4V c4v) {
        return A09(c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final int A1k(C4V c4v) {
        return A0A(c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final int A1l(C4V c4v) {
        return A0B(c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final int A1m(C4V c4v) {
        return A09(c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final int A1n(C4V c4v) {
        return A0A(c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final int A1o(C4V c4v) {
        return A0B(c4v);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final Parcelable A1p() {
        T2 t2 = this;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = null;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = t2.A03;
        char c2 = linearLayoutManager$SavedState2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState2);
                case 3:
                    t2 = t2;
                    linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
                    if (t2.A0W() <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    t2 = t2;
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    t2.A2D();
                    boolean z = t2.A08 ^ t2.A05;
                    linearLayoutManager$SavedState.A02 = z;
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    t2 = t2;
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    View viewA0D = t2.A0D();
                    linearLayoutManager$SavedState.A00 = t2.A04.A07() - t2.A04.A0C(viewA0D);
                    linearLayoutManager$SavedState.A01 = t2.A0p(viewA0D);
                    c2 = 6;
                    break;
                case 6:
                    return linearLayoutManager$SavedState;
                case 7:
                    t2 = t2;
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    View viewA0E = t2.A0E();
                    linearLayoutManager$SavedState.A01 = t2.A0p(viewA0E);
                    linearLayoutManager$SavedState.A00 = t2.A04.A0F(viewA0E) - t2.A04.A0A();
                    c2 = 6;
                    break;
                case '\b':
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    linearLayoutManager$SavedState.A00();
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    @Nullable
    public final View A1q(int firstChild) {
        T2 t2 = this;
        int iA0p = 0;
        View viewA0t = null;
        int iA0W = t2.A0W();
        int viewPosition = iA0W == 0 ? 2 : 3;
        while (true) {
            switch (viewPosition) {
                case 2:
                    return (View) null;
                case 3:
                    t2 = t2;
                    iA0p = firstChild - t2.A0p(t2.A0t(0));
                    if (iA0p < 0) {
                        viewPosition = 7;
                        break;
                    } else {
                        viewPosition = 4;
                        break;
                    }
                case 4:
                    if (iA0p >= iA0W) {
                        viewPosition = 7;
                        break;
                    } else {
                        viewPosition = 5;
                        break;
                    }
                case 5:
                    t2 = t2;
                    viewA0t = t2.A0t(iA0p);
                    if (t2.A0p(viewA0t) != firstChild) {
                        viewPosition = 7;
                        break;
                    } else {
                        viewPosition = 6;
                        break;
                    }
                case 6:
                    return viewA0t;
                case 7:
                    return super.A1q(firstChild);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public View A1r(View view, int i, C4O c4o, C4V c4v) {
        T2 t2 = this;
        int i2 = 0;
        int i3 = 0;
        int iA2B = 0;
        View viewA0M = null;
        View viewA0E = null;
        t2.A0U();
        char c2 = t2.A0W() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (View) null;
                case 3:
                    t2 = t2;
                    iA2B = t2.A2B(i);
                    i3 = RecyclerView.UNDEFINED_DURATION;
                    if (iA2B != Integer.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (View) null;
                case 5:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    t2.A2D();
                    t2.A2D();
                    t2.A0Y(iA2B, (int) (t2.A04.A0B() * 0.33333334f), false, c4v);
                    C02033v c02033v = t2.A07;
                    c02033v.A07 = i3;
                    c02033v.A0B = false;
                    t2.A08(c4o, c02033v, c4v, true);
                    i2 = -1;
                    if (iA2B != -1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0M = t2.A0N(c4o, c4v);
                    c2 = 7;
                    break;
                case 7:
                    if (iA2B != i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    t2 = t2;
                    viewA0E = t2.A0E();
                    c2 = '\t';
                    break;
                case '\t':
                    viewA0E = viewA0E;
                    if (!viewA0E.hasFocusable()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    viewA0M = viewA0M;
                    if (viewA0M != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return (View) null;
                case '\f':
                    t2 = t2;
                    viewA0E = t2.A0D();
                    c2 = '\t';
                    break;
                case '\r':
                    t2 = t2;
                    c4o = c4o;
                    c4v = c4v;
                    viewA0M = t2.A0M(c4o, c4v);
                    c2 = 7;
                    break;
                case 14:
                    return viewA0E;
                case 15:
                    return viewA0M;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public C4H A1s() {
        return new C4H(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public void A1t(int i) {
        this.A01 = i;
        this.A02 = RecyclerView.UNDEFINED_DURATION;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A1u(int i, int i2, C4V c4v, C4E c4e) {
        T2 t2 = this;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        char c2 = t2.A00 == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = i;
                    c2 = 3;
                    break;
                case 3:
                    t2 = t2;
                    if (t2.A0W() == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i4 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    i4 = i2;
                    c2 = 3;
                    break;
                case 7:
                    t2 = t2;
                    t2.A2D();
                    z = true;
                    if (i4 <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i3 = 1;
                    c2 = '\t';
                    break;
                case '\t':
                    T2 t22 = t2;
                    C4V c4v2 = c4v;
                    t22.A0Y(i3, Math.abs(i4), z, c4v2);
                    t22.A2I(c4v2, t22.A07, c4e);
                    return;
                case '\n':
                    i3 = -1;
                    c2 = '\t';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A1v(int i, C4E c4e) {
        T2 t2 = this;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = t2.A03;
        int i5 = -1;
        int i6 = linearLayoutManager$SavedState != null ? 2 : 11;
        while (true) {
            switch (i6) {
                case 2:
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    if (!linearLayoutManager$SavedState.A01()) {
                        i6 = 11;
                        break;
                    } else {
                        i6 = 3;
                        break;
                    }
                case 3:
                    t2 = t2;
                    z = t2.A03.A02;
                    i2 = t2.A03.A01;
                    i6 = 4;
                    break;
                case 4:
                    if (!z) {
                        i6 = 10;
                        break;
                    } else {
                        i6 = 5;
                        break;
                    }
                case 5:
                    i4 = i2;
                    i3 = 0;
                    i6 = 6;
                    break;
                case 6:
                    t2 = t2;
                    int i7 = t2.A06;
                    if (i3 >= i7) {
                        i6 = 16;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case 7:
                    if (i4 < 0) {
                        i6 = 16;
                        break;
                    } else {
                        i6 = 8;
                        break;
                    }
                case 8:
                    if (i4 >= i) {
                        i6 = 16;
                        break;
                    } else {
                        i6 = 9;
                        break;
                    }
                case 9:
                    c4e = c4e;
                    c4e.A3I(i4, 0);
                    i4 += i5;
                    i3++;
                    i6 = 6;
                    break;
                case 10:
                    i5 = 1;
                    i6 = 5;
                    break;
                case 11:
                    t2 = t2;
                    t2.A0U();
                    z = t2.A05;
                    if (t2.A01 != i5) {
                        i6 = 15;
                        break;
                    } else {
                        i6 = 12;
                        break;
                    }
                case 12:
                    if (!z) {
                        i6 = 14;
                        break;
                    } else {
                        i6 = 13;
                        break;
                    }
                case 13:
                    i2 = i - 1;
                    i6 = 4;
                    break;
                case 14:
                    i2 = 0;
                    i6 = 4;
                    break;
                case 15:
                    t2 = t2;
                    i2 = t2.A01;
                    i6 = 4;
                    break;
                case 16:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A1w(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) parcelable;
            A0y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A1x(AccessibilityEvent accessibilityEvent) {
        super.A1x(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A28());
            accessibilityEvent.setToIndex(A29());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public void A1y(C4O c4o, C4V c4v) {
        C4V c4v2 = c4v;
        C4O c4o2 = c4o;
        T2 t2 = this;
        View viewA0s = null;
        int extraForEnd = 0;
        int extraForStart = 0;
        int startOffset = 0;
        int firstElement = 0;
        boolean z = false;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = null;
        int i = 0;
        int iA0C = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        View viewA1q = null;
        int iA0F = 0;
        int iA0A = 0;
        int i6 = -1;
        char c2 = t2.A03 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    if (t2.A01 == i6) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4v2 = c4v2;
                    if (c4v2.A03() != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    t2.A1I(c4o2);
                    return;
                case 5:
                    t2 = t2;
                    linearLayoutManager$SavedState = t2.A03;
                    if (linearLayoutManager$SavedState == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState;
                    if (!linearLayoutManager$SavedState.A01()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    t2 = t2;
                    t2.A01 = t2.A03.A01;
                    c2 = '\b';
                    break;
                case '\b':
                    t2 = t2;
                    t2.A2D();
                    z2 = false;
                    t2.A07.A0B = false;
                    t2.A0U();
                    viewA0s = t2.A0s();
                    z = true;
                    if (!t2.A0D.A03) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    t2 = t2;
                    if (t2.A01 != i6) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    t2 = t2;
                    if (t2.A03 == null) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A0D.A03();
                    C02013t c02013t = t2.A0D;
                    c02013t.A02 = t2.A05 ^ t2.A0C;
                    t2.A0g(c4o2, c4v2, c02013t);
                    t2.A0D.A03 = z;
                    c2 = '\f';
                    break;
                case '\f':
                    t2 = t2;
                    c4v2 = c4v2;
                    iA0C = t2.A0C(c4v2);
                    if (t2.A07.A04 < 0) {
                        c2 = '/';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    i = iA0C;
                    i3 = 0;
                    c2 = 14;
                    break;
                case 14:
                    t2 = t2;
                    c4v2 = c4v2;
                    iA0A = i3 + t2.A04.A0A();
                    firstElement = i + t2.A04.A08();
                    if (!c4v2.A07()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    t2 = t2;
                    i4 = t2.A01;
                    if (i4 == i6) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    t2 = t2;
                    if (t2.A02 == Integer.MIN_VALUE) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    t2 = t2;
                    viewA1q = t2.A1q(i4);
                    if (viewA1q == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    t2 = t2;
                    if (!t2.A05) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    t2 = t2;
                    viewA1q = viewA1q;
                    iA0F = (t2.A04.A07() - t2.A04.A0C(viewA1q)) - t2.A02;
                    c2 = 20;
                    break;
                case 20:
                    if (iA0F <= 0) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    iA0A += iA0F;
                    c2 = 22;
                    break;
                case 22:
                    t2 = t2;
                    if (!t2.A0D.A02) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    t2 = t2;
                    if (!t2.A05) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    i6 = 1;
                    c2 = 25;
                    break;
                case 25:
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A2G(c4o2, c4v2, t2.A0D, i6);
                    t2.A1H(c4o2);
                    t2.A07.A09 = t2.A0i();
                    t2.A07.A0A = c4v2.A07();
                    if (!t2.A0D.A02) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A0a(t2.A0D);
                    C02033v c02033v = t2.A07;
                    c02033v.A02 = iA0A;
                    t2.A08(c4o2, c02033v, c4v2, z2);
                    i2 = t2.A07.A06;
                    startOffset = t2.A07.A01;
                    if (t2.A07.A00 <= 0) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    t2 = t2;
                    firstElement += t2.A07.A00;
                    c2 = 28;
                    break;
                case 28:
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A0Z(t2.A0D);
                    C02033v c02033v2 = t2.A07;
                    c02033v2.A02 = firstElement;
                    c02033v2.A01 += t2.A07.A03;
                    t2.A08(c4o2, t2.A07, c4v2, z2);
                    i5 = t2.A07.A06;
                    if (t2.A07.A00 <= 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    int i7 = t2.A07.A00;
                    t2.A0X(startOffset, i2);
                    C02033v c02033v3 = t2.A07;
                    c02033v3.A02 = i7;
                    t2.A08(c4o2, c02033v3, c4v2, z2);
                    i2 = t2.A07.A06;
                    c2 = 30;
                    break;
                case 30:
                    extraForStart = i2;
                    c2 = 31;
                    break;
                case 31:
                    t2 = t2;
                    if (t2.A0W() <= 0) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    t2 = t2;
                    if (!(t2.A05 ^ t2.A0C)) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    int iA05 = t2.A05(i5, c4o2, c4v2, z);
                    int i8 = extraForStart + iA05;
                    int i9 = i5 + iA05;
                    int iA06 = t2.A06(i8, c4o2, c4v2, z2);
                    extraForStart = i8 + iA06;
                    i5 = i9 + iA06;
                    c2 = '\"';
                    break;
                case '\"':
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A0f(c4o2, c4v2, extraForStart, i5);
                    if (!c4v2.A07()) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '#':
                    t2 = t2;
                    t2.A04.A0I();
                    c2 = '$';
                    break;
                case '$':
                    T2 t22 = t2;
                    t22.A08 = t22.A0C;
                    return;
                case '%':
                    t2 = t2;
                    t2.A0D.A03();
                    c2 = '$';
                    break;
                case '&':
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    int iA062 = t2.A06(extraForStart, c4o2, c4v2, z);
                    int i10 = extraForStart + iA062;
                    int i11 = i5 + iA062;
                    int iA052 = t2.A05(i11, c4o2, c4v2, z2);
                    extraForStart = i10 + iA052;
                    i5 = i11 + iA052;
                    c2 = '\"';
                    break;
                case '\'':
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A0Z(t2.A0D);
                    C02033v c02033v4 = t2.A07;
                    c02033v4.A02 = firstElement;
                    t2.A08(c4o2, c02033v4, c4v2, z2);
                    i5 = t2.A07.A06;
                    extraForEnd = t2.A07.A01;
                    if (t2.A07.A00 <= 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    t2 = t2;
                    iA0A += t2.A07.A00;
                    c2 = ')';
                    break;
                case ')':
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    t2.A0a(t2.A0D);
                    C02033v c02033v5 = t2.A07;
                    c02033v5.A02 = iA0A;
                    int extraForStart2 = c02033v5.A01;
                    c02033v5.A01 = extraForStart2 + t2.A07.A03;
                    t2.A08(c4o2, t2.A07, c4v2, z2);
                    extraForStart = t2.A07.A06;
                    if (t2.A07.A00 <= 0) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    t2 = t2;
                    c4o2 = c4o2;
                    c4v2 = c4v2;
                    int i12 = t2.A07.A00;
                    t2.A0W(extraForEnd, i5);
                    C02033v c02033v6 = t2.A07;
                    c02033v6.A02 = i12;
                    t2.A08(c4o2, c02033v6, c4v2, z2);
                    i5 = t2.A07.A06;
                    c2 = 31;
                    break;
                case '+':
                    t2 = t2;
                    if (!t2.A05) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case ',':
                    i6 = 1;
                    c2 = 25;
                    break;
                case '-':
                    firstElement -= iA0F;
                    c2 = 22;
                    break;
                case '.':
                    t2 = t2;
                    viewA1q = viewA1q;
                    iA0F = t2.A02 - (t2.A04.A0F(viewA1q) - t2.A04.A0A());
                    c2 = 20;
                    break;
                case '/':
                    i3 = iA0C;
                    i = 0;
                    c2 = 14;
                    break;
                case '0':
                    viewA0s = viewA0s;
                    if (viewA0s == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '1';
                        break;
                    }
                case '1':
                    t2 = t2;
                    viewA0s = viewA0s;
                    if (t2.A04.A0F(viewA0s) >= t2.A04.A07()) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '2';
                        break;
                    }
                case '2':
                    t2 = t2;
                    viewA0s = viewA0s;
                    if (t2.A04.A0C(viewA0s) > t2.A04.A0A()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '3';
                        break;
                    }
                case '3':
                    t2 = t2;
                    viewA0s = viewA0s;
                    t2.A0D.A05(viewA0s);
                    c2 = '\f';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public void A1z(C4V c4v) {
        super.A1z(c4v);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = RecyclerView.UNDEFINED_DURATION;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A20(C0452Eq c0452Eq, C4O c4o) {
        super.A20(c0452Eq, c4o);
        if (this.A09) {
            A1I(c4o);
            c4o.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public void A21(C0452Eq c0452Eq, C4V c4v, int i) {
        T3 t3 = new T3(c0452Eq.getContext());
        t3.A0A(i);
        A1L(t3);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A22(String str) {
        if (this.A03 == null) {
            super.A22(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final boolean A23() {
        T2 t2 = this;
        boolean z = false;
        char c2 = t2.A0Y() != 1073741824 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    if (t2.A0i() == 1073741824) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    t2 = t2;
                    if (!t2.A1W()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final boolean A24() {
        boolean z = false;
        char c2 = this.A00 == 0 ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.C4G
    public final boolean A25() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public boolean A26() {
        T2 t2 = this;
        boolean z = false;
        char c2 = t2.A03 == null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    if (t2.A08 != t2.A0C) {
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

    public final int A27() {
        T2 t2 = this;
        int iA0p = 0;
        View viewA0G = t2.A0G(0, t2.A0W(), true, false);
        char c2 = viewA0G == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iA0p = -1;
                    c2 = 3;
                    break;
                case 3:
                    return iA0p;
                case 4:
                    t2 = t2;
                    viewA0G = viewA0G;
                    iA0p = t2.A0p(viewA0G);
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A28() {
        T2 t2 = this;
        int iA0p = 0;
        View viewA0G = t2.A0G(0, t2.A0W(), false, true);
        char c2 = viewA0G == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iA0p = -1;
                    c2 = 3;
                    break;
                case 3:
                    return iA0p;
                case 4:
                    t2 = t2;
                    viewA0G = viewA0G;
                    iA0p = t2.A0p(viewA0G);
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A29() {
        View viewA0G = A0G(A0W() - 1, -1, false, true);
        if (viewA0G == null) {
            return -1;
        }
        return A0p(viewA0G);
    }

    public final int A2A() {
        return this.A00;
    }

    public final int A2B(int i) {
        T2 t2 = this;
        int i2 = 0;
        int i3 = -1;
        int i4 = 1;
        char c2 = i != 1 ? (char) 2 : (char) 25;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = RecyclerView.UNDEFINED_DURATION;
                    if (i == 17) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 33) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 66) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 130) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return i2;
                case '\b':
                    t2 = t2;
                    if (t2.A00 != i4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i4;
                case '\n':
                    i4 = RecyclerView.UNDEFINED_DURATION;
                    c2 = '\t';
                    break;
                case 11:
                    t2 = t2;
                    if (t2.A00 != 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return i4;
                case '\r':
                    i4 = RecyclerView.UNDEFINED_DURATION;
                    c2 = '\f';
                    break;
                case 14:
                    t2 = t2;
                    if (t2.A00 != i4) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return i3;
                case 16:
                    i3 = RecyclerView.UNDEFINED_DURATION;
                    c2 = 15;
                    break;
                case 17:
                    t2 = t2;
                    if (t2.A00 != 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return i3;
                case 19:
                    i3 = RecyclerView.UNDEFINED_DURATION;
                    c2 = 18;
                    break;
                case 20:
                    t2 = t2;
                    if (t2.A00 != i4) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    return i4;
                case 22:
                    t2 = t2;
                    if (!t2.A2J()) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    return i3;
                case 24:
                    return i4;
                case 25:
                    t2 = t2;
                    if (t2.A00 != i4) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    return i3;
                case 27:
                    t2 = t2;
                    if (!t2.A2J()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    return i4;
                case 29:
                    return i3;
            }
        }
    }

    public View A2C(C4O c4o, C4V c4v, int boundsEnd, int diff, int i) {
        T2 t2 = this;
        int i2 = 0;
        View view = null;
        View viewA0t = null;
        int i3 = 0;
        int iA0p = 0;
        t2.A2D();
        View view2 = null;
        View view3 = null;
        int iA0A = t2.A04.A0A();
        int iA07 = t2.A04.A07();
        int i4 = diff > boundsEnd ? 2 : 15;
        while (true) {
            switch (i4) {
                case 2:
                    i2 = 1;
                    i4 = 3;
                    break;
                case 3:
                    i3 = boundsEnd;
                    i4 = 4;
                    break;
                case 4:
                    if (i3 == diff) {
                        i4 = 17;
                        break;
                    } else {
                        i4 = 5;
                        break;
                    }
                case 5:
                    t2 = t2;
                    viewA0t = t2.A0t(i3);
                    iA0p = t2.A0p(viewA0t);
                    if (iA0p < 0) {
                        i4 = 10;
                        break;
                    } else {
                        i4 = 6;
                        break;
                    }
                case 6:
                    if (iA0p >= i) {
                        i4 = 10;
                        break;
                    } else {
                        i4 = 7;
                        break;
                    }
                case 7:
                    viewA0t = viewA0t;
                    if (!((C4H) viewA0t.getLayoutParams()).A02()) {
                        i4 = 11;
                        break;
                    } else {
                        i4 = 8;
                        break;
                    }
                case 8:
                    if (view2 != null) {
                        i4 = 10;
                        break;
                    } else {
                        i4 = 9;
                        break;
                    }
                case 9:
                    viewA0t = viewA0t;
                    view2 = viewA0t;
                    i4 = 10;
                    break;
                case 10:
                    i3 += i2;
                    i4 = 4;
                    break;
                case 11:
                    t2 = t2;
                    viewA0t = viewA0t;
                    if (t2.A04.A0F(viewA0t) >= iA07) {
                        i4 = 13;
                        break;
                    } else {
                        i4 = 12;
                        break;
                    }
                case 12:
                    t2 = t2;
                    viewA0t = viewA0t;
                    if (t2.A04.A0C(viewA0t) >= iA0A) {
                        i4 = 16;
                        break;
                    } else {
                        i4 = 13;
                        break;
                    }
                case 13:
                    if (view3 != null) {
                        i4 = 10;
                        break;
                    } else {
                        i4 = 14;
                        break;
                    }
                case 14:
                    viewA0t = viewA0t;
                    view3 = viewA0t;
                    i4 = 10;
                    break;
                case 15:
                    i2 = -1;
                    i4 = 3;
                    break;
                case 16:
                    return viewA0t;
                case 17:
                    if (view3 == null) {
                        i4 = 20;
                        break;
                    } else {
                        i4 = 18;
                        break;
                    }
                case 18:
                    view = view3;
                    i4 = 19;
                    break;
                case 19:
                    return view;
                case 20:
                    view = view2;
                    i4 = 19;
                    break;
            }
        }
    }

    public final void A2D() {
        T2 t2 = this;
        char c2 = t2.A07 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    t2 = t2;
                    t2.A07 = t2.A0S();
                    c2 = 3;
                    break;
                case 3:
                    t2 = t2;
                    if (t2.A04 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    t2 = t2;
                    t2.A04 = AnonymousClass40.A02(t2, t2.A00);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A2E(int i) {
        T2 t2 = this;
        AnonymousClass40 anonymousClass40 = null;
        char c2 = i != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    t2 = t2;
                    anonymousClass40 = null;
                    t2.A22(null);
                    if (i != t2.A00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    T2 t22 = t2;
                    t22.A00 = i;
                    t22.A04 = anonymousClass40;
                    t22.A0y();
                    return;
                case 6:
                    throw new IllegalArgumentException(A0T(0, 20, 96) + i);
            }
        }
    }

    public final void A2F(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    public void A2G(C4O c4o, C4V c4v, C02013t c02013t, int i) {
    }

    public void A2H(C4O c4o, C4V c4v, C02033v c02033v, C02023u c02023u) {
        C02033v c02033v2 = c02033v;
        C02023u c02023u2 = c02023u;
        T2 t2 = this;
        boolean z = false;
        boolean z2 = false;
        int iA0E = 0;
        int i = 0;
        int i2 = 0;
        int top = 0;
        int iA0g = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        int iA0e = 0;
        C4H c4h = null;
        int i5 = 0;
        int i6 = 0;
        T2 t22 = t2;
        View viewA03 = c02033v2.A03(c4o);
        int bottom = viewA03 == null ? 2 : 3;
        while (true) {
            switch (bottom) {
                case 2:
                    c02023u2.A01 = true;
                    return;
                case 3:
                    c02033v2 = c02033v2;
                    viewA03 = viewA03;
                    c4h = (C4H) viewA03.getLayoutParams();
                    i2 = -1;
                    i4 = 0;
                    if (c02033v2.A08 != null) {
                        bottom = 24;
                        break;
                    } else {
                        bottom = 4;
                        break;
                    }
                case 4:
                    t22 = t22;
                    c02033v2 = c02033v2;
                    z3 = t22.A05;
                    int bottom2 = c02033v2.A05;
                    if (bottom2 != i2) {
                        bottom = 23;
                        break;
                    } else {
                        bottom = 5;
                        break;
                    }
                case 5:
                    z4 = true;
                    bottom = 6;
                    break;
                case 6:
                    if (z3 != z4) {
                        bottom = 22;
                        break;
                    } else {
                        bottom = 7;
                        break;
                    }
                case 7:
                    t22 = t22;
                    viewA03 = viewA03;
                    t22.A17(viewA03);
                    bottom = 8;
                    break;
                case 8:
                    t22 = t22;
                    c02023u2 = c02023u2;
                    viewA03 = viewA03;
                    t22.A1A(viewA03, i4, i4);
                    int bottom3 = t22.A04.A0D(viewA03);
                    c02023u2.A00 = bottom3;
                    int bottom4 = t22.A00;
                    if (bottom4 != 1) {
                        bottom = 19;
                        break;
                    } else {
                        bottom = 9;
                        break;
                    }
                case 9:
                    t2 = t2;
                    if (!t2.A2J()) {
                        bottom = 18;
                        break;
                    } else {
                        bottom = 10;
                        break;
                    }
                case 10:
                    t2 = t2;
                    t22 = t22;
                    viewA03 = viewA03;
                    int top2 = t2.A0h();
                    int bottom5 = t2.A0f();
                    top = top2 - bottom5;
                    int bottom6 = t22.A04.A0E(viewA03);
                    iA0e = top - bottom6;
                    bottom = 11;
                    break;
                case 11:
                    c02033v2 = c02033v2;
                    int bottom7 = c02033v2.A05;
                    if (bottom7 != i2) {
                        bottom = 17;
                        break;
                    } else {
                        bottom = 12;
                        break;
                    }
                case 12:
                    c02033v2 = c02033v2;
                    c02023u2 = c02023u2;
                    i3 = c02033v2.A06;
                    int i7 = c02033v2.A06;
                    int bottom8 = c02023u2.A00;
                    i = i7 - bottom8;
                    i5 = top;
                    i6 = iA0e;
                    bottom = 13;
                    break;
                case 13:
                    t2 = t2;
                    viewA03 = viewA03;
                    c4h = c4h;
                    t2.A1B(viewA03, i6, i, i5, i3);
                    if (!c4h.A02()) {
                        bottom = 14;
                        break;
                    } else {
                        bottom = 15;
                        break;
                    }
                case 14:
                    c4h = c4h;
                    if (!c4h.A01()) {
                        bottom = 16;
                        break;
                    } else {
                        bottom = 15;
                        break;
                    }
                case 15:
                    c02023u2 = c02023u2;
                    c02023u2.A03 = true;
                    bottom = 16;
                    break;
                case 16:
                    c02023u2.A02 = viewA03.hasFocusable();
                    return;
                case 17:
                    c02033v2 = c02033v2;
                    c02023u2 = c02023u2;
                    i = c02033v2.A06;
                    int i8 = c02033v2.A06;
                    int top3 = c02023u2.A00;
                    i3 = i8 + top3;
                    i5 = top;
                    i6 = iA0e;
                    bottom = 13;
                    break;
                case 18:
                    t2 = t2;
                    t22 = t22;
                    viewA03 = viewA03;
                    iA0e = t2.A0e();
                    int top4 = t22.A04.A0E(viewA03);
                    top = top4 + iA0e;
                    bottom = 11;
                    break;
                case 19:
                    t2 = t2;
                    t22 = t22;
                    c02033v2 = c02033v2;
                    viewA03 = viewA03;
                    iA0g = t2.A0g();
                    iA0E = t22.A04.A0E(viewA03) + iA0g;
                    if (c02033v2.A05 != i2) {
                        bottom = 21;
                        break;
                    } else {
                        bottom = 20;
                        break;
                    }
                case 20:
                    c02033v2 = c02033v2;
                    c02023u2 = c02023u2;
                    i5 = c02033v2.A06;
                    int i9 = c02033v2.A06;
                    int right = c02023u2.A00;
                    i6 = i9 - right;
                    i = iA0g;
                    i3 = iA0E;
                    bottom = 13;
                    break;
                case 21:
                    c02033v2 = c02033v2;
                    c02023u2 = c02023u2;
                    i6 = c02033v2.A06;
                    int i10 = c02033v2.A06;
                    int left = c02023u2.A00;
                    i5 = i10 + left;
                    i = iA0g;
                    i3 = iA0E;
                    bottom = 13;
                    break;
                case 22:
                    t22 = t22;
                    viewA03 = viewA03;
                    i4 = 0;
                    t22.A19(viewA03, 0);
                    bottom = 8;
                    break;
                case 23:
                    z4 = false;
                    bottom = 6;
                    break;
                case 24:
                    t22 = t22;
                    c02033v2 = c02033v2;
                    z2 = t22.A05;
                    int left2 = c02033v2.A05;
                    if (left2 != i2) {
                        bottom = 28;
                        break;
                    } else {
                        bottom = 25;
                        break;
                    }
                case 25:
                    z = true;
                    bottom = 26;
                    break;
                case 26:
                    if (z2 != z) {
                        bottom = 29;
                        break;
                    } else {
                        bottom = 27;
                        break;
                    }
                case 27:
                    t22 = t22;
                    viewA03 = viewA03;
                    t22.A16(viewA03);
                    bottom = 8;
                    break;
                case 28:
                    z = false;
                    bottom = 26;
                    break;
                case 29:
                    t22 = t22;
                    viewA03 = viewA03;
                    i4 = 0;
                    t22.A18(viewA03, 0);
                    bottom = 8;
                    break;
            }
        }
    }

    public void A2I(C4V c4v, C02033v c02033v, C4E c4e) {
        int i = c02033v.A01;
        char c2 = i >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4v = c4v;
                    if (i >= c4v.A03()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02033v = c02033v;
                    c4e = c4e;
                    c4e.A3I(i, Math.max(0, c02033v.A07));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final boolean A2J() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final PointF A44(int firstChildPos) {
        T2 t2 = this;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        char c2 = t2.A0W() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (PointF) null;
                case 3:
                    t2 = t2;
                    z = false;
                    i2 = 1;
                    if (firstChildPos >= t2.A0p(t2.A0t(0))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    t2 = t2;
                    if (z == t2.A05) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i2 = -1;
                    c2 = 7;
                    break;
                case 7:
                    t2 = t2;
                    i = i2;
                    if (t2.A00 != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return new PointF(i, 0.0f);
                case '\t':
                    return new PointF(0.0f, i);
            }
        }
    }
}
