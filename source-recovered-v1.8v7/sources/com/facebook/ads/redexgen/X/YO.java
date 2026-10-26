package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class YO implements InterfaceC0372Av {
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = InterfaceC0372Av.A00;
    public ByteBuffer A04 = InterfaceC0372Av.A00;

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A46(int i, int i2, int i3) throws C0371Au {
        YO yo = this;
        char c2 = i3 != 3 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 == 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i3 == Integer.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i3 != 1073741824) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yo = yo;
                    if (yo.A02 != i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yo = yo;
                    if (yo.A00 != i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yo = yo;
                    if (yo.A01 != i3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    YO yo2 = yo;
                    yo2.A02 = i;
                    yo2.A00 = i2;
                    yo2.A01 = i3;
                    return true;
                case '\n':
                    throw new C0371Au(i, i2, i3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final ByteBuffer A6b() {
        ByteBuffer byteBuffer = this.A04;
        this.A04 = InterfaceC0372Av.A00;
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
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7Y() {
        boolean z = false;
        int i = this.A01;
        char c2 = i != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
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
    public final boolean A7c() {
        YO yo = this;
        boolean z = false;
        char c2 = yo.A05 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yo = yo;
                    if (yo.A04 != InterfaceC0372Av.A00) {
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
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void AC1(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        YO yo = this;
        int size = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i5 = iLimit - iPosition;
        int i6 = yo.A01;
        int i7 = i6 != Integer.MIN_VALUE ? 2 : 15;
        while (true) {
            switch (i7) {
                case 2:
                    if (i6 == 3) {
                        i7 = 14;
                        break;
                    } else {
                        i7 = 3;
                        break;
                    }
                case 3:
                    if (i6 != 1073741824) {
                        i7 = 24;
                        break;
                    } else {
                        i7 = 4;
                        break;
                    }
                case 4:
                    i4 = i5 / 2;
                    i7 = 5;
                    break;
                case 5:
                    yo = yo;
                    int i8 = yo.A03.capacity();
                    if (i8 >= i4) {
                        i7 = 13;
                        break;
                    } else {
                        i7 = 6;
                        break;
                    }
                case 6:
                    yo = yo;
                    yo.A03 = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    i7 = 7;
                    break;
                case 7:
                    yo = yo;
                    i = yo.A01;
                    if (i == Integer.MIN_VALUE) {
                        i7 = 20;
                        break;
                    } else {
                        i7 = 8;
                        break;
                    }
                case 8:
                    if (i == 3) {
                        i7 = 17;
                        break;
                    } else {
                        i7 = 9;
                        break;
                    }
                case 9:
                    if (i != 1073741824) {
                        i7 = 16;
                        break;
                    } else {
                        i7 = 10;
                        break;
                    }
                case 10:
                    size = iPosition;
                    i7 = 11;
                    break;
                case 11:
                    if (size >= iLimit) {
                        i7 = 23;
                        break;
                    } else {
                        i7 = 12;
                        break;
                    }
                case 12:
                    yo = yo;
                    byteBuffer2 = byteBuffer2;
                    yo.A03.put(byteBuffer2.get(size + 2));
                    yo.A03.put(byteBuffer2.get(size + 3));
                    size += 4;
                    i7 = 11;
                    break;
                case 13:
                    yo = yo;
                    yo.A03.clear();
                    i7 = 7;
                    break;
                case 14:
                    i4 = i5 * 2;
                    i7 = 5;
                    break;
                case 15:
                    int i9 = i5 / 3;
                    i4 = i9 * 2;
                    i7 = 5;
                    break;
                case 16:
                    throw new IllegalStateException();
                case 17:
                    i3 = iPosition;
                    i7 = 18;
                    break;
                case 18:
                    if (i3 >= iLimit) {
                        i7 = 23;
                        break;
                    } else {
                        i7 = 19;
                        break;
                    }
                case 19:
                    yo = yo;
                    byteBuffer2 = byteBuffer2;
                    yo.A03.put((byte) 0);
                    ByteBuffer byteBuffer3 = yo.A03;
                    int resampledSize = byteBuffer2.get(i3);
                    byteBuffer3.put((byte) ((resampledSize & 255) - 128));
                    i3++;
                    i7 = 18;
                    break;
                case 20:
                    i2 = iPosition;
                    i7 = 21;
                    break;
                case 21:
                    if (i2 >= iLimit) {
                        i7 = 23;
                        break;
                    } else {
                        i7 = 22;
                        break;
                    }
                case 22:
                    yo = yo;
                    byteBuffer2 = byteBuffer2;
                    int resampledSize2 = i2 + 1;
                    yo.A03.put(byteBuffer2.get(resampledSize2));
                    int resampledSize3 = i2 + 2;
                    yo.A03.put(byteBuffer2.get(resampledSize3));
                    i2 += 3;
                    i7 = 21;
                    break;
                case 23:
                    YO yo2 = yo;
                    ByteBuffer byteBuffer4 = byteBuffer2;
                    byteBuffer4.position(byteBuffer4.limit());
                    yo2.A03.flip();
                    yo2.A04 = yo2.A03;
                    return;
                case 24:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void flush() {
        this.A04 = InterfaceC0372Av.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = InterfaceC0372Av.A00;
    }
}
