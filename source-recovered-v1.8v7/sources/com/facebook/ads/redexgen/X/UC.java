package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* loaded from: assets/audience_network.dex */
public class UC implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UC(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UC uc = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = uc.A00.A02 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uc = uc;
                    abstractC02766sA07 = uc.A00.A0F(ActivityManager.isUserAMonkey());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    uc = uc;
                    abstractC02766sA07 = uc.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
