package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class YS implements InterfaceC0372Av {
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public boolean A08;
    public boolean A09;
    public ByteBuffer A06 = InterfaceC0372Av.A00;
    public ByteBuffer A07 = InterfaceC0372Av.A00;
    public int A00 = -1;
    public int A03 = -1;
    public byte[] A0A = new byte[0];

    public final void A00(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A46(int i, int i2, int i3) throws C0371Au {
        YS ys = this;
        boolean z = false;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        char c2 = i3 == 2 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    ys = ys;
                    ys.A00 = i2;
                    ys.A03 = i;
                    i4 = ys.A04;
                    ys.A0A = new byte[i4 * i2 * 2];
                    z = false;
                    ys.A01 = 0;
                    int i5 = ys.A05;
                    ys.A02 = i5 * i2 * 2;
                    z3 = ys.A09;
                    if (i5 != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i4 == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    ys = ys;
                    ys.A09 = z2;
                    if (z3 == ys.A09) {
                        c2 = 7;
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
                    z2 = false;
                    c2 = 5;
                    break;
                case '\t':
                    throw new C0371Au(i, i2, i3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final ByteBuffer A6b() {
        ByteBuffer byteBuffer = this.A07;
        this.A07 = InterfaceC0372Av.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6c() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6d() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6e() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7Y() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7c() {
        YS ys = this;
        boolean z = false;
        char c2 = ys.A08 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ys = ys;
                    if (ys.A07 != InterfaceC0372Av.A00) {
                        c2 = 5;
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
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void AC0() {
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void AC1(ByteBuffer byteBuffer) {
        YS ys = this;
        int remaining = 0;
        int endBufferBytesToOutput = 0;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int iMin = Math.min(i, ys.A02);
        int trimBytes = ys.A02;
        ys.A02 = trimBytes - iMin;
        byteBuffer.position(iPosition + iMin);
        int trimBytes2 = ys.A02;
        int trimBytes3 = trimBytes2 > 0 ? 2 : 3;
        while (true) {
            switch (trimBytes3) {
                case 2:
                    return;
                case 3:
                    ys = ys;
                    remaining = i - iMin;
                    int i2 = ys.A01 + remaining;
                    int trimBytes4 = ys.A0A.length;
                    endBufferBytesToOutput = i2 - trimBytes4;
                    int remainingBytesToOutput = ys.A06.capacity();
                    if (remainingBytesToOutput >= endBufferBytesToOutput) {
                        trimBytes3 = 6;
                        break;
                    } else {
                        trimBytes3 = 4;
                        break;
                    }
                case 4:
                    ys = ys;
                    ys.A06 = ByteBuffer.allocateDirect(endBufferBytesToOutput).order(ByteOrder.nativeOrder());
                    trimBytes3 = 5;
                    break;
                case 5:
                    YS ys2 = ys;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    int remainingBytesToOutput2 = ys2.A01;
                    int iA06 = C0560Iy.A06(endBufferBytesToOutput, 0, remainingBytesToOutput2);
                    ys2.A06.put(ys2.A0A, 0, iA06);
                    int inputBufferBytesToOutput = C0560Iy.A06(endBufferBytesToOutput - iA06, 0, remaining);
                    int remainingBytesToOutput3 = byteBuffer2.position();
                    byteBuffer2.limit(remainingBytesToOutput3 + inputBufferBytesToOutput);
                    ys2.A06.put(byteBuffer2);
                    byteBuffer2.limit(iLimit);
                    int remaining2 = remaining - inputBufferBytesToOutput;
                    int remainingBytesToOutput4 = ys2.A01;
                    ys2.A01 = remainingBytesToOutput4 - iA06;
                    byte[] bArr = ys2.A0A;
                    int remainingBytesToOutput5 = ys2.A01;
                    System.arraycopy(bArr, iA06, bArr, 0, remainingBytesToOutput5);
                    byte[] bArr2 = ys2.A0A;
                    int remainingBytesToOutput6 = ys2.A01;
                    byteBuffer2.get(bArr2, remainingBytesToOutput6, remaining2);
                    int remainingBytesToOutput7 = ys2.A01;
                    ys2.A01 = remainingBytesToOutput7 + remaining2;
                    ys2.A06.flip();
                    ys2.A07 = ys2.A06;
                    return;
                case 6:
                    ys = ys;
                    ys.A06.clear();
                    trimBytes3 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void flush() {
        this.A07 = InterfaceC0372Av.A00;
        this.A08 = false;
        this.A02 = 0;
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void reset() {
        flush();
        this.A06 = InterfaceC0372Av.A00;
        this.A00 = -1;
        this.A03 = -1;
        this.A0A = new byte[0];
    }
}
