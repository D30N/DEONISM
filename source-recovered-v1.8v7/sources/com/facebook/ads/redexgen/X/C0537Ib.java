package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0537Ib {
    public static byte[] A00;
    public static final ArrayList<C0536Ia> A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A00 = new byte[]{-95, -80, -80, -84, -87, -93, -95, -76, -87, -81, -82, 111, -72, 109, -83, -80, 116, 109, -74, -76, -76, -51, -35, -36, -52, 25, 40, 40, 36, 33, 27, 25, 44, 33, 39, 38, -25, 48, -27, 37, 40, -20, -27, 27, 29, 25, -27, -18, -24, -16, -77, -79, 121, -127, 8, 28, 11, 16, 22, -42, 12, 8, 10, -38, -44, 17, 22, 10, 4, 7, -53, -8, -59, 11, 31, 14, 19, 25, -39, 32, 24, 14, -40, 14, 30, 29, -40, 18, 14, -18, -2, -3, -14, -11, -10, -12, -60, 11, 31, 14, 19, 25, -39, 11, 13, -35, 28, 48, 31, 36, 42, -22, 47, 45, 48, 32, -24, 35, 31, 51, 38, 33, 34, 44, -20, 42, 45, 34, 36, 17, 38, 19, -31, -21, -6, -6, -10, -13, -19, -21, -2, -13, -7, -8, -71, 2, -73, -3, -1, -20, -4, -13, -6, -41, -4, 4, -17, -6, -9, -14, -82, -5, -9, -5, -13, -82, 2, 7, -2, -13, -56, -82, -17, -2, -2, -6, -9, -15, -17, 2, -9, -3, -4, -67, -9, -14, -63, -118, -36, -39, -22, -91, -50, -35, -35, -39, -42, -48, -50, -31, -42, -36, -37, -100, -35, -44, -32, 12, 13, 18, 16, -74, -72, -126, -120, 31, 45, 26, -24, -26, -39, -44, -43, -33, -97, -24, -99, -26, -34, -44, -98, -33, -34, -94, -98, -26, -32, -87, -64, -77, -82, -81, -71, -23, -3, -20, -15, -9, -73, -2, -9, -6, -22, -15, -5, -27, -33, -88, -49, -64, -45, -49, 43, 30, 25, 26, 36, -28, 22, 43, 24, -67, -52, -52, -56, -59, -65, -67, -48, -59, -53, -54, -117, -64, -46, -66, -49, -47, -66, -49, 51, 38, 33, 34, 44, -20, 42, 45, -15, 51, -22, 34, 48, 47, 41, -15, -65, -49, -50, -57, -24, -9, -9, -13, -16, -22, -24, -5, -16, -10, -11, -74, -22, -20, -24, -76, -66, -73, -65, -72, -69, Byte.MAX_VALUE, -84, -57, -70, -75, -74, -64, Byte.MIN_VALUE, -56, -57, -76, -126, -63, -48, -48, -52, -55, -61, -63, -44, -55, -49, -50, -113, -40, -115, -46, -63, -41, -61, -61, -34, -14, -31, -26, -20, -84, -30, -34, -32, -80, -73, -58, -58, -62, -65, -71, -73, -54, -65, -59, -60, -123, -54, -54, -61, -62, -127, -50, -61, -62, 31, 24, 27, 11, 18, 28, -59, -44, -44, -48, -51, -57, -59, -40, -51, -45, -46, -109, -36, -111, -43, -39, -51, -57, -49, -40, -51, -47, -55, -111, -40, -36, -105, -53, 14, 8, -56, -47, 20, 36, 35, 21, 2, 17, 17, 13, 10, 4, 2, 21, 10, 16, 15, -48, 25, -50, 4, 2, 14, 6, 19, 2, -50, 14, 16, 21, 10, 16, 15, 3, 23, 6, 11, 17, -47, 15, 18, 7, 9, -92, -71, -90, 118, -23, -36, -41, -40, -30, -94, -21, -96, -23, -31, -41, -95, -30, -31, -91, -95, -23, -29, -85, -31, -11, -28, -23, -17, -81, -19, -16, -76, -31, -83, -20, -31, -12, -19, 4, -9, -14, -13, -3, -67, -10, -13, 4, -15, -24, -30, -94, -86, -96, -76, -93, -88, -82, 110, -75, -83, -93, 109, -93, -77, -78, -13, 2, 2, -2, -5, -11, -13, 6, -5, 1, 0, -63, 10, -65, 5, -11, 6, -9, -59, -57, -6, -9, -7, -55, 28, 15, 10, 11, 21, -43, 19, 22, 11, 13, -40, -27, -7, -24, -19, -13, -77, -13, -12, -7, -9, -45, -25, -42, -37, -31, -33, -35, -89, -83, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -87, -85, -89, 115, 124, 118, 126, -85, -70, -70, -74, -77, -83, -85, -66, -77, -71, -72, 121, -62, 119, -81, -73, -67, -79, -34, -19, -19, -23, -26, -32, -34, -15, -26, -20, -21, -84, -13, -20, -33, -16, -14, -33};
    }

    static {
        A0A();
        A01 = new ArrayList<>();
    }

    public static int A00(String str) {
        char c2;
        char c3 = 0;
        switch (str.hashCode()) {
            case -2123537834:
                c2 = '\n';
                break;
            case -1095064472:
                c2 = '\f';
                break;
            case 187078296:
                c2 = 14;
                break;
            case 1504578661:
                c2 = 16;
                break;
            case 1505942594:
                c2 = 18;
                break;
            case 1556697186:
                c2 = 20;
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    c3 = 65535;
                    c2 = 3;
                    break;
                case 3:
                    if (c3 == 0) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (c3 == 1) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (c3 == 2) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (c3 == 3) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (c3 == 4) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (c3 == 5) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return 0;
                case '\n':
                    str = str;
                    if (!str.equals(A04(54, 14, 104))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c3 = 2;
                    c2 = 3;
                    break;
                case '\f':
                    str = str;
                    if (!str.equals(A04(523, 13, 0))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c3 = 3;
                    c2 = 3;
                    break;
                case 14:
                    str = str;
                    if (!str.equals(A04(97, 9, 107))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c3 = 0;
                    c2 = 3;
                    break;
                case 16:
                    str = str;
                    if (!str.equals(A04(362, 10, 62))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c3 = 1;
                    c2 = 3;
                    break;
                case 18:
                    str = str;
                    if (!str.equals(A04(73, 16, 107))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c3 = 4;
                    c2 = 3;
                    break;
                case 20:
                    str = str;
                    if (!str.equals(A04(106, 13, k.AppCompatTheme_windowNoTitle))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c3 = 5;
                    c2 = 3;
                    break;
                case 22:
                    return 14;
                case 23:
                    return 8;
                case 24:
                    return 7;
                case 25:
                    return 6;
                case 26:
                    return 5;
            }
        }
    }

    public static int A01(String str) {
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    str = str;
                    if (!A0B(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 1;
                case 5:
                    str = str;
                    if (!A0D(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return 2;
                case 7:
                    str = str;
                    if (!A0C(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case '\b':
                    str = str;
                    if (!A04(590, 19, 7).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case '\t':
                    str = str;
                    if (!A04(310, 19, 72).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case '\n':
                    str = str;
                    if (!A04(25, 25, k.AppCompatTheme_windowFixedWidthMinor).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 11:
                    str = str;
                    if (!A04(133, 20, 75).equals(str)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case '\f':
                    str = str;
                    if (!A04(372, 20, 23).equals(str)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case '\r':
                    str = str;
                    if (!A04(398, 28, 37).equals(str)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 14:
                    str = str;
                    if (!A04(0, 21, 1).equals(str)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 15:
                    str = str;
                    if (!A04(343, 19, 33).equals(str)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 16:
                    str = str;
                    if (!A04(627, 18, 62).equals(str)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 17:
                    str = str;
                    if (!A04(192, 15, 46).equals(str)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 18:
                    str = str;
                    if (!A04(271, 19, 29).equals(str)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return 3;
                case 20:
                    str = str;
                    if (!A04(172, 15, 79).equals(str)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 21:
                    str = str;
                    if (!A04(609, 18, 11).equals(str)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 22:
                    str = str;
                    if (!A04(536, 20, 83).equals(str)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 23:
                    str = str;
                    if (!A04(434, 27, 98).equals(str)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return 4;
                case 25:
                    return A02(str);
            }
        }
    }

    public static int A02(String str) {
        C0536Ia customMimeType = null;
        int size = A01.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    customMimeType = A01.get(i);
                    if (!str.equals(customMimeType.A02)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return customMimeType.A00;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return -1;
            }
        }
    }

    @Nullable
    public static String A03(int i) {
        char c2 = i != 32 ? (char) 2 : (char) 25;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 33) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 35) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 64) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 163) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 177) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 165) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == 166) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    switch (i) {
                        case 96:
                            c2 = 15;
                            break;
                        case 97:
                            c2 = 15;
                            break;
                        case 98:
                            c2 = 15;
                            break;
                        case 99:
                            c2 = 15;
                            break;
                        case 100:
                            c2 = 15;
                            break;
                        case 101:
                            c2 = 15;
                            break;
                        case 102:
                            c2 = 22;
                            break;
                        case 103:
                            c2 = 22;
                            break;
                        case 104:
                            c2 = 22;
                            break;
                        case 105:
                            c2 = 16;
                            break;
                        case 106:
                            c2 = 17;
                            break;
                        case 107:
                            c2 = 16;
                            break;
                        default:
                            c2 = '\n';
                            break;
                    }
                case '\n':
                    switch (i) {
                        case 169:
                            c2 = '\f';
                            break;
                        case 170:
                            c2 = '\r';
                            break;
                        case 171:
                            c2 = '\r';
                            break;
                        case 172:
                            c2 = '\f';
                            break;
                        case 173:
                            c2 = 14;
                            break;
                        default:
                            c2 = 11;
                            break;
                    }
                case 11:
                    return (String) null;
                case '\f':
                    return A04(523, 13, 0);
                case '\r':
                    return A04(73, 16, 107);
                case 14:
                    return A04(571, 10, 69);
                case 15:
                    return A04(560, 11, 103);
                case 16:
                    return A04(461, 10, 99);
                case 17:
                    return A04(k.AppCompatTheme_windowFixedHeightMinor, 10, 126);
                case 18:
                    return A04(362, 10, 62);
                case 19:
                    return A04(97, 9, 107);
                case 20:
                    return A04(219, 19, 49);
                case 21:
                    return A04(333, 10, 18);
                case 22:
                    return A04(494, 15, 65);
                case 23:
                    return A04(509, 10, 79);
                case 24:
                    return A04(262, 9, k.AppCompatTheme_windowFixedHeightMajor);
                case 25:
                    return A04(290, 13, 126);
            }
        }
    }

    @Nullable
    public static String A05(@Nullable String str) {
        String strA06 = null;
        String[] strArrA0o = null;
        int i = 0;
        int length = 0;
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    str = str;
                    strArrA0o = C0560Iy.A0o(str, A04(187, 1, 31));
                    length = strArrA0o.length;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    strArrA0o = strArrA0o;
                    strA06 = A06(strArrA0o[i]);
                    if (strA06 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    strA06 = strA06;
                    if (!A0B(strA06)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return strA06;
                case '\b':
                    i++;
                    c2 = 4;
                    break;
                case '\t':
                    return (String) null;
            }
        }
    }

    @Nullable
    public static String A06(@Nullable String str) {
        String strA04 = null;
        String strTrim = null;
        String strSubstring = null;
        String strA03 = null;
        int i = 0;
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    str = str;
                    strTrim = str.trim();
                    c2 = !strTrim.startsWith(A04(129, 4, 113)) ? (char) 4 : (char) 5;
                case 4:
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(471, 4, 4)) ? (char) 5 : (char) 6;
                case 5:
                    return A04(262, 9, k.AppCompatTheme_windowFixedHeightMajor);
                case 6:
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(188, 4, 53)) ? (char) 7 : '\b';
                case 7:
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(215, 4, k.AppCompatTheme_windowFixedWidthMajor)) ? '\b' : '\t';
                case '\b':
                    return A04(509, 10, 79);
                case '\t':
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(255, 3, 48)) ? '\n' : (char) 11;
                case '\n':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(426, 4, 89)) ? (char) 11 : '\f';
                case 11:
                    return A04(219, 19, 49);
                case '\f':
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(303, 3, k.AppCompatTheme_windowMinWidthMajor)) ? '\r' : (char) 14;
                case '\r':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(519, 4, 51)) ? (char) 14 : (char) 15;
                case 14:
                    return A04(475, 19, 52);
                case 15:
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(329, 4, 12)) ? (char) 16 : (char) 28;
                case 16:
                    strTrim = strTrim;
                    strA03 = null;
                    if (!strTrim.startsWith(A04(68, 5, 88))) {
                        break;
                    } else {
                        strSubstring = strTrim.substring(5);
                        i = 2;
                        if (strSubstring.length() < 2) {
                            break;
                        } else {
                            c2 = 19;
                        }
                    }
                case 19:
                    try {
                        strSubstring = strSubstring;
                        strA03 = A03(Integer.parseInt(C0560Iy.A0Q(strSubstring.substring(0, i)), 16));
                        break;
                    } catch (NumberFormatException unused) {
                        break;
                    }
                case 25:
                    strA04 = A04(494, 15, 65);
                    c2 = 26;
                case 26:
                    return strA04;
                case 27:
                    strA04 = strA03;
                    c2 = 26;
                case 28:
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(211, 4, 22)) ? (char) 29 : (char) 30;
                case 29:
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(556, 4, 87)) ? (char) 30 : (char) 31;
                case 30:
                    return A04(97, 9, 107);
                case 31:
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(586, 4, 59)) ? ' ' : '!';
                case ' ':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(93, 4, 82)) ? '!' : '\"';
                case '!':
                    return A04(362, 10, 62);
                case '\"':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(50, 4, 15)) ? '#' : '$';
                case '#':
                    return A04(54, 14, 104);
                case '$':
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(21, 4, 42)) ? '%' : '&';
                case '%':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(430, 4, 113)) ? '&' : '\'';
                case '&':
                    return A04(523, 13, 0);
                case '\'':
                    strTrim = strTrim;
                    c2 = !strTrim.startsWith(A04(89, 4, 75)) ? '(' : ')';
                case '(':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(306, 4, 28)) ? ')' : '*';
                case ')':
                    return A04(73, 16, 107);
                case '*':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(207, 4, 94)) ? '+' : ',';
                case '+':
                    return A04(571, 10, 69);
                case ',':
                    strTrim = strTrim;
                    c2 = strTrim.startsWith(A04(392, 6, 106)) ? '-' : '.';
                case '-':
                    return A04(243, 12, 73);
                case '.':
                    return A08(strTrim);
            }
            c2 = strA03 == null ? (char) 25 : (char) 27;
        }
    }

    @Nullable
    public static String A07(@Nullable String str) {
        String strA06 = null;
        String[] strArrA0o = null;
        int i = 0;
        int length = 0;
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    str = str;
                    strArrA0o = C0560Iy.A0o(str, A04(187, 1, 31));
                    length = strArrA0o.length;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    strArrA0o = strArrA0o;
                    strA06 = A06(strArrA0o[i]);
                    if (strA06 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    strA06 = strA06;
                    if (!A0D(strA06)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return strA06;
                case '\b':
                    i++;
                    c2 = 4;
                    break;
                case '\t':
                    return (String) null;
            }
        }
    }

    @Nullable
    public static String A08(String str) {
        C0536Ia customMimeType = null;
        int size = A01.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    customMimeType = A01.get(i);
                    if (!str.startsWith(customMimeType.A01)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return customMimeType.A02;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return (String) null;
            }
        }
    }

    @Nullable
    public static String A09(@Nullable String str) {
        int iIndexOf = 0;
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    str = str;
                    iIndexOf = str.indexOf(47);
                    if (iIndexOf == -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return str.substring(0, iIndexOf);
                case 5:
                    throw new IllegalArgumentException(A04(153, 19, 79) + str);
            }
        }
    }

    public static boolean A0B(String str) {
        return A04(581, 5, 51).equals(A09(str));
    }

    public static boolean A0C(String str) {
        return A04(258, 4, 28).equals(A09(str));
    }

    public static boolean A0D(String str) {
        return A04(238, 5, 11).equals(A09(str));
    }
}
