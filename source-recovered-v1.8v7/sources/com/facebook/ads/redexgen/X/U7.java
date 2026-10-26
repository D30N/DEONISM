package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class U7 implements AnonymousClass63 {
    public static byte[] A01;
    public static final String A02;
    public final XJ A00;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-88, -81, -86, -123, -100, -79, -100, -15, -21, -23, -72, -21, -42, -40, -29, -25, -36, -30, -31, -109, -43, -24, -36, -33, -41, -36, -31, -38, -109, -71, -76, -63, -109, -33, -30, -38, -38, -36, -31, -38, -109, -67, -58, -62, -63, -103, -98, -84, -83, -101, -86, -90, -70, -68, -73, -68, -71, -52, -71, -73, -60, -57, -65, -65, -63, -58, -65, 120, Byte.MIN_VALUE};
    }

    static {
        A01();
        A02 = U7.class.getSimpleName();
    }

    public U7(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass63
    public final void A8C(String str, String str2, Map<String, String> map, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(9, 1, 111), str);
            jSONObject.put(A00(51, 1, 41), str2);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put(A00(7, 2, k.AppCompatTheme_windowActionBarOverlay), jSONObject2.toString());
            jSONObject.put(A00(0, 3, 56), str3);
            jSONObject.put(A00(67, 2, 5), str4);
            jSONObject.put(A00(46, 3, 43), str5);
            jSONObject.put(A00(49, 2, 40), str6);
            jSONObject.put(A00(45, 1, 40), A00(3, 4, 45));
            C03018b c03018b = new C03018b(jSONObject.toString());
            c03018b.A03(1);
            this.A00.A04().A84(A00(52, 15, 74), 3202, c03018b);
        } catch (JSONException e) {
            Log.e(A02, A00(10, 35, 101), e);
        }
    }
}
