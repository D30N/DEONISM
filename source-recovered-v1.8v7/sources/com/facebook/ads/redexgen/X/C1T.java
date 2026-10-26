package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1T implements Serializable {
    public static byte[] A0B = null;
    public static final C1U A0C;
    public static final EnumC0677Np A0D;
    public static final long serialVersionUID = -5352540123250859603L;
    public String A00;
    public final int A01;
    public final int A02;
    public final C1U A03;
    public final EnumC0677Np A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowActionBar);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A0B = new byte[]{37, 39, 44, 39, 48, 43, 33, 29, 54, 39, 58, 54, 107, 118, 109, 97, 106, 112, 101, 112, 109, 107, 106, 76, 91, 73, 95, 76, 90, 91, 90, 97, 78, 82, 95, 71, 97, 74, 91, 70, 74, 42, 56, 63, 2, 43, 52, 56, 42, 2, 41, 52, 48, 56, 50, 40, 41, 2, 52, 51, 2, 48, 52, 49, 49, 52, 46, 56, 62, 50, 51, 57, 46, 67, 68, 95, 57, 59, 44, 42, 40, 42, 33, 32, 39, 46, 22, 36, 44, 61, 33, 38, 45, 36, 37, 44, 33, 57, 31, 35, 44, 41, 35, 43, 31, 52, 37, 56, 52, 4, 3, 25, 31, 2, 50, 14, 12, 31, 9, 50, 4, 14, 2, 3, 50, 24, 31, 1, 28, 23, 24, 27, 21, 28, 38, 28, 23, 29, 38, 26, 24, 11, 29, 54, 42, 39, 63, 39, 36, 42, 35, 25, 34, 39, 50, 39, 29, 42, 56, 46, 61, 43, 42, 43, 111, 31, 35, 46, 54, 37, 61, 63, 38, 38, 55, 52, 58, 51, 9, 37, 51, 53, 57, 56, 50, 37, 27, 16, 31, 28, 18, 27, 33, 23, 16, 10, 12, 17, 33, 29, 31, 12, 26, 56, 4, 9, 17, 72, 59, 28, 7, 26, 13, 72, 31, 1, 4, 4, 72, 9, 29, 28, 7, 5, 9, 28, 1, 11, 9, 4, 4, 17, 72, 7, 24, 13, 6, 72, 1, 6, 72, 51, 27, 13, 11, 27, 53, 27, 96, 123, 102, 126, 124, 101, 101, 116, 119, 121, 112, 74, 102, 112, 118, 122, 123, 113, 102};
    }

    static {
        A06();
        A0D = EnumC0677Np.A04;
        A0C = C1U.A03;
    }

    public C1T(String str, String str2, int i, String str3, String str4, EnumC0677Np enumC0677Np, int i2, boolean z, boolean z2, C1U c1u) {
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A08 = str3;
        this.A05 = str4;
        this.A04 = enumC0677Np;
        this.A02 = i2;
        this.A0A = z;
        this.A09 = z2;
        this.A03 = c1u;
    }

    public static int A00(JSONObject jSONObject) {
        int iOptInt = 0;
        String strA03 = A03(169, 17, 37);
        char c2 = jSONObject.has(strA03) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jSONObject = jSONObject;
                    strA03 = strA03;
                    iOptInt = jSONObject.optInt(strA03);
                    c2 = 3;
                    break;
                case 3:
                    return iOptInt;
                case 4:
                    jSONObject = jSONObject;
                    iOptInt = jSONObject.optInt(A03(248, 19, 102), 0);
                    c2 = 3;
                    break;
            }
        }
    }

    @Nullable
    public static C1T A01(JSONObject playableAdDataJson) {
        JSONObject jSONObjectOptJSONObject = playableAdDataJson.optJSONObject(A03(143, 13, 53));
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new C1T(jSONObjectOptJSONObject.optString(A03(73, 3, 69)), jSONObjectOptJSONObject.optString(A03(109, 19, 30)), A00(playableAdDataJson), A05(jSONObjectOptJSONObject), A04(jSONObjectOptJSONObject), A02(jSONObjectOptJSONObject), jSONObjectOptJSONObject.optInt(A03(41, 32, 46), 5000), jSONObjectOptJSONObject.optBoolean(A03(186, 17, 13), true), jSONObjectOptJSONObject.optBoolean(A03(128, 15, 10)), C1U.A00(jSONObjectOptJSONObject.optString(A03(76, 17, 58), A0C.name())));
    }

    public static EnumC0677Np A02(JSONObject jSONObject) {
        return EnumC0677Np.A00(jSONObject.optInt(A03(12, 11, k.AppCompatTheme_windowFixedHeightMinor), A0D.A03()));
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A03(0, 12, 49));
        String strA03 = A03(203, 45, 27);
        return genericTextObject == null ? strA03 : genericTextObject.optString(A03(93, 16, 51), strA03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject genericTextObject = jSONObject.optJSONObject(A03(0, 12, 49));
        String strA03 = A03(156, 13, 60);
        return genericTextObject == null ? strA03 : genericTextObject.optString(A03(23, 18, 77), strA03);
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        return this.A02;
    }

    public final C1U A09() {
        return this.A03;
    }

    public final EnumC0677Np A0A() {
        return this.A04;
    }

    public final String A0B() {
        return this.A00;
    }

    public final String A0C() {
        return this.A05;
    }

    public final String A0D() {
        return this.A06;
    }

    public final String A0E() {
        return this.A07;
    }

    public final String A0F() {
        return this.A08;
    }

    public final void A0G(String str) {
        this.A00 = str;
    }

    public final boolean A0H() {
        return this.A0A;
    }
}
