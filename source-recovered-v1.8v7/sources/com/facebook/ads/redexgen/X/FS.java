package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class FS {
    public int A00;
    public int A01 = AdError.NETWORK_ERROR_CODE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Format A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public int[] A0D;
    public long[] A0E;
    public long[] A0F;
    public Format[] A0G;
    public CN[] A0H;

    public FS() {
        int i = this.A01;
        this.A0D = new int[i];
        this.A0E = new long[i];
        this.A0F = new long[i];
        this.A0B = new int[i];
        this.A0C = new int[i];
        this.A0H = new CN[i];
        this.A0G = new Format[i];
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A09 = true;
        this.A0A = true;
    }

    private int A00(int i) {
        int i2 = 0;
        int i3 = this.A04 + i;
        int i4 = this.A01;
        char c2 = i3 < i4 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i2 = i3;
                    c2 = 3;
                    break;
                case 3:
                    return i2;
                case 4:
                    i2 = i3 - i4;
                    c2 = 3;
                    break;
            }
        }
    }

    private int A01(int searchIndex, int i, long j, boolean z) {
        FS fs = this;
        int i2 = -1;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fs = fs;
                    if (fs.A0F[searchIndex] > j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fs = fs;
                    if ((fs.A0B[searchIndex] & 1) == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i2 = i3;
                    c2 = 7;
                    break;
                case 7:
                    fs = fs;
                    searchIndex++;
                    if (searchIndex != fs.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    searchIndex = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    i3++;
                    c2 = 2;
                    break;
                case '\n':
                    return i2;
            }
        }
    }

    private long A02(int i) {
        FS fs = this;
        int i2 = 0;
        fs.A06 = Math.max(fs.A06, fs.A03(i));
        fs.A02 -= i;
        fs.A00 += i;
        fs.A04 += i;
        int i3 = fs.A04;
        int i4 = fs.A01;
        char c2 = i3 >= i4 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    fs = fs;
                    fs.A04 = i3 - i4;
                    c2 = 3;
                    break;
                case 3:
                    fs = fs;
                    fs.A03 -= i;
                    if (fs.A03 >= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fs = fs;
                    fs.A03 = 0;
                    c2 = 5;
                    break;
                case 5:
                    fs = fs;
                    if (fs.A02 != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    fs = fs;
                    i2 = fs.A04;
                    if (i2 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    fs = fs;
                    i2 = fs.A01;
                    c2 = '\b';
                    break;
                case '\b':
                    return fs.A0E[i2 - 1] + r4.A0C[r1];
                case '\t':
                    FS fs2 = fs;
                    return fs2.A0E[fs2.A04];
            }
        }
    }

    private long A03(int i) {
        FS fs = this;
        long jMax = 0;
        int iA00 = 0;
        int i2 = 0;
        char c2 = i == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return Long.MIN_VALUE;
                case 3:
                    fs = fs;
                    jMax = Long.MIN_VALUE;
                    iA00 = fs.A00(i - 1);
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fs = fs;
                    jMax = Math.max(jMax, fs.A0F[iA00]);
                    if ((fs.A0B[iA00] & 1) == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return jMax;
                case 7:
                    iA00--;
                    if (iA00 != -1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    fs = fs;
                    iA00 = fs.A01 - 1;
                    c2 = '\t';
                    break;
                case '\t':
                    i2++;
                    c2 = 4;
                    break;
            }
        }
    }

    private final synchronized void A04(long j) {
        this.A07 = Math.max(this.A07, j);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i;
        i = this.A02 - this.A03;
        this.A03 = this.A02;
        return i;
    }

    public final synchronized int A08(long j, boolean z, boolean z2) {
        int iA00 = A00(this.A03);
        if (!A0I() || j < this.A0F[iA00] || (j > this.A07 && !z2)) {
            return -1;
        }
        int iA01 = A01(iA00, this.A02 - this.A03, j, z);
        if (iA01 == -1) {
            return -1;
        }
        this.A03 += iA01;
        return iA01;
    }

    public final synchronized int A09(A9 a9, YT yt, boolean z, boolean z2, Format format, FR fr) {
        if (!A0I()) {
            if (z2) {
                yt.A02(4);
                return -4;
            }
            if (this.A08 == null || (!z && this.A08 == format)) {
                return -3;
            }
            a9.A00 = this.A08;
            return -5;
        }
        int iA00 = A00(this.A03);
        if (z || this.A0G[iA00] != format) {
            a9.A00 = this.A0G[iA00];
            return -5;
        }
        if (yt.A0B()) {
            return -3;
        }
        yt.A00 = this.A0F[iA00];
        yt.A02(this.A0B[iA00]);
        fr.A00 = this.A0C[iA00];
        fr.A01 = this.A0E[iA00];
        fr.A02 = this.A0H[iA00];
        this.A03++;
        return -4;
    }

    public final synchronized long A0A() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A02(this.A02);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    public final long A0C(int i) {
        FS fs = this;
        int i2 = 0;
        boolean z = false;
        int iA06 = fs.A06() - i;
        char c2 = iA06 >= 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    fs = fs;
                    if (iA06 > fs.A02 - fs.A03) {
                        c2 = 6;
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
                    fs = fs;
                    IJ.A03(z);
                    fs.A02 -= iA06;
                    fs.A07 = Math.max(fs.A06, fs.A03(fs.A02));
                    i2 = fs.A02;
                    if (i2 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return 0L;
                case 6:
                    z = false;
                    c2 = 4;
                    break;
                case 7:
                    FS fs2 = fs;
                    return fs2.A0E[fs2.A00(i2 - 1)] + fs2.A0C[r1];
            }
        }
    }

    public final synchronized long A0D(long j, boolean z, boolean z2) {
        if (this.A02 != 0 && j >= this.A0F[this.A04]) {
            int iA01 = A01(this.A04, (!z2 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j, z);
            if (iA01 == -1) {
                return -1L;
            }
            return A02(iA01);
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final synchronized void A0G(long j, int i, long j2, int i2, CN cn) {
        if (this.A0A) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        IJ.A04(!this.A09);
        A04(j);
        int iA00 = A00(this.A02);
        this.A0F[iA00] = j;
        this.A0E[iA00] = j2;
        this.A0C[iA00] = i2;
        this.A0B[iA00] = i;
        this.A0H[iA00] = cn;
        this.A0G[iA00] = this.A08;
        this.A0D[iA00] = this.A05;
        this.A02++;
        if (this.A02 == this.A01) {
            int i3 = this.A01 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            CN[] cnArr = new CN[i3];
            Format[] formatArr = new Format[i3];
            int i4 = this.A01 - this.A04;
            long[] jArr3 = this.A0E;
            int beforeWrap = this.A04;
            System.arraycopy(jArr3, beforeWrap, jArr, 0, i4);
            long[] jArr4 = this.A0F;
            int beforeWrap2 = this.A04;
            System.arraycopy(jArr4, beforeWrap2, jArr2, 0, i4);
            int[] iArr4 = this.A0B;
            int beforeWrap3 = this.A04;
            System.arraycopy(iArr4, beforeWrap3, iArr2, 0, i4);
            int[] iArr5 = this.A0C;
            int beforeWrap4 = this.A04;
            System.arraycopy(iArr5, beforeWrap4, iArr3, 0, i4);
            CN[] cnArr2 = this.A0H;
            int beforeWrap5 = this.A04;
            System.arraycopy(cnArr2, beforeWrap5, cnArr, 0, i4);
            Format[] formatArr2 = this.A0G;
            int beforeWrap6 = this.A04;
            System.arraycopy(formatArr2, beforeWrap6, formatArr, 0, i4);
            int[] iArr6 = this.A0D;
            int beforeWrap7 = this.A04;
            System.arraycopy(iArr6, beforeWrap7, iArr, 0, i4);
            int i5 = this.A04;
            System.arraycopy(this.A0E, 0, jArr, i4, i5);
            System.arraycopy(this.A0F, 0, jArr2, i4, i5);
            System.arraycopy(this.A0B, 0, iArr2, i4, i5);
            System.arraycopy(this.A0C, 0, iArr3, i4, i5);
            System.arraycopy(this.A0H, 0, cnArr, i4, i5);
            System.arraycopy(this.A0G, 0, formatArr, i4, i5);
            System.arraycopy(this.A0D, 0, iArr, i4, i5);
            this.A0E = jArr;
            this.A0F = jArr2;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = cnArr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            int afterWrap = this.A01;
            this.A02 = afterWrap;
            this.A01 = i3;
        }
    }

    public final void A0H(boolean z) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0J(long j) {
        if (this.A02 == 0) {
            return j > this.A06;
        }
        if (Math.max(this.A06, A03(this.A03)) >= j) {
            return false;
        }
        int i = this.A02;
        int iA00 = A00(this.A02 - 1);
        while (i > this.A03 && this.A0F[iA00] >= j) {
            i--;
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i);
        return true;
    }

    public final synchronized boolean A0K(Format format) {
        if (format == null) {
            this.A09 = true;
            return false;
        }
        this.A09 = false;
        if (C0560Iy.A0j(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
