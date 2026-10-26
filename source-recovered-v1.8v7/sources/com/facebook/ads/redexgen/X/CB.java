package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class CB {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{-48, -20, -31, -7, -30, -31, -29, -21, -60, -11, -14, -31, -12, -23, -17, -18, -46, -27, -19, -31, -23, -18, -23, -18, -25, -36, -7, -13, -11, -2, 3, -11, -44, 5, 2, -15, 4, -7, -1, -2, -30, -11, -3, -15, -7, -2, -7, -2, -9};
    }

    public static long A00(Map<String, String> keyStatus, String str) {
        if (keyStatus != null) {
            try {
                String value = keyStatus.get(str);
                if (value != null) {
                    return Long.parseLong(value);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bv != com.facebook.ads.internal.exoplayer2.drm.DrmSession<?> */
    public static Pair<Long, Long> A01(InterfaceC0396Bv<?> interfaceC0396Bv) {
        Map<String, String> keyStatus = interfaceC0396Bv.ABz();
        if (keyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(keyStatus, A02(25, 24, 35))), Long.valueOf(A00(keyStatus, A02(0, 25, 19))));
    }
}
