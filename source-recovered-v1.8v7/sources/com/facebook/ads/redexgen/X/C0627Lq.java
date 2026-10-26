package com.facebook.ads.redexgen.X;

import android.support.annotation.VisibleForTesting;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Lq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0627Lq {
    public static byte[] A00;

    @VisibleForTesting
    public static final InterfaceC0626Lp A01 = null;

    static {
        A07();
    }

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 6);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A00 = new byte[]{86, 116, -127, 58, -121, 51, 121, -126, -123, Byte.MIN_VALUE, 116, -121, 51, -121, 124, Byte.MIN_VALUE, 120, 65, -105, -96, -91, -40, 55, 52, 56, 57, 58};
    }

    public static long A00() {
        InterfaceC0626Lp interfaceC0626Lp = A01;
        if (interfaceC0626Lp != null) {
            return interfaceC0626Lp.currentTimeMillis();
        }
        return System.currentTimeMillis();
    }

    public static long A01(long j) {
        if (j == -1) {
            return -1L;
        }
        return System.currentTimeMillis() - j;
    }

    public static String A02(double d2) {
        try {
            return String.format(Locale.US, A03(18, 4, 108), Double.valueOf(d2));
        } catch (Exception e) {
            Log.e(C0627Lq.class.getSimpleName(), A03(0, 18, 13), e);
            return A03(22, 5, 0);
        }
    }

    public static String A04(long j) {
        return String.valueOf(A01(j));
    }

    @Deprecated
    public static String A05(long j) {
        return A02(j / 1000.0d);
    }

    public static String A06(long j) {
        return Long.toString(j);
    }
}
