package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;

/* renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0914Ww implements InterfaceC02616d {
    public final /* synthetic */ C0916Wy A00;

    public C0914Ww(C0916Wy c0916Wy) {
        this.A00 = c0916Wy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        return this.A00.A06(AnonymousClass71.A02(TrafficStats.getTotalRxBytes()));
    }
}
