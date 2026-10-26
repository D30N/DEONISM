package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1004aC extends AbstractC0666Ne {
    public static byte[] A0D;
    public static final String A0E;
    public float A00;
    public C0628Lr A01;

    @DoNotStrip
    public Q0 A02;

    @Nullable
    public Q1 A03;
    public boolean A04;
    public final Path A05;
    public final RectF A06;
    public final XI A07;
    public final WeakReference<InterfaceC0669Nh> A08;
    public final AtomicBoolean A09;
    public final AtomicBoolean A0A;
    public final AtomicInteger A0B;
    public final AtomicReference<String> A0C;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0D = new byte[]{11, 46, 9, 37, 36, 62, 56, 37, 38};
    }

    static {
        A05();
        A0E = C1004aC.class.getSimpleName();
    }

    public C1004aC(XI xi, WeakReference<InterfaceC0669Nh> weakReference, int i) {
        super(xi);
        this.A09 = new AtomicBoolean();
        this.A0A = new AtomicBoolean(true);
        this.A05 = new Path();
        this.A06 = new RectF();
        this.A0B = new AtomicInteger(5000);
        this.A0C = new AtomicReference<>();
        this.A01 = new C0628Lr();
        this.A04 = true;
        this.A07 = xi;
        this.A08 = weakReference;
        this.A02 = new C1010aI(this);
        this.A03 = new Q1(this, i, new WeakReference(this.A02), this.A07);
        setWebChromeClient(A09());
        setWebViewClient(A0A());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        if (Build.VERSION.SDK_INT > 16) {
            addJavascriptInterface(new C0668Ng(this, weakReference.get(), this.A03, this.A09, this.A0A, this.A07), A02(0, 9, 64));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A07.A0A().ADm();
        this.A09.set(true);
        new Handler(Looper.getMainLooper()).post(new C1008aG(this.A03));
    }

    @VisibleForTesting
    private final boolean A07() {
        return this.A09.get();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne
    public final WebChromeClient A09() {
        return new C0670Ni();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne
    public final WebViewClient A0A() {
        return new C0671Nj(this.A07, this.A08, new WeakReference(this.A03), new WeakReference(this.A01), new WeakReference(this.A0A), new WeakReference(this), this.A0B, this.A0C);
    }

    public final void A0B(int i, int i2) {
        Q1 q1 = this.A03;
        if (q1 != null) {
            q1.A0X(i);
            this.A03.A0Y(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0666Ne, android.webkit.WebView
    public final void destroy() {
        Q1 q1 = this.A03;
        if (q1 != null) {
            q1.A0W();
            this.A03 = null;
        }
        C0635Ly.A0M(this);
        this.A02 = null;
        this.A01 = null;
        C0672Nk.A03(this);
        super.destroy();
    }

    public C0628Lr getTouchDataRecorder() {
        return this.A01;
    }

    public Q1 getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A06.set(0.0f, 0.0f, getWidth(), getHeight());
            this.A05.reset();
            Path path = this.A05;
            RectF rectF = this.A06;
            float f = this.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.A05);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A01.A06(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        C1004aC c1004aC = this;
        super.onWindowVisibilityChanged(i);
        char c2 = c1004aC.A08.get() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1004aC = c1004aC;
                    c1004aC.A08.get();
                    c2 = 3;
                    break;
                case 3:
                    c1004aC = c1004aC;
                    if (c1004aC.A03 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c1004aC = c1004aC;
                    c1004aC.A07.A0A().ADy(i);
                    if (i != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1004aC = c1004aC;
                    if (!c1004aC.A07()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1004aC = c1004aC;
                    c1004aC.A03.A0V();
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    if (i != 8) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1004aC = c1004aC;
                    c1004aC.A03.A0W();
                    c2 = '\b';
                    break;
            }
        }
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.A0A.set(z);
    }

    public void setCornerRadius(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z) {
        this.A04 = z;
    }

    public void setRequestId(String str) {
        this.A0C.set(str);
    }

    public void setWebViewTimeoutInMillis(int i) {
        if (i >= 0) {
            this.A0B.set(i);
        }
    }
}
