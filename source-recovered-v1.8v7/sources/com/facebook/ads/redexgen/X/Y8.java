package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class Y8 extends AbstractC0666Ne {
    public final /* synthetic */ Y4 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(Y4 y4, XI xi) {
        super(xi);
        this.A00 = y4;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne
    public final WebChromeClient A09() {
        return new OT(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne
    public final WebViewClient A0A() {
        return new OU(this.A00, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A00.A0B.A06(motionEvent, this, this);
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
