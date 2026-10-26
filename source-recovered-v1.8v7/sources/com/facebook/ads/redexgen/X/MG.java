package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class MG {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{58, 107, 122, 111, 107, 112, 49, 42, 48, 40, 58, 18, 28, 0, 30, 12, 24, 11, 29, 104, 2, 19, 17, 30, 18, 114, 79, 84, 82, 71, 67, 94, 88, 89, 23, 94, 89, 23, 64, 94, 89, 83, 88, 64, 23, 94, 89, 81, 88, 23, 84, 95, 82, 84, 92, 50, 62, 43, 22, 21};
    }

    static {
        A02();
        A01 = MG.class.getSimpleName();
    }

    public static Map<String, String> A01(XI xi) {
        Window window;
        String str = null;
        String strA00 = null;
        String flagDismissKeyguardEnabled = null;
        int i = 0;
        HashMap map = new HashMap();
        char c2 = xi == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    break;
                case 3:
                    try {
                        map.put(A00(55, 3, 87), String.valueOf(A04(xi)));
                        Activity activityA09 = xi.A09();
                        if (activityA09 == null || (window = activityA09.getWindow()) == null) {
                            break;
                        } else {
                            i = window.getAttributes().flags;
                            int flags = window.getAttributes().type;
                            map.put(A00(58, 2, 111), Integer.toString(flags));
                            int i2 = 4194304 & i;
                            strA00 = A00(0, 1, 5);
                            flagDismissKeyguardEnabled = A00(19, 1, 86);
                            c2 = i2 > 0 ? (char) 19 : (char) 20;
                        }
                    } catch (Exception e) {
                        Log.e(A01, A00(25, 30, 57), e);
                        C8Z c8zA04 = xi.A04();
                        int type = C03008a.A1w;
                        c8zA04.A83(A00(6, 5, 77), type, new C03018b(e));
                        break;
                    }
                    break;
                case 19:
                    strA00 = strA00;
                    str = strA00;
                    c2 = 21;
                case 20:
                    flagDismissKeyguardEnabled = flagDismissKeyguardEnabled;
                    str = flagDismissKeyguardEnabled;
                    c2 = 21;
                case 21:
                    map.put(A00(20, 5, k.AppCompatTheme_windowMinWidthMinor), str);
                    c2 = (524288 & i) > 0 ? (char) 25 : (char) 24;
                case 24:
                    flagDismissKeyguardEnabled = flagDismissKeyguardEnabled;
                    strA00 = flagDismissKeyguardEnabled;
                    c2 = 25;
                case 25:
                    map.put(A00(1, 5, 18), strA00);
                    break;
            }
            return map;
        }
        return map;
    }

    public static boolean A03(XI xi) {
        return !C0636Lz.A04(A01(xi));
    }

    public static boolean A04(XI xi) {
        boolean z = false;
        KeyguardManager keyguardManager = (KeyguardManager) xi.getSystemService(A00(11, 8, k.AppCompatTheme_windowFixedHeightMinor));
        char c2 = keyguardManager != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    keyguardManager = keyguardManager;
                    if (!keyguardManager.inKeyguardRestrictedInputMode()) {
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
}
