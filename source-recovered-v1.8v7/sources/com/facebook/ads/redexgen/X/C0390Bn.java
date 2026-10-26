package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Bn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0390Bn extends Exception {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-114, -90, -91, -86, -94, 97, -91, -80, -90, -76, 97, -81, -80, -75, 97, -76, -74, -79, -79, -80, -77, -75, 97, -74, -74, -86, -91, 123, 97};
    }

    public C0390Bn(UUID uuid) {
        super(A00(0, 29, 6) + uuid);
    }
}
