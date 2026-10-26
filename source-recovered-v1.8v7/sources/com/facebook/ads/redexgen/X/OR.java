package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OR {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A03();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{123, Byte.MAX_VALUE, 115, 117, 119, 123, 126, 69, 121, 104, Byte.MAX_VALUE, 123, 110, 115, 108, Byte.MAX_VALUE, 69, 110, 99, 106, Byte.MAX_VALUE, 93, 74, 85, 9, 22, 27, 26, 16, 103, 92, 83, 80, 94, 87, 18, 70, 93, 18, 81, 64, 87, 83, 70, 87, 18, 83, 86, 86, 91, 70, 91, 93, 92, 83, 94, 123, 92, 84, 93, 21, 2, 29, 29, 62, 54, 54, 52, 35, 34, 39, 28, 49, 38, 50, 54, 38, 48, 55, 28, 42, 39, 54, 51, 8, 49, 56, 37, 58, 54, 35, 8, 35, 46, 39, 50};
    }

    public OR(String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = !TextUtils.isEmpty(str2) ? A01(24, 5, k.AppCompatTheme_windowActionModeOverlay) : A01(0, 5, 24);
    }

    private C03018b A00(String str) {
        C03018b c03018b = new C03018b(str);
        c03018b.A05(A02());
        c03018b.A03(1);
        return c03018b;
    }

    private JSONObject A02() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(82, 14, 93), this.A00);
            jSONObject.put(A01(69, 13, 73), this.A02);
            jSONObject.put(A01(5, 16, 16), this.A01);
        } catch (JSONException e) {
            Log.w(A01(60, 9, 91), A01(29, 31, 56), e);
        }
        return jSONObject;
    }

    public final void A04(int i, String str) {
        XJ xjA00 = C8B.A00();
        if (xjA00 != null) {
            xjA00.A04().A83(A01(21, 3, 51), i, A00(str));
        }
    }
}
