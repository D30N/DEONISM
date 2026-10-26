package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdImageApi;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0580Js implements NativeAdImageApi {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{67, 64, 58, -18, -32, -37, -21, -33, 66, 63, 67, 65, 66, 78};
    }

    public C0580Js(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Nullable
    public static C0580Js A00(JSONObject jSONObject) {
        String mUrl = null;
        char c2 = jSONObject == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C0580Js) null;
                case 3:
                    jSONObject = jSONObject;
                    mUrl = jSONObject.optString(A01(0, 3, 93));
                    if (mUrl != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (C0580Js) null;
                case 5:
                    JSONObject jSONObject2 = jSONObject;
                    return new C0580Js(mUrl, jSONObject2.optInt(A01(3, 5, 6), 0), jSONObject2.optInt(A01(8, 6, 105), 0));
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getWidth() {
        return this.A01;
    }
}
