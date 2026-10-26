package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;

/* renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0927Xj implements C8G {
    public final /* synthetic */ C8C A00;
    public final /* synthetic */ C0931Xn A01;

    public C0927Xj(C0931Xn c0931Xn, C8C c8c) {
        this.A01 = c0931Xn;
        this.A00 = c8c;
    }

    @Override // com.facebook.ads.redexgen.X.C8G
    public final String A6H() {
        return C0590Kc.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8G
    public final boolean A7a() {
        return BuildConfigApi.isDebug();
    }
}
