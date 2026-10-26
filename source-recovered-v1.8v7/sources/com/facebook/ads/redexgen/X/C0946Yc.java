package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0946Yc implements InterfaceC0663Nb {
    public final /* synthetic */ YY A00;

    public C0946Yc(YY yy) {
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAQ(String str) {
        this.A00.A0I = false;
        this.A00.A0C.setProgress(100);
        C0635Ly.A0Q(this.A00.A0C, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAS(String str) {
        this.A00.A0I = true;
        C0635Ly.A0Q(this.A00.A0C, 0);
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAi(int i) {
        if (this.A00.A0I) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0663Nb
    public final void AAn(String str) {
        this.A00.A0B.setTitle(str);
    }
}
