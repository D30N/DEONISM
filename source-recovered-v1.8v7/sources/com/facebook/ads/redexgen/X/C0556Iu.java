package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0556Iu {
    public long A00;
    public long A01;
    public volatile long A02 = -9223372036854775807L;

    public C0556Iu(long j) {
        A02(j);
    }

    public static long A00(long j) {
        return (1000000 * j) / 90000;
    }

    public static long A01(long j) {
        return (90000 * j) / 1000000;
    }

    private final synchronized void A02(long j) {
        IJ.A04(this.A02 == -9223372036854775807L);
        this.A00 = j;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        C0556Iu c0556Iu = this;
        long j = 0;
        long j2 = -9223372036854775807L;
        char c2 = c0556Iu.A02 != -9223372036854775807L ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0556Iu = c0556Iu;
                    j2 = c0556Iu.A01 + c0556Iu.A02;
                    c2 = 3;
                    break;
                case 3:
                    return j2;
                case 4:
                    c0556Iu = c0556Iu;
                    j = c0556Iu.A00;
                    if (j == Long.MAX_VALUE) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    j2 = j;
                    c2 = 3;
                    break;
            }
        }
    }

    public final long A05() {
        C0556Iu c0556Iu = this;
        long j = -9223372036854775807L;
        char c2 = c0556Iu.A00 == Long.MAX_VALUE ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    j = 0;
                    c2 = 3;
                    break;
                case 3:
                    return j;
                case 4:
                    c0556Iu = c0556Iu;
                    if (c0556Iu.A02 != j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 5:
                    c0556Iu = c0556Iu;
                    j = c0556Iu.A01;
                    c2 = 3;
                    break;
            }
        }
    }

    public final long A06(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            this.A02 = j;
        } else {
            long j2 = this.A00;
            if (j2 != Long.MAX_VALUE) {
                this.A01 = j2 - j;
            }
            synchronized (this) {
                this.A02 = j;
                notifyAll();
            }
        }
        return this.A01 + j;
    }

    public final long A07(long j) {
        C0556Iu c0556Iu = this;
        long ptsWrapBelow = 0;
        long j2 = 0;
        long j3 = 0;
        char c2 = j == -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -9223372036854775807L;
                case 3:
                    c0556Iu = c0556Iu;
                    if (c0556Iu.A02 == -9223372036854775807L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0556Iu = c0556Iu;
                    long jA01 = A01(c0556Iu.A02);
                    long closestWrapCount = (4294967296L + jA01) / 8589934592L;
                    ptsWrapBelow = ((closestWrapCount - 1) * 8589934592L) + j;
                    j2 = (8589934592L * closestWrapCount) + j;
                    if (Math.abs(ptsWrapBelow - jA01) >= Math.abs(j2 - jA01)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    j3 = ptsWrapBelow;
                    c2 = 6;
                    break;
                case 6:
                    j = j3;
                    c2 = 7;
                    break;
                case 7:
                    return c0556Iu.A06(A00(j));
                case '\b':
                    j3 = j2;
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A08() {
        this.A02 = -9223372036854775807L;
    }
}
