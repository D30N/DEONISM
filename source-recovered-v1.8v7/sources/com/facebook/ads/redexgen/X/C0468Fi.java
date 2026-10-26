package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Fi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0468Fi extends S3 {
    public final /* synthetic */ C0464Fc A00;
    public final /* synthetic */ AbstractC0782Rr A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0468Fi(C0464Fc c0464Fc, boolean z, AbstractC0782Rr abstractC0782Rr) {
        super(z);
        this.A00 = c0464Fc;
        this.A01 = abstractC0782Rr;
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void A00() {
        this.A00.A01.AAx(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void A01(boolean z) {
        this.A00.A0B.set(true);
        this.A00.A01.AAu(this.A01);
    }
}
