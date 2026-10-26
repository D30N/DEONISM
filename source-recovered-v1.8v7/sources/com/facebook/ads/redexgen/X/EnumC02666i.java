package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02666i {
    A04(0),
    A05(100);

    public static byte[] A01;
    public static final Map<Integer, EnumC02666i> A02;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{105, 104, 107, 108, 120, 97, 121, 42, 43, 37, 42};
    }

    static {
        A02();
        A02 = new HashMap();
        for (EnumC02666i enumC02666i : values()) {
            A02.put(Integer.valueOf(enumC02666i.A00), enumC02666i);
        }
    }

    EnumC02666i(int i) {
        this.A00 = i;
    }

    public static EnumC02666i A00(int i) {
        EnumC02666i enumC02666i = A02.get(Integer.valueOf(i));
        return enumC02666i == null ? A04 : enumC02666i;
    }
}
