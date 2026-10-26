package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03228x {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final AtomicBoolean A03;
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A02 = new byte[]{-13, -17, -18, 34, 17, 22, 18, 27, 16, 18, -5, 18, 33, 36, 28, 31, 24, -1, 14, 7, -30, -25, -30, -19, -30, -38, -27, -30, -13, -34, -21, 1, 7, -78, -10, 1, 0, -71, 6, -78, -11, -13, -2, -2, -78, -45, 7, -10, -5, -9, 0, -11, -9, -32, -9, 6, 9, 1, 4, -3, -45, -10, 5, -64, -5, 0, -5, 6, -5, -13, -2, -5, 12, -9, -70, -69, -64, -78, -27, 1, -1, -9, -78, -8, 7, 0, -11, 6, -5, 1, 0, -13, -2, -5, 6, 11, -78, -1, -13, 11, -78, 0, 1, 6, -78, 9, 1, 4, -3, -78, 2, 4, 1, 2, -9, 4, -2, 11, -64, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 44, 42, 51, 42, 55, 46, 40, -29, -44, -37, -80, -7, -2, -7, 4, -7, -15, -4, -7, 10, -15, 4, -7, -1, -2, -80, 3, 4, -15, 2, 4, -11, -12, -92, -42, -93, -91, -90, -87, -87, -14, 3, 10, -65, 22, 0, 18, -65, 0, 11, 17, 4, 0, 3, 24, -65, 8, 13, 8, 19, 8, 0, 11, 8, 25, 4, 3, -64, -65, -14, 10, 8, 15, 15, 8, 13, 6, -51};
    }

    static {
        A04();
        A05 = new AtomicBoolean();
        A03 = new AtomicBoolean();
        A04 = new AtomicBoolean();
    }

    public static InterfaceC0599Km A00() {
        return new C0920Xc();
    }

    public static L2 A01(XJ xj) {
        return new C0921Xd(xj);
    }

    public static void A05(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC0630Lt.A01.execute(new C0919Xb(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(XJ xj) {
        if (JR.A0O(xj) && !A04.getAndSet(true)) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(new C8Q(Thread.getDefaultUncaughtExceptionHandler(), xj, new C0923Xf()));
            } catch (Exception e) {
                xj.A04().A83(A02(143, 7, 97), C03008a.A1E, new C03018b(e));
            }
        }
    }

    public static void A08(XJ xj) {
        A0G(xj, null, null, 3);
    }

    public static void A09(XJ xj) {
        A0G(xj, null, null, 3);
    }

    public static void A0A(XJ xj) {
        if (JQ.A1C(xj)) {
            A0F(xj, 0);
            A0C(xj);
        }
    }

    public static void A0B(XJ xj) {
        if (JQ.A1D(xj)) {
            A0H(xj, null, null, 3);
        }
    }

    public static void A0C(XJ xj) {
        M3.A05.execute(new C0918Xa(xj));
    }

    public static void A0D(XJ xj) {
        C8U.A0C(xj, new C0924Xg(xj), new C0925Xh(), BuildConfigApi.isDebug());
        C1121c6.A01(xj);
        C02485q.A04(xj, null);
    }

    public static void A0F(XJ xj, int i) {
        C8B.A01(xj);
        char c2 = A03.getAndSet(true) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (!AdInternalSettings.isDebugBuild()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    if (!AdInternalSettings.isDebuggerOn()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    KJ.A02();
                    c2 = 6;
                    break;
                case 6:
                    xj = xj;
                    A07(xj);
                    C0611Kz.A00(JQ.A0f(xj), BuildConfigApi.isDebug(), A00(), A01(xj));
                    C02415j.A03(JQ.A02(xj));
                    QO.A09(new C0922Xe(xj));
                    if (i != 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    xj = xj;
                    Log.e(A02(0, 17, 73), A02(30, 89, 46));
                    xj.A04().A8H(A02(17, 3, 58), C03008a.A0G, new C03018b(A02(k.AppCompatTheme_windowFixedHeightMinor, 24, 0)));
                    c2 = '\b';
                    break;
                case '\b':
                    XJ xj2 = xj;
                    LC.A03(xj2);
                    M3.A05(xj2);
                    C0568Jg.A03(xj2);
                    C01250u.A0C(xj2);
                    return;
            }
        }
    }

    public static void A0G(XJ xj, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        KJ.A05(A02(20, 10, 21), A02(150, 26, 44), A02(176, 7, 12));
        QO.A06();
        A0H(xj, multithreadedBundleWrapper, initListener, i);
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0H(XJ xj, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C8B.A01(xj);
        boolean z = false;
        synchronized (C03228x.class) {
            if (!A00) {
                if (i != 1 && i != 2) {
                    if (i == 3 && !A01) {
                        A01 = true;
                        z = true;
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0F(xj, i);
            M3.A07.execute(new XZ(xj, multithreadedBundleWrapper, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String strA02 = A02(183, 38, 59);
            if (initListener != null) {
                A05(initListener, new C03218w(true, strA02));
            } else {
                Log.w(A02(0, 17, 73), strA02);
            }
        }
    }

    public static synchronized boolean A0I() {
        return A00;
    }
}
