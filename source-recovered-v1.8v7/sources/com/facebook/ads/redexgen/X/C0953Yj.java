package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0953Yj implements CL {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{109, 25, 21, 70, 92, 79, 80, 70, 8, 27, 23, 83, 66, 69, 86, 67, 94, 88, 89, 68, 98, 68, 10, 39, 43, Byte.MAX_VALUE, 98, 102, 110, 94, 120, 54, 120, 116, 59, 50, 50, 39, 49, 32, 39, 105, 73, 98, Byte.MAX_VALUE, 100, 97, 67, 100, 110, 111, 114, 34, 102, 111, 100, 109, 126, 98, 55};
    }

    public C0953Yj(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        int i = this.A00;
        if (i > 0) {
            this.A05 = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.A05 = 0L;
        }
    }

    public final int A02(long j) {
        return C0560Iy.A0B(this.A04, j, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        C0953Yj c0953Yj = this;
        int iA02 = c0953Yj.A02(j);
        CM cm = new CM(c0953Yj.A04[iA02], c0953Yj.A03[iA02]);
        char c2 = cm.A01 < j ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0953Yj = c0953Yj;
                    if (iA02 != c0953Yj.A00 - 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new CK(cm);
                case 4:
                    C0953Yj c0953Yj2 = c0953Yj;
                    return new CK(cm, new CM(c0953Yj2.A04[iA02 + 1], c0953Yj2.A03[iA02 + 1]));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return true;
    }

    public final String toString() {
        return A00(42, 18, 34) + this.A00 + A00(1, 8, 29) + Arrays.toString(this.A01) + A00(32, 10, k.AppCompatTheme_windowNoTitle) + Arrays.toString(this.A03) + A00(23, 9, 35) + Arrays.toString(this.A04) + A00(9, 14, 31) + Arrays.toString(this.A02) + A00(0, 1, 108);
    }
}
