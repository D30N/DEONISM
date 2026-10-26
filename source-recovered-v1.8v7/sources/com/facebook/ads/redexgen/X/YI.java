package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YI implements InterfaceC0372Av {
    public boolean A04;
    public boolean A05;

    @Nullable
    public int[] A06;

    @Nullable
    public int[] A07;
    public ByteBuffer A02 = InterfaceC0372Av.A00;
    public ByteBuffer A03 = InterfaceC0372Av.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(@Nullable int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A46(int i, int i2, int i3) throws C0371Au {
        YI yi = this;
        boolean z = false;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        int[] iArr = null;
        boolean z4 = !Arrays.equals(yi.A07, yi.A06);
        yi.A06 = yi.A07;
        int channelIndex = yi.A06 == null ? 2 : 3;
        while (true) {
            switch (channelIndex) {
                case 2:
                    yi.A04 = false;
                    return z4;
                case 3:
                    if (i3 != 2) {
                        channelIndex = 20;
                        break;
                    } else {
                        channelIndex = 4;
                        break;
                    }
                case 4:
                    if (!z4) {
                        channelIndex = 5;
                        break;
                    } else {
                        channelIndex = 8;
                        break;
                    }
                case 5:
                    yi = yi;
                    if (yi.A01 != i) {
                        channelIndex = 8;
                        break;
                    } else {
                        channelIndex = 6;
                        break;
                    }
                case 6:
                    yi = yi;
                    int channelIndex2 = yi.A00;
                    if (channelIndex2 != i2) {
                        channelIndex = 8;
                        break;
                    } else {
                        channelIndex = 7;
                        break;
                    }
                case 7:
                    return false;
                case 8:
                    yi = yi;
                    yi.A01 = i;
                    yi.A00 = i2;
                    if (i2 == yi.A06.length) {
                        channelIndex = 17;
                        break;
                    } else {
                        channelIndex = 9;
                        break;
                    }
                case 9:
                    z3 = true;
                    channelIndex = 10;
                    break;
                case 10:
                    yi = yi;
                    yi.A04 = z3;
                    i5 = 0;
                    channelIndex = 11;
                    break;
                case 11:
                    yi = yi;
                    iArr = yi.A06;
                    if (i5 >= iArr.length) {
                        channelIndex = 19;
                        break;
                    } else {
                        channelIndex = 12;
                        break;
                    }
                case 12:
                    iArr = iArr;
                    i4 = iArr[i5];
                    if (i4 >= i2) {
                        channelIndex = 18;
                        break;
                    } else {
                        channelIndex = 13;
                        break;
                    }
                case 13:
                    yi = yi;
                    z2 = yi.A04;
                    if (i4 == i5) {
                        channelIndex = 16;
                        break;
                    } else {
                        channelIndex = 14;
                        break;
                    }
                case 14:
                    z = true;
                    channelIndex = 15;
                    break;
                case 15:
                    yi = yi;
                    yi.A04 = z2 | z;
                    i5++;
                    channelIndex = 11;
                    break;
                case 16:
                    z = false;
                    channelIndex = 15;
                    break;
                case 17:
                    z3 = false;
                    channelIndex = 10;
                    break;
                case 18:
                    throw new C0371Au(i, i2, i3);
                case 19:
                    return true;
                case 20:
                    throw new C0371Au(i, i2, i3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final ByteBuffer A6b() {
        ByteBuffer byteBuffer = this.A03;
        this.A03 = InterfaceC0372Av.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6c() {
        YI yi = this;
        int length = 0;
        int[] iArr = yi.A06;
        char c2 = iArr == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yi = yi;
                    length = yi.A00;
                    c2 = 3;
                    break;
                case 3:
                    return length;
                case 4:
                    iArr = iArr;
                    length = iArr.length;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6d() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6e() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7Y() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7c() {
        YI yi = this;
        boolean z = false;
        char c2 = yi.A05 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yi = yi;
                    if (yi.A03 != InterfaceC0372Av.A00) {
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
        YI yi = this;
        int[] iArr = null;
        int outputSize = 0;
        boolean z = false;
        int length = 0;
        int i = 0;
        int channelIndex = 0;
        int iLimit = 0;
        char c2 = yi.A06 != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    yi = yi;
                    byteBuffer = byteBuffer;
                    IJ.A04(z);
                    channelIndex = byteBuffer.position();
                    iLimit = byteBuffer.limit();
                    length = yi.A06.length * ((iLimit - channelIndex) / (yi.A00 * 2)) * 2;
                    if (yi.A02.capacity() >= length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yi = yi;
                    yi.A02 = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                    c2 = 5;
                    break;
                case 5:
                    if (channelIndex >= iLimit) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yi = yi;
                    iArr = yi.A06;
                    outputSize = iArr.length;
                    i = 0;
                    c2 = 7;
                    break;
                case 7:
                    if (i >= outputSize) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    yi = yi;
                    byteBuffer = byteBuffer;
                    iArr = iArr;
                    yi.A02.putShort(byteBuffer.getShort((iArr[i] * 2) + channelIndex));
                    i++;
                    c2 = 7;
                    break;
                case '\t':
                    yi = yi;
                    channelIndex += yi.A00 * 2;
                    c2 = 5;
                    break;
                case '\n':
                    yi = yi;
                    yi.A02.clear();
                    c2 = 5;
                    break;
                case 11:
                    z = false;
                    c2 = 3;
                    break;
                case '\f':
                    YI yi2 = yi;
                    byteBuffer.position(iLimit);
                    yi2.A02.flip();
                    yi2.A03 = yi2.A02;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void flush() {
        this.A03 = InterfaceC0372Av.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void reset() {
        flush();
        this.A02 = InterfaceC0372Av.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
