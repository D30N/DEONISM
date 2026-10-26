package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0543Ih {
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C0543Ih() {
    }

    public C0543Ih(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C0543Ih(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A02 = i;
    }

    private void A00() {
        C0543Ih c0543Ih = this;
        boolean z = false;
        int i = 0;
        int i2 = c0543Ih.A03;
        char c2 = i2 >= 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0543Ih = c0543Ih;
                    i = c0543Ih.A02;
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
                    c0543Ih = c0543Ih;
                    if (c0543Ih.A01 != 0) {
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

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        boolean z = false;
        char c2 = this.A01 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A04(z);
                    return this.A03;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int returnValue) {
        C0543Ih c0543Ih = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        char c2 = returnValue == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c0543Ih = c0543Ih;
                    i4 = 0;
                    c0543Ih.A01 += returnValue;
                    c2 = 4;
                    break;
                case 4:
                    c0543Ih = c0543Ih;
                    i5 = c0543Ih.A01;
                    i3 = 8;
                    if (i5 <= 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0543Ih = c0543Ih;
                    c0543Ih.A01 = i5 - 8;
                    byte[] bArr = c0543Ih.A00;
                    int i6 = c0543Ih.A03;
                    c0543Ih.A03 = i6 + 1;
                    i4 |= (bArr[i6] & 255) << c0543Ih.A01;
                    c2 = 4;
                    break;
                case 6:
                    c0543Ih = c0543Ih;
                    byte[] bArr2 = c0543Ih.A00;
                    i2 = c0543Ih.A03;
                    i = (i4 | ((bArr2[i2] & 255) >> (8 - i5))) & ((-1) >>> (32 - returnValue));
                    if (i5 != i3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0543Ih = c0543Ih;
                    c0543Ih.A01 = 0;
                    c0543Ih.A03 = i2 + 1;
                    c2 = '\b';
                    break;
                case '\b':
                    c0543Ih.A00();
                    return i;
            }
        }
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i) {
        this.A03 = i / 8;
        this.A01 = i - (this.A03 * 8);
        A00();
    }

    public final void A08(int i) {
        int i2 = i / 8;
        this.A03 += i2;
        this.A01 += i - (i2 * 8);
        int i3 = this.A01;
        if (i3 > 7) {
            this.A03++;
            this.A01 = i3 - 8;
        }
        A00();
    }

    public final void A09(int i) {
        boolean z = false;
        char c2 = this.A01 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    C0543Ih c0543Ih = this;
                    IJ.A04(z);
                    c0543Ih.A03 += i;
                    c0543Ih.A00();
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0A(int i, int firstByteInputBits) {
        C0543Ih c0543Ih = this;
        int lastByteRightPaddingSize = 0;
        int firstByteBitmask = 0;
        int firstByteRightPaddingSize = 0;
        int currentByteIndex = firstByteInputBits < 32 ? 2 : 3;
        while (true) {
            switch (currentByteIndex) {
                case 2:
                    i &= (1 << firstByteInputBits) - 1;
                    currentByteIndex = 3;
                    break;
                case 3:
                    c0543Ih = c0543Ih;
                    int currentByteIndex2 = c0543Ih.A01;
                    firstByteRightPaddingSize = 8;
                    int iMin = Math.min(8 - currentByteIndex2, firstByteInputBits);
                    int currentByteIndex3 = c0543Ih.A01;
                    int firstByteBitmask2 = (8 - currentByteIndex3) - iMin;
                    int i2 = 65280 >> currentByteIndex3;
                    int currentByteIndex4 = 1 << firstByteBitmask2;
                    int i3 = i2 | (currentByteIndex4 - 1);
                    byte[] bArr = c0543Ih.A00;
                    int i4 = c0543Ih.A03;
                    int currentByteIndex5 = bArr[i4];
                    bArr[i4] = (byte) (currentByteIndex5 & i3);
                    int currentByteIndex6 = firstByteInputBits - iMin;
                    int i5 = i >>> currentByteIndex6;
                    int currentByteIndex7 = bArr[i4];
                    bArr[i4] = (byte) (currentByteIndex7 | (i5 << firstByteBitmask2));
                    firstByteBitmask = firstByteInputBits - iMin;
                    lastByteRightPaddingSize = i4 + 1;
                    currentByteIndex = 4;
                    break;
                case 4:
                    if (firstByteBitmask <= firstByteRightPaddingSize) {
                        currentByteIndex = 6;
                        break;
                    } else {
                        currentByteIndex = 5;
                        break;
                    }
                case 5:
                    c0543Ih = c0543Ih;
                    int currentByteIndex8 = firstByteBitmask - 8;
                    c0543Ih.A00[lastByteRightPaddingSize] = (byte) (i >>> currentByteIndex8);
                    firstByteBitmask -= 8;
                    lastByteRightPaddingSize++;
                    currentByteIndex = 4;
                    break;
                case 6:
                    C0543Ih c0543Ih2 = c0543Ih;
                    int firstByteRightPaddingSize2 = firstByteRightPaddingSize - firstByteBitmask;
                    byte[] bArr2 = c0543Ih2.A00;
                    int currentByteIndex9 = 1 << firstByteRightPaddingSize2;
                    bArr2[lastByteRightPaddingSize] = (byte) (bArr2[lastByteRightPaddingSize] & (currentByteIndex9 - 1));
                    int currentByteIndex10 = 1 << firstByteBitmask;
                    int lastByteInput = i & (currentByteIndex10 - 1);
                    int currentByteIndex11 = bArr2[lastByteRightPaddingSize];
                    bArr2[lastByteRightPaddingSize] = (byte) (currentByteIndex11 | (lastByteInput << firstByteRightPaddingSize2));
                    c0543Ih2.A08(firstByteInputBits);
                    c0543Ih2.A00();
                    return;
            }
        }
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i;
    }

    public final void A0D(byte[] bArr, int lastDataByteTrailingBits, int i) {
        C0543Ih c0543Ih = this;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte b2 = 0;
        int i5 = 0;
        int i6 = (i >> 3) + lastDataByteTrailingBits;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    b2 = 255;
                    i5 = 8;
                    if (lastDataByteTrailingBits >= i6) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0543Ih = c0543Ih;
                    bArr = bArr;
                    byte[] bArr2 = c0543Ih.A00;
                    int i7 = c0543Ih.A03;
                    c0543Ih.A03 = i7 + 1;
                    byte b3 = bArr2[i7];
                    int i8 = c0543Ih.A01;
                    bArr[lastDataByteTrailingBits] = (byte) (b3 << i8);
                    bArr[lastDataByteTrailingBits] = (byte) (((b2 & bArr2[c0543Ih.A03]) >> (i5 - i8)) | bArr[lastDataByteTrailingBits]);
                    lastDataByteTrailingBits++;
                    c2 = 2;
                    break;
                case 4:
                    i4 = i & 7;
                    if (i4 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c0543Ih = c0543Ih;
                    bArr = bArr;
                    bArr[i6] = (byte) (bArr[i6] & (b2 >> i4));
                    i3 = c0543Ih.A01;
                    if (i3 + i4 <= i5) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0543Ih = c0543Ih;
                    bArr = bArr;
                    byte b4 = bArr[i6];
                    byte[] bArr3 = c0543Ih.A00;
                    int i9 = c0543Ih.A03;
                    c0543Ih.A03 = i9 + 1;
                    bArr[i6] = (byte) (b4 | ((bArr3[i9] & b2) << i3));
                    c0543Ih.A01 = i3 - i5;
                    c2 = '\b';
                    break;
                case '\b':
                    c0543Ih = c0543Ih;
                    bArr = bArr;
                    c0543Ih.A01 += i4;
                    byte[] bArr4 = c0543Ih.A00;
                    i2 = c0543Ih.A03;
                    int i10 = b2 & bArr4[i2];
                    int i11 = c0543Ih.A01;
                    bArr[i6] = (byte) (bArr[i6] | ((byte) ((i10 >> (8 - i11)) << (8 - i4))));
                    if (i11 != i5) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0543Ih = c0543Ih;
                    c0543Ih.A01 = 0;
                    c0543Ih.A03 = i2 + 1;
                    c2 = '\n';
                    break;
                case '\n':
                    c0543Ih.A00();
                    return;
            }
        }
    }

    public final void A0E(byte[] bArr, int i, int i2) {
        boolean z = false;
        char c2 = this.A01 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    C0543Ih c0543Ih = this;
                    IJ.A04(z);
                    System.arraycopy(c0543Ih.A00, c0543Ih.A03, bArr, i, i2);
                    c0543Ih.A03 += i2;
                    c0543Ih.A00();
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0F() {
        boolean z = false;
        char c2 = (this.A00[this.A03] & (128 >> this.A01)) != 0 ? (char) 2 : (char) 4;
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
}
