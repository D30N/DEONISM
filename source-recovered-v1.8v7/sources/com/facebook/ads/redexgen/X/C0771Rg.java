package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Rg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0771Rg implements InterfaceC01381h {
    public final /* synthetic */ C0464Fc A00;
    public final /* synthetic */ AbstractC0782Rr A01;

    public C0771Rg(C0464Fc c0464Fc, AbstractC0782Rr abstractC0782Rr) {
        this.A00 = c0464Fc;
        this.A01 = abstractC0782Rr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01381h
    public final void AAW(AdError adError) {
        this.A00.A01.AAx(this.A01, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01381h
    public final void AAX() {
        this.A00.A0B.set(true);
        this.A00.A01.AAu(this.A01);
    }
}
