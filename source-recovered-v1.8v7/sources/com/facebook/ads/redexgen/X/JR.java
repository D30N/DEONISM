package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public final class JR {
    public static byte[] A00;

    static {
        A0M();
    }

    public static String A0K(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0M() {
        A00 = new byte[]{18, 23, 29, 4, 44, 31, 28, 20, 44, 18, 23, 23, 26, 7, 26, 28, 29, 18, 31, 44, 31, 28, 20, 20, 26, 29, 20, 44, 0, 22, 0, 0, 26, 28, 29, 44, 22, 5, 22, 29, 7, 0, 44, 18, 31, 4, 18, 10, 0, 104, 109, 103, 126, 86, 124, 122, 108, 86, 122, 97, 102, 123, 125, 86, 108, 103, Byte.MAX_VALUE, 86, 109, 104, 125, 104, 86, 111, 102, 123, 86, 104, 109, 109, 96, 125, 96, 102, 103, 104, 101, 86, 101, 102, 110, 110, 96, 103, 110, 0, 5, 15, 22, 62, 0, 15, 5, 19, 14, 8, 5, 62, 5, 8, 18, 17, 0, 21, 2, 9, 4, 19, 62, 12, 0, 25, 62, 19, 4, 21, 19, 24, 62, 2, 14, 20, 15, 21, 90, 95, 85, 76, 100, 72, 83, 84, 78, 87, 95, 100, 78, 72, 94, 100, 93, 82, 87, 94, 100, 89, 90, 72, 94, 95, 100, 73, 94, 88, 84, 73, 95, 100, 95, 90, 79, 90, 89, 90, 72, 94, 18, 23, 23, 26, 7, 26, 28, 29, 18, 31, 44, 23, 22, 17, 6, 20, 44, 31, 28, 20, 20, 26, 29, 20, 44, 17, 31, 18, 16, 24, 44, 31, 26, 0, 7, 43, 46, 36, 61, 21, 43, 36, 46, 56, 37, 35, 46, 21, 36, 43, 62, 35, 60, 47, 21, 60, 35, 47, 61, 43, 40, 35, 38, 35, 62, 51, 21, 34, 35, 57, 62, 37, 56, 51, 21, 57, 43, 39, 58, 38, 35, 36, 45, 21, 56, 43, 62, 47, 53, 48, 58, 35, 11, 56, 59, 51, 11, 53, 48, 48, 61, 32, 61, 59, 58, 53, 56, 11, 56, 59, 51, 51, 61, 58, 51, 11, 49, 34, 49, 58, 32, 39, 11, 56, 61, 57, 61, 32, 126, 120, 67, 120, 125, 104, 125, 67, 112, 115, 123, 123, 117, 114, 123, 67, 112, 117, 113, 117, 104, 107, 110, 100, 125, 85, 107, 100, 110, 120, 101, 99, 110, 85, Byte.MAX_VALUE, 121, 111, 85, 102, 101, 105, 107, 102, 85, 105, 101, Byte.MAX_VALUE, 100, 126, 111, 120, 121, 70, 48, 43, 44, 35, 44, 32, 33, 26, 41, 42, 34, 34, 44, 43, 34, 26, 32, 51, 32, 43, 49, 26, 41, 44, 40, 44, 49, 12, 9, 3, 26, 50, 12, 3, 9, 31, 2, 4, 9, 50, 1, 2, 14, 12, 1, 50, 14, 2, 24, 3, 25, 8, 31, 30, 50, 30, 12, 0, 29, 1, 4, 3, 10, 50, 31, 12, 25, 8, 29, 27, 35, 38, 44, 53, 29, 38, 39, 32, 55, 37, 29, 46, 45, 37, 29, 36, 43, 46, 39, 29, 49, 43, 56, 39, 29, 46, 43, 47, 43, 54, 29, 32, 59, 54, 39, 49, 4, 1, 1, 12, 17, 12, 10, 11, 4, 9, 58, 1, 0, 7, 16, 2, 58, 9, 10, 2, 2, 12, 11, 2, 58, 22, 4, 8, 21, 9, 12, 11, 2, 58, 21, 0, 23, 6, 0, 11, 17, 4, 2, 0, 17, 10, 13, 2, 13, 1, 0, 59, 8, 11, 3, 3, 13, 10, 3, 59, 0, 13, 23, 20, 5, 16, 7, 12, 59, 13, 10, 16, 1, 22, 18, 5, 8, 59, 23, 1, 7, 11, 10, 0, 23, 116, 113, 113, 124, 97, 124, 122, 123, 116, 121, 74, 113, 112, 119, 96, 114, 74, 121, 122, 114, 114, 124, 123, 114, 74, 119, 121, 116, 118, 126, 74, 121, 124, 102, 97, 74, 101, 112, 103, 118, 112, 123, 97, 116, 114, 112, 101, 96, 106, 115, 91, 96, 97, 102, 113, 99, 91, 104, 107, 99, 99, 109, 106, 99, 4, 1, 11, 18, 58, 4, 1, 1, 12, 17, 12, 10, 11, 4, 9, 58, 9, 10, 2, 2, 12, 11, 2, 58, 16, 22, 0, 58, 17, 0, 8, 21, 58, 3, 12, 9, 0, 58, 3, 10, 23, 58, 23, 0, 18, 23, 12, 17, 0, 29, 24, 18, 11, 35, 15, 25, 18, 24, 35, 29, 24, 24, 21, 8, 21, 19, 18, 29, 16, 35, 24, 25, 30, 9, 27, 35, 16, 19, 27, 27, 21, 18, 27, 35, 15, 8, 29, 31, 23, 8, 14, 29, 31, 25, 65, 68, 78, 87, Byte.MAX_VALUE, 65, 78, 68, 82, 79, 73, 68, Byte.MAX_VALUE, 78, 69, 84, 87, 79, 82, 75, Byte.MAX_VALUE, 68, 69, 66, 85, 71, Byte.MAX_VALUE, 69, 86, 69, 78, 84, 83, Byte.MAX_VALUE, 83, 65, 77, 80, 76, 73, 78, 71, Byte.MAX_VALUE, 82, 65, 84, 69, 33, 36, 46, 55, 31, 33, 46, 36, 50, 47, 41, 36, 31, 38, 53, 46, 46, 37, 44, 31, 36, 37, 34, 53, 39, 31, 37, 54, 37, 46, 52, 51, 31, 51, 33, 45, 48, 44, 41, 46, 39, 31, 50, 33, 52, 37, 12, 23, 16, 31, 16, 28, 29, 38, 21, 22, 30, 30, 16, 23, 30, 38, 11, 28, 13, 11, 0, 38, 21, 16, 20, 16, 13, 53, 48, 58, 35, 11, 53, 48, 48, 61, 32, 61, 59, 58, 53, 56, 11, 56, 59, 51, 51, 61, 58, 51, 11, 38, 49, 32, 38, 45, 11, 56, 61, 57, 61, 32, 48, 53, 63, 38, 14, 53, 52, 51, 36, 54, 14, 61, 62, 54, 54, 56, 63, 54, 14, 52, 39, 52, 63, 37, 14, 61, 56, 60, 56, 37, 63, 58, 48, 41, 1, 63, 48, 58, 44, 49, 55, 58, 1, 58, 55, 45, 46, 63, 42, 61, 54, 59, 44, 1, 55, 48, 55, 42, 55, 63, 50, 1, 44, 59, 42, 44, 39, 1, 58, 59, 50, 63, 39, 1, 51, 45, 48, 53, 63, 38, 14, 48, 63, 53, 35, 62, 56, 53, 14, 50, 48, 50, 57, 52, 14, 53, 52, 51, 36, 54, 14, 52, 39, 52, 63, 37, 34, 14, 34, 48, 60, 33, 61, 56, 63, 54, 14, 35, 48, 37, 52, 117, 110, 105, 102, 105, 101, 100, 95, 108, 111, 103, 103, 105, 110, 103, 95, 105, 109, 
        109, 101, 100, 105, 97, 116, 101, 95, 100, 101, 108, 97, 121, 95, 109, 115, 90, 95, 85, 76, 100, 87, 84, 92, 100, 90, 95, 95, 82, 79, 82, 84, 85, 90, 87, 100, 87, 84, 92, 92, 82, 85, 92, 100, 82, 85, 100, 86, 94, 86, 84, 73, 66, 100, 94, 77, 94, 85, 79, 72, 100, 87, 82, 86, 82, 79, 57, 27, 20, 93, 14, 90, 10, 27, 8, 9, 31, 90, 9, 27, 23, 10, 22, 19, 20, 29, 84};
    }

    public static int A00(Context context) {
        return JQ.A0L(context).A1j(A0K(264, 40, k.AppCompatTheme_windowMinWidthMajor), 10);
    }

    public static int A01(Context context) {
        return JQ.A0L(context).A1j(A0K(1016, 50, 21), 50);
    }

    public static int A02(Context context) {
        return JQ.A0L(context).A1j(A0K(826, 35, k.AppCompatTheme_windowMinWidthMajor), 1);
    }

    public static int A03(Context context) {
        return A0G(context, A0K(548, 46, 59), 0);
    }

    public static int A04(Context context) {
        return A0G(context, A0K(463, 44, 75), 0);
    }

    public static int A05(Context context) {
        return JQ.A0L(context).A1j(A0K(304, 21, 50), 10);
    }

    public static int A06(Context context) {
        return JQ.A0L(context).A1j(A0K(937, 45, 127), 0);
    }

    public static int A07(Context context) {
        return JQ.A0L(context).A1j(A0K(427, 36, 108), 10485760);
    }

    public static int A08(Context context) {
        return JQ.A0L(context).A1j(A0K(861, 30, 127), 30);
    }

    public static int A09(Context context) {
        return JQ.A0L(context).A1j(A0K(95, 39, 79), 5);
    }

    public static int A0A(Context context) {
        return JQ.A0L(context).A1j(A0K(753, 46, 110), 0);
    }

    public static int A0B(Context context) {
        return JQ.A0L(context).A1j(A0K(384, 41, 67), 0);
    }

    public static int A0C(Context context) {
        return JQ.A0L(context).A1j(A0K(211, 53, 100), 0);
    }

    public static int A0D(Context context) {
        return JQ.A0L(context).A1j(A0K(706, 47, 14), 0);
    }

    public static int A0E(Context context) {
        return JQ.A0L(context).A1j(A0K(357, 27, 107), 30);
    }

    public static int A0F(Context context) {
        return JQ.A0L(context).A1j(A0K(799, 27, 87), 20);
    }

    public static int A0G(Context context, String str, int i) {
        int value = JQ.A0L(context).A1j(str, i);
        char c2 = value >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (value >= 101) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return value;
                case 4:
                    return i;
            }
        }
    }

    public static long A0H(Context context) {
        return JQ.A0L(context).A1k(A0K(891, 46, 112), 2000L);
    }

    public static long A0I(Context context) {
        return JQ.A0L(context).A1j(A0K(507, 41, 74), 300) * 1000;
    }

    public static long A0J(Context context) {
        return JQ.A0L(context).A1k(A0K(982, 34, 46), 500L);
    }

    public static HashMap<String, Integer> A0L(Context context) throws JSONException, NumberFormatException {
        int i = 0;
        String[] strArrSplit = null;
        String sampling = null;
        String strOptString = null;
        String str = null;
        String strA1l = JQ.A0L(context).A1l(A0K(176, 35, 93), A0K(425, 2, 104));
        HashMap<String, Integer> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray(strA1l);
        int i2 = 0;
        int samplingInt = 2;
        while (true) {
            switch (samplingInt) {
                case 2:
                    jSONArray = jSONArray;
                    if (i2 >= jSONArray.length()) {
                        samplingInt = 12;
                        break;
                    } else {
                        samplingInt = 3;
                        break;
                    }
                case 3:
                    jSONArray = jSONArray;
                    strOptString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(strOptString)) {
                        samplingInt = 4;
                        break;
                    } else {
                        samplingInt = 10;
                        break;
                    }
                case 4:
                    strOptString = strOptString;
                    sampling = A0K(356, 1, 86);
                    if (!strOptString.contains(sampling)) {
                        samplingInt = 8;
                        break;
                    } else {
                        samplingInt = 5;
                        break;
                    }
                case 5:
                    strOptString = strOptString;
                    sampling = sampling;
                    strArrSplit = strOptString.split(sampling);
                    str = strArrSplit[1];
                    samplingInt = 6;
                    break;
                case 6:
                    try {
                        str = str;
                        i = Integer.parseInt(str);
                        samplingInt = 9;
                        break;
                    } catch (NumberFormatException unused) {
                        throw new JSONException(A0K(1066, 21, 84));
                    }
                case 8:
                    map = map;
                    strOptString = strOptString;
                    map.put(strOptString, -1);
                    samplingInt = 10;
                    break;
                case 9:
                    map = map;
                    strArrSplit = strArrSplit;
                    map.put(strArrSplit[0], Integer.valueOf(i));
                    samplingInt = 10;
                    break;
                case 10:
                    i2++;
                    samplingInt = 2;
                    break;
                case 12:
                    return map;
            }
        }
    }

    public static boolean A0N(Context context) {
        return JQ.A0L(context).A1n(A0K(612, 49, 75), true);
    }

    public static boolean A0O(Context context) {
        return JQ.A0L(context).A1n(A0K(594, 18, 42), false);
    }

    public static boolean A0P(Context context) {
        return JQ.A0L(context).A1n(A0K(0, 49, 93), true);
    }

    public static boolean A0Q(Context context) {
        return JQ.A0L(context).A1n(A0K(661, 45, 82), false);
    }

    public static boolean A0R(Context context) {
        return JQ.A0L(context).A1n(A0K(134, 42, 21), false);
    }

    public static boolean A0S(Context context) {
        return JQ.A0L(context).A1n(A0K(325, 31, 36), false);
    }

    public static boolean A0T(Context context) {
        return JQ.A0L(context).A1n(A0K(49, 46, 39), true);
    }
}
