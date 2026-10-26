package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0636Lz {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-74, 114, 97, 110, 114, 103, 102, 96, 116, 98, 112, 92, 109, 95, 114, 97, 95, 102, 98, 83, 81, 84, 68, 49, 45, 56};
    }

    static {
        A01();
        A01 = C0636Lz.class.getSimpleName();
    }

    public static boolean A02(Context context) {
        boolean z = false;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(A00(6, 8, k.AppCompatTheme_windowNoTitle));
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

    public static boolean A03(Map<String, String> map) {
        String flagShowWhenLocked = null;
        String keyguardRestrictedInputMode = null;
        String str = null;
        String str2 = null;
        char c2 = map != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    if (!map.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    map = map;
                    str2 = map.get(A00(14, 5, k.AppCompatTheme_windowNoTitle));
                    str = map.get(A00(1, 5, k.AppCompatTheme_windowNoTitle));
                    String flagShowWhenLocked2 = map.get(A00(23, 3, 71));
                    flagShowWhenLocked = flagShowWhenLocked2;
                    if (str2 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str2 = str2;
                    keyguardRestrictedInputMode = A00(0, 1, 6);
                    if (!str2.equals(keyguardRestrictedInputMode)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    str = str;
                    if (str == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    str = str;
                    keyguardRestrictedInputMode = keyguardRestrictedInputMode;
                    if (!str.equals(keyguardRestrictedInputMode)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    flagShowWhenLocked = flagShowWhenLocked;
                    if (flagShowWhenLocked == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    flagShowWhenLocked = flagShowWhenLocked;
                    if (!flagShowWhenLocked.equals(A00(19, 4, 96))) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return true;
                case 11:
                    return false;
            }
        }
    }

    public static boolean A04(Map<String, String> map) {
        String flagShowWhenLocked = null;
        String strA00 = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        char c2 = map != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    if (!map.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    map = map;
                    str2 = map.get(A00(14, 5, k.AppCompatTheme_windowNoTitle));
                    str = map.get(A00(1, 5, k.AppCompatTheme_windowNoTitle));
                    strA00 = A00(0, 1, 6);
                    if (str2 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str2 = str2;
                    strA00 = strA00;
                    if (!str2.equals(strA00)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    str = str;
                    if (str == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    str = str;
                    strA00 = strA00;
                    if (!str.equals(strA00)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    map = map;
                    String flagShowWhenLocked2 = map.get(A00(23, 3, 71));
                    flagShowWhenLocked = flagShowWhenLocked2;
                    if (flagShowWhenLocked == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    flagShowWhenLocked = flagShowWhenLocked;
                    if (!flagShowWhenLocked.equals(A00(19, 4, 96))) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z = true;
                    c2 = '\f';
                    break;
                case '\f':
                    return z;
            }
        }
    }
}
