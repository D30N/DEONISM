package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1I implements Serializable {
    public static byte[] A09 = null;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A09 = new byte[]{-121, -116, -124, -120, -108, -111, -108, -105, 87, 102, 103, 102, 107, 102, 122, -66, -53, -64, -43, -69, -65, -53, -56, -53, -50, Byte.MAX_VALUE, -112, 125, 123, -112, -127, -108, -112, 123, Byte.MAX_VALUE, -117, -120, -117, -114, -126, -104, -113, -104, -109, -104, -62, -50, -48, -67, -49, -60, -49, -57, -64, -70, -66, -54, -57, -54, -51, -107, -40, -88, -40, -87, -40, -85, 78, -111, -111, 95, 91, 99, 91, -111, -111, -85, -68, -87, -89, -85, -73, -76, -73, -70, -89, -73, -66, -83, -70, -89, -75, -83, -84, -79, -87, -98, -96, -96, -94, -85, -79, -100, -96, -84, -87, -84, -81, -119, -102, -121, -123, -119, -107, -110, -107, -104, 50, 67, 113, 67, 117, 68, 69, -13, -24, -13, -21, -28, -34, -30, -18, -21, -18, -15, -91, -74, -93, -95, -74, -89, -70, -74, -95, -91, -79, -82, -79, -76, -95, -79, -72, -89, -76, -95, -81, -89, -90, -85, -93};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(39, 7, 83));
        A0B = Color.parseColor(A02(k.AppCompatTheme_windowActionModeOverlay, 7, 3));
        A0C = Color.parseColor(A02(60, 7, 102));
        String strA02 = A02(67, 9, 31);
        A0D = Color.parseColor(strA02);
        A0E = Color.parseColor(A02(8, 7, 40));
        A0F = Color.parseColor(strA02);
    }

    public C1I(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
        this.A08 = i9;
    }

    public static int A00(@Nullable JSONObject jSONObject, String str, int i) {
        int color = 0;
        char c2 = jSONObject != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    jSONObject = jSONObject;
                    str = str;
                    if (!jSONObject.has(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONObject = jSONObject;
                    str = str;
                    color = Color.parseColor(jSONObject.optString(str));
                    c2 = 4;
                    break;
                case 4:
                    return color;
                case 5:
                    color = i;
                    c2 = 4;
                    break;
            }
        }
    }

    public static C1I A01(@Nullable JSONObject jSONObject) {
        return new C1I(A00(jSONObject, A02(96, 12, 49), A0A), A00(jSONObject, A02(15, 10, 80), A0B), A00(jSONObject, A02(46, 14, 79), -16777216), A00(jSONObject, A02(0, 8, 25), A0C), A00(jSONObject, A02(108, 9, 26), A0D), A00(jSONObject, A02(76, 20, 60), -1), A00(jSONObject, A02(25, 14, 16), -1), A00(jSONObject, A02(135, 25, 54), A0F), A00(jSONObject, A02(k.AppCompatTheme_windowNoTitle, 11, k.AppCompatTheme_windowActionBar), -16777216));
    }

    public final int A04(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A00;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A05(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A01;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A06(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A02;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A07(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = A0E;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A03;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A08(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1i = c1i;
                    i = c1i.A05;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A09(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1i = c1i;
                    i = c1i.A07;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A06;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A0A(boolean z) {
        C1I c1i = this;
        int i = 0;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c1i = c1i;
                    i = c1i.A08;
                    c2 = 3;
                    break;
            }
        }
    }
}
