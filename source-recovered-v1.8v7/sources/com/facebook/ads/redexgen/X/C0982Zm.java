package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0982Zm implements CC {
    public static byte[] A05;
    public static final CF A06;
    public int A00;
    public int A01;
    public CE A02;
    public CO A03;
    public C0983Zn A04;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{-42, -17, -12, -10, -15, -15, -16, -13, -11, -26, -27, -95, -16, -13, -95, -10, -17, -13, -26, -28, -16, -24, -17, -22, -5, -26, -27, -95, -8, -30, -9, -95, -23, -26, -30, -27, -26, -13, -81, -13, 7, -10, -5, 1, -63, 4, -13, 9};
    }

    static {
        A01();
        A06 = new C0981Zl();
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A02 = ce;
        this.A03 = ce.ADd(0, 1);
        this.A04 = null;
        ce.A4w();
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        CD cd2 = cd;
        C0982Zm c0982Zm = this;
        int i = 0;
        int i2 = 0;
        int iACj = 0;
        C0983Zn c0983Zn = null;
        char c2 = c0982Zm.A04 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0982Zm = c0982Zm;
                    cd2 = cd2;
                    c0982Zm.A04 = DZ.A00(cd2);
                    c0983Zn = c0982Zm.A04;
                    if (c0983Zn == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0982Zm = c0982Zm;
                    c0983Zn = c0983Zn;
                    c0982Zm.A03.A5A(Format.A06(null, A00(39, 9, 104), null, c0983Zn.A00(), 32768, c0982Zm.A04.A03(), c0982Zm.A04.A04(), c0982Zm.A04.A02(), null, null, 0, null));
                    c0982Zm.A00 = c0982Zm.A04.A01();
                    c2 = 4;
                    break;
                case 4:
                    c0982Zm = c0982Zm;
                    if (!c0982Zm.A04.A07()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c0982Zm = c0982Zm;
                    cd2 = cd2;
                    DZ.A03(cd2, c0982Zm.A04);
                    c0982Zm.A02.ACq(c0982Zm.A04);
                    c2 = 6;
                    break;
                case 6:
                    c0982Zm = c0982Zm;
                    cd2 = cd2;
                    iACj = c0982Zm.A03.ACj(cd2, 32768 - c0982Zm.A01, true);
                    i = -1;
                    if (iACj == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0982Zm = c0982Zm;
                    c0982Zm.A01 += iACj;
                    c2 = '\b';
                    break;
                case '\b':
                    c0982Zm = c0982Zm;
                    i2 = c0982Zm.A01 / c0982Zm.A00;
                    if (i2 <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0982Zm = c0982Zm;
                    cd2 = cd2;
                    long jA05 = c0982Zm.A04.A05(cd2.A6n() - c0982Zm.A01);
                    int i3 = c0982Zm.A00 * i2;
                    c0982Zm.A01 -= i3;
                    c0982Zm.A03.ACl(jA05, 1, i3, c0982Zm.A01, null);
                    c2 = '\n';
                    break;
                case '\n':
                    if (iACj != i) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return i;
                case '\f':
                    i = 0;
                    c2 = 11;
                    break;
                case '\r':
                    throw new AF(A00(0, 39, 87));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        boolean z = false;
        char c2 = DZ.A00(cd) != null ? (char) 2 : (char) 4;
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
}
