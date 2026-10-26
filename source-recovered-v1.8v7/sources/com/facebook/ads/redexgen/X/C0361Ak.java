package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0361Ak {
    public static byte[] A00;
    public static final int[] A01;
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;

    public static String A0A(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0B() {
        A00 = new byte[]{81, 69, 84, 89, 95, 31, 85, 81, 83, 3, 29, 90, 95, 83, 79, 91, 74, 71, 65, 1, 79, 77, 29, 32, 52, 37, 40, 46, 110, 36, 32, 34, 114};
    }

    static {
        A0B();
        A02 = new int[]{1, 2, 3, 6};
        A04 = new int[]{48000, 44100, 32000};
        A05 = new int[]{24000, 22050, 16000};
        A03 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A01 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
        A06 = new int[]{69, 87, 104, k.AppCompatTheme_windowFixedWidthMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int halfFrmsizecod, int sampleRate) {
        int i = 0;
        int i2 = 0;
        int[] iArr = null;
        int[] iArr2 = null;
        int i3 = sampleRate / 2;
        char c2 = halfFrmsizecod >= 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    iArr = A04;
                    if (halfFrmsizecod >= iArr.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (sampleRate < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    iArr2 = A06;
                    if (i3 < iArr2.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return -1;
                case 6:
                    iArr = iArr;
                    i2 = iArr[halfFrmsizecod];
                    if (i2 != 44100) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return (iArr2[i3] + (sampleRate % 2)) * 2;
                case '\b':
                    i = A01[i3];
                    if (i2 != 32000) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i * 6;
                case '\n':
                    return i * 4;
            }
        }
    }

    public static int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        int i = iPosition;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i > iLimit) {
                        i2 = 6;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    byteBuffer = byteBuffer;
                    int i3 = i + 4;
                    if ((byteBuffer.getInt(i3) & (-16777217)) != -1167101192) {
                        i2 = 5;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    return i - iPosition;
                case 5:
                    i++;
                    i2 = 2;
                    break;
                case 6:
                    return -1;
            }
        }
    }

    public static int A03(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? A02[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        int i2 = 0;
        int iPosition = 0;
        int i3 = 0;
        boolean z = false;
        char c2 = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    byteBuffer = byteBuffer;
                    i3 = 40;
                    iPosition = byteBuffer.position() + i;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 9;
                    c2 = 5;
                    break;
                case 5:
                    return i3 << ((byteBuffer.get(iPosition + i2) >> 4) & 7);
                case 6:
                    i2 = 8;
                    c2 = 5;
                    break;
                case 7:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        return A01(fscod, bArr[4] & 63);
    }

    public static int A06(byte[] bArr) {
        char c2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        char c3 = bArr[4] == -8 ? (char) 2 : (char) 5;
        while (true) {
            switch (c3) {
                case 2:
                    bArr = bArr;
                    if (bArr[5] != 114) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    if (bArr[6] != 111) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    i2 = 7;
                    if ((bArr[7] & 254) == 186) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    return 0;
                case 6:
                    bArr = bArr;
                    if ((bArr[i2] & 255) != 187) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c3 = '\b';
                    break;
                case '\b':
                    i = 40;
                    if (!z) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    c2 = '\t';
                    c3 = '\n';
                    break;
                case '\n':
                    return i << ((bArr[c2] >> 4) & i2);
                case 11:
                    c2 = '\b';
                    c3 = '\n';
                    break;
            }
        }
    }

    public static Format A07(C0544Ii c0544Ii, String str, String str2, DrmInitData drmInitData) {
        int i = 0;
        int i2 = A04[(c0544Ii.A0E() & 192) >> 6];
        int iA0E = c0544Ii.A0E();
        int nextByte = A03[(iA0E & 56) >> 3];
        char c2 = (iA0E & 4) != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = nextByte + 1;
                    c2 = 3;
                    break;
                case 3:
                    return Format.A07(str, A0A(14, 9, 2), null, -1, -1, i, i2, null, drmInitData, 0, str2);
                case 4:
                    i = nextByte;
                    c2 = 3;
                    break;
            }
        }
    }

    public static Format A08(C0544Ii c0544Ii, String str, String str2, DrmInitData drmInitData) {
        C0544Ii c0544Ii2 = c0544Ii;
        int channelCount = 0;
        String strA0A = null;
        String strA0A2 = null;
        c0544Ii2.A0Z(2);
        int nextByte = A04[(c0544Ii2.A0E() & 192) >> 6];
        int iA0E = c0544Ii2.A0E();
        int i = A03[(iA0E & 14) >> 1];
        int numDepSub = (iA0E & 1) != 0 ? 2 : 3;
        while (true) {
            switch (numDepSub) {
                case 2:
                    i++;
                    numDepSub = 3;
                    break;
                case 3:
                    c0544Ii2 = c0544Ii2;
                    int numDepSub2 = (c0544Ii2.A0E() & 30) >> 1;
                    if (numDepSub2 <= 0) {
                        numDepSub = 12;
                        break;
                    } else {
                        numDepSub = 4;
                        break;
                    }
                case 4:
                    c0544Ii2 = c0544Ii2;
                    int numDepSub3 = c0544Ii2.A0E();
                    int lowByteChanLoc = numDepSub3 & 2;
                    if (lowByteChanLoc == 0) {
                        numDepSub = 12;
                        break;
                    } else {
                        numDepSub = 5;
                        break;
                    }
                case 5:
                    channelCount = i + 2;
                    numDepSub = 6;
                    break;
                case 6:
                    c0544Ii2 = c0544Ii2;
                    strA0A2 = A0A(23, 10, 109);
                    int lowByteChanLoc2 = c0544Ii2.A04();
                    if (lowByteChanLoc2 <= 0) {
                        numDepSub = 11;
                        break;
                    } else {
                        numDepSub = 7;
                        break;
                    }
                case 7:
                    c0544Ii2 = c0544Ii2;
                    if ((c0544Ii2.A0E() & 1) == 0) {
                        numDepSub = 10;
                        break;
                    } else {
                        numDepSub = 8;
                        break;
                    }
                case 8:
                    strA0A = A0A(0, 14, 28);
                    numDepSub = 9;
                    break;
                case 9:
                    return Format.A07(str, strA0A, null, -1, -1, channelCount, nextByte, null, drmInitData, 0, str2);
                case 10:
                    strA0A2 = strA0A2;
                    strA0A = strA0A2;
                    numDepSub = 9;
                    break;
                case 11:
                    strA0A2 = strA0A2;
                    strA0A = strA0A2;
                    numDepSub = 9;
                    break;
                case 12:
                    channelCount = i;
                    numDepSub = 6;
                    break;
            }
        }
    }

    public static C0360Aj A09(C0543Ih c0543Ih) {
        String strA0A;
        int iA01;
        int i;
        int i2;
        int i3;
        int i4;
        int iA04;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iA03 = c0543Ih.A03();
        c0543Ih.A08(40);
        int i11 = c0543Ih.A04(5) == 16 ? 1 : 0;
        c0543Ih.A07(iA03);
        int i12 = -1;
        if (i11 != 0) {
            c0543Ih.A08(16);
            int iA042 = c0543Ih.A04(2);
            if (iA042 == 0) {
                i12 = 0;
            } else if (iA042 == 1) {
                i12 = 1;
            } else if (iA042 != 2) {
                i12 = -1;
            } else {
                i12 = 2;
            }
            c0543Ih.A08(3);
            iA01 = (c0543Ih.A04(11) + 1) * 2;
            int iA043 = c0543Ih.A04(2);
            if (iA043 == 3) {
                iA04 = 3;
                i2 = A05[c0543Ih.A04(2)];
                i5 = 6;
            } else {
                iA04 = c0543Ih.A04(2);
                i5 = A02[iA04];
                i2 = A04[iA043];
            }
            i3 = i5 * 256;
            int iA044 = c0543Ih.A04(3);
            boolean zA0F = c0543Ih.A0F();
            i4 = A03[iA044] + (zA0F ? 1 : 0);
            c0543Ih.A08(10);
            if (c0543Ih.A0F()) {
                c0543Ih.A08(8);
            }
            if (iA044 == 0) {
                c0543Ih.A08(5);
                if (c0543Ih.A0F()) {
                    c0543Ih.A08(8);
                }
            }
            if (i12 == 1 && c0543Ih.A0F()) {
                c0543Ih.A08(16);
            }
            if (c0543Ih.A0F()) {
                if (iA044 > 2) {
                    c0543Ih.A08(2);
                }
                if ((iA044 & 1) != 0 && iA044 > 2) {
                    i9 = 6;
                    c0543Ih.A08(6);
                } else {
                    i9 = 6;
                }
                if ((iA044 & 4) != 0) {
                    c0543Ih.A08(i9);
                }
                if (zA0F && c0543Ih.A0F()) {
                    c0543Ih.A08(5);
                }
                if (i12 == 0) {
                    if (c0543Ih.A0F()) {
                        i10 = 6;
                        c0543Ih.A08(6);
                    } else {
                        i10 = 6;
                    }
                    if (iA044 == 0 && c0543Ih.A0F()) {
                        c0543Ih.A08(i10);
                    }
                    if (c0543Ih.A0F()) {
                        c0543Ih.A08(i10);
                    }
                    int iA045 = c0543Ih.A04(2);
                    if (iA045 == 1) {
                        c0543Ih.A08(5);
                    } else if (iA045 == 2) {
                        c0543Ih.A08(12);
                    } else if (iA045 == 3) {
                        int iA046 = c0543Ih.A04(5);
                        if (c0543Ih.A0F()) {
                            c0543Ih.A08(5);
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(4);
                            }
                            if (c0543Ih.A0F()) {
                                if (c0543Ih.A0F()) {
                                    c0543Ih.A08(4);
                                }
                                if (c0543Ih.A0F()) {
                                    c0543Ih.A08(4);
                                }
                            }
                        }
                        if (c0543Ih.A0F()) {
                            c0543Ih.A08(5);
                            if (c0543Ih.A0F()) {
                                c0543Ih.A08(7);
                                if (c0543Ih.A0F()) {
                                    c0543Ih.A08(8);
                                }
                            }
                        }
                        c0543Ih.A08((iA046 + 2) * 8);
                        c0543Ih.A05();
                    }
                    if (iA044 < 2) {
                        if (c0543Ih.A0F()) {
                            c0543Ih.A08(14);
                        }
                        if (iA044 == 0 && c0543Ih.A0F()) {
                            c0543Ih.A08(14);
                        }
                    }
                    if (c0543Ih.A0F()) {
                        if (iA04 == 0) {
                            c0543Ih.A08(5);
                        } else {
                            for (int i13 = 0; i13 < i5; i13++) {
                                if (c0543Ih.A0F()) {
                                    c0543Ih.A08(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c0543Ih.A0F()) {
                c0543Ih.A08(5);
                if (iA044 == 2) {
                    c0543Ih.A08(4);
                }
                if (iA044 >= 6) {
                    c0543Ih.A08(2);
                }
                if (c0543Ih.A0F()) {
                    i8 = 8;
                    c0543Ih.A08(8);
                } else {
                    i8 = 8;
                }
                if (iA044 == 0 && c0543Ih.A0F()) {
                    c0543Ih.A08(i8);
                }
                i6 = 3;
                if (iA043 < 3) {
                    c0543Ih.A06();
                }
            } else {
                i6 = 3;
            }
            if (i12 == 0 && iA04 != i6) {
                c0543Ih.A06();
            }
            if (i12 == 2) {
                if (iA04 == i6 || c0543Ih.A0F()) {
                    i7 = 6;
                    c0543Ih.A08(6);
                } else {
                    i7 = 6;
                }
            } else {
                i7 = 6;
            }
            strA0A = A0A(23, 10, 109);
            if (c0543Ih.A0F() && c0543Ih.A04(i7) == 1 && c0543Ih.A04(8) == 1) {
                strA0A = A0A(0, 14, 28);
            }
        } else {
            strA0A = A0A(14, 9, 2);
            c0543Ih.A08(32);
            int iA047 = c0543Ih.A04(2);
            iA01 = A01(iA047, c0543Ih.A04(6));
            c0543Ih.A08(8);
            int iA048 = c0543Ih.A04(3);
            if ((iA048 & 1) != 0 && iA048 != 1) {
                i = 2;
                c0543Ih.A08(2);
            } else {
                i = 2;
            }
            if ((iA048 & 4) != 0) {
                c0543Ih.A08(i);
            }
            if (iA048 == i) {
                c0543Ih.A08(i);
            }
            i2 = A04[iA047];
            i3 = 1536;
            i4 = A03[iA048] + (c0543Ih.A0F() ? 1 : 0);
        }
        return new C0360Aj(strA0A, i12, i4, i2, iA01, i3);
    }
}
