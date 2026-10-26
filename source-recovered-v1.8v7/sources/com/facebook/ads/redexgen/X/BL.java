package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BL {
    public static byte[] A00;
    public static final int[] A01;
    public static final int[] A02;
    public static final int[] A03;

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A00 = new byte[]{-65, -45, -62, -57, -51, -115, -44, -52, -62, -116, -62, -46, -47};
    }

    static {
        A06();
        A01 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A02 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A03 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int i = 0;
        int iPosition = byteBuffer.position();
        byte b2 = byteBuffer.get(iPosition);
        int nblks = b2 != -2 ? 2 : 8;
        while (true) {
            switch (nblks) {
                case 2:
                    if (b2 == -1) {
                        nblks = 7;
                        break;
                    } else {
                        nblks = 3;
                        break;
                    }
                case 3:
                    if (b2 == 31) {
                        nblks = 6;
                        break;
                    } else {
                        nblks = 4;
                        break;
                    }
                case 4:
                    byteBuffer = byteBuffer;
                    i = ((byteBuffer.get(iPosition + 4) & 1) << 6) | ((byteBuffer.get(iPosition + 5) & 252) >> 2);
                    nblks = 5;
                    break;
                case 5:
                    int nblks2 = i + 1;
                    return nblks2 * 32;
                case 6:
                    byteBuffer = byteBuffer;
                    i = ((byteBuffer.get(iPosition + 5) & 7) << 4) | ((byteBuffer.get(iPosition + 6) & 60) >> 2);
                    nblks = 5;
                    break;
                case 7:
                    byteBuffer = byteBuffer;
                    i = ((byteBuffer.get(iPosition + 4) & 7) << 4) | ((byteBuffer.get(iPosition + 7) & 60) >> 2);
                    nblks = 5;
                    break;
                case 8:
                    byteBuffer = byteBuffer;
                    i = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                    nblks = 5;
                    break;
            }
        }
    }

    public static int A01(byte[] bArr) {
        int fsize = 0;
        int i = 0;
        boolean z = false;
        byte b2 = bArr[0];
        char c2 = b2 != -2 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (b2 == -1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (b2 == 31) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    i = (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                    c2 = 5;
                    break;
                case 5:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    fsize = (i * 16) / 14;
                    c2 = 7;
                    break;
                case 7:
                    return fsize;
                case '\b':
                    fsize = i;
                    c2 = 7;
                    break;
                case '\t':
                    bArr = bArr;
                    i = (((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                    z = true;
                    c2 = 5;
                    break;
                case '\n':
                    bArr = bArr;
                    i = (((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[9] & 60) >> 2)) + 1;
                    z = true;
                    c2 = 5;
                    break;
                case 11:
                    bArr = bArr;
                    i = (((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                    c2 = 5;
                    break;
            }
        }
    }

    public static int A02(byte[] bArr) {
        byte b2 = 0;
        int i = 0;
        byte b3 = bArr[0];
        char c2 = b3 != -2 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    b2 = 7;
                    if (b3 == -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (b3 == 31) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    i = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
                    c2 = 5;
                    break;
                case 5:
                    return (i + 1) * 32;
                case 6:
                    bArr = bArr;
                    i = ((bArr[5] & b2) << 4) | ((bArr[6] & 60) >> 2);
                    c2 = 5;
                    break;
                case 7:
                    bArr = bArr;
                    i = ((bArr[4] & b2) << 4) | ((bArr[b2] & 60) >> 2);
                    c2 = 5;
                    break;
                case '\b':
                    bArr = bArr;
                    i = ((bArr[5] & 1) << 6) | ((bArr[4] & 252) >> 2);
                    c2 = 5;
                    break;
            }
        }
    }

    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int i = 0;
        int i2 = 0;
        C0543Ih c0543IhA04 = A04(bArr);
        c0543IhA04.A08(60);
        int i3 = A01[c0543IhA04.A04(6)];
        int i4 = A02[c0543IhA04.A04(4)];
        int iA04 = c0543IhA04.A04(5);
        int[] iArr = A03;
        int rate = iArr.length;
        int rate2 = iA04 >= rate ? 2 : 7;
        while (true) {
            switch (rate2) {
                case 2:
                    i2 = -1;
                    rate2 = 3;
                    break;
                case 3:
                    c0543IhA04 = c0543IhA04;
                    c0543IhA04.A08(10);
                    int bitrate = c0543IhA04.A04(2);
                    if (bitrate <= 0) {
                        rate2 = 6;
                        break;
                    } else {
                        rate2 = 4;
                        break;
                    }
                case 4:
                    i = 1;
                    rate2 = 5;
                    break;
                case 5:
                    return Format.A07(str, A05(0, 13, 28), null, i2, -1, i3 + i, i4, null, drmInitData, 0, str2);
                case 6:
                    i = 0;
                    rate2 = 5;
                    break;
                case 7:
                    iArr = iArr;
                    int bitrate2 = iArr[iA04];
                    i2 = (bitrate2 * AdError.NETWORK_ERROR_CODE) / 2;
                    rate2 = 3;
                    break;
            }
        }
    }

    public static C0543Ih A04(byte[] bArr) {
        C0543Ih frameBits = null;
        C0543Ih c0543Ih = null;
        int i = 0;
        byte[] bArrCopyOf = null;
        char c2 = bArr[0] == Byte.MAX_VALUE ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new C0543Ih(bArr);
                case 3:
                    bArr = bArr;
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    if (!A08(bArrCopyOf)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    bArrCopyOf = bArrCopyOf;
                    if (i >= bArrCopyOf.length - 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    bArrCopyOf = bArrCopyOf;
                    byte b2 = bArrCopyOf[i];
                    bArrCopyOf[i] = bArrCopyOf[i + 1];
                    bArrCopyOf[i + 1] = b2;
                    i += 2;
                    c2 = 5;
                    break;
                case 7:
                    bArrCopyOf = bArrCopyOf;
                    c0543Ih = new C0543Ih(bArrCopyOf);
                    if (bArrCopyOf[0] != 31) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    bArrCopyOf = bArrCopyOf;
                    frameBits = new C0543Ih(bArrCopyOf);
                    c2 = '\t';
                    break;
                case '\t':
                    frameBits = frameBits;
                    if (frameBits.A01() < 16) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0543Ih = c0543Ih;
                    frameBits = frameBits;
                    frameBits.A08(2);
                    c0543Ih.A0A(frameBits.A04(14), 14);
                    c2 = '\t';
                    break;
                case 11:
                    C0543Ih c0543Ih2 = c0543Ih;
                    c0543Ih2.A0B(bArrCopyOf);
                    return c0543Ih2;
            }
        }
    }

    public static boolean A07(int i) {
        boolean z = false;
        char c2 = i != 2147385345 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == -25230976) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 536864768) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i != -14745368) {
                        c2 = 7;
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
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    public static boolean A08(byte[] bArr) {
        boolean z = false;
        char c2 = bArr[0] != -2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    bArr = bArr;
                    if (bArr[z ? 1 : 0] != -1) {
                        c2 = 4;
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
                    return z;
            }
        }
    }
}
