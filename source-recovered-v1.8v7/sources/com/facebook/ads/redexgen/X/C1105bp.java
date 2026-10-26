package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1105bp implements InterfaceC0515Hd {
    public final int A00;
    public final InterfaceC0513Hb A01;
    public final InterfaceC0515Hd A02;
    public final InterfaceC0515Hd A03;
    public final I3 A04;
    public final I5 A05;

    public C1105bp(I3 i3, InterfaceC0515Hd interfaceC0515Hd, InterfaceC0515Hd interfaceC0515Hd2, InterfaceC0513Hb interfaceC0513Hb, int i, I5 i5) {
        this.A04 = i3;
        this.A03 = interfaceC0515Hd;
        this.A02 = interfaceC0515Hd2;
        this.A01 = interfaceC0513Hb;
        this.A00 = i;
        this.A05 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0515Hd
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1104bo A4D() {
        I3 i3 = this.A04;
        InterfaceC0516He interfaceC0516HeA4D = this.A03.A4D();
        InterfaceC0516He interfaceC0516HeA4D2 = this.A02.A4D();
        InterfaceC0513Hb interfaceC0513Hb = this.A01;
        return new C1104bo(i3, interfaceC0516HeA4D, interfaceC0516HeA4D2, interfaceC0513Hb != null ? interfaceC0513Hb.createDataSink() : null, this.A00, this.A05);
    }
}
