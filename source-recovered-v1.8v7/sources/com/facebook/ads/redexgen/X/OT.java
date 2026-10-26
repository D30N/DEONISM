package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: assets/audience_network.dex */
public class OT extends WebChromeClient {
    public final /* synthetic */ Y4 A00;

    public OT(Y4 y4) {
        this.A00 = y4;
    }

    public /* synthetic */ OT(Y4 y4, YH yh) {
        this(y4);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            this.A00.A09.A02(EnumC0564Jc.A0M, null);
            this.A00.A0F.A04(C03008a.A0q, consoleMessage.message());
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
