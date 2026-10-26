package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C5W {
    A03(A01(0, 5, 74)),
    A05(A01(5, 5, 19)),
    A04(A01(26, 6, 75));

    public static byte[] A01;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-73, -69, -81, -75, -77, -115, Byte.MIN_VALUE, 123, 124, -122, -83, -95, -78, -85, -75, -80, -112, -108, -120, -114, -116, -122, 121, 116, 117, Byte.MAX_VALUE, -68, -80, -63, -70, -60, -65};
    }

    static {
        A02();
    }

    C5W(String str) {
        this.A00 = str;
    }

    @Nullable
    public static C5W A00(@Nullable String str) {
        C5W c5w = null;
        C5W[] c5wArrValues = values();
        int length = c5wArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    c5wArrValues = c5wArrValues;
                    c5w = c5wArrValues[i];
                    if (!c5w.A00.equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c5w;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return (C5W) null;
            }
        }
    }
}
