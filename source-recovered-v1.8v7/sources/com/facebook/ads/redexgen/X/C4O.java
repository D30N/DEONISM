package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4O {
    public static byte[] A09;
    public C4N A01;
    public C4W A04;
    public final /* synthetic */ C0452Eq A08;
    public final ArrayList<C4Y> A05 = new ArrayList<>();
    public ArrayList<C4Y> A02 = null;
    public final ArrayList<C4Y> A06 = new ArrayList<>();
    public final List<C4Y> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A09 = new byte[]{20, 19, 6, 19, 2, 93, 34, 0, 13, 13, 4, 5, 65, 18, 2, 19, 0, 17, 65, 23, 8, 4, 22, 65, 22, 8, 21, 9, 65, 0, 15, 65, 8, 15, 23, 0, 13, 8, 5, 65, 23, 8, 4, 22, 79, 65, 40, 15, 23, 0, 13, 8, 5, 65, 23, 8, 4, 22, 18, 65, 2, 0, 15, 15, 14, 21, 65, 3, 4, 65, 19, 4, 20, 18, 4, 5, 65, 7, 19, 14, 12, 65, 18, 2, 19, 0, 17, 77, 65, 21, 9, 4, 24, 65, 18, 9, 14, 20, 13, 5, 65, 19, 4, 3, 14, 20, 15, 5, 65, 7, 19, 14, 12, 65, 19, 4, 2, 24, 2, 13, 4, 19, 65, 17, 14, 14, 13, 79, 120, Byte.MAX_VALUE, 111, 72, 69, 73, 72, 85, 79, 85, 82, 67, 72, 69, 95, 6, 66, 67, 82, 67, 69, 82, 67, 66, 8, 6, 111, 72, 80, 71, 74, 79, 66, 6, 79, 82, 67, 75, 6, 86, 73, 85, 79, 82, 79, 73, 72, 6, 33, 102, 111, 111, 122, 108, 125, 51, 120, 117, 109, 123, 97, 96, 52, 125, 122, 112, 113, 108, 52, 103, 124, 123, 97, 120, 112, 52, 122, 123, 96, 52, 118, 113, 52, 57, 37, 52, 117, 114, 96, 113, 102, 52, 97, 122, 124, 125, 112, 125, 122, 115, 52, 117, 52, 98, 125, 113, 99, 46, 71, 6, 54, 39, 52, 37, 37, 48, 49, 117, 58, 39, 117, 52, 33, 33, 52, 54, 61, 48, 49, 117, 35, 60, 48, 34, 38, 117, 56, 52, 44, 117, 59, 58, 33, 117, 55, 48, 117, 39, 48, 54, 44, 54, 57, 48, 49, 123, 117, 60, 38, 6, 54, 39, 52, 37, 111, 24, 63, 50, 62, 63, 34, 56, 34, 37, 52, 63, 50, 40, 113, 53, 52, 37, 52, 50, 37, 52, 53, Byte.MAX_VALUE, 113, 24, 63, 39, 48, 61, 56, 53, 113, 39, 56, 52, 38, 113, 57, 62, 61, 53, 52, 35, 113, 48, 53, 48, 33, 37, 52, 35, 113, 33, 62, 34, 56, 37, 56, 62, 63, 40, 17, 12, 92, 24, 25, 8, 29, 31, 20, 25, 24, 92, 10, 21, 25, 11, 92, 15, 20, 19, 9, 16, 24, 92, 30, 25, 92, 14, 25, 17, 19, 10, 25, 24, 92, 26, 14, 19, 17, 92, 46, 25, 31, 5, 31, 16, 25, 14, 42, 21, 25, 11, 92, 30, 25, 26, 19, 14, 25, 92, 21, 8, 92, 31, 29, 18, 92, 30, 25, 92, 14, 25, 31, 5, 31, 16, 25, 24, 70, 92, 43, 44, 34, 75, 118, 103, 111, 34, 97, 109, 119, 108, 118, 56, 53, 55, 38, 4, 59, 55, 37, 20, 61, 32, 2, 61, 33, 59, 38, 59, 61, 60, 19, 60, 54, 6, 43, 34, 55, 114, 32, 55, 38, 39, 32, 60, 55, 54, 114, 51, 114, 36, 59, 55, 37, 114, 38, 58, 51, 38, 114, 59, 33, 114, 59, 53, 60, 61, 32, 55, 54, 124, 114, 11, 61, 39, 114, 63, 39, 33, 38, 114, 49, 51, 62, 62, 114, 33, 38, 61, 34, 27, 53, 60, 61, 32, 59, 60, 53, 114, 48, 55, 52, 61, 32, 55, 114, 32, 55, 38, 39, 32, 60, 59, 60, 53, 114, 38, 58, 59, 33, 114, 36, 59, 55, 37, 124, 121, 94, 70, 81, 92, 89, 84, 16, 89, 68, 85, 93, 16, 64, 95, 67, 89, 68, 89, 95, 94, 16, 38, 0, 11, 27, 28, 21, 82, 6, 29, 82, 0, 23, 17, 11, 17, 30, 23, 82, 19, 28, 82, 27, 21, 28, 29, 0, 23, 22, 82, 4, 27, 23, 5, 82, 26, 29, 30, 22, 23, 0, 92, 82, 43, 29, 7, 82, 1, 26, 29, 7, 30, 22, 82, 20, 27, 0, 1, 6, 82, 17, 19, 30, 30, 82, 1, 6, 29, 2, 59, 21, 28, 29, 0, 27, 28, 21, 36, 27, 23, 5, 90, 4, 27, 23, 5, 91, 82, 16, 23, 20, 29, 0, 23, 82, 17, 19, 30, 30, 27, 28, 21, 82, 0, 23, 17, 11, 17, 30, 23, 92, 34, 32, 49, 19, 44, 32, 50, 3, 42, 55, 21, 42, 54, 44, 49, 44, 42, 43, 4, 43, 33, 17, 60, 53, 32, 101, 55, 32, 49, 48, 55, 43, 32, 33, 101, 36, 101, 51, 44, 32, 50, 101, 50, 45, 44, 38, 45, 101, 33, 42, 32, 54, 101, 43, 42, 49, 101, 45, 36, 51, 32, 101, 36, 101, 19, 44, 32, 50, 13, 42, 41, 33, 32, 55, 115, 58, 32, 18, 39, 39, 50, 48, 59, 54, 55, 105};
    }

    public C4O(C0452Eq c0452Eq) {
        this.A08 = c0452Eq;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final C4Y A01(int i) {
        C4O c4o = this;
        C4Y c4y = null;
        int i2 = 0;
        long jA04 = 0;
        int i3 = 0;
        C4Y c4y2 = null;
        int size = 0;
        int i4 = 0;
        int iA0D = 0;
        ArrayList<C4Y> arrayList = c4o.A02;
        char c2 = arrayList != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    arrayList = arrayList;
                    size = arrayList.size();
                    if (size != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (C4Y) null;
                case 4:
                    i4 = 0;
                    c2 = 5;
                    break;
                case 5:
                    i3 = 32;
                    if (i4 >= size) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4o = c4o;
                    c4y2 = c4o.A02.get(i4);
                    if (!c4y2.A0i()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 7:
                    c4y2 = c4y2;
                    if (c4y2.A0I() != i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    C4Y c4y3 = c4y2;
                    c4y3.A0T(i3);
                    return c4y3;
                case '\t':
                    i4++;
                    c2 = 5;
                    break;
                case '\n':
                    c4o = c4o;
                    if (!c4o.A08.A04.A0A()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4o = c4o;
                    iA0D = c4o.A08.A00.A0D(i);
                    if (iA0D <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c4o = c4o;
                    if (iA0D >= c4o.A08.A04.A0D()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c4o = c4o;
                    jA04 = c4o.A08.A04.A04(iA0D);
                    i2 = 0;
                    c2 = 14;
                    break;
                case 14:
                    if (i2 >= size) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c4o = c4o;
                    c4y = c4o.A02.get(i2);
                    if (!c4y.A0i()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 16:
                    c4y = c4y;
                    if (c4y.A0K() != jA04) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    C4Y c4y4 = c4y;
                    c4y4.A0T(i3);
                    return c4y4;
                case 18:
                    i2++;
                    c2 = 14;
                    break;
                case 19:
                    return (C4Y) null;
            }
        }
    }

    private final C4Y A02(int i, boolean z) {
        C4O c4o = this;
        C4Y holder = null;
        int i2 = 0;
        int size = 0;
        C4Y c4yA0E = null;
        int iA07 = 0;
        C4Y c4y = null;
        View viewA08 = null;
        int size2 = c4o.A05.size();
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= size2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4y = c4o.A05.get(i3);
                    if (!c4y.A0i()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 4:
                    c4y = c4y;
                    if (c4y.A0I() != i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4y = c4y;
                    if (!c4y.A0b()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 6:
                    c4o = c4o;
                    if (!c4o.A08.A0s.A09) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c4y = c4y;
                    if (!c4y.A0c()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    C4Y c4y2 = c4y;
                    c4y2.A0T(32);
                    return c4y2;
                case '\t':
                    i3++;
                    c2 = 2;
                    break;
                case '\n':
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 11:
                    c4o = c4o;
                    viewA08 = c4o.A08.A01.A08(i);
                    if (viewA08 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c4o = c4o;
                    viewA08 = viewA08;
                    c4yA0E = C0452Eq.A0E(viewA08);
                    c4o.A08.A01.A0G(viewA08);
                    iA07 = c4o.A08.A01.A07(viewA08);
                    if (iA07 == -1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    C4O c4o2 = c4o;
                    C4Y c4y3 = c4yA0E;
                    c4o2.A08.A01.A0C(iA07);
                    c4o2.A0W(viewA08);
                    c4y3.A0T(8224);
                    return c4y3;
                case 14:
                    throw new IllegalStateException(A04(184, 52, 82) + c4yA0E + c4o.A08.A1G());
                case 15:
                    c4o = c4o;
                    size = c4o.A06.size();
                    i2 = 0;
                    c2 = 16;
                    break;
                case 16:
                    if (i2 >= size) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c4o = c4o;
                    holder = c4o.A06.get(i2);
                    if (!holder.A0b()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 18:
                    holder = holder;
                    if (holder.A0I() != i) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (!z) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 20:
                    c4o = c4o;
                    c4o.A06.remove(i2);
                    c2 = 21;
                    break;
                case 21:
                    return holder;
                case 22:
                    i2++;
                    c2 = 16;
                    break;
                case 23:
                    return (C4Y) null;
            }
        }
    }

    private final C4Y A03(long j, int i, boolean z) {
        C4O c4o = this;
        int size = 0;
        C4Y c4y = null;
        C4Y c4y2 = null;
        int size2 = c4o.A05.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size2 < 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4y2 = c4o.A05.get(size2);
                    if (c4y2.A0K() != j) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y2 = c4y2;
                    if (!c4y2.A0i()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 5:
                    c4y2 = c4y2;
                    if (i != c4y2.A0H()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4y2 = c4y2;
                    c4y2.A0T(32);
                    if (!c4y2.A0c()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4o = c4o;
                    if (!c4o.A08.A0s.A07()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c4y2 = c4y2;
                    c4y2.A0U(2, 14);
                    c2 = '\t';
                    break;
                case '\t':
                    return c4y2;
                case '\n':
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    c4o = c4o;
                    c4y2 = c4y2;
                    c4o.A05.remove(size2);
                    c4o.A08.removeDetachedView(c4y2.A0H, false);
                    c4o.A0V(c4y2.A0H);
                    c2 = '\f';
                    break;
                case '\f':
                    size2--;
                    c2 = 2;
                    break;
                case '\r':
                    c4o = c4o;
                    size = c4o.A06.size() - 1;
                    c2 = 14;
                    break;
                case 14:
                    if (size < 0) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c4o = c4o;
                    c4y = c4o.A06.get(size);
                    if (c4y.A0K() != j) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c4y = c4y;
                    if (i != c4y.A0H()) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (!z) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 18:
                    c4o = c4o;
                    c4o.A06.remove(size);
                    c2 = 19;
                    break;
                case 19:
                    return c4y;
                case 20:
                    if (!z) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 21:
                    c4o.A07(size);
                    return (C4Y) null;
                case 22:
                    size--;
                    c2 = 14;
                    break;
                case 23:
                    return (C4Y) null;
            }
        }
    }

    private final void A06() {
        C4O c4o = this;
        int size = c4o.A06.size() - 1;
        int i = 2;
        while (true) {
            switch (i) {
                case 2:
                    if (size < 0) {
                        i = 4;
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4o.A07(size);
                    size--;
                    i = 2;
                    break;
                case 4:
                    c4o = c4o;
                    c4o.A06.clear();
                    if (!C0452Eq.A1D) {
                        i = 6;
                        break;
                    } else {
                        i = 5;
                        break;
                    }
                case 5:
                    c4o = c4o;
                    c4o.A08.A02.A02();
                    i = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    private final void A07(int i) {
        A0d(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        C4O c4o = this;
        int i = 0;
        View childAt = null;
        int childCount = viewGroup.getChildCount() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (childCount < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewGroup = viewGroup;
                    childAt = viewGroup.getChildAt(childCount);
                    if (!(childAt instanceof ViewGroup)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4o = c4o;
                    childAt = childAt;
                    c4o.A08((ViewGroup) childAt, true);
                    c2 = 5;
                    break;
                case 5:
                    childCount--;
                    c2 = 2;
                    break;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    viewGroup = viewGroup;
                    i = 4;
                    if (viewGroup.getVisibility() != 4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    viewGroup = viewGroup;
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(i);
                    c2 = '\n';
                    break;
                case '\n':
                    return;
                case 11:
                    viewGroup = viewGroup;
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(i);
                    viewGroup.setVisibility(visibility);
                    c2 = '\n';
                    break;
            }
        }
    }

    private void A09(C4Y c4y) {
        C4O c4o = this;
        View view = null;
        char c2 = c4o.A08.A1q() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    view = c4y.A0H;
                    if (C2v.A00(view) != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    C2v.A09(view, 1);
                    c2 = 4;
                    break;
                case 4:
                    view = view;
                    if (!C2v.A0E(view)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c4o = c4o;
                    c4y = c4y;
                    view = view;
                    c4y.A0T(16384);
                    C2v.A0A(view, c4o.A08.A09.A0A());
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    private void A0A(C4Y c4y) {
        if (c4y.A0H instanceof ViewGroup) {
            A08((ViewGroup) c4y.A0H, false);
        }
    }

    private final void A0B(C4Y c4y) {
        C4O c4o = this;
        char c2 = c4o.A08.A07 != null ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    c4o = c4o;
                    if (c4o.A08.A04 == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    if (c4o.A08.A0s == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4o = c4o;
                    c4y = c4y;
                    c4o.A08.A0t.A0B(c4y);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private final boolean A0C(C4Y c4y) {
        C4O c4o = this;
        boolean z = false;
        boolean z2 = false;
        char c2 = c4y.A0c() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c4o.A08.A0s.A07();
                case 3:
                    c4y = c4y;
                    if (c4y.A03 < 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4o = c4o;
                    c4y = c4y;
                    if (c4y.A03 >= c4o.A08.A04.A0D()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4o = c4o;
                    z2 = false;
                    if (!c4o.A08.A0s.A07()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    c4o = c4o;
                    c4y = c4y;
                    if (c4o.A08.A04.A03(c4y.A03) == c4y.A0H()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    c4o = c4o;
                    z = true;
                    if (!c4o.A08.A04.A0A()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c4o = c4o;
                    c4y = c4y;
                    if (c4y.A0K() != c4o.A08.A04.A04(c4y.A03)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z2 = true;
                    c2 = 11;
                    break;
                case 11:
                    return z2;
                case '\f':
                    return z;
                case '\r':
                    throw new IndexOutOfBoundsException(A04(293, 60, 23) + c4y + c4o.A08.A1G());
            }
        }
    }

    private boolean A0D(C4Y c4y, int i, int i2, long j) {
        C4O c4o = this;
        c4y.A08 = c4o.A08;
        int iA0H = c4y.A0H();
        long nanoTime = c4o.A08.getNanoTime();
        char c2 = j != Long.MAX_VALUE ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4o = c4o;
                    if (!c4o.A01.A0A(iA0H, nanoTime, j)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c4o = c4o;
                    c4y = c4y;
                    c4o.A08.A04.A09(c4y, i);
                    long startBindNs = c4o.A08.getNanoTime();
                    c4o.A01.A05(c4y.A0H(), startBindNs - nanoTime);
                    c4o.A09(c4y);
                    if (!c4o.A08.A0s.A07()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4y = c4y;
                    c4y.A04 = i2;
                    c2 = 6;
                    break;
                case 6:
                    return true;
            }
        }
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C4N A0H() {
        if (this.A01 == null) {
            this.A01 = new C4N();
        }
        return this.A01;
    }

    @Nullable
    public final C4Y A0I(int i, boolean z, long j) {
        C4O c4o = this;
        ViewGroup.LayoutParams layoutParams = null;
        boolean z2 = false;
        boolean zA0D = false;
        C4H c4h = null;
        C0452Eq innerView = null;
        C4Y c4yA05 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        C4Y c4yA03 = null;
        C4Y c4y = null;
        View viewA00 = null;
        int iA0D = 0;
        int iA03 = 0;
        C4W c4w = null;
        long nanoTime = 0;
        int i3 = 0;
        boolean z5 = false;
        C4O c4o2 = c4o;
        char c2 = i >= 0 ? (char) 2 : 'D';
        while (true) {
            switch (c2) {
                case 2:
                    c4o2 = c4o2;
                    if (i >= c4o2.A08.A0s.A03()) {
                        c2 = 'D';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o2 = c4o2;
                    z5 = false;
                    c4yA03 = null;
                    z2 = true;
                    i2 = 0;
                    if (!c4o2.A08.A0s.A07()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4o = c4o;
                    c4yA03 = c4o.A01(i);
                    if (c4yA03 == null) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z3 = true;
                    c2 = 6;
                    break;
                case 6:
                    z5 = z3;
                    c2 = 7;
                    break;
                case 7:
                    if (c4yA03 != null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c4o = c4o;
                    c4yA03 = c4o.A02(i, z);
                    if (c4yA03 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c4o2 = c4o2;
                    c4yA03 = c4yA03;
                    if (!c4o2.A0C(c4yA03)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '\n':
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 11:
                    c4yA03 = c4yA03;
                    c4yA03.A0T(4);
                    if (!c4yA03.A0d()) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c4o2 = c4o2;
                    c4yA03 = c4yA03;
                    i2 = 0;
                    c4o2.A08.removeDetachedView(c4yA03.A0H, false);
                    c4yA03.A0S();
                    c2 = '\r';
                    break;
                case '\r':
                    c4o2 = c4o2;
                    c4yA03 = c4yA03;
                    c4o2.A0b(c4yA03);
                    c2 = 14;
                    break;
                case 14:
                    c4yA03 = null;
                    c2 = 15;
                    break;
                case 15:
                    if (c4yA03 != null) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c4o2 = c4o2;
                    iA0D = c4o2.A08.A00.A0D(i);
                    if (iA0D < 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c4o2 = c4o2;
                    if (iA0D >= c4o2.A08.A04.A0D()) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c4o2 = c4o2;
                    iA03 = c4o2.A08.A04.A03(iA0D);
                    if (!c4o2.A08.A04.A0A()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c4o2 = c4o2;
                    c4yA03 = c4o2.A03(c4o2.A08.A04.A04(iA0D), iA03, z);
                    if (c4yA03 == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c4yA03 = c4yA03;
                    c4yA03.A03 = iA0D;
                    z5 = true;
                    c2 = 21;
                    break;
                case 21:
                    if (c4yA03 != null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c4o2 = c4o2;
                    c4w = c4o2.A04;
                    if (c4w == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c4o2 = c4o2;
                    c4w = c4w;
                    viewA00 = c4w.A00(c4o2, i, iA03);
                    if (viewA00 == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c4o2 = c4o2;
                    viewA00 = viewA00;
                    c4yA03 = c4o2.A08.A1F(viewA00);
                    if (c4yA03 == null) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    c4yA03 = c4yA03;
                    if (!c4yA03.A0h()) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case 26:
                    if (c4yA03 != null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c4o = c4o;
                    c4yA03 = c4o.A0H().A03(iA03);
                    if (c4yA03 == null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c4yA03 = c4yA03;
                    c4yA03.A0Q();
                    if (!C0452Eq.A1B) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    c4o2 = c4o2;
                    c4yA03 = c4yA03;
                    c4o2.A0A(c4yA03);
                    c2 = 30;
                    break;
                case 30:
                    if (c4yA03 != null) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    c4o2 = c4o2;
                    nanoTime = c4o2.A08.getNanoTime();
                    if (j == Long.MAX_VALUE) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    c4o2 = c4o2;
                    if (!c4o2.A01.A0B(iA03, nanoTime, j)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '!':
                    return (C4Y) null;
                case '\"':
                    c4yA03 = c4yA03;
                    if (!c4yA03.A0i()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    c4yA03 = c4yA03;
                    c4yA03.A0O();
                    c2 = '\r';
                    break;
                case '$':
                    z5 = true;
                    c2 = 15;
                    break;
                case '%':
                    z3 = false;
                    c2 = 6;
                    break;
                case '&':
                    z4 = z5;
                    c4y = c4yA03;
                    c2 = '/';
                    break;
                case '\'':
                    throw new IllegalArgumentException(A04(448, 113, 20) + c4o2.A08.A1G());
                case '(':
                    throw new IllegalArgumentException(A04(693, 74, 3) + c4o2.A08.A1G());
                case ')':
                    C4O c4o3 = c4o2;
                    throw new IndexOutOfBoundsException(A04(130, 46, 96) + i + A04(176, 8, 79) + iA0D + A04(128, 2, 23) + A04(0, 6, 33) + c4o3.A08.A0s.A03() + c4o3.A08.A1G());
                case '*':
                    z4 = z5;
                    c4y = c4yA03;
                    c2 = '/';
                    break;
                case '+':
                    c4o2 = c4o2;
                    c4yA05 = c4o2.A08.A04.A05(c4o2.A08, iA03);
                    if (!C0452Eq.A1D) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = ',';
                        break;
                    }
                case ',':
                    c4yA05 = c4yA05;
                    innerView = C0452Eq.A0G(c4yA05.A0H);
                    if (innerView == null) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    c4yA05 = c4yA05;
                    innerView = innerView;
                    c4yA05.A09 = new WeakReference<>(innerView);
                    c2 = '.';
                    break;
                case '.':
                    c4o2 = c4o2;
                    c4yA05 = c4yA05;
                    c4o2.A01.A06(iA03, c4o2.A08.getNanoTime() - nanoTime);
                    z4 = z5;
                    c4y = c4yA05;
                    c2 = '/';
                    break;
                case '/':
                    if (!z4) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '0';
                        break;
                    }
                case '0':
                    c4o2 = c4o2;
                    if (!c4o2.A08.A0s.A07()) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '1':
                    i3 = 8192;
                    if (!c4y.A0k(8192)) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '2';
                        break;
                    }
                case '2':
                    c4o2 = c4o2;
                    c4y.A0U(i2, i3);
                    if (!c4o2.A08.A0s.A0C) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '3';
                        break;
                    }
                case '3':
                    c4o2 = c4o2;
                    c4o2.A08.A1k(c4y, c4o2.A08.A05.A07(c4o2.A08.A0s, c4y, C4C.A00(c4y) | 4096, c4y.A0L()));
                    c2 = '4';
                    break;
                case '4':
                    c4o2 = c4o2;
                    zA0D = false;
                    if (!c4o2.A08.A0s.A07()) {
                        c2 = '@';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '5':
                    if (!c4y.A0a()) {
                        c2 = '@';
                        break;
                    } else {
                        c2 = '6';
                        break;
                    }
                case '6':
                    c4y.A04 = i;
                    c2 = '7';
                    break;
                case '7':
                    layoutParams = c4y.A0H.getLayoutParams();
                    if (layoutParams != null) {
                        c2 = '=';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '8':
                    c4o2 = c4o2;
                    c4h = (C4H) c4o2.A08.generateDefaultLayoutParams();
                    c4y.A0H.setLayoutParams(c4h);
                    c2 = '9';
                    break;
                case '9':
                    c4h = c4h;
                    c4h.A00 = c4y;
                    if (!z4) {
                        c2 = '<';
                        break;
                    } else {
                        c2 = ':';
                        break;
                    }
                case ':':
                    if (!zA0D) {
                        c2 = '<';
                        break;
                    } else {
                        c2 = ';';
                        break;
                    }
                case ';':
                    c4h.A02 = z2;
                    return c4y;
                case '<':
                    z2 = false;
                    c2 = ';';
                    break;
                case '=':
                    c4o2 = c4o2;
                    layoutParams = layoutParams;
                    if (!c4o2.A08.checkLayoutParams(layoutParams)) {
                        c2 = '>';
                        break;
                    } else {
                        c2 = '?';
                        break;
                    }
                case '>':
                    c4o2 = c4o2;
                    layoutParams = layoutParams;
                    c4h = (C4H) c4o2.A08.generateLayoutParams(layoutParams);
                    c4y.A0H.setLayoutParams(c4h);
                    c2 = '9';
                    break;
                case '?':
                    layoutParams = layoutParams;
                    c4h = (C4H) layoutParams;
                    c2 = '9';
                    break;
                case '@':
                    if (!c4y.A0a()) {
                        c2 = 'C';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case 'A':
                    if (!c4y.A0g()) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = 'C';
                        break;
                    }
                case 'B':
                    if (!c4y.A0b()) {
                        c2 = '7';
                        break;
                    } else {
                        c2 = 'C';
                        break;
                    }
                case 'C':
                    c4o = c4o;
                    c4o2 = c4o2;
                    zA0D = c4o.A0D(c4y, c4o2.A08.A00.A0D(i), i, j);
                    c2 = '7';
                    break;
                case 'D':
                    C4O c4o4 = c4o2;
                    throw new IndexOutOfBoundsException(A04(561, 22, k.AppCompatTheme_windowFixedHeightMajor) + i + A04(236, 1, 41) + i + A04(434, 14, 68) + c4o4.A08.A0s.A03() + c4o4.A08.A1G());
            }
        }
    }

    public final List<C4Y> A0J() {
        return this.A07;
    }

    public final void A0K() {
        C4O c4o = this;
        int i = 0;
        int size = 0;
        int i2 = 0;
        int size2 = 0;
        ArrayList<C4Y> arrayList = null;
        int size3 = c4o.A06.size();
        int i3 = 0;
        int i4 = 2;
        while (true) {
            switch (i4) {
                case 2:
                    if (i3 >= size3) {
                        i4 = 4;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4o.A06.get(i3).A0M();
                    i3++;
                    i4 = 2;
                    break;
                case 4:
                    c4o = c4o;
                    size2 = c4o.A05.size();
                    i2 = 0;
                    i4 = 5;
                    break;
                case 5:
                    if (i2 >= size2) {
                        i4 = 7;
                        break;
                    } else {
                        i4 = 6;
                        break;
                    }
                case 6:
                    c4o = c4o;
                    c4o.A05.get(i2).A0M();
                    i2++;
                    i4 = 5;
                    break;
                case 7:
                    c4o = c4o;
                    arrayList = c4o.A02;
                    if (arrayList == null) {
                        i4 = 11;
                        break;
                    } else {
                        i4 = 8;
                        break;
                    }
                case 8:
                    arrayList = arrayList;
                    size = arrayList.size();
                    i = 0;
                    i4 = 9;
                    break;
                case 9:
                    if (i >= size) {
                        i4 = 11;
                        break;
                    } else {
                        i4 = 10;
                        break;
                    }
                case 10:
                    c4o = c4o;
                    c4o.A02.get(i).A0M();
                    i++;
                    i4 = 9;
                    break;
                case 11:
                    return;
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<C4Y> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        C4O c4o = this;
        C4H c4h = null;
        int size = c4o.A06.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4h = (C4H) c4o.A06.get(i).A0H.getLayoutParams();
                    if (c4h == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4h = c4h;
                    c4h.A01 = true;
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final void A0N() {
        C4O c4o = this;
        C4Y holder = null;
        int i = 0;
        int size = 0;
        char c2 = c4o.A08.A04 != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c4o = c4o;
                    if (!c4o.A08.A04.A0A()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    size = c4o.A06.size();
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= size) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4o = c4o;
                    holder = c4o.A06.get(i);
                    if (holder == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    holder = holder;
                    holder.A0T(6);
                    holder.A0Y(null);
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    c4o = c4o;
                    c4o.A06();
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    public final void A0O() {
        C4O c4o = this;
        int i = 0;
        int i2 = 0;
        char c2 = c4o.A08.A06 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c4o = c4o;
                    i2 = c4o.A08.A06.A00;
                    c2 = 3;
                    break;
                case 3:
                    c4o = c4o;
                    c4o.A00 = c4o.A03 + i2;
                    i = c4o.A06.size() - 1;
                    c2 = 4;
                    break;
                case 4:
                    if (i < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4o = c4o;
                    if (c4o.A06.size() <= c4o.A00) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4o = c4o;
                    c4o.A07(i);
                    i--;
                    c2 = 4;
                    break;
                case 7:
                    i2 = 0;
                    c2 = 3;
                    break;
                case '\b':
                    return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(int i, int i2) {
        C4O c4o = this;
        C4Y c4y = null;
        int size = c4o.A06.size();
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4y = c4o.A06.get(i3);
                    if (c4y == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    if (c4y.A03 < i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4y = c4y;
                    c4y.A0W(i2, true);
                    c2 = 6;
                    break;
                case 6:
                    i3++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A0S(int i, int inBetweenOffset) {
        C4O c4o = this;
        int cachedCount = 0;
        int i2 = 0;
        C4Y c4y = null;
        int i3 = 0;
        int size = 0;
        int i4 = 0;
        int i5 = i < inBetweenOffset ? 2 : 12;
        while (true) {
            switch (i5) {
                case 2:
                    i4 = i;
                    i2 = inBetweenOffset;
                    cachedCount = -1;
                    i5 = 3;
                    break;
                case 3:
                    c4o = c4o;
                    size = c4o.A06.size();
                    i3 = 0;
                    i5 = 4;
                    break;
                case 4:
                    if (i3 >= size) {
                        i5 = 13;
                        break;
                    } else {
                        i5 = 5;
                        break;
                    }
                case 5:
                    c4o = c4o;
                    c4y = c4o.A06.get(i3);
                    if (c4y == null) {
                        i5 = 8;
                        break;
                    } else {
                        i5 = 6;
                        break;
                    }
                case 6:
                    c4y = c4y;
                    if (c4y.A03 < i4) {
                        i5 = 8;
                        break;
                    } else {
                        i5 = 7;
                        break;
                    }
                case 7:
                    c4y = c4y;
                    int i6 = c4y.A03;
                    if (i6 <= i2) {
                        i5 = 9;
                        break;
                    } else {
                        i5 = 8;
                        break;
                    }
                case 8:
                    i3++;
                    i5 = 4;
                    break;
                case 9:
                    c4y = c4y;
                    if (c4y.A03 != i) {
                        i5 = 11;
                        break;
                    } else {
                        i5 = 10;
                        break;
                    }
                case 10:
                    c4y = c4y;
                    c4y.A0W(inBetweenOffset - i, false);
                    i5 = 8;
                    break;
                case 11:
                    c4y = c4y;
                    c4y.A0W(cachedCount, false);
                    i5 = 8;
                    break;
                case 12:
                    i4 = inBetweenOffset;
                    i2 = i;
                    cachedCount = 1;
                    i5 = 3;
                    break;
                case 13:
                    return;
            }
        }
    }

    public final void A0T(int cachedCount, int i) {
        C4O c4o = this;
        int i2 = 0;
        C4Y c4y = null;
        int i3 = cachedCount + i;
        int size = c4o.A06.size() - 1;
        int pos = 2;
        while (true) {
            switch (pos) {
                case 2:
                    if (size < 0) {
                        pos = 8;
                        break;
                    } else {
                        pos = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4y = c4o.A06.get(size);
                    if (c4y != null) {
                        pos = 5;
                        break;
                    } else {
                        pos = 4;
                        break;
                    }
                case 4:
                    size--;
                    pos = 2;
                    break;
                case 5:
                    c4y = c4y;
                    i2 = c4y.A03;
                    if (i2 < cachedCount) {
                        pos = 4;
                        break;
                    } else {
                        pos = 6;
                        break;
                    }
                case 6:
                    if (i2 >= i3) {
                        pos = 4;
                        break;
                    } else {
                        pos = 7;
                        break;
                    }
                case 7:
                    c4o = c4o;
                    c4y = c4y;
                    c4y.A0T(2);
                    c4o.A07(size);
                    pos = 4;
                    break;
                case 8:
                    return;
            }
        }
    }

    public final void A0U(int cachedCount, int i, boolean z) {
        C4O c4o = this;
        C4Y c4y = null;
        int i2 = cachedCount + i;
        int size = c4o.A06.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4y = c4o.A06.get(size);
                    if (c4y == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    if (c4y.A03 < i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4y = c4y;
                    c4y.A0W(-i, z);
                    c2 = 6;
                    break;
                case 6:
                    size--;
                    c2 = 2;
                    break;
                case 7:
                    c4y = c4y;
                    if (c4y.A03 < cachedCount) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c4o = c4o;
                    c4y = c4y;
                    c4y.A0T(8);
                    c4o.A07(size);
                    c2 = 6;
                    break;
                case '\t':
                    return;
            }
        }
    }

    public final void A0V(View view) {
        C4Y c4yA0E = C0452Eq.A0E(view);
        c4yA0E.A0F = null;
        c4yA0E.A0G = false;
        c4yA0E.A0O();
        A0b(c4yA0E);
    }

    public final void A0W(View view) {
        C4O c4o = this;
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = !c4yA0E.A0k(12) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0f()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4o = c4o;
                    c4yA0E = c4yA0E;
                    if (!c4o.A08.A1y(c4yA0E)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0b()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c4o = c4o;
                    if (!c4o.A08.A04.A0A()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4o = c4o;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0X(c4o, false);
                    c4o.A05.add(c4yA0E);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    c4o = c4o;
                    if (c4o.A02 != null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4o = c4o;
                    c4o.A02 = new ArrayList<>();
                    c2 = 11;
                    break;
                case 11:
                    c4o = c4o;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0X(c4o, true);
                    c4o.A02.add(c4yA0E);
                    c2 = '\b';
                    break;
                case '\f':
                    throw new IllegalArgumentException(A04(6, k.AppCompatTheme_windowMinWidthMajor, 39) + c4o.A08.A1G());
            }
        }
    }

    public final void A0X(View view) {
        C4O c4o = this;
        C4Y c4yA0E = C0452Eq.A0E(view);
        char c2 = c4yA0E.A0e() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4o = c4o;
                    view = view;
                    c4o.A08.removeDetachedView(view, false);
                    c2 = 3;
                    break;
                case 3:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0d()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0S();
                    c2 = 5;
                    break;
                case 5:
                    c4o.A0b(c4yA0E);
                    return;
                case 6:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0i()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0O();
                    c2 = 5;
                    break;
            }
        }
    }

    public final void A0Y(AnonymousClass44 anonymousClass44, AnonymousClass44 anonymousClass442, boolean z) {
        A0P();
        A0H().A08(anonymousClass44, anonymousClass442, z);
    }

    public final void A0Z(C4N c4n) {
        C4O c4o = this;
        C4N c4n2 = c4o.A01;
        char c2 = c4n2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4n2 = c4n2;
                    c4n2.A04();
                    c2 = 3;
                    break;
                case 3:
                    c4o = c4o;
                    c4n = c4n;
                    c4o.A01 = c4n;
                    if (c4n == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4o = c4o;
                    c4o.A01.A07(c4o.A08.getAdapter());
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A0a(C4W c4w) {
        this.A04 = c4w;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(com.facebook.ads.redexgen.X.C4Y r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4O.A0b(com.facebook.ads.redexgen.X.4Y):void");
    }

    public final void A0c(C4Y c4y) {
        C4O c4o = this;
        char c2 = c4y.A0G ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4o = c4o;
                    c4y = c4y;
                    c4o.A02.remove(c4y);
                    c2 = 3;
                    break;
                case 3:
                    C4Y c4y2 = c4y;
                    c4y2.A0F = null;
                    c4y2.A0G = false;
                    c4y2.A0O();
                    return;
                case 4:
                    c4o = c4o;
                    c4y = c4y;
                    c4o.A05.remove(c4y);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0d(C4Y c4y, boolean z) {
        C4O c4o = this;
        C0452Eq.A0r(c4y);
        C0452Eq c0452Eq = null;
        char c2 = c4y.A0k(16384) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    c0452Eq = null;
                    c4y.A0U(0, 16384);
                    C2v.A0A(c4y.A0H, null);
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4o = c4o;
                    c4y = c4y;
                    c4o.A0B(c4y);
                    c2 = 5;
                    break;
                case 5:
                    C4Y c4y2 = c4y;
                    c4y2.A08 = c0452Eq;
                    c4o.A0H().A09(c4y2);
                    return;
            }
        }
    }
}
