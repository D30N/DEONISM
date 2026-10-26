package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@SuppressLint({"HardcodedIPAddressUse"})
/* loaded from: assets/audience_network.dex */
public abstract class S9 implements KX {
    public static byte[] A0E;
    public static final Handler A0F;
    public static final C01230s A0G = null;

    @SuppressLint({"StaticFieldLeak"})
    public static final KY A0H = null;
    public static final String A0I;
    public View A00;

    @Nullable
    public InterfaceC01180n A01;
    public InterfaceC01180n A02;
    public C03188s A05;
    public KV A06;
    public AbstractC01190o A07;
    public final C01421l A08;
    public final JW A09;
    public final C01230s A0A;
    public final KY A0B;
    public final XI A0C;
    public volatile boolean A0D;
    public long A04 = -1;

    @Nullable
    public String A03 = null;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A0E = new byte[]{-95, -86, -78, -91, -82, -85, -86, -87, -95, -86, -80, 92, -91, -81, 92, -95, -87, -84, -80, -75, 110, -113, 64, -115, -113, -110, -123, 64, -127, -124, 64, -125, -127, -114, -124, -119, -124, -127, -108, -123, -109, 78, -126, -125, -124, -121, -116, -121, -110, -121, -115, -116, -53, -56, -37, -56, -58, -44, -42, -53, -52, -45, -58, -37, -32, -41, -52, -65, -62, -76, -73, -78, -57, -68, -64, -72, -78, -64, -58, -57, -70, -58, -54, -70, -56, -55, -87, -66, -62, -70, 80, 115, 112, Byte.MAX_VALUE, -125, 116, -127, 47, 120, -126, 47, 125, -124, 123, 123, 47, 126, 125, 47, -126, -125, 112, -127, -125, 80, 115, -61, -46, -53, -120, -111, -122, -107, -100, -109, -105, -120, -121, -126, -116, -121, -14, -2, -15, -3, 1, -15, -6, -17, 5, -21, -17, -19, -4, -4, -11, -6, -13, -104, -117, -105, -101, -117, -103, -102, -123, -113, -118, -99, -82, -106, -79, -82, -83, -90, 95, -96, -93, -96, -81, -77, -92, -79, 95, -77, -72, -81, -92, 109, -76, -73, 115, -76, -65, -59, -72, -76, -73, -52, 115, -58, -57, -76, -59, -57, -72, -73, -84, -87, -68, -87, -54, -27, -19, -16, -23, -24, -92, -8, -13, -92, -19, -14, -19, -8, -19, -27, -16, -19, -2, -23, -92, -57, -13, -13, -17, -19, -23, -47, -27, -14, -27, -21, -23, -10, -78, -121, -86, -89, -74, -70, -85, -72, 102, -86, -75, -85, -71, 102, -76, -75, -70, 102, -85, -66, -81, -71, -70, Byte.MIN_VALUE, 102, -16, -20, -31, -29, -27, -19, -27, -18, -12, -55, -28};
    }

    public abstract void A0L();

    public abstract void A0O(InterfaceC01180n interfaceC01180n, C03188s c03188s, C03168q c03168q, Map<String, Object> map);

    static {
        A09();
        M0.A02();
        A0I = S9.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public S9(XI xi, C01421l c01421l) {
        this.A0C = xi;
        this.A08 = c01421l;
        KY ky = A0H;
        if (ky != null) {
            this.A0B = ky;
        } else {
            this.A0B = new KY(this.A0C);
        }
        this.A0B.A0Q(this);
        C01230s c01230s = A0G;
        if (c01230s != null) {
            this.A0A = c01230s;
        } else {
            this.A0A = new C01230s();
        }
        try {
            CookieManager.getInstance();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.A0C);
            }
        } catch (Exception e) {
            Log.w(A0I, A07(201, 35, k.AppCompatTheme_windowActionModeOverlay), e);
        }
        DynamicLoaderFactory.makeLoader(this.A0C).getInitApi().onAdLoadInvoked(this.A0C);
        this.A09 = xi.A06();
        this.A0C.A0A().A4W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        S9 s9 = this;
        HashMap map = null;
        C03198t c03198tA05 = null;
        XJ xjA00 = null;
        JSONObject jSONObjectA05 = null;
        String strOptString = null;
        InterfaceC01180n interfaceC01180nA00 = null;
        String strA02 = null;
        s9.A01 = null;
        C03188s c03188s = s9.A05;
        C03168q c03168qA04 = c03188s.A04();
        String strA07 = A07(67, 0, 1);
        char c2 = c03168qA04 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    S9 s92 = s9;
                    K5 k5A02 = K5.A02(AdErrorType.NO_FILL, strA07);
                    s92.A0C.A0A().A4Y(k5A02.A04().getErrorCode(), A07(20, 22, 17));
                    s92.A07.A0G(k5A02);
                    return;
                case 3:
                    s9 = s9;
                    c03188s = c03188s;
                    c03168qA04 = c03168qA04;
                    strA02 = c03168qA04.A02();
                    interfaceC01180nA00 = s9.A0A.A00(c03188s.A05().A0D());
                    if (interfaceC01180nA00 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Log.e(A0I, A07(236, 24, 55) + strA02);
                    s9.A0M();
                    return;
                case 5:
                    s9 = s9;
                    interfaceC01180nA00 = interfaceC01180nA00;
                    if (s9.A08.A00() == interfaceC01180nA00.A6j()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    S9 s93 = s9;
                    K5 k5A022 = K5.A02(AdErrorType.INTERNAL_ERROR, strA07);
                    s93.A0C.A0A().A4Y(k5A022.A04().getErrorCode(), A07(160, 19, 48));
                    s93.A07.A0G(k5A022);
                    return;
                case 7:
                    s9 = s9;
                    c03188s = c03188s;
                    c03168qA04 = c03168qA04;
                    interfaceC01180nA00 = interfaceC01180nA00;
                    s9.A01 = interfaceC01180nA00;
                    c03198tA05 = c03188s.A05();
                    jSONObjectA05 = c03168qA04.A05();
                    if (jSONObjectA05 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    s9 = s9;
                    jSONObjectA05 = jSONObjectA05;
                    strOptString = jSONObjectA05.optString(A07(148, 10, 23));
                    s9.A0C.A0A().ADB(strOptString);
                    s9.A0C.A08(strOptString);
                    xjA00 = C8B.A00();
                    if (xjA00 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strOptString = strOptString;
                    xjA00 = xjA00;
                    xjA00.A08(strOptString);
                    c2 = '\n';
                    break;
                case '\n':
                    s9 = s9;
                    jSONObjectA05 = jSONObjectA05;
                    s9.A0C(jSONObjectA05.optJSONObject(A07(131, 17, 125)));
                    c2 = 11;
                    break;
                case 11:
                    s9 = s9;
                    c03168qA04 = c03168qA04;
                    c03198tA05 = c03198tA05;
                    jSONObjectA05 = jSONObjectA05;
                    map = new HashMap();
                    map.put(A07(197, 4, 57), jSONObjectA05);
                    map.put(A07(42, 10, 15), c03198tA05);
                    map.put(A07(260, 11, 113), s9.A08.A08);
                    map.put(A07(79, 11, 70), Long.valueOf(c03198tA05.A0C()));
                    map.put(A07(52, 15, 88), c03168qA04.A03());
                    if (s9.A06 != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    S9 s94 = s9;
                    String strA072 = A07(0, 20, 45);
                    K5 k5A023 = K5.A02(AdErrorType.UNKNOWN_ERROR, strA072);
                    s94.A0C.A0A().A4Y(k5A023.A04().getErrorCode(), strA072);
                    s94.A07.A0G(k5A023);
                    return;
                case '\r':
                    s9.A0O(interfaceC01180nA00, c03188s, c03168qA04, map);
                    return;
            }
        }
    }

    private final void A0B(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0C.A0A().A4Z(str != null);
        this.A04 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            A9Y(new K5(AdErrorType.API_NOT_SUPPORTED, A07(67, 0, 1)));
            return;
        }
        try {
            this.A06 = this.A08.A01(this.A0C, new KG(this.A0C, str, this.A08.A08, this.A08.A07), adExperienceType);
            this.A0B.A0P(this.A06);
        } catch (K6 e) {
            A9Y(K5.A03(e));
        }
    }

    private void A0C(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A03 = jSONObject.optString(A07(k.AppCompatTheme_windowFixedHeightMinor, 12, 20));
            C01250u.A0G(jSONObject);
        }
    }

    public final long A0D() {
        C03188s c03188s = this.A05;
        if (c03188s != null) {
            return c03188s.A03();
        }
        return -1L;
    }

    public final Handler A0E() {
        return A0F;
    }

    public final C03198t A0F() {
        C03188s c03188s = this.A05;
        if (c03188s == null) {
            return null;
        }
        return c03188s.A05();
    }

    @Nullable
    public final String A0G() {
        InterfaceC01180n interfaceC01180n = this.A02;
        if (interfaceC01180n == null) {
            return null;
        }
        return interfaceC01180n.A5k();
    }

    public final void A0H() {
        this.A0C.A0A().A2g(C0627Lq.A01(this.A04));
        if (this.A02 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A07(67, 12, 68), C0627Lq.A04(this.A04));
        new C0565Jd(this.A02.A5k(), this.A09).A02(EnumC0564Jc.A07, map);
    }

    public final void A0I() {
        S9 s9 = this;
        InterfaceC01180n interfaceC01180n = s9.A02;
        String strA07 = A07(k.AppCompatTheme_windowActionBarOverlay, 3, 83);
        char c2 = interfaceC01180n == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    S9 s92 = s9;
                    String strA072 = A07(90, 26, 0);
                    s92.A0C.A04().A83(strA07, C03008a.A0F, new C03018b(strA072));
                    AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
                    s92.A0C.A0A().A4Y(adErrorType.getErrorCode(), strA072);
                    s92.A07.A0G(K5.A02(adErrorType, adErrorType.getDefaultErrorMessage()));
                    s92.A0C.A0A().A4b();
                    return;
                case 3:
                    s9 = s9;
                    if (!s9.A0D) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    S9 s93 = s9;
                    String strA073 = A07(179, 18, 68);
                    s93.A0C.A04().A83(strA07, C03008a.A0C, new C03018b(strA073));
                    AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
                    s93.A0C.A0A().A4Y(adErrorType2.getErrorCode(), strA073);
                    s93.A07.A0G(K5.A02(adErrorType2, adErrorType2.getDefaultErrorMessage()));
                    s93.A0C.A0A().A4a();
                    return;
                case 5:
                    s9 = s9;
                    if (!TextUtils.isEmpty(s9.A02.A5k())) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    s9 = s9;
                    s9.A09.A8I(s9.A02.A5k());
                    c2 = 7;
                    break;
                case 7:
                    S9 s94 = s9;
                    s94.A0C.A0A().A4c();
                    s94.A0D = true;
                    s94.A0L();
                    return;
            }
        }
    }

    public final void A0J() {
        A0U(false);
    }

    public final void A0K() {
        String str = this.A03;
        if (str != null) {
            C01250u.A0D(str);
        }
    }

    public final synchronized void A0M() {
        A0F.post(new S7(this));
    }

    public final void A0N(InterfaceC01180n interfaceC01180n) {
        if (interfaceC01180n != null) {
            interfaceC01180n.onDestroy();
        }
    }

    public final void A0P(AbstractC01190o abstractC01190o) {
        this.A07 = abstractC01190o;
    }

    public void A0Q(@Nullable String str) {
        A0B(str, null);
    }

    public final void A0R(@Nullable String str) {
        A0Q(str);
    }

    public final void A0S(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A0B(str, adExperienceType);
    }

    public final void A0T(Map<String, Object> map) {
        S9 s9 = this;
        String clientToken = null;
        s9.A0C.A0A().A4V();
        Object obj = map.get(A07(197, 4, 57));
        char c2 = obj instanceof JSONObject ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    obj = obj;
                    clientToken = ((JSONObject) obj).optString(A07(158, 2, 43));
                    if (!TextUtils.isEmpty(clientToken)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    s9 = s9;
                    clientToken = clientToken;
                    new C0565Jd(clientToken, s9.A09).A02(EnumC0564Jc.A03, null);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0U(boolean z) {
        S9 s9 = this;
        char c2 = !z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    s9 = s9;
                    if (!s9.A0D) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    S9 s92 = s9;
                    s92.A0C.A0A().A4d();
                    s92.A0N(s92.A02);
                    s92.A00 = null;
                    s92.A0D = false;
                    return;
            }
        }
    }

    public final boolean A0V() {
        boolean z = false;
        C03188s c03188s = this.A05;
        char c2 = c03188s != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03188s = c03188s;
                    if (!c03188s.A0A()) {
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

    @Override // com.facebook.ads.redexgen.X.KX
    public final synchronized void A9Y(K5 k5) {
        A0E().post(new S8(this, k5));
    }

    @Override // com.facebook.ads.redexgen.X.KX
    public final synchronized void AB8(C1152cd c1152cd) {
        A0E().post(new S6(this, c1152cd));
    }
}
