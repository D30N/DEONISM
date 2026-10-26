package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0491Gf {
    public static byte[] A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int[] A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final boolean[] A0X;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0M = new byte[]{15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 48, 47, 41, 46, 51, 60, 51, 57, 59, 46, 51, 53, 52, 122, 44, 59, 54, 47, 63, 96, 122};
    }

    static {
        A04();
        A0O = A01(2, 2, 2, 0);
        A0N = A01(0, 0, 0, 0);
        A0P = A01(0, 0, 0, 3);
        A0U = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0V = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0W = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0X = new boolean[]{false, false, false, true, true, true, false};
        int i = A0N;
        int i2 = A0P;
        A0T = new int[]{i, i2, i, i, i2, i, i};
        A0S = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0R = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0Q = new int[]{i, i, i, i, i, i2, i2};
    }

    public C0491Gf() {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        return A01(i, i2, i3, 0);
    }

    public static int A01(int i, int i2, int alpha, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        IJ.A00(i, 0, 4);
        IJ.A00(i2, 0, 4);
        IJ.A00(alpha, 0, 4);
        IJ.A00(i3, 0, 4);
        char c2 = i3 != 0 ? (char) 2 : (char) 17;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 == 1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i3 == 2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i3 == 3) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i6 = 255;
                    c2 = 6;
                    break;
                case 6:
                    if (i <= 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i5 = 255;
                    c2 = '\b';
                    break;
                case '\b':
                    if (i2 <= 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i4 = 255;
                    c2 = '\n';
                    break;
                case '\n':
                    if (alpha <= 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i7 = 255;
                    c2 = '\f';
                    break;
                case '\f':
                    return Color.argb(i6, i5, i4, i7);
                case '\r':
                    i4 = 0;
                    c2 = '\n';
                    break;
                case 14:
                    i5 = 0;
                    c2 = '\b';
                    break;
                case 15:
                    i6 = 0;
                    c2 = 6;
                    break;
                case 16:
                    i6 = 127;
                    c2 = 6;
                    break;
                case 17:
                    i6 = 255;
                    c2 = 6;
                    break;
            }
        }
    }

    private final SpannableString A02() {
        C0491Gf c0491Gf = this;
        int length = 0;
        int i = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c0491Gf.A0K);
        int length2 = spannableStringBuilder.length();
        char c2 = length2 > 0 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c0491Gf = c0491Gf;
                    i = 33;
                    length = -1;
                    if (c0491Gf.A06 == -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0491Gf = c0491Gf;
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new StyleSpan(2), c0491Gf.A06, length2, i);
                    c2 = 4;
                    break;
                case 4:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A0C == length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0491Gf = c0491Gf;
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new UnderlineSpan(), c0491Gf.A0C, length2, i);
                    c2 = 6;
                    break;
                case 6:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A04 == length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0491Gf = c0491Gf;
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c0491Gf.A03), c0491Gf.A04, length2, i);
                    c2 = '\b';
                    break;
                case '\b':
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A02 == length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0491Gf = c0491Gf;
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(c0491Gf.A01), c0491Gf.A02, length2, i);
                    c2 = '\n';
                    break;
                case '\n':
                    return new SpannableString(spannableStringBuilder);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.C1059b5 A05() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0491Gf.A05():com.facebook.ads.redexgen.X.b5");
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            this.A0K.delete(length - 1, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i = A0N;
        this.A0E = i;
        this.A03 = A0O;
        this.A01 = i;
    }

    public final void A09(char c2) {
        C0491Gf c0491Gf = this;
        int i = 0;
        int i2 = 0;
        char c3 = c2 == '\n' ? (char) 2 : (char) 14;
        while (true) {
            switch (c3) {
                case 2:
                    c0491Gf = c0491Gf;
                    c0491Gf.A0L.add(c0491Gf.A02());
                    c0491Gf.A0K.clear();
                    i = -1;
                    i2 = 0;
                    if (c0491Gf.A06 == -1) {
                        c3 = 4;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    c0491Gf = c0491Gf;
                    i2 = 0;
                    c0491Gf.A06 = 0;
                    c3 = 4;
                    break;
                case 4:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A0C == i) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    c0491Gf = c0491Gf;
                    c0491Gf.A0C = i2;
                    c3 = 6;
                    break;
                case 6:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A04 == i) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    c0491Gf = c0491Gf;
                    c0491Gf.A04 = i2;
                    c3 = '\b';
                    break;
                case '\b':
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A02 == i) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    c0491Gf = c0491Gf;
                    c0491Gf.A02 = i2;
                    c3 = '\n';
                    break;
                case '\n':
                    c0491Gf = c0491Gf;
                    if (!c0491Gf.A0I) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A0L.size() >= c0491Gf.A0B) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A0L.size() < 15) {
                        c3 = 15;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    c0491Gf = c0491Gf;
                    c0491Gf.A0L.remove(i2);
                    c3 = '\n';
                    break;
                case 14:
                    c0491Gf = c0491Gf;
                    c0491Gf.A0K.append(c2);
                    c3 = 15;
                    break;
                case 15:
                    return;
            }
        }
    }

    public final void A0A(int i, int i2) {
        if (this.A0A != i) {
            A09('\n');
        }
        this.A0A = i;
    }

    public final void A0B(int i, int i2, int i3) {
        C0491Gf c0491Gf = this;
        int i4 = 0;
        int i5 = 0;
        char c2 = c0491Gf.A04 != -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0491Gf = c0491Gf;
                    i5 = c0491Gf.A03;
                    if (i5 == i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0491Gf = c0491Gf;
                    c0491Gf.A0K.setSpan(new ForegroundColorSpan(i5), c0491Gf.A04, c0491Gf.A0K.length(), 33);
                    c2 = 4;
                    break;
                case 4:
                    if (i == A0O) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0491Gf = c0491Gf;
                    c0491Gf.A04 = c0491Gf.A0K.length();
                    c0491Gf.A03 = i;
                    c2 = 6;
                    break;
                case 6:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A02 == -1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0491Gf = c0491Gf;
                    i4 = c0491Gf.A01;
                    if (i4 == i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0491Gf = c0491Gf;
                    c0491Gf.A0K.setSpan(new BackgroundColorSpan(i4), c0491Gf.A02, c0491Gf.A0K.length(), 33);
                    c2 = '\t';
                    break;
                case '\t':
                    if (i2 == A0N) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0491Gf = c0491Gf;
                    c0491Gf.A02 = c0491Gf.A0K.length();
                    c0491Gf.A01 = i2;
                    c2 = 11;
                    break;
                case 11:
                    return;
            }
        }
    }

    public final void A0C(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
        C0491Gf c0491Gf = this;
        char c2 = c0491Gf.A06 != -1 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0491Gf = c0491Gf;
                    c0491Gf.A0K.setSpan(new StyleSpan(2), c0491Gf.A06, c0491Gf.A0K.length(), 33);
                    c0491Gf.A06 = -1;
                    c2 = 4;
                    break;
                case 4:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A0C == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c0491Gf = c0491Gf;
                    c0491Gf.A0K.setSpan(new UnderlineSpan(), c0491Gf.A0C, c0491Gf.A0K.length(), 33);
                    c0491Gf.A0C = -1;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    if (!z2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0491Gf = c0491Gf;
                    c0491Gf.A0C = c0491Gf.A0K.length();
                    c2 = 7;
                    break;
                case '\n':
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0491Gf = c0491Gf;
                    c0491Gf.A06 = c0491Gf.A0K.length();
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A0D(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.A0E = i;
        this.A07 = i6;
    }

    public final void A0E(boolean z) {
        this.A0J = z;
    }

    public final void A0F(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0491Gf c0491Gf = this;
        C0491Gf c0491Gf2 = c0491Gf;
        c0491Gf2.A0G = true;
        c0491Gf2.A0J = z;
        c0491Gf2.A0I = z2;
        c0491Gf2.A09 = i;
        c0491Gf2.A0H = z4;
        c0491Gf2.A0D = i2;
        c0491Gf2.A05 = i3;
        c0491Gf2.A00 = i6;
        char c2 = c0491Gf2.A0B != i4 + 1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0491Gf2 = c0491Gf2;
                    c0491Gf2.A0B = i4 + 1;
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
                    c0491Gf2 = c0491Gf2;
                    if (c0491Gf2.A0L.size() >= c0491Gf2.A0B) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0491Gf2 = c0491Gf2;
                    if (c0491Gf2.A0L.size() < 15) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0491Gf2 = c0491Gf2;
                    c0491Gf2.A0L.remove(0);
                    c2 = 3;
                    break;
                case 7:
                    if (i7 == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0491Gf2 = c0491Gf2;
                    if (c0491Gf2.A0F == i7) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0491Gf = c0491Gf;
                    c0491Gf2 = c0491Gf2;
                    c0491Gf2.A0F = i7;
                    int i9 = i7 - 1;
                    c0491Gf.A0D(A0T[i9], A0P, A0X[i9], 0, A0V[i9], A0W[i9], A0U[i9]);
                    c2 = '\n';
                    break;
                case '\n':
                    if (i8 == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0491Gf2 = c0491Gf2;
                    if (c0491Gf2.A08 == i8) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0491Gf = c0491Gf;
                    c0491Gf2 = c0491Gf2;
                    c0491Gf2.A08 = i8;
                    int i10 = i8 - 1;
                    c0491Gf.A0C(0, 1, 1, false, false, A0R[i10], A0S[i10]);
                    c0491Gf2.A0B(A0O, A0Q[i10], A0N);
                    c2 = '\r';
                    break;
                case '\r':
                    return;
            }
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        C0491Gf c0491Gf = this;
        boolean z = false;
        char c2 = c0491Gf.A0G() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0491Gf = c0491Gf;
                    if (!c0491Gf.A0L.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0491Gf = c0491Gf;
                    if (c0491Gf.A0K.length() != 0) {
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

    public final boolean A0I() {
        return this.A0J;
    }
}
