package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Vr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0883Vr implements InterfaceC02616d {
    public final /* synthetic */ C0885Vt A00;

    public C0883Vr(C0885Vt c0885Vt) {
        this.A00 = c0885Vt;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0883Vr c0883Vr = this;
        AbstractC02766s abstractC02766sA0F = null;
        char c2 = Build.VERSION.SDK_INT < 16 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0883Vr.A00.A07(EnumC02726o.A04);
                case 3:
                    c0883Vr = c0883Vr;
                    if (c0883Vr.A00.A00 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0883Vr = c0883Vr;
                    abstractC02766sA0F = c0883Vr.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA0F;
                case 6:
                    c0883Vr = c0883Vr;
                    C0885Vt c0885Vt = c0883Vr.A00;
                    abstractC02766sA0F = c0885Vt.A0F(c0885Vt.A00.isKeyguardLocked());
                    c2 = 5;
                    break;
            }
        }
    }
}
