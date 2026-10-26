package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0784Rt implements InterfaceC0675Nn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0785Ru A01;
    public final /* synthetic */ C1141cR A02;

    public C0784Rt(AbstractC0785Ru abstractC0785Ru, int i, C1141cR c1141cR) {
        this.A01 = abstractC0785Ru;
        this.A00 = i;
        this.A02 = c1141cR;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0675Nn
    public final void A9h(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1Q(this.A01.A04);
        }
        this.A02.A1T(z, true);
    }
}
