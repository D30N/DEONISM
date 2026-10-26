package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01341d {
    public static byte[] A00;
    public static final String A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A00 = new byte[]{-33, -35, -33, -28, -31, -37, -23, -35, -22, -32, -35, -16, -21, -18, -11, -37, -27, -23, -35, -29, -31, -17, 4, 1, -5, 8, 6, 8, 13, 10, 4, 20, 21, 25, 14, 20, 19, 6, 17, 4, 11, 14, 17, 10, 24, 19, 36, 53, 54, 44, 49, 42, -29, 40, 53, 53, 50, 53, -15, 20, 7, 2, 3, 13, -3, 14, 16, 3, 10, 13, -1, 2, -3, 17, 7, 24, 3, -3, 0, 23, 18, 3, 17, -53, -55, -53, -48, -51, -57, -41, -40, -36, -47, -41, -42, -55, -44, -57, -47, -43, -55, -49, -51, -37, 28, 14, 9, 25, 13, -62, -65, -61, -63, -62, -50, -88, -90, -88, -83, -86, -92, -78, -90, -77, -87, -90, -71, -76, -73, -66, -92, -69, -82, -87, -86, -76, -72, -23, -4, -8, -23, -14, -9, -19, -13, -14, -78, -80, -78, -73, -76, -82, -66, -65, -61, -72, -66, -67, -80, -69, -82, -59, -72, -77, -76, -66, -62, -68, -70, -68, -63, -66, -72, -58, -70, -57, -67, -70, -51, -56, -53, -46, -72, -65, -62, -59, -66, -52};
    }

    static {
        A0A();
        A01 = C01341d.class.getName();
    }

    public static List<C01311a> A01(JSONArray jSONArray, boolean z) throws IllegalStateException, JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C01311a(jSONObject.getString(A00(22, 3, 74)), jSONObject.optString(A00(137, 9, 63))));
                } catch (JSONException e) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A01, A00(45, 14, 126), e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C01321b> A02(JSONArray jSONArray, boolean z) throws IllegalStateException, JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C01321b(jSONObject.getString(A00(22, 3, 74)), jSONObject.optInt(A00(104, 5, 96)), jSONObject.optInt(A00(109, 6, 21))));
                } catch (JSONException e) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A01, A00(45, 14, 126), e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C01331c> A03(JSONArray jSONArray, boolean z) throws IllegalStateException, JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C01331c(jSONObject.getString(A00(22, 3, 74)), jSONObject.optLong(A00(59, 24, 89), -1L)));
                } catch (JSONException e) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A01, A00(45, 14, 126), e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C01311a> A04(JSONObject jSONObject) throws IllegalStateException {
        return A01(jSONObject.optJSONArray(A00(167, 21, 20)), true);
    }

    public static List<C01321b> A05(JSONObject jSONObject) throws IllegalStateException {
        return A02(jSONObject.optJSONArray(A00(0, 22, 55)), true);
    }

    public static List<C01331c> A06(JSONObject jSONObject) throws IllegalStateException {
        return A03(jSONObject.optJSONArray(A00(k.AppCompatTheme_windowActionBar, 22, 0)), true);
    }

    public static List<C01311a> A07(JSONObject jSONObject) throws IllegalStateException {
        return A01(jSONObject.optJSONArray(A00(25, 20, 96)), false);
    }

    public static List<C01321b> A08(JSONObject jSONObject) throws IllegalStateException {
        return A02(jSONObject.optJSONArray(A00(83, 21, 35)), false);
    }

    public static List<C01331c> A09(JSONObject jSONObject) throws IllegalStateException {
        return A03(jSONObject.optJSONArray(A00(146, 21, 10)), false);
    }
}
