package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0352Ab {
    public static final AbstractC0352Ab A00 = new YF();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract AZ A0A(int i, AZ az, boolean z);

    public abstract C0351Aa A0D(int i, C0351Aa c0351Aa, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        AbstractC0352Ab abstractC0352Ab = this;
        int i3 = 0;
        int iA05 = 0;
        char c2 = i2 != 0 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 != 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC0352Ab = abstractC0352Ab;
                    if (i != abstractC0352Ab.A06(z)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    abstractC0352Ab = abstractC0352Ab;
                    iA05 = abstractC0352Ab.A05(z);
                    c2 = 6;
                    break;
                case 6:
                    return iA05;
                case 7:
                    iA05 = i + 1;
                    c2 = 6;
                    break;
                case '\b':
                    throw new IllegalStateException();
                case '\t':
                    return i;
                case '\n':
                    abstractC0352Ab = abstractC0352Ab;
                    if (i != abstractC0352Ab.A06(z)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i3 = -1;
                    c2 = '\f';
                    break;
                case '\f':
                    return i3;
                case '\r':
                    i3 = i + 1;
                    c2 = '\f';
                    break;
            }
        }
    }

    public final int A03(int nextWindowIndex, AZ az, C0351Aa c0351Aa, int i, boolean z) {
        AbstractC0352Ab abstractC0352Ab = this;
        int iA02 = 0;
        int i2 = 0;
        int i3 = abstractC0352Ab.A09(nextWindowIndex, az).A00;
        char c2 = abstractC0352Ab.A0B(i3, c0351Aa).A01 == nextWindowIndex ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC0352Ab = abstractC0352Ab;
                    iA02 = abstractC0352Ab.A02(i3, i, z);
                    i2 = -1;
                    if (iA02 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return i2;
                case 4:
                    return abstractC0352Ab.A0B(iA02, c0351Aa).A00;
                case 5:
                    return nextWindowIndex + 1;
            }
        }
    }

    public int A05(boolean z) {
        int i = 0;
        char c2 = A0E() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public int A06(boolean z) {
        AbstractC0352Ab abstractC0352Ab = this;
        int iA01 = 0;
        char c2 = abstractC0352Ab.A0E() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iA01 = -1;
                    c2 = 3;
                    break;
                case 3:
                    return iA01;
                case 4:
                    abstractC0352Ab = abstractC0352Ab;
                    iA01 = abstractC0352Ab.A01() - 1;
                    c2 = 3;
                    break;
            }
        }
    }

    public final Pair<Integer, Long> A07(C0351Aa c0351Aa, AZ az, int i, long j) {
        return A08(c0351Aa, az, i, j, 0L);
    }

    public final Pair<Integer, Long> A08(C0351Aa c0351Aa, AZ az, int i, long j, long j2) {
        AZ az2 = az;
        C0351Aa c0351Aa2 = c0351Aa;
        AbstractC0352Ab abstractC0352Ab = this;
        long jA03 = 0;
        int i2 = 0;
        long jA07 = 0;
        IJ.A00(i, 0, abstractC0352Ab.A01());
        abstractC0352Ab.A0D(i, c0351Aa2, false, j2);
        char c2 = j == -9223372036854775807L ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0351Aa2 = c0351Aa2;
                    j = c0351Aa2.A01();
                    if (j != -9223372036854775807L) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (Pair) null;
                case 4:
                    abstractC0352Ab = abstractC0352Ab;
                    c0351Aa2 = c0351Aa2;
                    az2 = az2;
                    i2 = c0351Aa2.A00;
                    jA03 = c0351Aa2.A03() + j;
                    jA07 = abstractC0352Ab.A09(i2, az2).A07();
                    c2 = 5;
                    break;
                case 5:
                    if (jA07 == -9223372036854775807L) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (jA03 < jA07) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0351Aa2 = c0351Aa2;
                    if (i2 >= c0351Aa2.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    abstractC0352Ab = abstractC0352Ab;
                    az2 = az2;
                    jA03 -= jA07;
                    i2++;
                    jA07 = abstractC0352Ab.A09(i2, az2).A07();
                    c2 = 5;
                    break;
                case '\t':
                    return Pair.create(Integer.valueOf(i2), Long.valueOf(jA03));
            }
        }
    }

    public final AZ A09(int i, AZ az) {
        return A0A(i, az, false);
    }

    public final C0351Aa A0B(int i, C0351Aa c0351Aa) {
        return A0C(i, c0351Aa, false);
    }

    public final C0351Aa A0C(int i, C0351Aa c0351Aa, boolean z) {
        return A0D(i, c0351Aa, z, 0L);
    }

    public final boolean A0E() {
        boolean z = false;
        char c2 = A01() == 0 ? (char) 2 : (char) 4;
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

    public final boolean A0F(int i, AZ az, C0351Aa c0351Aa, int i2, boolean z) {
        boolean z2 = false;
        char c2 = A03(i, az, c0351Aa, i2, z) == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    return z2;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
