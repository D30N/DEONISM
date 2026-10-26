package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.media.AudioManager;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0631Lu {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{Byte.MAX_VALUE, 110, 105, 107, 110, 105, 98, 55, 76, 88, 89, 66, 93, 65, 76, 84, 59, 47, 62, 51, 53};
    }

    public static float A00(Context context) {
        int maxVolume = 0;
        int streamVolume = 0;
        AudioManager audioManager = (AudioManager) context.getSystemService(A01(16, 5, 7));
        int volume = audioManager != null ? 2 : 4;
        while (true) {
            switch (volume) {
                case 2:
                    audioManager = audioManager;
                    streamVolume = audioManager.getStreamVolume(3);
                    maxVolume = audioManager.getStreamMaxVolume(3);
                    if (maxVolume <= 0) {
                        volume = 4;
                        break;
                    } else {
                        volume = 3;
                        break;
                    }
                case 3:
                    return (streamVolume * 1.0f) / maxVolume;
                case 4:
                    return 0.0f;
            }
        }
    }

    public static void A03(Map<String, String> map, boolean z, boolean z2) {
        String str = null;
        String strA01 = A01(0, 1, 19);
        String strA012 = A01(7, 1, 90);
        char c2 = z ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    strA01 = strA01;
                    str = strA01;
                    c2 = 3;
                    break;
                case 3:
                    map = map;
                    str = str;
                    map.put(A01(8, 8, 112), str);
                    if (!z2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map.put(A01(1, 6, 90), strA01);
                    return;
                case 5:
                    strA012 = strA012;
                    strA01 = strA012;
                    c2 = 4;
                    break;
                case 6:
                    strA012 = strA012;
                    str = strA012;
                    c2 = 3;
                    break;
            }
        }
    }
}
