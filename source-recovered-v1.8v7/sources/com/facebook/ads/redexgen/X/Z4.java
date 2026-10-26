package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Z4 extends AbstractC0402Cd {
    public static byte[] A03;
    public final long A00;
    public final List<Z4> A01;
    public final List<Z5> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedWidthMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A03 = new byte[]{3, 64, 76, 77, 87, 66, 74, 77, 70, 81, 80, 25, 3, 84, 24, 17, 21, 2, 17, 7, 78, 84};
    }

    public Z4(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final Z4 A06(int i) {
        Z4 z4 = this;
        Z4 atom = null;
        int size = z4.A01.size();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z4 = z4;
                    atom = z4.A01.get(i2);
                    if (((AbstractC0402Cd) atom).A00 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return atom;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return (Z4) null;
            }
        }
    }

    public final Z5 A07(int i) {
        Z4 z4 = this;
        Z5 atom = null;
        int size = z4.A02.size();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z4 = z4;
                    atom = z4.A02.get(i2);
                    if (((AbstractC0402Cd) atom).A00 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return atom;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return (Z5) null;
            }
        }
    }

    public final void A08(Z4 z4) {
        this.A01.add(z4);
    }

    public final void A09(Z5 z5) {
        this.A02.add(z5);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0402Cd
    public final String toString() {
        return AbstractC0402Cd.A02(super.A00) + A04(13, 9, 13) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 90) + Arrays.toString(this.A01.toArray());
    }
}
