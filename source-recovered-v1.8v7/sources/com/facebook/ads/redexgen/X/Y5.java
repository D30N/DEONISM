package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y5 implements AB {
    public static byte[] A0A;
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C1080bQ A07;
    public final C0548Im A08;
    public final boolean A09;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0A = new byte[]{50, 38, 61, 7, 58, 43, 43, 42, 55, 18, 56, 58, 77, 62, 62, 61, 74, 30, 71, 74, 40, 68, 57, 81, 58, 57, 59, 67, 25, 62, 76, 61, 74, 42, 61, 58, 77, 62, 62, 61, 74, 37, 75, 33, 29, 34, -10, 41, 26, 26, 25, 38, 1, 39, -84, 56, 75, 60, 60, 59, 72, 28, 69, 72, 38, 66, 55, 79, 56, 55, 57, 65, 35, 73, -102, -35, -37, -24, -24, -23, -18, -102, -36, -33, -102, -26, -33, -19, -19, -102, -18, -30, -37, -24, -102};
    }

    public Y5() {
        this(new C1080bQ(true, 65536));
    }

    @Deprecated
    public Y5(C1080bQ c1080bQ) {
        this(c1080bQ, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public Y5(C1080bQ c1080bQ, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c1080bQ, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public Y5(C1080bQ c1080bQ, int i, int i2, int i3, int i4, int i5, boolean z, C0548Im c0548Im) {
        String strA01 = A01(54, 1, 19);
        String strA012 = A01(55, 19, 109);
        A03(i3, 0, strA012, strA01);
        String strA013 = A01(11, 32, 111);
        A03(i4, 0, strA013, strA01);
        String strA014 = A01(43, 11, 75);
        A03(i, i3, strA014, strA012);
        A03(i, i4, strA014, strA013);
        A03(i2, i, A01(0, 11, 92), strA014);
        this.A07 = c1080bQ;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = c0548Im;
    }

    private final int A00(YC[] ycArr, HR hr) {
        int iA01 = 0;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ycArr = ycArr;
                    if (i >= ycArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hr = hr;
                    if (hr.A00(i) == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ycArr = ycArr;
                    iA01 += C0560Iy.A01(ycArr[i].A7D());
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return iA01;
            }
        }
    }

    public static void A03(int i, int i2, String str, String str2) {
        boolean z = false;
        char c2 = i >= i2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A05(z, str + A01(74, 21, 17) + str2);
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A04(boolean z) {
        Y5 y5 = this;
        y5.A00 = 0;
        C0548Im c0548Im = y5.A08;
        char c2 = c0548Im != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    y5 = y5;
                    if (!y5.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0548Im = c0548Im;
                    c0548Im.A03(0);
                    c2 = 4;
                    break;
                case 4:
                    y5 = y5;
                    y5.A01 = false;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    y5 = y5;
                    y5.A07.A03();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final HW A5M() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final long A5R() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final void AAo() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final void AB7() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final void ABD(YC[] ycArr, TrackGroupArray trackGroupArray, HR hr) {
        int iA00 = this.A02;
        if (iA00 == -1) {
            iA00 = A00(ycArr, hr);
        }
        this.A00 = iA00;
        this.A07.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final boolean ACi() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final boolean ADE(long j, float f) {
        Y5 y5 = this;
        C0548Im c0548Im = null;
        boolean z = false;
        boolean z2 = false;
        long jMin = 0;
        boolean z3 = false;
        boolean z4 = true;
        int i = 0;
        char c2 = y5.A07.A02() >= y5.A00 ? (char) 2 : (char) 19;
        while (true) {
            switch (c2) {
                case 2:
                    z3 = true;
                    c2 = 3;
                    break;
                case 3:
                    y5 = y5;
                    z2 = y5.A01;
                    jMin = y5.A06;
                    if (f <= 1.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    y5 = y5;
                    long jA0C = C0560Iy.A0C(jMin, f);
                    long mediaDurationMinBufferUs = y5.A05;
                    jMin = Math.min(jA0C, mediaDurationMinBufferUs);
                    c2 = 5;
                    break;
                case 5:
                    if (j >= jMin) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    y5 = y5;
                    if (!y5.A09) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    if (!z3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case '\b':
                    y5 = y5;
                    y5.A01 = z4;
                    c2 = '\t';
                    break;
                case '\t':
                    y5 = y5;
                    c0548Im = y5.A08;
                    if (c0548Im == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    y5 = y5;
                    z = y5.A01;
                    if (z == z2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (!z) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0548Im = c0548Im;
                    c0548Im.A00(i);
                    c2 = '\r';
                    break;
                case '\r':
                    return y5.A01;
                case 14:
                    c0548Im = c0548Im;
                    c0548Im.A03(i);
                    c2 = '\r';
                    break;
                case 15:
                    z4 = false;
                    c2 = '\b';
                    break;
                case 16:
                    y5 = y5;
                    if (j > y5.A05) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (!z3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    y5 = y5;
                    i = 0;
                    y5.A01 = false;
                    c2 = '\t';
                    break;
                case 19:
                    z3 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final boolean ADG(long j, float f, boolean z) {
        Y5 y5 = this;
        boolean z2 = false;
        long j2 = 0;
        long jA0D = C0560Iy.A0D(j, f);
        char c2 = z ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    y5 = y5;
                    j2 = y5.A03;
                    c2 = 3;
                    break;
                case 3:
                    if (j2 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (jA0D >= j2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    y5 = y5;
                    if (!y5.A09) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 6:
                    y5 = y5;
                    if (y5.A07.A02() < y5.A00) {
                        c2 = '\t';
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
                    return z2;
                case '\t':
                    z2 = false;
                    c2 = '\b';
                    break;
                case '\n':
                    y5 = y5;
                    j2 = y5.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final void onPrepared() {
        A04(false);
    }
}
