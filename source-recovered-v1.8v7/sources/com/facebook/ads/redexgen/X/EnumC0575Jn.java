package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0575Jn {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-25, -24, -25, -34, 104, 115, 115};
    }

    static {
        A02();
    }

    EnumC0575Jn(long j, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC0575Jn A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC0575Jn enumC0575Jn = null;
        EnumC0575Jn[] enumC0575JnArrValues = values();
        int length = enumC0575JnArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    mediaCacheFlag = mediaCacheFlag;
                    enumC0575JnArrValues = enumC0575JnArrValues;
                    enumC0575Jn = enumC0575JnArrValues[i];
                    if (enumC0575Jn.A01 != mediaCacheFlag) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return enumC0575Jn;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return (EnumC0575Jn) null;
            }
        }
    }
}
