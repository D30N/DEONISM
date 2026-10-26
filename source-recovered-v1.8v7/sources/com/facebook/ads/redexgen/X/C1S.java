package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1S {
    public static byte[] A00;

    static {
        A0A();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A00 = new byte[]{15, 59, 58, 64, 53, 58, 65, 49, -20, 67, 45, 64, 47, 52, 53, 58, 51, -20, 64, 59, -20, 62, 49, 47, 49, 53, 66, 49, -20, 45, 58, -20, 53, 58, -7, 51, 45, 57, 49, -20, 62, 49, 67, 45, 62, 48, 92, 90, 99, 90, 103, 94, 88, 84, 105, 90, 109, 105, 50, 69, 87, 65, 82, 68, 0, 73, 78, 0, 59, 83, 69, 67, 83, 61, 83, 50, 47, 46, 45, 50, 46, 49, 36, 35, 46, 33, 51, 29, 46, 32, 27, 37, 42, 27, 52, 68, 60, 58, 65, 26, 70, 69, 75, 64, 69, 76, 60, -9, 46, 56, 75, 58, 63, 64, 69, 62, -11, 33, 32, 38, 27, 32, 39, 23, -46, 41, 19, 38, 21, 26, 27, 32, 25, -46, 38, 33, -46, 36, 23, 21, 23, 27, 40, 23, -46, 45, 35, 39, 19, 32, 38, 27, 38, 43, 47, 45, 21, 39, 36, 36, 23, 32, 21, 43, 47, 15, 44, 43, 42, 47, 43, 46, 33, 32, 14, 38, 36, 43, 59, 71, 70, 76, 65, 70, 77, 61, 55, 79, 57, 76, 59, 64, 65, 70, 63, 5, 46, 49, 53, 39, -30, 3, 38, 8, 6, 15, 6, 19, 10, 4, 0, 19, 6, 24, 2, 19, 5, 46, 58, 57, 63, 52, 57, 64, 48, 42, 66, 44, 63, 46, 51, 52, 57, 50, 42, 49, 58, 61, 42, 61, 48, 66, 44, 61, 47, 4, 13, 16, 20, 6, 0, 2, 5};
    }

    public static C1O A00(JSONObject jSONObject) {
        return new C1N().A06(A06(jSONObject)).A07(A05(jSONObject)).A05(A07(jSONObject)).A04(A04(jSONObject)).A08();
    }

    public static C1Y A01(JSONObject jSONObject) {
        return new C1X().A02(A08(jSONObject)).A03(A09(jSONObject)).A04();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(165, 9, 62);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(75, 9, 65), strA02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(195, 8, 68);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(245, 8, 35), strA02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(k.AppCompatTheme_windowActionBarOverlay, 49, 52);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(217, 28, 77), strA02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(0, 46, 78);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(203, 14, 35), strA02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(99, 17, 89);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(178, 17, 90), strA02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(58, 17, 98);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(84, 11, 62), strA02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A02(46, 12, k.AppCompatTheme_windowFixedHeightMinor));
        String strA02 = A02(174, 4, 61);
        return genericTextObject == null ? strA02 : genericTextObject.optString(A02(95, 4, 83), strA02);
    }
}
