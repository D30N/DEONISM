package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewListener;

/* renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0819Tf implements MY {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C0820Tg A01;

    public C0819Tf(C0820Tg c0820Tg, MediaViewListener mediaViewListener) {
        this.A01 = c0820Tg;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void A9C() {
        this.A00.onComplete(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void A9V() {
        this.A00.onEnterFullscreen(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void A9b() {
        this.A00.onExitFullscreen(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void A9e() {
        this.A00.onFullscreenBackground(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void A9f() {
        this.A00.onFullscreenForeground(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void AAV() {
        this.A00.onPlay(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void ABT() {
        this.A00.onVolumeChange(this.A01.A02, this.A01.A04.getVolume());
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void onPause() {
        this.A00.onPause(this.A01.A02);
    }
}
