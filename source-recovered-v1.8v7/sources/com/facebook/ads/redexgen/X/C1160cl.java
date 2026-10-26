package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1160cl implements InterfaceC0616Lf {
    public int A00;
    public final InterfaceC0616Lf A01;

    public C1160cl(InterfaceC0616Lf interfaceC0616Lf, int i) {
        this.A01 = interfaceC0616Lf;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void ABs(String str) {
        if (this.A00 > 0) {
            this.A01.ABs(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void flush() {
        this.A01.flush();
    }
}
