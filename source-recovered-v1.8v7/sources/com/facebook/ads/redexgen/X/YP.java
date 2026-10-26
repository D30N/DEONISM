package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class YP implements InterfaceC0372Av {
    public int A00;
    public int A02;
    public int A03;
    public int A05;
    public long A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ByteBuffer A07 = InterfaceC0372Av.A00;
    public ByteBuffer A08 = InterfaceC0372Av.A00;
    public int A01 = -1;
    public int A04 = -1;
    public byte[] A0C = new byte[0];
    public byte[] A0D = new byte[0];

    private int A00(long j) {
        return (int) ((this.A04 * j) / 1000000);
    }

    private int A01(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    byteBuffer = byteBuffer;
                    if (iLimit < byteBuffer.position()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    byteBuffer = byteBuffer;
                    if (Math.abs((int) byteBuffer.get(iLimit)) <= 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    int i = this.A00;
                    return ((iLimit / i) * i) + i;
                case 5:
                    iLimit -= 2;
                    c2 = 2;
                    break;
                case 6:
                    return byteBuffer.position();
            }
        }
    }

    private int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position() + 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    byteBuffer = byteBuffer;
                    if (iPosition >= byteBuffer.limit()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    byteBuffer = byteBuffer;
                    if (Math.abs((int) byteBuffer.get(iPosition)) <= 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    int i = this.A00;
                    return i * (iPosition / i);
                case 5:
                    iPosition += 2;
                    c2 = 2;
                    break;
                case 6:
                    return byteBuffer.limit();
            }
        }
    }

    private void A03(int i) {
        YP yp = this;
        char c2 = yp.A07.capacity() < i ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    yp.A07 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                    c2 = 3;
                    break;
                case 3:
                    if (i <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yp = yp;
                    yp.A0A = true;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    yp = yp;
                    yp.A07.clear();
                    c2 = 3;
                    break;
            }
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        A03(byteBuffer.remaining());
        this.A07.put(byteBuffer);
        this.A07.flip();
        this.A08 = this.A07;
    }

    private void A05(ByteBuffer byteBuffer) {
        YP yp = this;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int iLimit = byteBuffer.limit();
        int iA02 = yp.A02(byteBuffer);
        int iPosition = iA02 - byteBuffer.position();
        byte[] bArr2 = yp.A0C;
        int length = bArr2.length;
        int i3 = yp.A02;
        int i4 = length - i3;
        int maybeSilenceInputSize = iA02 < iLimit ? 2 : 5;
        while (true) {
            switch (maybeSilenceInputSize) {
                case 2:
                    if (iPosition >= i4) {
                        maybeSilenceInputSize = 5;
                        break;
                    } else {
                        maybeSilenceInputSize = 3;
                        break;
                    }
                case 3:
                    yp = yp;
                    bArr2 = bArr2;
                    yp.A09(bArr2, i3);
                    yp.A02 = 0;
                    yp.A05 = 0;
                    maybeSilenceInputSize = 4;
                    break;
                case 4:
                    return;
                case 5:
                    yp = yp;
                    byteBuffer = byteBuffer;
                    int iMin = Math.min(iPosition, i4);
                    int maybeSilenceInputSize2 = byteBuffer.position();
                    byteBuffer.limit(maybeSilenceInputSize2 + iMin);
                    byte[] bArr3 = yp.A0C;
                    int maybeSilenceInputSize3 = yp.A02;
                    byteBuffer.get(bArr3, maybeSilenceInputSize3, iMin);
                    int maybeSilenceInputSize4 = yp.A02;
                    yp.A02 = maybeSilenceInputSize4 + iMin;
                    i = yp.A02;
                    bArr = yp.A0C;
                    int maybeSilenceInputSize5 = bArr.length;
                    if (i != maybeSilenceInputSize5) {
                        maybeSilenceInputSize = 9;
                        break;
                    } else {
                        maybeSilenceInputSize = 6;
                        break;
                    }
                case 6:
                    yp = yp;
                    i2 = 2;
                    if (!yp.A0A) {
                        maybeSilenceInputSize = 10;
                        break;
                    } else {
                        maybeSilenceInputSize = 7;
                        break;
                    }
                case 7:
                    yp = yp;
                    bArr = bArr;
                    int maybeSilenceInputSize6 = yp.A03;
                    yp.A09(bArr, maybeSilenceInputSize6);
                    long j = yp.A06;
                    int i5 = yp.A02;
                    int maybeSilenceInputSize7 = yp.A03;
                    int i6 = i5 - (maybeSilenceInputSize7 * 2);
                    int maybeSilenceInputSize8 = yp.A00;
                    yp.A06 = j + (i6 / maybeSilenceInputSize8);
                    maybeSilenceInputSize = 8;
                    break;
                case 8:
                    yp = yp;
                    byteBuffer = byteBuffer;
                    byte[] bArr4 = yp.A0C;
                    int maybeSilenceInputSize9 = yp.A02;
                    yp.A08(byteBuffer, bArr4, maybeSilenceInputSize9);
                    yp.A02 = 0;
                    yp.A05 = i2;
                    maybeSilenceInputSize = 9;
                    break;
                case 9:
                    byteBuffer = byteBuffer;
                    byteBuffer.limit(iLimit);
                    maybeSilenceInputSize = 4;
                    break;
                case 10:
                    yp = yp;
                    long j2 = yp.A06;
                    int maybeSilenceInputSize10 = yp.A03;
                    int i7 = i - maybeSilenceInputSize10;
                    int maybeSilenceInputSize11 = yp.A00;
                    yp.A06 = j2 + (i7 / maybeSilenceInputSize11);
                    maybeSilenceInputSize = 8;
                    break;
            }
        }
    }

    private void A06(ByteBuffer byteBuffer) {
        YP yp = this;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + yp.A0C.length));
        int iA01 = yp.A01(byteBuffer);
        char c2 = iA01 == byteBuffer.position() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    yp.A05 = 1;
                    c2 = 3;
                    break;
                case 3:
                    byteBuffer.limit(iLimit);
                    return;
                case 4:
                    yp = yp;
                    byteBuffer = byteBuffer;
                    byteBuffer.limit(iA01);
                    yp.A04(byteBuffer);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A07(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        this.A06 += byteBuffer.remaining() / this.A00;
        A08(byteBuffer, this.A0D, this.A03);
        if (iA02 < iLimit) {
            A09(this.A0D, this.A03);
            this.A05 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A08(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.A03);
        int i2 = this.A03 - iMin;
        System.arraycopy(bArr, i - i2, this.A0D, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.A0D, i2, iMin);
    }

    private void A09(byte[] bArr, int i) {
        A03(i);
        this.A07.put(bArr, 0, i);
        this.A07.flip();
        this.A08 = this.A07;
    }

    public final long A0A() {
        return this.A06;
    }

    public final void A0B(boolean z) {
        this.A09 = z;
        flush();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A46(int i, int i2, int i3) throws C0371Au {
        YP yp = this;
        char c2 = i3 == 2 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    if (yp.A04 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yp = yp;
                    if (yp.A01 != i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    YP yp2 = yp;
                    yp2.A04 = i;
                    yp2.A01 = i2;
                    yp2.A00 = i2 * 2;
                    return true;
                case 6:
                    throw new C0371Au(i, i2, i3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final ByteBuffer A6b() {
        ByteBuffer byteBuffer = this.A08;
        this.A08 = InterfaceC0372Av.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6d() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6e() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7Y() {
        YP yp = this;
        boolean z = false;
        char c2 = yp.A04 != -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    if (!yp.A09) {
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
        YP yp = this;
        boolean z = false;
        char c2 = yp.A0B ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    if (yp.A08 != InterfaceC0372Av.A00) {
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
        YP yp = this;
        yp.A0B = true;
        int i = yp.A02;
        char c2 = i > 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    yp.A09(yp.A0C, i);
                    c2 = 3;
                    break;
                case 3:
                    yp = yp;
                    if (!yp.A0A) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    yp = yp;
                    yp.A06 += yp.A03 / yp.A00;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void AC1(ByteBuffer byteBuffer) {
        YP yp = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    byteBuffer = byteBuffer;
                    if (!byteBuffer.hasRemaining()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yp = yp;
                    if (!yp.A08.hasRemaining()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 4:
                    yp = yp;
                    i = yp.A05;
                    if (i == 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i != 2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yp = yp;
                    byteBuffer = byteBuffer;
                    yp.A07(byteBuffer);
                    c2 = 2;
                    break;
                case '\b':
                    yp = yp;
                    byteBuffer = byteBuffer;
                    yp.A05(byteBuffer);
                    c2 = 2;
                    break;
                case '\t':
                    yp = yp;
                    byteBuffer = byteBuffer;
                    yp.A06(byteBuffer);
                    c2 = 2;
                    break;
                case '\n':
                    throw new IllegalStateException();
                case 11:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void flush() {
        YP yp = this;
        int i = 0;
        int iA00 = 0;
        char c2 = yp.A7Y() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yp = yp;
                    iA00 = yp.A00(150000L) * yp.A00;
                    if (yp.A0C.length == iA00) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yp = yp;
                    yp.A0C = new byte[iA00];
                    c2 = 4;
                    break;
                case 4:
                    yp = yp;
                    yp.A03 = yp.A00(20000L) * yp.A00;
                    int length = yp.A0D.length;
                    i = yp.A03;
                    if (length == i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yp = yp;
                    yp.A0D = new byte[i];
                    c2 = 6;
                    break;
                case 6:
                    YP yp2 = yp;
                    yp2.A05 = 0;
                    yp2.A08 = InterfaceC0372Av.A00;
                    yp2.A0B = false;
                    yp2.A06 = 0L;
                    yp2.A02 = 0;
                    yp2.A0A = false;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void reset() {
        this.A09 = false;
        flush();
        this.A07 = InterfaceC0372Av.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        this.A0C = new byte[0];
        this.A0D = new byte[0];
    }
}
