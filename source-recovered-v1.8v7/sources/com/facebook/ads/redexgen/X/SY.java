package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class SY implements InterfaceC01521v {
    public static byte[] A04;
    public final SM A00;
    public final InterfaceC01471q A01;
    public final C01541x A02;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{109, 105, 104, -100, -117, -112, -116, -107, -118, -116, 117, -116, -101, -98, -106, -103, -110, -93, -58, -126, -47, -60, -52, -57, -59, -42, -126, -53, -43, -126, -48, -41, -50, -50, -93, -88, -82, -71, -97, -84, -84, -87, -84, -71, -99, -87, -98, -97, -71, -91, -97, -77, 126, -125, -119, -108, -121, -117, -108, -117, 126, 121, 122, -124, -108, 121, -118, -121, 118, -119, 126, -124, -125, -108, Byte.MIN_VALUE, 122, -114, -99, -84, -91, -120, -101, -108, -118, -110, -117, -91, -117, -98, -102, -104, -121, -103, -91, -111, -117, -97, -43, -15, -5, -5, -15, -10, -17, -88, -22, -3, -10, -20, -12, -19, -88, -18, -9, -6, -88, -11, -19, -5, -5, -23, -17, -19, -74, 122, 123, 121, -122, 108, 121, 121, 118, 121, -122, 116, 108, 122, 122, 104, 110, 108, -122, 114, 108, Byte.MIN_VALUE, -51, -27, -13, -13, -31, -25, -27, -70, -96, -71, -68, -69, -76, -52, -74, -69, -61, -82, -71, -74, -79, -82, -63, -74, -68, -69, -52, -63, -74, -70, -78, -52, -72, -78, -58, -101, -73, -63, -63, -73, -68, -75, 110, -80, -61, -68, -78, -70, -77, 110, -76, -67, -64, 110, -69, -77, -63, -63, -81, -75, -77};
    }

    public SY(XI xi, C01541x c01541x, InterfaceC01471q interfaceC01471q, SM sm) {
        this.A03 = xi;
        this.A02 = c01541x;
        this.A01 = interfaceC01471q;
        this.A00 = sm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01521v
    public final void A7L(Message message) {
        Message message2 = message;
        SY sy = this;
        String errorMessage = null;
        AdError error = null;
        int i = 0;
        int i2 = 0;
        String strA00 = null;
        Bundle bundle = null;
        int i3 = 0;
        Bundle bundle2 = null;
        String strA002 = null;
        RewardedVideoAd rewardedVideoAdA00 = sy.A02.A00();
        String strA003 = A00(77, 3, 27);
        char c2 = rewardedVideoAdA00 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    sy.A03.A04().A83(strA003, C03008a.A0A, new C03018b(A00(17, 17, 65)));
                    return;
                case 3:
                    message2 = message2;
                    i3 = message2.what;
                    strA00 = A00(145, 9, 95);
                    strA002 = A00(80, 17, 37);
                    if (i3 == 10) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = AdError.BROKEN_MEDIA_ERROR_CODE;
                    if (i3 == 2100) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i3 == 2103) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == 2106) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i3 == 2010) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i3 == 2011) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    sy = sy;
                    if (sy.A02.A04 != null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return;
                case 11:
                    sy = sy;
                    sy.A01.ADC();
                    sy.A02.A01(null);
                    c2 = '\t';
                    break;
                case '\f':
                    sy = sy;
                    message2 = message2;
                    strA002 = strA002;
                    sy.A01.AD6();
                    bundle = message2.getData().getBundle(strA002);
                    if (bundle == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    sy = sy;
                    bundle = bundle;
                    sy.A02.A01 = bundle.getLong(A00(154, 26, 76));
                    sy.A02.A00 = bundle.getInt(A00(52, 25, 20));
                    c2 = 14;
                    break;
                case 14:
                    sy = sy;
                    sy.A02.A01(null);
                    c2 = '\t';
                    break;
                case 15:
                    sy = sy;
                    message2 = message2;
                    strA003 = strA003;
                    strA00 = strA00;
                    sy.A03.A04().A83(strA003, C03008a.A0K, new C03018b(A00(180, 26, 45), strA00 + message2));
                    c2 = 14;
                    break;
                case 16:
                    message2 = message2;
                    i = message2.what;
                    if (i == i2) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (i == 2110) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    switch (i) {
                        case 2104:
                            c2 = 28;
                            break;
                        case 2105:
                            c2 = 29;
                            break;
                        case 2106:
                            c2 = 30;
                            break;
                        default:
                            c2 = 19;
                            break;
                    }
                case 19:
                    switch (i) {
                        case 3000:
                            c2 = 21;
                            break;
                        case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                            c2 = 22;
                            break;
                        case 3002:
                            c2 = 25;
                            break;
                        default:
                            c2 = 20;
                            break;
                    }
                case 20:
                    return;
                case 21:
                    sy = sy;
                    sy.A02.A04.onRewardedVideoCompleted();
                    c2 = 20;
                    break;
                case 22:
                    sy = sy;
                    if (!(sy.A02.A04 instanceof S2SRewardedVideoAdListener)) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    sy = sy;
                    ((S2SRewardedVideoAdListener) sy.A02.A04).onRewardServerSuccess();
                    c2 = 24;
                    break;
                case 24:
                    return;
                case 25:
                    sy = sy;
                    if (!(sy.A02.A04 instanceof S2SRewardedVideoAdListener)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    sy = sy;
                    ((S2SRewardedVideoAdListener) sy.A02.A04).onRewardServerFailed();
                    c2 = 27;
                    break;
                case 27:
                    return;
                case 28:
                    sy.A02.A04.onAdClicked(rewardedVideoAdA00);
                    return;
                case 29:
                    sy.A02.A04.onLoggingImpression(rewardedVideoAdA00);
                    return;
                case 30:
                    sy = sy;
                    if (!(sy.A02.A04 instanceof RewardedVideoAdExtendedListener)) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    sy = sy;
                    ((RewardedVideoAdExtendedListener) sy.A02.A04).onRewardedVideoActivityDestroyed();
                    c2 = ' ';
                    break;
                case ' ':
                    return;
                case '!':
                    sy.A02.A04.onRewardedVideoClosed();
                    return;
                case '\"':
                    sy.A02.A04.onAdLoaded(rewardedVideoAdA00);
                    return;
                case '#':
                    message2 = message2;
                    strA002 = strA002;
                    bundle2 = message2.getData().getBundle(strA002);
                    if (bundle2 == null) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    sy = sy;
                    bundle2 = bundle2;
                    int i4 = bundle2.getInt(A00(34, 18, 57));
                    errorMessage = bundle2.getString(A00(k.AppCompatTheme_windowNoTitle, 21, 6));
                    error = new AdError(i4, errorMessage);
                    sy.A01.AD2(error);
                    if (sy.A02.A04 == null) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    sy = sy;
                    rewardedVideoAdA00 = rewardedVideoAdA00;
                    error = error;
                    sy.A02.A04.onError(rewardedVideoAdA00, error);
                    c2 = '&';
                    break;
                case '&':
                    sy.A02.A01(null);
                    return;
                case '\'':
                    errorMessage = errorMessage;
                    Log.e(A00(0, 17, 6), errorMessage);
                    c2 = '&';
                    break;
                case '(':
                    sy = sy;
                    message2 = message2;
                    strA003 = strA003;
                    strA00 = strA00;
                    sy.A01.ACz(EnumC01461p.A04);
                    sy.A03.A04().A83(strA003, C03008a.A0K, new C03018b(A00(97, 27, 103), strA00 + message2));
                    c2 = '&';
                    break;
            }
        }
    }
}
