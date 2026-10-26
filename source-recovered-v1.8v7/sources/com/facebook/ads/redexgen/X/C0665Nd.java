package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0665Nd extends WebViewClient {
    public static byte[] A02;
    public final WeakReference<XI> A00;
    public final WeakReference<InterfaceC0663Nb> A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowMinWidthMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{24, 35, 38, 35, 34, 58, 35, 109, 40, 53, 46, 40, 61, 57, 36, 34, 35, 109, 34, 46, 46, 56, 63, 63, 40, 41, 109, 58, 37, 40, 35, 109, 57, 63, 52, 36, 35, 42, 109, 57, 34, 109, 37, 44, 35, 41, 33, 40, 109, 24, 31, 4, 99, 42, 37, 47, 57, 36, 34, 47, 101, 34, 37, 63, 46, 37, 63, 101, 42, 40, 63, 34, 36, 37, 101, 29, 2, 14, 28, 51, 17, 6, 27, 4, 27, 6, 11, 82, 28, 29, 6, 82, 20, 29, 7, 28, 22, 82, 6, 29, 82, 26, 19, 28, 22, 30, 23, 82, 39, 32, 59, 92};
    }

    public C0665Nd(WeakReference<InterfaceC0663Nb> weakReference, WeakReference<XI> weakReference2) {
        this.A01 = weakReference;
        this.A00 = weakReference2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.A01.get() != null) {
            this.A01.get().AAQ(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.A01.get() != null) {
            this.A01.get().AAS(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        if (!C1011aJ.A09.contains(uri.getScheme()) && this.A00.get() != null) {
            try {
                return LA.A0B(this.A00.get(), new Intent(A00(53, 26, 49), uri));
            } catch (ActivityNotFoundException e) {
                Log.w(C1011aJ.A08, A00(79, 33, 8), e);
                return false;
            } catch (Exception e2) {
                Log.e(C1011aJ.A08, A00(0, 53, 55), e2);
                return false;
            }
        }
        return false;
    }
}
