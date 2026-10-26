package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.ads.redexgen.X.2d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01602d {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C01602d(@NonNull View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i) {
        char c2 = i != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (ViewParent) null;
                case 4:
                    return this.A00;
                case 5:
                    return this.A01;
            }
        }
    }

    private void A01(int i, ViewParent viewParent) {
        C01602d c01602d = this;
        char c2 = i != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c01602d = c01602d;
                    viewParent = viewParent;
                    c01602d.A00 = viewParent;
                    c2 = 3;
                    break;
                case 5:
                    c01602d = c01602d;
                    viewParent = viewParent;
                    c01602d.A01 = viewParent;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i) {
        ViewParent viewParentA00 = A00(i);
        if (viewParentA00 != null) {
            C3B.A00(viewParentA00, this.A04, i);
            A01(i, null);
        }
    }

    public final void A04(boolean z) {
        if (this.A02) {
            C2v.A08(this.A04);
        }
        this.A02 = z;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f, float f2) {
        C01602d c01602d = this;
        ViewParent viewParentA00 = null;
        boolean z = false;
        char c2 = c01602d.A06() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01602d = c01602d;
                    z = false;
                    viewParentA00 = c01602d.A00(0);
                    if (viewParentA00 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return C3B.A04(viewParentA00, c01602d.A04, f, f2);
                case 4:
                    return z;
            }
        }
    }

    public final boolean A08(float f, float f2, boolean z) {
        C01602d c01602d = this;
        ViewParent viewParentA00 = null;
        boolean z2 = false;
        char c2 = c01602d.A06() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01602d = c01602d;
                    z2 = false;
                    viewParentA00 = c01602d.A00(0);
                    if (viewParentA00 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return C3B.A05(viewParentA00, c01602d.A04, f, f2, z);
                case 4:
                    return z2;
            }
        }
    }

    public final boolean A09(int i) {
        boolean z = false;
        char c2 = A00(i) != null ? (char) 2 : (char) 4;
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

    public final boolean A0A(int i) {
        return A0B(i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final boolean A0B(int i, int i2) {
        C01602d c01602d = this;
        View view = null;
        ?? parent = 0;
        char c2 = c01602d.A09(i2) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    c01602d = c01602d;
                    if (!c01602d.A06()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01602d = c01602d;
                    parent = c01602d.A04.getParent();
                    view = c01602d.A04;
                    c2 = 5;
                    break;
                case 5:
                    parent = (ViewParent) parent;
                    if (parent == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01602d = c01602d;
                    parent = (ViewParent) parent;
                    view = view;
                    if (!C3B.A06(parent, view, c01602d.A04, i, i2)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    C01602d c01602d2 = c01602d;
                    ViewParent viewParent = (ViewParent) parent;
                    c01602d2.A01(i2, viewParent);
                    C3B.A03(viewParent, view, c01602d2.A04, i, i2);
                    return true;
                case '\b':
                    parent = (ViewParent) parent;
                    if (!(parent instanceof View)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    parent = (ViewParent) parent;
                    view = (View) parent;
                    c2 = '\n';
                    break;
                case '\n':
                    parent = ((ViewParent) parent).getParent();
                    c2 = 5;
                    break;
                case 11:
                    return false;
            }
        }
    }

    public final boolean A0C(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return A0D(i, i2, i3, i4, iArr, 0);
    }

    public final boolean A0D(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        int[] iArr2 = iArr;
        C01602d c01602d = this;
        ViewParent viewParentA00 = null;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        C01602d c01602d2 = c01602d;
        boolean z2 = false;
        char c2 = c01602d.A06() ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    c01602d = c01602d;
                    viewParentA00 = c01602d.A00(i5);
                    if (viewParentA00 != null) {
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
                    z = true;
                    if (i != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i2 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i4 == 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    iArr2 = iArr2;
                    if (iArr2 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c01602d2 = c01602d2;
                    iArr2 = iArr2;
                    z2 = false;
                    c01602d2.A04.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[z ? 1 : 0];
                    c2 = '\n';
                    break;
                case '\n':
                    c01602d2 = c01602d2;
                    iArr2 = iArr2;
                    viewParentA00 = viewParentA00;
                    C3B.A01(viewParentA00, c01602d2.A04, i, i2, i3, i4, i5);
                    if (iArr2 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c01602d2 = c01602d2;
                    iArr2 = iArr2;
                    c01602d2.A04.getLocationInWindow(iArr2);
                    iArr2[z2 ? 1 : 0] = iArr2[z2 ? 1 : 0] - i7;
                    iArr2[z ? 1 : 0] = iArr2[z ? 1 : 0] - i6;
                    c2 = '\f';
                    break;
                case '\f':
                    return z;
                case '\r':
                    i6 = 0;
                    i7 = 0;
                    c2 = '\n';
                    break;
                case 14:
                    iArr2 = iArr2;
                    if (iArr2 == null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    iArr2 = iArr2;
                    z2 = false;
                    iArr2[0] = 0;
                    iArr2[z ? 1 : 0] = 0;
                    c2 = 16;
                    break;
                case 16:
                    return z2;
            }
        }
    }

    public final boolean A0E(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return A0F(i, i2, iArr, iArr2, 0);
    }

    public final boolean A0F(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        C01602d c01602d = this;
        ViewParent viewParentA00 = null;
        boolean z = false;
        int[] iArr5 = null;
        int i4 = 0;
        int i5 = 0;
        C01602d c01602d2 = c01602d;
        boolean z2 = false;
        char c2 = c01602d.A06() ? (char) 2 : (char) 22;
        while (true) {
            switch (c2) {
                case 2:
                    c01602d = c01602d;
                    viewParentA00 = c01602d.A00(i3);
                    if (viewParentA00 != null) {
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
                    z = true;
                    if (i != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i2 == 0) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iArr3 = iArr3;
                    if (iArr3 == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01602d2 = c01602d2;
                    iArr3 = iArr3;
                    z2 = false;
                    c01602d2.A04.getLocationInWindow(iArr3);
                    i5 = iArr3[0];
                    i4 = iArr3[z ? 1 : 0];
                    c2 = '\b';
                    break;
                case '\b':
                    iArr4 = iArr4;
                    if (iArr4 != null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c01602d2 = c01602d2;
                    if (c01602d2.A03 != null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c01602d2 = c01602d2;
                    c01602d2.A03 = new int[2];
                    c2 = 11;
                    break;
                case 11:
                    c01602d2 = c01602d2;
                    iArr5 = c01602d2.A03;
                    c2 = '\f';
                    break;
                case '\f':
                    c01602d2 = c01602d2;
                    iArr3 = iArr3;
                    viewParentA00 = viewParentA00;
                    iArr5 = iArr5;
                    iArr5[z2 ? 1 : 0] = z2 ? 1 : 0;
                    iArr5[z ? 1 : 0] = z2 ? 1 : 0;
                    C3B.A02(viewParentA00, c01602d2.A04, i, i2, iArr5, i3);
                    if (iArr3 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c01602d2 = c01602d2;
                    iArr3 = iArr3;
                    c01602d2.A04.getLocationInWindow(iArr3);
                    iArr3[z2 ? 1 : 0] = iArr3[z2 ? 1 : 0] - i5;
                    iArr3[z ? 1 : 0] = iArr3[z ? 1 : 0] - i4;
                    c2 = 14;
                    break;
                case 14:
                    iArr5 = iArr5;
                    if (iArr5[z2 ? 1 : 0] != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    iArr5 = iArr5;
                    if (iArr5[z ? 1 : 0] == 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return z;
                case 17:
                    z = false;
                    c2 = 16;
                    break;
                case 18:
                    iArr4 = iArr4;
                    iArr5 = iArr4;
                    c2 = '\f';
                    break;
                case 19:
                    i4 = 0;
                    i5 = 0;
                    c2 = '\b';
                    break;
                case 20:
                    iArr3 = iArr3;
                    if (iArr3 == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    iArr3 = iArr3;
                    z2 = false;
                    iArr3[0] = 0;
                    iArr3[z ? 1 : 0] = 0;
                    c2 = 22;
                    break;
                case 22:
                    return z2;
            }
        }
    }
}
