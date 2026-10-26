package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Jy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0586Jy implements NativeAdBase.NativeAdLoadConfigBuilder, NativeAdBase.NativeLoadAdConfig {

    @Nullable
    public NativeAdBase.MediaCacheFlag A02;

    @Nullable
    public String A03;
    public boolean A04;
    public final NativeAdBase A05;
    public final C1141cR A06;
    public int A01 = -1;
    public int A00 = -1;

    public C0586Jy(C1141cR c1141cR, NativeAdBase nativeAdBase) {
        this.A06 = c1141cR;
        this.A05 = nativeAdBase;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final NativeAdBase.NativeLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final void loadAd() {
        if (this.A02 == null) {
            this.A02 = NativeAdBase.MediaCacheFlag.ALL;
        }
        this.A06.A1M(EnumC0575Jn.A00(this.A02), this.A03, new C7H(this.A04, this.A01, this.A00));
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withAdListener(NativeAdListener nativeAdListener) {
        this.A06.setAdListener(nativeAdListener, this.A05);
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withBid(String str) {
        this.A03 = str;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withMediaCacheFlag(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A02 = mediaCacheFlag;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withPreloadedIconView(int i, int i2) {
        this.A04 = true;
        this.A01 = i;
        this.A00 = i2;
        return this;
    }
}
