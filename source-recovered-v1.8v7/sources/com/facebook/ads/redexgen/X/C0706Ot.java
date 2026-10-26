package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Ot, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0706Ot {
    public static byte[] A09;
    public String A00;
    public String A01;
    public final C8C A02;
    public final JW A03;
    public final C0565Jd A04;
    public final Os A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;

    static {
        A04();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A09 = new byte[]{49, 38, 39, 39, 60, 61, 12, 48, 63, 58, 48, 56, 41, 22, 5, 22, 29, 7, 44, 22, 11, 7, 1, 18, 31, 94, 73, 72, 72, 83, 82, 99, 82, 93, 81, 89, 71, 76, 70, 125, 65, 67, 80, 70, 125, 81, 74, 77, 85, 125, 87, 82, 2, 4, 8, 0, 58, 9, 10, 4, 1, 113, 120, 107, 120, 113, 66, 126, 114, 112, 109, 113, 120, 105, 120, 55, 62, 45, 62, 55, 4, 53, 58, 54, 62, 90, 73, 90, 81, 75, 96, 75, 70, 79, 90};
    }

    public C0706Ot(C8C c8c, Os os, JW jw, Map<String, String> map, String str) {
        this.A02 = c8c;
        this.A05 = os;
        this.A03 = jw;
        this.A07 = map;
        this.A06 = str;
        this.A04 = new C0565Jd(this.A06, this.A03);
        this.A08 = JQ.A17(os.getContext());
    }

    private void A01() {
        HashMap map = new HashMap();
        map.put(A00(85, 10, 100), A00(52, 9, 62));
        A07(map);
    }

    private void A02() {
        this.A04.A02(EnumC0564Jc.A0W, null);
    }

    private void A03() {
        HashMap map = new HashMap();
        map.put(A00(85, 10, 100), A00(36, 16, k.AppCompatTheme_windowFixedWidthMinor));
        A07(map);
    }

    private void A05(String str) throws JSONException {
        HashMap map = new HashMap();
        map.put(A00(75, 10, 0), String.valueOf(str));
        HashMap map2 = new HashMap();
        map2.put(A00(85, 10, 100), A00(61, 14, 70));
        map2.put(A00(13, 11, 40), LX.A01(map));
        A07(map2);
    }

    private void A06(String str, float f, float f2) throws JSONException {
        HashMap map = new HashMap();
        map.put(A00(25, 11, 103), str);
        map.put(A00(24, 1, 60), String.valueOf(f));
        map.put(A00(12, 1, 11), String.valueOf(f2));
        HashMap map2 = new HashMap();
        map2.put(A00(85, 10, 100), A00(0, 12, 8));
        map2.put(A00(13, 11, 40), LX.A01(map));
        A07(map2);
    }

    private void A07(Map<String, String> map) {
        if (TextUtils.isEmpty(this.A06)) {
            return;
        }
        Map<String, String> data = this.A07;
        map.putAll(data);
        Map<String, String> data2 = C0707Ou.A01(this.A02, this.A00, this.A01);
        map.putAll(data2);
        this.A03.A8E(this.A06, map);
    }

    @JavascriptInterface
    public void initializeLogging(String str, String str2) {
        if (!this.A08) {
            return;
        }
        this.A00 = str;
        this.A01 = str2;
    }

    @JavascriptInterface
    public void logButtonClick(String str, float f, float f2) throws JSONException {
        if (!this.A08) {
            return;
        }
        A06(str, f, f2);
    }

    @JavascriptInterface
    public void logEndCardShowUp() {
        if (!this.A08) {
            return;
        }
        A03();
    }

    @JavascriptInterface
    public void logGameLoad() {
        if (!this.A08) {
            return;
        }
        A01();
    }

    @JavascriptInterface
    public void logLevelComplete(String str) throws JSONException {
        if (!this.A08) {
            return;
        }
        A05(str);
    }

    @JavascriptInterface
    public void onCTAClick() {
        A02();
        this.A05.A0A();
    }
}
