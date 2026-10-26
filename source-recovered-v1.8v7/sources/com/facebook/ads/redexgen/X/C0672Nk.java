package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0672Nk {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{5, -9, 6, -33, -5, 10, -9, -10, -43, 1, 0, 6, -9, 0, 6, -33, 1, -10, -9, 67, 79, 79, 75, 78, 21, 10, 10, 82, 82, 82, 9, 0, 78, 9, 65, 60, 62, 64, 61, 74, 74, 70, 9, 62, 74, 72, 74, 86, 86, 82, 85, 28, 17, 17, 89, 89, 89, 16, 72, 67, 69, 71, 68, 81, 81, 77, 16, 69, 81, 79, 17, 45, 46, 59, 65, 64, 6, 46, 56, 45, 58, 55};
    }

    public static String A00() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return TextUtils.isEmpty(urlPrefix) ? A01(46, 25, 109) : String.format(Locale.US, A01(19, 27, 102), urlPrefix);
    }

    public static void A03(WebView webView) {
        webView.loadUrl(A01(71, 11, 87));
        webView.clearCache(true);
    }

    @TargetApi(21)
    public static void A04(WebView webView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WebSettings webSettings = webView.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(0);
        } else {
            try {
                WebSettings.class.getMethod(A01(0, 19, 29), new Class[0]).invoke(webSettings, 0);
            } catch (Exception unused) {
            }
        }
    }
}
