package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0888Vw implements InterfaceC02616d {
    public final /* synthetic */ C0890Vy A00;

    public C0888Vw(C0890Vy c0890Vy) {
        this.A00 = c0890Vy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(EnumC02726o.A04);
        }
        return this.A00.A08(Locale.getDefault().getScript());
    }
}
