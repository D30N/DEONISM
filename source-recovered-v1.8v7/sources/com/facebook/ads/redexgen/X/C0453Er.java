package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0453Er extends TJ {

    @Nullable
    public AnonymousClass40 A00;

    @Nullable
    public AnonymousClass40 A01;

    private int A00(@NonNull C4G c4g, @NonNull View view, AnonymousClass40 anonymousClass40) {
        int iA06 = 0;
        int iA0F = anonymousClass40.A0F(view) + (anonymousClass40.A0D(view) / 2);
        char c2 = c4g.A1X() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass40 = anonymousClass40;
                    iA06 = anonymousClass40.A0A() + (anonymousClass40.A0B() / 2);
                    c2 = 3;
                    break;
                case 3:
                    return iA0F - iA06;
                case 4:
                    anonymousClass40 = anonymousClass40;
                    iA06 = anonymousClass40.A06() / 2;
                    c2 = 3;
                    break;
            }
        }
    }

    @Nullable
    private View A01(C4G c4g, AnonymousClass40 anonymousClass40) {
        View view = null;
        View child = null;
        int absDistance = 0;
        int iA06 = 0;
        int i = 0;
        int i2 = 0;
        int iA0W = c4g.A0W();
        char c2 = iA0W == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (View) null;
                case 3:
                    c4g = c4g;
                    view = null;
                    if (!c4g.A1X()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass40 = anonymousClass40;
                    iA06 = anonymousClass40.A0A() + (anonymousClass40.A0B() / 2);
                    c2 = 5;
                    break;
                case 5:
                    i2 = Integer.MAX_VALUE;
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= iA0W) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4g = c4g;
                    anonymousClass40 = anonymousClass40;
                    child = c4g.A0t(i);
                    absDistance = Math.abs((anonymousClass40.A0F(child) + (anonymousClass40.A0D(child) / 2)) - iA06);
                    if (absDistance >= i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    child = child;
                    i2 = absDistance;
                    view = child;
                    c2 = '\t';
                    break;
                case '\t':
                    i++;
                    c2 = 6;
                    break;
                case '\n':
                    anonymousClass40 = anonymousClass40;
                    iA06 = anonymousClass40.A06() / 2;
                    c2 = 5;
                    break;
                case 11:
                    return view;
            }
        }
    }

    @Nullable
    private View A02(C4G c4g, AnonymousClass40 anonymousClass40) {
        View view = null;
        int childStart = 0;
        int i = 0;
        View viewA0t = null;
        int i2 = 0;
        int iA0W = c4g.A0W();
        char c2 = iA0W == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (View) null;
                case 3:
                    view = null;
                    i2 = Integer.MAX_VALUE;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= iA0W) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4g = c4g;
                    anonymousClass40 = anonymousClass40;
                    viewA0t = c4g.A0t(i);
                    childStart = anonymousClass40.A0F(viewA0t);
                    if (childStart >= i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    viewA0t = viewA0t;
                    i2 = childStart;
                    view = viewA0t;
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return view;
            }
        }
    }

    @NonNull
    private AnonymousClass40 A03(@NonNull C4G c4g) {
        C0453Er c0453Er = this;
        AnonymousClass40 anonymousClass40 = c0453Er.A00;
        char c2 = anonymousClass40 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    anonymousClass40 = anonymousClass40;
                    if (anonymousClass40.A02 == c4g) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0453Er = c0453Er;
                    c4g = c4g;
                    c0453Er.A00 = AnonymousClass40.A00(c4g);
                    c2 = 4;
                    break;
                case 4:
                    return c0453Er.A00;
            }
        }
    }

    @NonNull
    private AnonymousClass40 A04(@NonNull C4G c4g) {
        C0453Er c0453Er = this;
        AnonymousClass40 anonymousClass40 = c0453Er.A01;
        char c2 = anonymousClass40 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4g = c4g;
                    anonymousClass40 = anonymousClass40;
                    if (anonymousClass40.A02 == c4g) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0453Er = c0453Er;
                    c4g = c4g;
                    c0453Er.A01 = AnonymousClass40.A01(c4g);
                    c2 = 4;
                    break;
                case 4:
                    return c0453Er.A01;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.facebook.ads.redexgen.X.4G] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.ads.redexgen.X.Er] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.facebook.ads.redexgen.X.Er] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // com.facebook.ads.redexgen.X.TJ
    public final int A0C(C4G c4g, int i, int i2) {
        ?? r4 = this;
        int i3 = 0;
        int iA0p = 0;
        boolean z = false;
        C4S c4s = null;
        ?? r8 = 0;
        PointF pointFA44 = null;
        float f = 0.0f;
        View viewA02 = null;
        int iA0Z = c4g.A0Z();
        char c2 = iA0Z == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    c4g = (C4G) c4g;
                    viewA02 = null;
                    if (!c4g.A25()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    r4 = (C0453Er) r4;
                    c4g = (C4G) c4g;
                    viewA02 = r4.A02(c4g, r4.A04(c4g));
                    c2 = 5;
                    break;
                case 5:
                    if (viewA02 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return -1;
                case 7:
                    c4g = (C4G) c4g;
                    if (!c4g.A24()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    r4 = (C0453Er) r4;
                    c4g = (C4G) c4g;
                    viewA02 = r4.A02(c4g, r4.A03(c4g));
                    c2 = 5;
                    break;
                case '\t':
                    c4g = (C4G) c4g;
                    iA0p = c4g.A0p(viewA02);
                    if (iA0p != -1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return -1;
                case 11:
                    c4g = (C4G) c4g;
                    r8 = 0;
                    r8 = 0;
                    if (!c4g.A24()) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i <= 0) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z = true;
                    c2 = 14;
                    break;
                case 14:
                    c4g = (C4G) c4g;
                    c4s = null;
                    if (!(c4g instanceof C4S)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c4g = (C4G) c4g;
                    pointFA44 = ((C4S) c4g).A44(iA0Z - 1);
                    if (pointFA44 == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    pointFA44 = pointFA44;
                    f = 0.0f;
                    if (pointFA44.x < 0.0f) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    pointFA44 = pointFA44;
                    if (pointFA44.y >= f) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    r8 = 1;
                    c2 = 19;
                    break;
                case 19:
                    c4s = r8 == true ? 1 : 0;
                    c2 = 20;
                    break;
                case 20:
                    if (c4s == null) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (!z) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    i3 = iA0p - 1;
                    c2 = 23;
                    break;
                case 23:
                    return i3;
                case 24:
                    if (!z) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    i3 = iA0p + 1;
                    c2 = 23;
                    break;
                case 26:
                    i3 = iA0p;
                    c2 = 23;
                    break;
                case 27:
                    z = false;
                    c2 = 14;
                    break;
                case 28:
                    if (i2 <= 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    z = true;
                    c2 = 14;
                    break;
                case 30:
                    z = false;
                    c2 = 14;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.TJ
    @Nullable
    public final View A0D(C4G c4g) {
        char c2 = c4g.A25() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C0453Er c0453Er = this;
                    C4G c4g2 = c4g;
                    return c0453Er.A01(c4g2, c0453Er.A04(c4g2));
                case 3:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C0453Er c0453Er2 = this;
                    C4G c4g3 = c4g;
                    return c0453Er2.A01(c4g3, c0453Er2.A03(c4g3));
                case 5:
                    return (View) null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.TJ
    public final T3 A0E(C4G c4g) {
        if (!(c4g instanceof C4S)) {
            return null;
        }
        return new C0454Es(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.TJ
    @Nullable
    public final int[] A0H(@NonNull C4G c4g, @NonNull View view) {
        C0453Er c0453Er = this;
        char c2 = 0;
        int[] iArr = new int[2];
        int i = 0;
        char c3 = c4g.A24() ? (char) 2 : (char) 7;
        while (true) {
            switch (c3) {
                case 2:
                    c0453Er = c0453Er;
                    c4g = c4g;
                    view = view;
                    iArr = iArr;
                    i = 0;
                    iArr[0] = c0453Er.A00(c4g, view, c0453Er.A03(c4g));
                    c3 = 3;
                    break;
                case 3:
                    c4g = c4g;
                    c2 = 1;
                    if (!c4g.A25()) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    c0453Er = c0453Er;
                    c4g = c4g;
                    view = view;
                    iArr = iArr;
                    iArr[c2] = c0453Er.A00(c4g, view, c0453Er.A04(c4g));
                    c3 = 5;
                    break;
                case 5:
                    return iArr;
                case 6:
                    iArr = iArr;
                    iArr[c2] = i;
                    c3 = 5;
                    break;
                case 7:
                    iArr = iArr;
                    i = 0;
                    iArr[0] = 0;
                    c3 = 3;
                    break;
            }
        }
    }
}
