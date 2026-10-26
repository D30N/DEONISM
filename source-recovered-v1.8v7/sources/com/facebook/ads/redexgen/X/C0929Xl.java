package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0929Xl implements C0T {
    public static byte[] A02;
    public final /* synthetic */ C8C A00;
    public final /* synthetic */ C0931Xn A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{32, 51, 41, 39, 52, 47, 47, 36, 45, 59, 85, 102, 125, 125, 118, Byte.MAX_VALUE, 41, 51, 120, 75, 80, 80, 91, 82};
    }

    public C0929Xl(C0931Xn c0931Xn, C8C c8c) {
        this.A01 = c0931Xn;
        this.A00 = c8c;
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A5B(C0U c0u, JSONObject jSONObject) {
        C03018b c03018b = new C03018b(A00(18, 6, 46));
        c03018b.A05(jSONObject);
        c03018b.A03(1);
        this.A00.A04().A83(A00(3, 6, 81), c0u.A02() + 4000, c03018b);
        if (BuildConfigApi.isDebug()) {
            String str = A00(10, 8, 3) + c0u + A00(9, 1, 3) + c0u.A02() + A00(0, 3, 25) + jSONObject.toString();
        }
    }
}
