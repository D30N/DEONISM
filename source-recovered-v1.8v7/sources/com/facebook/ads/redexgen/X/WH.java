package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WH implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WH(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WH wh = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = wh.A00.A01 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 22) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    wh = wh;
                    WL wl = wh.A00;
                    abstractC02766sA07 = wl.A04(wl.A01.baseRevisionCode);
                    c2 = 4;
                    break;
                case 4:
                    return abstractC02766sA07;
                case 5:
                    wh = wh;
                    abstractC02766sA07 = wh.A00.A07(EnumC02726o.A06);
                    c2 = 4;
                    break;
            }
        }
    }
}
