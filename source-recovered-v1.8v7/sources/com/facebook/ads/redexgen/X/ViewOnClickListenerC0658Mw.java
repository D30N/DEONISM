package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0658Mw implements View.OnClickListener {
    public final /* synthetic */ C0661Mz A00;

    public ViewOnClickListenerC0658Mw(C0661Mz c0661Mz) {
        this.A00 = c0661Mz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0658Mw viewOnClickListenerC0658Mw = this;
        ViewOnClickListenerC0658Mw viewOnClickListenerC0658Mw2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0658Mw) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0658Mw = viewOnClickListenerC0658Mw;
                    viewOnClickListenerC0658Mw2 = viewOnClickListenerC0658Mw;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0658Mw2 = viewOnClickListenerC0658Mw2;
                        if (!viewOnClickListenerC0658Mw2.A00.A04) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = 7;
                            break;
                        }
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0658Mw2);
                        return;
                    }
                case 7:
                    viewOnClickListenerC0658Mw2.A00.A03.A41();
                    return;
                case '\n':
                    viewOnClickListenerC0658Mw2.A00.A03.A42();
                    return;
            }
        }
    }
}
