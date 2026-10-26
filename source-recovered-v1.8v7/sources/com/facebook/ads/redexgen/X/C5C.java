package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5C implements NativeAdScrollViewApi {
    public static byte[] A07;
    public final int A00;

    @Nullable
    public final NativeAdScrollView.AdViewProvider A01;

    @Nullable
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final C0823Tj A05;
    public final XI A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A07 = new byte[]{-98, -58, -60, -59, 113, -63, -61, -64, -57, -70, -75, -74, 113, -78, 113, -97, -78, -59, -70, -57, -74, -110, -75, -89, -70, -74, -56, Byte.MAX_VALUE, -91, -54, -63, -74, 125, 113, -110, -75, -89, -70, -74, -56, -95, -61, -64, -57, -70, -75, -74, -61, 113, -64, -61, 113, -78, 113, -65, -78, -59, -70, -57, -74, -110, -75, -89, -70, -74, -56, -103, -74, -70, -72, -71, -59, -107, -63, -31, -12, 7, -4, 9, -8, -44, -9, 6, -32, -12, 1, -12, -6, -8, 5, -77, 1, 2, 7, -77, -1, 2, -12, -9, -8, -9};
    }

    public C5C(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, @Nullable NativeAdScrollView.AdViewProvider adViewProvider, int i, @Nullable NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i > 0) {
                this.A06 = AnonymousClass53.A02(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i2;
                C0822Ti c0822Ti = new C0822Ti(this);
                this.A05 = new C0823Tj(context);
                if (this.A02 == null) {
                    if (i > 0) {
                        this.A05.A00(((int) C0635Ly.A01) * i);
                    }
                } else {
                    this.A05.A00((int) (C0635Ly.A01 * this.A02.getHeight()));
                }
                this.A05.setAdapter(c0822Ti);
                setInset(20);
                c0822Ti.A0D();
                nativeAdScrollView.addView(this.A05);
                return;
            }
            throw new IllegalArgumentException(A06(0, 74, 31));
        }
        throw new IllegalStateException(A06(74, 27, 97));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int insetDp) {
        if (insetDp > 0) {
            float f = C0635Ly.A01;
            int iRound = Math.round(insetDp * f);
            this.A05.setPadding(iRound, 0, iRound, 0);
            this.A05.setPageMargin(Math.round((insetDp / 2) * f));
            this.A05.setClipToPadding(false);
        }
    }
}
