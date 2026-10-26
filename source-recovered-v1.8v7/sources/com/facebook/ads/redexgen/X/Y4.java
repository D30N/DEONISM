package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.dynamiclayout.DynamicFullScreenAdView$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class Y4 extends FrameLayout implements MR {
    public static byte[] A0L;
    public InterfaceC02284v A00;

    @Nullable
    public C02304x A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass17 A05;
    public final C7C A06;
    public final XI A07;
    public final JW A08;
    public final C0565Jd A09;
    public final ViewOnSystemUiVisibilityChangeListenerC0623Lm A0A;
    public final C0628Lr A0B;
    public final MQ A0C;
    public final InterfaceC0657Mv A0D;
    public final AbstractC0666Ne A0E;
    public final OR A0F;

    @DoNotStrip
    public final Q0 A0G;
    public final Q1 A0H;
    public final String A0I;
    public final LinkedList<String> A0J;
    public final JSONObject A0K;

    static {
        A0C();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0C() {
        A0L = new byte[]{113, 116, 66, 117, 96, Byte.MAX_VALUE, 98, 100, 121, 126, 119, 67, 100, 113, 98, 100, 117, 116, 56, 55, 53, 99, 55, 57, 43, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, 25, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 52, 34, 51, 5, 38, 52, 34, 113, 115, 6, 52, 52, 34, 51, 52, 111, 96, 98, 52, 96, 107, 96, 98, 52, 96, 110, 37, 58, 54, 36, 1, 54, 50, 55, 42, 7, 60, 0, 59, 60, 36, 123, 116, 118, 32, 116, 122, 104, 54, 45, 58, 45, 50, 100, 75, 65, 87, 74, 76, 65, 108, 75, 81, 64, 87, 67, 68, 70, 64, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 48, 15, 25, 8, 61, 9, 8, 20, 55, 25, 5, 84, 91, 89, 15, 91, 80, 91, 89, 15, 91, 85, 71, 83, 86, 96, 87, 66, 93, 64, 70, 91, 92, 85, 116, 91, 92, 91, 65, 90, 87, 86, 26, 21, 23, 65, 21, 27, 9};
    }

    public Y4(XI xi, JW jw, MQ mq, AnonymousClass17 anonymousClass17, InterfaceC0657Mv interfaceC0657Mv, @DynamicFullScreenAdView$AdFormatType int i) {
        super(xi);
        this.A00 = new YH(this);
        this.A0J = new LinkedList<>();
        this.A0B = new C0628Lr();
        this.A0G = new YE(this);
        this.A04 = true;
        this.A03 = false;
        this.A02 = true;
        this.A07 = xi;
        this.A08 = jw;
        this.A0C = mq;
        this.A05 = anonymousClass17;
        this.A0D = interfaceC0657Mv;
        this.A0I = UUID.randomUUID().toString();
        this.A06 = new C7C(this.A07);
        this.A09 = new C0565Jd(this.A05.A0P(), this.A08);
        this.A0F = new OR(anonymousClass17.A0T(), this.A05.A0L().A0D().A08(), i);
        this.A0K = OY.A01(this.A07, this.A05.A0X(), this.A06, this.A09, this.A0F);
        this.A0E = new Y8(this, this.A07);
        C0635Ly.A0J(1003, this.A0E);
        this.A0H = new Q1(this.A0E, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0X(this.A05.A0F());
        this.A0H.A0Y(this.A05.A0G());
        this.A0A = new ViewOnSystemUiVisibilityChangeListenerC0623Lm(this);
        this.A0A.A05(EnumC0622Ll.A02);
    }

    private void A0B() {
        C0689Ob c0689ObA0B = new OZ(this.A07, this.A05.A0L().A0E(), this.A05.A0N()).A08(this.A05.A0K().A01()).A0B();
        addView(c0689ObA0B, new FrameLayout.LayoutParams(-1, -1));
        c0689ObA0B.A04(new Y9(this));
    }

    @SuppressLint({"AddJavascriptInterface"})
    private final void A0D() {
        if (Build.VERSION.SDK_INT > 16) {
            this.A0E.addJavascriptInterface(new OX(this, this.A08, this.A0F, this.A0I, this.A05.A0P()), A09(102, 16, 69));
        }
        this.A09.A02(EnumC0564Jc.A0N, null);
        this.A0E.loadUrl(this.A06.A0K(this.A05.A0Q()));
        A0I(String.format(Locale.US, A09(142, 22, 28), this.A0I, A09(97, 5, 99)));
        A0I(String.format(Locale.US, A09(49, 26, 39), Base64.encodeToString(this.A0K.toString().getBytes(), 0).replace(A09(141, 1, 90), A09(75, 0, 73)), this.A0I));
        addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3K(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0A.A05(EnumC0622Ll.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public synchronized void A0E() {
        if (this.A03) {
            while (!this.A0J.isEmpty()) {
                this.A09.A02(EnumC0564Jc.A0K, null);
                this.A0E.evaluateJavascript(this.A0J.poll(), null);
            }
        }
    }

    private void A0H(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new C0683Nv(this.A07, this.A0D.A5j(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A05.A0P(), str, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0I(String str) {
        this.A0J.offer(str);
        A0E();
    }

    public final void A0L() {
        C02304x c02304x = this.A01;
        if (c02304x == null) {
            return;
        }
        c02304x.finish(4);
    }

    public final void A0M() {
        this.A04 = true;
    }

    public final void A0N() {
        this.A04 = false;
    }

    public final void A0O() {
        A0H(this.A05.A0L().A0F().A04());
    }

    public final void A0P() {
        this.A0C.A3r(this.A0D.A5F());
        new C0711Oy(this.A07, this.A0D, this.A05.A0U(), this.A0C).A05();
    }

    public final void A0Q() {
        new Handler(Looper.getMainLooper()).post(new YB(this));
    }

    public final void A0R() {
        this.A0H.A0V();
    }

    public final void A0S(String str) {
        A0H(str);
    }

    public final void A0T(Map<String, String> map) {
        this.A08.A82(this.A05.A0P(), new C0676No(map).A03(this.A0H).A05());
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, @Nullable Bundle bundle, C02304x c02304x) {
        Y4 y4 = this;
        c02304x.A0K(y4.A00);
        y4.A01 = c02304x;
        y4.A0D();
        char c2 = y4.A05.A0L().A0O() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    y4 = y4;
                    y4.A0B();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    y4 = y4;
                    if (!TextUtils.isEmpty(y4.A05.A0L().A0D().A08())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 5:
                    y4 = y4;
                    y4.A0I(String.format(Locale.US, A09(75, 22, 51), y4.A0I));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        Y4 y4 = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    y4 = y4;
                    y4.A0I(String.format(Locale.US, A09(0, 25, 112), y4.A0I));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    y4 = y4;
                    y4.A0I(String.format(Locale.US, A09(k.AppCompatTheme_windowFixedHeightMajor, 23, k.AppCompatTheme_windowFixedHeightMinor), y4.A0I));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        Y4 y4 = this;
        int i = 0;
        char c2 = y4.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    y4.A02 = false;
                    return;
                case 3:
                    i = 1;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    y4 = y4;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[i];
                    objArr[0] = y4.A0I;
                    y4.A0I(String.format(locale, A09(164, 26, 82), objArr));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    y4 = y4;
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = y4.A0I;
                    y4.A0I(String.format(locale2, A09(25, 24, 43), objArr2));
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        this.A0A.A03();
        this.A08.A81(this.A05.A0P(), new C0676No().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A01 = null;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(MQ mq) {
    }
}
