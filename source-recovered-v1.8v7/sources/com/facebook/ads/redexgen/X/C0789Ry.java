package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0789Ry implements InterfaceC01381h {
    public final /* synthetic */ C0790Rz A00;

    public C0789Ry(C0790Rz c0790Rz) {
        this.A00 = c0790Rz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01381h
    public final void AAW(AdError adError) {
        this.A00.A03.A8m(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01381h
    public final void AAX() {
        this.A00.A03.A8n();
    }
}
