package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0707Ou {
    public static byte[] A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-32, 13, 3, 17, 14, 8, 3, -75, -74, -57, -70, -76, -74, -80, -66, -64, -75, -74, -67, -38, -42, -53, -29, -53, -52, -42, -49, -55, -40, -53, -41, -49, -18, -32, -18, -18, -28, -22, -23, -38, -28, -33, 15, 19, -1, 22, 5, 18, -116, -123, -112, -123, -120, 2, 5, -7, -9, 2, -5, -90, -106, -91, -104, -104, -95, -110, -86, -100, -105, -89, -101, -103, -119, -104, -117, -117, -108, -123, -114, -117, -113, -115, -114, -102, -22, -7, -7, -24, -9, -22, -10, -18, -80, -76, -83, -98, -81, -79, -85, -94, -81, -100, -94, -85, -95, -83, -84, -90, -85, -79, -1, -16, -9, -21, 2, -15, -2, -1, -11, -5, -6};
    }

    public static Map<String, String> A01(C8C c8c, String str, String str2) {
        HashMap map = new HashMap();
        C03108k c03108k = new C03108k(c8c);
        int i = c8c.getResources().getDisplayMetrics().widthPixels;
        int i2 = c8c.getResources().getDisplayMetrics().heightPixels;
        map.put(A00(32, 10, 90), c8c.A05().A02());
        map.put(A00(19, 13, 73), str2);
        map.put(A00(94, 16, 28), str);
        map.put(A00(7, 12, 48), String.valueOf(c03108k.A08()));
        map.put(A00(59, 12, 18), String.valueOf((int) (i / C0635Ly.A01)));
        map.put(A00(71, 13, 5), String.valueOf((int) (i2 / C0635Ly.A01)));
        map.put(A00(92, 2, 32), A00(0, 7, 126));
        map.put(A00(42, 6, 127), C03108k.A02);
        map.put(A00(53, 6, k.AppCompatTheme_windowActionModeOverlay), Locale.getDefault().toString());
        map.put(A00(110, 11, 107), A00(48, 5, 54));
        map.put(A00(84, 8, 104), c03108k.A04());
        return map;
    }
}
