package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class VP implements InterfaceC02616d {
    public final /* synthetic */ VZ A00;

    public VP(VZ vz) {
        this.A00 = vz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A07(EnumC02726o.A04);
        }
        return this.A00.A08(Build.VERSION.BASE_OS);
    }
}
