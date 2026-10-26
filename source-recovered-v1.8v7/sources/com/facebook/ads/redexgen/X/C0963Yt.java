package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0963Yt implements CC {
    public static byte[] A0F;
    public static final CF A0G;
    public static final int A0H;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public CE A06;
    public C0961Yr A07;
    public C0966Yw A08;
    public boolean A09;
    public final C0544Ii A0C = new C0544Ii(4);
    public final C0544Ii A0B = new C0544Ii(9);
    public final C0544Ii A0E = new C0544Ii(11);
    public final C0544Ii A0D = new C0544Ii();
    public final C0964Yu A0A = new C0964Yu();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_viewInflaterClass);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A0F = new byte[]{77, 71, 93};
    }

    static {
        A03();
        A0G = new C0962Ys();
        A0H = C0560Iy.A08(A01(0, 3, k.AppCompatTheme_windowFixedWidthMinor));
    }

    private C0544Ii A00(CD cd) throws InterruptedException, IOException {
        C0963Yt c0963Yt = this;
        int i = 0;
        char c2 = c0963Yt.A02 > c0963Yt.A0D.A05() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0963Yt = c0963Yt;
                    i = 0;
                    C0544Ii c0544Ii = c0963Yt.A0D;
                    c0544Ii.A0b(new byte[Math.max(c0544Ii.A05() * 2, c0963Yt.A02)], 0);
                    c2 = 3;
                    break;
                case 3:
                    C0963Yt c0963Yt2 = c0963Yt;
                    c0963Yt2.A0D.A0X(c0963Yt2.A02);
                    cd.readFully(c0963Yt2.A0D.A00, i, c0963Yt2.A02);
                    return c0963Yt2.A0D;
                case 4:
                    c0963Yt = c0963Yt;
                    i = 0;
                    c0963Yt.A0D.A0Y(0);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A02() {
        C0963Yt c0963Yt = this;
        long j = 0;
        char c2 = !c0963Yt.A09 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0963Yt = c0963Yt;
                    c0963Yt.A06.ACq(new C0958Yo(-9223372036854775807L));
                    c0963Yt.A09 = true;
                    c2 = 3;
                    break;
                case 3:
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A04 != -9223372036854775807L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A0A.A0D() != -9223372036854775807L) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0963Yt = c0963Yt;
                    j = -c0963Yt.A05;
                    c2 = 6;
                    break;
                case 6:
                    c0963Yt = c0963Yt;
                    c0963Yt.A04 = j;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    j = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    private void A04(CD cd) throws InterruptedException, IOException {
        cd.ADL(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(CD cd) throws InterruptedException, IOException {
        C0963Yt c0963Yt = this;
        int i = 0;
        boolean z = false;
        int iA0E = 0;
        int i2 = 0;
        boolean z2 = false;
        char c2 = !cd.AC8(c0963Yt.A0B.A00, 0, 9, true) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z2;
                case 3:
                    c0963Yt = c0963Yt;
                    c0963Yt.A0B.A0Y(z2 ? 1 : 0);
                    i = 4;
                    c0963Yt.A0B.A0Z(4);
                    iA0E = c0963Yt.A0B.A0E();
                    if ((iA0E & 4) == 0) {
                        c2 = 14;
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
                    if ((iA0E & 1) == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z2 = true;
                    c2 = 7;
                    break;
                case 7:
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A07 != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0963Yt = c0963Yt;
                    c0963Yt.A07 = new C0961Yr(c0963Yt.A06.ADd(8, 1));
                    c2 = '\n';
                    break;
                case '\n':
                    i2 = 2;
                    if (!z2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A08 != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0963Yt = c0963Yt;
                    c0963Yt.A08 = new C0966Yw(c0963Yt.A06.ADd(9, i2));
                    c2 = '\r';
                    break;
                case '\r':
                    C0963Yt c0963Yt2 = c0963Yt;
                    c0963Yt2.A06.A4w();
                    c0963Yt2.A00 = (c0963Yt2.A0B.A08() - 9) + i;
                    c0963Yt2.A01 = i2;
                    return true;
                case 14:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    private boolean A06(CD cd) throws InterruptedException, IOException {
        C0963Yt c0963Yt = this;
        long jA0D = 0;
        boolean z = true;
        char c2 = c0963Yt.A03 == 8 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A07 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0963Yt = c0963Yt;
                    cd = cd;
                    c0963Yt.A02();
                    c0963Yt.A07.A00(c0963Yt.A00(cd), c0963Yt.A04 + c0963Yt.A05);
                    c2 = 4;
                    break;
                case 4:
                    C0963Yt c0963Yt2 = c0963Yt;
                    c0963Yt2.A00 = 4;
                    c0963Yt2.A01 = 2;
                    return z;
                case 5:
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A03 != 9) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A08 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0963Yt = c0963Yt;
                    cd = cd;
                    c0963Yt.A02();
                    c0963Yt.A08.A00(c0963Yt.A00(cd), c0963Yt.A04 + c0963Yt.A05);
                    c2 = 4;
                    break;
                case '\b':
                    c0963Yt = c0963Yt;
                    if (c0963Yt.A03 != 18) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0963Yt = c0963Yt;
                    if (!c0963Yt.A09) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\n':
                    c0963Yt = c0963Yt;
                    cd = cd;
                    c0963Yt.A0A.A00(c0963Yt.A00(cd), c0963Yt.A05);
                    jA0D = c0963Yt.A0A.A0D();
                    if (jA0D == -9223372036854775807L) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0963Yt = c0963Yt;
                    c0963Yt.A06.ACq(new C0958Yo(jA0D));
                    c0963Yt.A09 = true;
                    c2 = 4;
                    break;
                case '\f':
                    c0963Yt = c0963Yt;
                    cd = cd;
                    cd.ADL(c0963Yt.A02);
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    private boolean A07(CD cd) throws InterruptedException, IOException {
        if (!cd.AC8(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A06 = ce;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        C0963Yt c0963Yt = this;
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0963Yt = c0963Yt;
                    i2 = c0963Yt.A01;
                    i = -1;
                    if (i2 == 1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 == 2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i2 == 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i2 != 4) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0963Yt = c0963Yt;
                    cd = cd;
                    if (!c0963Yt.A06(cd)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return 0;
                case '\b':
                    c0963Yt = c0963Yt;
                    cd = cd;
                    if (!c0963Yt.A07(cd)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case '\t':
                    return i;
                case '\n':
                    c0963Yt = c0963Yt;
                    cd = cd;
                    c0963Yt.A04(cd);
                    c2 = 2;
                    break;
                case 11:
                    c0963Yt = c0963Yt;
                    cd = cd;
                    if (!c0963Yt.A05(cd)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case '\f':
                    return i;
                case '\r':
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        C0963Yt c0963Yt = this;
        boolean z = false;
        cd.ABf(c0963Yt.A0C.A00, 0, 3);
        c0963Yt.A0C.A0Y(0);
        char c2 = c0963Yt.A0C.A0G() != A0H ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    c0963Yt = c0963Yt;
                    cd = cd;
                    cd.ABf(c0963Yt.A0C.A00, z ? 1 : 0, 2);
                    c0963Yt.A0C.A0Y(z ? 1 : 0);
                    if ((c0963Yt.A0C.A0I() & 250) == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    c0963Yt = c0963Yt;
                    cd = cd;
                    cd.ABf(c0963Yt.A0C.A00, z ? 1 : 0, 4);
                    c0963Yt.A0C.A0Y(z ? 1 : 0);
                    int iA08 = c0963Yt.A0C.A08();
                    cd.ACg();
                    cd.A3L(iA08);
                    cd.ABf(c0963Yt.A0C.A00, z ? 1 : 0, 4);
                    c0963Yt.A0C.A0Y(z ? 1 : 0);
                    if (c0963Yt.A0C.A08() != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
            }
        }
    }
}
