package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0897Wf implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0897Wf(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0897Wf c0897Wf = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 26 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0897Wf.A00.A07(EnumC02726o.A04);
                case 3:
                    c0897Wf = c0897Wf;
                    if (c0897Wf.A00.A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0897Wf = c0897Wf;
                    C0907Wp c0907Wp = c0897Wf.A00;
                    abstractC02766sA07 = c0907Wp.A0F(c0907Wp.A00.isDataEnabled());
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    c0897Wf = c0897Wf;
                    abstractC02766sA07 = c0897Wf.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
