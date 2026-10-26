package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1087bX implements InterfaceC0515Hd {
    public final InterfaceC0535Hz<? super C1086bW> A00;

    public C1087bX() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1087bX(InterfaceC0535Hz<? super C1086bW> interfaceC0535Hz) {
        this.A00 = interfaceC0535Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0515Hd
    public final InterfaceC0516He A4D() {
        return new C1086bW(this.A00);
    }
}
