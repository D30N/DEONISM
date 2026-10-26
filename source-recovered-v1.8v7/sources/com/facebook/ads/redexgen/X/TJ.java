package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class TJ extends C4J {
    public static byte[] A03;
    public C0452Eq A00;
    public Scroller A01;
    public final C4L A02 = new TI(this);

    static {
        A09();
    }

    public static String A06(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A03 = new byte[]{113, 94, 16, 89, 94, 67, 68, 81, 94, 83, 85, 16, 95, 86, 16, Byte.MAX_VALUE, 94, 118, 92, 89, 94, 87, 124, 89, 67, 68, 85, 94, 85, 66, 16, 81, 92, 66, 85, 81, 84, 73, 16, 67, 85, 68, 30};
    }

    public abstract int A0C(C4G c4g, int i, int i2);

    @Nullable
    public abstract View A0D(C4G c4g);

    @Nullable
    public abstract int[] A0H(@NonNull C4G c4g, @NonNull View view);

    @Nullable
    private final C4T A05(C4G c4g) {
        return A0E(c4g);
    }

    private void A07() {
        this.A00.A1i(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1h(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 84));
    }

    private boolean A0A(@NonNull C4G c4g, int i, int i2) {
        TJ tj = this;
        int iA0C = 0;
        C4T c4tA05 = null;
        char c2 = !(c4g instanceof C4S) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    tj = tj;
                    c4g = c4g;
                    c4tA05 = tj.A05(c4g);
                    if (c4tA05 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    tj = tj;
                    c4g = c4g;
                    iA0C = tj.A0C(c4g, i, i2);
                    if (iA0C != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    C4T c4t = c4tA05;
                    c4t.A0A(iA0C);
                    c4g.A1L(c4t);
                    return true;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final boolean A0B(int i, int i2) {
        TJ tj = this;
        int minFlingVelocity = 0;
        C4G layoutManager = tj.A00.getLayoutManager();
        boolean z = false;
        int minFlingVelocity2 = layoutManager == null ? 2 : 3;
        while (true) {
            switch (minFlingVelocity2) {
                case 2:
                    return false;
                case 3:
                    tj = tj;
                    if (tj.A00.getAdapter() != null) {
                        minFlingVelocity2 = 5;
                        break;
                    } else {
                        minFlingVelocity2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    tj = tj;
                    minFlingVelocity = tj.A00.getMinFlingVelocity();
                    int minFlingVelocity3 = Math.abs(i2);
                    if (minFlingVelocity3 > minFlingVelocity) {
                        minFlingVelocity2 = 7;
                        break;
                    } else {
                        minFlingVelocity2 = 6;
                        break;
                    }
                case 6:
                    if (Math.abs(i) <= minFlingVelocity) {
                        minFlingVelocity2 = 9;
                        break;
                    } else {
                        minFlingVelocity2 = 7;
                        break;
                    }
                case 7:
                    tj = tj;
                    layoutManager = layoutManager;
                    if (!tj.A0A(layoutManager, i, i2)) {
                        minFlingVelocity2 = 9;
                        break;
                    } else {
                        minFlingVelocity2 = 8;
                        break;
                    }
                case 8:
                    z = true;
                    minFlingVelocity2 = 9;
                    break;
                case 9:
                    return z;
            }
        }
    }

    @Nullable
    @Deprecated
    public T3 A0E(C4G c4g) {
        if (!(c4g instanceof C4S)) {
            return null;
        }
        return new C0451Ep(this, this.A00.getContext());
    }

    public final void A0F() {
        TJ tj = this;
        char c2 = 0;
        char c3 = 0;
        C4G layoutManager = null;
        View viewA0D = null;
        int[] iArrA0H = null;
        C0452Eq c0452Eq = tj.A00;
        char c4 = c0452Eq == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c4) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    layoutManager = c0452Eq.getLayoutManager();
                    if (layoutManager != null) {
                        c4 = 5;
                        break;
                    } else {
                        c4 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    tj = tj;
                    layoutManager = layoutManager;
                    viewA0D = tj.A0D(layoutManager);
                    if (viewA0D != null) {
                        c4 = 7;
                        break;
                    } else {
                        c4 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    tj = tj;
                    layoutManager = layoutManager;
                    viewA0D = viewA0D;
                    iArrA0H = tj.A0H(layoutManager, viewA0D);
                    c2 = 0;
                    c3 = 1;
                    if (iArrA0H[0] != 0) {
                        c4 = '\t';
                        break;
                    } else {
                        c4 = '\b';
                        break;
                    }
                case '\b':
                    iArrA0H = iArrA0H;
                    if (iArrA0H[c3] == 0) {
                        c4 = '\n';
                        break;
                    } else {
                        c4 = '\t';
                        break;
                    }
                case '\t':
                    tj = tj;
                    iArrA0H = iArrA0H;
                    tj.A00.A1c(iArrA0H[c2], iArrA0H[c3]);
                    c4 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    public final void A0G(@Nullable C0452Eq c0452Eq) throws IllegalStateException {
        TJ tj = this;
        C0452Eq c0452Eq2 = tj.A00;
        char c2 = c0452Eq2 == c0452Eq ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq2 = c0452Eq2;
                    if (c0452Eq2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    tj = tj;
                    tj.A07();
                    c2 = 5;
                    break;
                case 5:
                    tj = tj;
                    c0452Eq = c0452Eq;
                    tj.A00 = c0452Eq;
                    if (tj.A00 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    tj = tj;
                    tj.A08();
                    tj.A01 = new Scroller(tj.A00.getContext(), new DecelerateInterpolator());
                    tj.A0F();
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }
}
