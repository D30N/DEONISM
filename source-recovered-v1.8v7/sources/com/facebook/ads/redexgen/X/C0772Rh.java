package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0772Rh implements InterfaceC01130i {
    public static byte[] A07;
    public final EnumC01120h A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Collection<String> A05;
    public final Map<String, String> A06;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A07 = new byte[]{-6, -14, 1, -18, -15, -18, 1, -18, 41, 42, 57, 42, 40, 57, 46, 52, 51, 36, 56, 57, 55, 46, 51, 44, 56, 59, 64, 72, 51, 62, 59, 54, 51, 70, 59, 65, 64, 49, 52, 55, 58, 51, 72, 59, 65, 68, 53, 40, 52, 56, 40, 54, 55, 34, 44, 39, 53, 70, -71, -69, -52, -63, -50, -71, -52, -63, -57, -58, -73, -69, -57, -59, -59, -71, -58, -68, 43, 31, 48, 41, 51, 46};
    }

    public C0772Rh(String str, String str2, EnumC01120h enumC01120h, Collection<String> mDetectionStrings, Map<String, String> mMetadata, String str3, String str4) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = enumC01120h;
        this.A05 = mDetectionStrings;
        this.A06 = mMetadata;
        this.A04 = str3;
        this.A02 = str4;
    }

    public static C0772Rh A00(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(A01(76, 6, 105));
        String mMarkup = A01(58, 18, 3);
        String mRequestId = jSONObject.optString(mMarkup);
        String mActivationCommand = A01(46, 10, 110);
        String strOptString2 = jSONObject.optString(mActivationCommand);
        String mActivationCommand2 = A01(56, 2, 125);
        String strA02 = LX.A02(jSONObject, mActivationCommand2);
        String mActivationCommand3 = A01(25, 21, 125);
        EnumC01120h enumC01120hA00 = EnumC01120h.A00(jSONObject.optString(mActivationCommand3));
        try {
            jSONArray = new JSONArray(jSONObject.optString(A01(8, 17, 112)));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        Collection<String> collectionA01 = C01140j.A01(jSONArray);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(0, 8, 56));
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return new C0772Rh(strOptString, mRequestId, enumC01120hA00, collectionA01, map, strOptString2, strA02);
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01130i, com.facebook.ads.redexgen.X.InterfaceC01180n
    public final String A5k() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01130i
    public final Collection<String> A61() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01130i
    public final EnumC01120h A6R() {
        return this.A00;
    }
}
