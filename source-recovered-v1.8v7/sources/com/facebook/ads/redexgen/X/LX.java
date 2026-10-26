package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class LX {
    public static byte[] A00;

    static {
        A05();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{-49, -42, -51, -51};
    }

    public static String A01(Map<String, String> map) throws JSONException {
        Map.Entry<String, String> next = null;
        Iterator<Map.Entry<String, String>> it = null;
        JSONObject jSONObject = new JSONObject();
        char c2 = map != null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    it = map.entrySet().iterator();
                    break;
                case 4:
                    it = it;
                    next = it.next();
                    c2 = 5;
                case 5:
                    try {
                        next = next;
                        jSONObject.put(next.getKey(), next.getValue());
                        break;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        break;
                    }
                case '\n':
                    return jSONObject.toString();
            }
            c2 = it.hasNext() ? (char) 4 : '\n';
        }
    }

    public static String A02(JSONObject jSONObject, String str) {
        return A03(jSONObject, str, null);
    }

    public static String A03(JSONObject jSONObject, String str, String str2) {
        String str3 = null;
        String strOptString = jSONObject.optString(str, str2);
        char c2 = A00(0, 4, 36).equals(strOptString) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str3 = null;
                    c2 = 3;
                    break;
                case 3:
                    return str3;
                case 4:
                    strOptString = strOptString;
                    str3 = strOptString;
                    c2 = 3;
                    break;
            }
        }
    }

    public static List<String> A04(JSONArray jSONArray) {
        String s = null;
        ArrayList arrayList = null;
        int i = 0;
        char c2 = jSONArray == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new ArrayList();
                case 3:
                    arrayList = new ArrayList();
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    jSONArray = jSONArray;
                    if (i >= jSONArray.length()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jSONArray = jSONArray;
                    s = jSONArray.optString(i);
                    if (!TextUtils.isEmpty(s)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    arrayList = arrayList;
                    s = s;
                    arrayList.add(s);
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return arrayList;
            }
        }
    }
}
