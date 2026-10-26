package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class LY {
    public static byte[] A02;
    public long A00;
    public long A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 95);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{4, 35, 59, 44, 33, 36, 41, 109, 35, 56, 32, 47, 40, 63, 109, 34, 43, 109, 35, 44, 35, 34, 62, 40, 46, 34, 35, 41, 62, 109, 43, 34, 63, 109, 57, 37, 40, 109, 57, 36, 32, 40, 63, 119, 109, 104, 41};
    }

    public LY(long j) {
        if (j >= 0) {
            this.A00 = System.nanoTime() + j;
            this.A01 = j;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 47, 18), Long.valueOf(j)));
    }

    public final synchronized void A02() {
        this.A00 = System.nanoTime();
        notifyAll();
    }

    public final synchronized void A03() {
        this.A00 = System.nanoTime() + this.A01;
    }

    public final synchronized void A04() throws InterruptedException {
        while (!A05()) {
            long jMin = Math.min(this.A00 - System.nanoTime(), 1L);
            wait(jMin / 1000000000, (int) (jMin % 1000000000));
        }
    }

    public final synchronized boolean A05() {
        return System.nanoTime() >= this.A00;
    }
}
