package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0884Vs implements InterfaceC02616d {
    public final /* synthetic */ C0885Vt A00;

    public C0884Vs(C0885Vt c0885Vt) {
        this.A00 = c0885Vt;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0884Vs c0884Vs = this;
        AbstractC02766s abstractC02766sA0F = null;
        char c2 = Build.VERSION.SDK_INT < 16 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0884Vs.A00.A07(EnumC02726o.A04);
                case 3:
                    c0884Vs = c0884Vs;
                    if (c0884Vs.A00.A00 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0884Vs = c0884Vs;
                    abstractC02766sA0F = c0884Vs.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA0F;
                case 6:
                    c0884Vs = c0884Vs;
                    C0885Vt c0885Vt = c0884Vs.A00;
                    abstractC02766sA0F = c0885Vt.A0F(c0885Vt.A00.isKeyguardSecure());
                    c2 = 5;
                    break;
            }
        }
    }
}
