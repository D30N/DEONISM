package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class X5 extends AbstractC02766s<HashMap<String, Integer>> {
    public static byte[] A00;

    static {
        A01();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{37};
    }

    public X5(long j, @Nullable C02746q c02746q, HashMap<String, Integer> signalValues) {
        super(j, c02746q, signalValues, EnumC02756r.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final int A06() {
        int length = 0;
        Iterator<String> it = A07().keySet().iterator();
        int keySize = 2;
        while (true) {
            switch (keySize) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        keySize = 4;
                        break;
                    } else {
                        keySize = 3;
                        break;
                    }
                case 3:
                    it = it;
                    String key = it.next();
                    length += key.getBytes().length;
                    keySize = 2;
                    break;
                case 4:
                    return (A07().size() * 4) + length;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        HashMap<String, Integer> mapA07 = A07();
        Set<String> setKeySet = mapA07.keySet();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = setKeySet.iterator();
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
                    mapA07 = mapA07;
                    jSONObject2 = jSONObject2;
                    it = it;
                    String next = it.next();
                    jSONObject2.put(next, mapA07.get(next));
                    c2 = 2;
                    break;
                case 4:
                    JSONObject jSONObject3 = jSONObject;
                    jSONObject3.put(A00(0, 1, 96), jSONObject2);
                    return jSONObject3;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<java.lang.String, java.lang.Integer>> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0A(AbstractC02766s<HashMap<String, Integer>> abstractC02766s) {
        X5 x5 = this;
        String next = null;
        String next2 = null;
        HashMap<String, Integer> mapA07 = null;
        HashMap<String, Integer> mapA072 = null;
        Iterator<String> it = null;
        Iterator<String> it2 = null;
        boolean z = true;
        char c2 = x5.A07() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s.A07() != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    x5 = x5;
                    if (x5.A07() != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s.A07() != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
                case 7:
                    x5 = x5;
                    abstractC02766s = abstractC02766s;
                    if (x5.A07().size() == abstractC02766s.A07().size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    x5 = x5;
                    abstractC02766s = abstractC02766s;
                    mapA07 = abstractC02766s.A07();
                    mapA072 = x5.A07();
                    it2 = mapA07.keySet().iterator();
                    it = mapA072.keySet().iterator();
                    c2 = '\n';
                    break;
                case '\n':
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    it2 = it2;
                    it = it;
                    next2 = it2.next();
                    next = it.next();
                    if (!next2.equals(next)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    mapA07 = mapA07;
                    next2 = next2;
                    if (!mapA07.containsKey(next2)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    mapA072 = mapA072;
                    next = next;
                    if (!mapA072.containsKey(next)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 15:
                    return false;
                case 16:
                    mapA07 = mapA07;
                    mapA072 = mapA072;
                    next2 = next2;
                    next = next;
                    if (!mapA07.get(next2).equals(mapA072.get(next))) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 17:
                    return false;
                case 18:
                    return z;
            }
        }
    }
}
