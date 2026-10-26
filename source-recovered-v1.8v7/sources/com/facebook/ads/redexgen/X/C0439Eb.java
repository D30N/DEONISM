package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0439Eb extends C0821Th {
    public P2 A00;

    public final void A04(NativeAdLayout nativeAdLayout, XI xi, NativeAd nativeAd, C0582Ju c0582Ju) {
        C0687Nz c0687Nz = new C0687Nz(xi);
        MediaView mediaView = new MediaView(xi);
        AdOptionsView adOptionsView = new AdOptionsView(xi, nativeAd, nativeAdLayout);
        c0582Ju.A09(adOptionsView, 28);
        this.A00 = new C0760Qv(xi, nativeAd, c0582Ju, C1141cR.A0J(nativeAd.getInternalNativeAd()).A12(), c0687Nz, mediaView, adOptionsView);
        C0635Ly.A0P(nativeAdLayout, c0582Ju.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0687Nz, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
