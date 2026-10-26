package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class YM implements InterfaceC0372Av {
    public static final int A06 = Float.floatToIntBits(Float.NaN);
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;
    public int A02 = 0;
    public ByteBuffer A03 = InterfaceC0372Av.A00;
    public ByteBuffer A04 = InterfaceC0372Av.A00;

    public static void A00(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == A06) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A46(int i, int i2, int i3) throws C0371Au {
        YM ym = this;
        char c2 = C0560Iy.A0e(i3) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    ym = ym;
                    if (ym.A01 != i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ym = ym;
                    if (ym.A00 != i2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ym = ym;
                    if (ym.A02 != i3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    YM ym2 = ym;
                    ym2.A01 = i;
                    ym2.A00 = i2;
                    ym2.A02 = i3;
                    return true;
                case 7:
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
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6e() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7Y() {
        return C0560Iy.A0e(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7c() {
        YM ym = this;
        boolean z = false;
        char c2 = ym.A05 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ym = ym;
                    if (ym.A04 != InterfaceC0372Av.A00) {
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
        YM ym = this;
        int limit = 0;
        int iLimit = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iPosition = 0;
        char c2 = ym.A02 == 1073741824 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    byteBuffer = byteBuffer;
                    iPosition = byteBuffer.position();
                    iLimit = byteBuffer.limit();
                    i3 = iLimit - iPosition;
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = i3;
                    c2 = 5;
                    break;
                case 5:
                    ym = ym;
                    if (ym.A03.capacity() >= i2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ym = ym;
                    ym.A03 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    c2 = 7;
                    break;
                case 7:
                    if (!z) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    limit = iPosition;
                    c2 = '\t';
                    break;
                case '\t':
                    if (limit >= iLimit) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    ym = ym;
                    byteBuffer = byteBuffer;
                    A00((byteBuffer.get(limit) & 255) | ((byteBuffer.get(limit + 1) & 255) << 8) | ((byteBuffer.get(limit + 2) & 255) << 16) | ((byteBuffer.get(limit + 3) & 255) << 24), ym.A03);
                    limit += 4;
                    c2 = '\t';
                    break;
                case 11:
                    ym = ym;
                    ym.A03.clear();
                    c2 = 7;
                    break;
                case '\f':
                    i2 = (i3 / 3) * 4;
                    c2 = 5;
                    break;
                case '\r':
                    z = false;
                    c2 = 3;
                    break;
                case 14:
                    i = iPosition;
                    c2 = 15;
                    break;
                case 15:
                    if (i >= iLimit) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    ym = ym;
                    byteBuffer = byteBuffer;
                    A00(((byteBuffer.get(i) & 255) << 8) | ((byteBuffer.get(i + 1) & 255) << 16) | ((byteBuffer.get(i + 2) & 255) << 24), ym.A03);
                    i += 3;
                    c2 = 15;
                    break;
                case 17:
                    YM ym2 = ym;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(byteBuffer2.limit());
                    ym2.A03.flip();
                    ym2.A04 = ym2.A03;
                    return;
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
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = InterfaceC0372Av.A00;
    }
}
