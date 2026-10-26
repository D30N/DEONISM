package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0899Wh implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0899Wh(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        char c2 = this.A00.A00 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return this.A00.A07(EnumC02726o.A06);
                case 3:
                    if (Build.VERSION.SDK_INT < 24) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C0907Wp c0907Wp = this.A00;
                    return c0907Wp.A04(c0907Wp.A00.getVoiceNetworkType());
                case 5:
                    C0907Wp c0907Wp2 = this.A00;
                    return c0907Wp2.A04(c0907Wp2.A00.getNetworkType());
            }
        }
    }
}
