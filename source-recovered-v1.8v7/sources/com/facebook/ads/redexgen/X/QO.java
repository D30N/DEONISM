package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class QO {

    @Nullable
    public static Q4 A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A01 = new byte[]{20, 90, 90, 27, 40, 19, 36, 60, 86, 53, 21, 82, 59, 24, 79, 81, 71, 78, 21, 75, 90, 83, 21, 56, 82, 86, 78, 32, -19, 74, 69, 48, 8, 29, 40, 68, 40, 64, 25, 15, 38, 11, 44, 44, 43, 58, 25, 70, 37, 72, 28, 30, 14, 66, 60, 39, 19, -32, -30, -28, -30, -45, -64, -21, -8, -28, -20, -18, -43, -16, -75, -2, -21, -33, -36, -18, -8, 3, -33, -46, -65, -13, -6, -15, -41, -57, -108, 7, -2, 13, 16, 8, 11, 4, 58, 66, 75, 73, 69, 58, 71, 62, 56, 70, 72, 61, 62, 56, 72, 71, -50, -27, -12, -9, -17, -14, -21, -23, -18, -25, -96, -30, -27, -26, -17, -14, -27, -96, -23, -18, -23, -12, -95, -40, -58, -50, -25, 10, -37, -54, 15, -30, -39, -6, 2, -1, -54, 8, 6, 10, 15, 7, -41, -37, -7, 16, -18, -27, -5, -41, -45, -96, -42, 27, 10, -77, -20, -53, -10, -22, -50, -13, -26, -19, -14, -18, -85, -41, -19, -26, -60, -24, -10, -14, -78, -23, -42, -24, -81, -7, -46, -13, -67, -118};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(0, 29, 101));
        A03.add(A05(29, 29, 88));
        A03.add(A05(165, 29, 2));
        A03.add(A05(133, 29, 24));
        A03.add(A05(58, 29, 12));
        A04 = new AtomicBoolean();
    }

    public static Q6 A00(C8C c8c) {
        return A03(true, c8c);
    }

    public static Q6 A01(C8C c8c) {
        return A02(true, c8c);
    }

    public static Q6 A02(boolean z, C8C c8c) {
        QA qa = new QA();
        QD qdA04 = A04(c8c);
        char c2 = !A0A() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    qa = qa;
                    qa.A02(A03);
                    qa.A01(A02);
                    c2 = 3;
                    break;
                case 3:
                    if (!LH.A04()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    qdA04 = qdA04;
                    qdA04.A08(LH.A02());
                    c2 = 5;
                    break;
                case 5:
                    return Q8.A00().A01(qa.A00(qdA04.A09()).A03(z).A04(BuildConfigApi.isDebug()).A05(), c8c.A04(), M3.A01());
            }
        }
    }

    public static Q6 A03(boolean z, C8C c8c) {
        return Q8.A00().A01(new QA().A03(z).A00(A04(c8c).A09()).A04(BuildConfigApi.isDebug()).A05(), c8c.A04(), M3.A01());
    }

    public static QD A04(C8C c8c) {
        A08(c8c);
        QD qd = new QD();
        if (A0A()) {
            qd.A02(360000).A04(120000);
        } else {
            qd.A02(JQ.A06(c8c));
        }
        qd.A03(JQ.A07(c8c)).A04(JQ.A08(c8c)).A05(JQ.A09(c8c)).A06(JQ.A0A(c8c));
        synchronized (QO.class) {
            if (A00 != null && (A00 instanceof Q4)) {
                qd.A07(A00);
            }
        }
        return qd;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(C8C c8c) {
        if (!A04.get()) {
            c8c.A04().A83(A05(87, 7, 27), C03008a.A1X, new C03018b(A05(110, 23, 2)));
        }
    }

    public static synchronized void A09(Q4 q4) {
        A00 = q4;
    }

    public static boolean A0A() {
        boolean z = false;
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        char c2 = !TextUtils.isEmpty(urlPrefix) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    urlPrefix = urlPrefix;
                    if (!urlPrefix.endsWith(A05(162, 3, 42))) {
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

    public static boolean A0B(C8C c8c) {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        String strA05 = A05(94, 16, 91);
        char c2 = i < 17 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c8c = c8c;
                    strA05 = strA05;
                    if (Settings.System.getInt(c8c.getContentResolver(), strA05, 0) == 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
                case 5:
                    c8c = c8c;
                    strA05 = strA05;
                    if (Settings.Global.getInt(c8c.getContentResolver(), strA05, 0) == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }
}
