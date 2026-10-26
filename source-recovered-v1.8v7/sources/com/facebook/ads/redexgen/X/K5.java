package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class K5 {
    public final AdErrorType A00;
    public final String A01;

    public K5(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public K5(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static AdError A00(K5 k5) {
        if (k5.A04().isPublicError()) {
            return new AdError(k5.A04().getErrorCode(), k5.A05());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }

    public static K5 A01(AdErrorType adErrorType) {
        return new K5(adErrorType, (String) null);
    }

    public static K5 A02(AdErrorType adErrorType, @Nullable String str) {
        return new K5(adErrorType, str);
    }

    public static K5 A03(K6 k6) {
        return new K5(k6.A00(), k6.A01());
    }

    public final AdErrorType A04() {
        return this.A00;
    }

    public final String A05() {
        return this.A01;
    }
}
