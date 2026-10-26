package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0954Yk implements CD {
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC0516He A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C0954Yk(InterfaceC0516He interfaceC0516He, long j, long j2) {
        this.A05 = interfaceC0516He;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(int i) {
        int iMin = Math.min(this.A00, i);
        A05(iMin);
        return iMin;
    }

    private int A01(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.A03, 0, bArr, i, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        C0954Yk c0954Yk = this;
        int i4 = 0;
        int i5 = 0;
        char c2 = !Thread.interrupted() ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c0954Yk = c0954Yk;
                    bArr = bArr;
                    i4 = c0954Yk.A05.read(bArr, i + i3, i2 - i3);
                    i5 = -1;
                    if (i4 != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i3 != 0) {
                        c2 = 6;
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
                    return i5;
                case 6:
                    throw new EOFException();
                case 7:
                    return i3 + i4;
                case '\b':
                    throw new InterruptedException();
            }
        }
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        if (i2 > bArr.length) {
            this.A03 = Arrays.copyOf(this.A03, C0560Iy.A06(bArr.length * 2, 65536 + i2, 524288 + i2));
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        int i2 = this.A00;
        if (i2 < this.A03.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        System.arraycopy(this.A03, i, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws InterruptedException, IOException {
        C0954Yk c0954Yk = this;
        c0954Yk.A04(i);
        int iMin = Math.min(c0954Yk.A00 - c0954Yk.A01, i);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iMin >= i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0954Yk = c0954Yk;
                    iMin = c0954Yk.A02(c0954Yk.A03, c0954Yk.A01, i, iMin, z);
                    if (iMin != -1) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    C0954Yk c0954Yk2 = c0954Yk;
                    c0954Yk2.A01 += i;
                    c0954Yk2.A00 = Math.max(c0954Yk2.A00, c0954Yk2.A01);
                    return true;
            }
        }
    }

    public final boolean A07(int i, boolean z) throws InterruptedException, IOException {
        C0954Yk c0954Yk = this;
        int i2 = 0;
        boolean z2 = false;
        int iA00 = c0954Yk.A00(i);
        int minLength = 2;
        while (true) {
            switch (minLength) {
                case 2:
                    i2 = -1;
                    if (iA00 >= i) {
                        minLength = 5;
                        break;
                    } else {
                        minLength = 3;
                        break;
                    }
                case 3:
                    if (iA00 == i2) {
                        minLength = 5;
                        break;
                    } else {
                        minLength = 4;
                        break;
                    }
                case 4:
                    c0954Yk = c0954Yk;
                    iA00 = c0954Yk.A02(c0954Yk.A06, -iA00, Math.min(i, c0954Yk.A06.length + iA00), iA00, z);
                    minLength = 2;
                    break;
                case 5:
                    c0954Yk = c0954Yk;
                    c0954Yk.A03(iA00);
                    if (iA00 == i2) {
                        minLength = 8;
                        break;
                    } else {
                        minLength = 6;
                        break;
                    }
                case 6:
                    z2 = true;
                    minLength = 7;
                    break;
                case 7:
                    return z2;
                case 8:
                    z2 = false;
                    minLength = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final void A3L(int i) throws InterruptedException, IOException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final long A6U() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final long A6i() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final long A6n() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final void ABf(byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        ABg(bArr, i, i2, false);
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final boolean ABg(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, IOException {
        if (!A06(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final boolean AC8(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, IOException {
        byte[] bArr2 = bArr;
        C0954Yk c0954Yk = this;
        boolean z2 = false;
        int i3 = 0;
        int iA01 = c0954Yk.A01(bArr2, i, i2);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = -1;
                    if (iA01 >= i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (iA01 == i3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0954Yk = c0954Yk;
                    bArr2 = bArr2;
                    iA01 = c0954Yk.A02(bArr2, i, i2, iA01, z);
                    c2 = 2;
                    break;
                case 5:
                    c0954Yk = c0954Yk;
                    c0954Yk.A03(iA01);
                    if (iA01 == i3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z2 = true;
                    c2 = 7;
                    break;
                case 7:
                    return z2;
                case '\b':
                    z2 = false;
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final void ACg() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final int ADI(int i) throws InterruptedException, IOException {
        int iA00 = A00(i);
        if (iA00 == 0) {
            byte[] bArr = this.A06;
            iA00 = A02(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        A03(iA00);
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final void ADL(int i) throws InterruptedException, IOException {
        A07(i, false);
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final int read(byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        int iA01 = A01(bArr, i, i2);
        if (iA01 == 0) {
            iA01 = A02(bArr, i, i2, 0, true);
        }
        A03(iA01);
        return iA01;
    }

    @Override // com.facebook.ads.redexgen.X.CD
    public final void readFully(byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        AC8(bArr, i, i2, false);
    }
}
