package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Nc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0664Nc extends WebChromeClient {
    public final WeakReference<InterfaceC0663Nb> A00;
    public final WeakReference<NY> A01;

    public C0664Nc(WeakReference<InterfaceC0663Nb> weakReference, WeakReference<NY> weakReference2) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0664Nc c0664Nc = this;
        String strMessage = consoleMessage.message();
        char c2 = !TextUtils.isEmpty(strMessage) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    consoleMessage = consoleMessage;
                    if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0664Nc = c0664Nc;
                    if (c0664Nc.A01.get() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0664Nc = c0664Nc;
                    strMessage = strMessage;
                    c0664Nc.A01.get().A04(strMessage);
                    c2 = 5;
                    break;
                case 5:
                    return true;
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        C0664Nc c0664Nc = this;
        super.onProgressChanged(webView, i);
        char c2 = c0664Nc.A01.get() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0664Nc = c0664Nc;
                    c0664Nc.A01.get().A03();
                    c2 = 3;
                    break;
                case 3:
                    c0664Nc = c0664Nc;
                    if (c0664Nc.A00.get() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0664Nc = c0664Nc;
                    c0664Nc.A00.get().AAi(i);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (this.A00.get() != null) {
            this.A00.get().AAn(str);
        }
    }
}
