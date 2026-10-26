package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class X9<K, V> extends AbstractC02766s<HashMap<K, InterfaceC02686k>> {
    public static byte[] A02;
    public final EnumC02756r A00;
    public final HashMap<K, InterfaceC02686k> A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{61};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    public X9(long j, @Nullable C02746q c02746q, HashMap<K, InterfaceC02686k> map, EnumC02756r enumC02756r) {
        super(j, c02746q, map, EnumC02756r.A0A);
        this.A01 = map;
        this.A00 = enumC02756r;
        if (A04()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(K k) {
        int i = C02706m.A00[this.A00.ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return ((String) k).length();
                case 4:
                    throw new UnsupportedOperationException();
                case 5:
                    return 4;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    private boolean A04() {
        int i = C02706m.A00[this.A00.ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    return true;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final int A06() {
        X9 x9 = this;
        Iterator<Map.Entry<K, V>> it = null;
        int iA00 = 0;
        char c2 = x9.A07() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    x9 = x9;
                    if (!((HashMap) x9.A07()).isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    x9 = x9;
                    it = ((HashMap) x9.A07()).entrySet().iterator();
                    c2 = 5;
                    break;
                case 5:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    x9 = x9;
                    it = it;
                    Map.Entry<K, V> next = it.next();
                    iA00 = iA00 + x9.A00(next.getKey()) + ((InterfaceC02686k) next.getValue()).ADH();
                    c2 = 5;
                    break;
                case 7:
                    return iA00;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        X9<K, V> x9 = this;
        InterfaceC02686k interfaceC02686k = null;
        K next = null;
        Set<K> setKeySet = x9.A01.keySet();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<K> it = setKeySet.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    x9 = x9;
                    it = it;
                    next = it.next();
                    interfaceC02686k = x9.A01.get(next);
                    if (interfaceC02686k == null) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jSONObject2 = jSONObject2;
                    next = (K) next;
                    interfaceC02686k = interfaceC02686k;
                    interfaceC02686k.ADb(next, jSONObject2);
                    c2 = 2;
                    break;
                case 5:
                    JSONObject jSONObject3 = jSONObject;
                    jSONObject3.put(A01(0, 1, 75), jSONObject2);
                    return jSONObject3;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<K, com.facebook.ads.internal.botdetection.signals.model.signal_value.IMapSignalValueDef>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0A(AbstractC02766s<HashMap<K, InterfaceC02686k>> abstractC02766s) {
        X9<K, V> x9 = this;
        InterfaceC02686k interfaceC02686k = null;
        Object next = null;
        K next2 = null;
        InterfaceC02686k interfaceC02686k2 = null;
        HashMap<K, InterfaceC02686k> mapA07 = null;
        HashMap<K, InterfaceC02686k> mapA072 = null;
        Iterator<K> it = null;
        Iterator<K> it2 = null;
        boolean z = true;
        char c2 = x9.A07() != null ? (char) 2 : (char) 3;
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
                    x9 = x9;
                    if (x9.A07() != null) {
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
                    x9 = x9;
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s.A07().size() == x9.A07().size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    x9 = x9;
                    abstractC02766s = abstractC02766s;
                    mapA07 = abstractC02766s.A07();
                    mapA072 = x9.A07();
                    it2 = mapA07.keySet().iterator();
                    it = mapA072.keySet().iterator();
                    c2 = '\n';
                    break;
                case '\n':
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 24;
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
                    next2 = (K) next2;
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
                    next2 = (K) next2;
                    next = next;
                    interfaceC02686k = mapA07.get(next2);
                    interfaceC02686k2 = mapA072.get(next);
                    if (interfaceC02686k == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    interfaceC02686k2 = interfaceC02686k2;
                    if (interfaceC02686k2 != null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    interfaceC02686k = interfaceC02686k;
                    if (interfaceC02686k != null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    interfaceC02686k2 = interfaceC02686k2;
                    if (interfaceC02686k2 != null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    return z;
                case 21:
                    z = false;
                    c2 = 20;
                    break;
                case 22:
                    interfaceC02686k = interfaceC02686k;
                    interfaceC02686k2 = interfaceC02686k2;
                    if (!interfaceC02686k.A7d(interfaceC02686k2)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 23:
                    return false;
                case 24:
                    return z;
            }
        }
    }
}
