package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WB implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WB(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WB wb = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 26 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return wb.A00.A07(EnumC02726o.A04);
                case 3:
                    wb = wb;
                    if (wb.A00.A02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wb = wb;
                    WL wl = wb.A00;
                    abstractC02766sA07 = wl.A0F(wl.A02.canRequestPackageInstalls());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    wb = wb;
                    abstractC02766sA07 = wb.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
