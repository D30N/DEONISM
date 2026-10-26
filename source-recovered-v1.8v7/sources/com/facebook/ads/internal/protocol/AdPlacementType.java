package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public enum AdPlacementType {
    BANNER(A00(27, 6, 51)),
    INSTREAM(A00(19, 8, 105)),
    INTERSTITIAL(A00(0, 12, k.AppCompatTheme_windowActionBarOverlay)),
    NATIVE(A00(47, 6, 107)),
    NATIVE_BANNER(A00(74, 13, 10)),
    REWARDED_VIDEO(A00(33, 14, 92)),
    UNKNOWN(A00(12, 7, k.AppCompatTheme_windowNoTitle));

    public static byte[] A01;
    public String A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{48, 53, 59, 44, 57, 58, 59, 48, 59, 48, 40, 51, 68, 61, 58, 61, 62, 70, 61, 37, 42, 47, 48, 46, 33, 29, 41, -24, -25, -12, -12, -21, -8, 33, 20, 38, 16, 33, 19, 20, 19, 14, 37, 24, 19, 20, 30, 44, 31, 50, 39, 52, 35, -32, -27, -22, -21, -23, -36, -40, -28, -67, -80, -61, -72, -59, -76, -50, -79, -80, -67, -67, -76, -63, -53, -66, -47, -58, -45, -62, -68, -65, -66, -53, -53, -62, -49, -57, -70, -51, -62, -49, -66, -47, -42, -36, -51, -38, -37, -36, -47, -36, -47, -55, -44, -24, -37, -19, -41, -24, -38, -37, -38, -11, -20, -33, -38, -37, -27, -21, -28, -31, -28, -27, -19, -28, -29, -30, -17, -17, -26, -13};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}
