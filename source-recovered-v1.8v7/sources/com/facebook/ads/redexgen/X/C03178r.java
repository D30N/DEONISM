package com.facebook.ads.redexgen.X;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03178r {
    public static byte[] A05;
    public String A00;
    public String A01;
    public String A02;
    public Date A03;
    public boolean A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{35, 14, 25, 34, 18, -54, -60, -40, -16, -19, -25, -102, -96, -89, -13, -13, -13, -38, -50, 18, 18, -37, -5, -5, -5, -37, 39, 39, 39, 39, -50, -10, -10, -24, 27, 27, -24, 33, 33, -50, 40, 40, 40, -1, 18, 10, 3, 12, -5, 14, 3, 9, 8};
    }

    public C03178r(String str, String str2, String str3, Date date) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = date;
        this.A04 = (str2 == null || str3 == null) ? false : true;
    }

    public C03178r(JSONObject jSONObject) {
        this(jSONObject.optString(A00(8, 3, 60)), jSONObject.optString(A00(5, 3, 32)), jSONObject.optString(A00(0, 5, 110)), new Date(jSONObject.optLong(A00(43, 10, 91)) * 1000));
    }

    public static List<C03178r> A01(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = null;
            try {
                jSONObject = jSONArray.getJSONObject(i);
            } catch (JSONException unused2) {
            }
            if (jSONObject != null) {
                arrayList.add(new C03178r(jSONObject));
            }
        }
        return arrayList;
    }

    public final String A03() {
        Date date = this.A03;
        if (date == null) {
            date = new Date();
            date.setTime(date.getTime() + 3600000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A00(14, 29, 111));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(A00(11, 3, 20)));
        return simpleDateFormat.format(date);
    }

    public final boolean A04() {
        C03178r c03178r = this;
        boolean z = false;
        char c2 = c03178r.A00 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c03178r = c03178r;
                    if (c03178r.A02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03178r = c03178r;
                    if (c03178r.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
