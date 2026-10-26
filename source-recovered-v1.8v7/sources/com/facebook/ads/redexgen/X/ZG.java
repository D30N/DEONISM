package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class ZG extends D8 {
    public static byte[] A02;
    public ZF A00;
    public IV A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{23, 3, 18, 31, 25, 89, 16, 26, 23, 21};
    }

    private int A00(C0544Ii c0544Ii) {
        char c2;
        int iA0I = 0;
        int i = (c0544Ii.A00[2] & 255) >> 4;
        switch (i) {
            case 1:
                c2 = 3;
                break;
            case 2:
                c2 = 4;
                break;
            case 3:
                c2 = 4;
                break;
            case 4:
                c2 = 4;
                break;
            case 5:
                c2 = 4;
                break;
            case 6:
                c2 = 5;
                break;
            case 7:
                c2 = 5;
                break;
            case 8:
                c2 = '\t';
                break;
            case 9:
                c2 = '\t';
                break;
            case 10:
                c2 = '\t';
                break;
            case 11:
                c2 = '\t';
                break;
            case 12:
                c2 = '\t';
                break;
            case 13:
                c2 = '\t';
                break;
            case 14:
                c2 = '\t';
                break;
            case 15:
                c2 = '\t';
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    return 192;
                case 4:
                    return 576 << (i - 2);
                case 5:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(4);
                    c0544Ii.A0O();
                    if (i != 6) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    iA0I = c0544Ii.A0E();
                    c2 = 7;
                    break;
                case 7:
                    c0544Ii.A0Y(0);
                    return iA0I + 1;
                case '\b':
                    c0544Ii = c0544Ii;
                    iA0I = c0544Ii.A0I();
                    c2 = 7;
                    break;
                case '\t':
                    return 256 << (i - 8);
            }
        }
    }

    public static boolean A04(C0544Ii c0544Ii) {
        boolean z = false;
        char c2 = c0544Ii.A04() >= 5 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != 127) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0M() != 1179402563) {
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

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long A07(C0544Ii c0544Ii) {
        if (!A05(c0544Ii.A00)) {
            return -1L;
        }
        return A00(c0544Ii);
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean A0A(C0544Ii c0544Ii, long j, D7 d7) throws InterruptedException, IOException {
        D7 d72 = d7;
        C0544Ii c0544Ii2 = c0544Ii;
        boolean z = false;
        ZF zf = null;
        ZG zg = this;
        C0544Ii c0544Ii3 = c0544Ii2;
        byte[] bArr = c0544Ii3.A00;
        char c2 = zg.A01 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    zg = zg;
                    d72 = d72;
                    bArr = bArr;
                    zg.A01 = new IV(bArr, 17);
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, c0544Ii2.A07());
                    bArrCopyOfRange[4] = Byte.MIN_VALUE;
                    d72.A00 = Format.A07(null, A02(0, 10, 104), null, -1, zg.A01.A00(), zg.A01.A01, zg.A01.A06, Collections.singletonList(bArrCopyOfRange), null, 0, null);
                    c2 = 3;
                    break;
                case 3:
                    return true;
                case 4:
                    bArr = bArr;
                    z = false;
                    if ((bArr[0] & Byte.MAX_VALUE) != 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zg = zg;
                    c0544Ii3 = c0544Ii3;
                    zg.A00 = new ZF(zg);
                    zg.A00.A01(c0544Ii3);
                    c2 = 3;
                    break;
                case 6:
                    bArr = bArr;
                    if (!A05(bArr)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    zg = zg;
                    zf = zg.A00;
                    if (zf == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    zg = zg;
                    d72 = d72;
                    zf = zf;
                    zf.A00(j);
                    d72.A01 = zg.A00;
                    c2 = '\t';
                    break;
                case '\t':
                    return z;
            }
        }
    }
}
