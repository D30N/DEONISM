package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class VC implements InterfaceC02616d {
    public final /* synthetic */ VZ A00;

    public VC(VZ vz) {
        this.A00 = vz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        return this.A00.A08(Build.PRODUCT);
    }
}
