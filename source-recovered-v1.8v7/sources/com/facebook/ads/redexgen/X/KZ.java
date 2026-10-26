package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class KZ {
    public static KZ A00;
    public static byte[] A01;

    public static String A04(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A01 = new byte[]{113, 102, 102, 123, 102, 44, 41, 18, 63, 40, 61, 34, 63, 57, 36, 35, 42, 18, 46, 34, 35, 43, 36, 42, 68, 66, 81, 83, 91, 85, 66, 67, 56, 57, 58, 53, 50, 53, 40, 53, 51, 50, 111, 106, Byte.MAX_VALUE, 106, 84, 102, 100, 111, 110, 103, 84, Byte.MAX_VALUE, 114, 123, 110, 51, 62, 55, 34, 101, 96, 101, 116, 112, 97, 118, 14, 2, 9, 8, 56, 61, 42, 8, 0, 22, 22, 4, 2, 0, 77, 81, 92, 94, 88, 80, 88, 83, 73, 78, 116, 113, 100, 113, 113, 126, 79, 102, 113, 124, 121, 116, 113, 100, 121, Byte.MAX_VALUE, 126, 79, 101, 101, 121, 116, 11, 8, 12, 25, 24, 31, 8, 50, 14, 2, 3, 11, 4, 10};
    }

    static {
        A05();
        A00 = new KZ();
    }

    public static synchronized KZ A00() {
        return A00;
    }

    private C1152cd A01(XI xi, JSONObject data, long j, @Nullable String str) throws JSONException {
        String featureConfig = str;
        JSONArray jSONArray = null;
        int i = 0;
        JSONObject jSONObject = data.getJSONArray(A04(82, 10, 102)).getJSONObject(0);
        JSONObject definition = jSONObject.getJSONObject(A04(32, 10, 7));
        C03198t c03198tA00 = C03198t.A00(definition);
        String strOptString = jSONObject.optString(A04(k.AppCompatTheme_viewInflaterClass, 14, 54));
        String adReportingConfig = jSONObject.optString(A04(5, 19, 22));
        C03188s c03188s = new C03188s(c03198tA00, strOptString, adReportingConfig);
        String strA04 = A04(72, 3, 2);
        int i2 = jSONObject.has(strA04) ? 2 : 5;
        while (true) {
            switch (i2) {
                case 2:
                    jSONObject = jSONObject;
                    strA04 = strA04;
                    jSONArray = jSONObject.getJSONArray(strA04);
                    i = 0;
                    i2 = 3;
                    break;
                case 3:
                    jSONArray = jSONArray;
                    int i3 = jSONArray.length();
                    if (i >= i3) {
                        i2 = 5;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    xi = xi;
                    featureConfig = featureConfig;
                    c03188s = c03188s;
                    jSONArray = jSONArray;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C0567Jf.A06(xi, jSONObject2, j, featureConfig);
                    String strOptString2 = jSONObject2.optString(A04(61, 7, 95));
                    String strOptString3 = jSONObject2.optString(A04(42, 15, 80));
                    JSONObject definition2 = jSONObject2.optJSONObject(A04(92, 4, 75));
                    c03188s.A09(new C03168q(strOptString2, strOptString3, definition2, jSONObject2.optJSONArray(A04(24, 8, 107))));
                    i++;
                    i2 = 3;
                    break;
                case 5:
                    return new C1152cd(c03188s, data.optString(A04(96, 18, 75)));
            }
        }
    }

    private C1153ce A02(JSONObject jSONObject) {
        return new C1153ce(jSONObject.optString(A04(75, 7, 62), A04(57, 0, 48)), jSONObject.optInt(A04(68, 4, 54), 0), null);
    }

    private C1153ce A03(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray(A04(82, 10, 102)).getJSONObject(0);
            C03198t c03198tA00 = C03198t.A00(jSONObject2.getJSONObject(A04(32, 10, 7)));
            String strOptString = jSONObject2.optString(A04(k.AppCompatTheme_viewInflaterClass, 14, 54));
            String featureConfig = A04(5, 19, 22);
            String strOptString2 = jSONObject2.optString(featureConfig);
            String strA04 = A04(75, 7, 62);
            String adReportingConfig = A04(57, 0, 48);
            String strOptString3 = jSONObject.optString(strA04, adReportingConfig);
            String adReportingConfig2 = A04(68, 4, 54);
            return new C1153ce(strOptString3, jSONObject.optInt(adReportingConfig2, 0), new C03188s(c03198tA00, strOptString, strOptString2));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final C0589Kb A06(XI xi, String str, long j, @Nullable String str2) throws JSONException {
        String str3 = str;
        String type = null;
        JSONObject jSONObjectOptJSONObject = null;
        int iHashCode = 0;
        JSONObject jSONObject = null;
        char c2 = 0;
        char c3 = 0;
        String strA04 = null;
        char c4 = !TextUtils.isEmpty(str3) ? (char) 2 : (char) 14;
        while (true) {
            switch (c4) {
                case 2:
                    str3 = str3;
                    jSONObject = new JSONObject(str3);
                    type = jSONObject.optString(A04(57, 4, 28));
                    c2 = 65535;
                    iHashCode = type.hashCode();
                    strA04 = A04(0, 5, 79);
                    c3 = 1;
                    if (iHashCode == 96432) {
                        c4 = '\n';
                        break;
                    } else {
                        c4 = 3;
                        break;
                    }
                case 3:
                    if (iHashCode == 96784904) {
                        c4 = '\b';
                        break;
                    } else {
                        c4 = 4;
                        break;
                    }
                case 4:
                    if (c2 == 0) {
                        c4 = '\r';
                        break;
                    } else {
                        c4 = 5;
                        break;
                    }
                case 5:
                    if (c2 == c3) {
                        c4 = '\f';
                        break;
                    } else {
                        c4 = 6;
                        break;
                    }
                case 6:
                    jSONObject = jSONObject;
                    strA04 = strA04;
                    jSONObjectOptJSONObject = jSONObject.optJSONObject(strA04);
                    if (jSONObjectOptJSONObject == null) {
                        c4 = 14;
                        break;
                    } else {
                        c4 = 7;
                        break;
                    }
                case 7:
                    return A02(jSONObjectOptJSONObject);
                case '\b':
                    type = type;
                    strA04 = strA04;
                    if (!type.equals(strA04)) {
                        c4 = 4;
                        break;
                    } else {
                        c4 = '\t';
                        break;
                    }
                case '\t':
                    c2 = 1;
                    c4 = 4;
                    break;
                case '\n':
                    type = type;
                    if (!type.equals(A04(72, 3, 2))) {
                        c4 = 4;
                        break;
                    } else {
                        c4 = 11;
                        break;
                    }
                case 11:
                    c2 = 0;
                    c4 = 4;
                    break;
                case '\f':
                    return A03(jSONObject);
                case '\r':
                    return A01(xi, jSONObject, j, str2);
                case 14:
                    return new C0589Kb(EnumC0588Ka.A04);
            }
        }
    }
}
