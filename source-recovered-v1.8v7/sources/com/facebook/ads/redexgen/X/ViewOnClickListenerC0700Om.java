package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0700Om implements View.OnClickListener {
    public final /* synthetic */ C0701On A00;

    public ViewOnClickListenerC0700Om(C0701On c0701On) {
        this.A00 = c0701On;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0700Om viewOnClickListenerC0700Om = this;
        ViewOnClickListenerC0700Om viewOnClickListenerC0700Om2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0700Om) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0700Om = viewOnClickListenerC0700Om;
                    viewOnClickListenerC0700Om2 = viewOnClickListenerC0700Om;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0700Om2 = viewOnClickListenerC0700Om2;
                        viewOnClickListenerC0700Om2.A00.A04.performClick();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0700Om2);
                        return;
                    }
            }
        }
    }
}
