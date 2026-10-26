package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class UD implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UD(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UD ud = this;
        AbstractC02766s abstractC02766sA04 = null;
        char c2 = Build.VERSION.SDK_INT < 23 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ud.A00.A07(EnumC02726o.A04);
                case 3:
                    ud = ud;
                    if (ud.A00.A02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ud = ud;
                    UN un = ud.A00;
                    abstractC02766sA04 = un.A04(un.A02.getLockTaskModeState());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA04;
                case 6:
                    ud = ud;
                    abstractC02766sA04 = ud.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
