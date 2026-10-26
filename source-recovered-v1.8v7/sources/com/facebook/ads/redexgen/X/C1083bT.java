package com.facebook.ads.redexgen.X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1083bT implements InterfaceC0515Hd {
    public final Context A00;
    public final InterfaceC0515Hd A01;
    public final InterfaceC0535Hz<? super InterfaceC0516He> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1083bT(Context context, InterfaceC0535Hz<? super InterfaceC0516He> interfaceC0535Hz, InterfaceC0515Hd interfaceC0515Hd) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0535Hz;
        this.A01 = interfaceC0515Hd;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1083bT(Context context, String str, InterfaceC0535Hz<? super InterfaceC0516He> interfaceC0535Hz) {
        this(context, interfaceC0535Hz, new C01572a(str, interfaceC0535Hz));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0515Hd
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1082bS A4D() {
        return new C1082bS(this.A00, this.A02, this.A01.A4D());
    }
}
