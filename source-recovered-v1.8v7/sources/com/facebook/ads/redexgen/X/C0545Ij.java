package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0545Ij {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C0545Ij(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        C0545Ij c0545Ij = this;
        int iA05 = 0;
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    i = (1 << i2) - 1;
                    if (i2 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0545Ij = c0545Ij;
                    iA05 = c0545Ij.A05(i2);
                    c2 = 6;
                    break;
                case 6:
                    return i + iA05;
                case 7:
                    iA05 = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    private void A01() {
        C0545Ij c0545Ij = this;
        boolean z = false;
        int i = 0;
        int i2 = c0545Ij.A02;
        char c2 = i2 >= 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0545Ij = c0545Ij;
                    i = c0545Ij.A01;
                    if (i2 < i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0545Ij = c0545Ij;
                    if (c0545Ij.A00 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    IJ.A04(z);
                    return;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    private boolean A02(int i) {
        C0545Ij c0545Ij = this;
        boolean z = false;
        byte[] bArr = null;
        char c2 = 2 <= i ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c0545Ij = c0545Ij;
                    if (i >= c0545Ij.A01) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0545Ij = c0545Ij;
                    bArr = c0545Ij.A03;
                    if (bArr[i] != 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    if (bArr[i - 2] != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bArr = bArr;
                    if (bArr[i - 1] != 0) {
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

    public final int A03() {
        int i = 0;
        int iA00 = A00();
        char c2 = iA00 % 2 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i * ((iA00 + 1) / 2);
                case 4:
                    i = 1;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        C0545Ij c0545Ij = this;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        c0545Ij.A00 += i;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0545Ij = c0545Ij;
                    i5 = c0545Ij.A00;
                    i6 = 2;
                    i3 = 8;
                    if (i5 <= 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0545Ij = c0545Ij;
                    c0545Ij.A00 = i5 - 8;
                    byte[] bArr = c0545Ij.A03;
                    i7 = c0545Ij.A02;
                    i8 |= (bArr[i7] & 255) << c0545Ij.A00;
                    if (!c0545Ij.A02(i7 + 1)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0545Ij = c0545Ij;
                    c0545Ij.A02 = i7 + i6;
                    c2 = 2;
                    break;
                case 5:
                    i6 = 1;
                    c2 = 4;
                    break;
                case 6:
                    c0545Ij = c0545Ij;
                    byte[] bArr2 = c0545Ij.A03;
                    i4 = c0545Ij.A02;
                    i2 = (i8 | ((bArr2[i4] & 255) >> (8 - i5))) & ((-1) >>> (32 - i));
                    if (i5 != i3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0545Ij = c0545Ij;
                    c0545Ij.A00 = 0;
                    if (!c0545Ij.A02(i4 + 1)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0545Ij = c0545Ij;
                    c0545Ij.A02 = i4 + i6;
                    c2 = '\t';
                    break;
                case '\t':
                    c0545Ij.A01();
                    return i2;
                case '\n':
                    i6 = 1;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final void A06() {
        C0545Ij c0545Ij = this;
        int i = 0;
        int i2 = 1;
        int i3 = c0545Ij.A00 + 1;
        c0545Ij.A00 = i3;
        char c2 = i3 == 8 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0545Ij = c0545Ij;
                    c0545Ij.A00 = 0;
                    i = c0545Ij.A02;
                    if (!c0545Ij.A02(i + 1)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 2;
                    c2 = 4;
                    break;
                case 4:
                    c0545Ij = c0545Ij;
                    c0545Ij.A02 = i + i2;
                    c2 = 5;
                    break;
                case 5:
                    c0545Ij.A01();
                    return;
            }
        }
    }

    public final void A07(int numBytes) {
        C0545Ij c0545Ij = this;
        int i = 0;
        int i2 = c0545Ij.A02;
        int i3 = numBytes / 8;
        c0545Ij.A02 += i3;
        c0545Ij.A00 += numBytes - (i3 * 8);
        int i4 = c0545Ij.A00;
        char c2 = i4 > 7 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0545Ij = c0545Ij;
                    c0545Ij.A02++;
                    c0545Ij.A00 = i4 - 8;
                    c2 = 3;
                    break;
                case 3:
                    i = i2 + 1;
                    c2 = 4;
                    break;
                case 4:
                    c0545Ij = c0545Ij;
                    if (i > c0545Ij.A02) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A02(i)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0545Ij = c0545Ij;
                    c0545Ij.A02++;
                    i += 2;
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    c0545Ij.A01();
                    return;
            }
        }
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        C0545Ij c0545Ij = this;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        int i2 = c0545Ij.A02;
        int i3 = c0545Ij.A00;
        int i4 = 0;
        int leadingZeros = 2;
        while (true) {
            switch (leadingZeros) {
                case 2:
                    c0545Ij = c0545Ij;
                    int i5 = c0545Ij.A02;
                    int leadingZeros2 = c0545Ij.A01;
                    if (i5 >= leadingZeros2) {
                        leadingZeros = 5;
                        break;
                    } else {
                        leadingZeros = 3;
                        break;
                    }
                case 3:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        leadingZeros = 4;
                        break;
                    } else {
                        leadingZeros = 5;
                        break;
                    }
                case 4:
                    i4++;
                    leadingZeros = 2;
                    break;
                case 5:
                    c0545Ij = c0545Ij;
                    z = false;
                    i = 1;
                    if (c0545Ij.A02 != c0545Ij.A01) {
                        leadingZeros = 11;
                        break;
                    } else {
                        leadingZeros = 6;
                        break;
                    }
                case 6:
                    z2 = true;
                    leadingZeros = 7;
                    break;
                case 7:
                    c0545Ij = c0545Ij;
                    c0545Ij.A02 = i2;
                    c0545Ij.A00 = i3;
                    if (!z2) {
                        leadingZeros = 8;
                        break;
                    } else {
                        leadingZeros = 10;
                        break;
                    }
                case 8:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0B((i4 * 2) + i)) {
                        leadingZeros = 10;
                        break;
                    } else {
                        leadingZeros = 9;
                        break;
                    }
                case 9:
                    z = true;
                    leadingZeros = 10;
                    break;
                case 10:
                    return z;
                case 11:
                    z2 = false;
                    leadingZeros = 7;
                    break;
            }
        }
    }

    public final boolean A0A() {
        boolean z = false;
        char c2 = (this.A03[this.A02] & (128 >> this.A00)) != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    A06();
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0B(int i) {
        C0545Ij c0545Ij = this;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = c0545Ij.A02;
        int i5 = i / 8;
        int i6 = c0545Ij.A02 + i5;
        int i7 = (c0545Ij.A00 + i) - (i5 * 8);
        int i8 = i7 > 7 ? 2 : 3;
        while (true) {
            switch (i8) {
                case 2:
                    i6++;
                    i7 -= 8;
                    i8 = 3;
                    break;
                case 3:
                    i3 = i4 + 1;
                    i8 = 4;
                    break;
                case 4:
                    z = true;
                    z = true;
                    if (i3 > i6) {
                        i8 = 9;
                        break;
                    } else {
                        i8 = 5;
                        break;
                    }
                case 5:
                    c0545Ij = c0545Ij;
                    if (i6 >= c0545Ij.A01) {
                        i8 = 9;
                        break;
                    } else {
                        i8 = 6;
                        break;
                    }
                case 6:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A02(i3)) {
                        i8 = 8;
                        break;
                    } else {
                        i8 = 7;
                        break;
                    }
                case 7:
                    i6++;
                    i3 += 2;
                    i8 = 8;
                    break;
                case 8:
                    i3 += z ? 1 : 0;
                    i8 = 4;
                    break;
                case 9:
                    c0545Ij = c0545Ij;
                    i2 = c0545Ij.A01;
                    if (i6 < i2) {
                        i8 = 12;
                        break;
                    } else {
                        i8 = 10;
                        break;
                    }
                case 10:
                    if (i6 != i2) {
                        i8 = 13;
                        break;
                    } else {
                        i8 = 11;
                        break;
                    }
                case 11:
                    if (i7 != 0) {
                        i8 = 13;
                        break;
                    } else {
                        i8 = 12;
                        break;
                    }
                case 12:
                    return z;
                case 13:
                    z = false;
                    i8 = 12;
                    break;
            }
        }
    }
}
