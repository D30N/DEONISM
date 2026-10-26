package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class MF {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{43, 22, 13, 11, 30, 26, 7, 1, 0, 78, 7, 0, 78, 29, 13, 28, 11, 11, 0, 78, 7, 0, 26, 11, 28, 15, 13, 26, 7, 24, 11, 78, 13, 6, 11, 13, 5, 66, 78, 15, 29, 29, 27, 3, 7, 0, 9, 78, 7, 0, 26, 11, 28, 15, 13, 26, 7, 24, 11, 64, 75, 80, 74, 82, 64, 111, 112, 104, 122, 109};
    }

    static {
        A01();
        A01 = MF.class.getSimpleName();
    }

    public static boolean A02(XI xi) {
        boolean z = false;
        char c2 = A03(xi) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    xi = xi;
                    if (!MG.A03(xi)) {
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

    public static boolean A03(XI xi) {
        PowerManager powerManager = null;
        char c2 = xi == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    try {
                        powerManager = (PowerManager) xi.getSystemService(A00(65, 5, 57));
                        if (Build.VERSION.SDK_INT < 20) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    } catch (Exception e) {
                        Log.e(A01, A00(0, 60, 72), e);
                        xi.A04().A83(A00(60, 5, 31), C03008a.A1v, new C03018b(e));
                        return true;
                    }
                case '\b':
                    return powerManager.isInteractive();
                case '\n':
                    return powerManager.isScreenOn();
            }
        }
    }
}
