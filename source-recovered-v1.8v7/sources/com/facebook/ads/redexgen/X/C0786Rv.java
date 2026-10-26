package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0786Rv extends AnonymousClass17 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{83, 84, 78, 95, 72, 73, 78, 83, 78, 83, 91, 86, 90, 75, 88, 89, 67, 68, 77, 113, 115, 96, 125, 103, 97, 119, 126};
    }

    public C0786Rv(List<C1A> list) {
        super(list);
    }

    public static C0786Rv A01(JSONObject jSONObject, XI xi) {
        int i = 0;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(19, 8, 100));
        ArrayList arrayList = new ArrayList();
        char c2 = jSONArrayOptJSONArray != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    if (jSONArrayOptJSONArray.length() <= 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    if (i >= jSONArrayOptJSONArray.length()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    try {
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        C1A adInfo = C1A.A00(jSONObject2);
                        adInfo.A0H(jSONObject2);
                        arrayList.add(adInfo);
                    } catch (JSONException e) {
                        xi.A04().A83(A02(12, 7, 92), C03008a.A1h, new C03018b(e));
                        e.printStackTrace();
                    }
                    i++;
                    c2 = 4;
                    break;
                case 11:
                    jSONObject = jSONObject;
                    arrayList = arrayList;
                    C1A c1aA00 = C1A.A00(jSONObject);
                    c1aA00.A0H(jSONObject);
                    arrayList.add(c1aA00);
                    c2 = '\f';
                    break;
                case '\f':
                    C0786Rv c0786Rv = new C0786Rv(arrayList);
                    c0786Rv.A0d(jSONObject);
                    c0786Rv.A0b(A02(0, 12, 76));
                    return c0786Rv;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass17
    public final int A0H() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass17
    public final int A0I() {
        return 0;
    }
}
