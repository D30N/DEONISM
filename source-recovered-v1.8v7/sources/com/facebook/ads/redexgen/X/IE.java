package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IE {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{11, 22, 1, 49, 28, 11, 10, 7, 28, 97, 124, 107, 91, 104, 97, 106};
    }

    public static long A00(ID id) {
        return id.A5D(A02(9, 7, 110), -1L);
    }

    @Nullable
    public static Uri A01(ID id) {
        String strA5E = id.A5E(A02(0, 9, 4), (String) null);
        if (strA5E == null) {
            return null;
        }
        return Uri.parse(strA5E);
    }

    public static void A04(IF r3) {
        r3.A01(A02(0, 9, 4));
    }

    public static void A05(IF r3, long j) {
        r3.A02(A02(9, 7, 110), j);
    }

    public static void A06(IF r4, Uri uri) {
        r4.A03(A02(0, 9, 4), uri.toString());
    }
}
