package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 {
    public static String A00;
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicReference<String> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 112);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A01 = new byte[]{20, 65, 55, 69, 66, 60, 55, 29, 27, 13, 26, 7, 9, 15, 13, 22, 28, 40, 38, 24, 37, 18, 20, 26, 24, 33, 39, 18, 31, 20, 38, 39, 18, 37, 24, 25, 37, 24, 38, 27, -40, -15, -18, -15, -14, -6, -15, 9, 5, 15, 6, -14, 2, -2, -3, 10, -21, -3, 49, 32, 37, 33, 42, 31, 33, 10, 33, 48, 51, 43, 46, 39, 2, 43, 46, -3, 42, 32, 46, 43, 37, 32, -9, -46, -53, -31, -48, -41, -50, -50, 32, 28, 27, 28, 9, 65, -8, 45, 57, 55, -8, 48, 43, 45, 47, 44, 57, 57, 53, -8, 43, 46, 61, -8, 51, 56, 62, 47, 60, 56, 43, 54, -8, 63, 43, -49, -53, -53, -33, -72, -17, -35, -38, -41, -18, -31, -35, -17, -12, -16, 1, 4, -35, -26, -30, -10, -13, -49, 15, 11, 28, 23, -8, 68, 80, 80, 76, 10, 61, 67, 65, 74, 80, 11, 9, 18, 9, 22, 13, 7, -80, -21, 41, 37, 36, 57, 18};
    }

    static {
        A08();
        A00 = A00(40, 7, 19);
        A02 = new AtomicBoolean();
        A03 = new AtomicReference<>();
    }

    @VisibleForTesting
    @TargetApi(17)
    public static String A01(C8C c8c) {
        return WebSettings.getDefaultUserAgent(c8c);
    }

    @SuppressLint({"CatchGeneralException"})
    @Nullable
    public static String A02(final C8C c8c) {
        String str = null;
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.97
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                AnonymousClass97 anonymousClass97 = this;
                String resultUA = null;
                String str2 = (String) AnonymousClass98.A03.get();
                char c2 = str2 != null ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return str2;
                        case 3:
                            anonymousClass97 = anonymousClass97;
                            WebView webView = new WebView(c8c.getApplicationContext());
                            resultUA = webView.getSettings().getUserAgentString();
                            webView.destroy();
                            if (resultUA == null) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            resultUA = resultUA;
                            AnonymousClass98.A03.set(resultUA);
                            c2 = 5;
                            break;
                        case 5:
                            return resultUA;
                    }
                }
            }
        });
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= 3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    futureTask = futureTask;
                    ExecutorC0630Lt.A00(futureTask);
                    c2 = 4;
                    break;
                case 4:
                    try {
                        futureTask = futureTask;
                        str = (String) futureTask.get();
                        c2 = '\b';
                        break;
                    } catch (Throwable th) {
                        A09(c8c, th);
                        SystemClock.sleep(500L);
                        i++;
                        c2 = 2;
                        break;
                    }
                case '\b':
                    return str;
                case '\t':
                    return (String) null;
            }
        }
    }

    public static String A03(C8C c8c, C03108k c03108k) {
        String strA06 = c03108k.A06();
        char c2 = TextUtils.isEmpty(strA06) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!A02.getAndSet(true)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c8c = c8c;
                    c8c.A04().A83(A00(163, 7, 52), C03008a.A1F, new C03018b(A00(83, 7, 18)));
                    c2 = 4;
                    break;
                case 4:
                    return strA06;
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Nullable
    public static String A04(C8C c8c, boolean z) {
        C8C c8c2 = c8c;
        long jA01 = 0;
        long userAgentRefreshTimeMs = 0;
        String strA02 = null;
        String strA00 = null;
        int i = 0;
        String str = null;
        String strA002 = null;
        String string = null;
        long j = 0;
        String strA003 = null;
        C8C c8c3 = c8c2;
        char c2 = c8c3 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A00;
                case 3:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return System.getProperty(A00(153, 10, 108));
                case 5:
                    str = A03.get();
                    if (str == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return str;
                case 7:
                    c8c2 = c8c2;
                    jA01 = JP.A01(c8c2);
                    strA003 = A00(17, 23, 67);
                    strA002 = A00(7, 10, 56);
                    i = 0;
                    strA00 = A00(97, 28, 90);
                    userAgentRefreshTimeMs = 0;
                    if (jA01 <= 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c8c3 = c8c3;
                    strA003 = strA003;
                    strA002 = strA002;
                    strA00 = strA00;
                    i = 0;
                    SharedPreferences sharedPreferences = c8c3.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA00, c8c3), 0);
                    string = sharedPreferences.getString(strA002, null);
                    j = sharedPreferences.getLong(strA003, userAgentRefreshTimeMs);
                    if (!TextUtils.isEmpty(string)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\t':
                    if (System.currentTimeMillis() - j >= jA01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    String str2 = string;
                    A03.set(str2);
                    return str2;
                case 11:
                    strA02 = null;
                    if (Build.VERSION.SDK_INT >= 17) {
                        try {
                            strA02 = A01(c8c2);
                            A03.set(strA02);
                        } catch (Throwable th) {
                            A09(c8c3, th);
                        }
                    }
                    if (strA02 != null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c8c2 = c8c2;
                    strA02 = A02(c8c2);
                    c2 = 18;
                    break;
                case 18:
                    if (strA02 != null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return A00;
                case 20:
                    if (jA01 <= userAgentRefreshTimeMs) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c8c3 = c8c3;
                    strA003 = strA003;
                    strA002 = strA002;
                    strA00 = strA00;
                    SharedPreferences sharedPreferences2 = c8c3.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA00, c8c3), i);
                    sharedPreferences2.edit().putString(strA002, A03.get()).apply();
                    sharedPreferences2.edit().putLong(strA003, System.currentTimeMillis()).apply();
                    c2 = 22;
                    break;
                case 22:
                    return strA02;
            }
        }
    }

    public static String A05(C03108k c03108k, C8C c8c) {
        if (JP.A04(c8c)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A00(90, 5, 106));
            sb.append(A03(c8c, c03108k));
            String strA00 = A00(96, 1, 77);
            sb.append(strA00);
            sb.append(A00(172, 5, k.AppCompatTheme_windowActionBar));
            sb.append(c03108k.A05());
            sb.append(strA00);
            sb.append(A00(125, 5, 25));
            sb.append(c03108k.A03());
            sb.append(strA00);
            return sb.toString();
        }
        return A00(7, 0, 67);
    }

    public static String A06(C03108k c03108k, C8C c8c, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(A04(c8c, z));
        sb.append(A00(170, 2, 32));
        sb.append(A00(52, 31, 76));
        sb.append(A00(148, 5, 89));
        sb.append(A00(0, 7, 99));
        String strA00 = A00(96, 1, 77);
        sb.append(strA00);
        sb.append(A00(138, 5, 62));
        sb.append(C03108k.A02);
        sb.append(strA00);
        sb.append(A05(c03108k, c8c));
        sb.append(A00(143, 5, 48));
        sb.append(BuildConfigApi.getVersionName(c8c));
        sb.append(strA00);
        sb.append(A00(47, 5, 83));
        sb.append(Locale.getDefault().toString());
        sb.append(A00(95, 1, k.AppCompatTheme_windowActionBarOverlay));
        return sb.toString();
    }

    public static void A09(C8C c8c, Throwable th) {
        c8c.A04().A83(A00(130, 8, 8), C03008a.A25, new C03018b(th));
    }
}
