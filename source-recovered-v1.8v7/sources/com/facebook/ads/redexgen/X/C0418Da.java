package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import d.b.a.b.k;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0418Da {
    public static byte[] A07;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities A00;

    @Nullable
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A07 = new byte[]{78, 69, 76, 67, 67, 72, 65, 110, 66, 88, 67, 89, 3, 76, 110, 76, 93, 94, 46, 34, 99, 30, 101, 11, 31, 14, 3, 5, 69, 13, 25, 7, 48, 61, 56, 54, 63, Byte.MAX_VALUE, 50, 48, 33, 34, 53, 33, 48, 61, 59, 123, 53, 55, 103, 20, 14, 29, 2, 38, 9, 3, 53, 6, 19, 2, 73, 17, 36, 6, 23, 20, 39, 51, 34, 47, 41, 105, 33, 113, 119, 119, 107, 39, 42, 39, 49, 55, 33, 39, 49, 54, 33, 105, 52, 40, 37, 61, 38, 37, 39, 47, 44, 49, 35, 47, 50, 46, 39, 16, 35, 54, 39, 108, 33, 35, 50, 49, 89, 67, 80, 79, 107, 68, 78, 120, 75, 94, 79, 4, 88, 69, 94, 75, 94, 79, 78, 6, 10, 88, 76, 93, 80, 86, 22, 94, 14, 8, 8, 20, 84, 85, 88, 78, 122, 118, 125, 124, 122, 55, 116, 112, 116, 124, 57, 63, 30, 34, 4, 1, 1, 30, 3, 5, 81, 42, 53, 52, 47, 47, 36, 45, 36, 37, 108, 49, 45, 32, 56, 35, 32, 34, 42, 95, 82, 87, 89, 80, 16, 72, 125, 95, 78, 77, 118, 15, 27, 10, 7, 1, 65, 24, 1, 28, 12, 7, 29, 34, 16, 16, 22, 14, 6, 7, 48, 22, 19, 19, 12, 17, 23, 67, 56, 112, 100, 117, 120, 126, 62, 119, 125, 112, 114, 75, 81, 66, 93, 121, 86, 92, 106, 89, 76, 93, 22, 91, 89, 72, 75, 103, 79, 78, 67, 75, 105, 69, 78, 79, 73, 99, 68, 76, 69, 64, 114, 114, 116, 108, 100, 101, 76, 96, 121, 66, 105, 96, 111, 111, 100, 109, 64, 101, 107, 116, 114, 117, 108, 100, 111, 117, 59, 33, 25, 21, 110, 110, 107, 110, Byte.MAX_VALUE, 123, 102, 121, 106, 34, Byte.MAX_VALUE, 99, 110, 118, 109, 110, 108, 100, 20, 0, 17, 28, 26, 90, 16, 20, 22, 70, 16, 10, 25, 6, 34, 13, 7, 49, 2, 23, 6, 77, 16, 22, 19, 19, 12, 17, 23, 79, 67, 45, 38, 47, 32, 32, 43, 34, 13, 33, 59, 32, 58, 96, 61, 59, 62, 62, 33, 60, 58, 98, 110, 100, 112, 97, 108, 106, 42, 104, 117, 96, 98, 39, 53, 57, 36, 56, 49, 6, 53, 32, 49, 122, 53, 23, 53, 36, 39, 120, 116, Byte.MAX_VALUE, 126, 120, 53, 107, 105, 116, 125, 114, 119, 126, 87, 126, 109, 126, 119, 55, 59, 43, 63, 46, 35, 37, 101, 43, 39, 56, 103, 61, 40, 4, 80, 75, 4, 117, 97, 112, 125, 123, 59, 121, 100, 32, 117, 57, 120, 117, 96, 121, 11, 25, 21, 8, 20, 29, 42, 25, 12, 29, 86, 11, 13, 8, 8, 23, 10, 12, 84, 88, 15, 4, 13, 2, 2, 9, 0, 47, 3, 25, 2, 24, 66, 15, 13, 28, 31, 90, 78, 95, 82, 84, 20, 73, 90, 76, 90, 78, 95, 82, 84, 20, 8, 92, 75, 75, 125, 105, 120, 117, 115, 51, 115, 108, 105, 111};
    }

    public C0418Da(String str, @Nullable String str2, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.A02 = (String) IJ.A01(str);
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A04 = z;
        boolean z4 = true;
        this.A03 = (z2 || codecCapabilities == null || !A07(codecCapabilities)) ? false : true;
        this.A06 = codecCapabilities != null && A0B(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !A09(codecCapabilities))) {
            z4 = false;
        }
        this.A05 = z4;
    }

    public static int A00(String str, String str2, int i) {
        int i2 = 0;
        char c2 = i <= 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (C0560Iy.A01 < 26) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i;
                case 5:
                    str2 = str2;
                    if (!A03(371, 10, 14).equals(str2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 6:
                    str2 = str2;
                    if (!A03(494, 10, 48).equals(str2)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 7:
                    str2 = str2;
                    if (!A03(417, 12, 65).equals(str2)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case '\b':
                    str2 = str2;
                    if (!A03(433, 15, 31).equals(str2)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case '\t':
                    str2 = str2;
                    if (!A03(201, 12, 101).equals(str2)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case '\n':
                    str2 = str2;
                    if (!A03(504, 10, 23).equals(str2)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 11:
                    str2 = str2;
                    if (!A03(485, 9, 48).equals(str2)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case '\f':
                    str2 = str2;
                    if (!A03(229, 10, 26).equals(str2)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case '\r':
                    str2 = str2;
                    if (!A03(68, 15, 77).equals(str2)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 14:
                    str2 = str2;
                    if (!A03(135, 15, 50).equals(str2)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 15:
                    str2 = str2;
                    if (!A03(23, 9, 97).equals(str2)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return i;
                case 17:
                    str2 = str2;
                    if (!A03(42, 9, 95).equals(str2)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    i2 = 6;
                    c2 = 19;
                    break;
                case 19:
                    Log.w(A03(255, 14, 33), A03(269, 29, 10) + str + A03(298, 3, 62) + i + A03(429, 4, 47) + i2 + A03(200, 1, 32));
                    return i2;
                case 20:
                    str2 = str2;
                    if (!A03(318, 10, 126).equals(str2)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    i2 = 16;
                    c2 = 19;
                    break;
                case 22:
                    i2 = 30;
                    c2 = 19;
                    break;
            }
        }
    }

    public static C0418Da A01(String str) {
        return new C0418Da(str, null, null, true, false, false);
    }

    public static C0418Da A02(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C0418Da(str, str2, codecCapabilities, false, z, z2);
    }

    private void A05(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(A03(213, 16, 104));
        sb.append(str);
        String strA03 = A03(20, 3, 53);
        sb.append(strA03);
        sb.append(this.A02);
        sb.append(A03(18, 2, 9));
        sb.append(this.A01);
        sb.append(strA03);
        sb.append(C0560Iy.A03);
        sb.append(A03(200, 1, 32));
        sb.toString();
    }

    private void A06(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(A03(161, 11, k.AppCompatTheme_windowMinWidthMajor));
        sb.append(str);
        String strA03 = A03(20, 3, 53);
        sb.append(strA03);
        sb.append(this.A02);
        sb.append(A03(18, 2, 9));
        sb.append(this.A01);
        sb.append(strA03);
        sb.append(C0560Iy.A03);
        sb.append(A03(200, 1, 32));
        sb.toString();
    }

    public static boolean A07(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z = false;
        char c2 = C0560Iy.A01 >= 19 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    codecCapabilities = codecCapabilities;
                    if (!A08(codecCapabilities)) {
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
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @TargetApi(19)
    public static boolean A08(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(301, 17, 4));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z = false;
        char c2 = C0560Iy.A01 >= 21 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    codecCapabilities = codecCapabilities;
                    if (!A0A(codecCapabilities)) {
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
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @TargetApi(21)
    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(83, 15, 79));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z = false;
        char c2 = C0560Iy.A01 >= 21 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    codecCapabilities = codecCapabilities;
                    if (!A0C(codecCapabilities)) {
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
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @TargetApi(21)
    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(172, 17, 74));
    }

    @TargetApi(21)
    public static boolean A0D(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        boolean zAreSizeAndRateSupported = false;
        char c2 = d2 != -1.0d ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (d2 > 0.0d) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    videoCapabilities = videoCapabilities;
                    zAreSizeAndRateSupported = videoCapabilities.isSizeSupported(i, i2);
                    c2 = 4;
                    break;
                case 4:
                    return zAreSizeAndRateSupported;
                case 5:
                    videoCapabilities = videoCapabilities;
                    zAreSizeAndRateSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d2);
                    c2 = 4;
                    break;
            }
        }
    }

    @TargetApi(21)
    public final Point A0E(int widthAlignment, int heightAlignment) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = null;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        char c2 = codecCapabilities == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    A06(A03(32, 10, 90));
                    return (Point) null;
                case 3:
                    codecCapabilities = codecCapabilities;
                    videoCapabilities = codecCapabilities.getVideoCapabilities();
                    if (videoCapabilities != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    A06(A03(189, 11, 53));
                    return (Point) null;
                case 5:
                    MediaCodecInfo.VideoCapabilities videoCapabilities2 = videoCapabilities;
                    int widthAlignment2 = videoCapabilities2.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities2.getHeightAlignment();
                    return new Point(C0560Iy.A04(widthAlignment, widthAlignment2) * widthAlignment2, C0560Iy.A04(heightAlignment, heightAlignment2) * heightAlignment2);
            }
        }
    }

    @TargetApi(21)
    public final boolean A0F(int i) {
        C0418Da c0418Da = this;
        MediaCodecInfo.AudioCapabilities audioCapabilities = null;
        MediaCodecInfo.CodecCapabilities codecCapabilities = c0418Da.A00;
        char c2 = codecCapabilities == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0418Da.A06(A03(468, 17, 103));
                    return false;
                case 3:
                    codecCapabilities = codecCapabilities;
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0418Da.A06(A03(0, 18, 38));
                    return false;
                case 5:
                    c0418Da = c0418Da;
                    audioCapabilities = audioCapabilities;
                    if (A00(c0418Da.A02, c0418Da.A01, audioCapabilities.getMaxInputChannelCount()) >= i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0418Da.A06(A03(349, 22, 69) + i);
                    return false;
                case 7:
                    return true;
            }
        }
    }

    @TargetApi(21)
    public final boolean A0G(int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = null;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        char c2 = codecCapabilities == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    A06(A03(99, 15, 73));
                    return false;
                case 3:
                    codecCapabilities = codecCapabilities;
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    A06(A03(381, 16, 95));
                    return false;
                case 5:
                    audioCapabilities = audioCapabilities;
                    if (!audioCapabilities.isSampleRateSupported(i)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    A06(A03(448, 20, k.AppCompatTheme_windowActionBar) + i);
                    return false;
                case 7:
                    return true;
            }
        }
    }

    @TargetApi(21)
    public final boolean A0H(int i, int i2, double d2) {
        C0418Da c0418Da = this;
        MediaCodecInfo.VideoCapabilities videoCapabilities = null;
        String strA03 = null;
        MediaCodecInfo.CodecCapabilities codecCapabilities = c0418Da.A00;
        char c2 = codecCapabilities == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0418Da.A06(A03(239, 16, 51));
                    return false;
                case 3:
                    codecCapabilities = codecCapabilities;
                    videoCapabilities = codecCapabilities.getVideoCapabilities();
                    if (videoCapabilities != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0418Da.A06(A03(51, 17, 108));
                    return false;
                case 5:
                    videoCapabilities = videoCapabilities;
                    if (!A0D(videoCapabilities, i, i2, d2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 6:
                    strA03 = A03(98, 1, 95);
                    if (i >= i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    videoCapabilities = videoCapabilities;
                    if (!A0D(videoCapabilities, i2, i, d2)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    String str = strA03;
                    c0418Da.A06(A03(328, 21, 104) + i + str + i2 + str + d2);
                    return false;
                case '\t':
                    c0418Da = c0418Da;
                    strA03 = strA03;
                    c0418Da.A05(A03(k.AppCompatTheme_viewInflaterClass, 21, 33) + i + strA03 + i2 + strA03 + d2);
                    c2 = '\n';
                    break;
                case '\n':
                    return true;
            }
        }
    }

    public final boolean A0I(String codecMimeType) {
        C0418Da c0418Da = this;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = null;
        int length = 0;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA0J = null;
        Pair<Integer, Integer> pairA02 = null;
        int i = 0;
        String strA06 = null;
        String strA03 = null;
        char c2 = codecMimeType != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0418Da = c0418Da;
                    if (c0418Da.A01 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return true;
                case 4:
                    codecMimeType = codecMimeType;
                    strA06 = C0537Ib.A06(codecMimeType);
                    if (strA06 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    c0418Da = c0418Da;
                    strA06 = strA06;
                    boolean zEquals = c0418Da.A01.equals(strA06);
                    strA03 = A03(18, 2, 9);
                    if (!zEquals) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c0418Da.A06(A03(150, 11, 18) + codecMimeType + strA03 + strA06);
                    return false;
                case '\b':
                    codecMimeType = codecMimeType;
                    pairA02 = C0426Dl.A02(codecMimeType);
                    if (pairA02 != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return true;
                case '\n':
                    c0418Da = c0418Da;
                    codecProfileLevelArrA0J = c0418Da.A0J();
                    length = codecProfileLevelArrA0J.length;
                    i = 0;
                    c2 = 11;
                    break;
                case 11:
                    if (i >= length) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    pairA02 = pairA02;
                    codecProfileLevelArrA0J = codecProfileLevelArrA0J;
                    codecProfileLevel = codecProfileLevelArrA0J[i];
                    if (codecProfileLevel.profile != ((Integer) pairA02.first).intValue()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    pairA02 = pairA02;
                    codecProfileLevel = codecProfileLevel;
                    if (codecProfileLevel.level < ((Integer) pairA02.second).intValue()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return true;
                case 15:
                    i++;
                    c2 = 11;
                    break;
                case 16:
                    c0418Da.A06(A03(397, 20, 16) + codecMimeType + strA03 + strA06);
                    return false;
            }
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0J() {
        C0418Da c0418Da = this;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = null;
        MediaCodecInfo.CodecCapabilities codecCapabilities = c0418Da.A00;
        char c2 = codecCapabilities != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    codecCapabilities = codecCapabilities;
                    if (codecCapabilities.profileLevels != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    c2 = 4;
                    break;
                case 4:
                    return codecProfileLevelArr;
                case 5:
                    c0418Da = c0418Da;
                    codecProfileLevelArr = c0418Da.A00.profileLevels;
                    c2 = 4;
                    break;
            }
        }
    }
}
