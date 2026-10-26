package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0792Sb extends C01551y implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final SU A00;
    public final C01541x A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{124, 123, 97, 106, 112, 103, 103, 122, 103, 106, 118, 122, 113, 112, 106, 126, 112, 108, Byte.MAX_VALUE, 120, 98, 105, 100, 96, 105, 96, Byte.MAX_VALUE, 114, 115, 121, 105, 114, 99, 100, 119, 98, Byte.MAX_VALUE, 121, 120, 105, 125, 115, 111, 18, 21, 19, 30, 4, 19, 19, 14, 19, 30, 12, 4, 18, 18, 0, 6, 4, 30, 10, 4, 24, 17, 18, 19, 26, 2, 20, 19, 11, 28, 17, 20, 25, 28, 9, 20, 18, 19, 2, 9, 20, 16, 24, 2, 22, 24, 4};
    }

    public C0792Sb(String str, AnonymousClass20 anonymousClass20, SU su, C01541x c01541x) {
        super(str, anonymousClass20);
        this.A00 = su;
        this.A01 = c01541x;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.AAI(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(64, 26, 57), this.A00.A0B());
        bundle.putInt(A00(18, 25, 82), this.A01.A00);
        super.A00.AAI(AdError.BROKEN_MEDIA_ERROR_CODE, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(43, 21, 37), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 81), adError.getErrorCode());
        super.A00.AAI(2103, super.A01, bundle);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.AAI(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.AAI(3002, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.AAI(AdError.MEDIATION_ERROR_CODE, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.AAI(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.AAI(2110, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.AAI(3000, super.A01, null);
    }
}
