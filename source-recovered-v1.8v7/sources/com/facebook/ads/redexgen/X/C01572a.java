package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01572a extends AbstractC0370At {
    public final int A00;
    public final int A01;
    public final InterfaceC0535Hz<? super InterfaceC0516He> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C01572a(String str, InterfaceC0535Hz<? super InterfaceC0516He> interfaceC0535Hz) {
        this(str, interfaceC0535Hz, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C01572a(String str, InterfaceC0535Hz<? super InterfaceC0516He> interfaceC0535Hz, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC0535Hz;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0370At
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final BA A01(C0524Ho c0524Ho) {
        return new BA(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0524Ho);
    }
}
