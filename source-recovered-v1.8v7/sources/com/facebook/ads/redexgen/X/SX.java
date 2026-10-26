package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class SX implements InterfaceC01521v {
    public static byte[] A04;
    public final SM A00;
    public final InterfaceC01471q A01;
    public final C01501t A02;
    public final XI A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 101);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{76, 72, 75, Byte.MAX_VALUE, 110, 99, 111, 100, 105, 111, 68, 111, 126, 125, 101, 120, 97, 24, 61, 121, 54, 59, 51, 60, 58, 45, 121, 48, 42, 121, 55, 44, 53, 53, 103, 96, 122, 113, 107, 124, 124, 97, 124, 113, 109, 97, 106, 107, 113, 101, 107, 119, 94, 79, 86, 7, 16, 11, 1, 9, 0, 26, 0, 29, 17, 23, 4, 22, 26, 14, 0, 28, 32, 4, 30, 30, 4, 3, 10, 77, 15, 24, 3, 9, 1, 8, 77, 11, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 67, 85, 82, 84, 89, 67, 84, 84, 73, 84, 89, 75, 67, 85, 85, 71, 65, 67, 89, 77, 67, 95, 126, 86, 64, 64, 82, 84, 86, 9, 19, 18, 17, 16, 25, 1, 23, 16, 8, 31, 18, 23, 26, 31, 10, 23, 17, 16, 1, 10, 23, 19, 27, 1, 21, 27, 7};
    }

    public SX(XI xi, C01501t c01501t, InterfaceC01471q interfaceC01471q, SM sm) {
        this.A03 = xi;
        this.A02 = c01501t;
        this.A01 = interfaceC01471q;
        this.A00 = sm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01521v
    public final void A7L(Message message) {
        Message message2 = message;
        SX sx = this;
        String errorMessage = null;
        String strA00 = null;
        AdError adError = null;
        int i = 0;
        Bundle bundle = null;
        String strA002 = null;
        String strA003 = null;
        Bundle bundle2 = null;
        InterstitialAd interstitialAdA01 = sx.A02.A01();
        String strA004 = A00(52, 3, 90);
        char c2 = interstitialAdA01 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    sx.A03.A04().A83(strA004, C03008a.A0A, new C03018b(A00(17, 17, 60)));
                    return;
                case 3:
                    message2 = message2;
                    i = message2.what;
                    strA003 = A00(k.AppCompatTheme_windowFixedWidthMajor, 9, 86);
                    strA00 = A00(72, 27, 8);
                    strA002 = A00(55, 17, 32);
                    if (i == 10) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 1020) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 1022) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 1023) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    switch (i) {
                        case 1015:
                            c2 = '\b';
                            break;
                        case 1016:
                            c2 = '\b';
                            break;
                        case 1017:
                            c2 = '\b';
                            break;
                        default:
                            c2 = '\b';
                            break;
                    }
                case '\b':
                    sx = sx;
                    if (sx.A02.A02() != null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return;
                case '\n':
                    sx = sx;
                    sx.A01.ADC();
                    c2 = '\b';
                    break;
                case 11:
                    sx = sx;
                    message2 = message2;
                    strA002 = strA002;
                    sx.A01.AD6();
                    bundle2 = message2.getData().getBundle(strA002);
                    if (bundle2 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    sx = sx;
                    bundle2 = bundle2;
                    sx.A02.A0B(bundle2.getLong(A00(129, 26, 59)));
                    c2 = '\r';
                    break;
                case '\r':
                    sx = sx;
                    sx.A02.A0C(null);
                    c2 = '\b';
                    break;
                case 14:
                    sx = sx;
                    message2 = message2;
                    strA004 = strA004;
                    strA003 = strA003;
                    strA00 = strA00;
                    sx.A03.A04().A83(strA004, C03008a.A0K, new C03018b(strA00, strA003 + message2));
                    c2 = '\r';
                    break;
                case 15:
                    message2 = message2;
                    switch (message2.what) {
                        case 1020:
                            c2 = 25;
                            break;
                        case 1021:
                            c2 = 26;
                            break;
                        case 1022:
                            c2 = 27;
                            break;
                        case 1023:
                            c2 = 16;
                            break;
                        case 1024:
                            c2 = 28;
                            break;
                        case 1025:
                            c2 = 29;
                            break;
                        case 1026:
                            c2 = 18;
                            break;
                        default:
                            c2 = 16;
                            break;
                    }
                case 16:
                    sx = sx;
                    if (sx.A02.A04() != null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    return;
                case 18:
                    sx = sx;
                    if (!(sx.A02.A02() instanceof InterstitialAdExtendedListener)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    sx = sx;
                    ((InterstitialAdExtendedListener) sx.A02.A02()).onInterstitialActivityDestroyed();
                    c2 = 16;
                    break;
                case 20:
                    message2 = message2;
                    switch (message2.what) {
                        case 3000:
                            c2 = 23;
                            break;
                        case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                            c2 = 24;
                            break;
                        case 3002:
                            c2 = 22;
                            break;
                        default:
                            c2 = 21;
                            break;
                    }
                case 21:
                    return;
                case 22:
                    sx = sx;
                    sx.A02.A04().onRewardedAdServerFailed();
                    c2 = 21;
                    break;
                case 23:
                    sx.A02.A04().onRewardedAdCompleted();
                    return;
                case 24:
                    sx.A02.A04().onRewardedAdServerSucceeded();
                    return;
                case 25:
                    sx.A02.A02().onAdLoaded(interstitialAdA01);
                    return;
                case 26:
                    sx.A02.A02().onInterstitialDisplayed(interstitialAdA01);
                    return;
                case 27:
                    sx.A02.A02().onInterstitialDismissed(interstitialAdA01);
                    return;
                case 28:
                    sx.A02.A02().onAdClicked(interstitialAdA01);
                    return;
                case 29:
                    sx.A02.A02().onLoggingImpression(interstitialAdA01);
                    return;
                case 30:
                    message2 = message2;
                    strA002 = strA002;
                    bundle = message2.getData().getBundle(strA002);
                    if (bundle == null) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    sx = sx;
                    bundle = bundle;
                    int i2 = bundle.getInt(A00(34, 18, 75));
                    errorMessage = bundle.getString(A00(99, 21, 99));
                    adError = new AdError(i2, errorMessage);
                    sx.A01.AD2(adError);
                    if (sx.A02.A02() == null) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    sx = sx;
                    interstitialAdA01 = interstitialAdA01;
                    adError = adError;
                    sx.A02.A02().onError(interstitialAdA01, adError);
                    c2 = '!';
                    break;
                case '!':
                    sx.A02.A0C(null);
                    return;
                case '\"':
                    errorMessage = errorMessage;
                    Log.e(A00(0, 17, 111), errorMessage);
                    c2 = '!';
                    break;
                case '#':
                    sx = sx;
                    message2 = message2;
                    strA004 = strA004;
                    strA003 = strA003;
                    strA00 = strA00;
                    sx.A01.ACz(EnumC01461p.A04);
                    sx.A03.A04().A83(strA004, C03008a.A0K, new C03018b(strA00, strA003 + message2));
                    c2 = '!';
                    break;
            }
        }
    }
}
