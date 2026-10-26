package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class OU extends WebViewClient {
    public final /* synthetic */ Y4 A00;

    public OU(Y4 y4) {
        this.A00 = y4;
    }

    public /* synthetic */ OU(Y4 y4, YH yh) {
        this(y4);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00.A09.A02(EnumC0564Jc.A0Q, null);
        this.A00.A0N();
        this.A00.A03 = true;
        this.A00.A0E();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string = null;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.A00.A0N();
        this.A00.A09.A02(EnumC0564Jc.A0P, null);
        char c2 = Build.VERSION.SDK_INT >= 23 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    webResourceError = webResourceError;
                    string = webResourceError.getDescription().toString();
                    c2 = 3;
                    break;
                case 3:
                    this.A00.A0F.A04(C03008a.A0s, string);
                    return;
                case 4:
                    string = "";
                    c2 = 3;
                    break;
            }
        }
    }
}
