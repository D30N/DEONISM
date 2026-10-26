package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0569Jh implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {

    @Nullable
    public String A00;
    public final C02254s A01;

    public C0569Jh(C02254s c02254s) {
        this.A01 = c02254s;
    }

    @Nullable
    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.setAdListener(adListener);
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
