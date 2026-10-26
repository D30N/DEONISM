package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1154cf implements L2 {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 38);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{126, 122, 121, -83, -100, -95, -99, -90, -101, -99, -122, -99, -84, -81, -89, -86, -93, -8, 17, 14, 17, 18, 26, 17, -61, 8, 27, 6, 8, 19, 23, 12, 18, 17, -47};
    }

    @Override // com.facebook.ads.redexgen.X.L2
    public final void A7u(int i, Throwable th) {
        Log.e(A00(0, 17, 18), A00(17, 18, 125), th);
    }
}
