package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0906Wo implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0906Wo(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0906Wo c0906Wo = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 28 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0906Wo.A00.A07(EnumC02726o.A04);
                case 3:
                    c0906Wo = c0906Wo;
                    if (c0906Wo.A00.A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0906Wo = c0906Wo;
                    C0907Wp c0907Wp = c0906Wo.A00;
                    abstractC02766sA07 = c0907Wp.A04(c0907Wp.A00.getSimCarrierId());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    c0906Wo = c0906Wo;
                    abstractC02766sA07 = c0906Wo.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
