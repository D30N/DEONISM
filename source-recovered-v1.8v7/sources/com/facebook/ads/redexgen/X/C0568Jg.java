package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0568Jg {
    public static byte[] A00;
    public static final String A01;
    public static final AtomicBoolean A02;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-71, -61, -63, -43, -57, -56, -44, -65, -59, -40, -61, -59, -48, -44, -55, -49, -50, -15, 2, -15, -6, 0, -1, -4, 8, 6, -57, -1, -6, -4, -2, -5, 8, 8, 4, -57, -6, -3, 12, -57, -27, -24, -36, -38, -27, -8, -36, -24, -18, -25, -19, -34, -21, -20, -36, -33, -33, -28, -17, -28, -22, -23, -36, -25, -38, -28, -23, -31, -22, -76, -73, -85, -87, -76, -89, -85, -73, -67, -74, -68, -83, -70, -69, 93, -9, 24, 29, -55, 18, 23, 18, 29, 18, 10, 21, 18, 35, 14, 13, -54, -16, 21, 10, 25, 12, 20, 12, 21, 27, 16, 21, 14, -57, 10, 22, 28, 21, 27, 12, 25, -31, -57, -28, -26, -45, -27, -22, -31, -42, -45, -26, -26, -41, -33, -30, -26, -59, -57, -76, -58, -53, -62, -73, -79, -75, -63, -74, -73, -57, -72, -48, -61, -58, -72, -69, -33, -32, -51, -49, -41, -32, -34, -51, -49, -47, 7, 4, 23, 4, -19, 16, 4, 2, 13, -28, 16, 22, 15, 21, 6, 19, 20, -78, -92, -46, -23, -5, -92, -6, -27, -16, -7, -23, -66, -92};
    }

    static {
        A02();
        A01 = C0568Jg.class.getSimpleName();
        A02 = new AtomicBoolean();
    }

    public static void A03(C8C c8c) {
        char c2 = A09(c8c) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (!A02.getAndSet(true)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    M3.A05.execute(new C1123c8(c8c));
                    return;
            }
        }
    }

    public static void A04(C8C c8c, Q6 q6, Map<String, ?> map) throws JSONException {
        HashMap map2 = new HashMap();
        map2.put(A01(129, 7, 70), A01(83, 1, 1));
        A07(c8c, map2);
        HashMap map3 = new HashMap();
        map3.put(A01(k.AppCompatTheme_windowMinWidthMajor, 7, 69), A01(69, 14, 28));
        map3.put(A01(136, 12, 38), String.valueOf(3501));
        map3.put(A01(1, 16, 52), A01(0, 1, 92));
        map3.put(A01(155, 10, 64), A01(169, 13, k.AppCompatTheme_windowActionModeOverlay));
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONObject = jSONObject;
                    it = it;
                    Map.Entry<String, ?> e = it.next();
                    jSONObject.put(e.getKey(), String.valueOf(e.getValue()));
                    c2 = 2;
                    break;
                case 4:
                    C8C c8c2 = c8c;
                    HashMap map4 = map3;
                    map4.put(A01(54, 15, 79), jSONObject.toString());
                    A07(c8c2, map4);
                    C03248z sessionData = c8c2.A05();
                    JSONObject jSONObjectA05 = C03028c.A05(new C03048e(sessionData.A01(), sessionData.A02(), map4));
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObjectA05);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(A01(165, 4, k.AppCompatTheme_windowFixedHeightMinor), new JSONObject(map2));
                    jSONObject2.put(A01(17, 6, 96), jSONArray);
                    QK qk = new QK();
                    qk.put(A01(148, 7, 43), jSONObject2.toString());
                    q6.ABk(c8c2.A03().A6H(), qk.A08(), new c9());
                    return;
            }
        }
    }

    public static void A06(C8C c8c, String str) {
        if (A09(c8c)) {
            return;
        }
        if (!A02.get()) {
            c8c.A04().A8H(A01(69, 14, 28), 3502, new C03018b(A01(84, 16, 125)));
            return;
        }
        synchronized (C0568Jg.class) {
            SharedPreferences sharedPreferences = c8c.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(23, 31, 109), c8c), 0);
            int i = sharedPreferences.getInt(str, 0) + 1;
            sharedPreferences.edit().putInt(str, i).apply();
            if (BuildConfigApi.isDebug()) {
                String str2 = A01(100, 22, k.AppCompatTheme_windowMinWidthMinor) + str + A01(182, 13, 88) + i;
            }
        }
    }

    public static void A07(C8C c8c, Map<String, String> map) {
        Map<String, String> dataMap = c8c.A02().A4S();
        map.putAll(dataMap);
    }

    @VisibleForTesting
    public static boolean A08(double d2, int i) {
        boolean z = true;
        char c2 = i > 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (d2 < 1.0d / i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
                case 5:
                    return z;
            }
        }
    }

    public static boolean A09(C8C c8c) {
        char c2 = BuildConfigApi.isDebug() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c8c = c8c;
                    if (!JR.A0S(c8c)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return true;
                case 5:
                    C8C c8c2 = c8c;
                    return A08(c8c2.A05().A00(), JR.A0B(c8c2));
            }
        }
    }
}
