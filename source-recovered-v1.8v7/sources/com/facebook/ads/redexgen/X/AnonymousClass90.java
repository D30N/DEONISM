package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.90, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass90 {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{12, 57, 47, 61, 58, 52, 47, -70, -84, -70, -70, -80, -74, -75, -58, -80, -85, -56, -41, -41, -35, -52, -39, -38, 19, 23, -63, -78, -71, 22, 35, 25, 39, 36, 30, 25, -3, 16, 9, -1, 7, 0, 5, 20, 20, 18, 5, 17, 9, -1, 14, 14, 0, 19, 7, 10, 2, -46, -61, -54, -34, -43, -60, -47, -46, -56, -50, -51, -19, -15, -12, -29, -16, -15, -17, -15, -26, -25, -18};
    }

    public static synchronized Map<String, String> A01(C8C c8c) {
        if (A00 != null) {
            return new HashMap(A00);
        }
        A00 = new HashMap<>();
        A00.put(A00(36, 6, 102), c8c.getPackageName());
        A02(c8c, A00);
        return new HashMap(A00);
    }

    public static synchronized Map<String, String> A02(C8C c8c, Map<String, String> map) {
        map.put(A00(26, 3, 25), A00(29, 7, 96));
        map.put(A00(57, 11, 42), BuildConfigApi.getVersionName(c8c));
        map.put(A00(24, 2, 111), A00(0, 7, k.AppCompatTheme_windowFixedHeightMajor));
        map.put(A00(68, 6, 73), C03108k.A02);
        C03108k c03108k = new C03108k(c8c);
        map.put(A00(17, 7, 50), c03108k.A05());
        map.put(A00(42, 7, 111), c03108k.A04());
        map.put(A00(49, 8, 105), String.valueOf(c03108k.A03()));
        map.put(A00(74, 5, 77), c03108k.A09());
        map.put(A00(7, 10, 18), c8c.A05().A02());
        return map;
    }
}
