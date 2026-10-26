package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01391i extends WebViewClient {
    public boolean A00 = false;
    public final C1T A01;
    public final InterfaceC01381h A02;
    public final boolean A03;

    public C01391i(C1T c1t, InterfaceC01381h interfaceC01381h, boolean z) {
        this.A01 = c1t;
        this.A02 = interfaceC01381h;
        this.A03 = z;
    }

    private void A00() {
        InterfaceC01381h interfaceC01381h = this.A02;
        if (interfaceC01381h != null) {
            interfaceC01381h.AAX();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01(WebResourceError webResourceError) {
        C01391i c01391i = this;
        char c2 = c01391i.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01391i = c01391i;
                    c01391i.A02.AAW(AdError.CACHE_ERROR);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c01391i = c01391i;
                    c01391i.A00();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new S2(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A01(webResourceError);
    }
}
