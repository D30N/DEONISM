package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.protocol.AdErrorType;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0671Nj extends WebViewClient {
    public static byte[] A0A;
    public Date A00;
    public boolean A01 = false;
    public final XI A02;
    public final WeakReference<C1004aC> A03;
    public final WeakReference<InterfaceC0669Nh> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<C0628Lr> A06;
    public final WeakReference<Q1> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0A = new byte[]{104, 49, 112, 124, 119, 118, 49, 51, 41, 51, 49, 109, 80, 92, 90, 73, 8, 76, 73, 92, 73, 18, 8, 117, 123, 119, 117, 34, 37, 59, 117, 119, 109, 119, 117, 35, 57, 21, 61, 47, 40, 21, 56, 47, 57, 37, 63, 56, 41, 47, 21, 47, 56, 56, 37, 56, 12, 27, 27, 6, 27, 54, 10, 6, 13, 12, 51, 61, 49, 51, 117, 116, 98, 114, 99, 120, 97, 101, 120, 126, Byte.MAX_VALUE, 51, 49, 43, 49, 51, 91, 76, 88, 92, 76, 90, 93, 118, 64, 77, 1, 2, 12, 9, 4, 3, 10, 50, 25, 4, 0, 8, 50, 4, 3, 50, 0, 4, 1, 1, 4, 30, 68, 86, 81, 108, 69, 90, 86, 68, 42, 61, 61, 32, 61, 16, 43, 42, 60, 44, 61, 38, 63, 59, 38, 32, 33, 46, 113, 54, 61, 44, 98, 98, 29, 10, 10, 7, 29, 21, 8, 12, 1, 7, 10, 29, 11, 8, 23, 22, 11, 29};
    }

    public C0671Nj(XI xi, WeakReference<InterfaceC0669Nh> weakReference, WeakReference<Q1> weakReference2, WeakReference<C0628Lr> weakReference3, WeakReference<AtomicBoolean> weakReference4, WeakReference<C1004aC> weakReference5, AtomicInteger atomicInteger, AtomicReference<String> atomicReference) {
        this.A02 = xi;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = weakReference4;
        this.A03 = weakReference5;
        this.A08 = atomicInteger;
        this.A09 = atomicReference;
    }

    @VisibleForTesting
    public static String A01(int i, String str, String str2) {
        return A00(0, 11, 86) + i + A00(66, 20, 84) + str + A00(23, 12, 18) + str2 + A00(143, 2, 73);
    }

    private void A03(int i, CharSequence charSequence, long j) throws JSONException {
        boolean z = false;
        JSONObject jSONObject = new JSONObject();
        char c2 = charSequence != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 4;
                    break;
                case 3:
                    z = false;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        jSONObject.put(A00(56, 10, 44), i);
                        jSONObject.put(A00(126, 17, 10), charSequence);
                        jSONObject.put(A00(35, 21, 15), z);
                        jSONObject.put(A00(96, 22, 40), j);
                        jSONObject.put(A00(86, 10, 108), this.A09.get());
                    } catch (JSONException unused) {
                    }
                    this.A02.A04().A83(A00(k.AppCompatTheme_windowFixedHeightMajor, 8, k.AppCompatTheme_windowFixedHeightMajor), C03008a.A24, new C03018b(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A00(11, 12, 109) + jSONObject.toString()));
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, @Nullable String str) throws JSONException {
        C0671Nj c0671Nj = this;
        char c2 = A00(145, 23, 29).equals(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0671Nj.A02.A0A().ADs();
                    return;
                case 3:
                    c0671Nj = c0671Nj;
                    str = str;
                    c0671Nj.A02.A0A().ADt(i, str);
                    c0671Nj.A03(i, str, new Date().getTime() - c0671Nj.A00.getTime());
                    if (c0671Nj.A04.get() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0671Nj = c0671Nj;
                    str = str;
                    c0671Nj.A04.get().A9c(i, str);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C0671Nj c0671Nj = this;
        boolean z = false;
        C0S c0sA0A = c0671Nj.A02.A0A();
        char c2 = c0671Nj.A03.get() != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c0671Nj = c0671Nj;
                    c0sA0A = c0sA0A;
                    c0sA0A.ADu(z);
                    if (c0671Nj.A03.get() == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0671Nj = c0671Nj;
                    if (c0671Nj.A05.get() == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0671Nj = c0671Nj;
                    if (!c0671Nj.A05.get().get()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c0671Nj = c0671Nj;
                    c0671Nj.A03.get().A04();
                    c2 = 7;
                    break;
                case 7:
                    c0671Nj.A01 = true;
                    return;
                case '\b':
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0A().ADv();
        this.A00 = new Date();
        new Handler().postDelayed(new C1007aF(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) throws JSONException {
        this.A01 = true;
        A04(i, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
        C0671Nj c0671Nj = this;
        boolean zA0j = JQ.A0j(c0671Nj.A02);
        String strA00 = A00(23, 0, 32);
        char c2 = zA0j ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0671Nj = c0671Nj;
                    webResourceError = webResourceError;
                    strA00 = strA00;
                    c0671Nj.A01 = true;
                    c0671Nj.A04(webResourceError.getErrorCode(), strA00 + ((Object) webResourceError.getDescription()));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0671Nj = c0671Nj;
                    webResourceRequest = webResourceRequest;
                    webResourceError = webResourceError;
                    strA00 = strA00;
                    c0671Nj.A02.A0A().ADw(A01(webResourceError.getErrorCode(), strA00 + ((Object) webResourceError.getDescription()), strA00 + webResourceRequest.getUrl()));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0A().ADx();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().A9A(str, new C0676No().A03(this.A07.get()).A02(this.A06.get()).A05());
            return true;
        }
        return true;
    }
}
