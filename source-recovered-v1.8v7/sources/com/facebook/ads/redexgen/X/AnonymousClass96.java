package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.96, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass96 {
    public static byte[] A00;
    public static final SparseIntArray A01;
    public static final Map<String, Integer> A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{68, 88, 85, 87, 81, 89, 81, 90, 64, 71, 75, 95, 81, 77, 87, 111, 109, 116, 116, 109, 106, 99, 36, 109, 106, 109, 112, 36, 96, 113, 97, 36, 112, 107, 36, 104, 101, 103, 111, 36, 107, 98, 36, 103, 107, 106, 106, 97, 103, 112, 109, 114, 109, 112, 125, 42, 110, 106, 105, 93, 76, 65, 77, 70, 75, 77, 102, 77, 92, 95, 71, 90, 67, 8, 7, 2, 2, 85, 73, 68, 70, 64, 72, 64, 75, 81, 122, 67, 74, 87, 72, 68, 81, 86, 121, 117, 116, 116, Byte.MAX_VALUE, 121, 110, 115, 108, 115, 110, 99, 90, 77, 89, 93, 77, 91, 92, 1, 29, 16, 18, 20, 28, 20, 31, 5, 46, 24, 21, 2, 30, 15, 23, 2, 1, 15, 10, 0, 11, 6, 6, 7, 16, 61, 22, 13, 9, 7, 12, 7, 16, 11, 1, 9, 0, 22, 59, 56, 60, 41, 40, 47, 56, 2, 62, 50, 51, 59, 52, 58, 123, 119, 118, 108, 125, 96, 108};
    }

    static {
        A02();
        A02 = new HashMap();
        A01 = new SparseIntArray();
        A01.put(19, 1);
        A01.put(18, 2);
        A01.put(20, 4);
        A01.put(36, 6);
        A01.put(40, 3);
        A01.put(61, 5);
    }

    public static synchronized Integer A00(String str) {
        Integer num = A02.get(str);
        if (num != null) {
            return Integer.valueOf(A01.get(num.intValue()));
        }
        return 0;
    }

    public static void A03(XJ xj, MultithreadedBundleWrapper multithreadedBundleWrapper) throws JSONException {
        ArrayList<String> stringArrayList;
        NetworkInfo activeNetworkInfo;
        String bidderToken = DynamicLoaderFactory.makeLoader(xj).createBidderTokenProviderApi().getBidderToken(xj);
        ConnectivityManager connectivityManager = (ConnectivityManager) xj.getSystemService(A01(94, 12, 35));
        if (connectivityManager != null && ((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting())) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A01(56, 17, 17), A01(14, 42, 61));
                return;
            }
            return;
        }
        Q6 q6A02 = QO.A02(false, xj);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(133, 12, 91), bidderToken);
        if (multithreadedBundleWrapper != null && (stringArrayList = multithreadedBundleWrapper.getStringArrayList(A01(0, 14, 45))) != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String placement = it.next();
                jSONArray.put(placement);
            }
            jSONObject2.put(A01(113, 13, 72), jSONArray);
        }
        A04(xj, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A01(77, 17, 28), A01(73, 4, 87));
        jSONObject3.put(A01(152, 14, 100), A01(73, 4, 87));
        jSONObject.put(A01(166, 7, 33), jSONObject2);
        jSONObject.put(A01(106, 7, 17), jSONObject3);
        QK qk = new QK();
        qk.put(A01(126, 7, 87), jSONObject.toString());
        Q5 q5ABj = q6A02.ABj(C0590Kc.A05(xj), qk.A08());
        if (q5ABj != null && q5ABj.A77() == 200) {
            String strA5U = q5ABj.A5U();
            if (!TextUtils.isEmpty(strA5U)) {
                JSONObject payload = new JSONObject(strA5U).optJSONObject(A01(145, 7, 92));
                JSONObject jSONObjectOptJSONObject = payload.optJSONObject(A01(77, 17, 28));
                String strOptString = payload.optString(A01(152, 14, 100));
                if (!TextUtils.isEmpty(strOptString)) {
                    JQ.A0L(xj).A1m(strOptString);
                }
                HashMap map = new HashMap();
                Iterator<String> keyIterator = jSONObjectOptJSONObject.keys();
                while (keyIterator.hasNext()) {
                    String next = keyIterator.next();
                    map.put(next, Integer.valueOf(Integer.parseInt(jSONObjectOptJSONObject.getString(next))));
                }
                synchronized (A02) {
                    A02.putAll(map);
                }
            }
        }
    }

    public static void A04(XJ xj, JSONObject jSONObject) throws JSONException {
        Iterator<Map.Entry<String, String>> it = AnonymousClass94.A00().A02(xj, true).A69().entrySet().iterator();
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
                    Map.Entry<String, String> entry = it.next();
                    jSONObject.put(entry.getKey(), entry.getValue());
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
