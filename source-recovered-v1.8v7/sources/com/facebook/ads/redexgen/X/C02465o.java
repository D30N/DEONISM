package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02465o {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-39, -21, -42, -36, -17, -21, -23, -40, -22, -5, 7, 5, -58, -2, -7, -5, -3, -6, 7, 7, 3, -58, -7, -4, 11, -58, 1, 6, 12, -3, 10, 6, -7, 4, -58, -6, 12, -3, 16, 12, 10, -7, 11};
    }

    public static SharedPreferences A00(C8C c8c) {
        return c8c.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 82), c8c), 0);
    }

    @Nullable
    public final String A03(C8C c8c) {
        return A00(c8c).getString(A01(0, 9, 49), null);
    }

    public final void A04(C8C c8c, String str) {
        A00(c8c).edit().putString(A01(0, 9, 49), str).apply();
    }
}
