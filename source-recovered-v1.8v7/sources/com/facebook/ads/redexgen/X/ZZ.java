package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZZ implements DI {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public CO A03;
    public boolean A04;
    public final C0544Ii A05 = new C0544Ii(10);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{24, 9, 9, 21, 16, 26, 24, 13, 16, 22, 23, 86, 16, 29, 74, 6, 43, 124, 29, 42, 46, 43, 42, 61, 32, 13, 23, 7, 5, 22, 0, 13, 10, 3, 68, 13, 10, 18, 5, 8, 13, 0, 68, 45, 32, 87, 68, 16, 5, 3};
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        ZZ zz = this;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int iA04 = 0;
        char c2 = !zz.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    zz = zz;
                    c0544Ii = c0544Ii;
                    iA04 = c0544Ii.A04();
                    i2 = zz.A00;
                    i = 10;
                    if (i2 >= 10) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zz = zz;
                    c0544Ii = c0544Ii;
                    int iMin = Math.min(iA04, 10 - i2);
                    System.arraycopy(c0544Ii.A00, c0544Ii.A06(), zz.A05.A00, zz.A00, iMin);
                    if (zz.A00 + iMin != i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zz = zz;
                    z = false;
                    zz.A05.A0Y(0);
                    if (73 != zz.A05.A0E()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    zz = zz;
                    if (68 != zz.A05.A0E()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    zz = zz;
                    if (51 == zz.A05.A0E()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    Log.w(A00(15, 9, 47), A00(24, 26, 4));
                    zz.A04 = z;
                    return;
                case '\t':
                    zz = zz;
                    zz.A05.A0Z(3);
                    zz.A01 = zz.A05.A0D() + i;
                    c2 = '\n';
                    break;
                case '\n':
                    ZZ zz2 = zz;
                    int iMin2 = Math.min(iA04, zz2.A01 - zz2.A00);
                    zz2.A03.ACk(c0544Ii, iMin2);
                    zz2.A00 += iMin2;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A03 = ce.ADd(dw.A03(), 4);
        this.A03.A5A(Format.A0B(dw.A04(), A00(0, 15, 25), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
        ZZ zz = this;
        int i = 0;
        char c2 = zz.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    zz = zz;
                    i = zz.A01;
                    if (i == 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zz = zz;
                    if (zz.A00 == i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    ZZ zz2 = zz;
                    zz2.A03.ACl(zz2.A02, 1, i, 0, null);
                    zz2.A04 = false;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        this.A04 = false;
    }
}
