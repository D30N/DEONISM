package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* renamed from: com.facebook.ads.redexgen.X.cC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1126cC implements InterfaceC0576Jo {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C1131cH A01;

    public C1126cC(C1131cH c1131cH, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c1131cH;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Jo
    public final void AD4() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Jo
    public final void AD7(NativeAd nativeAd) {
        this.A01.A0I(C1141cR.A0J(nativeAd.getInternalNativeAd()), new C1130cG(C1141cR.A0J(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Jo
    public final void ADh() {
        this.A01.A0D();
    }
}
