package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6M {
    public static byte[] A01;
    public static final String[] A02;
    public final float[] A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 94);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{0, 116, 23, 63, 119};
    }

    static {
        A01();
        A02 = new String[]{A00(2, 1, 49), A00(1, 1, 83), A00(0, 1, 36), A00(4, 1, 94)};
    }

    public C6M(float[] fArr) {
        this.A00 = fArr;
    }

    private final float[] A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A00.length * 4;
    }

    public final JSONObject A04(JSONObject jSONObject) throws JSONException {
        C6M c6m = this;
        String[] strArr = null;
        float[] fArr = null;
        JSONObject jSONObject2 = new JSONObject();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c6m = c6m;
                    fArr = c6m.A00;
                    if (i >= fArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strArr = A02;
                    if (i >= strArr.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jSONObject2 = jSONObject2;
                    fArr = fArr;
                    strArr = strArr;
                    jSONObject2.put(strArr[i], fArr[i]);
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    JSONObject jSONObject3 = jSONObject;
                    jSONObject3.put(A00(3, 1, 23), jSONObject2);
                    return jSONObject3;
            }
        }
    }

    public final boolean A05(C6M c6m) {
        C6M c6m2 = this;
        int i = 0;
        float[] fArrA02 = c6m.A02();
        char c2 = fArrA02.length != c6m2.A00.length ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    fArrA02 = fArrA02;
                    if (i >= fArrA02.length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c6m2 = c6m2;
                    fArrA02 = fArrA02;
                    if (Math.abs(c6m2.A02()[i] - fArrA02[i]) <= C02525u.A01()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return true;
            }
        }
    }
}
