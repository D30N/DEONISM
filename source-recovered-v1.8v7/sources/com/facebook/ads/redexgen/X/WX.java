package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* loaded from: assets/audience_network.dex */
public class WX implements InterfaceC02616d {
    public final /* synthetic */ WY A00;

    public WX(WY wy) {
        this.A00 = wy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        return this.A00.A03(SystemClock.uptimeMillis() / 1000.0f);
    }
}
