package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0650Mo implements View.OnClickListener {
    public final /* synthetic */ C1027aZ A00;

    public ViewOnClickListenerC0650Mo(C1027aZ c1027aZ) {
        this.A00 = c1027aZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0650Mo viewOnClickListenerC0650Mo = this;
        ViewOnClickListenerC0650Mo viewOnClickListenerC0650Mo2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0650Mo) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0650Mo = viewOnClickListenerC0650Mo;
                    viewOnClickListenerC0650Mo2 = viewOnClickListenerC0650Mo;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0650Mo2 = viewOnClickListenerC0650Mo2;
                        viewOnClickListenerC0650Mo2.A00.A05.A9d();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0650Mo2);
                        return;
                    }
            }
        }
    }
}
