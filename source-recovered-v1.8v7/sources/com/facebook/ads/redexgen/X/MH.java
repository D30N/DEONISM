package com.facebook.ads.redexgen.X;

import android.app.Activity;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class MH {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-97, -99, -90, -99, -86, -95, -101};
    }

    public static void A02(Activity activity, int i, XI xi) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e) {
            xi.A04().A8H(A00(0, 7, 48), C03008a.A08, new C03018b(e));
        }
    }
}
