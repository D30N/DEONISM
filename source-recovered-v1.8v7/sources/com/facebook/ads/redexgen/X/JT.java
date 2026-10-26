package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public final class JT {
    public static byte[] A07;
    public final double A00;
    public final double A01 = System.currentTimeMillis() / 1000.0d;
    public final JX A02;
    public final JY A03;
    public final String A04;
    public final String A05;
    public final Map<String, String> A06;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 91);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A07 = new byte[]{70, 73, 64, 62, 64, 69, 56, 67, 54, 58, 67, 64, 60, 69, 75, 54, 75, 70, 66, 60, 69, 46, 59, 46, 57, 60, 52, -20, -31, -24, -18, -27, -35, -40, -30, -25, -36, -27, -18, -35, -34, -40, -30, -25, -40, -33, -18, -25, -25, -34, -27};
    }

    public JT(C8C c8c, String str, double d2, String str2, Map<String, String> map, JX jx, JY jy, boolean z) throws JSONException {
        this.A05 = str;
        this.A00 = d2;
        this.A04 = str2;
        this.A02 = jx;
        this.A03 = jy;
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        if (z) {
            map2.put(A00(27, 24, 30), String.valueOf(z));
        }
        String strA01 = C0567Jf.A01(str);
        if (!TextUtils.isEmpty(strA01) && (z || jy == JY.A0B)) {
            map2.put(A00(0, 21, k.AppCompatTheme_windowNoTitle), strA01);
        }
        if (A0B()) {
            map2.put(A00(21, 6, k.AppCompatTheme_viewInflaterClass), LX.A01(c8c.A02().A5N()));
        }
        this.A06 = A01(map2);
    }

    public static Map<String, String> A01(Map<String, String> cleansedMap) {
        String value = null;
        String key = null;
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, String>> it = cleansedMap.entrySet().iterator();
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
                    Map.Entry<String, String> next = it.next();
                    key = next.getKey();
                    value = next.getValue();
                    if (value == null) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    key = key;
                    value = value;
                    map.put(key, value);
                    c2 = 2;
                    break;
                case 5:
                    return map;
            }
        }
    }

    public final double A03() {
        return this.A00;
    }

    public final double A04() {
        return this.A01;
    }

    public final JX A05() {
        return this.A02;
    }

    public final JY A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A04;
    }

    public final String A08() {
        return this.A05;
    }

    public final Map<String, String> A09() {
        return this.A06;
    }

    public final boolean A0A() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final boolean A0B() {
        boolean z = false;
        char c2 = this.A02 == JX.A04 ? (char) 2 : (char) 4;
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
}
