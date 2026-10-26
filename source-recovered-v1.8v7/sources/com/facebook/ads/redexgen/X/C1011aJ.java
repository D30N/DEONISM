package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1011aJ extends AbstractC0666Ne {
    public static byte[] A07;
    public static final String A08;
    public static final Set<String> A09;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public NY A04;
    public InterfaceC0663Nb A05;
    public final XI A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A07 = new byte[]{126, 98, 98, 102, 101, 78, 82, 82, 86, 97, 106, 125, 106, 120, 104, 121, 98, 123, Byte.MAX_VALUE, 49};
    }

    static {
        A06();
        A08 = C1011aJ.class.getSimpleName();
        A09 = new HashSet(2);
        A09.add(A02(5, 4, 99));
        A09.add(A02(0, 5, 83));
    }

    public C1011aJ(XI xi, InterfaceC0663Nb interfaceC0663Nb) {
        super(xi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        this.A05 = interfaceC0663Nb;
        this.A06 = xi;
        setWebChromeClient(A09());
        setWebViewClient(A0A());
        A05();
    }

    private void A04() {
        C1011aJ c1011aJ = this;
        char c2 = c1011aJ.A00 > -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1011aJ = c1011aJ;
                    if (c1011aJ.A03 <= -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1011aJ = c1011aJ;
                    if (c1011aJ.A01 <= -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1011aJ = c1011aJ;
                    c1011aJ.A04.A05(false);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A05() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.A04 = new NY(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne
    public final WebChromeClient A09() {
        return new C0664Nc(new WeakReference(this.A05), new WeakReference(this.A04));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne
    public final WebViewClient A0A() {
        return new C0665Nd(new WeakReference(this.A05), new WeakReference(this.A06));
    }

    public final void A0B(long j) {
        if (this.A00 < 0) {
            this.A00 = j;
        }
        A04();
    }

    public final void A0C(long j) {
        if (this.A01 < 0) {
            this.A01 = j;
        }
        A04();
    }

    public final void A0D(long j) {
        if (this.A02 < 0) {
            this.A02 = j;
        }
    }

    public final void A0E(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            loadUrl(A02(9, 11, 78) + str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne, android.webkit.WebView
    public final void destroy() {
        this.A05 = null;
        C0672Nk.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() > 0) {
            return webBackForwardListCopyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        C1011aJ c1011aJ = this;
        super.onDraw(canvas);
        char c2 = c1011aJ.A03 < 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1011aJ = c1011aJ;
                    if (c1011aJ.computeVerticalScrollRange() <= c1011aJ.getHeight()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1011aJ = c1011aJ;
                    c1011aJ.A03 = System.currentTimeMillis();
                    c1011aJ.A04();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
