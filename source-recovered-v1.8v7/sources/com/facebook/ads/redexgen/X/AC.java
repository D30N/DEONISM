package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class AC {
    public static byte[] A0F;
    public long A00;
    public AC A01;
    public AD A02;
    public TrackGroupArray A03;
    public HU A04;
    public boolean A05;
    public boolean A06;
    public HU A07;
    public final InterfaceC1019aR A08;
    public final Object A09;
    public final FV[] A0A;
    public final boolean[] A0B;
    public final FA A0C;
    public final HT A0D;
    public final AU[] A0E;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0F = new byte[]{-97, -73, -74, -69, -77, -94, -73, -60, -69, -63, -74, -102, -63, -66, -74, -73, -60, -18, 3, 16, 7, 13, 2, -66, 16, 3, 10, 3, -1, 17, 3, -66, 4, -1, 7, 10, 3, 2, -52};
    }

    public AC(AU[] auArr, long j, HT ht, HW hw, FA fa, Object obj, AD ad) {
        this.A0E = auArr;
        this.A00 = j - ad.A03;
        this.A0D = ht;
        this.A0C = fa;
        this.A09 = IJ.A01(obj);
        this.A02 = ad;
        this.A0A = new FV[auArr.length];
        this.A0B = new boolean[auArr.length];
        InterfaceC1019aR interfaceC1019aRA4P = fa.A4P(ad.A04, hw);
        this.A08 = ad.A02 != Long.MIN_VALUE ? new C8(interfaceC1019aRA4P, true, 0L, ad.A02) : interfaceC1019aRA4P;
    }

    private void A02(HU hu) {
        HQ hqA00 = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    hu = hu;
                    if (i >= hu.A00) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hu = hu;
                    boolean zA00 = hu.A00(i);
                    hqA00 = hu.A01.A00(i);
                    if (!zA00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hqA00 = hqA00;
                    if (hqA00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hqA00 = hqA00;
                    hqA00.A4s();
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A03(HU hu) {
        AC ac = this;
        HU hu2 = null;
        char c2 = ac.A07 != null ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    hu = hu;
                    ac.A07 = hu;
                    hu2 = ac.A07;
                    if (hu2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ac = ac;
                    hu2 = hu2;
                    ac.A02(hu2);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A04(FV[] fvArr) {
        AC ac = this;
        AU[] auArr = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    auArr = ac.A0E;
                    if (i >= auArr.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    auArr = auArr;
                    if (auArr[i].A7D() != 5) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ac = ac;
                    if (!ac.A04.A00(i)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fvArr = fvArr;
                    fvArr[i] = new C1013aL();
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A05(FV[] fvArr) {
        AC ac = this;
        AU[] auArr = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    auArr = ac.A0E;
                    if (i >= auArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    auArr = auArr;
                    if (auArr[i].A7D() != 5) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fvArr = fvArr;
                    fvArr[i] = null;
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final long A06() {
        AC ac = this;
        long jA6a = 0;
        char c2 = !ac.A06 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jA6a = 0;
                    c2 = 3;
                    break;
                case 3:
                    return jA6a;
                case 4:
                    ac = ac;
                    jA6a = ac.A08.A6a();
                    c2 = 3;
                    break;
            }
        }
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j) {
        return j - A07();
    }

    public final long A09(long j) {
        return A07() + j;
    }

    public final long A0A(long j, boolean z) {
        return A0B(j, z, new boolean[this.A0E.length]);
    }

    public final long A0B(long j, boolean z, boolean[] zArr) {
        boolean[] zArr2 = zArr;
        AC ac = this;
        boolean z2 = false;
        FV[] fvArr = null;
        int i = 0;
        boolean z3 = false;
        HR hr = null;
        boolean[] zArr3 = null;
        long jACu = 0;
        boolean z4 = false;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    z4 = false;
                    z2 = true;
                    if (i2 >= ac.A04.A00) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ac = ac;
                    zArr3 = ac.A0B;
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    ac = ac;
                    if (!ac.A04.A02(ac.A07, i2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z4 = true;
                    c2 = 6;
                    break;
                case 6:
                    zArr3 = zArr3;
                    zArr3[i2] = z4;
                    i2++;
                    c2 = 2;
                    break;
                case 7:
                    ac = ac;
                    zArr2 = zArr2;
                    z4 = false;
                    ac.A05(ac.A0A);
                    ac.A03(ac.A04);
                    hr = ac.A04.A01;
                    jACu = ac.A08.ACu(hr.A01(), ac.A0B, ac.A0A, zArr2, j);
                    ac.A04(ac.A0A);
                    ac.A05 = false;
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    ac = ac;
                    fvArr = ac.A0A;
                    if (i >= fvArr.length) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    fvArr = fvArr;
                    if (fvArr[i] == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    ac = ac;
                    IJ.A04(ac.A04.A00(i));
                    if (ac.A0E[i].A7D() == 5) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    ac = ac;
                    ac.A05 = z2;
                    c2 = '\f';
                    break;
                case '\f':
                    i++;
                    c2 = '\b';
                    break;
                case '\r':
                    hr = hr;
                    if (hr.A00(i) != null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    z3 = true;
                    c2 = 15;
                    break;
                case 15:
                    IJ.A04(z3);
                    c2 = '\f';
                    break;
                case 16:
                    z3 = false;
                    c2 = 15;
                    break;
                case 17:
                    return jACu;
            }
        }
    }

    public final long A0C(boolean z) {
        AC ac = this;
        long j = 0;
        long jA5Y = 0;
        char c2 = !ac.A06 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ac.A02.A03;
                case 3:
                    ac = ac;
                    jA5Y = ac.A08.A5Y();
                    if (jA5Y != Long.MIN_VALUE) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ac = ac;
                    j = ac.A02.A01;
                    c2 = 6;
                    break;
                case 6:
                    return j;
                case 7:
                    j = jA5Y;
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A0D() {
        AC ac = this;
        ac.A03(null);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        ac = ac;
                        if (ac.A02.A02 == Long.MIN_VALUE) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    } catch (RuntimeException e) {
                        Log.e(A00(0, 17, 2), A00(17, 22, 78), e);
                        return;
                    }
                case 5:
                    AC ac2 = ac;
                    ac2.A0C.ACO(((C8) ac2.A08).A05);
                    return;
                case '\n':
                    AC ac3 = ac;
                    ac3.A0C.ACO(ac3.A08);
                    return;
            }
        }
    }

    public final void A0E(float f) throws C03479w {
        this.A06 = true;
        this.A03 = this.A08.A7C();
        A0I(f);
        long jA0A = A0A(this.A02.A03, false);
        this.A00 += this.A02.A03 - jA0A;
        this.A02 = this.A02.A01(jA0A);
    }

    public final void A0F(long j) {
        this.A08.A49(A08(j));
    }

    public final void A0G(long j) {
        if (this.A06) {
            this.A08.ACF(A08(j));
        }
    }

    public final boolean A0H() {
        AC ac = this;
        boolean z = false;
        char c2 = ac.A06 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    if (!ac.A05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ac = ac;
                    if (ac.A08.A5Y() != Long.MIN_VALUE) {
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

    public final boolean A0I(float f) throws C03479w {
        AC ac = this;
        HQ hq = null;
        int length = 0;
        HQ[] hqArrA01 = null;
        HU huA0T = ac.A0D.A0T(ac.A0E, ac.A03);
        int i = 0;
        char c2 = huA0T.A01(ac.A07) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    ac = ac;
                    huA0T = huA0T;
                    ac.A04 = huA0T;
                    hqArrA01 = ac.A04.A01.A01();
                    length = hqArrA01.length;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hqArrA01 = hqArrA01;
                    hq = hqArrA01[i];
                    if (hq == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hq = hq;
                    hq.AAZ(f);
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return true;
            }
        }
    }
}
