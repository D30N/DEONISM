package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class c9 implements Q7 {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{26, 55, 45, 46, 63, 42, 61, 54, 59, 58, 126, 61, 49, 43, 48, 42, 59, 44, 45, 112, 126, 12, 59, 45, 46, 49, 48, 45, 59, 100, 126, 62, 28, 19, 90, 9, 93, 25, 20, 14, 13, 28, 9, 30, 21, 93, 30, 18, 8, 19, 9, 24, 15, 14, 83};
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A9D(Q5 q5) {
        char c2 = BuildConfigApi.isDebug() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    q5 = q5;
                    if (q5 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    q5 = q5;
                    String str = A00(0, 31, 15) + q5.A5U();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A9Z(Exception exc) {
        if (BuildConfigApi.isDebug()) {
            Log.e(C0568Jg.A01, A00(31, 24, 44), exc);
        }
    }
}
