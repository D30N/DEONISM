package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9J {
    public static byte[] A02;
    public final int A00;
    public final int A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{18, 29, 24, 17, 84, 92, 81, 16, 93, 84, 72, 84, 89, 69, 23, 24, 29, 20, 81, 76, 81, 84, 21, 81, 87, 87, 81, 24, 31, 21, 20, 9, 81, 76, 81, 84, 21, 65, 102, 126, 105, 100, 97, 108, 40, 97, 102, 108, 109, 112, 76, 109, 100, 124, 105, 40, 32, 45, 108, 36, 40, 97, 102, 108, 109, 112, 40, 53, 40, 45, 108, 33, 114, 125, 120, 113, 52, 41, 41, 52, 57, 37, 52, 50, 50, 52, 125, 122, 112, 113, 108, 52, 41, 52, 49, 112};
    }

    public C9J() {
        this(-1, -1);
    }

    public C9J(int i, int i2) {
        if (i >= -1) {
            if (i < 0 || i2 >= 0) {
                if (i != -1 || i2 == -1) {
                    this.A00 = i;
                    this.A01 = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 21), Integer.valueOf(i2)));
            }
            throw new IllegalArgumentException(String.format(Locale.US, A00(14, 23, 112), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 14, k.AppCompatTheme_windowActionModeOverlay), Integer.valueOf(i)));
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(C9J c9j) {
        int i = this.A00;
        int i2 = c9j.A00;
        if (i != i2) {
            return i - i2;
        }
        return this.A01 - c9j.A01;
    }

    public final C9J A05(int i) {
        int i2 = this.A01;
        if (i + i2 >= 0) {
            return new C9J(this.A00, i2 + i);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(37, 35, 9), Integer.valueOf(i), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        C9J other = this;
        C9J c9j = null;
        boolean z = false;
        char c2 = !(obj instanceof C9J) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    other = other;
                    obj = obj;
                    c9j = (C9J) obj;
                    if (c9j.A00 != other.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    other = other;
                    c9j = c9j;
                    if (c9j.A01 != other.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
            }
        }
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}
