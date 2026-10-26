package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OY {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-49, -45, -57, -51, -53, 72, 69, 63, 85, 72, 67, 68, 78, 62, 84, 81, 75, 37, 82, 82, 79, 82, 0, 84, 82, 65, 78, 83, 70, 79, 82, 77, 73, 78, 71, 0, 42, 51, 47, 46, 0, 73, 78, 0, 85, 80, 68, 65, 84, 69, 35, 65, 67, 72, 69, 68, 53, 82, 76, 83, -26, -17, -27, -32, -28, -30, -13, -27, -32, -22, -18, -30, -24, -26, -12, 71, 92, 81, 68, 80, 76, 70, 66, 86, 71, 78, 66, 79, 68, 92, 72, 85, 66, 75, 87, 80, 79, 66, 88, 85, 79, 10, 8, 25, 22, 28, 26, 12, 19, -16, -22, -10, -11};
    }

    public static JSONObject A01(XI xi, JSONObject iconObject, C7C c7c, C0565Jd c0565Jd, OR or) throws JSONException {
        JSONArray jSONArrayOptJSONArray = null;
        int i = 0;
        JSONArray jSONArrayOptJSONArray2 = null;
        int i2 = 0;
        String strA00 = A00(5, 3, 110);
        char c2 = !c7c.A0X(iconObject.optString(A00(75, 26, 126))) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    break;
                case 3:
                    c0565Jd = c0565Jd;
                    c0565Jd.A02(EnumC0564Jc.A0O, null);
                    c2 = 4;
                case 4:
                    JSONObject jSONObjectOptJSONObject = iconObject.optJSONObject(A00(109, 4, 34));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optString(strA00) != null) {
                        jSONObjectOptJSONObject.put(strA00, c7c.A0J(jSONObjectOptJSONObject.optString(strA00)));
                    }
                    jSONArrayOptJSONArray2 = iconObject.optJSONArray(A00(60, 15, 28));
                    i2 = 0;
                    c2 = jSONArrayOptJSONArray2 != null ? (char) 15 : (char) 22;
                    break;
                case 15:
                    i2 = 0;
                    i = 0;
                    c2 = 16;
                case 16:
                    try {
                        jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                        c2 = i < jSONArrayOptJSONArray2.length() ? (char) 18 : (char) 22;
                    } catch (JSONException unused) {
                        or.A04(C03008a.A0r, A00(17, 43, k.AppCompatTheme_windowMinWidthMinor));
                        break;
                    }
                case 18:
                    jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                    jSONArrayOptJSONArray2.put(i, c7c.A0J(jSONArrayOptJSONArray2.optString(i)));
                    i++;
                    c2 = 16;
                case 22:
                    jSONArrayOptJSONArray = iconObject.optJSONArray(A00(101, 8, 66));
                    c2 = jSONArrayOptJSONArray != null ? (char) 25 : (char) 30;
                case 25:
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    if (i2 >= jSONArrayOptJSONArray.length()) {
                        break;
                    } else {
                        A03(jSONArrayOptJSONArray.optJSONObject(i2), c7c);
                        i2++;
                        c2 = 25;
                    }
                case 30:
                    iconObject = iconObject;
                    A03(iconObject, c7c);
                    break;
            }
            return iconObject;
        }
        return iconObject;
    }

    public static void A03(JSONObject imageObject, C7C c7c) throws JSONException {
        String strA00 = null;
        String strA002 = null;
        JSONObject jSONObjectOptJSONObject = imageObject.optJSONObject(A00(0, 5, 1));
        char c2 = jSONObjectOptJSONObject != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    strA002 = A00(5, 3, 110);
                    if (jSONObjectOptJSONObject.optString(strA002) == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c7c = c7c;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    strA002 = strA002;
                    jSONObjectOptJSONObject.put(strA002, c7c.A0J(jSONObjectOptJSONObject.optString(strA002)));
                    c2 = 4;
                    break;
                case 4:
                    imageObject = imageObject;
                    strA00 = A00(8, 9, k.AppCompatTheme_windowMinWidthMajor);
                    if (!TextUtils.isEmpty(imageObject.optString(strA00))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    imageObject = imageObject;
                    c7c = c7c;
                    strA00 = strA00;
                    imageObject.put(strA00, c7c.A0L(imageObject.optString(strA00)));
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}
