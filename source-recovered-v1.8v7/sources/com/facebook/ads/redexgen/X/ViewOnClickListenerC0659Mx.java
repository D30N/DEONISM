package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0659Mx implements View.OnClickListener {
    public final /* synthetic */ C0661Mz A00;

    public ViewOnClickListenerC0659Mx(C0661Mz c0661Mz) {
        this.A00 = c0661Mz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0659Mx viewOnClickListenerC0659Mx = this;
        ViewOnClickListenerC0659Mx viewOnClickListenerC0659Mx2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0659Mx) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0659Mx = viewOnClickListenerC0659Mx;
                    viewOnClickListenerC0659Mx2 = viewOnClickListenerC0659Mx;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0659Mx2 = viewOnClickListenerC0659Mx2;
                        viewOnClickListenerC0659Mx2.A00.A03.A7p();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0659Mx2);
                        return;
                    }
            }
        }
    }
}
