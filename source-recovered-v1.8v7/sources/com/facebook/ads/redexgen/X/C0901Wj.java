package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0901Wj implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0901Wj(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0901Wj c0901Wj = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 23 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0901Wj.A00.A07(EnumC02726o.A04);
                case 3:
                    c0901Wj = c0901Wj;
                    if (c0901Wj.A00.A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0901Wj = c0901Wj;
                    C0907Wp c0907Wp = c0901Wj.A00;
                    abstractC02766sA07 = c0907Wp.A04(c0907Wp.A00.getPhoneCount());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    c0901Wj = c0901Wj;
                    abstractC02766sA07 = c0901Wj.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
