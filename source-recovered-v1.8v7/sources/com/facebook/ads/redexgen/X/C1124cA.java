package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1124cA implements InterfaceC0663Nb {
    public final /* synthetic */ C1112bx A00;

    public C1124cA(C1112bx c1112bx) {
        this.A00 = c1112bx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAQ(String str) {
        this.A00.A0A.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAS(String str) {
        this.A00.A05 = true;
        this.A00.A09.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAi(int i) {
        if (this.A00.A05) {
            this.A00.A0A.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAn(String str) {
        this.A00.A09.setTitle(str);
    }
}
