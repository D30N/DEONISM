package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0940Xw implements JU {
    public static byte[] A02;
    public static final String A03;
    public XJ A00;
    public C0939Xv A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-24, -6, 7, 11, -6, 7, -75, 5, 7, 4, -8, -6, 8, 8, -6, -7, -75, -6, 11, -6, 3, 9, -34, -7, -75, -54, -59, -63, -69, -60, -55, 27, 26, 22, 41, 42, 39, 26, -30, 24, 36, 35, 27, 30, 28, -30, 26, 43, 26, 35, 41, -30, 34, 22, 28, 30, 24, 16, 33, 16, 25, 31, 30, -13, 14, 22, 25, 18, 17, -51, 33, 28, -51, 29, 14, 31, 32, 18, -51, 14, 27, -51, 18, 35, 18, 27, 33, -51, 22, 27, -51, 18, 35, 18, 27, 33, 32, -51, 25, 22, 32, 33, -51, 36, 21, 18, 27, -51, 29, 31, 18, 29, 14, 31, 22, 27, 20, -51, 17, 22, 32, 29, 14, 33, 16, 21, -51, 29, 14, 38, 25, 28, 14, 17, -37, -51, -33, -20, -16, -33, -20, -102, -20, -33, -18, -17, -20, -24, -33, -34, -102, -20, -33, -18, -20, -13, -37, -36, -26, -33, -102, -33, -20, -20, -23, -20, -102, -35, -23, -34, -33, -102, 122, -64, -55, -52, 122, -65, -48, -65, -56, -50, -93, -66, 122, -7, 11, 24, 28, 11, 24, -58, 24, 11, 26, 27, 24, 20, 11, 10, -58, 20, 21, 20, -45, 24, 11, 26, 24, 31, 7, 8, 18, 11, -58, 11, 24, 24, 21, 24, -58, 9, 21, 10, 11, -58, -66, -54, -65, -64, -21, -51, -26, -39, -38, -28, -35, -104, -20, -25, -104, -24, -39, -22, -21, -35, -104, -21, -35, -22, -18, -35, -22, -104, -22, -35, -21, -24, -25, -26, -21, -35, -104, -39, -20, -104, -24, -25, -21, -31, -20, -31, -25, -26, -104, 53, 40, 38, 50, 53, 39, 34, 39, 36, 55, 36, 37, 36, 54, 40, -75, -42, -35, -42, -27, -42, -43, -111, -42, -25, -42, -33, -27, -28, -111, -42, -23, -44, -42, -42, -43, -42, -43, -111, -29, -42, -27, -29, -22, -111, -35, -38, -34, -38, -27, -97, -111, -76, -32, -26, -33, -27, -85, -111, -59, -64, -68, -74, -65, -80, -70, -75, -16, -21, 114, -59, -57, -75, -75, -73, -59, -59, -72, -57, -66, -66, -53, Byte.MIN_VALUE, 36, 35, 31, 50, 51, 48, 35, 29, 33, 45, 44, 36, 39, 37, 4, 31, 39, 42, 35, 34, -34, 50, 45, -34, 46, 31, 48, 49, 35, -34, 31, 44, -34, 35, 52, 35, 44, 50, -34, 39, 44, -34, 35, 52, 35, 44, 50, 49, -34, 31, 48, 48, 31, 55, -34, 36, 45, 48, -34, 34, 39, 49, 46, 31, 50, 33, 38, -34, 36, 31, 39, 42, 51, 48, 35, -20, 18, 13, 9, 3, 12};
    }

    static {
        A01();
        A03 = C0940Xw.class.getSimpleName();
    }

    public C0940Xw(XJ xj, C0939Xv c0939Xv) {
        this.A00 = xj;
        this.A01 = c0939Xv;
    }

    private void A02(Set<String> set, Set<String> set2) throws JSONException {
        int iA0B = this.A01.A0B(JR.A0F(this.A00), set, set2);
        if (iA0B > 0) {
            this.A00.A04().A83(A00(275, 15, 125), C03008a.A0o, new C03018b(A00(290, 44, 43) + iA0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    @Nullable
    public final JSONObject A4G() throws JSONException {
        int iA08;
        JSONArray jSONArrayA04;
        int iA0E = JR.A0E(this.A00);
        List<JSONObject> listA0C = this.A01.A0C(iA0E);
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : listA0C) {
            try {
                String strOptString = jSONObject2.optString(A00(434, 5, 88));
                String string = UUID.randomUUID().toString();
                jSONObject.put(string, strOptString);
                jSONObject2.put(A00(334, 8, 11), string);
            } catch (JSONException e) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A03, A00(63, 72, 103), e);
                }
            }
        }
        JSONArray jSONArray = new JSONArray((Collection) listA0C);
        if (JR.A0O(this.A00) && (jSONArrayA04 = C03028c.A04(this.A00, (iA08 = JR.A08(this.A00)))) != null && jSONArrayA04.length() > 0) {
            jSONArray = C1122c7.A02(jSONArrayA04, jSONArray, iA0E + iA08);
        }
        JSONObject jSONObject3 = null;
        try {
            if (jSONArray.length() > 0) {
                jSONObject3 = new JSONObject();
                if (jSONObject.length() > 0) {
                    jSONObject3.put(A00(25, 6, 16), jSONObject);
                }
                jSONObject3.put(A00(57, 6, 101), jSONArray);
            }
            return jSONObject3;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final boolean A7j() {
        boolean z = false;
        char c2 = this.A01.A0A() > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final void A8r() {
        C03028c.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final void A9K(JSONArray jSONArray) throws JSONException {
        String string = null;
        int length = jSONArray.length();
        HashSet hashSet = new HashSet(length);
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i < length) {
                        i2 = 3;
                    } else {
                        i2 = 13;
                        continue;
                    }
                case 3:
                    try {
                        jSONArray = jSONArray;
                        string = jSONArray.getJSONObject(i).getString(A00(342, 2, 65));
                        if (C03028c.A0I(string)) {
                            i2 = 8;
                        } else {
                            i2 = 9;
                            continue;
                        }
                    } catch (JSONException e) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A03, A00(372, 62, k.AppCompatTheme_windowFixedWidthMajor), e);
                            break;
                        }
                    }
                    break;
                case 8:
                    string = string;
                    C03028c.A0D(string);
                    break;
                case 9:
                    hashSet = hashSet;
                    string = string;
                    hashSet.add(string);
                    break;
                case 13:
                    A02(hashSet, new HashSet());
                    return;
            }
            i++;
            i2 = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final boolean A9M(JSONArray jSONArray) throws JSONException {
        String strA00 = A00(230, 1, k.AppCompatTheme_windowFixedHeightMinor);
        boolean z = true;
        boolean zA0O = JR.A0O(this.A00);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(A00(342, 2, 65));
                String eventId = A00(31, 26, 111);
                if (eventId.equals(string)) {
                    String eventId2 = A00(358, 14, k.AppCompatTheme_windowFixedWidthMajor);
                    JQ.A0L(this.A00).A1m(jSONObject.getString(eventId2));
                    DynamicLoaderFactory.makeLoader(this.A00).getInitApi().maybeAttachCrashListener(this.A00);
                } else {
                    String eventId3 = A00(226, 4, 21);
                    int i2 = jSONObject.getInt(eventId3);
                    if (i2 == 1) {
                        if (BuildConfigApi.isDebug()) {
                            StringBuilder sb = new StringBuilder();
                            String eventId4 = A00(0, 25, 79);
                            sb.append(eventId4);
                            sb.append(string);
                            String eventId5 = A00(344, 14, 12);
                            sb.append(eventId5);
                            sb.toString();
                        }
                        if (zA0O) {
                            C03028c.A0C(string);
                        }
                        hashSet.add(string);
                    } else {
                        String strA002 = A00(172, 13, 20);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (BuildConfigApi.isDebug()) {
                                String str = A03;
                                StringBuilder sb2 = new StringBuilder();
                                String eventId6 = A00(135, 37, 52);
                                sb2.append(eventId6);
                                sb2.append(i2);
                                sb2.append(strA002);
                                sb2.append(string);
                                sb2.append(strA00);
                                String eventId7 = sb2.toString();
                                Log.e(str, eventId7);
                            }
                            if (C03028c.A0I(string)) {
                                C03028c.A0D(string);
                            } else {
                                hashSet2.add(string);
                            }
                            z = false;
                        } else if (i2 >= 2000 && i2 < 3000) {
                            if (BuildConfigApi.isDebug()) {
                                String str2 = A03;
                                StringBuilder sb3 = new StringBuilder();
                                String eventId8 = A00(185, 41, 96);
                                sb3.append(eventId8);
                                sb3.append(i2);
                                sb3.append(strA002);
                                sb3.append(string);
                                sb3.append(strA00);
                                String eventId9 = sb3.toString();
                                Log.e(str2, eventId9);
                            }
                            hashSet.add(string);
                            if (zA0O) {
                                C03028c.A0C(string);
                            }
                        }
                    }
                    C8D c8dA01 = this.A00.A01();
                    XJ xj = this.A00;
                    String eventId10 = jSONObject.toString();
                    c8dA01.A7y(xj, eventId10);
                }
            } catch (JSONException e) {
                if (BuildConfigApi.isDebug()) {
                    String str3 = A03;
                    StringBuilder sb4 = new StringBuilder();
                    String eventId11 = A00(231, 44, 50);
                    sb4.append(eventId11);
                    sb4.append(i);
                    sb4.append(strA00);
                    String eventId12 = sb4.toString();
                    Log.e(str3, eventId12, e);
                }
                z = false;
            }
        }
        A02(hashSet2, hashSet);
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.JU
    public final void AAl() {
        this.A01.A3z();
        C03028c.A07(this.A00);
    }
}
