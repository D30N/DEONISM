package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0637Ma {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-56, -60, -61, -9, -26, -21, -25, -16, -27, -25, -48, -25, -10, -7, -15, -12, -19, -127, 116, -121, 124, -119, 120, 114, -121, 120, Byte.MIN_VALUE, -125, Byte.MAX_VALUE, 116, -121, 120, 89, 116, 124, Byte.MAX_VALUE, 51, -121, -126, 51, -123, 120, -127, 119, 120, -123, 51, 97, 116, -121, 124, -119, 120, 51, -121, 120, Byte.MIN_VALUE, -125, Byte.MAX_VALUE, 116, -121, 120, 65, 51, 88, Byte.MIN_VALUE, -125, -121, -116, 51, 84, -127, 119, -123, -126, 124, 119, 51, 105, 124, 120, -118, 51, -118, 124, Byte.MAX_VALUE, Byte.MAX_VALUE, 51, 117, 120, 51, -123, 120, -121, -120, -123, -127, 120, 119, 65};
    }

    public static View A00(XI xi, Throwable th) {
        A03(xi, th);
        return new View(xi);
    }

    public static void A03(XI xi, Throwable th) {
        xi.A04().A83(A01(17, 15, 7), C03008a.A1U, new C03018b(th));
        Log.e(A01(0, 17, k.AppCompatTheme_windowFixedHeightMajor), A01(32, 68, 7), th);
    }
}
