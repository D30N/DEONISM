package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class S1 implements AnonymousClass74 {
    public final C1T A00;
    public final InterfaceC01381h A01;
    public final C7C A02;
    public final XI A03;
    public final boolean A04;

    public S1(XI xi, InterfaceC01381h interfaceC01381h, C7C c7c, C1T c1t, boolean z) {
        this.A03 = xi;
        this.A01 = interfaceC01381h;
        this.A02 = c7c;
        this.A00 = c1t;
        this.A04 = z;
    }

    public /* synthetic */ S1(XI xi, InterfaceC01381h interfaceC01381h, C7C c7c, C1T c1t, boolean z, C01371g c01371g) {
        this(xi, interfaceC01381h, c7c, c1t, z);
    }

    private void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C01391i(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        S1 s1 = this;
        String strA0K = null;
        char c2 = s1.A00.A09() == C1U.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    s1.A00();
                    return;
                case 3:
                    s1 = s1;
                    strA0K = s1.A00.A0E();
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    s1 = s1;
                    strA0K = s1.A02.A0K(s1.A00.A0E());
                    c2 = 5;
                    break;
                case 5:
                    S1 s12 = s1;
                    s12.A00.A0G(strA0K);
                    s12.A01.AAX();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A98() {
        S1 s1 = this;
        char c2 = s1.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    s1 = s1;
                    s1.A01.AAW(AdError.CACHE_ERROR);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    s1 = s1;
                    s1.A01(false);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9F() {
        A01(true);
    }
}
