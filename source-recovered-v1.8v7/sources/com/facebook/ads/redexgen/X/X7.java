package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class X7<T> extends AbstractC02766s<List<T>> {
    public static byte[] A02;
    public final EnumC02756r A00;
    public final List<T> A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{38};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    public X7(long j, @Nullable C02746q c02746q, List<T> list, EnumC02756r enumC02756r) {
        super(j, c02746q, list, EnumC02756r.A08);
        this.A01 = list;
        this.A00 = enumC02756r;
        if (A04()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(T t) {
        int i = C02696l.A00[this.A00.ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != 3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return ((InterfaceC02676j) t).ADH();
                case 5:
                    throw new UnsupportedOperationException();
                case 6:
                    return ((String) t).length();
                case 7:
                    return 4;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    private boolean A04() {
        int i = C02696l.A00[this.A00.ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    return true;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final int A06() {
        X7 x7 = this;
        Iterator it = null;
        int iA00 = 0;
        char c2 = x7.A07() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    x7 = x7;
                    if (!((List) x7.A07()).isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    x7 = x7;
                    it = ((List) x7.A07()).iterator();
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
                    x7 = x7;
                    it = it;
                    iA00 += x7.A00(it.next());
                    c2 = 5;
                    break;
                case 7:
                    return iA00;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        X7<T> x7 = this;
        Object next = null;
        int i = 0;
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = x7.A01.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    x7 = x7;
                    it = it;
                    next = it.next();
                    i = C02696l.A00[x7.A00.ordinal()];
                    if (i == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 6:
                    jSONArray = jSONArray;
                    next = next;
                    jSONArray.put(((InterfaceC02676j) next).ADa());
                    c2 = 2;
                    break;
                case 7:
                    jSONArray = jSONArray;
                    next = next;
                    jSONArray.put(next);
                    c2 = 2;
                    break;
                case '\b':
                    JSONObject jSONObject2 = jSONObject;
                    jSONObject2.put(A01(0, 1, k.AppCompatTheme_viewInflaterClass), jSONArray);
                    return jSONObject2;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.List<T>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final boolean A0A(AbstractC02766s<List<T>> abstractC02766s) {
        X7<T> x7 = this;
        T t = null;
        int i = 0;
        int i2 = 0;
        Object obj = null;
        List<T> listA07 = abstractC02766s.A07();
        List list = (List) x7.A07();
        boolean z = true;
        char c2 = list != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    listA07 = listA07;
                    if (listA07 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    if (list != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    listA07 = listA07;
                    if (listA07 != null) {
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
                    x7 = x7;
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s.A07().size() == ((List) x7.A07()).size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    i2 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    listA07 = listA07;
                    if (i2 >= listA07.size()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    x7 = x7;
                    listA07 = listA07;
                    list = list;
                    t = listA07.get(i2);
                    obj = list.get(i2);
                    i = C02696l.A00[x7.A00.ordinal()];
                    if (i == z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i == 2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i == 3) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    i2++;
                    c2 = '\n';
                    break;
                case 15:
                    t = (T) t;
                    obj = obj;
                    if (!t.A7d(obj)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 16:
                    return false;
                case 17:
                    listA07 = listA07;
                    list = list;
                    if (!listA07.get(i2).equals(list.get(i2))) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 18:
                    return false;
                case 19:
                    return z;
            }
        }
    }
}
