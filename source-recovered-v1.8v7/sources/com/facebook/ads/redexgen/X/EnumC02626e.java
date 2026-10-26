package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02626e {
    A04(0),
    A07(1024),
    A05(2048),
    A06(4096);

    public static byte[] A01;
    public static final Map<Integer, EnumC02626e> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-14, -29, -12, -29, -16, -15, -21, -26, -67, -65, -67, -70, -77, -83, -77, -71, -65, -67, -124, -121, -112, -117, -119, -112, -95, -117, -119, -112, -111, -108, -121, -95, -112, -99, -109, -98, -100, -82, -94, -112, -100, -97, -101, -108};
    }

    static {
        A02();
        A02 = new HashMap();
        for (EnumC02626e enumC02626e : values()) {
            A02.put(Integer.valueOf(enumC02626e.A00), enumC02626e);
        }
    }

    EnumC02626e(int i) {
        this.A00 = i;
    }

    public static EnumC02626e A00(int i) {
        EnumC02626e enumC02626e = A02.get(Integer.valueOf(i));
        return enumC02626e == null ? A04 : enumC02626e;
    }

    public final int A03() {
        return this.A00;
    }
}
