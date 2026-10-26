package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0814Sz implements C4E {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{123, 86, 78, 88, 66, 67, 23, 71, 88, 68, 94, 67, 94, 88, 89, 68, 23, 90, 66, 68, 67, 23, 85, 82, 23, 89, 88, 89, 26, 89, 82, 80, 86, 67, 94, 65, 82, 22, 47, 62, 35, 42, 102, 34, 47, 53, 50, 39, 40, 37, 35, 102, 43, 51, 53, 50, 102, 36, 35, 102, 40, 41, 40, 107, 40, 35, 33, 39, 50, 47, 48, 35};
    }

    public final void A02() {
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
    }

    public final void A04(C0452Eq c0452Eq, boolean z) {
        C0814Sz c0814Sz = this;
        C4G c4g = null;
        c0814Sz.A00 = 0;
        int[] iArr = c0814Sz.A03;
        char c2 = iArr != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    iArr = iArr;
                    Arrays.fill(iArr, -1);
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    c4g = c0452Eq.A06;
                    if (c0452Eq.A04 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4g = c4g;
                    if (c4g == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4g = c4g;
                    if (!c4g.A1Y()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0J()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c0814Sz = c0814Sz;
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c4g.A1v(c0452Eq.A04.A0D(), c0814Sz);
                    c2 = '\t';
                    break;
                case '\t':
                    c0814Sz = c0814Sz;
                    c4g = c4g;
                    if (c0814Sz.A00 <= c4g.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0814Sz = c0814Sz;
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c4g.A00 = c0814Sz.A00;
                    c4g.A08 = z;
                    c0452Eq.A0r.A0O();
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A1r()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\r':
                    c0814Sz = c0814Sz;
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c4g.A1u(c0814Sz.A01, c0814Sz.A02, c0452Eq.A0s, c0814Sz);
                    c2 = '\t';
                    break;
            }
        }
    }

    public final boolean A05(int i) {
        C0814Sz c0814Sz = this;
        int i2 = 0;
        int i3 = 0;
        char c2 = c0814Sz.A03 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0814Sz = c0814Sz;
                    i3 = c0814Sz.A00 * 2;
                    i2 = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i2 >= i3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0814Sz = c0814Sz;
                    if (c0814Sz.A03[i2] != i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    i2 += 2;
                    c2 = 3;
                    break;
                case 7:
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4E
    public final void A3I(int i, int i2) {
        C0814Sz c0814Sz = this;
        int[] iArr = null;
        int i3 = 0;
        char c2 = i >= 0 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0814Sz = c0814Sz;
                    i3 = c0814Sz.A00 * 2;
                    iArr = c0814Sz.A03;
                    if (iArr != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0814Sz = c0814Sz;
                    c0814Sz.A03 = new int[4];
                    Arrays.fill(c0814Sz.A03, -1);
                    c2 = 5;
                    break;
                case 5:
                    C0814Sz c0814Sz2 = c0814Sz;
                    int[] iArr2 = c0814Sz2.A03;
                    iArr2[i3] = i;
                    iArr2[i3 + 1] = i2;
                    c0814Sz2.A00++;
                    return;
                case 6:
                    iArr = iArr;
                    if (i3 < iArr.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0814Sz = c0814Sz;
                    int[] iArr3 = c0814Sz.A03;
                    c0814Sz.A03 = new int[i3 * 2];
                    System.arraycopy(iArr3, 0, c0814Sz.A03, 0, iArr3.length);
                    c2 = 5;
                    break;
                case '\b':
                    throw new IllegalArgumentException(A00(37, 35, 34));
                case '\t':
                    throw new IllegalArgumentException(A00(0, 37, 83));
            }
        }
    }
}
