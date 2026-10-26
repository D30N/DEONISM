package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0698Ok {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1A A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-49, -51, -34, -48, -43, -38, -48, -1, -3, 14, 0, -1, 10, 16};
    }

    public C0698Ok(int i, int i2, C1A c1a) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c1a;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1A A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        String strA00 = A00(0, 0, 92);
        sb.append(strA00);
        map.put(A00(0, 7, 20), sb.toString());
        map.put(A00(7, 7, 68), this.A00 + strA00);
        return map;
    }
}
