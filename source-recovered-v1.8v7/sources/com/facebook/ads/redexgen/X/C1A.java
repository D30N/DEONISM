package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1A implements Serializable {
    public static byte[] A0A = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C1C A00;
    public C1D A01;
    public C1H A02;
    public C1J A03;
    public C1K A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A0A = new byte[]{-69, -65, -77, -71, -73, -42, -53, -42, -50, -57, -80, -83, -89, -50, -52, -41, -41, -54, -33, -38, -54, -52, -50, -33, -44, -38, -39, -75, -77, -68, -77, -64, -73, -79, -83, -62, -77, -58, -62, 12, -1, -6, -5, 5, -11, 6, 8, -5, 2, 5, -9, -6, -11, 9, -1, 16, -5, -11, -8, 15, 10, -5, 9, -26, -40, -45, -29, -41, -89, -102, -107, -106, -96, -112, -90, -93, -99, -72, -63, -73, -78, -74, -76, -59, -73, -78, -68, -64, -76, -70, -72, -58, -8, -25, -6, -17, -12, -19, -27, -4, -25, -14, -5, -21, -48, -38, -58, -35, -48, -53, -52, -42, -58, -56, -36, -53, -48, -42, -58, -44, -36, -37, -52, -53, -79, -69, -89, -70, -83, -65, -87, -70, -84, -83, -84, -89, -87, -84, 13, 16, 11, 15, 30, 17, 13, 32, 21, 34, 17, 11, 32, 37, 28, 17, -75, -86, -79, -71, -95, -85, -80, -74, -76, -79, -95, -74, -76, -93, -80, -75, -85, -74, -85, -79, -80, -8, 5, -6, 15, 32, 19, 14, 15, 25, 9, 14, 31, 28, 11, 30, 19, 25, 24, 9, 29, 15, 13, -71, -75, -87, -81, -89, -78, -91, -87, -75, -76, -70, -85, -66, -70, -26, -29, -25, -27, -26, -14, -85, -102, -83, -94, -89, -96, -104, -100, -88, -82, -89, -83, -63, -62, -48, -47, -58, -53, -66, -47, -58, -52, -53, -68, -47, -58, -47, -55, -62, -70, -69, -62, -73, -49, -75, -71, -62, -65, -71, -63, -75, -54, -69, -50, -54, -27, -25, -44, -26, -37, -26, -34, -41, 13, -1, -3, 9, 8, -2, 13, -7, 0, 9, 12, -7, 12, -1, 17, -5, 12, -2, 14, 3, 10, 18, -6, 0, 19, 4, 15, -6, 15, 13, -4, 9, 14, 4, 15, 4, 10, 9, 0, -11, -4, 4, -20, -14, -5, -15, -20, -16, -18, -1, -15, -63, -67, -68, -65, -70, -66, -54, -56, -56, -68, -55, -65, 13, 0, -5, -4, 6, -10, -8, 12, 11, 6, 7, 3, -8, 16, -10, -4, 5, -8, -7, 3, -4, -5, -54, -11, -95, -8, -22, -19, -19, -95, -30, -10, -11, -16, -18, -30, -11, -22, -28, -30, -19, -19, -6, -95, -16, -15, -26, -17, -95, -22, -17, -95, -36, -12, -26, -28, -12, -34, -12, -87, -95, -97, -90, -90, -105, -104, -94, -101, -107, -87, -101, -103, -91, -92, -102, -87, -97, -87, -107, -83, -105, -86, -103, -98, -107, -105, -92, -102, -107, -104, -88, -91, -83, -87, -101, -71, -78, -73, -81, -83, -76, -76, -91, -90, -80, -87, -93, -73, -87, -89, -77, -78, -88, -73, -10, -12, 7, -8, -6, 2, 5, 12};
    }

    public static C1A A00(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = null;
        int iOptInt = 0;
        C1C c1cA0H = null;
        C1A c1a = new C1A();
        c1a.A06(new C1G().A0H(jSONObject.optString(A01(5, 5, 49))).A0G(jSONObject.optString(A01(262, 8, 65))).A0B(jSONObject.optString(A01(175, 4, 101))).A0F(jSONObject.optString(A01(197, 14, 21))).A0E(jSONObject.optString(A01(92, 12, 85))).A0D(jSONObject.optString(A01(217, 12, 8))).A09(jSONObject.optString(A01(138, 16, k.AppCompatTheme_windowMinWidthMinor))).A0A(jSONObject.optString(A01(447, 8, 98))).A0C(jSONObject.optString(A01(229, 17, 44))).A0I());
        c1a.A07(new C1J(jSONObject.optString(A01(321, 12, 42)), jSONObject.optString(A01(13, 14, 58)), jSONObject.optString(A02(jSONObject))));
        String strA01 = A01(428, 19, 19);
        char c2 = jSONObject.optInt(strA01, -1) == -1 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    jSONObject = jSONObject;
                    iOptInt = jSONObject.optInt(A01(392, 17, 5), -1);
                    c2 = 3;
                    break;
                case 3:
                    jSONObject = jSONObject;
                    C1C c1cA0E = new C1C().A0J(jSONObject.optString(A01(68, 9, 0))).A0G(jSONObject.optLong(A01(39, 24, 101), -1L)).A0E(iOptInt);
                    int unskippableSeconds = jSONObject.optInt(A01(270, 18, 105), Integer.MAX_VALUE);
                    c1cA0H = c1cA0E.A0D(unskippableSeconds).A0H(C1T.A01(jSONObject));
                    jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(0, 5, 33));
                    if (jSONObjectOptJSONObject == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1cA0H = c1cA0H;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    c1cA0H.A0I(jSONObjectOptJSONObject.optString(A01(10, 3, 10))).A0C(jSONObjectOptJSONObject.optInt(A01(63, 5, 62))).A0B(jSONObjectOptJSONObject.optInt(A01(211, 6, 77)));
                    c2 = 5;
                    break;
                case 5:
                    JSONObject jSONObject2 = jSONObject;
                    C1A c1a2 = c1a;
                    c1a2.A04(c1cA0H);
                    c1a2.A0C(jSONObject2.optBoolean(A01(154, 21, 17)));
                    c1a2.A08(new C1K(LX.A04(jSONObject2.optJSONArray(A01(77, 15, 34)))));
                    c1a2.A09(jSONObject2.optBoolean(A01(409, 19, 5)));
                    return c1a2;
                case 6:
                    jSONObject = jSONObject;
                    strA01 = strA01;
                    iOptInt = jSONObject.optInt(strA01, -1);
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A02(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = null;
        String strA01 = A01(246, 16, 37);
        String strA012 = A01(355, 37, 80);
        String strOptString = jSONObject.optString(strA01, strA012);
        char c2 = strOptString.equals(strA012) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jSONObject = jSONObject;
                    String delayText = A01(27, 12, 29);
                    jSONObjectOptJSONObject = jSONObject.optJSONObject(delayText);
                    if (jSONObjectOptJSONObject != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA012 = strA012;
                    strOptString = strA012;
                    c2 = 4;
                    break;
                case 4:
                    return strOptString;
                case 5:
                    strA01 = strA01;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    strA012 = jSONObjectOptJSONObject.optString(strA01, strA012);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A04(C1C c1c) {
        this.A00 = c1c;
    }

    private final void A05(C1D c1d) {
        this.A01 = c1d;
    }

    private final void A06(C1H c1h) {
        this.A02 = c1h;
    }

    private final void A07(C1J c1j) {
        this.A03 = c1j;
    }

    private final void A08(C1K c1k) {
        this.A04 = c1k;
    }

    private final void A09(boolean z) {
        this.A06 = z;
    }

    private final void A0A(boolean z) {
        this.A07 = z;
    }

    private final void A0B(boolean z) {
        this.A08 = z;
    }

    private final void A0C(boolean z) {
        this.A09 = z;
    }

    public final C1D A0D() {
        return this.A01;
    }

    public final C1H A0E() {
        return this.A02;
    }

    public final C1J A0F() {
        return this.A03;
    }

    public final C1K A0G() {
        return this.A04;
    }

    public final void A0H(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(333, 22, 102)));
        this.A00.A0K(jSONObject.optBoolean(A01(104, 20, 54), true));
        A05(this.A00.A0M());
        A0J(jSONObject.optBoolean(A01(k.AppCompatTheme_windowNoTitle, 14, 23)));
        A0A(jSONObject.optBoolean(A01(308, 13, 92)));
        A0B(jSONObject.optBoolean(A01(288, 20, 106)));
    }

    public final void A0I(JSONObject jSONObject) {
        this.A00.A0F(jSONObject.optInt(A01(179, 18, k.AppCompatTheme_windowFixedWidthMinor)));
        this.A00.A0K(jSONObject.optBoolean(A01(104, 20, 54), true));
        A05(this.A00.A0M());
        A0A(jSONObject.optBoolean(A01(308, 13, 92)));
    }

    public final void A0J(boolean z) {
        this.A05 = z;
    }

    public final boolean A0K() {
        return this.A05;
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M() {
        return this.A07;
    }

    public final boolean A0N() {
        return this.A08;
    }

    public final boolean A0O() {
        return this.A09;
    }
}
