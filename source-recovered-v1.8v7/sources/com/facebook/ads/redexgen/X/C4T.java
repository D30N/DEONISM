package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4T {
    public static byte[] A07;
    public View A01;
    public C4G A02;
    public C0452Eq A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final C4R A06 = new C4R(0, 0);

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A07 = new byte[]{-40, -3, 5, -16, -5, -8, -13, -81, 3, -16, 1, -10, -12, 3, -81, -1, -2, 2, -8, 3, -8, -2, -3, -59, -42, -24, -24, -38, -39, -107, -28, -21, -38, -25, -107, -23, -42, -25, -36, -38, -23, -107, -27, -28, -24, -34, -23, -34, -28, -29, -107, -20, -35, -34, -31, -38, -107, -24, -30, -28, -28, -23, -35, -107, -24, -40, -25, -28, -31, -31, -34, -29, -36, -93, -3, 16, 14, 36, 14, 23, 16, 29, 1, 20, 16, 34};
    }

    public abstract void A0G();

    public abstract void A0H(int i, int i2, C4V c4v, C4R c4r);

    public abstract void A0I(View view, C4V c4v, C4R c4r);

    private final int A00(View view) {
        return this.A03.A1A(view);
    }

    private final View A01(int i) {
        return this.A03.A06.A1q(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, int i2) {
        C4T c4t = this;
        View view = null;
        C0452Eq c0452Eq = c4t.A03;
        char c2 = c4t.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4t = c4t;
                    if (c4t.A00 == -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    if (c0452Eq != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4t = c4t;
                    c4t.A09();
                    c2 = 5;
                    break;
                case 5:
                    c4t = c4t;
                    c4t.A04 = false;
                    view = c4t.A01;
                    if (view == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4t = c4t;
                    view = view;
                    if (c4t.A00(view) != c4t.A00) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4t = c4t;
                    c0452Eq = c0452Eq;
                    c4t.A0I(c4t.A01, c0452Eq.A0s, c4t.A06);
                    c4t.A06.A05(c0452Eq);
                    c4t.A09();
                    c2 = '\b';
                    break;
                case '\b':
                    c4t = c4t;
                    if (!c4t.A05) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c4t = c4t;
                    c0452Eq = c0452Eq;
                    c4t.A0H(i, i2, c0452Eq.A0s, c4t.A06);
                    boolean zA06 = c4t.A06.A06();
                    c4t.A06.A05(c0452Eq);
                    if (!zA06) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4t = c4t;
                    if (!c4t.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4t = c4t;
                    c0452Eq = c0452Eq;
                    c4t.A04 = true;
                    c0452Eq.A08.A07();
                    c2 = '\f';
                    break;
                case '\f':
                    return;
                case '\r':
                    c4t = c4t;
                    c4t.A09();
                    c2 = '\f';
                    break;
                case 14:
                    c4t = c4t;
                    Log.e(A02(74, 12, 103), A02(23, 51, 49));
                    c4t.A01 = null;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final int A06() {
        return this.A03.A06.A0W();
    }

    public final int A07() {
        return this.A00;
    }

    @Nullable
    public final C4G A08() {
        return this.A02;
    }

    public final void A09() {
        if (!this.A05) {
            return;
        }
        A0G();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0M(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0A(int i) {
        this.A00 = i;
    }

    public final void A0B(PointF pointF) {
        float fSqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public final void A0C(View view) {
        if (A00(view) == A07()) {
            this.A01 = view;
        }
    }

    public final void A0D(C0452Eq c0452Eq, C4G c4g) {
        this.A03 = c0452Eq;
        this.A02 = c4g;
        if (this.A00 != -1) {
            this.A03.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A07());
            this.A03.A08.A07();
            return;
        }
        throw new IllegalArgumentException(A02(0, 23, 75));
    }

    public final boolean A0E() {
        return this.A04;
    }

    public final boolean A0F() {
        return this.A05;
    }
}
