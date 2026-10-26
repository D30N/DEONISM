package com.facebook.ads.redexgen.X;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BQ {
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
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public BQ(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i / i3;
        this.A0K = i / 400;
        this.A0I = i / 65;
        this.A0J = this.A0I * 2;
        int i4 = this.A0J;
        this.A0L = new short[i4];
        this.A0A = new short[i4 * i2];
        this.A0B = new short[i4 * i2];
        this.A0C = new short[i4 * i2];
    }

    private int A00(int i) {
        int iMin = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i, iMin);
        this.A09 -= iMin;
        return iMin;
    }

    private int A01(short[] sArr, int retPeriod) {
        BQ bq = this;
        int minP = 0;
        int i = 0;
        int i2 = 0;
        int iA04 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = bq.A0H;
        char c2 = i5 > 4000 ? (char) 2 : (char) 18;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = i5 / 4000;
                    c2 = 3;
                    break;
                case 3:
                    bq = bq;
                    if (bq.A0G != 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i4 != 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bq = bq;
                    sArr = sArr;
                    iA04 = bq.A04(sArr, retPeriod, bq.A0K, bq.A0I);
                    c2 = 6;
                    break;
                case 6:
                    bq = bq;
                    if (!bq.A0F(bq.A02, bq.A01)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    bq = bq;
                    i2 = bq.A08;
                    c2 = '\b';
                    break;
                case '\b':
                    BQ bq2 = bq;
                    bq2.A07 = bq2.A02;
                    bq2.A08 = iA04;
                    return i2;
                case '\t':
                    i2 = iA04;
                    c2 = '\b';
                    break;
                case '\n':
                    bq = bq;
                    sArr = sArr;
                    bq.A0E(sArr, retPeriod, i4);
                    i3 = 0;
                    iA04 = bq.A04(bq.A0L, 0, bq.A0K / i4, bq.A0I / i4);
                    if (i4 == 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    bq = bq;
                    int i6 = iA04 * i4;
                    minP = i6 - (i4 * 4);
                    i = (i4 * 4) + i6;
                    if (minP >= bq.A0K) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    bq = bq;
                    minP = bq.A0K;
                    c2 = '\r';
                    break;
                case '\r':
                    bq = bq;
                    if (i <= bq.A0I) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    bq = bq;
                    i = bq.A0I;
                    c2 = 15;
                    break;
                case 15:
                    bq = bq;
                    if (bq.A0G != 1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    bq = bq;
                    sArr = sArr;
                    iA04 = bq.A04(sArr, retPeriod, minP, i);
                    c2 = 6;
                    break;
                case 17:
                    bq = bq;
                    sArr = sArr;
                    bq.A0E(sArr, retPeriod, 1);
                    iA04 = bq.A04(bq.A0L, i3, minP, i);
                    c2 = 6;
                    break;
                case 18:
                    i4 = 1;
                    c2 = 3;
                    break;
            }
        }
    }

    private int A02(short[] sArr, int i, float f, int i2) {
        BQ bq = this;
        int i3 = 0;
        char c2 = f < 0.5f ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = (int) ((i2 * f) / (1.0f - f));
                    c2 = 3;
                    break;
                case 3:
                    BQ bq2 = bq;
                    short[] sArr2 = sArr;
                    bq2.A0B = bq2.A0G(bq2.A0B, bq2.A05, i2 + i3);
                    int i4 = bq2.A0G;
                    System.arraycopy(sArr2, i * i4, bq2.A0B, bq2.A05 * i4, i4 * i2);
                    A0C(i3, bq2.A0G, bq2.A0B, bq2.A05 + i2, sArr2, i + i2, sArr2, i);
                    bq2.A05 += i2 + i3;
                    return i3;
                case 4:
                    bq = bq;
                    bq.A09 = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                    i3 = i2;
                    c2 = 3;
                    break;
            }
        }
    }

    private int A03(short[] sArr, int i, float f, int i2) {
        BQ bq = this;
        int i3 = 0;
        char c2 = f >= 2.0f ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = (int) (i2 / (f - 1.0f));
                    c2 = 3;
                    break;
                case 3:
                    BQ bq2 = bq;
                    short[] sArr2 = sArr;
                    bq2.A0B = bq2.A0G(bq2.A0B, bq2.A05, i3);
                    A0C(i3, bq2.A0G, bq2.A0B, bq2.A05, sArr2, i, sArr2, i + i2);
                    bq2.A05 += i3;
                    return i3;
                case 4:
                    bq = bq;
                    bq.A09 = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
                    i3 = i2;
                    c2 = 3;
                    break;
            }
        }
    }

    private int A04(short[] sArr, int minDiff, int maxDiff, int period) {
        int i = 0;
        int iAbs = 0;
        int i2 = 0;
        int i3 = 255;
        int i4 = 1;
        int i5 = 0;
        int minDiff2 = minDiff * this.A0G;
        int i6 = 2;
        while (true) {
            switch (i6) {
                case 2:
                    if (maxDiff > period) {
                        i6 = 11;
                        break;
                    } else {
                        i6 = 3;
                        break;
                    }
                case 3:
                    iAbs = 0;
                    i = 0;
                    i6 = 4;
                    break;
                case 4:
                    if (i >= maxDiff) {
                        i6 = 6;
                        break;
                    } else {
                        i6 = 5;
                        break;
                    }
                case 5:
                    sArr = sArr;
                    short s = sArr[minDiff2 + i];
                    short pVal = sArr[minDiff2 + maxDiff + i];
                    iAbs += Math.abs(s - pVal);
                    i++;
                    i6 = 4;
                    break;
                case 6:
                    if (iAbs * i2 >= i4 * maxDiff) {
                        i6 = 8;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case 7:
                    i4 = iAbs;
                    i2 = maxDiff;
                    i6 = 8;
                    break;
                case 8:
                    int diff = i5 * maxDiff;
                    if (iAbs * i3 <= diff) {
                        i6 = 10;
                        break;
                    } else {
                        i6 = 9;
                        break;
                    }
                case 9:
                    i5 = iAbs;
                    i3 = maxDiff;
                    i6 = 10;
                    break;
                case 10:
                    maxDiff++;
                    i6 = 2;
                    break;
                case 11:
                    BQ bq = this;
                    bq.A02 = i4 / i2;
                    bq.A01 = i5 / i3;
                    return i2;
            }
        }
    }

    private short A05(short[] sArr, int i, int i2, int leftPosition) {
        short s = sArr[i];
        short s2 = sArr[this.A0G + i];
        int i3 = this.A03 * i2;
        int i4 = this.A04;
        int i5 = i4 * leftPosition;
        int i6 = (i4 + 1) * leftPosition;
        int width = i6 - i3;
        int i7 = i6 - i5;
        return (short) (((width * s) + ((i7 - width) * s2)) / i7);
    }

    private void A06() {
        BQ bq = this;
        int i = bq.A05;
        float f = bq.A0F;
        float s = bq.A0D;
        float f2 = f / s;
        float f3 = bq.A0E * s;
        float r = ((double) f2) <= 1.00001d ? 2.8E-45f : 4.2E-45f;
        while (true) {
            switch (r) {
                case 2.8E-45f:
                    if (f2 >= 0.99999d) {
                        r = 9.8E-45f;
                        break;
                    } else {
                        r = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    bq = bq;
                    bq.A07(f2);
                    r = 5.6E-45f;
                    break;
                case 5.6E-45f:
                    if (f3 == 1.0f) {
                        r = 8.4E-45f;
                        break;
                    } else {
                        r = 7.0E-45f;
                        break;
                    }
                case 7.0E-45f:
                    bq = bq;
                    bq.A08(f3, i);
                    r = 8.4E-45f;
                    break;
                case 8.4E-45f:
                    return;
                case 9.8E-45f:
                    bq = bq;
                    bq.A0D(bq.A0A, 0, bq.A00);
                    bq.A00 = 0;
                    r = 5.6E-45f;
                    break;
            }
        }
    }

    private void A07(float f) {
        BQ bq = this;
        int period = 0;
        int i = 0;
        int iA03 = 0;
        char c2 = bq.A00 < bq.A0J ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    bq = bq;
                    i = bq.A00;
                    iA03 = 0;
                    c2 = 4;
                    break;
                case 4:
                    bq = bq;
                    if (bq.A09 <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bq = bq;
                    iA03 += bq.A00(iA03);
                    c2 = 6;
                    break;
                case 6:
                    bq = bq;
                    if (bq.A0J + iA03 <= i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    bq.A0B(iA03);
                    return;
                case '\b':
                    bq = bq;
                    period = bq.A01(bq.A0A, iA03);
                    if (f <= 1.0d) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    bq = bq;
                    iA03 += bq.A03(bq.A0A, iA03, f, period) + period;
                    c2 = 6;
                    break;
                case '\n':
                    bq = bq;
                    iA03 += bq.A02(bq.A0A, iA03, f, period);
                    c2 = 6;
                    break;
            }
        }
    }

    private void A08(float f, int i) {
        BQ bq = this;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c2 = bq.A05 == i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    bq = bq;
                    i10 = (int) (bq.A0H / f);
                    i8 = bq.A0H;
                    c2 = 4;
                    break;
                case 4:
                    i11 = 16384;
                    if (i10 > 16384) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i8 <= i11) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i10 /= 2;
                    i8 /= 2;
                    c2 = 4;
                    break;
                case 7:
                    bq = bq;
                    bq.A09(i);
                    i7 = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    bq = bq;
                    i2 = bq.A06;
                    z = true;
                    z = true;
                    if (i7 >= i2 - 1) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    bq = bq;
                    i4 = bq.A04;
                    int i12 = (i4 + 1) * i10;
                    i9 = bq.A03;
                    if (i12 <= i9 * i8) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    bq = bq;
                    bq.A0B = bq.A0G(bq.A0B, bq.A05, z ? 1 : 0);
                    i6 = 0;
                    c2 = 11;
                    break;
                case 11:
                    bq = bq;
                    i5 = bq.A0G;
                    if (i6 >= i5) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    bq = bq;
                    bq.A0B[(bq.A05 * i5) + i6] = bq.A05(bq.A0C, (i5 * i7) + i6, i8, i10);
                    i6++;
                    c2 = 11;
                    break;
                case '\r':
                    bq = bq;
                    bq.A03 += z ? 1 : 0;
                    bq.A05 += z ? 1 : 0;
                    c2 = '\t';
                    break;
                case 14:
                    bq = bq;
                    bq.A04 = i4 + 1;
                    if (bq.A04 != i8) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    bq = bq;
                    i3 = 0;
                    bq.A04 = 0;
                    if (i9 != i10) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    bq = bq;
                    IJ.A04(z);
                    bq.A03 = i3;
                    c2 = 17;
                    break;
                case 17:
                    i7++;
                    c2 = '\b';
                    break;
                case 18:
                    z = false;
                    c2 = 16;
                    break;
                case 19:
                    bq.A0A(i2 - (z ? 1 : 0));
                    return;
            }
        }
    }

    private void A09(int i) {
        int i2 = this.A05 - i;
        this.A0C = A0G(this.A0C, this.A06, i2);
        short[] sArr = this.A0B;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, this.A0C, this.A06 * i3, i3 * i2);
        this.A05 = i;
        this.A06 += i2;
    }

    private void A0A(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i2 = this.A0G;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.A06 - i) * i2);
        this.A06 -= i;
    }

    private void A0B(int i) {
        int i2 = this.A00 - i;
        short[] sArr = this.A0A;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.A00 = i2;
    }

    public static void A0C(int i, int o, short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i9 >= o) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i7 = (i2 * o) + i9;
                    i6 = (i4 * o) + i9;
                    i5 = (i3 * o) + i9;
                    i8 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i8 >= i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sArr = sArr;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    sArr[i7] = (short) (((sArr2[i5] * (i - i8)) + (sArr3[i6] * i8)) / i);
                    i7 += o;
                    i5 += o;
                    i6 += o;
                    i8++;
                    c2 = 4;
                    break;
                case 6:
                    i9++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A0D(short[] sArr, int i, int i2) {
        this.A0B = A0G(this.A0B, this.A05, i2);
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, this.A0B, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A0E(short[] sArr, int samplesPerValue, int i) {
        BQ bq = this;
        int j = 0;
        int i2 = 0;
        int i3 = bq.A0J / i;
        int i4 = bq.A0G;
        int i5 = i4 * i;
        int samplesPerValue2 = samplesPerValue * i4;
        int i6 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i6 >= i3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j = 0;
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= i5) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sArr = sArr;
                    j += sArr[(i6 * i5) + samplesPerValue2 + i2];
                    i2++;
                    c2 = 4;
                    break;
                case 6:
                    bq = bq;
                    bq.A0L[i6] = (short) (j / i5);
                    i6++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    private boolean A0F(int i, int i2) {
        BQ bq = this;
        char c2 = i != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    bq = bq;
                    if (bq.A08 != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    if (i2 <= i * 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    bq = bq;
                    if (i * 2 > bq.A07 * 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    return true;
            }
        }
    }

    private short[] A0G(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.A0G;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i3 * (((i4 * 3) / 2) + i2));
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        BQ bq = this;
        int i = 0;
        int i2 = 0;
        int i3 = bq.A00;
        float f = bq.A0F;
        float f2 = bq.A0D;
        float f3 = bq.A0E * f2;
        int i4 = bq.A05;
        float f4 = i3 / (f / f2);
        float r = bq.A06;
        int i5 = i4 + ((int) (((f4 + r) / f3) + 0.5f));
        short[] sArr = bq.A0A;
        int i6 = bq.A00;
        int expectedOutputFrames = bq.A0J;
        bq.A0A = bq.A0G(sArr, i6, (expectedOutputFrames * 2) + i3);
        int i7 = 0;
        int xSample = 2;
        while (true) {
            switch (xSample) {
                case 2:
                    bq = bq;
                    i = bq.A0J;
                    i2 = bq.A0G;
                    if (i7 >= i * 2 * i2) {
                        xSample = 4;
                        break;
                    } else {
                        xSample = 3;
                        break;
                    }
                case 3:
                    bq = bq;
                    bq.A0A[(i2 * i3) + i7] = 0;
                    i7++;
                    xSample = 2;
                    break;
                case 4:
                    bq = bq;
                    bq.A00 += i * 2;
                    bq.A06();
                    if (bq.A05 <= i5) {
                        xSample = 6;
                        break;
                    } else {
                        xSample = 5;
                        break;
                    }
                case 5:
                    bq = bq;
                    bq.A05 = i5;
                    xSample = 6;
                    break;
                case 6:
                    BQ bq2 = bq;
                    bq2.A00 = 0;
                    bq2.A09 = 0;
                    bq2.A06 = 0;
                    return;
            }
        }
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        shortBuffer.put(this.A0B, 0, this.A0G * iMin);
        this.A05 -= iMin;
        short[] sArr = this.A0B;
        int i = this.A0G;
        System.arraycopy(sArr, iMin * i, sArr, 0, this.A05 * i);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.A0G;
        int i2 = iRemaining / i;
        this.A0A = A0G(this.A0A, this.A00, i2);
        shortBuffer.get(this.A0A, this.A00 * this.A0G, ((i * i2) * 2) / 2);
        this.A00 += i2;
        A06();
    }
}
