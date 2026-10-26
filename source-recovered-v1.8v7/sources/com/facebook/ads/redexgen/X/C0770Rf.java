package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0770Rf implements InterfaceC01130i, InterfaceC01180n {
    public static byte[] A0a;
    public static final String A0b;
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A06;
    public int A07;
    public long A08;
    public Uri A09;
    public EnumC01120h A0A;
    public AnonymousClass12 A0B;
    public XI A0C;

    @Nullable
    public JW A0D;
    public InterfaceC0579Jr A0E;
    public C0580Js A0F;
    public C0580Js A0G;
    public C0580Js A0H;
    public C0581Jt A0I;
    public EnumC0585Jx A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public Collection<String> A0Q;
    public List<C1141cR> A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public HashMap<String, String> A0R = new HashMap<>();
    public int A05 = 200;
    public int A02 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0a, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0a = new byte[]{54, 58, 46, 52, 50, 42, 39, 35, 38, 46, 43, 48, 39, -16, -27, -16, -24, -31, 13, 11, 22, 22, 9, 30, 25, 9, 11, 13, 30, 19, 25, 24, 55, 56, 71, 56, 54, 71, 60, 66, 65, 50, 70, 71, 69, 60, 65, 58, 70, -9, 32, 29, 23, 31, -44, 32, 35, 27, 27, 25, 24, 94, 91, 96, 93, 81, 86, 87, 101, 85, 100, 91, 98, 102, 91, 97, 96, 81, 82, 83, 86, 91, 86, 97, 86, 92, 91, -13, -26, -31, -30, -20, -36, -19, -17, -30, -23, -20, -34, -31, -36, -16, -26, -9, -30, -36, -33, -10, -15, -30, -16, 47, 34, 30, 48, 26, 27, 34, 37, 34, 45, 50, 24, 28, 33, 30, 28, 36, 24, 34, 39, 45, 30, 43, 47, 26, 37, 32, 28, 17, 41, 15, 36, 34, 17, 30, 35, 28, 17, 36, 25, 31, 30, 107, 102, 89, 104, 107, 96, 103, 108, 87, 91, 103, 101, 104, 106, 93, 107, 107, 87, 105, 109, 89, 100, 97, 108, 113, -8, -21, -26, -25, -15, -31, -9, -12, -18, 85, 83, 100, 86, 91, 96, 86, -38, 7, 7, 4, 7, -75, -6, 13, -6, -8, 10, 9, -2, 3, -4, -75, -10, -8, 9, -2, 4, 3, 100, 95, 82, 97, 100, 89, 96, 101, 23, 58, 25, 62, 69, 63, 57, 59, 73, 86, 71, 91, 89, 75, 69, 90, 88, 71, 84, 89, 82, 71, 90, 79, 85, 84, -35, -32, -14, -31, -18, -16, -27, -17, -31, -18, -37, -22, -35, -23, -31, 82, 80, 97, 83, 82, 93, 99, -18, 23, 20, 14, 22, -53, 19, 12, 27, 27, 16, 25, 16, 15, -53, 26, 25, -53, 23, 26, 14, 22, 30, 14, 29, 16, 16, 25, -53, 12, 15, 17, 4, -1, 0, 10, -6, 8, 11, -1, -47, -22, -35, -34, -24, -31, -100, -16, -21, -100, -20, -35, -18, -17, -31, -100, -33, -35, -18, -21, -15, -17, -31, -24, -100, -32, -35, -16, -35, -86, 73, 60, 56, 74, 52, 53, 60, 63, 60, 71, 76, 50, 54, 59, 56, 54, 62, 50, 60, 65, 60, 71, 60, 52, 63, 50, 55, 56, 63, 52, 76, -13, 0, -11, 10, -1, -3, -17, -18, -23, -4, -17, -6, -7, -4, -2, -23, -1, -4, -10, 9, 5, -7, -1, -9, 2, -11, -7, 5, 4, 10, -5, 14, 10, -5, -8, -9, -10, -5, -9, -6, -19, -20, -25, -4, -6, -23, -10, -5, -12, -23, -4, -15, -9, -10, 15, 20, 28, 7, 18, 15, 10, 7, 26, 15, 21, 20, 5, 8, 11, 14, 7, 28, 15, 21, 24, -8, -21, -9, -5, -21, -7, -6, -27, -17, -22, 12, 15, 10, 14, 19, 26, 20, 14, 16, 30, 10, 23, 20, 25, 22, 10, 32, 29, 23, 29, 31, 12, 30, 19, 30, 22, 15, 6, 23, 26, 59, -20, 18, 53, 56, 56, 79, 82, 77, 98, 96, 79, 92, 97, 90, 79, 98, 87, 93, 92, 41, 42, 23, 40, 21, 40, 23, 42, 31, 36, 29, 51, 86, 83, 98, 102, 87, 100, 18, 83, 94, 100, 87, 83, 86, 107, 18, 94, 97, 83, 86, 87, 86, 18, 86, 83, 102, 83, 85, 94, 81, 82, 92, 85, 79, 102, 89, 85, 103, 79, 92, 95, 87, 4, 1, 20, 1, 12, 8, 7, 10, 5, 9, 21, 19, 19, 7, 20, 10, 48, 35, 30, 31, 41, 25, 27, 47, 46, 41, 42, 38, 27, 51, 25, 31, 40, 27, 28, 38, 31, 30, 52, 50, 67, 64, 70, 68, 54, 61, 69, 56, 52, 70, 60, 62, 59, 57, 59, 64, 49, 48, 43, 64, 62, 45, 58, 63, 56, 45, 64, 53, 59, 58, 10, 13, 8, 12, 17, 24, 18, 12, 14, 28, 8, 18, 12, 24, 23, 88, 97, 84, 85, 95, 88, 82, 102, 97, 84, 99, 102, 91, 98, 103, 82, 95, 98, 90, 7, 1, 13, 12, -15, -20, -33, -18, -15, -26, -19, -14, -35, -22, -19, -27, -35, -30, -29, -22, -33, -9, -35, -15, -29, -31, -19, -20, -30, -36, 16, -1, 4, 0, 9, -2, 0, -69, -23, 0, 15, 18, 10, 13, 6, -69, -25, 10, -4, -1, 0, -1, -8, 5, -10, 3, 6, -2, 6, -10, 11, 16, 7, -4};
    }

    static {
        A05();
        A0b = C0770Rf.class.getSimpleName();
    }

    private Map<String, String> A03(Map<String, String> map) {
        String strA01 = null;
        HashMap map2 = new HashMap();
        String strA012 = A01(607, 4, 85);
        char c2 = map.containsKey(strA012) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    map2 = map2;
                    strA012 = strA012;
                    map2.put(strA012, map.get(strA012));
                    c2 = 3;
                    break;
                case 3:
                    map = map;
                    strA01 = A01(216, 8, k.AppCompatTheme_windowFixedHeightMinor);
                    if (!map.containsKey(strA01)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    map2 = map2;
                    strA01 = strA01;
                    map2.put(strA01, map.get(strA01));
                    c2 = 5;
                    break;
                case 5:
                    return map2;
            }
        }
    }

    private void A04() {
        C0770Rf c0770Rf = this;
        JW jw = null;
        char c2 = !c0770Rf.A0X ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    jw = c0770Rf.A0D;
                    if (jw == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0770Rf = c0770Rf;
                    jw = jw;
                    jw.ABl(c0770Rf.A0N);
                    c2 = 4;
                    break;
                case 4:
                    c0770Rf = c0770Rf;
                    c0770Rf.A0X = true;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A06(XI xi, JSONObject jSONObject, JW jw, String str, int i, int i2) {
        this.A0W = true;
        this.A0C = xi;
        this.A0D = jw;
        this.A02 = i;
        this.A01 = i2;
        A08(jSONObject, str);
    }

    private void A07(Map<String, String> map, Map<String, String> map2) {
        try {
            Map<String, String> urlParams = A03(map);
            new Handler().postDelayed(new C0769Re(this, map2, urlParams), this.A04 * AdError.NETWORK_ERROR_CODE);
        } catch (Exception unused) {
        }
    }

    private void A08(JSONObject jSONObject, String str) {
        if (!this.A0T) {
            if (jSONObject == null) {
                return;
            }
            LJ.A02(this.A0C, A01(694, 23, 33));
            this.A0L = str;
            this.A0M = jSONObject.optString(A01(448, 10, 12));
            this.A00 = jSONObject.optInt(A01(717, 12, 29), 0);
            String strA02 = LX.A02(jSONObject, A01(565, 12, 44));
            this.A09 = TextUtils.isEmpty(strA02) ? null : Uri.parse(strA02);
            for (String str2 : new String[]{A01(250, 15, 2), A01(13, 5, 2), A01(477, 8, 48), A01(5, 8, 72), A01(373, 4, 23), A01(392, 14, 28), A01(61, 16, k.AppCompatTheme_windowFixedWidthMajor), A01(406, 21, 14), A01(494, 14, k.AppCompatTheme_windowActionBarOverlay), A01(611, 20, 82), A01(137, 16, 54), A01(233, 17, 108)}) {
                HashMap<String, String> map = this.A0R;
                String key = LX.A02(jSONObject, str2);
                map.put(str2, key);
            }
            String strA01 = A01(18, 14, 48);
            String strA022 = LX.A02(jSONObject, strA01);
            if (!TextUtils.isEmpty(strA022)) {
                this.A0R.put(strA01, strA022);
            }
            String callToAction = A01(665, 4, 36);
            this.A0G = C0580Js.A00(jSONObject.optJSONObject(callToAction));
            String callToAction2 = A01(0, 5, 83);
            this.A0H = C0580Js.A00(jSONObject.optJSONObject(callToAction2));
            String callToAction3 = A01(508, 11, 60);
            this.A0I = C0581Jt.A00(jSONObject.optJSONObject(callToAction3));
            String callToAction4 = A01(377, 15, 16);
            this.A0N = LX.A02(jSONObject, callToAction4);
            String callToAction5 = A01(546, 15, k.AppCompatTheme_windowFixedHeightMajor);
            this.A0Y = jSONObject.optBoolean(callToAction5);
            String callToAction6 = A01(646, 19, k.AppCompatTheme_windowFixedWidthMinor);
            this.A0Z = jSONObject.optBoolean(callToAction6);
            String callToAction7 = A01(669, 25, 4);
            this.A04 = jSONObject.optInt(callToAction7, 4);
            String callToAction8 = A01(153, 25, 126);
            this.A03 = jSONObject.optInt(callToAction8, 0);
            String callToAction9 = A01(342, 31, 89);
            this.A06 = jSONObject.optInt(callToAction9, 0);
            String callToAction10 = A01(111, 26, 63);
            this.A07 = jSONObject.optInt(callToAction10, AdError.NETWORK_ERROR_CODE);
            String callToAction11 = A01(631, 15, 47);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(callToAction11);
            if (jSONObjectOptJSONObject != null) {
                this.A0F = C0580Js.A00(jSONObjectOptJSONObject);
            }
            String callToAction12 = A01(458, 19, 49);
            this.A0K = LX.A02(jSONObject, callToAction12);
            String callToAction13 = A01(427, 21, 44);
            this.A0A = EnumC01120h.A00(jSONObject.optString(callToAction13));
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(jSONObject.optString(A01(32, 17, 89)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.A0Q = C01140j.A01(jSONArray);
            this.A0P = LX.A02(jSONObject, A01(178, 9, 8));
            this.A08 = jSONObject.optLong(A01(87, 24, 3), -1L);
            this.A0O = LX.A02(jSONObject, A01(303, 9, 33));
            String strA012 = A01(577, 22, 64);
            if (!jSONObject.has(strA012)) {
                this.A0J = EnumC0585Jx.A02;
            } else {
                this.A0J = jSONObject.optBoolean(strA012) ? EnumC0585Jx.A04 : EnumC0585Jx.A03;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(599, 8, 87));
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    int length = jSONArrayOptJSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        C0770Rf c0770Rf = new C0770Rf();
                        c0770Rf.A06(this.A0C, jSONArrayOptJSONArray.getJSONObject(i), this.A0D, this.A0L, i, length);
                        arrayList.add(new C1141cR(this.A0C, c0770Rf, (C03198t) null, this.A0E));
                    }
                    this.A0S = arrayList;
                }
            } catch (JSONException e2) {
                String fbadCommand = A0b;
                Log.e(fbadCommand, A01(312, 30, 2), e2);
            }
            this.A0T = true;
            this.A0U = A09();
            return;
        }
        throw new IllegalStateException(A01(519, 27, k.AppCompatTheme_windowFixedWidthMajor));
    }

    private boolean A09() {
        C0770Rf c0770Rf = this;
        boolean z = false;
        char c2 = !c0770Rf.A0W ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!TextUtils.isEmpty(c0770Rf.A0R.get(A01(250, 15, 2)))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0770Rf = c0770Rf;
                    if (!TextUtils.isEmpty(c0770Rf.A0R.get(A01(13, 5, 2)))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 4:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0W) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0770Rf = c0770Rf;
                    if (c0770Rf.A0G != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0W) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0770Rf = c0770Rf;
                    if (c0770Rf.A0H != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0770Rf = c0770Rf;
                    if (c0770Rf.A6j() != AdPlacementType.NATIVE_BANNER) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    public final int A0A() {
        return this.A00;
    }

    public final int A0B() {
        return this.A01;
    }

    public final int A0C() {
        return this.A02;
    }

    public final int A0D() {
        int i = this.A03;
        char c2 = i >= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i <= 100) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    return i;
            }
        }
    }

    public final int A0E() {
        return this.A05;
    }

    public final int A0F() {
        return this.A06;
    }

    public final int A0G() {
        return this.A07;
    }

    public final C0580Js A0H() {
        if (!A0f()) {
            return null;
        }
        return this.A0F;
    }

    public final C0580Js A0I() {
        if (!A0f()) {
            return null;
        }
        return this.A0H;
    }

    public final C0580Js A0J() {
        if (!A0f()) {
            return null;
        }
        return this.A0G;
    }

    public final C0581Jt A0K() {
        if (!A0f()) {
            return null;
        }
        A04();
        return this.A0I;
    }

    public final EnumC0585Jx A0L() {
        if (!A0f()) {
            return EnumC0585Jx.A02;
        }
        return this.A0J;
    }

    public final Long A0M() {
        if (!A0f()) {
            return -1L;
        }
        return Long.valueOf(this.A08);
    }

    public final String A0N() {
        if (!A0f()) {
            return null;
        }
        A04();
        return C0620Lj.A01(this.A0R.get(A01(373, 4, 23)));
    }

    public final String A0O() {
        if (!A0f()) {
            return null;
        }
        return this.A0K;
    }

    public final String A0P() {
        if (!A0f()) {
            return null;
        }
        return A01(224, 9, 92);
    }

    public final String A0Q() {
        return this.A0M;
    }

    public final String A0R() {
        if (!A0f()) {
            return null;
        }
        return this.A0O;
    }

    public final String A0S() {
        if (!A0f()) {
            return null;
        }
        return this.A0P;
    }

    @Nullable
    public final String A0T(String str) {
        if (!A0f()) {
            return null;
        }
        A04();
        return this.A0R.get(str);
    }

    public final List<C1141cR> A0U() {
        if (!A0f()) {
            return null;
        }
        return this.A0S;
    }

    public final void A0V() {
        C0770Rf c0770Rf = this;
        Iterator<C1141cR> it = null;
        List<C1141cR> list = c0770Rf.A0S;
        char c2 = list != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (!list.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    c0770Rf = c0770Rf;
                    it = c0770Rf.A0S.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    it = it;
                    it.next().unregisterView();
                    c2 = 4;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final void A0W(AnonymousClass12 anonymousClass12) {
        this.A0B = anonymousClass12;
    }

    public final void A0X(XI xi, AnonymousClass12 anonymousClass12, JW jw, Map<String, Object> map, InterfaceC0579Jr interfaceC0579Jr) {
        C0770Rf c0770Rf = this;
        int iA06 = 0;
        c0770Rf.A0C = xi;
        c0770Rf.A0B = anonymousClass12;
        c0770Rf.A0D = jw;
        c0770Rf.A0E = interfaceC0579Jr;
        JSONObject jSONObject = (JSONObject) map.get(A01(561, 4, 38));
        C03198t c03198t = (C03198t) map.get(A01(77, 10, k.AppCompatTheme_windowActionBar));
        char c2 = c03198t != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c03198t = c03198t;
                    iA06 = c03198t.A06();
                    c2 = 3;
                    break;
                case 3:
                    c0770Rf = c0770Rf;
                    xi = xi;
                    jw = jw;
                    jSONObject = jSONObject;
                    c0770Rf.A05 = iA06;
                    c0770Rf.A08(jSONObject, LX.A02(jSONObject, A01(485, 2, 41)));
                    if (!C01140j.A03(xi, c0770Rf, jw)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    xi.A0A().A40();
                    anonymousClass12.AAO(c0770Rf, new K5(AdErrorType.NO_FILL, A01(487, 7, 82)));
                    return;
                case 5:
                    iA06 = 200;
                    c2 = 3;
                    break;
                case 6:
                    anonymousClass12 = anonymousClass12;
                    if (anonymousClass12 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0770Rf = c0770Rf;
                    anonymousClass12 = anonymousClass12;
                    anonymousClass12.AAL(c0770Rf);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    public final void A0Y(Map<String, String> urlParams) {
        C0770Rf c0770Rf = this;
        AnonymousClass12 anonymousClass12 = null;
        HashMap map = null;
        char c2 = !c0770Rf.A0f() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0770Rf = c0770Rf;
                    if (!JQ.A14(c0770Rf.A0C)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    urlParams = urlParams;
                    if (!C0636Lz.A03(urlParams)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Log.e(A0b, A01(272, 31, 49));
                    return;
                case 6:
                    urlParams = urlParams;
                    map = new HashMap();
                    if (urlParams == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    urlParams = urlParams;
                    map = map;
                    map.putAll(urlParams);
                    c2 = '\b';
                    break;
                case '\b':
                    c0770Rf = c0770Rf;
                    LJ.A02(c0770Rf.A0C, A01(49, 12, 58));
                    anonymousClass12 = c0770Rf.A0B;
                    if (anonymousClass12 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0770Rf = c0770Rf;
                    anonymousClass12 = anonymousClass12;
                    anonymousClass12.AAK(c0770Rf);
                    c2 = '\n';
                    break;
                case '\n':
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0W) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0770Rf = c0770Rf;
                    map = map;
                    map.put(A01(187, 7, k.AppCompatTheme_windowFixedWidthMajor), String.valueOf(c0770Rf.A02));
                    map.put(A01(265, 7, k.AppCompatTheme_windowActionModeOverlay), String.valueOf(c0770Rf.A01));
                    c2 = '\f';
                    break;
                case '\f':
                    C0770Rf c0770Rf2 = c0770Rf;
                    AbstractC01100f abstractC01100fA00 = C01110g.A00(c0770Rf2.A0C, c0770Rf2.A0D, c0770Rf2.A0L, c0770Rf2.A09, map);
                    if (abstractC01100fA00 != null) {
                        try {
                            abstractC01100fA00.A0B();
                            return;
                        } catch (Exception e) {
                            Log.e(A0b, A01(194, 22, 27), e);
                            return;
                        }
                    }
                    return;
            }
        }
    }

    public final void A0Z(Map<String, String> map) {
        JW jw = this.A0D;
        if (jw != null) {
            jw.A80(this.A0L, map);
        }
    }

    public final void A0a(Map<String, String> map) {
        C0770Rf c0770Rf = this;
        HashMap map2 = null;
        AnonymousClass12 anonymousClass12 = null;
        char c2 = !c0770Rf.A0f() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0V) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 4:
                    c0770Rf = c0770Rf;
                    anonymousClass12 = c0770Rf.A0B;
                    if (anonymousClass12 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0770Rf = c0770Rf;
                    anonymousClass12 = anonymousClass12;
                    anonymousClass12.AAM(c0770Rf);
                    c2 = 6;
                    break;
                case 6:
                    map = map;
                    map2 = new HashMap();
                    if (map == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    map = map;
                    map2 = map2;
                    map2.putAll(map);
                    c2 = '\b';
                    break;
                case '\b':
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0W) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0770Rf = c0770Rf;
                    map2 = map2;
                    map2.put(A01(187, 7, k.AppCompatTheme_windowFixedWidthMajor), String.valueOf(c0770Rf.A02));
                    map2.put(A01(265, 7, k.AppCompatTheme_windowActionModeOverlay), String.valueOf(c0770Rf.A01));
                    c2 = '\n';
                    break;
                case '\n':
                    c0770Rf = c0770Rf;
                    if (!TextUtils.isEmpty(c0770Rf.A5k())) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 11:
                    c0770Rf = c0770Rf;
                    if (c0770Rf.A0D == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0W) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    c0770Rf = c0770Rf;
                    c0770Rf.A0C.A0A().A2Z();
                    c2 = 14;
                    break;
                case 14:
                    c0770Rf = c0770Rf;
                    map2 = map2;
                    c0770Rf.A0D.A87(c0770Rf.A5k(), map2);
                    c2 = 15;
                    break;
                case 15:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0h()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 16:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0i()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0770Rf = c0770Rf;
                    map = map;
                    map2 = map2;
                    c0770Rf.A07(map, map2);
                    c2 = 18;
                    break;
                case 18:
                    c0770Rf = c0770Rf;
                    c0770Rf.A0V = true;
                    c2 = 19;
                    break;
                case 19:
                    return;
            }
        }
    }

    public final void A0b(Map<String, String> map) {
        JW jw = this.A0D;
        if (jw != null) {
            jw.A8M(this.A0L, map);
        }
    }

    public final void A0c(Map<String, String> map) {
        JW jw = this.A0D;
        if (jw != null) {
            jw.A8N(this.A0L, map);
        }
    }

    public final boolean A0d() {
        return true;
    }

    public final boolean A0e() {
        C0770Rf c0770Rf = this;
        boolean z = false;
        char c2 = c0770Rf.A0f() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (c0770Rf.A09 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0f() {
        C0770Rf c0770Rf = this;
        boolean z = false;
        char c2 = c0770Rf.A0T ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0U) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0g() {
        return this.A0W;
    }

    public final boolean A0h() {
        C0770Rf c0770Rf = this;
        boolean z = false;
        char c2 = JQ.A0q(c0770Rf.A0C) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0f()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0Y) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0i() {
        C0770Rf c0770Rf = this;
        boolean z = false;
        char c2 = JQ.A0q(c0770Rf.A0C) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0f()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0Z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01130i, com.facebook.ads.redexgen.X.InterfaceC01180n
    public final String A5k() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01130i
    public final Collection<String> A61() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01130i
    public final EnumC01120h A6R() {
        return this.A0A;
    }

    public AdPlacementType A6j() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final void onDestroy() {
    }
}
