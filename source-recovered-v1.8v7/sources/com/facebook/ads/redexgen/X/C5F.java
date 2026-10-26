package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5F implements NativeAdsManagerApi {
    public static byte[] A0A;
    public static final String A0B;
    public NativeAdsManager.Listener A01;
    public SG A02;
    public String A03;
    public final int A06;
    public final XI A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0A = new byte[]{-48, -21, -13, -10, -17, -18, -86, -2, -7, -86, -13, -8, -13, -2, -13, -21, -10, -13, 4, -17, -86, -51, -7, -7, -11, -13, -17, -41, -21, -8, -21, -15, -17, -4, -72};
    }

    static {
        A01();
        A0B = NativeAdsManager.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public C5F(Context context, String str, int i) {
        this.A07 = AnonymousClass53.A02(context);
        this.A08 = str;
        this.A06 = Math.max(i, 0);
        this.A09 = new ArrayList(i);
        try {
            CookieManager.getInstance();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
        } catch (Exception e) {
            Log.w(A0B, A00(0, 35, 20), e);
        }
    }

    public final NativeAdsManager.Listener A02() {
        return this.A01;
    }

    public final SG A03() {
        return this.A02;
    }

    public final void A04() {
        this.A09.clear();
    }

    public final void A05(int i) {
        this.A00 = i;
    }

    public final void A06(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A07(boolean z) {
        this.A04 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        SG sg = this.A02;
        if (sg != null) {
            sg.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        KB kb = KB.A06;
        int i = this.A06;
        SG sg = this.A02;
        this.A02 = new SG(this.A07, this.A08, kb, null, i);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new C0827Tn(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd() {
        C5F c5f = this;
        NativeAd ad = null;
        char c2 = c5f.A09.size() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (NativeAd) null;
                case 3:
                    c5f = c5f;
                    int i = c5f.A00;
                    c5f.A00 = i + 1;
                    List<NativeAd> list = c5f.A09;
                    ad = list.get(i % list.size());
                    if (i < c5f.A09.size()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return new NativeAd(c5f.A07, ad);
                case 5:
                    return ad;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
