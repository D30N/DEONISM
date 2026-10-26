package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01863e {
    public static byte[] A03;
    public final InterfaceC01853d A01;
    public final C01843c A00 = new C01843c();
    public final List<View> A02 = new ArrayList();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 6);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-107, -119, -47, -46, -51, -51, -50, -41, -119, -43, -46, -36, -35, -93, -36, -38, -31, -47, -42, -49, -120, -36, -41, -120, -35, -42, -48, -47, -52, -51, -120, -55, -120, -34, -47, -51, -33, -120, -36, -48, -55, -36, -120, -33, -55, -37, -120, -42, -41, -36, -120, -48, -47, -52, -52, -51, -42, -42, -55, -59, -41, Byte.MIN_VALUE, -55, -45, Byte.MIN_VALUE, -50, -49, -44, Byte.MIN_VALUE, -63, Byte.MIN_VALUE, -61, -56, -55, -52, -60, -116, Byte.MIN_VALUE, -61, -63, -50, -50, -49, -44, Byte.MIN_VALUE, -56, -55, -60, -59, Byte.MIN_VALUE};
    }

    public C01863e(InterfaceC01853d interfaceC01853d) {
        this.A01 = interfaceC01853d;
    }

    private int A00(int limit) {
        C01863e c01863e = this;
        int offset = 0;
        int removedBefore = 0;
        int diff = 0;
        char c2 = limit < 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    c01863e = c01863e;
                    removedBefore = c01863e.A01.A5f();
                    offset = limit;
                    c2 = 4;
                    break;
                case 4:
                    if (offset >= removedBefore) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01863e = c01863e;
                    diff = limit - (offset - c01863e.A00.A03(offset));
                    if (diff != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01863e = c01863e;
                    if (!c01863e.A00.A08(offset)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    offset++;
                    c2 = 6;
                    break;
                case '\b':
                    offset += diff;
                    c2 = 4;
                    break;
                case '\t':
                    return offset;
                case '\n':
                    return -1;
            }
        }
    }

    private void A03(View view) {
        this.A02.add(view);
        this.A01.A9W(view);
    }

    private boolean A04(View view) {
        if (this.A02.remove(view)) {
            this.A01.AA2(view);
            return true;
        }
        return false;
    }

    public final int A05() {
        return this.A01.A5f() - this.A02.size();
    }

    public final int A06() {
        return this.A01.A5f();
    }

    public final int A07(View view) {
        C01863e c01863e = this;
        int iA7S = c01863e.A01.A7S(view);
        char c2 = iA7S == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    c01863e = c01863e;
                    if (!c01863e.A00.A08(iA7S)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return -1;
                case 5:
                    return iA7S - c01863e.A00.A03(iA7S);
            }
        }
    }

    public final View A08(int i) {
        C01863e c01863e = this;
        C4Y holder = null;
        View view = null;
        int size = c01863e.A02.size();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01863e = c01863e;
                    view = c01863e.A02.get(i2);
                    holder = c01863e.A01.A5i(view);
                    if (holder.A0I() != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    holder = holder;
                    if (!holder.A0b()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    holder = holder;
                    if (!holder.A0c()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    return view;
                case 7:
                    i2++;
                    c2 = 2;
                    break;
                case '\b':
                    return (View) null;
            }
        }
    }

    public final View A09(int i) {
        return this.A01.A5e(A00(i));
    }

    public final View A0A(int i) {
        return this.A01.A5e(i);
    }

    public final void A0B() {
        C01863e c01863e = this;
        c01863e.A00.A04();
        int size = c01863e.A02.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01863e = c01863e;
                    c01863e.A01.AA2(c01863e.A02.get(size));
                    c01863e.A02.remove(size);
                    size--;
                    c2 = 2;
                    break;
                case 4:
                    c01863e.A01.ACR();
                    return;
            }
        }
    }

    public final void A0C(int i) {
        int iA00 = A00(i);
        this.A00.A09(iA00);
        this.A01.A4j(iA00);
    }

    public final void A0D(int i) {
        C01863e c01863e = this;
        int iA00 = c01863e.A00(i);
        View viewA5e = c01863e.A01.A5e(iA00);
        char c2 = viewA5e == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c01863e = c01863e;
                    if (!c01863e.A00.A09(iA00)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01863e = c01863e;
                    viewA5e = viewA5e;
                    c01863e.A04(viewA5e);
                    c2 = 5;
                    break;
                case 5:
                    c01863e.A01.ACV(iA00);
                    return;
            }
        }
    }

    public final void A0E(View view) {
        int iA7S = this.A01.A7S(view);
        if (iA7S >= 0) {
            this.A00.A06(iA7S);
            A03(view);
        } else {
            throw new IllegalArgumentException(A01(57, 33, 90) + view);
        }
    }

    public final void A0F(View view) {
        C01863e c01863e = this;
        int iA7S = c01863e.A01.A7S(view);
        char c2 = iA7S < 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c01863e = c01863e;
                    if (!c01863e.A00.A09(iA7S)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01863e = c01863e;
                    view = view;
                    c01863e.A04(view);
                    c2 = 5;
                    break;
                case 5:
                    c01863e.A01.ACV(iA7S);
                    return;
            }
        }
    }

    public final void A0G(View view) {
        C01863e c01863e = this;
        int iA7S = c01863e.A01.A7S(view);
        char c2 = iA7S >= 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01863e = c01863e;
                    if (!c01863e.A00.A08(iA7S)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    C01863e c01863e2 = c01863e;
                    c01863e2.A00.A05(iA7S);
                    c01863e2.A04(view);
                    return;
                case 4:
                    throw new RuntimeException(A01(14, 43, 98) + view);
                case 5:
                    throw new IllegalArgumentException(A01(57, 33, 90) + view);
            }
        }
    }

    public final void A0H(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        C01863e c01863e = this;
        int iA00 = 0;
        char c2 = i < 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c01863e = c01863e;
                    iA00 = c01863e.A01.A5f();
                    c2 = 3;
                    break;
                case 3:
                    c01863e = c01863e;
                    c01863e.A00.A07(iA00, z);
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01863e = c01863e;
                    view = view;
                    c01863e.A03(view);
                    c2 = 5;
                    break;
                case 5:
                    c01863e.A01.A3T(view, iA00, layoutParams);
                    return;
                case 6:
                    c01863e = c01863e;
                    iA00 = c01863e.A00(i);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0I(View view, int i, boolean z) {
        C01863e c01863e = this;
        int iA00 = 0;
        char c2 = i < 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c01863e = c01863e;
                    iA00 = c01863e.A01.A5f();
                    c2 = 3;
                    break;
                case 3:
                    c01863e = c01863e;
                    c01863e.A00.A07(iA00, z);
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01863e = c01863e;
                    view = view;
                    c01863e.A03(view);
                    c2 = 5;
                    break;
                case 5:
                    c01863e.A01.addView(view, iA00);
                    return;
                case 6:
                    c01863e = c01863e;
                    iA00 = c01863e.A00(i);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0J(View view, boolean z) {
        A0I(view, -1, z);
    }

    public final boolean A0K(View view) {
        return this.A02.contains(view);
    }

    public final boolean A0L(View view) {
        C01863e c01863e = this;
        int iA7S = c01863e.A01.A7S(view);
        char c2 = iA7S == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c01863e.A04(view);
                    return true;
                case 3:
                    c01863e = c01863e;
                    if (!c01863e.A00.A08(iA7S)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C01863e c01863e2 = c01863e;
                    c01863e2.A00.A09(iA7S);
                    c01863e2.A04(view);
                    c01863e2.A01.ACV(iA7S);
                    return true;
                case 5:
                    return false;
            }
        }
    }

    public final String toString() {
        return this.A00.toString() + A01(0, 14, 99) + this.A02.size();
    }
}
