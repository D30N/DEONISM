package com.facebook.ads.redexgen.X;

import android.util.Pair;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IN {
    public static byte[] A00;
    public static final byte[] A01;
    public static final int[] A02;
    public static final int[] A03;

    public static String A04(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{87, 108, 113, 119, 114, 114, 109, 112, 118, 103, 102, 34, 103, 114, 65, 109, 108, 100, 107, 101, 56, 34, 93, 102, 123, 125, 120, 120, 103, 122, 124, 109, 108, 40, 105, 125, 108, 97, 103, 40, 103, 106, 98, 109, 107, 124, 40, 124, 113, 120, 109, 50, 40};
    }

    static {
        A05();
        A01 = new byte[]{0, 0, 0, 1};
        A03 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A02 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C0543Ih c0543Ih) {
        int iA04 = c0543Ih.A04(5);
        if (iA04 == 31) {
            return c0543Ih.A04(6) + 32;
        }
        return iA04;
    }

    public static int A01(C0543Ih c0543Ih) {
        boolean z = false;
        int iA04 = 0;
        int iA042 = c0543Ih.A04(4);
        int samplingFrequency = iA042 == 15 ? 2 : 4;
        while (true) {
            switch (samplingFrequency) {
                case 2:
                    c0543Ih = c0543Ih;
                    iA04 = c0543Ih.A04(24);
                    samplingFrequency = 3;
                    break;
                case 3:
                    return iA04;
                case 4:
                    if (iA042 >= 13) {
                        samplingFrequency = 7;
                        break;
                    } else {
                        samplingFrequency = 5;
                        break;
                    }
                case 5:
                    z = true;
                    samplingFrequency = 6;
                    break;
                case 6:
                    IJ.A03(z);
                    iA04 = A03[iA042];
                    samplingFrequency = 3;
                    break;
                case 7:
                    z = false;
                    samplingFrequency = 6;
                    break;
            }
        }
    }

    public static Pair<Integer, Integer> A02(C0543Ih c0543Ih, boolean z) throws AF {
        int channelCount = 0;
        int i = 0;
        boolean z2 = false;
        int iA04 = 0;
        int i2 = 0;
        int iA00 = A00(c0543Ih);
        int iA01 = A01(c0543Ih);
        int iA042 = c0543Ih.A04(4);
        int channelConfiguration = iA00 != 5 ? 2 : 3;
        while (true) {
            switch (channelConfiguration) {
                case 2:
                    if (iA00 != 29) {
                        channelConfiguration = 5;
                        break;
                    } else {
                        channelConfiguration = 3;
                        break;
                    }
                case 3:
                    c0543Ih = c0543Ih;
                    iA01 = A01(c0543Ih);
                    iA00 = A00(c0543Ih);
                    if (iA00 != 22) {
                        channelConfiguration = 5;
                        break;
                    } else {
                        channelConfiguration = 4;
                        break;
                    }
                case 4:
                    c0543Ih = c0543Ih;
                    iA042 = c0543Ih.A04(4);
                    channelConfiguration = 5;
                    break;
                case 5:
                    z2 = true;
                    if (!z) {
                        channelConfiguration = 16;
                        break;
                    } else {
                        channelConfiguration = 6;
                        break;
                    }
                case 6:
                    i = 3;
                    i2 = 2;
                    if (iA00 == z2) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 7;
                        break;
                    }
                case 7:
                    if (iA00 == i2) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 8;
                        break;
                    }
                case 8:
                    if (iA00 == i) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 9;
                        break;
                    }
                case 9:
                    if (iA00 == 4) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 10;
                        break;
                    }
                case 10:
                    if (iA00 == 6) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 11;
                        break;
                    }
                case 11:
                    if (iA00 == 7) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 12;
                        break;
                    }
                case 12:
                    if (iA00 == 17) {
                        channelConfiguration = 15;
                        break;
                    } else {
                        channelConfiguration = 13;
                        break;
                    }
                case 13:
                    switch (iA00) {
                        case 19:
                            channelConfiguration = 15;
                            break;
                        case 20:
                            channelConfiguration = 15;
                            break;
                        case 21:
                            channelConfiguration = 15;
                            break;
                        case 22:
                            channelConfiguration = 15;
                            break;
                        case 23:
                            channelConfiguration = 15;
                            break;
                        default:
                            channelConfiguration = 14;
                            break;
                    }
                case 14:
                    throw new AF(A04(22, 31, 89) + iA00);
                case 15:
                    c0543Ih = c0543Ih;
                    A06(c0543Ih, iA00, iA042);
                    switch (iA00) {
                        case 17:
                            channelConfiguration = 19;
                            break;
                        case 18:
                            channelConfiguration = 16;
                            break;
                        case 19:
                            channelConfiguration = 19;
                            break;
                        case 20:
                            channelConfiguration = 19;
                            break;
                        case 21:
                            channelConfiguration = 19;
                            break;
                        case 22:
                            channelConfiguration = 19;
                            break;
                        case 23:
                            channelConfiguration = 19;
                            break;
                        default:
                            channelConfiguration = 16;
                            break;
                    }
                case 16:
                    channelCount = A02[iA042];
                    if (channelCount == -1) {
                        channelConfiguration = 18;
                        break;
                    } else {
                        channelConfiguration = 17;
                        break;
                    }
                case 17:
                    IJ.A03(z2);
                    return Pair.create(Integer.valueOf(iA01), Integer.valueOf(channelCount));
                case 18:
                    z2 = false;
                    channelConfiguration = 17;
                    break;
                case 19:
                    c0543Ih = c0543Ih;
                    iA04 = c0543Ih.A04(i2);
                    if (iA04 == i2) {
                        channelConfiguration = 21;
                        break;
                    } else {
                        channelConfiguration = 20;
                        break;
                    }
                case 20:
                    if (iA04 == i) {
                        channelConfiguration = 21;
                        break;
                    } else {
                        channelConfiguration = 16;
                        break;
                    }
                case 21:
                    throw new AF(A04(0, 22, 83) + iA04);
            }
        }
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws AF {
        return A02(new C0543Ih(bArr), false);
    }

    public static void A06(C0543Ih c0543Ih, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        boolean zA0F = false;
        c0543Ih.A08(1);
        char c2 = c0543Ih.A0F() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(14);
                    c2 = 3;
                    break;
                case 3:
                    c0543Ih = c0543Ih;
                    zA0F = c0543Ih.A0F();
                    if (i2 == 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i4 = 20;
                    i3 = 3;
                    if (i == 6) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != i4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(i3);
                    c2 = 7;
                    break;
                case 7:
                    if (!zA0F) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i != 22) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(16);
                    c2 = '\n';
                    break;
                case '\n':
                    if (i == 17) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i == 19) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i == i4) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i != 23) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(i3);
                    c2 = 15;
                    break;
                case 15:
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(1);
                    c2 = 16;
                    break;
                case 16:
                    return;
                case 17:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static byte[] A07(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & k.AppCompatTheme_windowFixedWidthMajor))};
    }

    public static byte[] A08(byte[] bArr, int i, int i2) {
        byte[] bArr2 = A01;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, A01.length, i2);
        return bArr3;
    }
}
