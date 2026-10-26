package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZL extends D8 {
    public static byte[] A05;
    public int A00;
    public DA A01;
    public DC A02;
    public DE A03;
    public boolean A04;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A05 = new byte[]{125, 105, 120, 117, 115, 51, 106, 115, 110, 126, 117, 111};
    }

    public static int A00(byte b2, int i, int i2) {
        return (b2 >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b2, DA da) {
        int i = 0;
        char c2 = !da.A04[A00(b2, da.A00, 1)].A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    da = da;
                    i = da.A02.A03;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    da = da;
                    i = da.A02.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    private final DA A02(C0544Ii c0544Ii) throws IOException {
        if (this.A03 == null) {
            this.A03 = DF.A04(c0544Ii);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = DF.A03(c0544Ii);
            return null;
        }
        byte[] bArr = new byte[c0544Ii.A07()];
        System.arraycopy(c0544Ii.A00, 0, bArr, 0, c0544Ii.A07());
        return new DA(this.A03, this.A02, bArr, DF.A0C(c0544Ii, this.A03.A05), DF.A00(r4.length - 1));
    }

    public static void A05(C0544Ii c0544Ii, long j) {
        c0544Ii.A0X(c0544Ii.A07() + 4);
        c0544Ii.A00[c0544Ii.A07() - 4] = (byte) (j & 255);
        c0544Ii.A00[c0544Ii.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0544Ii.A00[c0544Ii.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0544Ii.A00[c0544Ii.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0544Ii c0544Ii) {
        try {
            return DF.A0A(1, c0544Ii, true);
        } catch (AF unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long A07(C0544Ii c0544Ii) {
        ZL zl = this;
        int iA01 = 0;
        int i = 0;
        char c2 = (c0544Ii.A00[0] & 1) == 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1L;
                case 3:
                    zl = zl;
                    c0544Ii = c0544Ii;
                    iA01 = A01(c0544Ii.A00[i], zl.A01);
                    if (!zl.A04) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zl = zl;
                    i = (zl.A00 + iA01) / 4;
                    c2 = 5;
                    break;
                case 5:
                    ZL zl2 = zl;
                    A05(c0544Ii, i);
                    zl2.A04 = true;
                    zl2.A00 = iA01;
                    return i;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final void A08(long j) {
        ZL zl = this;
        DE de = null;
        boolean z = false;
        super.A08(j);
        int i = 0;
        char c2 = j != 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    zl = zl;
                    zl.A04 = z;
                    de = zl.A03;
                    if (de == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    de = de;
                    i = de.A03;
                    c2 = 5;
                    break;
                case 5:
                    zl.A00 = i;
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean A0A(C0544Ii c0544Ii, long j, D7 d7) throws InterruptedException, IOException {
        C0544Ii c0544Ii2 = c0544Ii;
        ZL zl = this;
        boolean z = false;
        ZL zl2 = zl;
        char c2 = zl2.A01 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    zl = zl;
                    c0544Ii2 = c0544Ii2;
                    zl2 = zl2;
                    zl2.A01 = zl.A02(c0544Ii2);
                    z = true;
                    if (zl2.A01 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    ZL zl3 = zl2;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zl3.A01.A02.A09);
                    arrayList.add(zl3.A01.A03);
                    d7.A00 = Format.A07(null, A03(0, 12, 10), null, zl3.A01.A02.A02, -1, zl3.A01.A02.A05, (int) zl3.A01.A02.A06, arrayList, null, 0, null);
                    return z;
            }
        }
    }
}
