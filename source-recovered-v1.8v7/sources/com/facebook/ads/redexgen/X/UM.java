package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* loaded from: assets/audience_network.dex */
public class UM implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UM(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UM um = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = um.A00.A02 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    um = um;
                    abstractC02766sA07 = um.A00.A0F(ActivityManager.isRunningInTestHarness());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    um = um;
                    abstractC02766sA07 = um.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
