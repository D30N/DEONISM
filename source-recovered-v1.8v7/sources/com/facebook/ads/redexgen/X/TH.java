package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public abstract class TH extends C4C {
    public boolean A00 = true;

    public abstract boolean A0T(C4Y c4y);

    public abstract boolean A0U(C4Y c4y);

    public abstract boolean A0V(C4Y c4y, int i, int i2, int i3, int i4);

    public abstract boolean A0W(C4Y c4y, C4Y c4y2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0B(@NonNull C4Y c4y) {
        boolean z = false;
        char c2 = this.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (!c4y.A0b()) {
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

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0C(@NonNull C4Y c4y, @Nullable C4B c4b, @NonNull C4B c4b2) {
        char c2 = c4b != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4b = c4b;
                    c4b2 = c4b2;
                    if (c4b.A01 != c4b2.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4b = c4b;
                    c4b2 = c4b2;
                    if (c4b.A03 == c4b2.A03) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C4B c4b3 = c4b;
                    C4B c4b4 = c4b2;
                    return A0V(c4y, c4b3.A01, c4b3.A03, c4b4.A01, c4b4.A03);
                case 5:
                    return A0T(c4y);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0D(@NonNull C4Y c4y, @NonNull C4B c4b, @Nullable C4B c4b2) {
        C4Y c4y2 = c4y;
        int i = 0;
        int oldLeft = 0;
        int newLeft = 0;
        int newTop = 0;
        int i2 = c4b.A01;
        int i3 = c4b.A03;
        View view = c4y2.A0H;
        char c2 = c4b2 == null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    newLeft = view.getLeft();
                    c2 = 3;
                    break;
                case 3:
                    c4b2 = c4b2;
                    oldLeft = newLeft;
                    if (c4b2 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    newTop = view.getTop();
                    c2 = 5;
                    break;
                case 5:
                    c4y2 = c4y2;
                    i = newTop;
                    if (!c4y2.A0c()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 6:
                    if (i2 != oldLeft) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i3 == i) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    View view2 = view;
                    int newTop2 = view2.getWidth();
                    view2.layout(oldLeft, i, newTop2 + oldLeft, view2.getHeight() + i);
                    return A0V(c4y2, i2, i3, oldLeft, i);
                case '\t':
                    c4b2 = c4b2;
                    newTop = c4b2.A03;
                    c2 = 5;
                    break;
                case '\n':
                    c4b2 = c4b2;
                    newLeft = c4b2.A01;
                    c2 = 3;
                    break;
                case 11:
                    return A0U(c4y2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0E(@NonNull C4Y c4y, @NonNull C4B c4b, @NonNull C4B c4b2) {
        char c2 = c4b.A01 == c4b2.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4b = c4b;
                    c4b2 = c4b2;
                    if (c4b.A03 == c4b2.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    C4B c4b3 = c4b;
                    C4B c4b4 = c4b2;
                    return A0V(c4y, c4b3.A01, c4b3.A03, c4b4.A01, c4b4.A03);
                case 4:
                    A0N(c4y);
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0F(@NonNull C4Y c4y, @NonNull C4Y c4y2, @NonNull C4B c4b, @NonNull C4B c4b2) {
        int i = 0;
        int i2 = 0;
        int toLeft = c4b.A01;
        int toTop = c4b.A03;
        int fromTop = c4y2.A0h() ? 2 : 4;
        while (true) {
            switch (fromTop) {
                case 2:
                    c4b = c4b;
                    i2 = c4b.A01;
                    i = c4b.A03;
                    fromTop = 3;
                    break;
                case 3:
                    return A0W(c4y, c4y2, toLeft, toTop, i2, i);
                case 4:
                    c4b2 = c4b2;
                    i2 = c4b2.A01;
                    i = c4b2.A03;
                    fromTop = 3;
                    break;
            }
        }
    }

    public final void A0L(C4Y c4y) {
        A0A(c4y);
    }

    public final void A0M(C4Y c4y) {
    }

    public final void A0N(C4Y c4y) {
        A0A(c4y);
    }

    public final void A0O(C4Y c4y) {
    }

    public final void A0P(C4Y c4y) {
        A0A(c4y);
    }

    public final void A0Q(C4Y c4y) {
    }

    public final void A0R(C4Y c4y, boolean z) {
        A0A(c4y);
    }

    public final void A0S(C4Y c4y, boolean z) {
    }
}
