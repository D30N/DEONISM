package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0426Dl {
    public static int A00;
    public static byte[] A01;
    public static final SparseIntArray A02;
    public static final SparseIntArray A03;
    public static final C0418Da A04;
    public static final HashMap<C0423Di, List<C0418Da>> A05;
    public static final Map<String, Integer> A06;
    public static final Pattern A07;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A01 = new byte[]{14, 12, 25, 111, 12, 21, 10, 111, 0, 20, 5, 8, 14, 111, 5, 4, 2, 14, 5, 4, 19, 111, 0, 0, 2, 4, 6, 19, 101, 24, 14, 8, 101, 6, 27, 120, 101, 15, 46, 40, 36, 47, 46, 57, 66, 59, 50, 58, 113, 123, 98, 115, 115, 113, 118, 87, 81, 93, 86, 87, 64, 97, 113, 100, 1, 3, 115, 14, 10, 9, 22, 108, 105, 3, 23, 6, 11, 13, 77, 7, 3, 1, 81, 79, 8, 13, 1, 108, 110, 123, 13, 82, 64, 76, 78, 13, 85, 74, 71, 70, 76, 13, 71, 70, 64, 76, 71, 70, 81, 13, 85, 83, 27, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 106, 103, 109, 100, 121, 102, 110, 111, 43, 67, 78, 93, 72, 43, 104, 100, 111, 110, 104, 43, 120, Byte.MAX_VALUE, 121, 98, 101, 108, 49, 43, 5, 10, 120, Byte.MAX_VALUE, 121, 125, 54, 77, 78, 100, 123, 108, 113, 114, 106, 123, 126, 105, 124, 46, 121, 11, 15, 10, 15, 14, 123, 123, 125, Byte.MAX_VALUE, 106, 103, 116, 51, 92, 86, 79, 73, 112, 109, 125, 118, 108, 91, 122, 124, 112, 123, 122, 109, 32, 93, 94, 92, 121, 65, 67, 90, 90, 67, 68, 77, 10, 73, 69, 78, 79, 73, 10, 47, 35, 48, 43, 44, 39, 46, 54, 39, 35, 54, 54, 78, 59, 59, 61, 59, 78, 94, 48, 45, 40, 90, 124, 126, 107, 29, 96, 118, 112, 29, 69, 67, 11, 29, 87, 86, 80, 37, 84, 94, 58, 39, 68, 51, 18, 20, 24, 19, 18, 5, 20, 11, 0, 2, 26, 11, 10, 8, 8, 74, 101, 94, 91, 94, 95, 71, 94, 16, 120, 117, 102, 115, 16, 64, 66, 95, 86, 89, 92, 85, 16, 67, 68, 66, 89, 94, 87, 10, 16, 48, 50, 39, 81, 44, 58, 60, 81, 30, 30, 28, 81, 27, 26, 28, 46, 48, 37, 119, 104, 17, 24, 22, 79, 77, 88, 46, 69, 120, 121, 110, 111, 115, 46, 65, 86, 67, 46, 68, 101, 99, 111, 100, 101, 114, 11, 9, 28, 106, 35, 43, 43, 35, 40, 33, 106, 54, 37, 51, 106, 32, 33, 39, 43, 32, 33, 54, 122, 7, 4, 5, 52, 34, 53, 53, 38, 41, 40, 10, 21, 16, 16, 25, 31, 78, 100, 97, 34, 40, 85, 81, 84, 12, 117, 118, 119, 108, 110, 123, 13, 82, 64, 76, 78, 13, 66, 86, 71, 74, 76, 13, 71, 70, 64, 76, 71, 70, 81, 13, 66, 66, 64, 41, 84, 93, 83, 108, 58, 20, 47, 42, 47, 46, 54, 47, 97, 0, 23, 2, 97, 45, 36, 55, 36, 45, 123, 97, 92, 87, 65, 92, 90, 87, 62, 75, 70, 32, 115, 66, 74, 68, 70, 66, 120, 114, 107, 122, 118, 105, 117, 121, Byte.MAX_VALUE, 94, 88, 84, 95, 94, 73, 125, 97, 3, 30, 28, 107, 0, 40, 41, 36, 44, 14, 34, 41, 40, 46, 24, 57, 36, 33, 33, 119, 112, 21, 27, 122, 72, 72, 78, 86, 82, 85, 92, 1, 27, 20, 22, 11, 16, 11, 17, 5, 122, 121, 126, 3, 7, 1, 0, 8, 70, 65, 73, 76, 69, 68, 0, 84, 79, 0, 81, 85, 69, 82, 89, 0, 67, 65, 80, 65, 66, 73, 76, 73, 84, 73, 69, 83, 9, 41, 54, 59, 58, 48, 112, 62, 41, 60, 101, 122, Byte.MAX_VALUE, Byte.MAX_VALUE, 118, 60, 66, 71, 28, 16, 26, 2, 19, 105, 107, 126, 8, 107, 114, 109, 8, 103, 115, 98, 111, 105, 8, 98, 99, 101, 105, 98, 99, 116, 8, 116, 103, 113, Byte.MAX_VALUE, 125, 104, 30, 117, 72, 73, 94, 95, 67, 30, 113, 113, 115, 30, 116, 85, 83, 95, 84, 85, 66, 12, 19, 4, 25, 16, 26, 2, 19, 60, 70, 64, 31, 29, 8, 126, 33, 51, 63, 61, 126, 49, 37, 52, 57, 63, 126, 52, 53, 51, 63, 52, 53, 34, 126, 61, 32, 99, 6, 4, 17, 103, 4, 29, 2, 103, 8, 28, 13, 0, 6, 103, 13, 12, 10, 6, 13, 12, 27, 103, 13, 26, 25, 8, 10, 122, 23, 5, 9, 23, 17, 10, 3, 110, 19, 26, 18, 86, 66, 83, 94, 88, 24, 82, 86, 84, 4, 31, 52, 41, 36, 34, 113, 96, 97, 11, 121, 126, 120, 125, 117, 125, 105, 100, 61, 55, 46, 51, 46, 77, 58, 27, 29, 17, 26, 27, 12, 90, 47, 47, 41, 42, 74, 52, 50, 15, 24, 13, 92, 42, 88, 92, 89, 93, 81, 36, 36, 35, 36, 6, 40, 33, 32, 61, 38, 33, 40, 111, 34, 46, 35, 41, 32, 61, 34, 42, 43, 111, 14, 25, 12, 111, 44, 32, 43, 42, 44, 111, 60, 59, 61, 38, 33, 40, 117, 111, 98, 89, 92, 89, 88, 64, 89, 23, 118, 97, 116, 23, 71, 69, 88, 81, 94, 91, 82, 13, 23, 107, 121, 118, 108, 119, 107, 36, 93, 89, 95, 103, 64, 72, 77, 68, 69, 1, 85, 78, 1, 80, 84, 68, 83, 88, 1, 66, 78, 69, 68, 66, 1, 65, 51, 59, 57, 44, 90, 49, 12, 13, 26, 27, 7, 90, 53, 34, 55, 90, 48, 17, 23, 27, 16, 17, 6, 90, 7, 17, 23, 1, 6, 17, 35, 51, 93, 64, 68, 55, 123, 6, 15, 4, 26, 99, 106, 97, 68, 0, 93, 40, 33, 12, 115, 118, 40, 118, 15, 11, 8, 110, 108, 116, 15, 24, 108, 84, 27, 25, 20, 95, 42, 32, 113, 113, 115, 116, 85, 83, 95, 84, 85, 66, 63, 70, 69, 71, 104, 64, 65, 76, 68, 102, 74, 65, 64, 70, 105, 76, 86, 81, 5, 100, 117, 108, 5, 65, 76, 65, 75, 2, 81, 5, 73, 76, 86, 81, 5, 86, 64, 70, 80, 87, 64, 5, 65, 64, 70, 74, 65, 64, 87, 5, 67, 74, 87, 31, 5, 
        108, 21, 17, 20, 71, 67, 71, 32, 48, 106, 81, 84, 81, 80, 72, 81, 31, 119, 122, 105, 124, 31, 83, 90, 73, 90, 83, 31, 76, 75, 77, 86, 81, 88, 5, 31, 26, 5, 0, 0, 9, 28, 0, 25, 31, 81, 32, 41, 4, 12, 11, 86, 64, 70, 80, 87, 64};
    }

    static {
        A0A();
        A04 = C0418Da.A01(A07(355, 22, 17));
        A07 = Pattern.compile(A07(922, 10, 101));
        A05 = new HashMap<>();
        A00 = -1;
        A03 = new SparseIntArray();
        A03.put(66, 1);
        A03.put(77, 2);
        A03.put(88, 4);
        A03.put(100, 8);
        A02 = new SparseIntArray();
        A02.put(10, 1);
        A02.put(11, 4);
        A02.put(12, 8);
        A02.put(13, 16);
        A02.put(20, 32);
        A02.put(21, 64);
        A02.put(22, 128);
        A02.put(30, 256);
        A02.put(31, 512);
        A02.put(32, 1024);
        A02.put(40, 2048);
        A02.put(41, 4096);
        A02.put(42, 8192);
        A02.put(50, 16384);
        A02.put(51, 32768);
        A02.put(52, 65536);
        A06 = new HashMap();
        A06.put(A07(529, 3, 28), 1);
        A06.put(A07(644, 3, 37), 4);
        A06.put(A07(70, 3, 15), 16);
        A06.put(A07(911, 3, 68), 64);
        A06.put(A07(932, 3, 70), 256);
        A06.put(A07(201, 4, 57), 1024);
        A06.put(A07(377, 4, 99), 4096);
        A06.put(A07(398, 4, 49), 16384);
        A06.put(A07(532, 4, 103), 65536);
        A06.put(A07(66, 4, 106), 262144);
        A06.put(A07(708, 4, k.AppCompatTheme_windowFixedHeightMinor), 1048576);
        A06.put(A07(901, 4, 98), 4194304);
        A06.put(A07(432, 4, 48), 16777216);
        A06.put(A07(157, 3, 43), 2);
        A06.put(A07(757, 3, 87), 8);
        A06.put(A07(581, 3, 33), 32);
        A06.put(A07(1045, 3, 76), 128);
        A06.put(A07(258, 3, 56), 512);
        A06.put(A07(945, 4, 34), 2048);
        A06.put(A07(402, 4, 17), 8192);
        A06.put(A07(AdError.NETWORK_ERROR_CODE, 4, 113), 32768);
        A06.put(A07(838, 4, 57), 131072);
        A06.put(A07(918, 4, 107), 524288);
        A06.put(A07(44, 4, 95), 2097152);
        A06.put(A07(905, 4, 7), 8388608);
        A06.put(A07(329, 4, k.AppCompatTheme_windowActionModeOverlay), 33554432);
    }

    public static int A00() throws C0424Dj {
        int result = 0;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA0J = null;
        int iMax = 0;
        C0418Da c0418DaA06 = null;
        int length = 0;
        int i = 0;
        char c2 = A00 == -1 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    iMax = 0;
                    i = 0;
                    c0418DaA06 = A06(A07(567, 9, 10), false);
                    if (c0418DaA06 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0418DaA06 = c0418DaA06;
                    codecProfileLevelArrA0J = c0418DaA06.A0J();
                    length = codecProfileLevelArrA0J.length;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    codecProfileLevelArrA0J = codecProfileLevelArrA0J;
                    iMax = Math.max(A01(codecProfileLevelArrA0J[i].level), iMax);
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    if (C0560Iy.A01 < 21) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    result = 345600;
                    c2 = '\b';
                    break;
                case '\b':
                    iMax = Math.max(iMax, result);
                    c2 = '\t';
                    break;
                case '\t':
                    A00 = iMax;
                    c2 = '\n';
                    break;
                case '\n':
                    return A00;
                case 11:
                    result = 172800;
                    c2 = '\b';
                    break;
            }
        }
    }

    public static int A01(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        char c2 = i != 1 ? (char) 2 : (char) 20;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 9437184;
                    i3 = 2097152;
                    i4 = 414720;
                    i5 = 101376;
                    switch (i) {
                        case 8:
                            c2 = 5;
                            break;
                        case 16:
                            c2 = 6;
                            break;
                        case 32:
                            c2 = 7;
                            break;
                        case 64:
                            c2 = '\b';
                            break;
                        case 128:
                            c2 = '\t';
                            break;
                        case 256:
                            c2 = '\n';
                            break;
                        case 512:
                            c2 = 11;
                            break;
                        case 1024:
                            c2 = '\f';
                            break;
                        case 2048:
                            c2 = '\r';
                            break;
                        case 4096:
                            c2 = 14;
                            break;
                        case 8192:
                            c2 = 15;
                            break;
                        case 16384:
                            c2 = 16;
                            break;
                        case 32768:
                            c2 = 17;
                            break;
                        case 65536:
                            c2 = 18;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    return -1;
                case 5:
                    return i5;
                case 6:
                    return i5;
                case 7:
                    return i5;
                case '\b':
                    return 202752;
                case '\t':
                    return i4;
                case '\n':
                    return i4;
                case 11:
                    return 921600;
                case '\f':
                    return 1310720;
                case '\r':
                    return i3;
                case 14:
                    return i3;
                case 15:
                    return 2228224;
                case 16:
                    return 5652480;
                case 17:
                    return i2;
                case 18:
                    return i2;
                case 19:
                    return 25344;
                case 20:
                    return 25344;
            }
        }
    }

    public static Pair<Integer, Integer> A02(String str) {
        String[] parts = null;
        String str2 = null;
        char c2 = 0;
        char c3 = 0;
        char c4 = 0;
        char c5 = 0;
        char c6 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c6) {
                case 2:
                    return (Pair) null;
                case 3:
                    str = str;
                    parts = str.split(A07(864, 2, 72));
                    c2 = 0;
                    str2 = parts[0];
                    c5 = 3;
                    c4 = 2;
                    c3 = 1;
                    switch (str2.hashCode()) {
                        case 3006243:
                            c6 = '\n';
                            break;
                        case 3006244:
                            c6 = '\f';
                            break;
                        case 3199032:
                            c6 = 14;
                            break;
                        case 3214780:
                            c6 = 15;
                            break;
                        default:
                            c6 = 4;
                            break;
                    }
                case 4:
                    c2 = 65535;
                    c6 = 5;
                    break;
                case 5:
                    if (c2 == 0) {
                        c6 = 18;
                        break;
                    } else {
                        c6 = 6;
                        break;
                    }
                case 6:
                    if (c2 == c3) {
                        c6 = 18;
                        break;
                    } else {
                        c6 = 7;
                        break;
                    }
                case 7:
                    if (c2 == c4) {
                        c6 = 17;
                        break;
                    } else {
                        c6 = '\b';
                        break;
                    }
                case '\b':
                    if (c2 == c5) {
                        c6 = 17;
                        break;
                    } else {
                        c6 = '\t';
                        break;
                    }
                case '\t':
                    return (Pair) null;
                case '\n':
                    str2 = str2;
                    if (!str2.equals(A07(167, 4, 74))) {
                        c6 = 4;
                        break;
                    } else {
                        c6 = 11;
                        break;
                    }
                case 11:
                    c2 = 2;
                    c6 = 5;
                    break;
                case '\f':
                    str2 = str2;
                    if (!str2.equals(A07(760, 4, 59))) {
                        c6 = 4;
                        break;
                    } else {
                        c6 = '\r';
                        break;
                    }
                case '\r':
                    c2 = 3;
                    c6 = 5;
                    break;
                case 14:
                    str2 = str2;
                    if (!str2.equals(A07(181, 4, 87))) {
                        c6 = 4;
                        break;
                    } else {
                        c6 = 5;
                        break;
                    }
                case 15:
                    str2 = str2;
                    if (!str2.equals(A07(325, 4, 19))) {
                        c6 = 4;
                        break;
                    } else {
                        c6 = 16;
                        break;
                    }
                case 16:
                    c2 = 1;
                    c6 = 5;
                    break;
                case 17:
                    return A03(str, parts);
                case 18:
                    return A04(str, parts);
            }
        }
    }

    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer numValueOf;
        Integer profileInteger;
        int length = strArr.length;
        String strA07 = A07(774, 37, 26);
        String strA072 = A07(494, 14, 24);
        if (length < 2) {
            Log.w(strA072, strA07 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                profileInteger = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                profileInteger = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                Log.w(strA072, strA07 + str);
                return null;
            }
            int i = A03.get(numValueOf.intValue(), -1);
            if (i == -1) {
                Log.w(strA072, A07(811, 21, 98) + numValueOf);
                return null;
            }
            int level = A02.get(profileInteger.intValue(), -1);
            if (level == -1) {
                Log.w(strA072, A07(438, 19, 20) + profileInteger);
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(level));
        } catch (NumberFormatException unused) {
            Log.w(strA072, strA07 + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A04(String str, String[] strArr) {
        String strGroup = null;
        int i = 0;
        Matcher matcher = null;
        Integer num = null;
        int i2 = 0;
        int length = strArr.length;
        String strA07 = A07(113, 38, 94);
        String strA072 = A07(494, 14, 24);
        int profile = length < 4 ? 2 : 3;
        while (true) {
            switch (profile) {
                case 2:
                    Log.w(strA072, strA07 + str);
                    return (Pair) null;
                case 3:
                    strArr = strArr;
                    i2 = 1;
                    matcher = A07.matcher(strArr[1]);
                    if (!matcher.matches()) {
                        profile = 4;
                        break;
                    } else {
                        profile = 5;
                        break;
                    }
                case 4:
                    Log.w(strA072, strA07 + str);
                    return (Pair) null;
                case 5:
                    matcher = matcher;
                    strGroup = matcher.group(i2);
                    if (!A07(151, 1, 97).equals(strGroup)) {
                        profile = 9;
                        break;
                    } else {
                        profile = 6;
                        break;
                    }
                case 6:
                    i = 1;
                    profile = 7;
                    break;
                case 7:
                    strArr = strArr;
                    num = A06.get(strArr[3]);
                    if (num != null) {
                        profile = 11;
                        break;
                    } else {
                        profile = 8;
                        break;
                    }
                case 8:
                    Log.w(strA072, A07(1009, 27, 106) + matcher.group(i2));
                    return (Pair) null;
                case 9:
                    strGroup = strGroup;
                    if (!A07(397, 1, 69).equals(strGroup)) {
                        profile = 12;
                        break;
                    } else {
                        profile = 10;
                        break;
                    }
                case 10:
                    i = 2;
                    profile = 7;
                    break;
                case 11:
                    return new Pair<>(Integer.valueOf(i), num);
                case 12:
                    Log.w(strA072, A07(281, 29, 101) + strGroup);
                    return (Pair) null;
            }
        }
    }

    public static C0418Da A05() {
        return A04;
    }

    @Nullable
    public static C0418Da A06(String str, boolean z) throws C0424Dj {
        C0418Da c0418Da = null;
        List<C0418Da> listA09 = A09(str, z);
        char c2 = listA09.isEmpty() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0418Da = null;
                    c2 = 3;
                    break;
                case 3:
                    return c0418Da;
                case 4:
                    listA09 = listA09;
                    c0418Da = listA09.get(0);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: Exception -> 0x010e, TRY_ENTER, TryCatch #0 {Exception -> 0x010e, blocks: (B:6:0x0022, B:8:0x002a, B:10:0x0032, B:31:0x008e, B:34:0x009e, B:36:0x00a4, B:40:0x00d6, B:41:0x010d, B:37:0x00cd, B:38:0x00d1), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.X.C0418Da> A08(com.facebook.ads.redexgen.X.C0423Di r18, com.facebook.ads.redexgen.X.InterfaceC0425Dk r19, java.lang.String r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0426Dl.A08(com.facebook.ads.redexgen.X.Di, com.facebook.ads.redexgen.X.Dk, java.lang.String):java.util.ArrayList");
    }

    public static synchronized List<C0418Da> A09(String str, boolean z) throws C0424Dj {
        C0423Di c0423Di = new C0423Di(str, z);
        List<C0418Da> list = A05.get(c0423Di);
        if (list != null) {
            return list;
        }
        InterfaceC0425Dk c0986Zq = C0560Iy.A01 >= 21 ? new C0986Zq(z) : new C0985Zp();
        ArrayList<C0418Da> arrayListA08 = A08(c0423Di, c0986Zq, str);
        if (z && arrayListA08.isEmpty() && 21 <= C0560Iy.A01 && C0560Iy.A01 <= 23) {
            c0986Zq = new C0985Zp();
            arrayListA08 = A08(c0423Di, c0986Zq, str);
            if (!arrayListA08.isEmpty()) {
                Log.w(A07(494, 14, 24), A07(949, 51, 112) + str + A07(511, 12, 110) + arrayListA08.get(0).A02);
            }
        }
        if (A07(73, 14, 55).equals(str)) {
            arrayListA08.addAll(A08(new C0423Di(A07(712, 10, 98), c0423Di.A01), c0986Zq, str));
        }
        A0B(arrayListA08);
        List<C0418Da> listUnmodifiableList = Collections.unmodifiableList(arrayListA08);
        A05.put(c0423Di, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static void A0B(List<C0418Da> list) {
        C0418Da decoderInfo = null;
        int i = 0;
        int i2 = 0;
        char c2 = C0560Iy.A01 < 26 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (list.size() <= 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    i = 0;
                    if (!A07(589, 25, k.AppCompatTheme_windowActionBar).equals(list.get(0).A02)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 1;
                    c2 = 5;
                    break;
                case 5:
                    list = list;
                    if (i2 >= list.size()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    list = list;
                    decoderInfo = list.get(i2);
                    if (!A07(355, 22, 17).equals(decoderInfo.A02)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    list = list;
                    decoderInfo = decoderInfo;
                    list.remove(i2);
                    list.add(i, decoderInfo);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    i2++;
                    c2 = 5;
                    break;
            }
        }
    }

    public static boolean A0C(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        int i = 0;
        String strA07 = null;
        int i2 = 0;
        int i3 = 0;
        String strA072 = null;
        char c2 = !mediaCodecInfo.isEncoder() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    str = str;
                    if (!str.endsWith(A07(1050, 7, 112))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    if (C0560Iy.A01 >= 21) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    str = str;
                    if (!A07(48, 13, 103).equals(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 7:
                    str = str;
                    if (!A07(739, 13, 43).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\b':
                    str = str;
                    if (!A07(185, 16, 74).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\t':
                    str = str;
                    if (!A07(473, 15, 110).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\n':
                    str = str;
                    if (!A07(935, 10, 101).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    str = str;
                    if (!A07(261, 10, 34).equals(str)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return false;
                case '\r':
                    i2 = 18;
                    if (C0560Iy.A01 >= 18) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    str = str;
                    if (!A07(25, 19, 30).equals(str)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return false;
                case 16:
                    if (C0560Iy.A01 >= i2) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    str = str;
                    if (!A07(0, 25, 20).equals(str)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (!A07(508, 3, 21).equals(C0560Iy.A02)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 19:
                    if (!A07(467, 6, 126).equals(C0560Iy.A04)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (!C0560Iy.A02.startsWith(A07(395, 2, k.AppCompatTheme_windowFixedWidthMinor))) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    return false;
                case 22:
                    i3 = 16;
                    if (C0560Iy.A01 != 16) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    str = str;
                    if (!A07(647, 26, 5).equals(str)) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    if (!A07(735, 4, 68).equals(C0560Iy.A02)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 25:
                    if (!A07(523, 6, 49).equals(C0560Iy.A02)) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 26:
                    if (!A07(576, 5, 70).equals(C0560Iy.A02)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 27:
                    if (!A07(1036, 9, 57).equals(C0560Iy.A02)) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 28:
                    if (!A07(388, 7, 41).equals(C0560Iy.A02)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 29:
                    if (!C0560Iy.A02.startsWith(A07(277, 3, 56))) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 30:
                    if (!A07(176, 5, 24).equals(C0560Iy.A02)) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case 31:
                    if (!A07(752, 5, 76).equals(C0560Iy.A02)) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case ' ':
                    if (!A07(232, 5, 88).equals(C0560Iy.A02)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '!':
                    if (!A07(769, 5, 71).equals(C0560Iy.A02)) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '\"':
                    if (!A07(914, 4, 21).equals(C0560Iy.A02)) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '#':
                    if (!A07(488, 6, k.AppCompatTheme_windowMinWidthMinor).equals(C0560Iy.A02)) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    return false;
                case '%':
                    if (C0560Iy.A01 != i3) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    str = str;
                    if (!A07(406, 26, k.AppCompatTheme_windowFixedHeightMajor).equals(str)) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    if (!A07(764, 5, 60).equals(C0560Iy.A02)) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '(':
                    if (!A07(171, 5, 111).equals(C0560Iy.A02)) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case ')':
                    if (!A07(152, 5, 28).equals(C0560Iy.A02)) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '*':
                    if (!A07(730, 5, 29).equals(C0560Iy.A02)) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '+':
                    return false;
                case ',':
                    int i4 = C0560Iy.A01;
                    strA072 = A07(701, 7, 49);
                    if (i4 >= 24) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    str = str;
                    if (!A07(310, 15, 42).equals(str)) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '.':
                    str = str;
                    if (!A07(614, 22, 101).equals(str)) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    strA072 = strA072;
                    if (!strA072.equals(C0560Iy.A04)) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '0';
                        break;
                    }
                case '0':
                    if (!C0560Iy.A02.startsWith(A07(636, 8, 35))) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '1':
                    if (!C0560Iy.A02.startsWith(A07(160, 7, 75))) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '2':
                    if (!C0560Iy.A02.startsWith(A07(271, 6, 59))) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '3':
                    if (!A07(237, 6, 72).equals(C0560Iy.A02)) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '4':
                    if (!A07(220, 12, 23).equals(C0560Iy.A02)) {
                        c2 = '5';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '5':
                    if (!A07(1004, 5, 38).equals(C0560Iy.A02)) {
                        c2 = '6';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '6':
                    if (!A07(895, 6, 37).equals(C0560Iy.A02)) {
                        c2 = '7';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '7':
                    if (!A07(61, 5, 103).equals(C0560Iy.A02)) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '8':
                    return false;
                case '9':
                    int i5 = C0560Iy.A01;
                    strA07 = A07(584, 5, 35);
                    i = 19;
                    if (i5 > 19) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = ':';
                        break;
                    }
                case ':':
                    str = str;
                    if (!A07(243, 15, 102).equals(str)) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = ';';
                        break;
                    }
                case ';':
                    strA072 = strA072;
                    if (!strA072.equals(C0560Iy.A04)) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = '<';
                        break;
                    }
                case '<':
                    if (!C0560Iy.A02.startsWith(A07(436, 2, 93))) {
                        c2 = '=';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case '=':
                    if (!C0560Iy.A02.startsWith(A07(381, 7, 18))) {
                        c2 = '>';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case '>':
                    strA07 = strA07;
                    if (!C0560Iy.A02.startsWith(strA07)) {
                        c2 = '?';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case '?':
                    if (!C0560Iy.A02.startsWith(A07(832, 6, 77))) {
                        c2 = '@';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case '@':
                    if (!C0560Iy.A02.startsWith(A07(909, 2, 101))) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case 'A':
                    return false;
                case 'B':
                    if (C0560Iy.A01 > i) {
                        c2 = 'F';
                        break;
                    } else {
                        c2 = 'C';
                        break;
                    }
                case 'C':
                    strA07 = strA07;
                    if (!C0560Iy.A02.startsWith(strA07)) {
                        c2 = 'F';
                        break;
                    } else {
                        c2 = 'D';
                        break;
                    }
                case 'D':
                    str = str;
                    if (!A07(87, 26, k.AppCompatTheme_windowFixedHeightMajor).equals(str)) {
                        c2 = 'F';
                        break;
                    } else {
                        c2 = 'E';
                        break;
                    }
                case 'E':
                    return false;
                case 'F':
                    str2 = str2;
                    if (!A07(73, 14, 55).equals(str2)) {
                        c2 = 'I';
                        break;
                    } else {
                        c2 = 'G';
                        break;
                    }
                case 'G':
                    str = str;
                    if (!A07(673, 28, 28).equals(str)) {
                        c2 = 'I';
                        break;
                    } else {
                        c2 = 'H';
                        break;
                    }
                case 'H':
                    return false;
                case 'I':
                    return true;
            }
        }
    }

    public static boolean A0D(String str) {
        boolean z = false;
        char c2 = C0560Iy.A01 <= 22 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (!A07(457, 10, 70).equals(C0560Iy.A05)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    if (!A07(722, 8, 4).equals(C0560Iy.A05)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    if (!A07(333, 22, 85).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    str = str;
                    if (!A07(866, 29, 33).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }
}
