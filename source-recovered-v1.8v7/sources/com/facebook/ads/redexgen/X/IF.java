package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class IF {
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    private IF A00(String str, Object obj) {
        this.A01.put(IJ.A01(str), IJ.A01(obj));
        this.A00.remove(str);
        return this;
    }

    public final IF A01(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    public final IF A02(String str, long j) {
        return A00(str, Long.valueOf(j));
    }

    public final IF A03(String str, String str2) {
        return A00(str, str2);
    }

    public final List<String> A04() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A05() {
        Object value = null;
        Map.Entry entry = null;
        HashMap map = new HashMap(this.A01);
        Iterator it = map.entrySet().iterator();
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
                    it = it;
                    entry = (Map.Entry) it.next();
                    value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    entry = entry;
                    value = value;
                    byte[] bArr = (byte[]) value;
                    entry.setValue(Arrays.copyOf(bArr, bArr.length));
                    c2 = 2;
                    break;
                case 5:
                    return Collections.unmodifiableMap(map);
            }
        }
    }
}
