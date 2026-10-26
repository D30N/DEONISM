package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class U6 implements AnonymousClass64 {
    public static byte[] A01;
    public static final String A02;
    public final XJ A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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

    public static void A01() {
        A01 = new byte[]{23, 30, 25, 55, 46, 40, -19, -1, -11, -16, 31, 17, 32, 19, 21, 40, 91, 70, 72, 83, 87, 76, 82, 81, 3, 69, 88, 76, 79, 71, 76, 81, 74, 3, 41, 36, 49, 3, 79, 82, 74, 74, 76, 81, 74, 3, 45, 54, 50, 49, 80, 97, 37, 39, 34, 39, 36, 55, 36, 34, 47, 50, 42, 42, 44, 49, 42};
    }

    static {
        A01();
        A02 = U6.class.getSimpleName();
    }

    public U6(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void A8J(String str, String str2, int i, int i2, int i3, JSONObject jSONObject, EnumC02666i enumC02666i) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(A00(6, 4, 27), str);
            jSONObject2.put(A00(0, 3, 68), str2);
            jSONObject2.put(A00(50, 2, k.AppCompatTheme_windowNoTitle), i);
            jSONObject2.put(A00(13, 2, 48), i2);
            jSONObject2.put(A00(10, 3, 59), i3);
            jSONObject2.put(A00(3, 3, 83), C02836z.A01(jSONObject.toString(), str2));
            C03018b c03018b = new C03018b(jSONObject2.toString());
            c03018b.A03(1);
            this.A00.A04().A84(A00(52, 15, 82), 3201, c03018b);
        } catch (JSONException e) {
            Log.e(A02, A00(15, 35, k.AppCompatTheme_viewInflaterClass), e);
        }
    }
}
