package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class GW implements QM {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 36);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-41, -22, -24, -22, -18, -5, -22, -91, -6, -9, -15, -65, -91, 123, 118, 118, 118, 89, -127, -115, -115, -119, 89, -117, -98, -86, -82, -98, -84, -83, 89, 118, 118, 118, -34, 10, 9, 15, 0, 9, 15, -43, -69, -63, -19, -20, -14, -29, -20, -14, -72, -120, -103, 109, 109, 109, 80, 120, -124, -124, Byte.MIN_VALUE, 80, -126, -107, -93, -96, -97, -98, -93, -107, 80, 109, 109, 109, -120, -87, -106, -87, -86, -88, 111, 85};
    }

    private void A02(Map<String, List<String>> map) {
        GW gw = this;
        String next = null;
        Iterator<String> it = null;
        Iterator<String> it2 = null;
        char c2 = map != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    it2 = map.keySet().iterator();
                    c2 = 3;
                    break;
                case 3:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    it2 = it2;
                    next = it2.next();
                    it = map.get(next).iterator();
                    c2 = 5;
                    break;
                case 5:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    gw = gw;
                    next = next;
                    it = it;
                    gw.A7v(next + A00(52, 1, 59) + it.next());
                    c2 = 5;
                    break;
                case 7:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A7i() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void A7v(String str) {
        System.out.println(str);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void A8F(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        A7v(A00(14, 20, 21));
        A7v(httpURLConnection.getRequestMethod() + A00(13, 1, 55) + httpURLConnection.getURL().toString());
        if (obj instanceof String) {
            A7v(A00(34, 9, k.AppCompatTheme_windowFixedHeightMinor) + ((String) obj));
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void A8G(Q5 q5) {
        if (q5 != null) {
            A7v(A00(53, 21, 12));
            A7v(A00(0, 13, 97) + q5.getUrl());
            A7v(A00(74, 8, 17) + q5.A77());
            A02(q5.A6M());
            A7v(A00(43, 9, 90) + q5.A5U());
        }
    }
}
