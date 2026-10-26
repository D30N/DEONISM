package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class D9 {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public D9(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        D9 d9 = this;
        boolean z = false;
        int i = 0;
        int i2 = d9.A01;
        char c2 = i2 >= 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    d9 = d9;
                    i = d9.A02;
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
                    d9 = d9;
                    if (d9.A00 != 0) {
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
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int bitsRead) {
        D9 d9 = this;
        int i = d9.A01;
        int iMin = Math.min(bitsRead, 8 - d9.A00);
        int i2 = i + 1;
        int i3 = d9.A03[i] & 255;
        int tempByteOffset = d9.A00;
        int i4 = i3 >> tempByteOffset;
        int tempByteOffset2 = 8 - iMin;
        int i5 = i4 & (255 >> tempByteOffset2);
        int tempByteOffset3 = 2;
        while (true) {
            switch (tempByteOffset3) {
                case 2:
                    if (iMin >= bitsRead) {
                        tempByteOffset3 = 4;
                        break;
                    } else {
                        tempByteOffset3 = 3;
                        break;
                    }
                case 3:
                    d9 = d9;
                    int tempByteOffset4 = d9.A03[i2];
                    i5 |= (tempByteOffset4 & 255) << iMin;
                    iMin += 8;
                    i2++;
                    tempByteOffset3 = 2;
                    break;
                case 4:
                    int tempByteOffset5 = 32 - bitsRead;
                    int i6 = i5 & ((-1) >>> tempByteOffset5);
                    d9.A03(bitsRead);
                    return i6;
            }
        }
    }

    public final void A03(int i) {
        int i2 = i / 8;
        this.A01 += i2;
        this.A00 += i - (i2 * 8);
        int i3 = this.A00;
        if (i3 > 7) {
            this.A01++;
            this.A00 = i3 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean z = false;
        char c2 = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    A03(1);
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
