package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0401Cb {
    public static byte[] A03;
    public static final long[] A04;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowActionModeOverlay);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{82, 115, 60, 106, 125, 112, 117, 120, 60, 106, 125, 110, 117, 114, 104, 60, 112, 121, 114, 123, 104, 116, 60, 113, 125, 111, 119, 60, 122, 115, 105, 114, 120};
    }

    static {
        A03();
        A04 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int varIntLength) {
        long[] jArr = null;
        int i = -1;
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    jArr = A04;
                    int i4 = jArr.length;
                    if (i2 >= i4) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    jArr = jArr;
                    if ((jArr[i2] & varIntLength) == 0) {
                        i3 = 6;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    i = i2 + 1;
                    i3 = 5;
                    break;
                case 5:
                    return i;
                case 6:
                    i2++;
                    i3 = 2;
                    break;
            }
        }
    }

    public static long A01(byte[] bArr, int i, boolean z) {
        int i2 = 0;
        long j = bArr[0] & 255;
        char c2 = z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    j &= A04[i - 1] ^ (-1);
                    c2 = 3;
                    break;
                case 3:
                    i2 = 1;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bArr = bArr;
                    j = (j << 8) | (bArr[i2] & 255);
                    i2++;
                    c2 = 4;
                    break;
                case 6:
                    return j;
            }
        }
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(CD cd, boolean z, boolean z2, int i) throws InterruptedException, IOException {
        C0401Cb c0401Cb = this;
        int i2 = 0;
        int i3 = 0;
        char c2 = c0401Cb.A01 == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0401Cb = c0401Cb;
                    cd = cd;
                    i3 = 0;
                    if (!cd.AC8(c0401Cb.A02, 0, 1, z)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return -1L;
                case 4:
                    c0401Cb = c0401Cb;
                    c0401Cb.A00 = A00(c0401Cb.A02[i3] & 255);
                    if (c0401Cb.A00 == -1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0401Cb = c0401Cb;
                    c0401Cb.A01 = 1;
                    c2 = 6;
                    break;
                case 6:
                    c0401Cb = c0401Cb;
                    i2 = c0401Cb.A00;
                    if (i2 <= i) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0401Cb.A01 = i3;
                    return -2L;
                case '\b':
                    if (i2 == 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0401Cb = c0401Cb;
                    cd = cd;
                    cd.readFully(c0401Cb.A02, 1, i2 - 1);
                    c2 = '\n';
                    break;
                case '\n':
                    C0401Cb c0401Cb2 = c0401Cb;
                    c0401Cb2.A01 = i3;
                    return A01(c0401Cb2.A02, c0401Cb2.A00, z2);
                case 11:
                    throw new IllegalStateException(A02(0, 33, 105));
            }
        }
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
