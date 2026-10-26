package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WO implements InterfaceC02616d {
    public final /* synthetic */ WP A00;

    public WO(WP wp) {
        this.A00 = wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WO wo = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 21 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return wo.A00.A07(EnumC02726o.A04);
                case 3:
                    wo = wo;
                    if (wo.A00.A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wo = wo;
                    WP wp = wo.A00;
                    abstractC02766sA07 = wp.A0F(wp.A00.isPowerSaveMode());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    wo = wo;
                    abstractC02766sA07 = wo.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
