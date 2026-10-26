package com.facebook.ads.redexgen.X;

import android.os.Build;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6N {
    A03(1),
    A07(4),
    A09(2),
    A06(Build.VERSION.SDK_INT >= 19 ? 20 : -1),
    A0A(0),
    A0B(8),
    A0D(Build.VERSION.SDK_INT >= 19 ? 18 : -1),
    A08(5),
    A05(6),
    A04(13),
    A0C(12);

    public static byte[] A01;
    public int A00;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedWidthMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{44, 49, 42, 38, 45, 55, 34, 55, 42, 44, 45, 60, 48, 38, 45, 48, 44, 49, 100, 104, 103, 108, 96, 107, 113, 122, 113, 96, 104, 117, 96, 119, 100, 113, 112, 119, 96, 122, 118, 96, 107, 118, 106, 119, 93, 95, 95, 89, 80, 89, 78, 83, 81, 89, 72, 89, 78, 67, 79, 89, 82, 79, 83, 78, 79, 67, 69, 76, 71, 86, 77, 79, 71, 86, 71, 80, 93, 81, 71, 76, 81, 77, 80, 115, 113, 108, 123, 106, 110, 106, 119, 122, 124, 112, 102, 109, 112, 108, 113, 97, 99, 105, 107, 103, 97, 104, 99, 114, 111, 101, 121, 116, 105, 114, 103, 114, 111, 105, 104, 121, 117, 99, 104, 117, 105, 116, 50, 37, 44, 33, 52, 41, 54, 37, 63, 40, 53, 45, 41, 36, 41, 52, 57, 63, 51, 37, 46, 51, 47, 50, 48, 55, 38, 51, 60, 39, 38, 55, 38, 32, 55, 44, 49, 60, 48, 38, 45, 48, 44, 49, 56, 59, 40, 53, 55, 63, 46, 63, 40, 37, 41, 63, 52, 41, 53, 40, 95, 90, 84, 91, 71, 76, 64, 86, 93, 64, 92, 65, 94, 64, 75, 86, 74, 90, 86, 73, 92, 70, 74, 92, 87, 74, 86, 75};
    }

    static {
        A01();
    }

    C6N(int i) {
        this.A00 = i;
    }

    public final int A02() {
        return this.A00;
    }
}
