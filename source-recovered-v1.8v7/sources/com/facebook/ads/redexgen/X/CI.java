package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CI {
    public static byte[] A07;
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final String[] A0E;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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

    public static void A02() {
        A07 = new byte[]{51, 39, 54, 59, 61, 125, 63, 34, 55, 53, Byte.MAX_VALUE, 30, 99, 51, 39, 54, 59, 61, 125, 63, 34, 55, 53, Byte.MAX_VALUE, 30, 96, 92, 72, 89, 84, 82, 18, 80, 77, 88, 90};
    }

    static {
        A02();
        A0E = new String[]{A01(0, 13, 126), A01(13, 13, 126), A01(26, 10, 17)};
        A0D = new int[]{44100, 48000, 32000};
        A08 = new int[]{32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
        A0C = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
        A09 = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
        A0A = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
        A0B = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int version) {
        int bitrate = 0;
        int i = 0;
        int i2 = 0;
        int layer = 0;
        int bitrateIndex = 0;
        int samplingRateIndex = 0;
        int i3 = 0;
        int padding = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        char c2 = (version & (-2097152)) != -2097152 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    i5 = 3;
                    i8 = (version >>> 19) & 3;
                    layer = 1;
                    if (i8 != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return -1;
                case 5:
                    i2 = (version >>> 17) & i5;
                    if (i2 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return -1;
                case 7:
                    i7 = 15;
                    i6 = (version >>> 12) & 15;
                    if (i6 == 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i6 != i7) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return -1;
                case '\n':
                    i3 = (version >>> 10) & i5;
                    if (i3 != i5) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return -1;
                case '\f':
                    bitrateIndex = A0D[i3];
                    padding = 2;
                    if (i8 != 2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    bitrateIndex /= 2;
                    c2 = 14;
                    break;
                case 14:
                    i = (version >>> 9) & layer;
                    if (i2 != i5) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (i8 != i5) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i4 = A08[i6 - 1];
                    c2 = 17;
                    break;
                case 17:
                    return (((i4 * 12000) / bitrateIndex) + i) * 4;
                case 18:
                    i4 = A0C[i6 - 1];
                    c2 = 17;
                    break;
                case 19:
                    if (i8 != 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    bitrateIndex /= 4;
                    c2 = 14;
                    break;
                case 21:
                    if (i8 != i5) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (i2 != padding) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    samplingRateIndex = A09[i6 - 1];
                    c2 = 24;
                    break;
                case 24:
                    bitrate = 144000;
                    if (i8 != i5) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    return ((bitrate * samplingRateIndex) / bitrateIndex) + i;
                case 26:
                    samplingRateIndex = A0A[i6 - 1];
                    c2 = 24;
                    break;
                case 27:
                    samplingRateIndex = A0B[i6 - 1];
                    c2 = 24;
                    break;
                case 28:
                    if (i2 != layer) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    bitrate = 72000;
                    c2 = 30;
                    break;
                case 30:
                    return ((bitrate * samplingRateIndex) / bitrateIndex) + i;
            }
        }
    }

    private void A03(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = i6;
    }

    public static boolean A04(int i, CI ci) {
        int sampleRate = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int bitrate = 0;
        int i7 = 0;
        int layer = 0;
        int bitrateIndex = 0;
        int samplingRateIndex = 0;
        int frameSize = 0;
        int samplesPerFrame = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        char c2 = (i & (-2097152)) != -2097152 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    int samplingRateIndex2 = i >>> 19;
                    i3 = 3;
                    samplingRateIndex = samplingRateIndex2 & 3;
                    z = true;
                    if (samplingRateIndex != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    i10 = (i >>> 17) & 3;
                    if (i10 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    layer = 15;
                    bitrate = (i >>> 12) & 15;
                    if (bitrate == 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (bitrate != layer) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return false;
                case '\n':
                    i8 = (i >>> 10) & 3;
                    if (i8 != i3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return false;
                case '\f':
                    samplesPerFrame = A0D[i8];
                    i2 = 2;
                    if (samplingRateIndex != 2) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    samplesPerFrame /= 2;
                    c2 = 14;
                    break;
                case 14:
                    i11 = (i >>> 9) & 1;
                    if (i10 != i3) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (samplingRateIndex != i3) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i5 = A08[bitrate - 1];
                    c2 = 17;
                    break;
                case 17:
                    i7 = (((i5 * 12000) / samplesPerFrame) + i11) * 4;
                    i12 = 384;
                    bitrateIndex = i5;
                    c2 = 18;
                    break;
                case 18:
                    str = A0E[3 - i10];
                    if (((i >> 6) & i3) != i3) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    frameSize = 1;
                    c2 = 20;
                    break;
                case 20:
                    int version = bitrateIndex * AdError.NETWORK_ERROR_CODE;
                    ci.A03(samplingRateIndex, str, i7, samplesPerFrame, frameSize, version, i12);
                    return z;
                case 21:
                    frameSize = 2;
                    c2 = 20;
                    break;
                case 22:
                    i5 = A0C[bitrate - 1];
                    c2 = 17;
                    break;
                case 23:
                    i9 = 144000;
                    if (samplingRateIndex != i3) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    if (i10 != i2) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    i6 = A09[bitrate - 1];
                    c2 = 26;
                    break;
                case 26:
                    i12 = 1152;
                    i7 = ((i9 * i6) / samplesPerFrame) + i11;
                    bitrateIndex = i6;
                    c2 = 18;
                    break;
                case 27:
                    i6 = A0A[bitrate - 1];
                    c2 = 26;
                    break;
                case 28:
                    sampleRate = A0B[bitrate - 1];
                    if (i10 != z) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    i4 = 576;
                    c2 = 30;
                    break;
                case 30:
                    if (i10 != z) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    i9 = 72000;
                    c2 = ' ';
                    break;
                case ' ':
                    i7 = ((i9 * sampleRate) / samplesPerFrame) + i11;
                    bitrateIndex = sampleRate;
                    i12 = i4;
                    c2 = 18;
                    break;
                case '!':
                    i4 = 1152;
                    c2 = 30;
                    break;
                case '\"':
                    if (samplingRateIndex != 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    samplesPerFrame /= 4;
                    c2 = 14;
                    break;
            }
        }
    }
}
