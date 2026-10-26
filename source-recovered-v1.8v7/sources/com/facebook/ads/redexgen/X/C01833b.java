package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01833b {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 56);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{109, -79, 123, 44, 39, -122, -51, -108, -28, -19, 1, -4, -12, 19, -22, -15, -12, -12, -21, -21, -88};
    }

    public C01833b(int i, int i2, int i3, Object obj) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }

    private final String A00() {
        int i = this.A00;
        char c2 = i != 1 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return A01(18, 2, k.AppCompatTheme_windowActionBarOverlay);
                case 6:
                    return A01(8, 2, 63);
                case 7:
                    return A01(3, 2, 127);
                case '\b':
                    return A01(10, 2, 87);
                case '\t':
                    return A01(15, 3, 88);
            }
        }
    }

    public final boolean equals(Object obj) {
        C01833b c01833b = this;
        Object obj2 = null;
        int i = 0;
        C01833b c01833b2 = null;
        char c2 = c01833b == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01833b = c01833b;
                    obj = obj;
                    if (c01833b.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c01833b = c01833b;
                    obj = obj;
                    c01833b2 = (C01833b) obj;
                    i = c01833b.A00;
                    if (i == c01833b2.A00) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    if (i != 8) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c01833b = c01833b;
                    if (Math.abs(c01833b.A01 - c01833b.A02) != 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A01 != c01833b2.A02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 != c01833b2.A01) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return true;
                case '\r':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A01 == c01833b2.A01) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return false;
                case 15:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 == c01833b2.A02) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return false;
                case 17:
                    c01833b = c01833b;
                    obj2 = c01833b.A03;
                    if (obj2 == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c01833b2 = c01833b2;
                    obj2 = obj2;
                    if (!obj2.equals(c01833b2.A03)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 19:
                    return false;
                case 20:
                    c01833b2 = c01833b2;
                    if (c01833b2.A03 == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    return false;
                case 22:
                    return true;
            }
        }
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) + this.A02) * 31;
        int result = this.A01;
        return i + result;
    }

    public final String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + A01(20, 1, 21) + A00() + A01(5, 3, 34) + this.A02 + A01(13, 2, k.AppCompatTheme_windowFixedWidthMajor) + this.A01 + A01(0, 3, 9) + this.A03 + A01(12, 1, 95);
    }
}
