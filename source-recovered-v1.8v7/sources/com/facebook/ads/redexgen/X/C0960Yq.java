package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0960Yq implements CC {
    public static byte[] A07;
    public static final CF A08;
    public static final int A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public int A00;
    public int A01;
    public long A02;
    public CO A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A07 = new byte[]{27, 60, 36, 51, 62, 59, 54, 114, 34, 51, 54, 54, 59, 60, 53, 114, 48, 59, 38, 33, 114, 52, 61, 32, 114, 52, 32, 51, 63, 55, 114, 58, 55, 51, 54, 55, 32, 114, 2, 39, 39, 46, 44, 42, 39, 107, 10, 6, 25, 107, 13, 15, 111, 99, 124, 36, 34, 100, 112, 99, 111, 103, 34, 118, 123, 114, 103, 34, 64, 66, 34, 46, 49, 78, 52, 33, 105, 28, 8, 25, 20, 18, 82, 28, 16, 15, 80, 10, 31, 81, 93, 84, 120, 98, 123, 115, 55, 121, 120, 99, 55, 113, 126, 121, 115, 55, 86, 90, 69, 55, Byte.MAX_VALUE, 114, 118, 115, 114, 101, 57, 70, 82, 67, 78, 72, 8, 20, 64, 87, 87, 62, 43};
    }

    static {
        A05();
        A08 = new C0959Yp();
        A0C = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0D = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0A = C0560Iy.A0l(A03(50, 6, 104));
        A0B = C0560Iy.A0l(A03(68, 9, 37));
        A09 = A0D[8];
    }

    private int A00(int i) throws AF {
        if (A07(i)) {
            return this.A05 ? A0D[i] : A0C[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A03(38, 12, 13));
        sb.append(this.A05 ? A03(127, 2, 47) : A03(89, 2, 89));
        sb.append(A03(56, 12, 68));
        sb.append(i);
        throw new AF(sb.toString());
    }

    private int A01(CD cd) throws InterruptedException, IOException {
        cd.ACg();
        cd.ABf(this.A06, 0, 1);
        byte b2 = this.A06[0];
        if ((b2 & 131) <= 0) {
            return A00((b2 >> 3) & 15);
        }
        throw new AF(A03(0, 38, 20) + ((int) b2));
    }

    private int A02(CD cd) throws InterruptedException, IOException {
        C0960Yq c0960Yq = this;
        int iACj = 0;
        char c2 = c0960Yq.A00 == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0960Yq = c0960Yq;
                        cd = cd;
                        c0960Yq.A01 = c0960Yq.A01(cd);
                        c0960Yq.A00 = c0960Yq.A01;
                        c2 = 6;
                        break;
                    } catch (EOFException unused) {
                        return -1;
                    }
                case 6:
                    c0960Yq = c0960Yq;
                    cd = cd;
                    iACj = c0960Yq.A03.ACj(cd, c0960Yq.A00, true);
                    if (iACj != -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return -1;
                case '\b':
                    c0960Yq = c0960Yq;
                    c0960Yq.A00 -= iACj;
                    if (c0960Yq.A00 <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return 0;
                case '\n':
                    C0960Yq c0960Yq2 = c0960Yq;
                    c0960Yq2.A03.ACl(c0960Yq2.A02, 1, c0960Yq2.A01, 0, null);
                    c0960Yq2.A02 += 20000;
                    return 0;
            }
        }
    }

    private void A04() {
        C0960Yq c0960Yq = this;
        int i = 0;
        String mimeType = null;
        String strA03 = null;
        int sampleRate = !c0960Yq.A04 ? 2 : 7;
        while (true) {
            switch (sampleRate) {
                case 2:
                    c0960Yq = c0960Yq;
                    c0960Yq.A04 = true;
                    if (!c0960Yq.A05) {
                        sampleRate = 9;
                        break;
                    } else {
                        sampleRate = 3;
                        break;
                    }
                case 3:
                    strA03 = A03(77, 12, 59);
                    sampleRate = 4;
                    break;
                case 4:
                    c0960Yq = c0960Yq;
                    strA03 = strA03;
                    mimeType = strA03;
                    if (!c0960Yq.A05) {
                        sampleRate = 8;
                        break;
                    } else {
                        sampleRate = 5;
                        break;
                    }
                case 5:
                    i = 16000;
                    sampleRate = 6;
                    break;
                case 6:
                    c0960Yq = c0960Yq;
                    mimeType = mimeType;
                    c0960Yq.A03.A5A(Format.A06(null, mimeType, null, -1, A09, 1, i, -1, null, null, 0, null));
                    sampleRate = 7;
                    break;
                case 7:
                    return;
                case 8:
                    i = 8000;
                    sampleRate = 6;
                    break;
                case 9:
                    strA03 = A03(k.AppCompatTheme_windowActionModeOverlay, 10, 97);
                    sampleRate = 4;
                    break;
            }
        }
    }

    private boolean A06(int i) {
        boolean z = false;
        char c2 = !this.A05 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i < 12) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i <= 14) {
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

    private boolean A07(int i) {
        C0960Yq c0960Yq = this;
        boolean z = false;
        char c2 = i >= 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (i > 15) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0960Yq = c0960Yq;
                    if (!c0960Yq.A08(i)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c0960Yq = c0960Yq;
                    if (!c0960Yq.A06(i)) {
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

    private boolean A08(int i) {
        boolean z = false;
        char c2 = this.A05 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i < 10) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i <= 13) {
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

    private boolean A09(CD cd) throws InterruptedException, IOException {
        C0960Yq c0960Yq = this;
        char c2 = c0960Yq.A0A(cd, A0A) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0960Yq.A05 = false;
                    cd.ADL(A0A.length);
                    return true;
                case 3:
                    c0960Yq = c0960Yq;
                    cd = cd;
                    if (!c0960Yq.A0A(cd, A0B)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0960Yq.A05 = true;
                    cd.ADL(A0B.length);
                    return true;
                case 5:
                    return false;
            }
        }
    }

    private boolean A0A(CD cd, byte[] bArr) throws InterruptedException, IOException {
        cd.ACg();
        byte[] bArr2 = new byte[bArr.length];
        cd.ABf(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        ce.ACq(new C0958Yo(-9223372036854775807L));
        this.A03 = ce.ADd(0, 1);
        ce.A4w();
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        C0960Yq c0960Yq = this;
        char c2 = cd.A6n() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0960Yq = c0960Yq;
                    cd = cd;
                    if (!c0960Yq.A09(cd)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    C0960Yq c0960Yq2 = c0960Yq;
                    c0960Yq2.A04();
                    return c0960Yq2.A02(cd);
                case 4:
                    throw new AF(A03(91, 26, 81));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        return A09(cd);
    }
}
