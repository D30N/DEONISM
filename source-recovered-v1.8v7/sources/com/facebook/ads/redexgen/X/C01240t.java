package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01240t {
    public static byte[] A03;
    public final HashSet<String> A02 = new HashSet<>();
    public JSONObject A01 = new JSONObject();
    public AtomicReference<String> A00 = new AtomicReference<>(A00(6, 2, 9));

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-50, -61, -48, -57, -51, -62, -69, -67, -48, -39, -50, -35, -28, -37, -33, -48, -49, -54, -44, -49, 43, 34, 40, 39, 18, 35, 24, 37, 28, 34, 23, -32, -34, -19, -43, -52, -46, -47, -68, -52, -64, -64, -46, -49, -49, -62, -53, -64, -62, -68, -48, -62, -64, -48, 3, -9, -9, 9, 6, 6, -7, 2, -9, -7, 7};
    }

    public final String A02() {
        String strA00 = null;
        String str = this.A00.get();
        char c2 = str == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strA00 = A00(6, 2, 9);
                    c2 = 3;
                    break;
                case 3:
                    return strA00;
                case 4:
                    str = str;
                    strA00 = str;
                    c2 = 3;
                    break;
            }
        }
    }

    public final JSONObject A03() {
        return this.A01;
    }

    public final synchronized void A04() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A02.iterator();
        while (it.hasNext()) {
            String encryptedAdId = it.next();
            jSONArray.put(encryptedAdId);
        }
        AtomicReference<String> atomicReference = this.A00;
        String encryptedAdId2 = jSONArray.toString();
        atomicReference.set(encryptedAdId2);
    }

    public final void A05(String encryptedId) throws JSONException {
        C01240t c01240t = this;
        String next = null;
        Iterator<String> itKeys = null;
        char c2 = encryptedId != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    encryptedId = encryptedId;
                    if (!encryptedId.trim().isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c01240t = c01240t;
                    encryptedId = encryptedId;
                    c01240t.A01 = new JSONObject(encryptedId);
                    itKeys = c01240t.A01.keys();
                    c2 = 5;
                    break;
                case 5:
                    itKeys = itKeys;
                    if (!itKeys.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01240t = c01240t;
                    itKeys = itKeys;
                    next = itKeys.next();
                    if (!(c01240t.A01.get(next) instanceof String)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01240t = c01240t;
                    next = next;
                    c01240t.A09(new JSONObject((String) c01240t.A01.get(next)));
                    c2 = 5;
                    break;
                case '\b':
                    return;
            }
        }
    }

    public final synchronized void A06(String str) {
        this.A02.add(str);
    }

    public final synchronized void A07(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.A02.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A08(String str) {
        this.A02.remove(str);
    }

    public final void A09(JSONObject jSONObject) throws JSONException {
        C01240t c01240t = this;
        String strA00 = null;
        String strA002 = null;
        String strOptString = jSONObject.optString(A00(8, 12, 20), null);
        int iOptInt = jSONObject.optInt(A00(0, 6, 7));
        int iOptInt2 = jSONObject.optInt(A00(20, 11, 92));
        long jOptLong = jSONObject.optLong(A00(31, 3, 38));
        C1L c1l = new C1L(strOptString);
        char c2 = strOptString != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01240t = c01240t;
                    strOptString = strOptString;
                    if (!c01240t.A01.has(strOptString)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01240t = c01240t;
                    strOptString = strOptString;
                    if (!(c01240t.A01.get(strOptString) instanceof C1L)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01240t = c01240t;
                    strOptString = strOptString;
                    c1l = (C1L) c01240t.A01.get(strOptString);
                    c2 = 5;
                    break;
                case 5:
                    jSONObject = jSONObject;
                    strA00 = A00(54, 11, 61);
                    if (!jSONObject.has(strA00)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    jSONObject = jSONObject;
                    c1l = c1l;
                    strA00 = strA00;
                    c1l.A05((JSONArray) jSONObject.get(strA00));
                    c2 = 7;
                    break;
                case 7:
                    jSONObject = jSONObject;
                    strA002 = A00(34, 20, 6);
                    if (!jSONObject.has(strA002)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    jSONObject = jSONObject;
                    c1l = c1l;
                    strA002 = strA002;
                    c1l.A03(jSONObject.optInt(strA002));
                    c2 = '\t';
                    break;
                case '\t':
                    C1L c1l2 = c1l;
                    c1l2.A04(iOptInt, iOptInt2, jOptLong);
                    c01240t.A01.put(strOptString, c1l2);
                    return;
            }
        }
    }
}
