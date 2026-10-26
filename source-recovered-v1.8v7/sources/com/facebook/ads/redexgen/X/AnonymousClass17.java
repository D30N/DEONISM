package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import d.b.a.b.k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass17 implements Serializable {
    public static JSONObject A0I = null;
    public static byte[] A0J = null;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A02;
    public RewardData A03;
    public AnonymousClass18 A04;
    public C1O A05;
    public C1R A06;
    public C1Y A07;
    public String A08;
    public String A09;

    @Nullable
    public String A0A;
    public String A0B;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public final int A0G;
    public final List<C1A> A0H;
    public String A0C = A00(49, 0, 28);
    public int A01 = 200;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0J = new byte[]{16, 13, 16, 8, 1, 16, 23, 9, 36, 59, 55, 37, 51, 48, 59, 62, 59, 38, 43, 13, 49, 58, 55, 49, 57, 13, 59, 60, 38, 55, 32, 36, 51, 62, 90, 87, 79, 89, 67, 66, 67, 78, 65, 75, 92, 76, 78, 95, 74, 10, 21, 8, 14, 8, 27, 19, 14, 23, 8, 4, 22, 0, 3, 8, 13, 8, 21, 24, 62, 2, 9, 4, 2, 10, 62, 8, 15, 8, 21, 8, 0, 13, 62, 5, 4, 13, 0, 24, 24, 5, 18, 29, 17, 21, 31, 35, 15, 24, 23, 35, 16, 29, 5, 25, 14, 35, 20, 8, 17, 16, 35, 9, 14, 16, 111, 120, 108, 104, 120, 110, 105, 66, 116, 121, 79, 74, 113, 77, 70, 65, 71, 77, 75, 93, 113, 66, 71, 64, 69, 113, 91, 92, 66, 90, 92, 74, 112, 65, 74, 88, 112, 67, 78, 86, 64, 90, 91, 112, 76, 64, 65, 91, 93, 64, 67, 67, 74, 93, 2, 21, 68, 70, 68, 79, 66, 120, 70, 84, 84, 66, 83, 84, 4, 14, 2, 3, 71, 72, 121, 74, 73, 65, 73, 121, 82, 95, 86, 67};
    }

    public abstract int A0H();

    public abstract int A0I();

    public AnonymousClass17(List<C1A> list) {
        this.A0H = list;
    }

    private void A02(int i) {
        this.A00 = i;
    }

    private void A03(int i) {
        this.A02 = i;
    }

    private void A04(AnonymousClass18 anonymousClass18) {
        this.A04 = anonymousClass18;
    }

    private void A05(C1O c1o) {
        this.A05 = c1o;
    }

    private final void A06(C1R c1r) {
        this.A06 = c1r;
    }

    private void A07(C1Y c1y) {
        this.A07 = c1y;
    }

    private void A08(String str) {
        this.A09 = str;
    }

    private void A09(String str) {
        this.A0D = str;
    }

    private final void A0A(String str) {
        this.A08 = str;
    }

    private void A0B(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(this.A09)) {
            this.A0C = jSONObject.toString();
        }
    }

    private void A0C(boolean z) {
        this.A0F = z;
    }

    public final int A0D() {
        return this.A00;
    }

    public final int A0E() {
        return this.A01;
    }

    public final int A0F() {
        return this.A02;
    }

    public final int A0G() {
        return this.A0G;
    }

    @Nullable
    public final RewardData A0J() {
        return this.A03;
    }

    public final AnonymousClass18 A0K() {
        return this.A04;
    }

    public final C1A A0L() {
        return this.A0H.get(0);
    }

    public final C1O A0M() {
        return this.A05;
    }

    public final C1R A0N() {
        return this.A06;
    }

    public final C1Y A0O() {
        return this.A07;
    }

    public final String A0P() {
        return this.A08;
    }

    public final String A0Q() {
        return this.A09;
    }

    @Nullable
    public final String A0R() {
        return this.A0A;
    }

    public final String A0S() {
        return this.A0B;
    }

    public final String A0T() {
        return this.A0D;
    }

    public final String A0U() {
        return this.A0E;
    }

    public final List<C1A> A0V() {
        return Collections.unmodifiableList(this.A0H);
    }

    public final JSONObject A0W() {
        return A0I;
    }

    public final JSONObject A0X() {
        try {
            return new JSONObject(this.A0C);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A0Y(int i) {
        this.A01 = i;
    }

    public final void A0Z(RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0a(@Nullable String str) {
        this.A0A = str;
    }

    public final void A0b(String str) {
        this.A0B = str;
    }

    public final void A0c(String str) {
        this.A0E = str;
    }

    public final void A0d(JSONObject jSONObject) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        A0I = jSONObject.optJSONObject(A00(170, 12, 21));
        C1Q c1qA06 = new C1Q().A06(jSONObject.optString(A00(0, 5, 86)));
        String strA00 = A00(182, 4, 95);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(strA00);
        String strA002 = A00(49, 0, 28);
        if (jSONObjectOptJSONObject2 != null) {
            strOptString = jSONObject.optJSONObject(strA00).optString(A00(5, 3, 87));
        } else {
            strOptString = strA002;
        }
        A06(c1qA06.A05(strOptString).A04(jSONObject.optString(A00(k.AppCompatTheme_windowNoTitle, 19, 28))).A07(C1S.A03(jSONObject)).A08());
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(A00(34, 6, 4));
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(A00(49, 8, 72));
        } else {
            jSONObjectOptJSONObject = null;
        }
        A04(new AnonymousClass18(C1I.A01(jSONObjectOptJSONObject), C1I.A01(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optJSONObject(A00(40, 9, 29)) : null)));
        A07(C1S.A01(jSONObject));
        A05(C1S.A00(jSONObject));
        A0A(jSONObject.optString(A00(168, 2, 83)));
        A09(jSONObject.optString(A00(k.AppCompatTheme_viewInflaterClass, 10, 47), strA002));
        A08(jSONObject.optString(A00(88, 26, 78), strA002));
        A02(jSONObject.optInt(A00(186, 12, 20), 0));
        A0B(jSONObject);
        A03(jSONObject.optInt(A00(57, 31, 83), 0));
        A0Y(jSONObject.optInt(A00(8, 26, 96), AdError.NETWORK_ERROR_CODE));
        A0C(jSONObject.optBoolean(A00(143, 25, 29)));
    }

    public final boolean A0e() {
        return this.A0F;
    }
}
