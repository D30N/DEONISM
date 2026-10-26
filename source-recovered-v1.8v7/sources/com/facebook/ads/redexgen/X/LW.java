package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum LW {
    A0H(0),
    A0G(1),
    A0F(2),
    A0J(3),
    A0I(4),
    A09(5, NativeAdBase.NativeComponentTag.AD_ICON),
    A0E(6, NativeAdBase.NativeComponentTag.AD_TITLE),
    A08(7, NativeAdBase.NativeComponentTag.AD_COVER_IMAGE),
    A0D(8, NativeAdBase.NativeComponentTag.AD_SUBTITLE),
    A05(9, NativeAdBase.NativeComponentTag.AD_BODY),
    A06(10, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION),
    A0C(11, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT),
    A07(12, NativeAdBase.NativeComponentTag.AD_CHOICES_ICON),
    A0A(13, NativeAdBase.NativeComponentTag.AD_MEDIA),
    A0B(12, NativeAdBase.NativeComponentTag.AD_OPTIONS_VIEW);

    public static int A02;
    public static byte[] A03;
    public final int A00;
    public final NativeAdBase.NativeComponentTag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-9, -4, 2, -13, 0, -4, -17, -6, 13, -17, -14, 13, 1, -3, -15, -9, -17, -6, 13, -15, -3, -4, 2, -13, 6, 2, 33, 38, 44, 29, 42, 38, 25, 36, 55, 25, 28, 55, 26, 39, 28, 49, -14, -9, -3, -18, -5, -9, -22, -11, 8, -22, -19, 8, -8, -7, -3, -14, -8, -9, -4, 8, -1, -14, -18, 0, -14, -9, -3, -18, -5, -9, -22, -11, 8, -22, -19, 8, -14, -20, -8, -9, 24, 29, 35, 20, 33, 29, 16, 27, 46, 29, 30, 46, 35, 16, 22, 30, 35, 41, 26, 39, 35, 22, 33, 52, 22, 25, 52, 34, 26, 25, 30, 22, -71, -66, -60, -75, -62, -66, -79, -68, -49, -79, -64, -71, -49, -60, -65, -65, -49, -68, -65, -57, -57, -52, -46, -61, -48, -52, -65, -54, -35, -52, -51, -35, -63, -54, -57, -63, -55, 23, 28, 34, 19, 32, 28, 15, 26, 45, 15, 18, 45, 17, 29, 36, 19, 32, 45, 23, 27, 15, 21, 19, 40, 45, 51, 36, 49, 45, 32, 43, 62, 32, 35, 62, 51, 40, 51, 43, 36, 4, 9, 15, 0, 13, 9, -4, 7, 26, 9, 16, 7, 7, 26, 17, 4, 0, 18, -69, -64, -58, -73, -60, -64, -77, -66, -47, -55, -60, -63, -64, -71, -47, -58, -77, -71, -47, -75, -66, -77, -59, -59, 47, 52, 58, 43, 56, 52, 39, 50, 69, 39, 42, 69, 41, 46, 53, 47, 41, 43, 57, 69, 47, 41, 53, 52, -52, -47, -41, -56, -43, -47, -60, -49, -30, -60, -57, -30, -42, -40, -59, -41, -52, -41, -49, -56, -22, -17, -11, -26, -13, -17, -30, -19, 0, -30, -27, 0, -28, -30, -19, -19, 0, -11, -16, 0, -30, -28, -11, -22, -16, -17};
    }

    static {
        A02();
        A02 = -1593835521;
    }

    LW(int i) {
        this.A00 = i;
        this.A01 = null;
    }

    LW(int i, NativeAdBase.NativeComponentTag nativeComponentTag) {
        this.A00 = i;
        this.A01 = nativeComponentTag;
    }

    public static LW A00(NativeAdBase.NativeComponentTag nativeComponentTag) {
        LW lw = null;
        LW[] lwArrValues = values();
        int length = lwArrValues.length;
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
                    nativeComponentTag = nativeComponentTag;
                    lwArrValues = lwArrValues;
                    lw = lwArrValues[i];
                    if (lw.A01 != nativeComponentTag) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return lw;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    LW value = (LW) null;
                    return value;
            }
        }
    }

    public static void A03(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
        LW lwA00 = A00(nativeComponentTag);
        char c2 = view != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    lwA00 = lwA00;
                    if (lwA00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (Build.VERSION.SDK_INT <= 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    nativeComponentTag = nativeComponentTag;
                    view.setTag(A02, nativeComponentTag);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void A04(View view, LW lw) {
        char c2 = view != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    lw = lw;
                    if (lw == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (Build.VERSION.SDK_INT <= 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    lw = lw;
                    view.setTag(A02, lw);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final int A05() {
        return this.A00;
    }
}
