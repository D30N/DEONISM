package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdRatingApi;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0581Jt implements NativeAdRatingApi {
    public static byte[] A02;
    public final double A00;
    public final double A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{85, 66, 79, 86, 70, 61, 45, 47, 34, 43};
    }

    public C0581Jt(double d2, double d3) {
        this.A01 = d2;
        this.A00 = d3;
    }

    @Nullable
    public static C0581Jt A00(JSONObject jSONObject) {
        double d2 = 0.0d;
        double mValue = 0.0d;
        double dOptDouble = 0.0d;
        char c2 = jSONObject == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C0581Jt) null;
                case 3:
                    jSONObject = jSONObject;
                    d2 = 0.0d;
                    mValue = jSONObject.optDouble(A01(0, 5, 30), 0.0d);
                    dOptDouble = jSONObject.optDouble(A01(5, 5, k.AppCompatTheme_windowActionBar), 0.0d);
                    if (mValue == 0.0d) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (dOptDouble != d2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return (C0581Jt) null;
                case 6:
                    return new C0581Jt(mValue, dOptDouble);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdRatingApi
    public final double getScale() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdRatingApi
    public final double getValue() {
        return this.A01;
    }
}
