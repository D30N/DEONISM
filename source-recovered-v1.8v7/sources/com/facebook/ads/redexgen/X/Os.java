package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* loaded from: assets/audience_network.dex */
public final class Os extends FrameLayout {
    public static byte[] A0C;
    public static final float A0D;
    public static final RelativeLayout.LayoutParams A0E;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass17 A03;
    public final C1T A04;
    public final XI A05;
    public final JW A06;
    public final InterfaceC0669Nh A07;
    public final C1004aC A08;
    public final InterfaceC0704Oq A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A0C = new byte[]{16, 25, 22, 16, 24, 32, -8, 20, 9, 33, 9, 10, 20, 13, -56, 12, 23, -21, 28, 9, -21, 20, 17, 11, 19, -56, 28, 26, 17, 15, 15, 13, 26, 13, 12, -56, 31, 17, 28, 16, -56, 24, 26, 13, -43, 13, 30, 13, 22, 28, -56, 11, 20, 17, 11, 19, 27, -56, 11, 23, 29, 22, 28, -56, 9, 22, 12, -56, -20, 13, 20, 9, 33, -16, -20, -31, -7, -31, -30, -20, -27, 16, 44, 33, 57, 33, 34, 44, 37, 1, 36, 51, 22, 41, 37, 55, 78, 60, 57, 54, 77, 64, 60, 78, -33, -16, 1, 2, -8, -3, -10, -81, -12, 1, 1, -2, 1, 23, 51, 33, 61, 50, 74, 50, 51, 61, 54, 18, 53, 63, 64, 71, 60, 84};
    }

    static {
        A09();
        A0D = (int) (C0635Ly.A01 * 4.0f);
        A0E = new RelativeLayout.LayoutParams(-1, -1);
    }

    public Os(XI xi, AnonymousClass17 anonymousClass17, C1T c1t, JW jw, InterfaceC0704Oq interfaceC0704Oq, Map<String, String> map) {
        super(xi);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC1009aH() { // from class: com.facebook.ads.redexgen.X.82
            @Override // com.facebook.ads.redexgen.X.InterfaceC0669Nh
            public final void A8u() {
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1009aH, com.facebook.ads.redexgen.X.InterfaceC0669Nh
            public final void A9c(int i, @Nullable String str) {
                this.A00.A0B.set(true);
                this.A00.A09.AA9();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1009aH, com.facebook.ads.redexgen.X.InterfaceC0669Nh
            public final void A9j() {
                AnonymousClass82 anonymousClass82 = this;
                char c2 = !anonymousClass82.A00.A0B.get() ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            anonymousClass82 = anonymousClass82;
                            if (!anonymousClass82.A00.A0A.compareAndSet(false, true)) {
                                c2 = 4;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            anonymousClass82 = anonymousClass82;
                            anonymousClass82.A00.A09.A9j();
                            c2 = 4;
                            break;
                        case 4:
                            return;
                    }
                }
            }
        };
        this.A05 = xi;
        this.A03 = anonymousClass17;
        this.A04 = c1t;
        this.A06 = jw;
        this.A09 = interfaceC0704Oq;
        this.A02 = map;
        this.A08 = A04();
        addView(this.A08, A0E);
    }

    public static /* synthetic */ int A00(Os os) {
        int i = os.A00;
        os.A00 = i + 1;
        return i;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private C1004aC A04() {
        C1004aC c1004aC = new C1004aC(this.A05, new WeakReference(this.A07), 10);
        c1004aC.setCornerRadius(A0D);
        c1004aC.setLogMultipleImpressions(false);
        c1004aC.setCheckAssetsByJavascriptBridge(false);
        c1004aC.setWebViewTimeoutInMillis(this.A04.A08());
        c1004aC.setRequestId(this.A03.A0T());
        c1004aC.setOnTouchListener(new ViewOnTouchListenerC0705Or(this));
        WebSettings settings = c1004aC.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c1004aC.addJavascriptInterface(new C0706Ot(this.A05, this, this.A06, this.A02, this.A03.A0P()), A06(k.AppCompatTheme_windowActionModeOverlay, 12, 98));
        }
        return c1004aC;
    }

    public final void A0A() {
        Os os = this;
        String strA06 = null;
        long jCurrentTimeMillis = System.currentTimeMillis() - os.A01;
        C03018b c03018b = new C03018b(A06(6, 67, 57));
        JSONObject jSONObject = new JSONObject();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        jSONObject.put(A06(0, 6, 62), os.A00);
                        jSONObject.put(A06(129, 5, 108), jCurrentTimeMillis);
                    } catch (JSONException e) {
                        Log.e(A06(81, 15, 81), A06(104, 13, 32), e);
                    }
                    c03018b.A05(jSONObject);
                    C8Z c8zA04 = os.A05.A04();
                    int i = C03008a.A1i;
                    strA06 = A06(73, 8, 17);
                    c8zA04.A84(strA06, i, c03018b);
                    os.A00 = 0;
                    if (!JQ.A10(os.A05)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    os = os;
                    if (jCurrentTimeMillis > JQ.A0E(os.A05)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    os = os;
                    os.A09.A9H();
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    os = os;
                    c03018b = c03018b;
                    strA06 = strA06;
                    os.A05.A04().A83(strA06, C03008a.A1j, c03018b);
                    c2 = 11;
                    break;
                case '\r':
                    os = os;
                    os.A09.A9H();
                    c2 = 11;
                    break;
            }
        }
    }

    public final void A0B() {
        Os os = this;
        String strA0B = null;
        C1004aC c1004aC = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    os = os;
                    c1004aC = os.A08;
                    if (TextUtils.isEmpty(os.A04.A0B())) {
                        c2 = 11;
                        continue;
                    } else {
                        c2 = 7;
                    }
                case 7:
                    os = os;
                    strA0B = os.A04.A0B();
                    c2 = '\n';
                    continue;
                case '\n':
                    c1004aC.loadUrl(strA0B);
                    return;
                case 11:
                    try {
                        os = os;
                        strA0B = os.A04.A0E();
                        c2 = '\n';
                        continue;
                    } catch (Exception e) {
                        os.A05.A04().A83(A06(96, 8, 104), C03008a.A24, new C03018b(e));
                        return;
                    }
            }
            os.A05.A04().A83(A06(96, 8, 104), C03008a.A24, new C03018b(e));
            return;
        }
    }

    public final void A0C() {
        this.A08.removeJavascriptInterface(A06(k.AppCompatTheme_windowActionModeOverlay, 12, 98));
        this.A08.destroy();
    }

    public C0628Lr getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public Q1 getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
