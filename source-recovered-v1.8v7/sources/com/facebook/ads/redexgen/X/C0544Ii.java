package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ii, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0544Ii {
    public static byte[] A03;
    public byte[] A00;
    public int A01;
    public int A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-75, -38, -30, -51, -40, -43, -48, -116, -63, -64, -78, -103, -92, -116, -33, -47, -35, -31, -47, -38, -49, -47, -116, -46, -43, -34, -33, -32, -116, -50, -27, -32, -47, -90, -116, -76, -49, -48, Byte.MIN_VALUE, -62, -55, -44, Byte.MIN_VALUE, -50, -49, -44, Byte.MIN_VALUE, -38, -59, -46, -49, -102, Byte.MIN_VALUE, -8, 29, 37, 16, 27, 24, 19, -49, 4, 3, -11, -36, -25, -49, 34, 20, 32, 36, 20, 29, 18, 20, -49, 18, 30, 29, 35, 24, 29, 36, 16, 35, 24, 30, 29, -49, 17, 40, 35, 20, -23, -49, -51, -52, -66, -91, -80};
    }

    public C0544Ii() {
    }

    public C0544Ii(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C0544Ii(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C0544Ii(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i = this.A02;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        int length = 0;
        byte[] bArr = this.A00;
        char c2 = bArr == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    length = 0;
                    c2 = 3;
                    break;
                case 3:
                    return length;
                case 4:
                    bArr = bArr;
                    length = bArr.length;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 8);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return (bArr[i7] & 255) | i6;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 16);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return ((bArr[i7] & 255) << 24) | i6;
    }

    public final int A0B() {
        int iA0A = A0A();
        if (iA0A >= 0) {
            return iA0A;
        }
        throw new IllegalStateException(A00(35, 18, 41) + iA0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i2;
    }

    public final int A0D() {
        int b2 = A0E();
        int b3 = A0E();
        int b4 = A0E();
        int b22 = (b2 << 21) | (b3 << 14);
        int b32 = b4 << 7;
        return b22 | b32 | A0E();
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = (bArr[i3] & 255) | i2;
        this.A02 += 2;
        return i4;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    public final int A0H() {
        int iA08 = A08();
        if (iA08 >= 0) {
            return iA08;
        }
        throw new IllegalStateException(A00(35, 18, 41) + iA08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = bArr[r1] & 255;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr[r1] & 255) << 24);
        this.A02 = this.A02 + 1;
        long j5 = j4 | ((bArr[r1] & 255) << 32);
        this.A02 = this.A02 + 1;
        long j6 = j5 | ((bArr[r1] & 255) << 40);
        this.A02 = this.A02 + 1;
        long j7 = j6 | ((bArr[r1] & 255) << 48);
        this.A02 = this.A02 + 1;
        return j7 | ((255 & bArr[r1]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = bArr[r1] & 255;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        return j3 | ((255 & bArr[r1]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = (bArr[r1] & 255) << 56;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr[r1] & 255) << 48);
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr[r1] & 255) << 40);
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr[r1] & 255) << 32);
        this.A02 = this.A02 + 1;
        long j5 = j4 | ((bArr[r1] & 255) << 24);
        this.A02 = this.A02 + 1;
        long j6 = j5 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        long j7 = j6 | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        return j7 | (255 & bArr[r1]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = (bArr[r1] & 255) << 24;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        return j3 | (255 & bArr[r1]);
    }

    public final long A0N() {
        long jA0L = A0L();
        if (jA0L >= 0) {
            return jA0L;
        }
        throw new IllegalStateException(A00(35, 18, 41) + jA0L);
    }

    public final long A0O() {
        C0544Ii c0544Ii = this;
        byte b2 = 0;
        int x = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = c0544Ii.A00[c0544Ii.A02];
        int i5 = 7;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    x = 6;
                    if (i5 < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 1;
                    if (((1 << i5) & j) != 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = 7;
                    if (i5 >= x) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    j &= (i2 << i5) - i2;
                    i4 = 7 - i5;
                    c2 = 6;
                    break;
                case 6:
                    if (i4 == 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i3 = 1;
                    c2 = '\b';
                    break;
                case '\b':
                    if (i3 >= i4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0544Ii = c0544Ii;
                    b2 = c0544Ii.A00[c0544Ii.A02 + i3];
                    if ((b2 & 192) != 128) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    j = (j << x) | (b2 & 63);
                    i3++;
                    c2 = '\b';
                    break;
                case 11:
                    if (i5 != i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    i4 = 1;
                    c2 = 6;
                    break;
                case '\r':
                    i5--;
                    c2 = 2;
                    break;
                case 14:
                    throw new NumberFormatException(A00(53, 42, k.AppCompatTheme_windowFixedWidthMajor) + j);
                case 15:
                    c0544Ii.A02 += i4;
                    return j;
                case 16:
                    throw new NumberFormatException(A00(0, 35, 53) + j);
            }
        }
    }

    public final String A0P() {
        C0544Ii c0544Ii = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String strA0U = null;
        int i5 = 0;
        int i6 = 0;
        byte[] bArr = null;
        char c2 = c0544Ii.A04() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    c0544Ii = c0544Ii;
                    i3 = c0544Ii.A02;
                    c2 = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    if (i3 >= c0544Ii.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    if (!C0560Iy.A0g(c0544Ii.A00[i3])) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    i3++;
                    c2 = 4;
                    break;
                case 7:
                    c0544Ii = c0544Ii;
                    i6 = c0544Ii.A02;
                    i4 = 3;
                    if (i3 - i6 < 3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0544Ii = c0544Ii;
                    bArr = c0544Ii.A00;
                    if (bArr[i6] != -17) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    bArr = bArr;
                    if (bArr[i6 + 1] != -69) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    bArr = bArr;
                    if (bArr[i6 + 2] != -65) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0544Ii = c0544Ii;
                    c0544Ii.A02 = i6 + i4;
                    c2 = '\f';
                    break;
                case '\f':
                    c0544Ii = c0544Ii;
                    byte[] bArr2 = c0544Ii.A00;
                    int i7 = c0544Ii.A02;
                    strA0U = C0560Iy.A0U(bArr2, i7, i3 - i7);
                    c0544Ii.A02 = i3;
                    i5 = c0544Ii.A02;
                    i2 = c0544Ii.A01;
                    if (i5 != i2) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    return strA0U;
                case 14:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A00[i5] != 13) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0544Ii = c0544Ii;
                    c0544Ii.A02 = i5 + 1;
                    if (c0544Ii.A02 != i2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return strA0U;
                case 17:
                    c0544Ii = c0544Ii;
                    byte[] bArr3 = c0544Ii.A00;
                    i = c0544Ii.A02;
                    if (bArr3[i] != 10) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0544Ii = c0544Ii;
                    c0544Ii.A02 = i + 1;
                    c2 = 19;
                    break;
                case 19:
                    return strA0U;
            }
        }
    }

    public final String A0Q() {
        C0544Ii c0544Ii = this;
        int i = 0;
        String strA0U = null;
        int i2 = 0;
        char c2 = c0544Ii.A04() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    c0544Ii = c0544Ii;
                    i2 = c0544Ii.A02;
                    c2 = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    if (i2 >= c0544Ii.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A00[i2] == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i2++;
                    c2 = 4;
                    break;
                case 7:
                    c0544Ii = c0544Ii;
                    byte[] bArr = c0544Ii.A00;
                    int i3 = c0544Ii.A02;
                    strA0U = C0560Iy.A0U(bArr, i3, i2 - i3);
                    c0544Ii.A02 = i2;
                    i = c0544Ii.A02;
                    if (i >= c0544Ii.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0544Ii = c0544Ii;
                    c0544Ii.A02 = i + 1;
                    c2 = '\t';
                    break;
                case '\t':
                    return strA0U;
            }
        }
    }

    public final String A0R(int lastIndex) {
        C0544Ii c0544Ii = this;
        int i = 0;
        int i2 = 0;
        char c2 = lastIndex == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A00(53, 0, 5);
                case 3:
                    c0544Ii = c0544Ii;
                    i = lastIndex;
                    i2 = (c0544Ii.A02 + lastIndex) - 1;
                    if (i2 >= c0544Ii.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A00[i2] != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i--;
                    c2 = 6;
                    break;
                case 6:
                    C0544Ii c0544Ii2 = c0544Ii;
                    String strA0U = C0560Iy.A0U(c0544Ii2.A00, c0544Ii2.A02, i);
                    c0544Ii2.A02 += lastIndex;
                    return strA0U;
            }
        }
    }

    public final String A0S(int i) {
        return A0T(i, Charset.forName(A00(95, 5, 65)));
    }

    public final String A0T(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) ((bArr[i3] & 255) | i2);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i) {
        C0544Ii c0544Ii = this;
        byte[] bArr = null;
        char c2 = c0544Ii.A05() < i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    bArr = new byte[i];
                    c2 = 3;
                    break;
                case 3:
                    c0544Ii.A0b(bArr, i);
                    return;
                case 4:
                    c0544Ii = c0544Ii;
                    bArr = c0544Ii.A00;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0X(int i) {
        C0544Ii c0544Ii = this;
        boolean z = false;
        char c2 = i >= 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (i > c0544Ii.A00.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    IJ.A03(z);
                    c0544Ii.A01 = i;
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A0Y(int i) {
        C0544Ii c0544Ii = this;
        boolean z = false;
        char c2 = i >= 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (i > c0544Ii.A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    IJ.A03(z);
                    c0544Ii.A02 = i;
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A0Z(int i) {
        A0Y(this.A02 + i);
    }

    public final void A0a(C0543Ih c0543Ih, int i) {
        A0c(c0543Ih.A00, 0, i);
        c0543Ih.A07(0);
    }

    public final void A0b(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}
