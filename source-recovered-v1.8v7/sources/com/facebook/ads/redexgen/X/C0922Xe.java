package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0922Xe implements Q4 {
    public static byte[] A01;
    public final XJ A00;

    static {
        A01();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-16, -59, -34, -38, -59, -24, 7, 7, 4, -59, -22, 7, 13, 12, 1, 6, -1, -59, -20, 7, 3, -3, 6, -96, -98, -112, -99, 88, -116, -110, -112, -103, -97};
    }

    public C0922Xe(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.Q4
    public final Map<String, String> A5C(boolean z) {
        HashMap map = new HashMap();
        if (!C02335a.A00().A04()) {
            map.put(A00(0, 23, k.AppCompatTheme_windowNoTitle), AnonymousClass94.A00().A02(this.A00, true).A75());
        }
        map.put(A00(23, 10, 15), AnonymousClass98.A06(new C03108k(this.A00), this.A00, z));
        return map;
    }
}
