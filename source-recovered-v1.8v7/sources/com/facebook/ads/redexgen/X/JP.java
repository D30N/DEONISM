package com.facebook.ads.redexgen.X;

import android.content.Context;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class JP {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{63, 58, 48, 41, 1, 55, 58, 56, 63, 1, 44, 59, 56, 44, 59, 45, 54, 1, 42, 55, 51, 59, 1, 51, 45, 112, 117, Byte.MAX_VALUE, 102, 78, 114, 126, Byte.MAX_VALUE, 119, 120, 118, 78, 98, 116, Byte.MAX_VALUE, 117, 78, 119, 115, 125, 126, 118, 120, Byte.MAX_VALUE, 78, 112, 98, 120, 117, 83, 86, 92, 69, 109, 71, 65, 87, 109, 84, 80, 6, 83, 109, 91, 86, 109, 84, 91, 64, 65, 70, 69, 64, 74, 83, 123, 81, 87, 65, 86, 123, 69, 67, 65, 74, 80, 123, 86, 65, 66, 86, 65, 87, 76, 123, 80, 77, 73, 65, 123, 73, 87, 25, 28, 22, 15, 39, 13, 11, 29, 39, 30, 26, 76, 25, 39, 17, 28, 75, 78, 68, 93, 117, 89, 66, 69, 95, 70, 78, 117, 89, 79, 68, 78, 117, 75, 90, 90, 117, 67, 68, 76, 69, 117, 67, 68, 117, 95, 89, 79, 88, 117, 75, 77, 79, 68, 94};
    }

    public static long A00(Context context) {
        return JQ.A0L(context).A1k(A02(0, 25, 102), -1L);
    }

    public static long A01(Context context) {
        return JQ.A0L(context).A1k(A02(76, 31, 28), -1L);
    }

    public static boolean A04(Context context) {
        return JQ.A0L(context).A1n(A02(k.AppCompatTheme_windowMinWidthMinor, 39, 18), true);
    }

    public static boolean A05(Context context) {
        return JQ.A0L(context).A1n(A02(25, 29, 41), false);
    }

    public static boolean A06(Context context) {
        return JQ.A0L(context).A1n(A02(107, 16, 64), false);
    }

    public static boolean A07(Context context) {
        return JQ.A0L(context).A1n(A02(54, 22, 10), false);
    }
}
