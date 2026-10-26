package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01843c {
    public static byte[] A02;
    public long A00 = 0;
    public C01843c A01;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 47);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{61, 61};
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C01843c();
        }
    }

    public final int A03(int i) {
        C01843c c01843c = this.A01;
        char c2 = c01843c == null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i < 64) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return Long.bitCount(this.A00);
                case 4:
                    return Long.bitCount(this.A00 & ((1 << i) - 1));
                case 5:
                    if (i >= 64) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return Long.bitCount(this.A00 & ((1 << i) - 1));
                case 7:
                    return c01843c.A03(i - 64) + Long.bitCount(this.A00);
            }
        }
    }

    public final void A04() {
        this.A00 = 0L;
        C01843c c01843c = this.A01;
        if (c01843c != null) {
            c01843c.A04();
        }
    }

    public final void A05(int i) {
        C01843c c01843c = this;
        C01843c c01843c2 = null;
        char c2 = i >= 64 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01843c = c01843c;
                    c01843c2 = c01843c.A01;
                    if (c01843c2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01843c2 = c01843c2;
                    c01843c2.A05(i - 64);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c01843c = c01843c;
                    c01843c.A00 &= (1 << i) ^ (-1);
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A06(int i) {
        C01843c c01843c = this;
        char c2 = i >= 64 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01843c = c01843c;
                    c01843c.A01();
                    c01843c.A01.A06(i - 64);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c01843c = c01843c;
                    c01843c.A00 |= 1 << i;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A07(int i, boolean z) {
        C01843c c01843c = this;
        boolean z2 = false;
        char c2 = 0;
        char c3 = i >= 64 ? (char) 2 : (char) 4;
        while (true) {
            switch (c3) {
                case 2:
                    c01843c = c01843c;
                    c01843c.A01();
                    c01843c.A01.A07(i - 64, z);
                    c3 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c01843c = c01843c;
                    c2 = 1;
                    if ((c01843c.A00 & Long.MIN_VALUE) == 0) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    z2 = true;
                    c3 = 6;
                    break;
                case 6:
                    c01843c = c01843c;
                    long j = (1 << i) - 1;
                    long j2 = c01843c.A00;
                    long mask = j2 & j;
                    long before = mask | ((j2 & ((-1) ^ j)) << c2);
                    c01843c.A00 = before;
                    if (!z) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    c01843c = c01843c;
                    c01843c.A06(i);
                    c3 = '\b';
                    break;
                case '\b':
                    if (!z2) {
                        c3 = '\t';
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\t':
                    c01843c = c01843c;
                    if (c01843c.A01 == null) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    c01843c = c01843c;
                    c01843c.A01();
                    c01843c.A01.A07(0, z2);
                    c3 = 3;
                    break;
                case 11:
                    c01843c = c01843c;
                    c01843c.A05(i);
                    c3 = '\b';
                    break;
                case '\f':
                    z2 = false;
                    c3 = 6;
                    break;
            }
        }
    }

    public final boolean A08(int i) {
        C01843c c01843c = this;
        boolean z = false;
        char c2 = i >= 64 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C01843c c01843c2 = c01843c;
                    c01843c2.A01();
                    return c01843c2.A01.A08(i - 64);
                case 3:
                    c01843c = c01843c;
                    if ((c01843c.A00 & (1 << i)) == 0) {
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

    public final boolean A09(int i) {
        C01843c c01843c = this;
        boolean z = false;
        C01843c c01843c2 = null;
        long before = 0;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = i >= 64 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C01843c c01843c3 = c01843c;
                    c01843c3.A01();
                    return c01843c3.A01.A09(i - 64);
                case 3:
                    c01843c = c01843c;
                    j = 1;
                    before = 1 << i;
                    i2 = 1;
                    i3 = 0;
                    if ((c01843c.A00 & before) == 0) {
                        c2 = '\n';
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
                    c01843c = c01843c;
                    c01843c.A00 &= before ^ (-1);
                    long j2 = before - j;
                    long j3 = c01843c.A00;
                    c01843c.A00 = (j3 & j2) | Long.rotateRight(j3 & ((-1) ^ j2), i2);
                    c01843c2 = c01843c.A01;
                    if (c01843c2 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01843c2 = c01843c2;
                    i3 = 0;
                    if (!c01843c2.A08(0)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01843c = c01843c;
                    c01843c.A06(63);
                    c2 = '\b';
                    break;
                case '\b':
                    c01843c = c01843c;
                    c01843c.A01.A09(i3);
                    c2 = '\t';
                    break;
                case '\t':
                    return z;
                case '\n':
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final String toString() {
        C01843c c01843c = this;
        String binaryString = null;
        char c2 = c01843c.A01 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01843c = c01843c;
                    binaryString = Long.toBinaryString(c01843c.A00);
                    c2 = 3;
                    break;
                case 3:
                    return binaryString;
                case 4:
                    c01843c = c01843c;
                    binaryString = c01843c.A01.toString() + A00(0, 2, 106) + Long.toBinaryString(c01843c.A00);
                    c2 = 3;
                    break;
            }
        }
    }
}
