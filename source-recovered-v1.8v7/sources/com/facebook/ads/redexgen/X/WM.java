package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WM implements InterfaceC02616d {
    public final /* synthetic */ WP A00;

    public WM(WP wp) {
        this.A00 = wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WM wm = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = wm.A00.A00 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 7) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    wm = wm;
                    WP wp = wm.A00;
                    abstractC02766sA07 = wp.A0F(wp.A04());
                    c2 = 4;
                    break;
                case 4:
                    return abstractC02766sA07;
                case 5:
                    wm = wm;
                    abstractC02766sA07 = wm.A00.A07(EnumC02726o.A06);
                    c2 = 4;
                    break;
            }
        }
    }
}
