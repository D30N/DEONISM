package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4X implements Runnable {
    public static byte[] A07;
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ C0452Eq A06;
    public Interpolator A00 = C0452Eq.A19;
    public boolean A04 = false;
    public boolean A05 = false;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A07 = new byte[]{42, 46, 88, 43, 27, 10, 23, 20, 20};
    }

    public C4X(C0452Eq c0452Eq) {
        this.A06 = c0452Eq;
        this.A01 = new OverScroller(c0452Eq.getContext(), C0452Eq.A19);
    }

    private float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int absDx, int absDy, int i, int i2) {
        C4X c4x = this;
        C0452Eq c0452Eq = null;
        float fA00 = 0.0f;
        int iSqrt = 0;
        int iSqrt2 = 0;
        int height = 0;
        boolean z = false;
        int iRound = 0;
        float f = 0.0f;
        int i3 = 0;
        C4X c4x2 = c4x;
        int iAbs = Math.abs(absDx);
        int iAbs2 = Math.abs(absDy);
        char c2 = iAbs > iAbs2 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c4x2 = c4x2;
                    iSqrt = (int) Math.sqrt((i * i) + (i2 * i2));
                    iSqrt2 = (int) Math.sqrt((absDx * absDx) + (absDy * absDy));
                    c0452Eq = c4x2.A06;
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    height = c0452Eq.getWidth();
                    c2 = 5;
                    break;
                case 5:
                    c4x = c4x;
                    int i4 = height / 2;
                    f = 1.0f;
                    fA00 = i4 + (i4 * c4x.A00(Math.min(1.0f, (iSqrt2 * 1.0f) / height)));
                    if (iSqrt <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iRound = Math.round(Math.abs(fA00 / iSqrt) * 1000.0f) * 4;
                    c2 = 7;
                    break;
                case 7:
                    return Math.min(iRound, AdError.SERVER_ERROR_CODE);
                case '\b':
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i3 = iAbs;
                    c2 = '\n';
                    break;
                case '\n':
                    iRound = (int) (((i3 / height) + f) * 300.0f);
                    c2 = 7;
                    break;
                case 11:
                    i3 = iAbs2;
                    c2 = '\n';
                    break;
                case '\f':
                    c0452Eq = c0452Eq;
                    height = c0452Eq.getHeight();
                    c2 = 5;
                    break;
                case '\r':
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i, int i2, int i3, int i4) {
        A0B(i, i2, A01(i, i2, i3, i4));
    }

    public final void A07() {
        C4X c4x = this;
        char c2 = c4x.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4x = c4x;
                    c4x.A05 = true;
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c4x = c4x;
                    c4x.A06.removeCallbacks(c4x);
                    C2v.A0C(c4x.A06, c4x);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i, int i2) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        A07();
    }

    public final void A0A(int i, int i2) {
        A06(i, i2, 0, 0);
    }

    public final void A0B(int i, int i2, int i3) {
        A0C(i, i2, i3, C0452Eq.A19);
    }

    public final void A0C(int i, int i2, int i3, Interpolator interpolator) {
        C4X c4x = this;
        char c2 = c4x.A00 != interpolator ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4x = c4x;
                    interpolator = interpolator;
                    c4x.A00 = interpolator;
                    c4x.A01 = new OverScroller(c4x.A06.getContext(), interpolator);
                    c2 = 3;
                    break;
                case 3:
                    c4x = c4x;
                    c4x.A06.setScrollState(2);
                    c4x.A03 = 0;
                    c4x.A02 = 0;
                    c4x.A01.startScroll(0, 0, i, i2, i3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4x = c4x;
                    c4x.A01.computeScrollOffset();
                    c2 = 5;
                    break;
                case 5:
                    c4x.A07();
                    return;
            }
        }
    }

    public final void A0D(int i, int i2, Interpolator interpolator) {
        Interpolator interpolator2 = null;
        int iA01 = A01(i, i2, 0, 0);
        char c2 = interpolator == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    interpolator2 = C0452Eq.A19;
                    c2 = 3;
                    break;
                case 3:
                    A0C(i, i2, iA01, interpolator2);
                    return;
                case 4:
                    interpolator = interpolator;
                    interpolator2 = interpolator;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4X c4x = this;
        int iA03 = 0;
        boolean z = false;
        int velX = 0;
        int adapterSize = 0;
        int velY = 0;
        int overscrollX = 0;
        int vel = 0;
        int i = 0;
        int x = 0;
        boolean z2 = false;
        int overscrollY = 0;
        int[] iArr = null;
        int velY2 = 0;
        OverScroller overScroller = null;
        int i2 = 0;
        int i3 = 0;
        char c2 = 0;
        boolean z3 = false;
        int i4 = 0;
        C4T c4t = null;
        int iA1i = 0;
        int i5 = 0;
        int iA1h = 0;
        int i6 = 0;
        C4X c4x2 = c4x;
        char c3 = c4x2.A06.A06 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    c4x.A08();
                    return;
                case 3:
                    c4x = c4x;
                    c4x2 = c4x2;
                    c4x.A04();
                    c4x2.A06.A1H();
                    overScroller = c4x2.A01;
                    c4t = c4x2.A06.A06.A02;
                    z2 = false;
                    if (!overScroller.computeScrollOffset()) {
                        c3 = '?';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    c4x2 = c4x2;
                    overScroller = overScroller;
                    iArr = c4x2.A06.A16;
                    vel = overScroller.getCurrX();
                    overscrollX = overScroller.getCurrY();
                    i = vel - c4x2.A02;
                    i3 = overscrollX - c4x2.A03;
                    iA1h = 0;
                    iA1i = 0;
                    c4x2.A02 = vel;
                    c4x2.A03 = overscrollX;
                    i5 = 0;
                    i2 = 0;
                    c2 = 1;
                    if (!c4x2.A06.A1w(i, i3, iArr, null, 1)) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    iArr = iArr;
                    z2 = false;
                    i -= iArr[0];
                    i3 -= iArr[c2];
                    c3 = 6;
                    break;
                case 6:
                    c4x2 = c4x2;
                    if (c4x2.A06.A04 == null) {
                        c3 = 'U';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    c4x2 = c4x2;
                    c4x2.A06.A1I();
                    c4x2.A06.A1J();
                    C2I.A01(A02(0, 9, 36));
                    C0452Eq c0452Eq = c4x2.A06;
                    c0452Eq.A1j(c0452Eq.A0s);
                    if (i == 0) {
                        c3 = '\t';
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    c4x2 = c4x2;
                    iA1h = c4x2.A06.A06.A1h(i, c4x2.A06.A0r, c4x2.A06.A0s);
                    i5 = i - iA1h;
                    c3 = '\t';
                    break;
                case '\t':
                    if (i3 == 0) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    c4x2 = c4x2;
                    iA1i = c4x2.A06.A06.A1i(i3, c4x2.A06.A0r, c4x2.A06.A0s);
                    i2 = i3 - iA1i;
                    c3 = 11;
                    break;
                case 11:
                    c4x2 = c4x2;
                    c4t = c4t;
                    C2I.A00();
                    c4x2.A06.A1N();
                    c4x2.A06.A1K();
                    c4x2.A06.A1p(z2);
                    if (c4t == null) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    c4t = c4t;
                    if (!c4t.A0E()) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case '\r':
                    c4t = c4t;
                    if (!c4t.A0F()) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    c4x2 = c4x2;
                    iA03 = c4x2.A06.A0s.A03();
                    if (iA03 != 0) {
                        c3 = 'R';
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    c4t = c4t;
                    c4t.A09();
                    c3 = 16;
                    break;
                case 16:
                    velY2 = iA1i;
                    i4 = i5;
                    i6 = i2;
                    c3 = 17;
                    break;
                case 17:
                    c4x2 = c4x2;
                    if (!c4x2.A06.A0v.isEmpty()) {
                        c3 = 18;
                        break;
                    } else {
                        c3 = 19;
                        break;
                    }
                case 18:
                    c4x2 = c4x2;
                    c4x2.A06.invalidate();
                    c3 = 19;
                    break;
                case 19:
                    c4x2 = c4x2;
                    adapterSize = 2;
                    if (c4x2.A06.getOverScrollMode() == 2) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 20:
                    c4x2 = c4x2;
                    c4x2.A06.A1X(i, i3);
                    c3 = 21;
                    break;
                case 21:
                    c4x2 = c4x2;
                    if (!c4x2.A06.A1v(iA1h, velY2, i4, i6, null, 1)) {
                        c3 = 22;
                        break;
                    } else {
                        c3 = '\'';
                        break;
                    }
                case 22:
                    if (i4 != 0) {
                        c3 = 24;
                        break;
                    } else {
                        c3 = 23;
                        break;
                    }
                case 23:
                    if (i6 == 0) {
                        c3 = '\'';
                        break;
                    } else {
                        c3 = 24;
                        break;
                    }
                case 24:
                    overScroller = overScroller;
                    x = (int) overScroller.getCurrVelocity();
                    if (i4 == vel) {
                        c3 = 'Q';
                        break;
                    } else {
                        c3 = 25;
                        break;
                    }
                case 25:
                    if (i4 >= 0) {
                        c3 = 'N';
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    int overscrollY2 = x;
                    overscrollY = -overscrollY2;
                    c3 = 27;
                    break;
                case 27:
                    if (i6 == overscrollX) {
                        c3 = 'M';
                        break;
                    } else {
                        c3 = 28;
                        break;
                    }
                case 28:
                    if (i6 >= 0) {
                        c3 = 'J';
                        break;
                    } else {
                        c3 = 29;
                        break;
                    }
                case 29:
                    int velY3 = x;
                    velY = -velY3;
                    c3 = 30;
                    break;
                case 30:
                    c4x2 = c4x2;
                    if (c4x2.A06.getOverScrollMode() == adapterSize) {
                        c3 = ' ';
                        break;
                    } else {
                        c3 = 31;
                        break;
                    }
                case 31:
                    c4x2 = c4x2;
                    c4x2.A06.A1W(overscrollY, velY);
                    c3 = ' ';
                    break;
                case ' ':
                    if (overscrollY != 0) {
                        c3 = '#';
                        break;
                    } else {
                        c3 = '!';
                        break;
                    }
                case '!':
                    if (i4 == vel) {
                        c3 = '#';
                        break;
                    } else {
                        c3 = '\"';
                        break;
                    }
                case '\"':
                    overScroller = overScroller;
                    if (overScroller.getFinalX() != 0) {
                        c3 = '\'';
                        break;
                    } else {
                        c3 = '#';
                        break;
                    }
                case '#':
                    if (velY != 0) {
                        c3 = '&';
                        break;
                    } else {
                        c3 = '$';
                        break;
                    }
                case '$':
                    if (i6 == overscrollX) {
                        c3 = '&';
                        break;
                    } else {
                        c3 = '%';
                        break;
                    }
                case '%':
                    overScroller = overScroller;
                    if (overScroller.getFinalY() != 0) {
                        c3 = '\'';
                        break;
                    } else {
                        c3 = '&';
                        break;
                    }
                case '&':
                    overScroller = overScroller;
                    overScroller.abortAnimation();
                    c3 = '\'';
                    break;
                case '\'':
                    if (iA1h != 0) {
                        c3 = ')';
                        break;
                    } else {
                        c3 = '(';
                        break;
                    }
                case '(':
                    if (velY2 == 0) {
                        c3 = '*';
                        break;
                    } else {
                        c3 = ')';
                        break;
                    }
                case ')':
                    c4x2 = c4x2;
                    c4x2.A06.A1Z(iA1h, velY2);
                    c3 = '*';
                    break;
                case '*':
                    c4x2 = c4x2;
                    if (!c4x2.A06.awakenScrollBars()) {
                        c3 = '+';
                        break;
                    } else {
                        c3 = ',';
                        break;
                    }
                case '+':
                    c4x2 = c4x2;
                    c4x2.A06.invalidate();
                    c3 = ',';
                    break;
                case ',':
                    if (i3 == 0) {
                        c3 = 'I';
                        break;
                    } else {
                        c3 = '-';
                        break;
                    }
                case '-':
                    c4x2 = c4x2;
                    if (!c4x2.A06.A06.A25()) {
                        c3 = 'I';
                        break;
                    } else {
                        c3 = '.';
                        break;
                    }
                case '.':
                    if (velY2 != i3) {
                        c3 = 'I';
                        break;
                    } else {
                        c3 = '/';
                        break;
                    }
                case '/':
                    z3 = true;
                    c3 = '0';
                    break;
                case '0':
                    if (i == 0) {
                        c3 = 'H';
                        break;
                    } else {
                        c3 = '1';
                        break;
                    }
                case '1':
                    c4x2 = c4x2;
                    if (!c4x2.A06.A06.A24()) {
                        c3 = 'H';
                        break;
                    } else {
                        c3 = '2';
                        break;
                    }
                case '2':
                    if (iA1h != i) {
                        c3 = 'H';
                        break;
                    } else {
                        c3 = '3';
                        break;
                    }
                case '3':
                    velX = 1;
                    c3 = '4';
                    break;
                case '4':
                    if (i != 0) {
                        c3 = '6';
                        break;
                    } else {
                        c3 = '5';
                        break;
                    }
                case '5':
                    if (i3 == 0) {
                        c3 = '8';
                        break;
                    } else {
                        c3 = '6';
                        break;
                    }
                case '6':
                    if (velX != 0) {
                        c3 = '8';
                        break;
                    } else {
                        c3 = '7';
                        break;
                    }
                case '7':
                    if (!z3) {
                        c3 = 'G';
                        break;
                    } else {
                        c3 = '8';
                        break;
                    }
                case '8':
                    z = true;
                    c3 = '9';
                    break;
                case '9':
                    overScroller = overScroller;
                    if (!overScroller.isFinished()) {
                        c3 = ':';
                        break;
                    } else {
                        c3 = '<';
                        break;
                    }
                case ':':
                    if (!z) {
                        c3 = ';';
                        break;
                    } else {
                        c3 = 'E';
                        break;
                    }
                case ';':
                    c4x2 = c4x2;
                    if (!c4x2.A06.A1t(1)) {
                        c3 = '<';
                        break;
                    } else {
                        c3 = 'E';
                        break;
                    }
                case '<':
                    c4x2 = c4x2;
                    c4x2.A06.setScrollState(0);
                    if (!C0452Eq.A1D) {
                        c3 = '>';
                        break;
                    } else {
                        c3 = '=';
                        break;
                    }
                case '=':
                    c4x2 = c4x2;
                    c4x2.A06.A02.A02();
                    c3 = '>';
                    break;
                case '>':
                    c4x2 = c4x2;
                    c4x2.A06.A1V(1);
                    c3 = '?';
                    break;
                case '?':
                    c4t = c4t;
                    if (c4t == null) {
                        c3 = 'D';
                        break;
                    } else {
                        c3 = '@';
                        break;
                    }
                case '@':
                    c4t = c4t;
                    if (!c4t.A0E()) {
                        c3 = 'B';
                        break;
                    } else {
                        c3 = 'A';
                        break;
                    }
                case 'A':
                    c4t = c4t;
                    c4t.A04(0, 0);
                    c3 = 'B';
                    break;
                case 'B':
                    c4x2 = c4x2;
                    if (!c4x2.A05) {
                        c3 = 'C';
                        break;
                    } else {
                        c3 = 'D';
                        break;
                    }
                case 'C':
                    c4t = c4t;
                    c4t.A09();
                    c3 = 'D';
                    break;
                case 'D':
                    c4x.A05();
                    return;
                case 'E':
                    c4x = c4x;
                    c4x2 = c4x2;
                    c4x.A07();
                    if (c4x2.A06.A03 == null) {
                        c3 = '?';
                        break;
                    } else {
                        c3 = 'F';
                        break;
                    }
                case 'F':
                    c4x2 = c4x2;
                    c4x2.A06.A03.A0B(c4x2.A06, i, i3);
                    c3 = '?';
                    break;
                case 'G':
                    z = false;
                    c3 = '9';
                    break;
                case 'H':
                    velX = 0;
                    c3 = '4';
                    break;
                case 'I':
                    z3 = false;
                    c3 = '0';
                    break;
                case 'J':
                    if (i6 <= 0) {
                        c3 = 'L';
                        break;
                    } else {
                        c3 = 'K';
                        break;
                    }
                case 'K':
                    velY = x;
                    c3 = 30;
                    break;
                case 'L':
                    velY = 0;
                    c3 = 30;
                    break;
                case 'M':
                    velY = 0;
                    c3 = 30;
                    break;
                case 'N':
                    if (i4 <= 0) {
                        c3 = 'P';
                        break;
                    } else {
                        c3 = 'O';
                        break;
                    }
                case 'O':
                    overscrollY = x;
                    c3 = 27;
                    break;
                case 'P':
                    overscrollY = 0;
                    c3 = 27;
                    break;
                case 'Q':
                    overscrollY = 0;
                    c3 = 27;
                    break;
                case 'R':
                    c4t = c4t;
                    if (c4t.A07() < iA03) {
                        c3 = 'T';
                        break;
                    } else {
                        c3 = 'S';
                        break;
                    }
                case 'S':
                    c4t = c4t;
                    c4t.A0A(iA03 - 1);
                    c4t.A04(i - i5, i3 - i2);
                    c3 = 16;
                    break;
                case k.AppCompatTheme_panelBackground /* 84 */:
                    c4t = c4t;
                    c4t.A04(i - i5, i3 - i2);
                    c3 = 16;
                    break;
                case 'U':
                    i2 = 0;
                    iA1i = 0;
                    i5 = 0;
                    velY2 = 0;
                    i4 = 0;
                    i6 = 0;
                    c3 = 17;
                    break;
            }
        }
    }
}
