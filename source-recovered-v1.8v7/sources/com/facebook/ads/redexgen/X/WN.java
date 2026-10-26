package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WN implements InterfaceC02616d {
    public final /* synthetic */ WP A00;

    public WN(WP wp) {
        this.A00 = wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WN wn = this;
        AbstractC02766s abstractC02766sA0F = null;
        char c2 = Build.VERSION.SDK_INT < 23 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return wn.A00.A07(EnumC02726o.A04);
                case 3:
                    wn = wn;
                    if (wn.A00.A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wn = wn;
                    WP wp = wn.A00;
                    abstractC02766sA0F = wp.A0F(wp.A00.isDeviceIdleMode());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA0F;
                case 6:
                    wn = wn;
                    abstractC02766sA0F = wn.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
