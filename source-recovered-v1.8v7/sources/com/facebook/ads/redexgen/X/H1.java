package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H1 {
    public static byte[] A0E;
    public float A00;
    public int A01;
    public int A03;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final H1 A0D;
    public int A06 = -1;
    public int A07 = -1;
    public int A02 = -1;
    public int A05 = -1;
    public int A04 = -1;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 3);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0E = new byte[]{21, 54, 52, 60, 48, 37, 56, 34, 57, 51, 119, 52, 56, 59, 56, 37, 119, 63, 54, 36, 119, 57, 56, 35, 119, 53, 50, 50, 57, 119, 51, 50, 49, 62, 57, 50, 51, 121, 101, 76, 77, 87, 3, 64, 76, 79, 76, 81, 3, 75, 66, 80, 3, 77, 76, 87, 3, 65, 70, 70, 77, 3, 71, 70, 69, 74, 77, 70, 71, 13};
    }

    private H1 A00(H1 h1, boolean z) {
        H1 h12 = this;
        int i = 0;
        char c2 = h1 != null ? (char) 2 : (char) 23;
        while (true) {
            switch (c2) {
                case 2:
                    h12 = h12;
                    if (!h12.A0C) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    h1 = h1;
                    if (!h1.A0C) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    h12 = h12;
                    h1 = h1;
                    h12.A0B(h1.A03);
                    c2 = 5;
                    break;
                case 5:
                    h12 = h12;
                    i = -1;
                    if (h12.A02 != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    h12 = h12;
                    h1 = h1;
                    h12.A02 = h1.A02;
                    c2 = 7;
                    break;
                case 7:
                    h12 = h12;
                    if (h12.A05 != i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    h12 = h12;
                    h1 = h1;
                    h12.A05 = h1.A05;
                    c2 = '\t';
                    break;
                case '\t':
                    h12 = h12;
                    if (h12.A09 != null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    h12 = h12;
                    h1 = h1;
                    h12.A09 = h1.A09;
                    c2 = 11;
                    break;
                case 11:
                    h12 = h12;
                    if (h12.A06 != i) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    h12 = h12;
                    h1 = h1;
                    h12.A06 = h1.A06;
                    c2 = '\r';
                    break;
                case '\r':
                    h12 = h12;
                    if (h12.A07 != i) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    h12 = h12;
                    h1 = h1;
                    h12.A07 = h1.A07;
                    c2 = 15;
                    break;
                case 15:
                    h12 = h12;
                    if (h12.A08 != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    h12 = h12;
                    h1 = h1;
                    h12.A08 = h1.A08;
                    c2 = 17;
                    break;
                case 17:
                    h12 = h12;
                    if (h12.A04 != i) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    h12 = h12;
                    h1 = h1;
                    h12.A04 = h1.A04;
                    h12.A00 = h1.A00;
                    c2 = 19;
                    break;
                case 19:
                    if (!z) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    h12 = h12;
                    if (!h12.A0B) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 21:
                    h1 = h1;
                    if (!h1.A0B) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    h12 = h12;
                    h1 = h1;
                    h12.A0A(h1.A01);
                    c2 = 23;
                    break;
                case 23:
                    return h12;
            }
        }
    }

    public final float A03() {
        return this.A00;
    }

    public final int A04() {
        if (this.A0B) {
            return this.A01;
        }
        throw new IllegalStateException(A01(0, 38, 84));
    }

    public final int A05() {
        if (this.A0C) {
            return this.A03;
        }
        throw new IllegalStateException(A01(38, 32, 32));
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        H1 h1 = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = h1.A02 == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    h1 = h1;
                    if (h1.A05 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    h1 = h1;
                    i = 0;
                    i2 = 1;
                    if (h1.A02 != 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3 = 1;
                    c2 = 6;
                    break;
                case 6:
                    h1 = h1;
                    if (h1.A05 != i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i = 2;
                    c2 = '\b';
                    break;
                case '\b':
                    return i3 | i;
                case '\t':
                    i3 = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    public final Layout.Alignment A08() {
        return this.A08;
    }

    public final H1 A09(float f) {
        this.A00 = f;
        return this;
    }

    public final H1 A0A(int i) {
        this.A01 = i;
        this.A0B = true;
        return this;
    }

    public final H1 A0B(int i) {
        boolean z = false;
        char c2 = this.A0D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    H1 h1 = this;
                    IJ.A04(z);
                    h1.A03 = i;
                    h1.A0C = true;
                    return h1;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final H1 A0C(int i) {
        this.A04 = i;
        return this;
    }

    public final H1 A0D(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final H1 A0E(H1 h1) {
        return A00(h1, true);
    }

    public final H1 A0F(String str) {
        boolean z = false;
        char c2 = this.A0D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    H1 h1 = this;
                    IJ.A04(z);
                    h1.A09 = str;
                    return h1;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final H1 A0G(String str) {
        this.A0A = str;
        return this;
    }

    public final H1 A0H(boolean z) {
        boolean z2 = false;
        char c2 = this.A0D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    H1 h1 = this;
                    IJ.A04(z2);
                    h1.A02 = z ? 1 : 0;
                    return h1;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final H1 A0I(boolean z) {
        boolean z2 = false;
        char c2 = this.A0D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    H1 h1 = this;
                    IJ.A04(z2);
                    h1.A05 = z ? 1 : 0;
                    return h1;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final H1 A0J(boolean z) {
        boolean z2 = false;
        char c2 = this.A0D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    H1 h1 = this;
                    IJ.A04(z2);
                    h1.A06 = z ? 1 : 0;
                    return h1;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final H1 A0K(boolean z) {
        boolean z2 = false;
        char c2 = this.A0D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    H1 h1 = this;
                    IJ.A04(z2);
                    h1.A07 = z ? 1 : 0;
                    return h1;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final String A0L() {
        return this.A09;
    }

    public final String A0M() {
        return this.A0A;
    }

    public final boolean A0N() {
        return this.A0B;
    }

    public final boolean A0O() {
        return this.A0C;
    }

    public final boolean A0P() {
        return this.A06 == 1;
    }

    public final boolean A0Q() {
        return this.A07 == 1;
    }
}
