package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.c7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1122c7 implements JU {
    public static byte[] A02;
    public static final String A03;
    public XJ A00;
    public InterfaceC0935Xr A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A02 = new byte[]{18, 36, 49, 53, 36, 49, -33, 47, 49, 46, 34, 36, 50, 50, 36, 35, -33, 36, 53, 36, 45, 51, 8, 35, -33, -30, -35, -39, -45, -36, -31, 48, 47, 43, 62, 63, 60, 47, -9, 45, 57, 56, 48, 51, 49, -9, 47, 64, 47, 56, 62, -9, 55, 43, 49, 51, 45, 41, 58, 41, 50, 56, 55, 26, 44, 57, 61, 44, 57, -25, 57, 44, 59, 60, 57, 53, 44, 43, -25, 57, 44, 59, 57, 64, 40, 41, 51, 44, -25, 44, 57, 57, 54, 57, -25, 42, 54, 43, 44, -25, -113, -43, -34, -31, -113, -44, -27, -44, -35, -29, -72, -45, -113, -26, -8, 5, 9, -8, 5, -77, 5, -8, 7, 8, 5, 1, -8, -9, -77, 1, 2, 1, -64, 5, -8, 7, 5, 12, -12, -11, -1, -8, -77, -8, 5, 5, 2, 5, -77, -10, 2, -9, -8, -77, -34, -37, -18, -37, -36, -37, -19, -33, -35, -23, -34, -33, 8, 12, 37, 24, 25, 35, 28, -41, 43, 38, -41, 39, 24, 41, 42, 28, -41, 42, 28, 41, 45, 28, 41, -41, 41, 28, 42, 39, 38, 37, 42, 28, -41, 24, 43, -41, 39, 38, 42, 32, 43, 32, 38, 37, -41, 19, 44, 31, 32, 42, 35, -34, 50, 45, -34, 46, 31, 48, 49, 35, -34, 35, 52, 35, 44, 50, -34, 31, 50, -34, 13, 46, 53, 46, 61, 46, 45, -23, 46, 63, 46, 55, 61, 60, -23, 46, 65, 44, 46, 46, 45, 46, 45, -23, 59, 46, 61, 59, 66, -23, 53, 50, 54, 50, 61, -9, -23, 12, 56, 62, 55, 61, 3, -23, -19, 6, -7, -6, 4, -3, -72, 12, 7, -72, 8, -7, 10, 11, -3, -72, -4, -3, -6, 13, -1, -28, 7, -1, -35, 14, -3, 6, 12, -72, -7, 12, -72, -30, 19, 2, 11, 17, -67, 17, 22, 13, 2, -67, 13, 15, 12, 0, 2, 16, 16, 2, 1, -67, -1, 22, -67, 17, 5, 2, -67, 16, 2, 15, 19, 2, 15, -41, -67, -28, -33, -25, 58, 60, 42, 42, 44, 58, 58, 45, 60, 51, 51, 64, -11, 61, 50, 54, 46, -18, -19, -23, -4, -3, -6, -19, -25, -21, -9, -10, -18, -15, -17, -64, -37, -29, -26, -33, -34, -102, -18, -23, -102, -22, -37, -20, -19, -33, -102, -37, -24, -102, -33, -16, -33, -24, -18, -102, -29, -24, -102, -33, -16, -33, -24, -18, -19, -102, -37, -20, -20, -37, -13, -102, -32, -23, -20, -102, -34, -29, -19, -22, -37, -18, -35, -30, -102, -32, -37, -29, -26, -17, -20, -33, -88};
    }

    static {
        A05();
        A03 = C1122c7.class.getSimpleName();
    }

    public C1122c7(XJ xj, InterfaceC0935Xr interfaceC0935Xr) {
        this.A00 = xj;
        this.A01 = interfaceC0935Xr;
    }

    public static JSONArray A01(JSONArray jSONArray, JSONArray jSONArray2) {
        int length = 0;
        char c2 = jSONArray != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    jSONArray = jSONArray;
                    length = 0 + jSONArray.length();
                    c2 = 3;
                    break;
                case 3:
                    jSONArray2 = jSONArray2;
                    if (jSONArray2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jSONArray2 = jSONArray2;
                    length += jSONArray2.length();
                    c2 = 5;
                    break;
                case 5:
                    return A02(jSONArray, jSONArray2, length);
            }
        }
    }

    public static JSONArray A02(JSONArray jSONArray, JSONArray jSONArray2, int i) throws JSONException {
        JSONArray jSONArray3 = jSONArray2;
        JSONArray jSONArray4 = jSONArray;
        int i2 = 0;
        JSONArray totalEvents = null;
        double d2 = 0.0d;
        int limit = 0;
        JSONObject objEvent = null;
        JSONException e = null;
        double d3 = 0.0d;
        JSONObject jSONObject = null;
        int i3 = 0;
        int length = 0;
        int i4 = 0;
        int i5 = 0;
        String strA00 = null;
        JSONException e2 = null;
        JSONArray jSONArray5 = jSONArray4;
        JSONArray jSONArray6 = jSONArray3;
        char c2 = jSONArray5 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return jSONArray6;
                case 3:
                    jSONArray6 = jSONArray6;
                    if (jSONArray6 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return jSONArray5;
                case 5:
                    jSONArray4 = jSONArray4;
                    jSONArray3 = jSONArray3;
                    limit = jSONArray4.length();
                    length = jSONArray3.length();
                    totalEvents = new JSONArray();
                    i3 = 0;
                    i5 = 0;
                    jSONObject = null;
                    objEvent = null;
                    d2 = Double.MAX_VALUE;
                    d3 = Double.MAX_VALUE;
                    i4 = i;
                    c2 = 6;
                    break;
                case 6:
                    if (i3 < limit) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i5 >= length) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i4 <= 0) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strA00 = A00(365, 4, 104);
                    if (i3 >= limit) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (jSONObject != null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    try {
                        jSONArray5 = jSONArray5;
                        jSONObject = jSONArray5.getJSONObject(i3);
                        d2 = jSONObject.getDouble(strA00);
                        i2 = limit;
                        c2 = 17;
                        break;
                    } catch (JSONException e3) {
                        e = e3;
                        if (!BuildConfigApi.isDebug()) {
                            c2 = 18;
                            break;
                        } else {
                            c2 = 15;
                            break;
                        }
                    }
                case 15:
                    e = e;
                    i2 = limit;
                    Log.e(A03, A00(280, 33, 55) + i3, e);
                    c2 = 16;
                    break;
                case 16:
                    jSONObject = null;
                    d2 = Double.MAX_VALUE;
                    c2 = 17;
                    break;
                case 17:
                    i3++;
                    c2 = 20;
                    break;
                case 18:
                    i2 = limit;
                    c2 = 16;
                    break;
                case 19:
                    i2 = limit;
                    c2 = 20;
                    break;
                case 20:
                    if (i5 >= length) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (objEvent != null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    try {
                        jSONArray6 = jSONArray6;
                        objEvent = jSONArray6.getJSONObject(i5);
                        d3 = objEvent.getDouble(strA00);
                        c2 = 28;
                        break;
                    } catch (JSONException e4) {
                        e2 = e4;
                        if (!BuildConfigApi.isDebug()) {
                            c2 = 27;
                            break;
                        } else {
                            c2 = 26;
                            break;
                        }
                    }
                case 26:
                    e2 = e2;
                    Log.e(A03, A00(211, 25, 93) + i5, e2);
                    c2 = 27;
                    break;
                case 27:
                    objEvent = null;
                    d3 = Double.MAX_VALUE;
                    c2 = 28;
                    break;
                case 28:
                    i5++;
                    c2 = 29;
                    break;
                case 29:
                    if (jSONObject != null) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    if (objEvent == null) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    if (jSONObject == null) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    if (d3 >= d2) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    totalEvents = totalEvents;
                    totalEvents.put(objEvent);
                    objEvent = null;
                    d3 = Double.MAX_VALUE;
                    c2 = '\"';
                    break;
                case '\"':
                    jSONArray4 = jSONArray4;
                    i4--;
                    jSONArray5 = jSONArray4;
                    limit = i2;
                    c2 = 6;
                    break;
                case '#':
                    totalEvents = totalEvents;
                    totalEvents.put(jSONObject);
                    jSONObject = null;
                    d2 = Double.MAX_VALUE;
                    c2 = '\"';
                    break;
                case '$':
                    jSONArray4 = jSONArray4;
                    jSONArray5 = jSONArray4;
                    limit = i2;
                    c2 = 6;
                    break;
                case '%':
                    if (i4 <= 0) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    if (jSONObject == null) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    totalEvents = totalEvents;
                    totalEvents.put(jSONObject);
                    c2 = '(';
                    break;
                case '(':
                    return totalEvents;
                case ')':
                    if (objEvent == null) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    totalEvents = totalEvents;
                    totalEvents.put(objEvent);
                    c2 = '(';
                    break;
            }
        }
    }

    private JSONObject A03() throws JSONException {
        JSONArray jSONArrayA03;
        JSONObject payload = this.A01.A5L();
        JSONArray jSONArrayA5K = this.A01.A5K();
        if (JR.A0O(this.A00) && (jSONArrayA03 = C03028c.A03(this.A00)) != null && jSONArrayA03.length() > 0) {
            jSONArrayA5K = A01(jSONArrayA03, jSONArrayA5K);
        }
        JSONObject jSONObject = null;
        if (jSONArrayA5K != null) {
            try {
                jSONObject = new JSONObject();
                if (payload != null) {
                    jSONObject.put(A00(25, 6, 13), payload);
                }
                jSONObject.put(A00(57, 6, 99), jSONArrayA5K);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i) throws JSONException {
        int iA08;
        JSONArray jSONArrayA04;
        Pair<JSONObject, JSONArray> pairA7A = this.A01.A7A(i);
        JSONObject jSONObject = (JSONObject) pairA7A.first;
        JSONArray jSONArrayA02 = (JSONArray) pairA7A.second;
        if (JR.A0O(this.A00) && (jSONArrayA04 = C03028c.A04(this.A00, (iA08 = JR.A08(this.A00)))) != null) {
            int debugEventLimit = jSONArrayA04.length();
            if (debugEventLimit > 0) {
                jSONArrayA02 = A02(jSONArrayA04, jSONArrayA02, i + iA08);
            }
        }
        JSONObject jSONObject2 = null;
        if (jSONArrayA02 != null) {
            try {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(25, 6, 13), jSONObject);
                }
                jSONObject2.put(A00(57, 6, 99), jSONArrayA02);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A06(String str) {
        C1122c7 c1122c7 = this;
        char c2 = C03028c.A0I(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    C03028c.A0D(str);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1122c7 = c1122c7;
                    str = str;
                    c1122c7.A01.A7R(str);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final JSONObject A4G() throws JSONException {
        C1122c7 c1122c7 = this;
        JSONObject jSONObjectA03 = null;
        int iA0E = JR.A0E(c1122c7.A00);
        char c2 = iA0E > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1122c7 = c1122c7;
                    jSONObjectA03 = c1122c7.A04(iA0E);
                    c2 = 3;
                    break;
                case 3:
                    return jSONObjectA03;
                case 4:
                    c1122c7 = c1122c7;
                    jSONObjectA03 = c1122c7.A03();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final boolean A7j() {
        int iA0E = JR.A0E(this.A00);
        return iA0E >= 1 && this.A01.A6D() + C03028c.A00(this.A00) > iA0E;
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final void A8r() {
        int iA3y = this.A01.A3y(JR.A0F(this.A00));
        if (iA3y > 0) {
            this.A00.A04().A83(A00(154, 8, 25), C03008a.A0o, new C03018b(A00(236, 44, 104) + iA3y));
        }
        C03028c.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final void A9K(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    try {
                        jSONArray = jSONArray;
                        String eventId = jSONArray.getJSONObject(i).getString(A00(349, 2, 26));
                        A06(eventId);
                    } catch (JSONException e) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A03, A00(383, 62, 25), e);
                        }
                    }
                    i++;
                    c2 = 2;
                    break;
                case '\n':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final boolean A9M(JSONArray jSONArray) throws JSONException {
        String eventId = A00(166, 1, k.AppCompatTheme_windowFixedWidthMinor);
        boolean z = true;
        boolean zA0O = JR.A0O(this.A00);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(A00(349, 2, 26));
                if (A00(31, 26, 105).equals(string)) {
                    JQ.A0L(this.A00).A1m(jSONObject.getString(A00(369, 14, 39)));
                    DynamicLoaderFactory.makeLoader(this.A00).getInitApi().maybeAttachCrashListener(this.A00);
                } else {
                    int i2 = jSONObject.getInt(A00(162, 4, 25));
                    if (i2 == 1) {
                        if (BuildConfigApi.isDebug()) {
                            String str = A00(0, 25, 94) + string + A00(351, 14, 102);
                            String strA6G = this.A01.A6G(string);
                            if (strA6G != null) {
                                StringBuilder sb = new StringBuilder();
                                String eventType = A00(313, 36, 60);
                                sb.append(eventType);
                                sb.append(strA6G);
                                sb.toString();
                            }
                        }
                        if (!this.A01.A4g(string) && zA0O) {
                            C03028c.A0C(string);
                        }
                    } else {
                        String strA00 = A00(100, 13, 14);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (BuildConfigApi.isDebug()) {
                                Log.e(A03, A00(63, 37, 102) + i2 + strA00 + string + eventId);
                            }
                            A06(string);
                            z = false;
                        } else if (i2 >= 2000 && i2 < 3000) {
                            if (BuildConfigApi.isDebug()) {
                                Log.e(A03, A00(113, 41, 50) + i2 + strA00 + string + eventId);
                            }
                            if (!this.A01.A4g(string) && zA0O) {
                                C03028c.A0C(string);
                            }
                        }
                    }
                    this.A00.A01().A7y(this.A00, jSONObject.toString());
                }
            } catch (JSONException e) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A03, A00(167, 44, 86) + i + eventId, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final void AAl() {
        this.A01.A3z();
        C03028c.A07(this.A00);
    }
}
