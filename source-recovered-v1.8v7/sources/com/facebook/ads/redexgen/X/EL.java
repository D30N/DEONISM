package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import d.b.a.b.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class EL implements Handler.Callback, InterfaceC1018aQ, HS, F9, InterfaceC03449t, AQ {
    public static byte[] A0V;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public A5 A04;
    public AG A05;
    public FA A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public YC[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final Y6 A0G;
    public final YA A0H;
    public final AB A0J;
    public final AZ A0L;
    public final C0351Aa A0M;
    public final HT A0N;
    public final HU A0O;
    public final IM A0P;
    public final IW A0Q;
    public final ArrayList<A3> A0R;
    public final boolean A0S;
    public final YC[] A0T;
    public final AU[] A0U;
    public final AE A0K = new AE();
    public AX A06 = AX.A03;
    public final A4 A0I = new A4(null);

    static {
        A0K();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 23);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0K() {
        A0V = new byte[]{85, 94, 98, 94, 92, 84, 102, 94, 67, 90, 35, 4, 30, 15, 24, 4, 11, 6, 74, 24, 31, 4, 30, 3, 7, 15, 74, 15, 24, 24, 5, 24, 68, 85, 123, 114, 115, 110, 117, 114, 123, 60, 113, 121, 111, 111, 125, 123, 121, 111, 60, 111, 121, 114, 104, 60, 125, 122, 104, 121, 110, 60, 110, 121, 112, 121, 125, 111, 121, 50, 109, 80, 71, 120, 68, 73, 81, 77, 90, 97, 69, 88, 68, 97, 70, 92, 77, 90, 70, 73, 68, 110, 73, 82, 77, 29, 91, 92, 84, 81, 88, 89, 19, 18, 46, 52, 51, 34, 36, 97, 36, 51, 51, 46, 51, 111, 15, 50, 37, 26, 38, 43, 51, 47, 56, 3, 39, 58, 38, 3, 36, 62, 47, 56, 36, 43, 38, 112, 2, 43, 36, 46, 38, 47, 56, 116, 72, 69, 93, 70, 69, 71, 79, 4, 65, 86, 86, 75, 86, 10};
    }

    public EL(YC[] ycArr, HT ht, HU hu, AB ab, boolean z, int i, boolean z2, Handler handler, YA ya, IM im) {
        this.A0T = ycArr;
        this.A0N = ht;
        this.A0O = hu;
        this.A0J = ab;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = ya;
        this.A0P = im;
        this.A0D = ab.A5R();
        this.A0S = ab.ACi();
        this.A05 = new AG(AbstractC0352Ab.A00, -9223372036854775807L, TrackGroupArray.A03, hu);
        this.A0U = new AU[ycArr.length];
        for (int i2 = 0; i2 < ycArr.length; i2++) {
            ycArr[i2].AD3(i2);
            this.A0U[i2] = ycArr[i2].A5d();
        }
        this.A0G = new Y6(this, im);
        this.A0R = new ArrayList<>();
        this.A0C = new YC[0];
        this.A0M = new C0351Aa();
        this.A0L = new AZ();
        ht.A00(this);
        this.A0F = new HandlerThread(A06(k.AppCompatTheme_windowActionBarOverlay, 29, 93), -16);
        this.A0F.start();
        this.A0Q = im.A4I(this.A0F.getLooper(), this);
    }

    private int A00() {
        EL el = this;
        int i = 0;
        AbstractC0352Ab abstractC0352Ab = el.A05.A03;
        char c2 = abstractC0352Ab.A0E() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    el = el;
                    abstractC0352Ab = abstractC0352Ab;
                    i = abstractC0352Ab.A0B(abstractC0352Ab.A05(el.A0B), el.A0M).A00;
                    c2 = 3;
                    break;
            }
        }
    }

    private int A01(int i, AbstractC0352Ab abstractC0352Ab, AbstractC0352Ab abstractC0352Ab2) {
        int maxIterations = i;
        AbstractC0352Ab abstractC0352Ab3 = abstractC0352Ab;
        EL el = this;
        int i2 = 0;
        int iA04 = -1;
        int iA00 = abstractC0352Ab3.A00();
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= iA00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = -1;
                    if (iA04 != -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el = el;
                    abstractC0352Ab3 = abstractC0352Ab3;
                    maxIterations = abstractC0352Ab3.A03(maxIterations, el.A0L, el.A0M, el.A02, el.A0B);
                    if (maxIterations != i2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return iA04;
                case 6:
                    el = el;
                    abstractC0352Ab3 = abstractC0352Ab3;
                    abstractC0352Ab2 = abstractC0352Ab2;
                    iA04 = abstractC0352Ab2.A04(abstractC0352Ab3.A0A(maxIterations, el.A0L, true).A03);
                    i3++;
                    c2 = 2;
                    break;
            }
        }
    }

    private long A02(F8 f8, long j) throws C03479w {
        boolean z = false;
        char c2 = this.A0K.A0G() != this.A0K.A0H() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return A03(f8, j, z);
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private long A03(F8 f8, long j, boolean z) throws C03479w {
        F8 f82 = f8;
        long jACt = j;
        EL el = this;
        YC[] ycArr = null;
        int i = 0;
        int length = 0;
        el.A0H();
        el.A09 = false;
        el.A0N(2);
        AC acA0G = el.A0K.A0G();
        AC acA0C = acA0G;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    acA0C = acA0C;
                    if (acA0C == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    f82 = f82;
                    acA0C = acA0C;
                    if (!el.A0t(f82, jACt, acA0C)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el = el;
                    acA0C = acA0C;
                    el.A0K.A0S(acA0C);
                    c2 = 5;
                    break;
                case 5:
                    acA0G = acA0G;
                    acA0C = acA0C;
                    if (acA0G != acA0C) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    el = el;
                    ycArr = el.A0C;
                    length = ycArr.length;
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    if (i >= length) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    el = el;
                    ycArr = ycArr;
                    el.A0b(ycArr[i]);
                    i++;
                    c2 = '\b';
                    break;
                case '\n':
                    el = el;
                    acA0C = el.A0K.A0C();
                    c2 = 2;
                    break;
                case 11:
                    el = el;
                    el.A0C = new YC[0];
                    acA0G = null;
                    c2 = '\f';
                    break;
                case '\f':
                    acA0C = acA0C;
                    if (acA0C == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    el = el;
                    acA0C = acA0C;
                    el.A0V(acA0G);
                    if (!acA0C.A05) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    el = el;
                    acA0C = acA0C;
                    jACt = acA0C.A08.ACt(jACt);
                    acA0C.A08.A4m(jACt - el.A0D, el.A0S);
                    c2 = 15;
                    break;
                case 15:
                    el = el;
                    el.A0P(jACt);
                    el.A09();
                    c2 = 16;
                    break;
                case 16:
                    el.A0Q.ACv(2);
                    return jACt;
                case 17:
                    el = el;
                    el.A0K.A0O(true);
                    el.A0P(jACt);
                    c2 = 16;
                    break;
            }
        }
    }

    private Pair<Integer, Long> A04(A5 a5, boolean z) {
        EL el = this;
        int iA01 = 0;
        int periodIndex = 0;
        Pair<Integer, Long> pairA07 = null;
        int i = 0;
        AbstractC0352Ab abstractC0352Ab = el.A05.A03;
        AbstractC0352Ab abstractC0352Ab2 = a5.A02;
        char c2 = abstractC0352Ab.A0E() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Pair) null;
                case 3:
                    abstractC0352Ab2 = abstractC0352Ab2;
                    if (!abstractC0352Ab2.A0E()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC0352Ab = abstractC0352Ab;
                    abstractC0352Ab2 = abstractC0352Ab;
                    c2 = 5;
                    break;
                case 5:
                    try {
                        el = el;
                        pairA07 = abstractC0352Ab2.A07(el.A0M, el.A0L, a5.A00, a5.A01);
                        if (abstractC0352Ab != abstractC0352Ab2) {
                            c2 = '\f';
                            break;
                        } else {
                            c2 = 11;
                            break;
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw new AA(abstractC0352Ab, a5.A00, a5.A01);
                    }
                case 11:
                    return pairA07;
                case '\f':
                    el = el;
                    abstractC0352Ab = abstractC0352Ab;
                    abstractC0352Ab2 = abstractC0352Ab2;
                    pairA07 = pairA07;
                    periodIndex = abstractC0352Ab.A04(abstractC0352Ab2.A0A(((Integer) pairA07.first).intValue(), el.A0L, true).A03);
                    i = -1;
                    if (periodIndex == -1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    return Pair.create(Integer.valueOf(periodIndex), pairA07.second);
                case 14:
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    el = el;
                    abstractC0352Ab = abstractC0352Ab;
                    abstractC0352Ab2 = abstractC0352Ab2;
                    pairA07 = pairA07;
                    iA01 = el.A01(((Integer) pairA07.first).intValue(), abstractC0352Ab2, abstractC0352Ab);
                    if (iA01 == i) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    EL el2 = el;
                    AbstractC0352Ab abstractC0352Ab3 = abstractC0352Ab;
                    return el2.A05(abstractC0352Ab3, abstractC0352Ab3.A09(iA01, el2.A0L).A00, -9223372036854775807L);
                case 17:
                    return (Pair) null;
            }
        }
    }

    private Pair<Integer, Long> A05(AbstractC0352Ab abstractC0352Ab, int i, long j) {
        return abstractC0352Ab.A07(this.A0M, this.A0L, i, j);
    }

    private void A07() throws IOException, C03479w {
        EL el = this;
        int i = 0;
        YC[] ycArr = null;
        int i2 = 0;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        int length2 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        long jElapsedRealtime = 0;
        YC renderer = null;
        YC[] ycArr2 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        AC acA0G = null;
        long j = 0;
        EL el2 = el;
        long jADk = el2.A0P.ADk();
        el.A0I();
        char c2 = !el2.A0K.A0P() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    el.A0B();
                    el2.A0R(jADk, 10L);
                    return;
                case 3:
                    el = el;
                    el2 = el2;
                    acA0G = el2.A0K.A0G();
                    C0557Iv.A02(A06(0, 10, 38));
                    el.A0J();
                    jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    acA0G.A08.A4m(el2.A05.A0A - el2.A0D, el2.A0S);
                    z2 = true;
                    z4 = true;
                    ycArr2 = el2.A0C;
                    length2 = ycArr2.length;
                    i5 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i5 >= length2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el2 = el2;
                    ycArr2 = ycArr2;
                    renderer = ycArr2[i5];
                    renderer.ACW(el2.A03, jElapsedRealtime);
                    z5 = true;
                    if (!z2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    renderer = renderer;
                    if (!renderer.A7c()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    renderer = renderer;
                    z2 = z;
                    boolean rendererReadyOrEnded = renderer.A7k();
                    if (!rendererReadyOrEnded) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\t':
                    renderer = renderer;
                    if (!renderer.A7c()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    el2 = el2;
                    renderer = renderer;
                    if (!el2.A0s(renderer)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z3 = true;
                    c2 = '\f';
                    break;
                case '\f':
                    if (!z3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    renderer = renderer;
                    renderer.A8Y();
                    c2 = 14;
                    break;
                case 14:
                    if (!z4) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (!z3) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    z4 = z5;
                    i5++;
                    c2 = 4;
                    break;
                case 17:
                    z5 = false;
                    c2 = 16;
                    break;
                case 18:
                    z3 = false;
                    c2 = '\f';
                    break;
                case 19:
                    z = false;
                    c2 = '\b';
                    break;
                case 20:
                    if (!z4) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 21:
                    el = el;
                    el.A0B();
                    c2 = 22;
                    break;
                case 22:
                    acA0G = acA0G;
                    j = acA0G.A02.A01;
                    i4 = 4;
                    i = 3;
                    i3 = 2;
                    if (!z2) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    if (j == -9223372036854775807L) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    el2 = el2;
                    if (j > el2.A05.A0A) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    acA0G = acA0G;
                    boolean rendererReadyOrEnded2 = acA0G.A02.A05;
                    if (!rendererReadyOrEnded2) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    el = el;
                    el2 = el2;
                    el2.A0N(i4);
                    el.A0H();
                    c2 = 27;
                    break;
                case 27:
                    el2 = el2;
                    if (el2.A05.A00 != i3) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    el2 = el2;
                    ycArr = el2.A0C;
                    length = ycArr.length;
                    i2 = 0;
                    c2 = 29;
                    break;
                case 29:
                    if (i2 >= length) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    ycArr = ycArr;
                    ycArr[i2].A8Y();
                    i2++;
                    c2 = 29;
                    break;
                case 31:
                    el2 = el2;
                    if (el2.A05.A00 != i3) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    el2 = el2;
                    if (!el2.A0u(z4)) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    el2 = el2;
                    el2.A0N(i);
                    if (!el2.A08) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    el = el;
                    el.A0G();
                    c2 = 27;
                    break;
                case '#':
                    el2 = el2;
                    if (el2.A05.A00 != i) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    el2 = el2;
                    if (el2.A0C.length != 0) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    el = el;
                    boolean rendererReadyOrEnded3 = el.A0q();
                    if (!rendererReadyOrEnded3) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case '&':
                    if (!z4) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case '\'':
                    el = el;
                    el2 = el2;
                    boolean rendererReadyOrEnded4 = el2.A08;
                    el2.A09 = rendererReadyOrEnded4;
                    el2.A0N(i3);
                    el.A0H();
                    c2 = 27;
                    break;
                case '(':
                    el2 = el2;
                    boolean rendererReadyOrEnded5 = el2.A08;
                    if (!rendererReadyOrEnded5) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = ')';
                        break;
                    }
                case ')':
                    el2 = el2;
                    if (el2.A05.A00 == i) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    el2 = el2;
                    if (el2.A05.A00 != i3) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '+':
                    el2 = el2;
                    el2.A0R(jADk, 10L);
                    c2 = ',';
                    break;
                case ',':
                    C0557Iv.A00();
                    return;
                case '-':
                    el2 = el2;
                    if (el2.A0C.length == 0) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '.';
                        break;
                    }
                case '.':
                    el2 = el2;
                    if (el2.A05.A00 == i4) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    el2 = el2;
                    el2.A0R(jADk, 1000L);
                    c2 = ',';
                    break;
                case '0':
                    el2 = el2;
                    el2.A0Q.ACT(i3);
                    c2 = ',';
                    break;
            }
        }
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        EL el = this;
        AC acA0F = el.A0K.A0F();
        long jA06 = acA0F.A06();
        char c2 = jA06 == Long.MIN_VALUE ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    el.A0k(false);
                    return;
                case 3:
                    el = el;
                    acA0F = acA0F;
                    long nextLoadPositionUs = el.A03;
                    boolean continueLoading = el.A0J.ADE(jA06 - acA0F.A08(nextLoadPositionUs), el.A0G.A6m().A01);
                    el.A0k(continueLoading);
                    if (!continueLoading) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el = el;
                    acA0F = acA0F;
                    acA0F.A0F(el.A03);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A0A() {
        EL el = this;
        int i = 0;
        int i2 = 0;
        Handler handler = null;
        char c2 = el.A0I.A06(el.A05) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    handler = el.A0E;
                    i = el.A0I.A01;
                    if (!el.A0I.A03) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    i2 = el.A0I.A00;
                    c2 = 4;
                    break;
                case 4:
                    el = el;
                    handler = handler;
                    handler.obtainMessage(0, i, i2, el.A05).sendToTarget();
                    el.A0I.A05(el.A05);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    i2 = -1;
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0B() throws IOException {
        EL el = this;
        int length = 0;
        YC[] ycArr = null;
        int i = 0;
        AC acA0F = el.A0K.A0F();
        AC acA0H = el.A0K.A0H();
        char c2 = acA0F != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    acA0F = acA0F;
                    if (!acA0F.A06) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 3:
                    acA0H = acA0H;
                    if (acA0H == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    acA0F = acA0F;
                    acA0H = acA0H;
                    if (acA0H.A01 != acA0F) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el = el;
                    ycArr = el.A0C;
                    length = ycArr.length;
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ycArr = ycArr;
                    YC renderer = ycArr[i];
                    if (!renderer.A7N()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return;
                case '\t':
                    i++;
                    c2 = 6;
                    break;
                case '\n':
                    acA0F = acA0F;
                    acA0F.A08.A8W();
                    c2 = 11;
                    break;
                case 11:
                    return;
            }
        }
    }

    private void A0C() throws IOException {
        EL el = this;
        AD adA0I = null;
        el.A0K.A0M(el.A03);
        char c2 = el.A0K.A0Q() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    adA0I = el.A0K.A0I(el.A03, el.A05);
                    if (adA0I != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    el.A07.A8X();
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    el = el;
                    adA0I = adA0I;
                    el.A0K.A0K(el.A0U, el.A0N, el.A0J.A5M(), el.A07, el.A05.A03.A0A(adA0I.A04.A02, el.A0L, true).A03, adA0I).ABo(el, adA0I.A03);
                    el.A0k(true);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.AAo();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws C03479w {
        EL el = this;
        char playbackSpeed = 0;
        long jA0B = 0;
        AC acA0G = null;
        char c2 = 0;
        float f = 0.0f;
        FV fv = null;
        int enabledRendererCount = 0;
        int i = 0;
        YC[] ycArr = null;
        boolean[] zArr = null;
        boolean selectionsChangedForReadPeriod = false;
        boolean[] zArr2 = null;
        int i2 = 0;
        AC acA0G2 = null;
        YC yc = null;
        AC readingPeriodHolder = null;
        EL el2 = el;
        char c3 = !el2.A0K.A0P() ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    return;
                case 3:
                    el2 = el2;
                    f = el2.A0G.A6m().A01;
                    acA0G = el2.A0K.A0G();
                    readingPeriodHolder = el2.A0K.A0H();
                    c2 = 1;
                    c3 = 4;
                    break;
                case 4:
                    acA0G = acA0G;
                    if (acA0G == null) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    acA0G = acA0G;
                    if (!acA0G.A06) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    acA0G = acA0G;
                    if (!acA0G.A0I(f)) {
                        c3 = 25;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    i = 4;
                    if (c2 == 0) {
                        c3 = 29;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    el2 = el2;
                    acA0G2 = el2.A0K.A0G();
                    boolean zA0S = el2.A0K.A0S(acA0G2);
                    zArr2 = new boolean[el2.A0T.length];
                    jA0B = acA0G2.A0B(el2.A05.A0A, zA0S, zArr2);
                    el2.A0i(acA0G2.A03, acA0G2.A04);
                    if (el2.A05.A00 == i) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    el2 = el2;
                    if (jA0B == el2.A05.A0A) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    el2 = el2;
                    AG ag = el2.A05;
                    el2.A05 = ag.A04(ag.A04, jA0B, el2.A05.A01);
                    el2.A0I.A04(i);
                    el2.A0P(jA0B);
                    c3 = '\f';
                    break;
                case '\f':
                    el2 = el2;
                    i2 = 0;
                    zArr = new boolean[el2.A0T.length];
                    enabledRendererCount = 0;
                    c3 = '\r';
                    break;
                case '\r':
                    el2 = el2;
                    ycArr = el2.A0T;
                    if (enabledRendererCount >= ycArr.length) {
                        c3 = 31;
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    ycArr = ycArr;
                    yc = ycArr[enabledRendererCount];
                    if (yc.A73() == 0) {
                        c3 = 24;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    selectionsChangedForReadPeriod = true;
                    c3 = 16;
                    break;
                case 16:
                    acA0G2 = acA0G2;
                    zArr = zArr;
                    zArr[enabledRendererCount] = selectionsChangedForReadPeriod;
                    fv = acA0G2.A0A[enabledRendererCount];
                    if (fv == null) {
                        c3 = 18;
                        break;
                    } else {
                        c3 = 17;
                        break;
                    }
                case 17:
                    i2++;
                    c3 = 18;
                    break;
                case 18:
                    zArr = zArr;
                    if (!zArr[enabledRendererCount]) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 19;
                        break;
                    }
                case 19:
                    yc = yc;
                    fv = fv;
                    if (fv == yc.A78()) {
                        c3 = 22;
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 20:
                    el2 = el2;
                    yc = yc;
                    el2.A0b(yc);
                    c3 = 21;
                    break;
                case 21:
                    enabledRendererCount++;
                    c3 = '\r';
                    break;
                case 22:
                    zArr2 = zArr2;
                    if (!zArr2[enabledRendererCount]) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 23;
                        break;
                    }
                case 23:
                    el2 = el2;
                    yc = yc;
                    long periodPositionUs = el2.A03;
                    yc.ACh(periodPositionUs);
                    c3 = 21;
                    break;
                case 24:
                    selectionsChangedForReadPeriod = false;
                    c3 = 16;
                    break;
                case 25:
                    acA0G = acA0G;
                    readingPeriodHolder = readingPeriodHolder;
                    playbackSpeed = c2;
                    if (acA0G != readingPeriodHolder) {
                        c3 = 28;
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    c2 = 0;
                    c3 = 27;
                    break;
                case 27:
                    acA0G = acA0G.A01;
                    c3 = 4;
                    break;
                case 28:
                    c2 = playbackSpeed;
                    c3 = 27;
                    break;
                case 29:
                    el2 = el2;
                    acA0G = acA0G;
                    el2.A0K.A0S(acA0G);
                    if (!acA0G.A06) {
                        c3 = ' ';
                        break;
                    } else {
                        c3 = 30;
                        break;
                    }
                case 30:
                    el2 = el2;
                    acA0G = acA0G;
                    long j = acA0G.A02.A03;
                    long periodPositionUs2 = el2.A03;
                    acA0G.A0A(Math.max(j, acA0G.A08(periodPositionUs2)), false);
                    el2.A0i(acA0G.A03, acA0G.A04);
                    c3 = ' ';
                    break;
                case 31:
                    el2 = el2;
                    acA0G2 = acA0G2;
                    zArr = zArr;
                    el2.A05 = el2.A05.A05(acA0G2.A03, acA0G2.A04);
                    el2.A0p(zArr, i2);
                    c3 = ' ';
                    break;
                case ' ':
                    el2 = el2;
                    if (el2.A05.A00 == 4) {
                        c3 = '\"';
                        break;
                    } else {
                        c3 = '!';
                        break;
                    }
                case '!':
                    el = el;
                    el2 = el2;
                    el.A09();
                    el.A0J();
                    el2.A0Q.ACv(2);
                    c3 = '\"';
                    break;
                case '\"':
                    return;
            }
        }
    }

    private void A0F() {
        EL el = this;
        int size = el.A0R.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    if (!el.A0r(el.A0R.get(size))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    el = el;
                    el.A0R.get(size).A03.A0A(false);
                    el.A0R.remove(size);
                    c2 = 5;
                    break;
                case 5:
                    size--;
                    c2 = 2;
                    break;
                case 6:
                    Collections.sort(el.A0R);
                    return;
            }
        }
    }

    private void A0G() throws C03479w {
        int i = 0;
        this.A09 = false;
        this.A0G.A05();
        YC[] ycArr = this.A0C;
        int length = ycArr.length;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ycArr = ycArr;
                    YC renderer = ycArr[i];
                    renderer.start();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0H() throws C03479w {
        EL el = this;
        el.A0G.A06();
        YC[] ycArr = el.A0C;
        int length = ycArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    ycArr = ycArr;
                    YC renderer = ycArr[i];
                    el.A0c(renderer);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0I() throws IOException, C03479w {
        EL el = this;
        boolean z = false;
        HU hu = null;
        boolean z2 = false;
        YC[] ycArr = null;
        HU hu2 = null;
        int i = 0;
        YC yc = null;
        AV av = null;
        AC acA0G = null;
        FV fv = null;
        YC yc2 = null;
        AV av2 = null;
        AC acA0H = null;
        int i2 = 0;
        boolean z3 = false;
        AC acA0D = null;
        int i3 = 0;
        boolean zA00 = false;
        YC[] ycArr2 = null;
        HQ hqA00 = null;
        AC acA0F = null;
        int i4 = 0;
        YC yc3 = null;
        YC[] ycArr3 = null;
        FV fv2 = null;
        EL el2 = el;
        FA fa = el2.A07;
        char c2 = fa == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    el2 = el2;
                    if (el2.A01 <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fa.A8X();
                    return;
                case 5:
                    el = el;
                    el2 = el2;
                    el.A0C();
                    acA0F = el2.A0K.A0F();
                    if (acA0F == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    acA0F = acA0F;
                    if (!acA0F.A0H()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    el2 = el2;
                    el2.A0k(false);
                    c2 = '\b';
                    break;
                case '\b':
                    el2 = el2;
                    if (!el2.A0K.A0P()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\t':
                    return;
                case '\n':
                    el2 = el2;
                    if (!el2.A05.A08) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 11:
                    el = el;
                    el.A09();
                    c2 = '\b';
                    break;
                case '\f':
                    el2 = el2;
                    acA0G = el2.A0K.A0G();
                    acA0H = el2.A0K.A0H();
                    z3 = false;
                    c2 = '\r';
                    break;
                case '\r':
                    el2 = el2;
                    if (!el2.A08) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    acA0G = acA0G;
                    acA0H = acA0H;
                    if (acA0G == acA0H) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    el2 = el2;
                    acA0G = acA0G;
                    if (el2.A03 < acA0G.A01.A00) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (!z3) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    el = el;
                    el.A0A();
                    c2 = 18;
                    break;
                case 18:
                    acA0G = acA0G;
                    if (!acA0G.A02.A06) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    i3 = 0;
                    c2 = 20;
                    break;
                case 20:
                    el = el;
                    el2 = el2;
                    AC ac = acA0G;
                    acA0G = el2.A0K.A0C();
                    el2.A0V(ac);
                    el2.A05 = el2.A05.A04(acA0G.A02.A04, acA0G.A02.A03, acA0G.A02.A00);
                    el2.A0I.A04(i3);
                    el.A0J();
                    z3 = true;
                    c2 = '\r';
                    break;
                case 21:
                    i3 = 3;
                    c2 = 20;
                    break;
                case 22:
                    acA0H = acA0H;
                    if (!acA0H.A02.A05) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    i4 = 0;
                    c2 = 24;
                    break;
                case 24:
                    el2 = el2;
                    ycArr2 = el2.A0T;
                    if (i4 >= ycArr2.length) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    acA0H = acA0H;
                    ycArr2 = ycArr2;
                    yc3 = ycArr2[i4];
                    fv = acA0H.A0A[i4];
                    if (fv == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    yc3 = yc3;
                    fv = fv;
                    if (yc3.A78() != fv) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    yc3 = yc3;
                    if (!yc3.A7N()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    yc3 = yc3;
                    yc3.AD1();
                    c2 = 29;
                    break;
                case 29:
                    i4++;
                    c2 = 24;
                    break;
                case 30:
                    return;
                case 31:
                    acA0H = acA0H;
                    if (acA0H.A01 == null) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    acA0H = acA0H;
                    if (!acA0H.A01.A06) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '!':
                    return;
                case '\"':
                    i2 = 0;
                    c2 = '#';
                    break;
                case '#':
                    el2 = el2;
                    ycArr3 = el2.A0T;
                    if (i2 >= ycArr3.length) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    acA0H = acA0H;
                    ycArr3 = ycArr3;
                    yc = ycArr3[i2];
                    fv2 = acA0H.A0A[i2];
                    if (yc.A78() != fv2) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    fv2 = fv2;
                    if (fv2 == null) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    yc = yc;
                    if (!yc.A7N()) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '\'':
                    return;
                case '(':
                    i2++;
                    c2 = '#';
                    break;
                case ')':
                    el2 = el2;
                    acA0H = acA0H;
                    hu2 = acA0H.A04;
                    acA0D = el2.A0K.A0D();
                    hu = acA0D.A04;
                    if (acA0D.A08.AC7() == -9223372036854775807L) {
                        c2 = ':';
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    z2 = true;
                    c2 = '+';
                    break;
                case '+':
                    i = 0;
                    c2 = ',';
                    break;
                case ',':
                    el2 = el2;
                    ycArr = el2.A0T;
                    if (i >= ycArr.length) {
                        c2 = ';';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    hu2 = hu2;
                    ycArr = ycArr;
                    yc2 = ycArr[i];
                    if (!hu2.A00(i)) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '.':
                    el = el;
                    i++;
                    el2 = el;
                    c2 = ',';
                    break;
                case '/':
                    if (!z2) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '0';
                        break;
                    }
                case '0':
                    yc2 = yc2;
                    yc2.AD1();
                    c2 = '.';
                    break;
                case '1':
                    yc2 = yc2;
                    if (!yc2.A7Z()) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '.';
                        break;
                    }
                case '2':
                    el2 = el2;
                    hu = hu;
                    hqA00 = hu.A01.A00(i);
                    zA00 = hu.A00(i);
                    if (el2.A0U[i].A7D() != 5) {
                        c2 = '8';
                        break;
                    } else {
                        c2 = '3';
                        break;
                    }
                case '3':
                    z = true;
                    c2 = '4';
                    break;
                case '4':
                    hu2 = hu2;
                    hu = hu;
                    av = hu2.A03[i];
                    av2 = hu.A03[i];
                    if (!zA00) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '5':
                    av = av;
                    av2 = av2;
                    if (!av2.equals(av)) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '6';
                        break;
                    }
                case '6':
                    if (!z) {
                        c2 = '7';
                        break;
                    } else {
                        c2 = '9';
                        break;
                    }
                case '7':
                    acA0D = acA0D;
                    yc2 = yc2;
                    hqA00 = hqA00;
                    yc2.ACY(A0v(hqA00), acA0D.A0A[i], acA0D.A07());
                    c2 = '.';
                    break;
                case '8':
                    z = false;
                    c2 = '4';
                    break;
                case '9':
                    yc2 = yc2;
                    yc2.AD1();
                    c2 = '.';
                    break;
                case ':':
                    z2 = false;
                    c2 = '+';
                    break;
                case ';':
                    return;
            }
        }
    }

    private void A0J() throws C03479w {
        EL el = this;
        long jA0C = 0;
        AG ag = null;
        AC acA0G = null;
        long jAC7 = 0;
        char c2 = !el.A0K.A0P() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    el = el;
                    acA0G = el.A0K.A0G();
                    jAC7 = acA0G.A08.AC7();
                    if (jAC7 == -9223372036854775807L) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el = el;
                    el.A0P(jAC7);
                    if (jAC7 == el.A05.A0A) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el = el;
                    AG ag2 = el.A05;
                    el.A05 = ag2.A04(ag2.A04, jAC7, el.A05.A01);
                    el.A0I.A04(4);
                    c2 = 6;
                    break;
                case 6:
                    el = el;
                    ag = el.A05;
                    if (el.A0C.length != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    acA0G = acA0G;
                    jA0C = acA0G.A02.A01;
                    c2 = '\b';
                    break;
                case '\b':
                    ag.A09 = jA0C;
                    return;
                case '\t':
                    acA0G = acA0G;
                    jA0C = acA0G.A0C(true);
                    c2 = '\b';
                    break;
                case '\n':
                    el = el;
                    acA0G = acA0G;
                    el.A03 = el.A0G.A04();
                    long jA08 = acA0G.A08(el.A03);
                    el.A0Q(el.A05.A0A, jA08);
                    el.A05.A0A = jA08;
                    c2 = 6;
                    break;
            }
        }
    }

    private void A0L(float f) {
        HQ[] hqArrA01 = null;
        int i = 0;
        HQ hq = null;
        int length = 0;
        AC acA0E = this.A0K.A0E();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    acA0E = acA0E;
                    if (acA0E == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    acA0E = acA0E;
                    if (acA0E.A04 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    acA0E = acA0E;
                    hqArrA01 = acA0E.A04.A01.A01();
                    length = hqArrA01.length;
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= length) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hqArrA01 = hqArrA01;
                    hq = hqArrA01[i];
                    if (hq == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hq = hq;
                    hq.AAZ(f);
                    c2 = '\b';
                    break;
                case '\b':
                    i++;
                    c2 = 5;
                    break;
                case '\t':
                    acA0E = acA0E.A01;
                    c2 = 2;
                    break;
                case '\n':
                    return;
            }
        }
    }

    private void A0M(int i) throws C03479w {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    private void A0O(int i, boolean z, int i2) throws C03479w {
        boolean z2 = false;
        Format[] formatArrA0v = null;
        AV av = null;
        boolean z3 = false;
        boolean z4 = false;
        EL el = this;
        AC acA0G = el.A0K.A0G();
        YC yc = el.A0T[i];
        el.A0C[i2] = yc;
        char c2 = yc.A73() == 0 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    acA0G = acA0G;
                    av = acA0G.A04.A03[i];
                    formatArrA0v = A0v(acA0G.A04.A01.A00(i));
                    if (!el.A08) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    if (el.A05.A00 != 3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z3 = true;
                    c2 = 5;
                    break;
                case 5:
                    z4 = z3;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 6:
                    if (!z4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z2 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    el = el;
                    acA0G = acA0G;
                    yc = yc;
                    av = av;
                    formatArrA0v = formatArrA0v;
                    yc.A4t(av, formatArrA0v, acA0G.A0A[i], el.A03, z2, acA0G.A07());
                    el.A0G.A09(yc);
                    if (!z4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    yc = yc;
                    yc.start();
                    c2 = '\n';
                    break;
                case '\n':
                    return;
                case 11:
                    z2 = false;
                    c2 = '\b';
                    break;
                case '\f':
                    z3 = false;
                    c2 = 5;
                    break;
            }
        }
    }

    private void A0P(long j) throws C03479w {
        EL el = this;
        YC[] ycArr = null;
        int length = 0;
        int i = 0;
        long jA09 = 0;
        char c2 = !el.A0K.A0P() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    jA09 = j;
                    c2 = 3;
                    break;
                case 3:
                    el = el;
                    el.A03 = jA09;
                    el.A0G.A07(el.A03);
                    ycArr = el.A0C;
                    length = ycArr.length;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el = el;
                    ycArr = ycArr;
                    ycArr[i].ACh(el.A03);
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    el = el;
                    jA09 = el.A0K.A0G().A09(j);
                    c2 = 3;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A0Q(long j, long j2) throws C03479w {
        EL el = this;
        A3 a3 = null;
        A3 a32 = null;
        A3 a33 = null;
        A3 a34 = null;
        int i = 0;
        A3 a35 = null;
        A3 a36 = null;
        int i2 = 0;
        int i3 = 0;
        char c2 = !el.A0R.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    if (!el.A05.A04.A01()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    el = el;
                    if (el.A05.A02 != j) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    j--;
                    c2 = 6;
                    break;
                case 6:
                    el = el;
                    i2 = el.A05.A04.A02;
                    i = el.A00;
                    a33 = null;
                    if (i <= 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    el = el;
                    a36 = el.A0R.get(i - 1);
                    c2 = '\b';
                    break;
                case '\b':
                    if (a36 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (a36.A00 > i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (a36.A00 != i2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (a36.A01 <= j) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    el = el;
                    el.A00--;
                    i3 = el.A00;
                    if (i3 <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    el = el;
                    a34 = el.A0R.get(i3 - 1);
                    c2 = 14;
                    break;
                case 14:
                    a36 = a34;
                    c2 = '\b';
                    break;
                case 15:
                    a34 = a33;
                    c2 = 14;
                    break;
                case 16:
                    a33 = null;
                    a36 = null;
                    c2 = '\b';
                    break;
                case 17:
                    el = el;
                    if (el.A00 >= el.A0R.size()) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    el = el;
                    a32 = el.A0R.get(el.A00);
                    c2 = 19;
                    break;
                case 19:
                    if (a32 == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (a32.A02 == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (a32.A00 < i2) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (a32.A00 != i2) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    if (a32.A01 > j) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    el = el;
                    el.A00++;
                    if (el.A00 >= el.A0R.size()) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    el = el;
                    a35 = el.A0R.get(el.A00);
                    c2 = 26;
                    break;
                case 26:
                    a32 = a35;
                    c2 = 19;
                    break;
                case 27:
                    a35 = a33;
                    c2 = 26;
                    break;
                case 28:
                    a32 = a33;
                    c2 = 19;
                    break;
                case 29:
                    if (a32 == null) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    if (a32.A02 == null) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    if (a32.A00 != i2) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    if (a32.A01 <= j) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    if (a32.A01 > j2) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    el = el;
                    el.A0Z(a32.A03);
                    if (!a32.A03.A0B()) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '#':
                    if (!a32.A03.A0D()) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    el = el;
                    el.A0R.remove(el.A00);
                    c2 = '%';
                    break;
                case '%':
                    el = el;
                    if (el.A00 >= el.A0R.size()) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    el = el;
                    a3 = el.A0R.get(el.A00);
                    c2 = '\'';
                    break;
                case '\'':
                    a32 = a3;
                    c2 = 29;
                    break;
                case '(':
                    a3 = a33;
                    c2 = '\'';
                    break;
                case ')':
                    el = el;
                    el.A00++;
                    c2 = '%';
                    break;
                case '*':
                    return;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.ACT(2);
        this.A0Q.ACw(2, j + j2);
    }

    private void A0S(A2 a2) throws C03479w {
        A2 a22 = a2;
        EL el = this;
        long j = 0;
        F8 f8A0L = null;
        long jLongValue = 0;
        boolean z = false;
        long contentPositionUs = 0;
        Object obj = null;
        long j2 = 0;
        F8 f8 = null;
        A5 a5 = null;
        AG ag = null;
        long j3 = 0;
        AG ag2 = null;
        AG ag3 = null;
        long j4 = 0;
        int iA01 = 0;
        Pair<Integer, Long> pairA04 = null;
        F8 f8A0L2 = null;
        int i = 0;
        int i2 = 0;
        AbstractC0352Ab abstractC0352Ab = null;
        AC acA0E = null;
        long j5 = 0;
        AbstractC0352Ab abstractC0352Ab2 = null;
        int i3 = 0;
        long jLongValue2 = 0;
        F8 f8A0L3 = null;
        F8 f8A0L4 = null;
        Object obj2 = null;
        int iIntValue = 0;
        long jLongValue3 = 0;
        F8 f8A0L5 = null;
        long j6 = 0;
        int iA04 = 0;
        EL el2 = el;
        char c2 = a22.A01 != el2.A07 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    el = el;
                    el2 = el2;
                    a22 = a22;
                    abstractC0352Ab2 = el2.A05.A03;
                    abstractC0352Ab = a22.A00;
                    Object obj3 = a22.A02;
                    el2.A0K.A0N(abstractC0352Ab);
                    el2.A05 = el2.A05.A03(abstractC0352Ab, obj3);
                    el.A0F();
                    i2 = el2.A01;
                    z = true;
                    contentPositionUs = -9223372036854775807L;
                    if (i2 <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el2 = el2;
                    el2.A0I.A03(i2);
                    el2.A01 = 0;
                    a5 = el2.A04;
                    if (a5 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el2 = el2;
                    a5 = a5;
                    pairA04 = el2.A04(a5, z);
                    el2.A04 = null;
                    if (pairA04 != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    el = el;
                    el.A08();
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    el2 = el2;
                    pairA04 = pairA04;
                    int iIntValue2 = ((Integer) pairA04.first).intValue();
                    jLongValue3 = ((Long) pairA04.second).longValue();
                    f8A0L4 = el2.A0K.A0L(iIntValue2, jLongValue3);
                    ag3 = el2.A05;
                    if (!f8A0L4.A01()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    j2 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    el2 = el2;
                    f8A0L4 = f8A0L4;
                    ag3 = ag3;
                    el2.A05 = ag3.A04(f8A0L4, j2, jLongValue3);
                    c2 = 7;
                    break;
                case 11:
                    j2 = jLongValue3;
                    c2 = '\n';
                    break;
                case '\f':
                    el2 = el2;
                    if (el2.A05.A02 != contentPositionUs) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    abstractC0352Ab = abstractC0352Ab;
                    if (!abstractC0352Ab.A0E()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    el = el;
                    el.A08();
                    c2 = 7;
                    break;
                case 15:
                    el2 = el2;
                    abstractC0352Ab = abstractC0352Ab;
                    Pair<Integer, Long> pairA05 = el2.A05(abstractC0352Ab, abstractC0352Ab.A05(el2.A0B), contentPositionUs);
                    int periodIndex = ((Integer) pairA05.first).intValue();
                    jLongValue = ((Long) pairA05.second).longValue();
                    f8A0L = el2.A0K.A0L(periodIndex, jLongValue);
                    ag = el2.A05;
                    if (!f8A0L.A01()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    j5 = 0;
                    c2 = 17;
                    break;
                case 17:
                    el2 = el2;
                    f8A0L = f8A0L;
                    ag = ag;
                    el2.A05 = ag.A04(f8A0L, j5, jLongValue);
                    c2 = 7;
                    break;
                case 18:
                    j5 = jLongValue;
                    c2 = 17;
                    break;
                case 19:
                    el2 = el2;
                    abstractC0352Ab2 = abstractC0352Ab2;
                    i3 = el2.A05.A04.A02;
                    j4 = el2.A05.A01;
                    if (!abstractC0352Ab2.A0E()) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    abstractC0352Ab = abstractC0352Ab;
                    if (!abstractC0352Ab.A0E()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 21:
                    el2 = el2;
                    f8A0L3 = el2.A0K.A0L(i3, j4);
                    ag2 = el2.A05;
                    if (!f8A0L3.A01()) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    j3 = 0;
                    c2 = 23;
                    break;
                case 23:
                    el2 = el2;
                    f8A0L3 = f8A0L3;
                    ag2 = ag2;
                    el2.A05 = ag2.A04(f8A0L3, j3, j4);
                    c2 = 24;
                    break;
                case 24:
                    return;
                case 25:
                    j3 = j4;
                    c2 = 23;
                    break;
                case 26:
                    el2 = el2;
                    acA0E = el2.A0K.A0E();
                    if (acA0E != null) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    el2 = el2;
                    abstractC0352Ab2 = abstractC0352Ab2;
                    obj = abstractC0352Ab2.A0A(i3, el2.A0L, z).A03;
                    c2 = 28;
                    break;
                case 28:
                    abstractC0352Ab = abstractC0352Ab;
                    obj = obj;
                    iA04 = abstractC0352Ab.A04(obj);
                    i = -1;
                    if (iA04 != -1) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    el2 = el2;
                    abstractC0352Ab2 = abstractC0352Ab2;
                    abstractC0352Ab = abstractC0352Ab;
                    iA01 = el2.A01(i3, abstractC0352Ab2, abstractC0352Ab);
                    if (iA01 != i) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    el.A08();
                    return;
                case 31:
                    acA0E = acA0E;
                    obj = acA0E.A09;
                    c2 = 28;
                    break;
                case ' ':
                    el2 = el2;
                    abstractC0352Ab = abstractC0352Ab;
                    acA0E = acA0E;
                    Pair<Integer, Long> pairA052 = el2.A05(abstractC0352Ab, abstractC0352Ab.A09(iA01, el2.A0L).A00, contentPositionUs);
                    iIntValue = ((Integer) pairA052.first).intValue();
                    jLongValue2 = ((Long) pairA052.second).longValue();
                    f8A0L5 = el2.A0K.A0L(iIntValue, jLongValue2);
                    abstractC0352Ab.A0A(iIntValue, el2.A0L, z);
                    if (acA0E == null) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    el2 = el2;
                    acA0E = acA0E;
                    obj2 = el2.A0L.A03;
                    acA0E.A02 = acA0E.A02.A00(-1);
                    c2 = '\"';
                    break;
                case '\"':
                    acA0E = acA0E;
                    if (acA0E.A01 == null) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    obj2 = obj2;
                    acA0E = acA0E.A01;
                    if (!acA0E.A09.equals(obj2)) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    el2 = el2;
                    acA0E = acA0E;
                    acA0E.A02 = el2.A0K.A0J(acA0E.A02, iIntValue);
                    c2 = '\"';
                    break;
                case '%':
                    acA0E = acA0E;
                    acA0E.A02 = acA0E.A02.A00(-1);
                    c2 = '\"';
                    break;
                case '&':
                    f8A0L5 = f8A0L5;
                    if (!f8A0L5.A01()) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    j6 = 0;
                    c2 = '(';
                    break;
                case '(':
                    EL el3 = el2;
                    F8 f82 = f8A0L5;
                    el3.A05 = el3.A05.A04(f82, el3.A02(f82, j6), jLongValue2);
                    return;
                case ')':
                    j6 = jLongValue2;
                    c2 = '(';
                    break;
                case '*':
                    if (iA04 == i3) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '+':
                    el2 = el2;
                    el2.A05 = el2.A05.A01(iA04);
                    c2 = ',';
                    break;
                case ',':
                    el2 = el2;
                    f8 = el2.A05.A04;
                    if (!f8.A01()) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    el2 = el2;
                    f8 = f8;
                    f8A0L2 = el2.A0K.A0L(iA04, j4);
                    if (!f8A0L2.equals(f8)) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '2';
                        break;
                    }
                case '.':
                    f8A0L2 = f8A0L2;
                    if (!f8A0L2.A01()) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    j = 0;
                    c2 = '0';
                    break;
                case '0':
                    EL el4 = el2;
                    F8 f83 = f8A0L2;
                    el4.A05 = el4.A05.A04(f83, el4.A02(f83, j), j4);
                    return;
                case '1':
                    j = j4;
                    c2 = '0';
                    break;
                case '2':
                    el2 = el2;
                    f8 = f8;
                    if (!el2.A0K.A0U(f8, el2.A03)) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '3':
                    el2 = el2;
                    el2.A0j(false);
                    c2 = '4';
                    break;
                case '4':
                    return;
            }
        }
    }

    private void A0T(A5 a5) throws Throwable {
        A5 a52 = a5;
        EL el = this;
        long j = 0;
        Throwable th = null;
        boolean z = false;
        long jLongValue = 0;
        long jA02 = 0;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        F8 f8 = null;
        long jA01 = 0;
        long jLongValue2 = 0;
        int i2 = 0;
        AG ag = null;
        long jA5J = 0;
        AC acA0G = null;
        EL el2 = el;
        el2.A0I.A03(1);
        Pair<Integer, Long> pairA04 = el2.A04(a52, true);
        char c2 = pairA04 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    f8 = new F8(el.A00());
                    jLongValue2 = -9223372036854775807L;
                    jLongValue = -9223372036854775807L;
                    z = true;
                    c2 = 3;
                case 3:
                    i2 = 2;
                    c2 = '\n';
                case 4:
                    el2 = el2;
                    pairA04 = pairA04;
                    int iIntValue = ((Integer) pairA04.first).intValue();
                    jLongValue = ((Long) pairA04.second).longValue();
                    f8 = el2.A0K.A0L(iIntValue, jLongValue);
                    c2 = f8.A01() ? (char) 5 : (char) 6;
                case 5:
                    jLongValue2 = 0;
                    z = true;
                    c2 = 3;
                case 6:
                    a52 = a52;
                    pairA04 = pairA04;
                    jLongValue2 = ((Long) pairA04.second).longValue();
                    long periodPositionUs = a52.A01;
                    c2 = periodPositionUs == -9223372036854775807L ? (char) 7 : '\t';
                case 7:
                    z3 = true;
                    c2 = '\b';
                case '\b':
                    z = z3;
                    c2 = 3;
                case '\t':
                    z3 = false;
                    c2 = '\b';
                case '\n':
                    el2 = el2;
                    c2 = el2.A07 != null ? '\f' : '.';
                case '\f':
                    el2 = el2;
                    c2 = el2.A01 > 0 ? '.' : (char) 14;
                case 14:
                    c2 = jLongValue2 == -9223372036854775807L ? (char) 15 : (char) 18;
                case 15:
                    i = 4;
                    c2 = 16;
                case 16:
                    el2 = el2;
                    el2.A0N(i);
                    el2.A0o(false, true, false);
                    break;
                case 18:
                    jA5J = jLongValue2;
                    c2 = 19;
                case 19:
                    el2 = el2;
                    c2 = f8.equals(el2.A05.A04) ? (char) 23 : '+';
                case 23:
                    try {
                        el2 = el2;
                        acA0G = el2.A0K.A0G();
                        c2 = acA0G != null ? (char) 26 : (char) 31;
                    } catch (Throwable th2) {
                        th = th2;
                        c2 = '7';
                    }
                case 26:
                    c2 = jA5J != 0 ? (char) 27 : (char) 31;
                case 27:
                    try {
                        acA0G = acA0G;
                        jA5J = acA0G.A08.A5J(jA5J, el2.A06);
                        c2 = 31;
                    } catch (Throwable th3) {
                        th = th3;
                        c2 = '7';
                    }
                case 31:
                    jA01 = C03419q.A01(jA5J);
                    ag = el2.A05;
                    c2 = '\"';
                case '\"':
                    try {
                        ag = ag;
                        c2 = jA01 == C03419q.A01(ag.A0A) ? '%' : '+';
                    } catch (Throwable th4) {
                        th = th4;
                        c2 = '7';
                    }
                case '%':
                    el2 = el2;
                    j = el2.A05.A0A;
                    c2 = '(';
                case '(':
                    el2 = el2;
                    f8 = f8;
                    el2.A05 = el2.A05.A04(f8, j, jLongValue);
                    c2 = z ? ')' : '*';
                case ')':
                    el2 = el2;
                    el2.A0I.A04(i2);
                    c2 = '*';
                case '*':
                    return;
                case '+':
                    el2 = el2;
                    f8 = f8;
                    jA02 = el2.A02(f8, jA5J);
                    c2 = jLongValue2 != jA02 ? '/' : '-';
                case '-':
                    z2 = false;
                    c2 = '0';
                case '.':
                    el2 = el2;
                    a52 = a52;
                    el2.A04 = a52;
                    break;
                case '/':
                    z2 = true;
                    c2 = '0';
                case '0':
                    z |= z2;
                    jLongValue2 = jA02;
                    break;
                case '2':
                    el2 = el2;
                    el2.A0I.A04(i2);
                    c2 = '3';
                case '3':
                    return;
                case '7':
                    el2 = el2;
                    f8 = f8;
                    el2.A05 = el2.A05.A04(f8, jLongValue2, jLongValue);
                    c2 = z ? '8' : '9';
                case '8':
                    el2 = el2;
                    el2.A0I.A04(i2);
                    c2 = '9';
                case '9':
                    throw th;
            }
            el2.A05 = el2.A05.A04(f8, jLongValue2, jLongValue);
            c2 = z ? '2' : '3';
        }
    }

    private void A0V(@Nullable AC ac) throws C03479w {
        EL el = this;
        YC yc = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean[] zArr = null;
        YC[] ycArr = null;
        AC acA0G = el.A0K.A0G();
        char c2 = acA0G != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    acA0G = acA0G;
                    if (ac != acA0G) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    el = el;
                    i = 0;
                    zArr = new boolean[el.A0T.length];
                    i2 = 0;
                    c2 = 5;
                    break;
                case 5:
                    el = el;
                    ycArr = el.A0T;
                    if (i2 >= ycArr.length) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ycArr = ycArr;
                    yc = ycArr[i2];
                    if (yc.A73() == 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    acA0G = acA0G;
                    zArr = zArr;
                    zArr[i2] = z;
                    if (!acA0G.A04.A00(i2)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i++;
                    c2 = '\n';
                    break;
                case '\n':
                    zArr = zArr;
                    if (!zArr[i2]) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    acA0G = acA0G;
                    if (!acA0G.A04.A00(i2)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    yc = yc;
                    if (!yc.A7Z()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    ac = ac;
                    yc = yc;
                    if (yc.A78() != ac.A0A[i2]) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    el = el;
                    yc = yc;
                    el.A0b(yc);
                    c2 = 15;
                    break;
                case 15:
                    i2++;
                    c2 = 5;
                    break;
                case 16:
                    z = false;
                    c2 = '\b';
                    break;
                case 17:
                    EL el2 = el;
                    AC ac2 = acA0G;
                    el2.A05 = el2.A05.A05(ac2.A03, ac2.A04);
                    el2.A0p(zArr, i);
                    return;
            }
        }
    }

    private void A0W(AH ah) {
        this.A0G.AD9(ah);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(AS as) throws C03479w {
        boolean z = false;
        char c2 = as.A0D() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        as = as;
                        as.A04().A7K(as.A00(), as.A09());
                        return;
                    } finally {
                        as.A0A(z);
                    }
            }
        }
    }

    private void A0Y(AS as) throws C03479w {
        EL el = this;
        A3 a3 = null;
        char c2 = as.A02() == -9223372036854775807L ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    as = as;
                    el.A0Z(as);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    el = el;
                    if (el.A07 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el = el;
                    if (el.A01 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    el = el;
                    as = as;
                    el.A0R.add(new A3(as));
                    c2 = 3;
                    break;
                case 7:
                    el = el;
                    as = as;
                    a3 = new A3(as);
                    if (!el.A0r(a3)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    el = el;
                    a3 = a3;
                    el.A0R.add(a3);
                    Collections.sort(el.A0R);
                    c2 = 3;
                    break;
                case '\t':
                    as = as;
                    as.A0A(false);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0Z(AS as) throws C03479w {
        EL el = this;
        int i = 0;
        char c2 = as.A03().getLooper() == el.A0Q.A6V() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    as = as;
                    el.A0X(as);
                    i = 2;
                    if (el.A05.A00 == 3) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    if (el.A05.A00 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el = el;
                    el.A0Q.ACv(i);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    el = el;
                    as = as;
                    el.A0Q.A8f(15, as).sendToTarget();
                    c2 = 5;
                    break;
            }
        }
    }

    private void A0a(AS as) {
        as.A03().post(new A1(this, as));
    }

    private void A0b(YC yc) throws C03479w {
        this.A0G.A08(yc);
        A0c(yc);
        yc.A4k();
    }

    private void A0c(YC yc) throws C03479w {
        if (yc.A73() == 2) {
            yc.stop();
        }
    }

    private void A0d(AX ax) {
        this.A06 = ax;
    }

    private void A0e(InterfaceC1019aR interfaceC1019aR) {
        if (!this.A0K.A0T(interfaceC1019aR)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(InterfaceC1019aR interfaceC1019aR) throws C03479w {
        EL el = this;
        char c2 = !el.A0K.A0T(interfaceC1019aR) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    el = el;
                    AC acA0F = el.A0K.A0F();
                    acA0F.A0E(el.A0G.A6m().A01);
                    el.A0i(acA0F.A03, acA0F.A04);
                    if (!el.A0K.A0P()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    el = el;
                    el.A0P(el.A0K.A0C().A02.A03);
                    el.A0V(null);
                    c2 = 5;
                    break;
                case 5:
                    el.A09();
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.FW
    /* renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void A9G(InterfaceC1019aR interfaceC1019aR) {
        this.A0Q.A8f(10, interfaceC1019aR).sendToTarget();
    }

    private void A0h(FA fa, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = fa;
        A0N(2);
        fa.ABr(this.A0H, true, this);
        this.A0Q.ACv(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, HU hu) {
        this.A0J.ABD(this.A0T, trackGroupArray, hu.A01);
    }

    private void A0j(boolean z) throws C03479w {
        EL el = this;
        F8 f8 = el.A0K.A0G().A02.A04;
        long jA03 = el.A03(f8, el.A05.A0A, true);
        char c2 = jA03 != el.A05.A0A ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    f8 = f8;
                    AG ag = el.A05;
                    el.A05 = ag.A04(f8, jA03, ag.A01);
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    el.A0I.A04(4);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C03479w {
        EL el = this;
        int i = 0;
        el.A09 = false;
        el.A08 = z;
        char c2 = !z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    el.A0H();
                    el.A0J();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    el = el;
                    i = 2;
                    if (el.A05.A00 != 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    el = el;
                    el.A0G();
                    el.A0Q.ACv(i);
                    c2 = 3;
                    break;
                case 6:
                    el = el;
                    if (el.A05.A00 != i) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    el = el;
                    el.A0Q.ACv(i);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0m(boolean z) throws C03479w {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.AB7();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        F8 f8;
        HU hu;
        FA fa;
        this.A0Q.ACT(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (YC renderer : this.A0C) {
            try {
                A0b(renderer);
            } catch (C03479w | RuntimeException e) {
                Log.e(A06(70, 21, 63), A06(91, 12, 42), e);
            }
        }
        this.A0C = new YC[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AbstractC0352Ab.A00);
            Iterator<A3> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC0352Ab abstractC0352Ab = z3 ? AbstractC0352Ab.A00 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        if (!z2) {
            f8 = this.A05.A04;
        } else {
            f8 = new F8(A00());
        }
        long j = z2 ? -9223372036854775807L : this.A05.A0A;
        long j2 = z2 ? -9223372036854775807L : this.A05.A01;
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A03 : this.A05.A05;
        if (z3) {
            hu = this.A0O;
        } else {
            hu = this.A05.A06;
        }
        this.A05 = new AG(abstractC0352Ab, obj, f8, j, j2, i, false, trackGroupArray, hu);
        if (z && (fa = this.A07) != null) {
            fa.ACQ(this);
            this.A07 = null;
        }
    }

    private void A0p(boolean[] zArr, int i) throws C03479w {
        EL el = this;
        el.A0C = new YC[i];
        int i2 = 0;
        AC acA0G = el.A0K.A0G();
        int i3 = 0;
        int enabledRendererCount = 2;
        while (true) {
            switch (enabledRendererCount) {
                case 2:
                    el = el;
                    if (i3 >= el.A0T.length) {
                        enabledRendererCount = 6;
                        break;
                    } else {
                        enabledRendererCount = 3;
                        break;
                    }
                case 3:
                    acA0G = acA0G;
                    if (!acA0G.A04.A00(i3)) {
                        enabledRendererCount = 5;
                        break;
                    } else {
                        enabledRendererCount = 4;
                        break;
                    }
                case 4:
                    el = el;
                    zArr = zArr;
                    int enabledRendererCount2 = i2 + 1;
                    el.A0O(i3, zArr[i3], i2);
                    i2 = enabledRendererCount2;
                    enabledRendererCount = 5;
                    break;
                case 5:
                    i3++;
                    enabledRendererCount = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    private boolean A0q() {
        EL el = this;
        boolean z = false;
        AC acA0G = el.A0K.A0G();
        long j = acA0G.A02.A01;
        char c2 = j != -9223372036854775807L ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    if (el.A05.A0A < j) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    acA0G = acA0G;
                    if (acA0G.A01 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    acA0G = acA0G;
                    if (!acA0G.A01.A06) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    acA0G = acA0G;
                    if (!acA0G.A01.A02.A04.A01()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    private boolean A0r(A3 a3) {
        EL el = this;
        int iA04 = 0;
        Pair<Integer, Long> pairA04 = null;
        boolean z = false;
        char c2 = a3.A02 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    el = el;
                    a3 = a3;
                    z = false;
                    pairA04 = el.A04(new A5(a3.A03.A08(), a3.A03.A01(), C03419q.A00(a3.A03.A02())), false);
                    if (pairA04 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    el = el;
                    a3 = a3;
                    iA04 = el.A05.A03.A04(a3.A02);
                    if (iA04 != -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    a3 = a3;
                    a3.A00 = iA04;
                    c2 = '\b';
                    break;
                case 7:
                    el = el;
                    a3 = a3;
                    pairA04 = pairA04;
                    a3.A01(((Integer) pairA04.first).intValue(), ((Long) pairA04.second).longValue(), el.A05.A03.A0A(((Integer) pairA04.first).intValue(), el.A0L, true).A03);
                    c2 = '\b';
                    break;
                case '\b':
                    return true;
            }
        }
    }

    private boolean A0s(YC yc) {
        boolean z = false;
        AC acA0H = this.A0K.A0H();
        char c2 = acA0H.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    acA0H = acA0H;
                    if (!acA0H.A01.A06) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yc = yc;
                    if (!yc.A7N()) {
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

    private boolean A0t(F8 f8, long j, AC ac) {
        EL el = this;
        int iA04 = 0;
        char c2 = f8.equals(ac.A02.A04) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    if (!ac.A06) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    el = el;
                    ac = ac;
                    el.A05.A03.A09(ac.A02.A04.A02, el.A0L);
                    iA04 = el.A0L.A04(j);
                    if (iA04 == -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    el = el;
                    ac = ac;
                    if (el.A0L.A09(iA04) != ac.A02.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    return false;
            }
        }
    }

    private boolean A0u(boolean z) {
        EL el = this;
        AC acA0F = null;
        boolean z2 = false;
        long jA0C = 0;
        boolean z3 = false;
        char c2 = el.A0C.length == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return el.A0q();
                case 3:
                    z2 = false;
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    el = el;
                    z3 = true;
                    if (!el.A05.A08) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    return z3;
                case 7:
                    el = el;
                    acA0F = el.A0K.A0F();
                    jA0C = acA0F.A0C(acA0F.A02.A05 ^ z3);
                    if (jA0C == Long.MIN_VALUE) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    el = el;
                    acA0F = acA0F;
                    if (!el.A0J.ADG(jA0C - acA0F.A08(el.A03), el.A0G.A6m().A01, el.A09)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z2 = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z2;
            }
        }
    }

    @NonNull
    public static Format[] A0v(HQ hq) {
        Format[] formatArr = null;
        int i = 0;
        int length = 0;
        char c2 = hq != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    hq = hq;
                    length = hq.length();
                    c2 = 3;
                    break;
                case 3:
                    formatArr = new Format[length];
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hq = hq;
                    formatArr = formatArr;
                    formatArr[i] = hq.A6K(i);
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    length = 0;
                    c2 = 3;
                    break;
                case 7:
                    return formatArr;
            }
        }
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.ACv(7);
        boolean z = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(AbstractC0352Ab abstractC0352Ab, int i, long j) {
        this.A0Q.A8f(3, new A5(abstractC0352Ab, i, j)).sendToTarget();
    }

    public final void A0z(FA fa, boolean z, boolean z2) {
        this.A0Q.A8e(0, z ? 1 : 0, z2 ? 1 : 0, fa).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.A8d(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A8d(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03449t
    public final void AAY(AH ah) {
        this.A0E.obtainMessage(1, ah).sendToTarget();
        A0L(ah.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1018aQ
    public final void AAg(InterfaceC1019aR interfaceC1019aR) {
        this.A0Q.A8f(9, interfaceC1019aR).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public final void AB2(FA fa, AbstractC0352Ab abstractC0352Ab, Object obj) {
        this.A0Q.A8f(8, new A2(fa, abstractC0352Ab, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    public final synchronized void ACx(AS as) {
        if (this.A0A) {
            Log.w(A06(70, 21, 63), A06(33, 37, 11));
            as.A0A(false);
        } else {
            this.A0Q.A8f(14, as).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        EL el = this;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        FA fa = null;
        boolean z5 = false;
        String strA06 = A06(70, 21, 63);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    message = message;
                    switch (message.what) {
                        case 0:
                            c2 = 5;
                            break;
                        case 1:
                            c2 = 16;
                            break;
                        case 2:
                            c2 = 21;
                            break;
                        case 3:
                            c2 = 22;
                            break;
                        case 4:
                            c2 = 25;
                            break;
                        case 5:
                            c2 = 28;
                            break;
                        case 6:
                            c2 = 31;
                            break;
                        case 7:
                            c2 = '$';
                            break;
                        case 8:
                            c2 = '&';
                            break;
                        case 9:
                            c2 = ')';
                            break;
                        case 10:
                            c2 = ',';
                            break;
                        case 11:
                            c2 = '/';
                            break;
                        case 12:
                            c2 = '0';
                            break;
                        case 13:
                            c2 = '2';
                            break;
                        case 14:
                            c2 = '7';
                            break;
                        case 15:
                            c2 = ':';
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 5:
                    message = message;
                    fa = (FA) message.obj;
                    c2 = message.arg1 != 0 ? '\t' : '\n';
                case '\t':
                    z4 = true;
                    c2 = 11;
                case '\n':
                    z4 = false;
                    c2 = 11;
                case 11:
                    message = message;
                    c2 = message.arg2 != 0 ? '\r' : (char) 14;
                case '\r':
                    z5 = true;
                    c2 = 15;
                case 14:
                    z5 = false;
                    c2 = 15;
                case 15:
                    el = el;
                    el.A0h(fa, z4, z5);
                    break;
                case 16:
                    message = message;
                    c2 = message.arg1 != 0 ? (char) 18 : (char) 19;
                case 18:
                    z3 = true;
                    c2 = 20;
                case 19:
                    z3 = false;
                    c2 = 20;
                case 20:
                    el = el;
                    el.A0l(z3);
                    break;
                case 21:
                    el = el;
                    el.A07();
                    break;
                case 22:
                    el.A0T((A5) message.obj);
                    break;
                case 25:
                    el.A0W((AH) message.obj);
                    break;
                case 28:
                    el.A0d((AX) message.obj);
                    break;
                case 31:
                    try {
                        message = message;
                        c2 = message.arg1 != 0 ? '!' : '\"';
                    } catch (C03479w e) {
                        Log.e(strA06, A06(145, 15, 51), e);
                        el.A0n(false, false);
                        el.A0E.obtainMessage(2, e).sendToTarget();
                        el.A0A();
                        break;
                    } catch (IOException e2) {
                        Log.e(strA06, A06(103, 13, 86), e2);
                        el.A0n(false, false);
                        el.A0E.obtainMessage(2, C03479w.A00(e2)).sendToTarget();
                        el.A0A();
                        break;
                    } catch (RuntimeException e3) {
                        Log.e(strA06, A06(10, 23, 125), e3);
                        el.A0n(false, false);
                        el.A0E.obtainMessage(2, C03479w.A02(e3)).sendToTarget();
                        el.A0A();
                        break;
                    }
                case '!':
                    z = true;
                    c2 = '#';
                case '\"':
                    z = false;
                    c2 = '#';
                case '#':
                    el = el;
                    el.A0n(z, true);
                    break;
                case '$':
                    el.A0D();
                    break;
                case '&':
                    el.A0S((A2) message.obj);
                    break;
                case ')':
                    el.A0f((InterfaceC1019aR) message.obj);
                    break;
                case ',':
                    el.A0e((InterfaceC1019aR) message.obj);
                    break;
                case '/':
                    el = el;
                    el.A0E();
                    break;
                case '0':
                    el.A0M(message.arg1);
                    break;
                case '2':
                    message = message;
                    c2 = message.arg1 != 0 ? '4' : '5';
                case '4':
                    z2 = true;
                    c2 = '6';
                case '5':
                    z2 = false;
                    c2 = '6';
                case '6':
                    el = el;
                    el.A0m(z2);
                    break;
                case '7':
                    el.A0Y((AS) message.obj);
                    break;
                case ':':
                    el.A0a((AS) message.obj);
                    break;
            }
            return true;
        }
        el.A0A();
        return true;
    }
}
