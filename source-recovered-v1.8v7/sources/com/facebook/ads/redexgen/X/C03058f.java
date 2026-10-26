package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03058f {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{44, 15, 7, 7, 9, 14, 7, 64, 46, 5, 20, 23, 15, 18, 11, 64, 37, 22, 5, 14, 20, 113, 118, 99, 112, 118, 93, 118, 107, 111, 103, 93, 76, 75, 88, 77, 80, 86, 87, 40, 63, 63, 34, 63, 12, 16, 16, 20, 59, 23, 16, 5, 16, 17, 23, 59, 7, 11, 0, 1, 102, 109, 124, Byte.MAX_VALUE, 103, 122, 99, 44, 41, 53, 54, 56, 61, 6, 42, 48, 35, 60, 62, 47, 55, 34, 33, 47, 42, 17, 61, 39, 52, 43};
    }

    public static JSONObject A01(C8C c8c, long j, long j2, long j3, long j4, int i, @Nullable Exception exc) throws JSONException {
        JSONException e = null;
        double d2 = 0.0d;
        String strA00 = null;
        String strA002 = null;
        long j5 = 0;
        long j6 = 0;
        String strA003 = null;
        String strA004 = null;
        String strA005 = null;
        int i2 = 0;
        JSONObject jSONObject = new JSONObject();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        strA002 = A00(21, 10, 66);
                        c2 = 4;
                        break;
                    } catch (JSONException e2) {
                        e = e2;
                        c2 = 27;
                        break;
                    }
                case 4:
                    try {
                        jSONObject = jSONObject;
                        strA002 = strA002;
                        jSONObject.put(strA002, j);
                        strA00 = A00(31, 8, k.AppCompatTheme_windowFixedWidthMinor);
                        d2 = j2 / 1000.0d;
                        c2 = 7;
                        break;
                    } catch (JSONException e3) {
                        e = e3;
                        c2 = 27;
                        break;
                    }
                case 7:
                    try {
                        jSONObject = jSONObject;
                        strA00 = strA00;
                        jSONObject.put(strA00, d2);
                        strA003 = A00(78, 12, 14);
                        j5 = j3;
                        c2 = '\n';
                        break;
                    } catch (JSONException e4) {
                        e = e4;
                        c2 = 27;
                        break;
                    }
                case '\n':
                    try {
                        jSONObject = jSONObject;
                        strA003 = strA003;
                        jSONObject.put(strA003, j5);
                        strA005 = A00(67, 11, 25);
                        j6 = j4;
                        c2 = '\r';
                        break;
                    } catch (JSONException e5) {
                        e = e5;
                        c2 = 27;
                        break;
                    }
                case '\r':
                    try {
                        jSONObject = jSONObject;
                        strA005 = strA005;
                        jSONObject.put(strA005, j6);
                        strA004 = A00(44, 16, 36);
                        i2 = i;
                        c2 = 16;
                        break;
                    } catch (JSONException e6) {
                        e = e6;
                        c2 = 27;
                        break;
                    }
                case 16:
                    try {
                        jSONObject = jSONObject;
                        strA004 = strA004;
                        jSONObject.put(strA004, i2);
                        if (exc == null) {
                            break;
                        } else {
                            jSONObject.put(A00(39, 5, 13), exc.getMessage());
                            break;
                        }
                    } catch (JSONException e7) {
                        e = e7;
                        c2 = 27;
                        break;
                    }
                case 27:
                    c8c.A04().A3R(e);
                    break;
            }
        }
        return jSONObject;
    }

    public static void A03(C8C c8c, long j, long j2, long j3, long j4, int i, @Nullable Exception exc) {
        C03018b c03018b = new C03018b(A00(0, 21, 32));
        c03018b.A03(1);
        c03018b.A05(A01(c8c, j, j2, j3, j4, i, exc));
        c8c.A04().A8P(A00(60, 7, 72), C03008a.A1W, c03018b);
    }
}
