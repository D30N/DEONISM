package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class D1 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C0416Cy A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public D1(C0416Cy c0416Cy, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        IJ.A03(iArr.length == jArr2.length);
        IJ.A03(jArr.length == jArr2.length);
        IJ.A03(iArr2.length == jArr2.length);
        this.A03 = c0416Cy;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
    }

    public final int A00(long j) {
        D1 d1 = this;
        int iA0B = C0560Iy.A0B(d1.A07, j, true, false);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA0B < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    d1 = d1;
                    if ((d1.A04[iA0B] & 1) == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return iA0B;
                case 5:
                    iA0B--;
                    c2 = 2;
                    break;
                case 6:
                    return -1;
            }
        }
    }

    public final int A01(long j) {
        D1 d1 = this;
        int iA0A = C0560Iy.A0A(d1.A07, j, true, false);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    d1 = d1;
                    if (iA0A >= d1.A07.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    d1 = d1;
                    if ((d1.A04[iA0A] & 1) == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return iA0A;
                case 5:
                    iA0A++;
                    c2 = 2;
                    break;
                case 6:
                    return -1;
            }
        }
    }
}
