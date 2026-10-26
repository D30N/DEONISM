package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class ZS implements DI {
    public static byte[] A0H;
    public static final byte[] A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public CO A07;
    public CO A08;
    public CO A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0543Ih A0D;
    public final C0544Ii A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A0H = new byte[]{17, 0, 0, 28, 25, 19, 17, 4, 25, 31, 30, 95, 25, 20, 67, 105, 72, 89, 72, 78, 89, 72, 73, 13, 76, 88, 73, 68, 66, 13, 66, 79, 71, 72, 78, 89, 13, 89, 84, 93, 72, 23, 13, 92, 80, 18, 5, 4, 80, 17, 3, 3, 5, 29, 25, 30, 23, 80, 49, 49, 51, 80, 60, 51, 94, 63, 26, 10, 13, 44, 27, 31, 26, 27, 12, 63, 43, 58, 55, 49, 113, 51, 46, 106, 63, 115, 50, 63, 42, 51};
    }

    static {
        A06();
        A0I = new byte[]{73, 68, 51};
    }

    public ZS(boolean z) {
        this(z, null);
    }

    public ZS(boolean z, String str) {
        this.A0D = new C0543Ih(new byte[7]);
        this.A0E = new C0544Ii(Arrays.copyOf(A0I, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws AF {
        int i = 0;
        int iA04 = 0;
        int iA042 = 0;
        boolean z = false;
        ZS zs = this;
        zs.A0D.A07(0);
        char c2 = !zs.A0C ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    zs = zs;
                    z = true;
                    z = true;
                    iA04 = zs.A0D.A04(2) + 1;
                    if (iA04 == 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    Log.w(A00(65, 10, 74), A00(15, 28, 25) + iA04 + A00(43, 22, 68));
                    iA04 = 2;
                    c2 = 4;
                    break;
                case 4:
                    zs = zs;
                    int iA043 = zs.A0D.A04(4);
                    zs.A0D.A08(z ? 1 : 0);
                    byte[] bArrA07 = IN.A07(iA04, iA043, zs.A0D.A04(3));
                    Pair<Integer, Integer> pairA03 = IN.A03(bArrA07);
                    Format formatA07 = Format.A07(zs.A0A, A00(75, 15, 106), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArrA07), null, 0, zs.A0F);
                    zs.A05 = 1024000000 / formatA07.A0C;
                    zs.A09.A5A(formatA07);
                    zs.A0C = z;
                    c2 = 5;
                    break;
                case 5:
                    zs = zs;
                    zs.A0D.A08(4);
                    iA042 = (zs.A0D.A04(13) - 2) - 5;
                    if (!zs.A0B) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = iA042 - 2;
                    c2 = 7;
                    break;
                case 7:
                    ZS zs2 = zs;
                    A07(zs2.A09, zs2.A05, 0, i);
                    return;
                case '\b':
                    i = iA042;
                    c2 = 7;
                    break;
                case '\t':
                    zs = zs;
                    zs.A0D.A08(10);
                    c2 = 5;
                    break;
            }
        }
    }

    private void A02() {
        this.A08.ACk(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0I.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(CO co, long j, int i, int i2) {
        this.A03 = 3;
        this.A00 = i;
        this.A07 = co;
        this.A04 = j;
        this.A02 = i2;
    }

    private void A08(C0544Ii c0544Ii) {
        ZS zs = this;
        int endOffset = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        byte[] bArr = c0544Ii.A00;
        int iA06 = c0544Ii.A06();
        int iA07 = c0544Ii.A07();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA06 >= iA07) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zs = zs;
                    bArr = bArr;
                    i3 = iA06 + 1;
                    i5 = 255;
                    i6 = bArr[iA06] & 255;
                    endOffset = 512;
                    if (zs.A01 != 512) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i6 < 240) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i6 == i5) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if ((i6 & 1) != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    ZS zs2 = zs;
                    zs2.A0B = z;
                    zs2.A04();
                    c0544Ii.A0Y(i3);
                    return;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
                case '\n':
                    zs = zs;
                    i = zs.A01;
                    i2 = i | i6;
                    if (i2 == 329) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i2 == 511) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i2 == 836) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i2 == 1075) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    i4 = 256;
                    if (i == 256) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    zs = zs;
                    zs.A01 = i4;
                    iA06 = i3 - 1;
                    c2 = 2;
                    break;
                case 16:
                    zs = zs;
                    zs.A01 = endOffset;
                    c2 = 19;
                    break;
                case 17:
                    zs = zs;
                    zs.A01 = 768;
                    c2 = 19;
                    break;
                case 18:
                    zs = zs;
                    zs.A01 = 1024;
                    c2 = 19;
                    break;
                case 19:
                    iA06 = i3;
                    c2 = 2;
                    break;
                case 20:
                    zs.A05();
                    c0544Ii.A0Y(i3);
                    return;
                case 21:
                    c0544Ii.A0Y(iA06);
                    return;
            }
        }
    }

    private void A09(C0544Ii c0544Ii) {
        int iMin = Math.min(c0544Ii.A04(), this.A02 - this.A00);
        this.A07.ACk(c0544Ii, iMin);
        this.A00 += iMin;
        int i = this.A00;
        int i2 = this.A02;
        if (i == i2) {
            this.A07.ACl(this.A06, 1, i2, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C0544Ii c0544Ii, byte[] bArr, int i) {
        boolean z = false;
        int iMin = Math.min(c0544Ii.A04(), i - this.A00);
        c0544Ii.A0c(bArr, this.A00, iMin);
        this.A00 += iMin;
        char c2 = this.A00 == i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) throws AF {
        ZS zs = this;
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zs = zs;
                    i = zs.A03;
                    if (i == 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 7:
                    zs = zs;
                    c0544Ii = c0544Ii;
                    zs.A09(c0544Ii);
                    c2 = 2;
                    break;
                case '\b':
                    zs = zs;
                    if (!zs.A0B) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i2 = 7;
                    c2 = '\n';
                    break;
                case '\n':
                    zs = zs;
                    c0544Ii = c0544Ii;
                    if (!zs.A0A(c0544Ii, zs.A0D.A00, i2)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    zs = zs;
                    zs.A01();
                    c2 = 2;
                    break;
                case '\f':
                    i2 = 5;
                    c2 = '\n';
                    break;
                case '\r':
                    zs = zs;
                    c0544Ii = c0544Ii;
                    if (!zs.A0A(c0544Ii, zs.A0E.A00, 10)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    zs = zs;
                    zs.A02();
                    c2 = 2;
                    break;
                case 15:
                    zs = zs;
                    c0544Ii = c0544Ii;
                    zs.A08(c0544Ii);
                    c2 = 2;
                    break;
                case 16:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        ZS zs = this;
        dw.A05();
        zs.A0A = dw.A04();
        zs.A09 = ce.ADd(dw.A03(), 1);
        char c2 = zs.A0G ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    zs = zs;
                    ce = ce;
                    dw = dw;
                    dw.A05();
                    zs.A08 = ce.ADd(dw.A03(), 4);
                    zs.A08.A5A(Format.A0B(dw.A04(), A00(0, 15, 68), null, -1, null));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    zs = zs;
                    zs.A08 = new C0956Ym();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A06 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        A03();
    }
}
