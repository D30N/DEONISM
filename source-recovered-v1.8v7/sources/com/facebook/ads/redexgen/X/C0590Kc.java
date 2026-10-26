package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.settings.AdInternalSettings;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0590Kc {
    public static byte[] A00;
    public static final AtomicReference<String> A01;
    public static final AtomicReference<String> A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowActionBarOverlay);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A00 = new byte[]{32, 110, 107, 97, 120, 80, 124, 118, 97, 108, 11, 27, 85, 80, 90, 67, 107, 88, 91, 83, 83, 93, 90, 83, 27, 7, 70, 77, 92, 95, 71, 90, 67, 119, 73, 76, 91, 119, 75, 71, 69, 69, 71, 70, 110, 114, 114, 118, 117, 60, 41, 41, 113, 113, 113, 35, 117, 40, 96, 103, 101, 99, 100, 105, 105, 109, 40, 101, 105, 107, 15, 15, 15, 9, 21, 21, 17, 18, 91, 78, 78, 6, 19, 0, 17, 9, 68, 18, 79, 7, 0, 2, 4, 3, 14, 14, 10, 79, 2, 14, 12, 60, 37, 42, 32, 42, 38, 32, 42, 39, 35, 42, 42, 36, 42, 35, 34, 60, 113, 102, 116, 96};
    }

    static {
        A09();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>();
    }

    public static String A00() {
        return A02() + A03(25, 19, 92);
    }

    public static String A01() {
        return A02() + A03(101, 21, 103);
    }

    public static String A02() {
        String str = A01.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A03(73, 28, 21);
        return A06(urlOverride);
    }

    public static String A04(C8C c8c) {
        return A07(JQ.A0N(c8c)) + A03(11, 14, 64);
    }

    public static String A05(C8C c8c) {
        return A07(JQ.A0O(c8c)) + A03(0, 10, k.AppCompatTheme_windowMinWidthMinor);
    }

    public static String A06(String prefix) {
        String strA03 = null;
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        char c2 = TextUtils.isEmpty(urlPrefix) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strA03 = A03(0, 0, 79);
                    c2 = 3;
                    break;
                case 3:
                    Locale locale2 = locale;
                    Object[] objArr2 = objArr;
                    objArr2[0] = strA03;
                    return String.format(locale2, prefix, objArr2);
                case 4:
                    urlPrefix = urlPrefix;
                    strA03 = A03(10, 1, 81) + urlPrefix;
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A07(String urlOverride) {
        String str = A02.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return A08(A06(A03(44, 26, k.AppCompatTheme_viewInflaterClass)), urlOverride);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A03(70, 3, 12), str2);
    }
}
