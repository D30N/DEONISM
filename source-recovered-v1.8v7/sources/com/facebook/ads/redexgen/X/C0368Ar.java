package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0368Ar implements InterfaceC1142cS {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0368Ar(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0571Jj
    public final void A8l() {
        C0600Kn.A00(new C1146cW(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0571Jj
    public final void A8o() {
        C0600Kn.A00(new C1145cV(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0571Jj
    public final void A9Y(K5 k5) {
        C0600Kn.A00(new C1143cT(this, k5));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0571Jj
    public final void AAD() {
        C0600Kn.A00(new cX(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1142cS
    public final void AAE() {
        C0600Kn.A00(new C1144cU(this));
    }
}
