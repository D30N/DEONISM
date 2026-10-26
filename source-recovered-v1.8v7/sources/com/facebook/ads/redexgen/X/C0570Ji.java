package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.InstreamVideoAdListener;
import com.facebook.ads.InstreamVideoAdView;

/* renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0570Ji implements InstreamVideoAdView.InstreamVideoLoadConfigBuilder, InstreamVideoAdView.InstreamVideoLoadAdConfig {

    @Nullable
    public String A00;
    public final AnonymousClass56 A01;

    public C0570Ji(AnonymousClass56 anonymousClass56) {
        this.A01 = anonymousClass56;
    }

    @Nullable
    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final InstreamVideoAdView.InstreamVideoLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.InstreamVideoAdView.InstreamVideoLoadConfigBuilder
    public final InstreamVideoAdView.InstreamVideoLoadConfigBuilder withAdListener(InstreamVideoAdListener instreamVideoAdListener) {
        this.A01.setAdListener(instreamVideoAdListener);
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final InstreamVideoAdView.InstreamVideoLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
