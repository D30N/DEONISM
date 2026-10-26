package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WE implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WE(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WE we = this;
        AbstractC02766s abstractC02766sA04 = null;
        char c2 = we.A00.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 28) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    we = we;
                    WL wl = we.A00;
                    abstractC02766sA04 = wl.A06(wl.A01.getLongVersionCode());
                    c2 = 4;
                    break;
                case 4:
                    return abstractC02766sA04;
                case 5:
                    we = we;
                    WL wl2 = we.A00;
                    abstractC02766sA04 = wl2.A04(wl2.A01.versionCode);
                    c2 = 4;
                    break;
                case 6:
                    we = we;
                    abstractC02766sA04 = we.A00.A07(EnumC02726o.A06);
                    c2 = 4;
                    break;
            }
        }
    }
}
