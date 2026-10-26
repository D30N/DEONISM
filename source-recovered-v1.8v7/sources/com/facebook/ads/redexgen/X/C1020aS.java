package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1020aS implements CO {
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public FT A04;
    public FT A05;
    public FT A06;
    public FU A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final HW A0D;
    public final FS A0C = new FS();
    public final FR A0B = new FR();
    public final C0544Ii A0E = new C0544Ii(32);

    public C1020aS(HW hw) {
        this.A0D = hw;
        this.A0A = hw.A6Q();
        this.A04 = new FT(0L, this.A0A);
        FT ft = this.A04;
        this.A05 = ft;
        this.A06 = ft;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3M(), new FT(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        char c2 = format == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Format) null;
                case 3:
                    if (j == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    format = format;
                    if (format.A0G == Long.MAX_VALUE) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Format format2 = format;
                    format = format2.A0L(format2.A0G + j);
                    c2 = 6;
                    break;
                case 6:
                    return format;
            }
        }
    }

    private void A02(int i) {
        this.A01 += i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        C1020aS c1020aS = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c1020aS = c1020aS;
                    if (j < c1020aS.A05.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aS = c1020aS;
                    c1020aS.A05 = c1020aS.A05.A00;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A04(long j) {
        C1020aS c1020aS = this;
        char c2 = j == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1020aS = c1020aS;
                    if (j < c1020aS.A04.A03) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1020aS = c1020aS;
                    c1020aS.A0D.ACK(c1020aS.A04.A01);
                    c1020aS.A04 = c1020aS.A04.A01();
                    c2 = 3;
                    break;
                case 5:
                    c1020aS = c1020aS;
                    if (c1020aS.A05.A04 >= c1020aS.A04.A04) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1020aS = c1020aS;
                    c1020aS.A05 = c1020aS.A04;
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        C1020aS c1020aS = this;
        c1020aS.A03(j);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aS = c1020aS;
                    byteBuffer = byteBuffer;
                    int iMin = Math.min(i, (int) (c1020aS.A05.A03 - j));
                    byteBuffer.put(c1020aS.A05.A01.A01, c1020aS.A05.A00(j), iMin);
                    i -= iMin;
                    j += iMin;
                    if (j != c1020aS.A05.A03) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1020aS = c1020aS;
                    c1020aS.A05 = c1020aS.A05.A00;
                    c2 = 2;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        C1020aS c1020aS = this;
        c1020aS.A03(j);
        int i2 = i;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aS = c1020aS;
                    bArr = bArr;
                    int iMin = Math.min(i2, (int) (c1020aS.A05.A03 - j));
                    System.arraycopy(c1020aS.A05.A01.A01, c1020aS.A05.A00(j), bArr, i - i2, iMin);
                    i2 -= iMin;
                    j += iMin;
                    if (j != c1020aS.A05.A03) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1020aS = c1020aS;
                    c1020aS.A05 = c1020aS.A05.A00;
                    c2 = 2;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A07(YT yt, FR fr) {
        YT yt2 = yt;
        FR fr2 = fr;
        int[] iArr = null;
        int[] iArr2 = null;
        int i = 0;
        int[] iArr3 = null;
        int[] iArr4 = null;
        int iA0I = 0;
        long j = 0;
        int i2 = 0;
        C1020aS c1020aS = this;
        long j2 = fr2.A01;
        boolean z = true;
        c1020aS.A0E.A0W(1);
        c1020aS.A06(j2, c1020aS.A0E.A00, 1);
        long j3 = j2 + 1;
        byte b2 = c1020aS.A0E.A00[0];
        int subsampleDataLength = (b2 & 128) != 0 ? 2 : 19;
        while (true) {
            switch (subsampleDataLength) {
                case 2:
                    yt2 = yt2;
                    i2 = b2 & Byte.MAX_VALUE;
                    int[] encryptedDataSizes = yt2.A02.A04;
                    if (encryptedDataSizes != null) {
                        subsampleDataLength = 4;
                        break;
                    } else {
                        subsampleDataLength = 3;
                        break;
                    }
                case 3:
                    yt2 = yt2;
                    yt2.A02.A04 = new byte[16];
                    subsampleDataLength = 4;
                    break;
                case 4:
                    c1020aS = c1020aS;
                    yt2 = yt2;
                    c1020aS.A06(j3, yt2.A02.A04, i2);
                    int subsampleDataLength2 = i2;
                    j = j3 + subsampleDataLength2;
                    if (!z) {
                        subsampleDataLength = 18;
                        break;
                    } else {
                        subsampleDataLength = 5;
                        break;
                    }
                case 5:
                    c1020aS = c1020aS;
                    c1020aS.A0E.A0W(2);
                    c1020aS.A06(j, c1020aS.A0E.A00, 2);
                    j += 2;
                    iA0I = c1020aS.A0E.A0I();
                    subsampleDataLength = 6;
                    break;
                case 6:
                    yt2 = yt2;
                    iArr4 = yt2.A02.A06;
                    if (iArr4 == null) {
                        subsampleDataLength = 8;
                        break;
                    } else {
                        subsampleDataLength = 7;
                        break;
                    }
                case 7:
                    iArr4 = iArr4;
                    int subsampleDataLength3 = iArr4.length;
                    if (subsampleDataLength3 >= iA0I) {
                        subsampleDataLength = 17;
                        break;
                    } else {
                        subsampleDataLength = 8;
                        break;
                    }
                case 8:
                    iArr2 = new int[iA0I];
                    subsampleDataLength = 9;
                    break;
                case 9:
                    yt2 = yt2;
                    int[] clearDataSizes = yt2.A02.A07;
                    iArr3 = clearDataSizes;
                    if (iArr3 == null) {
                        subsampleDataLength = 11;
                        break;
                    } else {
                        subsampleDataLength = 10;
                        break;
                    }
                case 10:
                    iArr3 = iArr3;
                    if (iArr3.length >= iA0I) {
                        subsampleDataLength = 16;
                        break;
                    } else {
                        subsampleDataLength = 11;
                        break;
                    }
                case 11:
                    iArr = new int[iA0I];
                    subsampleDataLength = 12;
                    break;
                case 12:
                    if (!z) {
                        subsampleDataLength = 20;
                        break;
                    } else {
                        subsampleDataLength = 13;
                        break;
                    }
                case 13:
                    c1020aS = c1020aS;
                    int i3 = iA0I * 6;
                    c1020aS.A0E.A0W(i3);
                    c1020aS.A06(j, c1020aS.A0E.A00, i3);
                    j += i3;
                    c1020aS.A0E.A0Y(0);
                    i = 0;
                    subsampleDataLength = 14;
                    break;
                case 14:
                    if (i >= iA0I) {
                        subsampleDataLength = 21;
                        break;
                    } else {
                        subsampleDataLength = 15;
                        break;
                    }
                case 15:
                    c1020aS = c1020aS;
                    iArr2 = iArr2;
                    iArr = iArr;
                    iArr2[i] = c1020aS.A0E.A0I();
                    iArr[i] = c1020aS.A0E.A0H();
                    i++;
                    subsampleDataLength = 14;
                    break;
                case 16:
                    iArr3 = iArr3;
                    iArr = iArr3;
                    subsampleDataLength = 12;
                    break;
                case 17:
                    iArr4 = iArr4;
                    iArr2 = iArr4;
                    subsampleDataLength = 9;
                    break;
                case 18:
                    iA0I = 1;
                    subsampleDataLength = 6;
                    break;
                case 19:
                    z = false;
                    subsampleDataLength = 2;
                    break;
                case 20:
                    fr2 = fr2;
                    iArr2 = iArr2;
                    iArr = iArr;
                    iArr2[0] = 0;
                    int subsampleDataLength4 = fr2.A00;
                    int subsampleDataLength5 = (int) (j - fr2.A01);
                    iArr[0] = subsampleDataLength4 - subsampleDataLength5;
                    subsampleDataLength = 21;
                    break;
                case 21:
                    YT yt3 = yt2;
                    FR fr3 = fr2;
                    CN cn = fr3.A02;
                    BU bu = yt3.A02;
                    byte[] bArr = cn.A03;
                    byte[] bArr2 = yt3.A02.A04;
                    int i4 = cn.A01;
                    int i5 = cn.A02;
                    int subsampleDataLength6 = cn.A00;
                    bu.A03(iA0I, iArr2, iArr, bArr, bArr2, i4, i5, subsampleDataLength6);
                    int i6 = (int) (j - fr3.A01);
                    fr3.A01 += i6;
                    int subsampleDataLength7 = fr3.A00;
                    fr3.A00 = subsampleDataLength7 - i6;
                    return;
            }
        }
    }

    private void A08(FT ft) {
        C1020aS c1020aS = this;
        FT ftA01 = null;
        int i = 0;
        HV[] hvArr = null;
        char c2 = !ft.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1020aS = c1020aS;
                    ft = ft;
                    hvArr = new HV[(c1020aS.A06.A02 ? 1 : 0) + (((int) (c1020aS.A06.A04 - ft.A04)) / c1020aS.A0A)];
                    ftA01 = ft;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    hvArr = hvArr;
                    if (i >= hvArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hvArr = hvArr;
                    FT ft2 = ftA01;
                    hvArr[i] = ft2.A01;
                    ftA01 = ft2.A01();
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    c1020aS.A0D.ACL(hvArr);
                    return;
            }
        }
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new FT(0L, this.A0A);
        FT ft = this.A04;
        this.A05 = ft;
        this.A06 = ft;
        this.A01 = 0L;
        this.A0D.ADe();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(A9 a9, YT yt, boolean z, boolean z2, long j) {
        YT yt2 = yt;
        C1020aS c1020aS = this;
        int i = 0;
        int i2 = 0;
        int iA09 = c1020aS.A0C.A09(a9, yt2, z, z2, c1020aS.A02, c1020aS.A0B);
        char c2 = iA09 != -5 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    i2 = -4;
                    if (iA09 == -4) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = -3;
                    if (iA09 != -3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i;
                case 5:
                    throw new IllegalStateException();
                case 6:
                    yt2 = yt2;
                    if (!yt2.A04()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 7:
                    yt2 = yt2;
                    if (yt2.A00 >= j) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    yt2 = yt2;
                    yt2.A00(RecyclerView.UNDEFINED_DURATION);
                    c2 = '\t';
                    break;
                case '\t':
                    yt2 = yt2;
                    if (!yt2.A0A()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1020aS = c1020aS;
                    yt2 = yt2;
                    c1020aS.A07(yt2, c1020aS.A0B);
                    c2 = 11;
                    break;
                case 11:
                    c1020aS = c1020aS;
                    yt2 = yt2;
                    yt2.A09(c1020aS.A0B.A00);
                    c1020aS.A05(c1020aS.A0B.A01, yt2.A01, c1020aS.A0B.A00);
                    c2 = '\f';
                    break;
                case '\f':
                    return i2;
                case '\r':
                    c1020aS.A02 = a9.A00;
                    return -5;
            }
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(FU fu) {
        this.A07 = fu;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void A5A(Format format) {
        Format formatA01 = A01(format, this.A00);
        boolean zA0K = this.A0C.A0K(formatA01);
        this.A03 = format;
        this.A08 = false;
        FU fu = this.A07;
        char c2 = fu != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!zA0K) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    formatA01 = formatA01;
                    fu = fu;
                    fu.ABI(formatA01);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final int ACj(CD cd, int i, boolean z) throws InterruptedException, IOException {
        int i2 = cd.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        char c2 = i2 == -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    throw new EOFException();
                case 5:
                    A02(i2);
                    return i2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void ACk(C0544Ii c0544Ii, int i) {
        C1020aS c1020aS = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aS = c1020aS;
                    c0544Ii = c0544Ii;
                    int iA00 = c1020aS.A00(i);
                    c0544Ii.A0c(c1020aS.A06.A01.A01, c1020aS.A06.A00(c1020aS.A01), iA00);
                    i -= iA00;
                    c1020aS.A02(iA00);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void ACl(long j, int i, int i2, int i3, CN cn) {
        C1020aS c1020aS = this;
        char c2 = c1020aS.A08 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1020aS = c1020aS;
                    c1020aS.A5A(c1020aS.A03);
                    c2 = 3;
                    break;
                case 3:
                    c1020aS = c1020aS;
                    if (!c1020aS.A09) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if ((i & 1) == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1020aS = c1020aS;
                    if (!c1020aS.A0C.A0J(j)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    c1020aS = c1020aS;
                    c1020aS.A09 = false;
                    c2 = '\b';
                    break;
                case '\b':
                    C1020aS c1020aS2 = c1020aS;
                    long timeUs = j + c1020aS2.A00;
                    c1020aS2.A0C.A0G(timeUs, i, (c1020aS2.A01 - i2) - i3, i2, cn);
                    return;
            }
        }
    }
}
