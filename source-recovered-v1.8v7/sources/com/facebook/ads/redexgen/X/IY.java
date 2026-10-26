package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IY {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-33, -45, 38, 28, 45, 24, -45, 28, 38, -45, 17, 54, 62, 41, 52, 49, 44, -24, 49, 54, 44, 45, 64, -24};
    }

    public IY() {
        this(32);
    }

    public IY(int i) {
        this.A01 = new long[i];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i) {
        IY iy = this;
        char c2 = i >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iy = iy;
                    if (i >= iy.A00) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return iy.A01[i];
                case 4:
                    throw new IndexOutOfBoundsException(A00(10, 14, 99) + i + A00(0, 10, 78) + iy.A00);
            }
        }
    }

    public final void A04(long j) {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            this.A01 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr2[i2] = j;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
