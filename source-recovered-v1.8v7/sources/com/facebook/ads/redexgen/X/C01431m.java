package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01431m {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{44, 43, 37, 56, 34, 39, 45, 30, 32, 43, 26, 45, 34, 40, 39, 56, 30, 43, 43, 40, 43, 56, 38, 40, 29, 30, 56, 36, 30, 50};
    }

    public static AdSettings.IntegrationErrorMode A00(XI xi) {
        AdSettings.IntegrationErrorMode integrationErrorMode = (AdSettings.IntegrationErrorMode) AdInternalSettings.sSettingsBundle.getSerializable(A01(0, 30, 96));
        char c2 = integrationErrorMode == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                    c2 = 3;
                    break;
                case 3:
                    integrationErrorMode = integrationErrorMode;
                    if (integrationErrorMode != AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    xi = xi;
                    if (!A03(xi)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE;
                    c2 = 6;
                    break;
                case 6:
                    return integrationErrorMode;
            }
        }
    }

    public static boolean A03(XI xi) {
        boolean z = false;
        char c2 = (xi.getApplicationInfo().flags & 2) != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
