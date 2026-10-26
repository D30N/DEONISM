package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0641Me implements View.OnClickListener {
    public final /* synthetic */ MZ A00;
    public final /* synthetic */ C1029ab A01;

    public ViewOnClickListenerC0641Me(C1029ab c1029ab, MZ mz) {
        this.A01 = c1029ab;
        this.A00 = mz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0641Me viewOnClickListenerC0641Me = this;
        ViewOnClickListenerC0641Me viewOnClickListenerC0641Me2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0641Me) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0641Me = viewOnClickListenerC0641Me;
                    viewOnClickListenerC0641Me2 = viewOnClickListenerC0641Me;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0641Me2 = viewOnClickListenerC0641Me2;
                        C0635Ly.A0M(viewOnClickListenerC0641Me2.A00);
                        C0635Ly.A0O(viewOnClickListenerC0641Me2.A01.A0N);
                        C0635Ly.A0O(viewOnClickListenerC0641Me2.A01.A04);
                        viewOnClickListenerC0641Me2.A01.A0L();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0641Me2);
                        return;
                    }
            }
        }
    }
}
