package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0666Ne extends WebView {
    public static byte[] A02;
    public static final String A03;
    public boolean A00;
    public final XI A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-12, 15, 23, 26, 19, 18, -50, 34, 29, -50, 23, 28, 23, 34, 23, 15, 26, 23, 40, 19, -50, -15, 29, 29, 25, 23, 19, -5, 15, 28, 15, 21, 19, 32, -36};
    }

    static {
        A02();
        A03 = AbstractC0666Ne.class.getSimpleName();
    }

    public AbstractC0666Ne(XI xi) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(xi);
        this.A01 = xi;
        A01();
    }

    private void A01() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0666Ne abstractC0666Ne = this;
        abstractC0666Ne.setWebChromeClient(abstractC0666Ne.A09());
        abstractC0666Ne.setWebViewClient(abstractC0666Ne.A0A());
        C0672Nk.A04(abstractC0666Ne);
        abstractC0666Ne.getSettings().setJavaScriptEnabled(true);
        abstractC0666Ne.getSettings().setDomStorageEnabled(true);
        boolean z = false;
        char c2 = Build.VERSION.SDK_INT >= 17 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC0666Ne = abstractC0666Ne;
                    z = false;
                    abstractC0666Ne.getSettings().setMediaPlaybackRequiresUserGesture(false);
                    c2 = 3;
                    break;
                case 3:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (Build.VERSION.SDK_INT < 19) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    setWebContentsDebuggingEnabled(true);
                    c2 = 6;
                    break;
                case 6:
                    AbstractC0666Ne abstractC0666Ne2 = abstractC0666Ne;
                    abstractC0666Ne2.setHorizontalScrollBarEnabled(z);
                    abstractC0666Ne2.setHorizontalScrollbarOverlay(z);
                    abstractC0666Ne2.setVerticalScrollBarEnabled(z);
                    abstractC0666Ne2.setVerticalScrollbarOverlay(z);
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            CookieManager.getInstance().setAcceptThirdPartyCookies(abstractC0666Ne2, true);
                            return;
                        } catch (Exception unused) {
                            Log.w(A03, A00(0, 35, 55));
                            return;
                        }
                    }
                    return;
            }
        }
    }

    public final boolean A03() {
        return this.A00;
    }

    public WebChromeClient A09() {
        return new WebChromeClient();
    }

    public WebViewClient A0A() {
        return new WebViewClient();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }

    public XI getAdContextWrapper() {
        return this.A01;
    }
}
