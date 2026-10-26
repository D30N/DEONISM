package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03168q {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final Map<EnumC03208u, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{50, 53, 43, 21, 24, 17, 4};
    }

    public C03168q(String str, String str2, JSONObject jSONObject, @Nullable JSONArray jSONArray) throws JSONException {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (EnumC03208u enumC03208u : EnumC03208u.values()) {
            this.A02.put(enumC03208u, new LinkedList());
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString(A00(3, 4, 22));
                String string2 = jSONObject2.getString(A00(0, 3, 48));
                EnumC03208u enumC03208uValueOf = EnumC03208u.valueOf(string.toUpperCase(Locale.US));
                if (enumC03208uValueOf != null && !TextUtils.isEmpty(string2)) {
                    this.A02.get(enumC03208uValueOf).add(string2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A01;
    }

    public final List<String> A04(EnumC03208u enumC03208u) {
        return this.A02.get(enumC03208u);
    }

    public final JSONObject A05() {
        return this.A03;
    }
}
