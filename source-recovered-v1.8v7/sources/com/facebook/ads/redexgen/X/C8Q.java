package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import d.b.a.b.k;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8Q implements Thread.UncaughtExceptionHandler {
    public static byte[] A05;
    public final XJ A00;
    public final C8P A01;
    public final C8X A02;
    public final Thread.UncaughtExceptionHandler A03;
    public final Map<String, String> A04;

    static {
        A01();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{-50, Byte.MAX_VALUE, -35, -33, -52, -34, -29, -38, -49, -22, -20, -39, -21, -16, -25, -36, -42, -38, -26, -37, -36, -97, -82, -99, -81, -92, -84, -72, -74, 119, -81, -86, -84, -82, -85, -72, -72, -76, 119, -86, -83, -68, -18, 10, 20, 20, 10, 15, 8, -63, -28, 16, 15, 21, 6, 25, 21};
    }

    public C8Q(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, XJ xj, C8P c8p) {
        this(uncaughtExceptionHandler, xj, c8p, C8Y.A00());
    }

    public C8Q(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, XJ xj, C8P c8p, C8X c8x) {
        this.A03 = uncaughtExceptionHandler;
        if (xj != null) {
            this.A00 = xj;
            this.A04 = c8p.A71(xj);
            this.A01 = c8p;
            this.A02 = c8x;
            return;
        }
        throw new IllegalArgumentException(A00(42, 15, k.AppCompatTheme_windowFixedWidthMajor));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A03;
        char c2 = uncaughtExceptionHandler != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    thread = thread;
                    th = th;
                    uncaughtExceptionHandler = uncaughtExceptionHandler;
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    A02();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C8O c8o;
        try {
            String strA03 = C0618Lh.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03) && strA03.contains(A00(26, 16, 32))) {
                Map<String, String> mapA5a = this.A01.A5a();
                if (mapA5a != null) {
                    c8o = new C8O(strA03, mapA5a);
                } else {
                    Map<String, String> crashReportDataDataMap = this.A04;
                    c8o = new C8O(strA03, crashReportDataDataMap);
                }
                Map<String, String> mapA02 = c8o.A02();
                mapA02.put(A00(2, 7, 65), A00(21, 5, 19));
                Throwable thA00 = AbstractRunnableC0596Kj.A00();
                String strA00 = A00(9, 12, 78);
                if (thA00 == th) {
                    mapA02.put(strA00, A00(0, 1, k.AppCompatTheme_windowActionBarOverlay));
                } else {
                    mapA02.put(strA00, A00(1, 1, 38));
                }
                C03048e report = new C03048e(this.A00.A05().A01(), this.A00.A05().A02(), mapA02);
                this.A02.AE1(report, this.A00);
                if (JQ.A15(this.A00)) {
                    JQ.A0X(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
