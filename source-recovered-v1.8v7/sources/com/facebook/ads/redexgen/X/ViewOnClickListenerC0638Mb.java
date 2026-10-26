package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0638Mb implements View.OnClickListener {
    public final /* synthetic */ C1040am A00;

    public ViewOnClickListenerC0638Mb(C1040am c1040am) {
        this.A00 = c1040am;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0638Mb viewOnClickListenerC0638Mb = this;
        ViewOnClickListenerC0638Mb viewOnClickListenerC0638Mb2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0638Mb) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0638Mb = viewOnClickListenerC0638Mb;
                    viewOnClickListenerC0638Mb2 = viewOnClickListenerC0638Mb;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0638Mb2 = viewOnClickListenerC0638Mb2;
                        viewOnClickListenerC0638Mb2.A00.A0U(false);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0638Mb2);
                        return;
                    }
            }
        }
    }
}
