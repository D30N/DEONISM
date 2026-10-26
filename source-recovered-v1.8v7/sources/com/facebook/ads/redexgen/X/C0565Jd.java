package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0565Jd {
    public static byte[] A02;
    public final JW A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 94);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{10, 12, -7, 11, 16, 7, -4};
    }

    public C0565Jd(String str, JW jw) {
        this.A01 = str;
        this.A00 = jw;
    }

    public final void A02(EnumC0564Jc enumC0564Jc, @Nullable Map<String, String> map) {
        A03(enumC0564Jc.A02(), map);
    }

    public final void A03(String str, @Nullable Map<String, String> map) {
        char c2 = !C0567Jf.A0B(this.A01, str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    map = map;
                    if (map != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = new HashMap<>();
                    c2 = 5;
                    break;
                case 5:
                    C0565Jd c0565Jd = this;
                    map.put(A00(0, 7, 57), str);
                    c0565Jd.A00.A85(c0565Jd.A01, map);
                    return;
            }
        }
    }
}
