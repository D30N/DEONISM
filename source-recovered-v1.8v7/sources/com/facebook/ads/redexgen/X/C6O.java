package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6O {
    public static byte[] A07;
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final float[] A06;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowMinWidthMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A07 = new byte[]{81, 92, 102, 44, 44, 109, 117, 25, 4, 1, 16, 20, 106, 110, 112, 107, 7, 0};
    }

    public C6O(int i, int i2, int i3, float[] fArr, float f, float f2, float f3) {
        this.A05 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A06 = fArr;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    private final float A00() {
        return this.A00;
    }

    private final float A01() {
        return this.A01;
    }

    private final float A02() {
        return this.A02;
    }

    private final int A03() {
        return this.A03;
    }

    private final int A04() {
        return this.A04;
    }

    private final int A05() {
        return this.A05;
    }

    private final float[] A08() {
        return this.A06;
    }

    public final int A09() {
        return 32;
    }

    public final JSONObject A0A(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A06(9, 3, 15), this.A05);
        jSONObject2.put(A06(7, 2, 23), this.A03);
        jSONObject2.put(A06(3, 2, 34), this.A04);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A06(1, 1, 94), AnonymousClass71.A00(this.A06[0]));
        jSONObject3.put(A06(0, 1, 82), AnonymousClass71.A00(this.A06[1]));
        jSONObject2.put(A06(5, 2, 99), jSONObject3);
        jSONObject2.put(A06(16, 2, 9), AnonymousClass71.A00(this.A02));
        jSONObject2.put(A06(12, 2, 100), AnonymousClass71.A00(this.A01));
        jSONObject2.put(A06(14, 2, 126), AnonymousClass71.A00(this.A00));
        jSONObject.put(A06(2, 1, 106), jSONObject2);
        return jSONObject;
    }

    public final boolean A0B(C6O c6o) {
        C6O c6o2 = this;
        boolean z = true;
        char c2 = c6o2.A05() == c6o.A05() ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (c6o2.A03() != c6o.A03()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (c6o2.A04() != c6o.A04()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (Math.abs(c6o2.A08()[0] - c6o.A08()[0]) >= C02525u.A01()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (Math.abs(c6o2.A08()[z ? 1 : 0] - c6o.A08()[z ? 1 : 0]) >= C02525u.A01()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (Math.abs(c6o2.A02() - c6o.A02()) >= C02525u.A01()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (Math.abs(c6o2.A01() - c6o.A01()) >= C02525u.A01()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c6o2 = c6o2;
                    c6o = c6o;
                    if (Math.abs(c6o2.A00() - c6o.A00()) >= C02525u.A01()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return z;
                case '\n':
                    z = false;
                    c2 = '\t';
                    break;
            }
        }
    }
}
