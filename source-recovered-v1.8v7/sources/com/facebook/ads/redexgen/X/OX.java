package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OX {
    public static byte[] A05;
    public final OR A00;
    public final String A01;
    public final String A02;
    public final WeakReference<JW> A03;
    public final WeakReference<Y4> A04;

    static {
        A08();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A05 = new byte[]{97, 124, 112, 118, 101, 91, 96, 101, 112, 101, 118, 123, 114, 103, 18, 62, 36, 61, 53, 113, 63, 62, 37, 113, 33, 48, 35, 34, 52, 113, 34, 52, 35, 39, 52, 35, 113, 60, 52, 34, 34, 48, 54, 52, 41, 61, 60, 32, 3, 45, 49, 50, 33, 58, 58, 49, 56, 11, 32, 45, 36, 49, 124, 75, 75, 86, 75, 25, 73, 88, 75, 74, 80, 87, 94, 25, 115, 106, 118, 119, 25, 80, 87, 25, 73, 86, 74, 77, 116, 92, 74, 74, 88, 94, 92, 25, 92, 80, 82, 82, 94, 81, 91};
    }

    public OX(Y4 y4, JW jw, OR or, String str, String str2) {
        this.A04 = new WeakReference<>(y4);
        this.A03 = new WeakReference<>(jw);
        this.A00 = or;
        this.A01 = str;
        this.A02 = str2;
    }

    public static Map<String, String> A01(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    itKeys = itKeys;
                    if (!itKeys.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONObject = jSONObject;
                    itKeys = itKeys;
                    map = map;
                    String next = itKeys.next();
                    String key = jSONObject.optString(next);
                    map.put(next, key);
                    c2 = 2;
                    break;
                case 4:
                    return map;
            }
        }
    }

    private void A02() {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0L();
    }

    private void A03() {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0M();
    }

    private void A04() {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0N();
    }

    private void A05() {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0P();
    }

    private void A06() {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0Q();
    }

    private void A07() {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0R();
    }

    private void A09(OW ow, String str) throws JSONException {
        char c2;
        OX ox = this;
        switch (OV.A00[ow.ordinal()]) {
            case 1:
                c2 = 3;
                break;
            case 2:
                c2 = 4;
                break;
            case 3:
                c2 = 5;
                break;
            case 4:
                c2 = 6;
                break;
            case 5:
                c2 = 7;
                break;
            case 6:
                c2 = '\b';
                break;
            case 7:
                c2 = '\t';
                break;
            case 8:
                c2 = '\n';
                break;
            case 9:
                c2 = 11;
                break;
            case 10:
                c2 = '\f';
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ox = ox;
                    str = str;
                    ox.A0A(new JSONObject(str));
                    c2 = 2;
                    break;
                case 4:
                    ox = ox;
                    ox.A06();
                    c2 = 2;
                    break;
                case 5:
                    ox = ox;
                    ox.A02();
                    c2 = 2;
                    break;
                case 6:
                    ox = ox;
                    ox.A04();
                    c2 = 2;
                    break;
                case 7:
                    ox = ox;
                    ox.A03();
                    c2 = 2;
                    break;
                case '\b':
                    ox = ox;
                    ox.A07();
                    c2 = 2;
                    break;
                case '\t':
                    ox = ox;
                    str = str;
                    ox.A0B(new JSONObject(str));
                    c2 = 2;
                    break;
                case '\n':
                    ox = ox;
                    str = str;
                    ox.A0C(new JSONObject(str));
                    c2 = 2;
                    break;
                case 11:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case '\f':
                    ox = ox;
                    ox.A05();
                    c2 = 2;
                    break;
            }
        }
    }

    private void A0A(JSONObject jSONObject) {
        String strOptString = null;
        Y4 y4 = this.A04.get();
        char c2 = y4 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jSONObject = jSONObject;
                    strOptString = jSONObject.optString(A00(96, 7, 30));
                    if (!TextUtils.isEmpty(strOptString)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    y4 = y4;
                    y4.A0O();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    y4 = y4;
                    strOptString = strOptString;
                    y4.A0S(strOptString);
                    c2 = 5;
                    break;
            }
        }
    }

    private void A0B(JSONObject jSONObject) {
        Y4 y4 = this.A04.get();
        if (y4 == null) {
            return;
        }
        y4.A0T(A01(jSONObject));
    }

    private void A0C(JSONObject jSONObject) {
        String strOptString = null;
        JW jw = this.A03.get();
        char c2 = jw == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jSONObject = jSONObject;
                    strOptString = jSONObject.optString(A00(51, 11, k.AppCompatTheme_windowActionModeOverlay));
                    if (!TextUtils.isEmpty(strOptString)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    new C0565Jd(this.A02, jw).A03(strOptString, A01(jSONObject));
                    return;
            }
        }
    }

    @JavascriptInterface
    public void postMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!this.A01.equals(jSONObject.optString(A00(44, 7, 105)))) {
                this.A00.A04(C03008a.A0p, A00(14, 30, 112));
            } else {
                A09(OW.A00(jSONObject.optString(A00(10, 4, 35))), jSONObject.optString(A00(0, 10, 37)));
            }
        } catch (JSONException e) {
            this.A00.A04(C03008a.A0r, A00(62, 34, 24) + e.getMessage());
        }
    }
}
