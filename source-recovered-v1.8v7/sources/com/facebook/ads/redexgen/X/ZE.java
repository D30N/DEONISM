package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZE implements D5 {
    public static byte[] A0C;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final D4 A0A = new D4();
    public final D8 A0B;

    static {
        A0A();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A0C = new byte[]{110, 79, 0, 79, 71, 71, 0, 80, 65, 71, 69, 0, 67, 65, 78, 0, 66, 69, 0, 70, 79, 85, 78, 68, 14};
    }

    public ZE(long j, long j2, D8 d8, int i, long j3) {
        IJ.A03(j >= 0 && j2 > j);
        this.A0B = d8;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        ZE ze = this;
        long j4 = 0;
        long j5 = ze.A08;
        long j6 = ze.A09;
        long j7 = j + ((((j5 - j6) * j2) / ze.A07) - j3);
        char c2 = j7 < j6 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    ze = ze;
                    j7 = ze.A09;
                    c2 = 3;
                    break;
                case 3:
                    ze = ze;
                    j4 = ze.A08;
                    if (j7 < j4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    j7 = j4 - 1;
                    c2 = 5;
                    break;
                case 5:
                    return j7;
            }
        }
    }

    private final long A01(long j, CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long jA6n = 0;
        ZE ze = this;
        CD cd3 = cd2;
        long j8 = 2;
        char c2 = ze.A04 == ze.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    long initialPosition = ze.A05;
                    long granuleDistance = -(initialPosition + j8);
                    return granuleDistance;
                case 3:
                    cd2 = cd2;
                    ze = ze;
                    cd3 = cd3;
                    jA6n = cd2.A6n();
                    if (!ze.A0D(cd3, ze.A01)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    ze = ze;
                    j6 = ze.A04;
                    if (j6 == jA6n) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return j6;
                case 6:
                    throw new IOException(A09(0, 25, 5));
                case 7:
                    cd2 = cd2;
                    ze = ze;
                    cd3 = cd3;
                    ze.A0A.A03(cd3, false);
                    cd2.ACg();
                    j4 = j - ze.A0A.A05;
                    i = ze.A0A.A01 + ze.A0A.A00;
                    j3 = 0;
                    if (j4 < 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (j4 <= 72000) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    j2 = 100000;
                    if (j4 >= j3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    ze = ze;
                    ze.A01 = jA6n;
                    ze.A02 = ze.A0A.A05;
                    c2 = 11;
                    break;
                case 11:
                    ze = ze;
                    long j9 = ze.A01;
                    j5 = ze.A04;
                    if (j9 - j5 >= j2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    ze.A01 = j5;
                    return j5;
                case '\r':
                    cd2 = cd2;
                    ze = ze;
                    ze.A04 = cd2.A6n() + i;
                    ze.A05 = ze.A0A.A05;
                    if ((ze.A01 - ze.A04) + i >= j2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    cd3.ADL(i);
                    long initialPosition2 = ze.A05;
                    long granuleDistance2 = -(initialPosition2 + j8);
                    return granuleDistance2;
                case 15:
                    j7 = i;
                    if (j4 > 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    ZE ze2 = ze;
                    long jA6n2 = cd2.A6n();
                    long j10 = ze2.A01;
                    long j11 = ze2.A04;
                    long initialPosition3 = ze2.A02;
                    long granuleDistance3 = ze2.A05;
                    return Math.min(Math.max((jA6n2 - (j7 * j8)) + (((j10 - j11) * j4) / (initialPosition3 - granuleDistance3)), j11), ze2.A01 - 1);
                case 17:
                    j8 = 1;
                    c2 = 16;
                    break;
                case 18:
                    cd3.ADL(i);
                    return -(ze.A0A.A05 + j8);
            }
        }
    }

    private final long A02(CD cd) throws InterruptedException, IOException {
        ZE ze = this;
        ze.A0C(cd);
        ze.A0A.A02();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ze = ze;
                    if ((ze.A0A.A04 & 4) == 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ze = ze;
                    cd = cd;
                    if (cd.A6n() >= ze.A08) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ze = ze;
                    cd = cd;
                    ze.A0A.A03(cd, false);
                    cd.ADL(ze.A0A.A01 + ze.A0A.A00);
                    c2 = 2;
                    break;
                case 5:
                    return ze.A0A.A05;
            }
        }
    }

    private final long A03(CD cd, long j, long j2) throws InterruptedException, IOException {
        ZE ze = this;
        ze.A0A.A03(cd, false);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ze = ze;
                    if (ze.A0A.A05 >= j) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ze = ze;
                    cd = cd;
                    cd.ADL(ze.A0A.A01 + ze.A0A.A00);
                    j2 = ze.A0A.A05;
                    ze.A0A.A03(cd, false);
                    c2 = 2;
                    break;
                case 4:
                    cd.ACg();
                    return j2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.D5
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final ZD A4R() {
        ZE ze = this;
        ZD zd = null;
        char c2 = ze.A07 != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ze = ze;
                    zd = new ZD(ze);
                    c2 = 3;
                    break;
                case 3:
                    return zd;
                case 4:
                    zd = null;
                    c2 = 3;
                    break;
            }
        }
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(CD cd) throws InterruptedException, IOException {
        if (A0D(cd, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(CD cd, long j) throws InterruptedException, IOException {
        byte b2 = 0;
        int i = 0;
        long jMin = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    cd = cd;
                    if (cd.A6n() + length <= jMin) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cd = cd;
                    length = (int) (jMin - cd.A6n());
                    if (length >= 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    cd = cd;
                    bArr = bArr;
                    cd.ABg(bArr, 0, length, false);
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= length - 3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    bArr = bArr;
                    if (bArr[i] != 79) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    bArr = bArr;
                    b2 = 103;
                    if (bArr[i + 1] != 103) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    bArr = bArr;
                    if (bArr[i + 2] != b2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    bArr = bArr;
                    if (bArr[i + 3] != 83) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    cd.ADL(i);
                    return true;
                case '\f':
                    i++;
                    c2 = 6;
                    break;
                case '\r':
                    cd = cd;
                    cd.ADL(length - 3);
                    c2 = 2;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final long AC4(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        ZE ze = this;
        long j = 0;
        long jA01 = 0;
        long j2 = 0;
        long j3 = 0;
        long jA03 = 0;
        long j4 = 0;
        int i = ze.A00;
        char c2 = i != 0 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i != 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return -1L;
                case 6:
                    throw new IllegalStateException();
                case 7:
                    ze = ze;
                    j3 = ze.A06;
                    j4 = 2;
                    j2 = 0;
                    if (j3 != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    jA03 = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    ze.A00 = 3;
                    return -(j4 + jA03);
                case '\n':
                    ze = ze;
                    cd2 = cd2;
                    jA01 = ze.A01(j3, cd2);
                    if (jA01 < j2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return jA01;
                case '\f':
                    ze = ze;
                    cd2 = cd2;
                    jA03 = ze.A03(cd2, ze.A06, -(jA01 + j4));
                    c2 = '\t';
                    break;
                case '\r':
                    ze = ze;
                    cd2 = cd2;
                    ze.A03 = cd2.A6n();
                    ze.A00 = 1;
                    j = ze.A08 - 65307;
                    if (j <= ze.A03) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return j;
                case 15:
                    ZE ze2 = ze;
                    ze2.A07 = ze2.A02(cd2);
                    ze2.A00 = 3;
                    return ze2.A03;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final long ADS(long j) {
        ZE ze = this;
        long jA04 = 0;
        boolean z = false;
        int i = ze.A00;
        char c2 = i != 3 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 2) {
                        c2 = 7;
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
                    IJ.A03(z);
                    jA04 = 0;
                    if (j != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ZE ze2 = ze;
                    ze2.A06 = jA04;
                    ze2.A00 = 2;
                    ze2.A0B();
                    return ze2.A06;
                case 6:
                    ze = ze;
                    jA04 = ze.A0B.A04(j);
                    c2 = 5;
                    break;
                case 7:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
