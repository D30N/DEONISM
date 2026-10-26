package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0567Jf {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{22, 1, 21, 17, 1, 23, 16, 59, 16, 13, 9, 1, 59, 9, 23, 112, 99, 120, 120, 115, 122, 51, 48, 62, 59, 0, 43, 54, 50, 58, 0, 50, 44, 90, 77, 125, 120, 109, 120, 34, 47, 8, 49, 34, 57, 57, 50, 59, 8, 59, 56, 48, 48, 62, 57, 48};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    @Nullable
    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(XI xi, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    jSONArray = jSONArray;
                    if (i >= jSONArray.length()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    try {
                        jSONArray = jSONArray;
                        arrayList.add(jSONArray.getString(i));
                        i++;
                        c2 = 2;
                        break;
                    } catch (JSONException e) {
                        xi.A04().A83(A00(39, 17, 96), C03008a.A0x, new C03018b(e));
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return arrayList;
            }
        }
    }

    public static void A04(View view, C0565Jd c0565Jd, EnumC0564Jc enumC0564Jc) {
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0566Je(c0565Jd, enumC0564Jc));
    }

    public static void A05(XI xi, String str, long j) {
        C0565Jd c0565Jd = new C0565Jd(str, xi.A06());
        HashMap map = new HashMap();
        map.put(A00(0, 15, 83), C0627Lq.A06(j));
        map.put(A00(21, 12, 104), C0627Lq.A04(j));
        c0565Jd.A02(EnumC0564Jc.A0C, map);
    }

    public static void A06(XI xi, JSONObject jSONObject, long j, @Nullable String str) {
        JSONObject jSONObject2 = jSONObject;
        XI xi2 = xi;
        String str2 = str;
        JSONArray jSONArrayOptJSONArray = null;
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(A00(35, 4, 46));
        char c2 = jSONObjectOptJSONObject == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jSONObject2 = jSONObject2;
                    str2 = str2;
                    jSONArrayOptJSONArray = jSONObject2.optJSONArray(A00(15, 6, 33));
                    if (!TextUtils.isEmpty(str2)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    if (jSONArrayOptJSONArray == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    xi2 = xi2;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    A07(xi2, jSONObjectOptJSONObject, A02(xi2, jSONArrayOptJSONArray), j, null);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    str2 = str2;
                    if (!TextUtils.isEmpty(str2)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case '\b':
                    str2 = str2;
                    if (!A02.containsKey(str2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    xi2 = xi2;
                    str2 = str2;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    A07(xi2, jSONObjectOptJSONObject, A02.get(str2), j, str2);
                    c2 = 6;
                    break;
            }
        }
    }

    public static void A07(XI xi, JSONObject jSONObject, List<String> list, long j, @Nullable String str) {
        String strA00 = A00(33, 2, 14);
        if (jSONObject.has(strA00)) {
            String strOptString = jSONObject.optString(strA00);
            A08(strOptString, str);
            A09(strOptString, list);
            A05(xi, strOptString, j);
        }
    }

    public static void A08(@Nullable String str, @Nullable String str2) {
        char c2 = !TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    if (!TextUtils.isEmpty(str2)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    A01.put(str, str2);
                    return;
            }
        }
    }

    public static void A09(String str, List<String> list) {
        char c2 = !TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (!list.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    A02.put(str, list);
                    return;
            }
        }
    }

    public static boolean A0A(String str, EnumC0564Jc enumC0564Jc) {
        return A0B(str, enumC0564Jc.A02());
    }

    public static boolean A0B(String str, String str2) {
        boolean z = false;
        char c2 = A02.containsKey(str) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    str2 = str2;
                    if (!A02.get(str).contains(str2)) {
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
}
