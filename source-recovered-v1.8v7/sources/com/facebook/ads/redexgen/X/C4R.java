package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4R {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Interpolator A05;
    public boolean A06;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A07 = new byte[]{-90, -64, -62, -62, -57, -69, 115, -90, -74, -59, -62, -65, -65, 115, -76, -74, -57, -68, -62, -63, 115, -68, -58, 115, -75, -72, -68, -63, -70, 115, -56, -61, -73, -76, -57, -72, -73, 115, -57, -62, -62, 115, -71, -59, -72, -60, -56, -72, -63, -57, -65, -52, -127, 115, -96, -76, -66, -72, 115, -58, -56, -59, -72, 115, -52, -62, -56, 115, -76, -59, -72, 115, -63, -62, -57, 115, -74, -69, -76, -63, -70, -68, -63, -70, 115, -68, -57, 115, -56, -63, -65, -72, -58, -58, 115, -63, -72, -74, -72, -58, -58, -76, -59, -52, -94, -78, -63, -66, -69, -69, 111, -77, -60, -63, -80, -61, -72, -66, -67, 111, -68, -60, -62, -61, 111, -79, -76, 111, -80, 111, -65, -66, -62, -72, -61, -72, -59, -76, 111, -67, -60, -68, -79, -76, -63, 16, 35, 33, 55, 33, 42, 35, 48, 20, 39, 35, 53, -84, -55, -125, -36, -46, -40, -125, -45, -43, -46, -39, -52, -57, -56, -125, -60, -47, -125, -52, -47, -41, -56, -43, -45, -46, -49, -60, -41, -46, -43, -113, -125, -36, -46, -40, -125, -48, -40, -42, -41, -125, -42, -56, -41, -125, -60, -125, -45, -46, -42, -52, -41, -52, -39, -56, -125, -57, -40, -43, -60, -41, -52, -46, -47};
    }

    public C4R(int i, int i2) {
        this(i, i2, RecyclerView.UNDEFINED_DURATION, null);
    }

    public C4R(int i, int i2, int i3, Interpolator interpolator) {
        this.A04 = -1;
        this.A06 = false;
        this.A00 = 0;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
    }

    private void A01() {
        C4R c4r = this;
        char c2 = c4r.A05 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4r = c4r;
                    if (c4r.A01 < 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4r = c4r;
                    if (c4r.A01 < 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    throw new IllegalStateException(A00(104, 41, 7));
                case 6:
                    throw new IllegalStateException(A00(157, 64, 27));
            }
        }
    }

    public final void A03(int i) {
        this.A04 = i;
    }

    public final void A04(int i, int i2, int i3, Interpolator interpolator) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A06 = true;
    }

    public final void A05(C0452Eq c0452Eq) {
        C4R c4r = this;
        char c2 = c4r.A04 >= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C4R c4r2 = c4r;
                    int i = c4r2.A04;
                    c4r2.A04 = -1;
                    c0452Eq.A1Q(i);
                    c4r2.A06 = false;
                    return;
                case 3:
                    c4r = c4r;
                    if (!c4r.A06) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4r = c4r;
                    c4r.A01();
                    if (c4r.A05 != null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4r = c4r;
                    if (c4r.A01 != Integer.MIN_VALUE) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4r = c4r;
                    c0452Eq = c0452Eq;
                    c0452Eq.A08.A0A(c4r.A02, c4r.A03);
                    c2 = 7;
                    break;
                case 7:
                    c4r = c4r;
                    c4r.A00++;
                    if (c4r.A00 <= 10) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    Log.e(A00(145, 12, k.AppCompatTheme_windowFixedHeightMajor), A00(0, 104, 11));
                    c2 = '\t';
                    break;
                case '\t':
                    c4r = c4r;
                    c4r.A06 = false;
                    c2 = '\n';
                    break;
                case '\n':
                    return;
                case 11:
                    c4r = c4r;
                    c0452Eq = c0452Eq;
                    c0452Eq.A08.A0B(c4r.A02, c4r.A03, c4r.A01);
                    c2 = 7;
                    break;
                case '\f':
                    c4r = c4r;
                    c0452Eq = c0452Eq;
                    c0452Eq.A08.A0C(c4r.A02, c4r.A03, c4r.A01, c4r.A05);
                    c2 = 7;
                    break;
                case '\r':
                    c4r = c4r;
                    c4r.A00 = 0;
                    c2 = '\n';
                    break;
            }
        }
    }

    public final boolean A06() {
        boolean z = false;
        char c2 = this.A04 >= 0 ? (char) 2 : (char) 4;
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
}
