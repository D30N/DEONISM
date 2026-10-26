package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WA implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WA(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WA wa = this;
        AbstractC02766s abstractC02766sA07 = null;
        int i = 0;
        char c2 = Build.VERSION.SDK_INT < 26 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return wa.A00.A07(EnumC02726o.A04);
                case 3:
                    wa = wa;
                    if (wa.A00.A02 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wa = wa;
                    if (wa.A00.A02.getPackageInstaller() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    wa = wa;
                    i = 0;
                    if (wa.A00.A02.getPackageInstaller().getSessionInfo(0) == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    wa = wa;
                    WL wl = wa.A00;
                    abstractC02766sA07 = wl.A04(wl.A02.getPackageInstaller().getSessionInfo(i).getInstallReason());
                    c2 = 7;
                    break;
                case 7:
                    return abstractC02766sA07;
                case '\b':
                    wa = wa;
                    abstractC02766sA07 = wa.A00.A07(EnumC02726o.A06);
                    c2 = 7;
                    break;
            }
        }
    }
}
