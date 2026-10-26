package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum K8 {
    A06,
    A02,
    A03,
    A04,
    A05;

    public static byte[] A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{4, 11, 30, 3, 28, 15, 64, 71, 93, 76, 91, 90, 93, 64, 93, 64, 72, 69, 96, 119, 101, 115, 96, 118, 119, 118, 109, 100, 123, 118, 119, 125, 102, 101, 106, 106, 97, 118, 101, 126, 123, 126, Byte.MAX_VALUE, 103, 126};
    }

    static {
        A02();
    }

    public static K8 A00(KB kb) {
        char c2;
        switch (kb) {
            case A06:
                c2 = 3;
                break;
            case A0A:
                c2 = 4;
                break;
            case A0B:
                c2 = 4;
                break;
            case A0C:
                c2 = 4;
                break;
            case A09:
                c2 = 4;
                break;
            case A0D:
                c2 = 5;
                break;
            case A0G:
                c2 = 5;
                break;
            case A0E:
                c2 = 5;
                break;
            case A0F:
                c2 = 5;
                break;
            case A07:
                c2 = 6;
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    return A06;
                case 3:
                    return A04;
                case 4:
                    return A02;
                case 5:
                    return A03;
                case 6:
                    return A05;
            }
        }
    }

    public final AdPlacementType A03() {
        int i = K7.A00[ordinal()];
        char c2 = i != 1 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 4) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return AdPlacementType.UNKNOWN;
                case 6:
                    return AdPlacementType.REWARDED_VIDEO;
                case 7:
                    return AdPlacementType.NATIVE;
                case '\b':
                    return AdPlacementType.BANNER;
                case '\t':
                    return AdPlacementType.INTERSTITIAL;
            }
        }
    }
}
