package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01110g {
    public static byte[] A00;
    public static final String A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{3, -10, -15, -14, -4, -20, 2, -1, -7, -33, -48, -30, -30, -29, -41, -31, -34, -28, -42, -41, 12, 13, 2, 11, -4, 9, 6, 11, 8, -86, -85, -90, -87, -100, -83, -86, -67, -86, -28, -3, -16, -15, -5, -12, -81, 3, -2, -81, -1, -16, 1, 2, -12, -81, -7, 2, -2, -3, -81, -13, -16, 3, -16, -81, -8, -3, -81, -48, -13, -48, -14, 3, -8, -2, -3, -43, -16, -14, 3, -2, 1, 8, -67};
    }

    static {
        A03();
        A01 = C01110g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC01100f A00(XI xi, JW jw, String str, Uri uri, Map<String, String> extraData) {
        return A01(xi, jw, str, uri, extraData, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AbstractC01100f A01(com.facebook.ads.redexgen.X.XI r15, com.facebook.ads.redexgen.X.JW r16, java.lang.String r17, android.net.Uri r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01110g.A01(com.facebook.ads.redexgen.X.XI, com.facebook.ads.redexgen.X.JW, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.redexgen.X.0f");
    }

    public static boolean A04(String str) {
        boolean z = false;
        char c2 = !A02(29, 5, 2).equalsIgnoreCase(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A02(20, 9, 104).equalsIgnoreCase(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
