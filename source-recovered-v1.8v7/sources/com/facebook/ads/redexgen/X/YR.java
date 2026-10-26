package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: assets/audience_network.dex */
public final class YR implements InterfaceC0372Av {
    public long A06;
    public long A07;

    @Nullable
    public BQ A08;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;
    public ByteBuffer A09 = InterfaceC0372Av.A00;
    public ShortBuffer A0B = this.A09.asShortBuffer();
    public ByteBuffer A0A = InterfaceC0372Av.A00;
    public int A04 = -1;

    public final float A00(float f) {
        float fA00 = C0560Iy.A00(f, 0.1f, 8.0f);
        if (this.A00 != fA00) {
            this.A00 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final float A01(float f) {
        float fA00 = C0560Iy.A00(f, 0.1f, 8.0f);
        if (this.A01 != fA00) {
            this.A01 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final long A02(long j) {
        int i = 0;
        int i2 = 0;
        long jA0G = 0;
        YR yr = this;
        long j2 = yr.A07;
        char c2 = j2 >= 1024 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yr = yr;
                    i = yr.A03;
                    i2 = yr.A05;
                    if (i != i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yr = yr;
                    jA0G = C0560Iy.A0G(j, yr.A06, j2);
                    c2 = 4;
                    break;
                case 4:
                    return jA0G;
                case 5:
                    yr = yr;
                    jA0G = C0560Iy.A0G(j, yr.A06 * i, j2 * i2);
                    c2 = 4;
                    break;
                case 6:
                    return (long) (yr.A01 * j);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A46(int i, int i2, int i3) throws C0371Au {
        YR yr = this;
        int i4 = 0;
        char c2 = i3 == 2 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    yr = yr;
                    i4 = yr.A04;
                    if (i4 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i4 = i;
                    c2 = 4;
                    break;
                case 4:
                    yr = yr;
                    if (yr.A05 != i) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yr = yr;
                    if (yr.A02 != i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yr = yr;
                    if (yr.A03 != i4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    YR yr2 = yr;
                    yr2.A05 = i;
                    yr2.A02 = i2;
                    yr2.A03 = i4;
                    yr2.A08 = null;
                    return true;
                case '\t':
                    throw new C0371Au(i, i2, i3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final ByteBuffer A6b() {
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = InterfaceC0372Av.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final int A6c() {
        return this.A02;
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
        YR yr = this;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        char c2 = yr.A05 != -1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    yr = yr;
                    f2 = 1.0f;
                    f = 0.01f;
                    if (Math.abs(yr.A01 - 1.0f) >= 0.01f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yr = yr;
                    if (Math.abs(yr.A00 - f2) >= f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yr = yr;
                    if (yr.A03 == yr.A05) {
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
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final boolean A7c() {
        YR yr = this;
        boolean z = false;
        BQ bq = null;
        char c2 = yr.A0C ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yr = yr;
                    bq = yr.A08;
                    if (bq == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bq = bq;
                    if (bq.A0H() != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void AC0() {
        boolean z = false;
        char c2 = this.A08 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    YR yr = this;
                    IJ.A04(z);
                    yr.A08.A0J();
                    yr.A0C = true;
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void AC1(ByteBuffer byteBuffer) {
        YR yr = this;
        int iA0H = 0;
        boolean z = false;
        char c2 = yr.A08 != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    byteBuffer = byteBuffer;
                    IJ.A04(z);
                    if (!byteBuffer.hasRemaining()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yr = yr;
                    byteBuffer = byteBuffer;
                    ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                    int iRemaining = byteBuffer.remaining();
                    yr.A06 += iRemaining;
                    yr.A08.A0L(shortBufferAsShortBuffer);
                    byteBuffer.position(byteBuffer.position() + iRemaining);
                    c2 = 5;
                    break;
                case 5:
                    yr = yr;
                    iA0H = yr.A08.A0H() * yr.A02 * 2;
                    if (iA0H <= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yr = yr;
                    if (yr.A09.capacity() >= iA0H) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yr = yr;
                    yr.A09 = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                    yr.A0B = yr.A09.asShortBuffer();
                    c2 = '\b';
                    break;
                case '\b':
                    yr = yr;
                    yr.A08.A0K(yr.A0B);
                    yr.A07 += iA0H;
                    yr.A09.limit(iA0H);
                    yr.A0A = yr.A09;
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    yr = yr;
                    yr.A09.clear();
                    yr.A0B.clear();
                    c2 = '\b';
                    break;
                case 11:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void flush() {
        if (A7Y()) {
            BQ bq = this.A08;
            if (bq == null) {
                this.A08 = new BQ(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                bq.A0I();
            }
        }
        this.A0A = InterfaceC0372Av.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Av
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        this.A09 = InterfaceC0372Av.A00;
        this.A0B = this.A09.asShortBuffer();
        this.A0A = InterfaceC0372Av.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
