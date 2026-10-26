package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ie, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0540Ie {
    public static byte[] A00;
    public static int[] A01;
    public static final byte[] A02;
    public static final float[] A03;
    public static final Object A04;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A00 = new byte[]{48, 31, 18, 43, 16, 23, 10, 43, 10, 23, 18, 32, 27, 16, 13, 5, 16, 22, 1, 16, 17, 85, 20, 6, 5, 16, 22, 1, 42, 7, 20, 1, 28, 26, 42, 28, 17, 22, 85, 3, 20, 25, 0, 16, 79, 85, 87, 72, 69, 68, 78, 14, 64, 87, 66, 48, 47, 34, 35, 41, 105, 46, 35, 48, 37};
    }

    static {
        A08();
        A02 = new byte[]{0, 0, 0, 1};
        A03 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A04 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int A02(byte[] bArr, int position) {
        int position2;
        synchronized (A04) {
            int iA03 = 0;
            int scratchEscapeCount = 0;
            while (iA03 < position) {
                iA03 = A03(bArr, iA03, position);
                if (iA03 < position) {
                    if (A01.length <= scratchEscapeCount) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[scratchEscapeCount] = iA03;
                    iA03 += 3;
                    scratchEscapeCount++;
                }
            }
            position2 = position - scratchEscapeCount;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < scratchEscapeCount; i3++) {
                int unescapedPosition = A01[i3] - i;
                System.arraycopy(bArr, i, bArr, i2, unescapedPosition);
                int i4 = i2 + unescapedPosition;
                int copyLength = i4 + 1;
                bArr[i4] = 0;
                i2 = copyLength + 1;
                bArr[copyLength] = 0;
                i += unescapedPosition + 3;
            }
            int remainingLength = position2 - i2;
            System.arraycopy(bArr, i, bArr, i2, remainingLength);
        }
        return position2;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= i2 - 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    if (bArr[i] != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    if (bArr[i + 1] != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bArr = bArr;
                    if (bArr[i + 2] != 3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return i;
                case 7:
                    i++;
                    c2 = 2;
                    break;
                case '\b':
                    return i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A04(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        int i6 = i2 - i;
        boolean z4 = false;
        char c2 = i6 >= 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A04(z2);
                    if (i6 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i2;
                case 5:
                    z2 = false;
                    c2 = 3;
                    break;
                case 6:
                    zArr = zArr;
                    i3 = 2;
                    if (zArr == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    zArr = zArr;
                    z4 = false;
                    z4 = false;
                    if (!zArr[0]) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    A0B(zArr);
                    return i - 3;
                case '\t':
                    if (i6 <= 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    zArr = zArr;
                    if (!zArr[1]) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    bArr = bArr;
                    if (bArr[i] != 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    A0B(zArr);
                    return i - 2;
                case '\r':
                    if (i6 <= i3) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    zArr = zArr;
                    if (!zArr[i3]) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    bArr = bArr;
                    if (bArr[i] != 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    bArr = bArr;
                    if (bArr[i + 1] != 1) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    A0B(zArr);
                    return i - 1;
                case 18:
                    i4 = i2 - 1;
                    i5 = i + 2;
                    c2 = 19;
                    break;
                case 19:
                    if (i5 >= i4) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    bArr = bArr;
                    if ((bArr[i5] & 254) == 0) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    i5 += 3;
                    c2 = 19;
                    break;
                case 22:
                    bArr = bArr;
                    if (bArr[i5 - 2] != 0) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    bArr = bArr;
                    if (bArr[i5 - 1] != 0) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    bArr = bArr;
                    if (bArr[i5] != 1) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    zArr = zArr;
                    if (zArr == null) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    zArr = zArr;
                    A0B(zArr);
                    c2 = 27;
                    break;
                case 27:
                    return i5 - 2;
                case 28:
                    i5 -= 2;
                    c2 = 21;
                    break;
                case 29:
                    zArr = zArr;
                    if (zArr == null) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    if (i6 <= i3) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    bArr = bArr;
                    if (bArr[i2 - 3] != 0) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    bArr = bArr;
                    if (bArr[i2 - 2] != 0) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    bArr = bArr;
                    if (bArr[i2 - 1] != 1) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    z3 = true;
                    c2 = '#';
                    break;
                case '#':
                    zArr = zArr;
                    zArr[z4 ? 1 : 0] = z3;
                    if (i6 <= 1) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    bArr = bArr;
                    if (bArr[i2 - 2] != 0) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    bArr = bArr;
                    if (bArr[i2 - 1] != 0) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    z = true;
                    c2 = '\'';
                    break;
                case '\'':
                    bArr = bArr;
                    zArr = zArr;
                    zArr[1] = z;
                    if (bArr[i2 - 1] != 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    z4 = true;
                    c2 = ')';
                    break;
                case ')':
                    zArr = zArr;
                    zArr[i3] = z4;
                    c2 = '*';
                    break;
                case '*':
                    return i2;
                case '+':
                    zArr = zArr;
                    if (!zArr[i3]) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = ',';
                        break;
                    }
                case ',':
                    bArr = bArr;
                    if (bArr[i2 - 1] != 0) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '-':
                    z = false;
                    c2 = '\'';
                    break;
                case '.':
                    if (i6 != i3) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    zArr = zArr;
                    if (!zArr[i3]) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '0';
                        break;
                    }
                case '0':
                    bArr = bArr;
                    if (bArr[i2 - 2] != 0) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '1';
                        break;
                    }
                case '1':
                    bArr = bArr;
                    if (bArr[i2 - 1] != 1) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '2':
                    zArr = zArr;
                    if (!zArr[1]) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '3';
                        break;
                    }
                case '3':
                    bArr = bArr;
                    if (bArr[i2 - 1] != 1) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '4':
                    z3 = false;
                    c2 = '#';
                    break;
            }
        }
    }

    public static C0538Ic A05(byte[] bArr, int i, int i2) {
        C0545Ij c0545Ij = new C0545Ij(bArr, i, i2);
        c0545Ij.A07(8);
        int picParameterSetId = c0545Ij.A04();
        int iA04 = c0545Ij.A04();
        c0545Ij.A06();
        boolean bottomFieldPicOrderInFramePresentFlag = c0545Ij.A0A();
        return new C0538Ic(picParameterSetId, iA04, bottomFieldPicOrderInFramePresentFlag);
    }

    public static C0539Id A06(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        C0545Ij c0545Ij = new C0545Ij(bArr, i, i2);
        c0545Ij.A07(8);
        int iA05 = c0545Ij.A05(8);
        c0545Ij.A07(16);
        int iA04 = c0545Ij.A04();
        int iA042 = 1;
        boolean zA0A = false;
        if (iA05 == 100 || iA05 == 110 || iA05 == 122 || iA05 == 244 || iA05 == 44 || iA05 == 83 || iA05 == 86 || iA05 == 118 || iA05 == 128 || iA05 == 138) {
            iA042 = c0545Ij.A04();
            if (iA042 == 3) {
                zA0A = c0545Ij.A0A();
            }
            c0545Ij.A04();
            c0545Ij.A04();
            c0545Ij.A06();
            if (c0545Ij.A0A()) {
                int i5 = iA042 != 3 ? 8 : 12;
                int i6 = 0;
                while (i6 < i5) {
                    if (c0545Ij.A0A()) {
                        A09(c0545Ij, i6 < 6 ? 16 : 64);
                    }
                    i6++;
                }
            }
        }
        int iA043 = c0545Ij.A04() + 4;
        int iA044 = c0545Ij.A04();
        int iA045 = 0;
        boolean zA0A2 = false;
        if (iA044 == 0) {
            iA045 = c0545Ij.A04() + 4;
        } else if (iA044 == 1) {
            zA0A2 = c0545Ij.A0A();
            c0545Ij.A03();
            c0545Ij.A03();
            long jA04 = c0545Ij.A04();
            for (int i7 = 0; i7 < jA04; i7++) {
                c0545Ij.A04();
            }
        }
        c0545Ij.A04();
        c0545Ij.A06();
        int iA046 = c0545Ij.A04() + 1;
        int iA047 = c0545Ij.A04() + 1;
        boolean zA0A3 = c0545Ij.A0A();
        int i8 = (2 - (zA0A3 ? 1 : 0)) * iA047;
        if (!zA0A3) {
            c0545Ij.A06();
        }
        c0545Ij.A06();
        int i9 = iA046 * 16;
        int i10 = i8 * 16;
        if (c0545Ij.A0A()) {
            int iA048 = c0545Ij.A04();
            int iA049 = c0545Ij.A04();
            int iA0410 = c0545Ij.A04();
            int iA0411 = c0545Ij.A04();
            if (iA042 == 0) {
                i3 = 1;
                i4 = 2 - (zA0A3 ? 1 : 0);
            } else {
                i3 = iA042 == 3 ? 1 : 2;
                i4 = (2 - (zA0A3 ? 1 : 0)) * (iA042 == 1 ? 2 : 1);
            }
            i9 -= (iA048 + iA049) * i3;
            i10 -= (iA0410 + iA0411) * i4;
        }
        float f = 1.0f;
        if (c0545Ij.A0A() && c0545Ij.A0A()) {
            int iA052 = c0545Ij.A05(8);
            if (iA052 == 255) {
                int iA053 = c0545Ij.A05(16);
                int iA054 = c0545Ij.A05(16);
                if (iA053 != 0 && iA054 != 0) {
                    f = iA053 / iA054;
                }
            } else {
                float[] fArr = A03;
                if (iA052 < fArr.length) {
                    f = fArr[iA052];
                } else {
                    Log.w(A07(0, 11, k.AppCompatTheme_windowFixedHeightMinor), A07(11, 35, k.AppCompatTheme_windowNoTitle) + iA052);
                }
            }
        }
        return new C0539Id(iA04, i9, i10, f, zA0A, zA0A3, iA043, iA044, iA045, zA0A2);
    }

    public static void A09(C0545Ij c0545Ij, int nextScale) {
        int i = 0;
        int i2 = 8;
        int deltaScale = 8;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= nextScale) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (deltaScale == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0545Ij = c0545Ij;
                    int deltaScale2 = c0545Ij.A03();
                    deltaScale = ((deltaScale2 + i2) + 256) % 256;
                    c2 = 5;
                    break;
                case 5:
                    if (deltaScale != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = i2;
                    c2 = 7;
                    break;
                case 7:
                    i2 = i;
                    i3++;
                    c2 = 2;
                    break;
                case '\b':
                    i = deltaScale;
                    c2 = 7;
                    break;
                case '\t':
                    return;
            }
        }
    }

    public static void A0A(ByteBuffer byteBuffer) {
        int consecutiveZeros = 0;
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        int value = 2;
        while (true) {
            switch (value) {
                case 2:
                    int offset = i2 + 1;
                    if (offset >= iPosition) {
                        value = 12;
                        break;
                    } else {
                        value = 3;
                        break;
                    }
                case 3:
                    byteBuffer = byteBuffer;
                    consecutiveZeros = byteBuffer.get(i2) & 255;
                    if (i != 3) {
                        value = 7;
                        break;
                    } else {
                        value = 4;
                        break;
                    }
                case 4:
                    if (consecutiveZeros != 1) {
                        value = 9;
                        break;
                    } else {
                        value = 5;
                        break;
                    }
                case 5:
                    byteBuffer = byteBuffer;
                    if ((byteBuffer.get(i2 + 1) & 31) != 7) {
                        value = 9;
                        break;
                    } else {
                        value = 6;
                        break;
                    }
                case 6:
                    ByteBuffer byteBuffer2 = byteBuffer;
                    ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                    byteBufferDuplicate.position(i2 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer2.position(0);
                    byteBuffer2.put(byteBufferDuplicate);
                    return;
                case 7:
                    if (consecutiveZeros != 0) {
                        value = 9;
                        break;
                    } else {
                        value = 8;
                        break;
                    }
                case 8:
                    i++;
                    value = 9;
                    break;
                case 9:
                    if (consecutiveZeros == 0) {
                        value = 11;
                        break;
                    } else {
                        value = 10;
                        break;
                    }
                case 10:
                    i = 0;
                    value = 11;
                    break;
                case 11:
                    i2++;
                    value = 2;
                    break;
                case 12:
                    byteBuffer.clear();
                    return;
            }
        }
    }

    public static void A0B(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A0C(String str, byte b2) {
        boolean z = true;
        char c2 = A07(46, 9, 40).equals(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if ((b2 & 31) == 6) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A07(55, 10, 79).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (((b2 & 126) >> (z ? 1 : 0)) != 39) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
